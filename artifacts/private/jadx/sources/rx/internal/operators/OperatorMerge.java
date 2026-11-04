package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.Pow2;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorMerge<T> implements Observable.Operator<T, Observable<? extends T>> {
    final boolean delayErrors;
    final int maxConcurrent;

    static final class HolderDelayErrors {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(true, Integer.MAX_VALUE);

        HolderDelayErrors() {
        }
    }

    static final class HolderNoDelay {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(false, Integer.MAX_VALUE);

        HolderNoDelay() {
        }
    }

    static final class InnerSubscriber<T> extends Subscriber<T> {
        static final int LIMIT = RxRingBuffer.SIZE / 4;
        volatile boolean done;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        final long f366760id;
        int outstanding;
        final MergeSubscriber<T> parent;
        volatile RxRingBuffer queue;

        public InnerSubscriber(MergeSubscriber<T> mergeSubscriber, long j10) {
            this.parent = mergeSubscriber;
            this.f366760id = j10;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.done = true;
            this.parent.emit();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) throws Throwable {
            this.done = true;
            this.parent.getOrCreateErrorQueue().offer(th2);
            this.parent.emit();
        }

        @Override // rx.Observer
        public void onNext(T t10) throws Throwable {
            this.parent.tryEmit(this, t10);
        }

        @Override // rx.Subscriber
        public void onStart() {
            int i10 = RxRingBuffer.SIZE;
            this.outstanding = i10;
            request(i10);
        }

        public void requestMore(long j10) {
            int i10 = this.outstanding - ((int) j10);
            if (i10 > LIMIT) {
                this.outstanding = i10;
                return;
            }
            int i11 = RxRingBuffer.SIZE;
            this.outstanding = i11;
            int i12 = i11 - i10;
            if (i12 > 0) {
                request(i12);
            }
        }
    }

    static final class MergeProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        final MergeSubscriber<T> subscriber;

        public MergeProducer(MergeSubscriber<T> mergeSubscriber) {
            this.subscriber = mergeSubscriber;
        }

        public long produced(int i10) {
            return addAndGet(-i10);
        }

        @Override // rx.Producer
        public void request(long j10) throws Throwable {
            if (j10 > 0) {
                if (get() != Long.MAX_VALUE) {
                    BackpressureUtils.getAndAddRequest(this, j10);
                    this.subscriber.emit();
                }
            } else if (j10 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }
    }

    static final class MergeSubscriber<T> extends Subscriber<Observable<? extends T>> {
        static final InnerSubscriber<?>[] EMPTY = new InnerSubscriber[0];
        final Subscriber<? super T> child;
        final boolean delayErrors;
        volatile boolean done;
        boolean emitting;
        volatile ConcurrentLinkedQueue<Throwable> errors;
        long lastId;
        int lastIndex;
        final int maxConcurrent;
        boolean missed;
        MergeProducer<T> producer;
        volatile Queue<Object> queue;
        int scalarEmissionCount;
        final int scalarEmissionLimit;
        volatile CompositeSubscription subscriptions;
        long uniqueId;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366761nl = NotificationLite.instance();
        final Object innerGuard = new Object();
        volatile InnerSubscriber<?>[] innerSubscribers = EMPTY;

        public MergeSubscriber(Subscriber<? super T> subscriber, boolean z10, int i10) {
            this.child = subscriber;
            this.delayErrors = z10;
            this.maxConcurrent = i10;
            if (i10 == Integer.MAX_VALUE) {
                this.scalarEmissionLimit = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.scalarEmissionLimit = Math.max(1, i10 >> 1);
                request(i10);
            }
        }

        private void reportError() {
            ArrayList arrayList = new ArrayList(this.errors);
            if (arrayList.size() == 1) {
                this.child.onError((Throwable) arrayList.get(0));
            } else {
                this.child.onError(new CompositeException(arrayList));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void addInner(InnerSubscriber<T> innerSubscriber) {
            getOrCreateComposite().add(innerSubscriber);
            synchronized (this.innerGuard) {
                try {
                    InnerSubscriber<?>[] innerSubscriberArr = this.innerSubscribers;
                    int length = innerSubscriberArr.length;
                    InnerSubscriber<?>[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                    this.innerSubscribers = innerSubscriberArr2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean checkTerminate() {
            if (this.child.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.errors;
            if (this.delayErrors || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                reportError();
                return true;
            } finally {
                unsubscribe();
            }
        }

        void emit() throws Throwable {
            synchronized (this) {
                try {
                    if (this.emitting) {
                        this.missed = true;
                    } else {
                        this.emitting = true;
                        emitLoop();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void emitEmpty() {
            int i10 = this.scalarEmissionCount + 1;
            if (i10 != this.scalarEmissionLimit) {
                this.scalarEmissionCount = i10;
            } else {
                this.scalarEmissionCount = 0;
                requestMore(i10);
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x01b6 */
        /* JADX WARN: Code duplicated, block: B:109:0x014c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:110:0x014e A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #6 {all -> 0x0066, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0039, B:22:0x0048, B:36:0x0071, B:26:0x0053, B:28:0x0057, B:35:0x006a, B:40:0x008d, B:47:0x00a9, B:50:0x00b4, B:53:0x00bc, B:55:0x00c0, B:58:0x00c7, B:59:0x00cb, B:62:0x00d1, B:64:0x00d8, B:72:0x00eb, B:75:0x00f4, B:78:0x00fa, B:79:0x00fd, B:82:0x010a, B:85:0x0111, B:89:0x0119, B:92:0x0120, B:95:0x0125, B:98:0x012c, B:110:0x014e, B:112:0x015a, B:116:0x0164, B:119:0x016c, B:121:0x0172, B:124:0x017c, B:127:0x0182, B:130:0x0187, B:131:0x018b, B:134:0x0197, B:137:0x019f), top: B:175:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0155  */
        /* JADX WARN: Code duplicated, block: B:115:0x0162 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:124:0x017c A[Catch: all -> 0x0066, TryCatch #6 {all -> 0x0066, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0039, B:22:0x0048, B:36:0x0071, B:26:0x0053, B:28:0x0057, B:35:0x006a, B:40:0x008d, B:47:0x00a9, B:50:0x00b4, B:53:0x00bc, B:55:0x00c0, B:58:0x00c7, B:59:0x00cb, B:62:0x00d1, B:64:0x00d8, B:72:0x00eb, B:75:0x00f4, B:78:0x00fa, B:79:0x00fd, B:82:0x010a, B:85:0x0111, B:89:0x0119, B:92:0x0120, B:95:0x0125, B:98:0x012c, B:110:0x014e, B:112:0x015a, B:116:0x0164, B:119:0x016c, B:121:0x0172, B:124:0x017c, B:127:0x0182, B:130:0x0187, B:131:0x018b, B:134:0x0197, B:137:0x019f), top: B:175:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:127:0x0182 A[Catch: all -> 0x0066, TryCatch #6 {all -> 0x0066, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0039, B:22:0x0048, B:36:0x0071, B:26:0x0053, B:28:0x0057, B:35:0x006a, B:40:0x008d, B:47:0x00a9, B:50:0x00b4, B:53:0x00bc, B:55:0x00c0, B:58:0x00c7, B:59:0x00cb, B:62:0x00d1, B:64:0x00d8, B:72:0x00eb, B:75:0x00f4, B:78:0x00fa, B:79:0x00fd, B:82:0x010a, B:85:0x0111, B:89:0x0119, B:92:0x0120, B:95:0x0125, B:98:0x012c, B:110:0x014e, B:112:0x015a, B:116:0x0164, B:119:0x016c, B:121:0x0172, B:124:0x017c, B:127:0x0182, B:130:0x0187, B:131:0x018b, B:134:0x0197, B:137:0x019f), top: B:175:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:129:0x0186  */
        /* JADX WARN: Code duplicated, block: B:157:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:180:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:186:0x0110 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:187:0x011f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:188:0x017b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:205:0x0181 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:207:0x0187 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0164 A[EDGE_INSN: B:208:0x0164->B:116:0x0164 BREAK  A[LOOP:5: B:86:0x0114->B:210:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x010a A[Catch: all -> 0x0066, TryCatch #6 {all -> 0x0066, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0039, B:22:0x0048, B:36:0x0071, B:26:0x0053, B:28:0x0057, B:35:0x006a, B:40:0x008d, B:47:0x00a9, B:50:0x00b4, B:53:0x00bc, B:55:0x00c0, B:58:0x00c7, B:59:0x00cb, B:62:0x00d1, B:64:0x00d8, B:72:0x00eb, B:75:0x00f4, B:78:0x00fa, B:79:0x00fd, B:82:0x010a, B:85:0x0111, B:89:0x0119, B:92:0x0120, B:95:0x0125, B:98:0x012c, B:110:0x014e, B:112:0x015a, B:116:0x0164, B:119:0x016c, B:121:0x0172, B:124:0x017c, B:127:0x0182, B:130:0x0187, B:131:0x018b, B:134:0x0197, B:137:0x019f), top: B:175:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0111 A[Catch: all -> 0x0066, TryCatch #6 {all -> 0x0066, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0039, B:22:0x0048, B:36:0x0071, B:26:0x0053, B:28:0x0057, B:35:0x006a, B:40:0x008d, B:47:0x00a9, B:50:0x00b4, B:53:0x00bc, B:55:0x00c0, B:58:0x00c7, B:59:0x00cb, B:62:0x00d1, B:64:0x00d8, B:72:0x00eb, B:75:0x00f4, B:78:0x00fa, B:79:0x00fd, B:82:0x010a, B:85:0x0111, B:89:0x0119, B:92:0x0120, B:95:0x0125, B:98:0x012c, B:110:0x014e, B:112:0x015a, B:116:0x0164, B:119:0x016c, B:121:0x0172, B:124:0x017c, B:127:0x0182, B:130:0x0187, B:131:0x018b, B:134:0x0197, B:137:0x019f), top: B:175:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x0119 A[Catch: all -> 0x0066, TryCatch #6 {all -> 0x0066, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0039, B:22:0x0048, B:36:0x0071, B:26:0x0053, B:28:0x0057, B:35:0x006a, B:40:0x008d, B:47:0x00a9, B:50:0x00b4, B:53:0x00bc, B:55:0x00c0, B:58:0x00c7, B:59:0x00cb, B:62:0x00d1, B:64:0x00d8, B:72:0x00eb, B:75:0x00f4, B:78:0x00fa, B:79:0x00fd, B:82:0x010a, B:85:0x0111, B:89:0x0119, B:92:0x0120, B:95:0x0125, B:98:0x012c, B:110:0x014e, B:112:0x015a, B:116:0x0164, B:119:0x016c, B:121:0x0172, B:124:0x017c, B:127:0x0182, B:130:0x0187, B:131:0x018b, B:134:0x0197, B:137:0x019f), top: B:175:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0120 A[Catch: all -> 0x0066, TryCatch #6 {all -> 0x0066, blocks: (B:3:0x0003, B:4:0x0005, B:7:0x000c, B:17:0x0039, B:22:0x0048, B:36:0x0071, B:26:0x0053, B:28:0x0057, B:35:0x006a, B:40:0x008d, B:47:0x00a9, B:50:0x00b4, B:53:0x00bc, B:55:0x00c0, B:58:0x00c7, B:59:0x00cb, B:62:0x00d1, B:64:0x00d8, B:72:0x00eb, B:75:0x00f4, B:78:0x00fa, B:79:0x00fd, B:82:0x010a, B:85:0x0111, B:89:0x0119, B:92:0x0120, B:95:0x0125, B:98:0x012c, B:110:0x014e, B:112:0x015a, B:116:0x0164, B:119:0x016c, B:121:0x0172, B:124:0x017c, B:127:0x0182, B:130:0x0187, B:131:0x018b, B:134:0x0197, B:137:0x019f), top: B:175:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void emitLoop() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 451
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorMerge.MergeSubscriber.emitLoop():void");
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0058  */
        /* JADX WARN: Code duplicated, block: B:47:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        protected void emitScalar(InnerSubscriber<T> innerSubscriber, T t10, long j10) throws Throwable {
            boolean z10 = true;
            try {
                try {
                    try {
                        this.child.onNext(t10);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (!z10) {
                            synchronized (this) {
                                try {
                                    this.emitting = false;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    if (!this.delayErrors) {
                        Exceptions.throwIfFatal(th4);
                        innerSubscriber.unsubscribe();
                        innerSubscriber.onError(th4);
                        return;
                    }
                    getOrCreateErrorQueue().offer(th4);
                }
                if (j10 != Long.MAX_VALUE) {
                    this.producer.produced(1);
                }
                innerSubscriber.requestMore(1L);
                synchronized (this) {
                    try {
                        if (!this.missed) {
                            this.emitting = false;
                        } else {
                            this.missed = false;
                            emitLoop();
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                if (!z10) {
                    synchronized (this) {
                        this.emitting = false;
                    }
                }
                throw th;
            }
        }

        CompositeSubscription getOrCreateComposite() {
            CompositeSubscription compositeSubscription;
            boolean z10;
            CompositeSubscription compositeSubscription2 = this.subscriptions;
            if (compositeSubscription2 != null) {
                return compositeSubscription2;
            }
            synchronized (this) {
                try {
                    compositeSubscription = this.subscriptions;
                    if (compositeSubscription == null) {
                        compositeSubscription = new CompositeSubscription();
                        this.subscriptions = compositeSubscription;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                add(compositeSubscription);
            }
            return compositeSubscription;
        }

        Queue<Throwable> getOrCreateErrorQueue() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue;
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue2 = this.errors;
            if (concurrentLinkedQueue2 != null) {
                return concurrentLinkedQueue2;
            }
            synchronized (this) {
                try {
                    concurrentLinkedQueue = this.errors;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.errors = concurrentLinkedQueue;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return concurrentLinkedQueue;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.done = true;
            emit();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) throws Throwable {
            getOrCreateErrorQueue().offer(th2);
            this.done = true;
            emit();
        }

        protected void queueScalar(InnerSubscriber<T> innerSubscriber, T t10) throws Throwable {
            RxRingBuffer spscInstance = innerSubscriber.queue;
            if (spscInstance == null) {
                spscInstance = RxRingBuffer.getSpscInstance();
                innerSubscriber.add(spscInstance);
                innerSubscriber.queue = spscInstance;
            }
            try {
                spscInstance.onNext(this.f366761nl.next(t10));
            } catch (IllegalStateException e10) {
                if (!innerSubscriber.isUnsubscribed()) {
                    innerSubscriber.unsubscribe();
                    innerSubscriber.onError(e10);
                }
            } catch (MissingBackpressureException e11) {
                innerSubscriber.unsubscribe();
                innerSubscriber.onError(e11);
            }
        }

        void removeInner(InnerSubscriber<T> innerSubscriber) {
            RxRingBuffer rxRingBuffer = innerSubscriber.queue;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.subscriptions.remove(innerSubscriber);
            synchronized (this.innerGuard) {
                try {
                    InnerSubscriber<?>[] innerSubscriberArr = this.innerSubscribers;
                    int length = innerSubscriberArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (innerSubscriber.equals(innerSubscriberArr[i10])) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.innerSubscribers = EMPTY;
                        return;
                    }
                    InnerSubscriber<?>[] innerSubscriberArr2 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr2, i10, (length - i10) - 1);
                    this.innerSubscribers = innerSubscriberArr2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void requestMore(long j10) {
            request(j10);
        }

        void tryEmit(InnerSubscriber<T> innerSubscriber, T t10) throws Throwable {
            long j10 = this.producer.get();
            boolean z10 = false;
            if (j10 != 0) {
                synchronized (this) {
                    try {
                        j10 = this.producer.get();
                        if (!this.emitting && j10 != 0) {
                            z10 = true;
                            this.emitting = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (!z10) {
                queueScalar(innerSubscriber, t10);
                emit();
                return;
            }
            RxRingBuffer rxRingBuffer = innerSubscriber.queue;
            if (rxRingBuffer == null || rxRingBuffer.isEmpty()) {
                emitScalar(innerSubscriber, t10, j10);
            } else {
                queueScalar(innerSubscriber, t10);
                emitLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        public void onNext(Observable<? extends T> observable) throws Throwable {
            if (observable == null) {
                return;
            }
            if (observable == Observable.empty()) {
                emitEmpty();
                return;
            }
            if (observable instanceof ScalarSynchronousObservable) {
                tryEmit(((ScalarSynchronousObservable) observable).get());
                return;
            }
            long j10 = this.uniqueId;
            this.uniqueId = 1 + j10;
            InnerSubscriber innerSubscriber = new InnerSubscriber(this, j10);
            addInner(innerSubscriber);
            observable.unsafeSubscribe(innerSubscriber);
            emit();
        }

        protected void queueScalar(T t10) throws Throwable {
            Queue<Object> spscExactAtomicArrayQueue;
            Queue<Object> spscUnboundedAtomicArrayQueue = this.queue;
            if (spscUnboundedAtomicArrayQueue == null) {
                int i10 = this.maxConcurrent;
                if (i10 == Integer.MAX_VALUE) {
                    spscUnboundedAtomicArrayQueue = new SpscUnboundedAtomicArrayQueue<>(RxRingBuffer.SIZE);
                } else {
                    if (Pow2.isPowerOfTwo(i10)) {
                        spscExactAtomicArrayQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i10) : new SpscAtomicArrayQueue<>(i10);
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue<>(i10);
                    }
                    spscUnboundedAtomicArrayQueue = spscExactAtomicArrayQueue;
                }
                this.queue = spscUnboundedAtomicArrayQueue;
            }
            if (spscUnboundedAtomicArrayQueue.offer(this.f366761nl.next(t10))) {
                return;
            }
            unsubscribe();
            onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t10));
        }

        void tryEmit(T t10) throws Throwable {
            long j10 = this.producer.get();
            boolean z10 = false;
            if (j10 != 0) {
                synchronized (this) {
                    try {
                        j10 = this.producer.get();
                        if (!this.emitting && j10 != 0) {
                            z10 = true;
                            this.emitting = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (!z10) {
                queueScalar(t10);
                emit();
                return;
            }
            Queue<Object> queue = this.queue;
            if (queue != null && !queue.isEmpty()) {
                queueScalar(t10);
                emitLoop();
                return;
            }
            emitScalar(t10, j10);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0065  */
        /* JADX WARN: Code duplicated, block: B:52:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        protected void emitScalar(T t10, long j10) throws Throwable {
            boolean z10 = true;
            try {
                try {
                    this.child.onNext(t10);
                } catch (Throwable th2) {
                    try {
                        if (!this.delayErrors) {
                            Exceptions.throwIfFatal(th2);
                            unsubscribe();
                            onError(th2);
                            return;
                        }
                        getOrCreateErrorQueue().offer(th2);
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = false;
                        if (!z10) {
                            synchronized (this) {
                                try {
                                    this.emitting = false;
                                } finally {
                                }
                            }
                        }
                        throw th;
                    }
                }
                if (j10 != Long.MAX_VALUE) {
                    this.producer.produced(1);
                }
                int i10 = this.scalarEmissionCount + 1;
                if (i10 == this.scalarEmissionLimit) {
                    this.scalarEmissionCount = 0;
                    requestMore(i10);
                } else {
                    this.scalarEmissionCount = i10;
                }
                synchronized (this) {
                    try {
                        if (!this.missed) {
                            this.emitting = false;
                        } else {
                            this.missed = false;
                            emitLoop();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (!z10) {
                    synchronized (this) {
                        this.emitting = false;
                    }
                }
                throw th;
            }
        }
    }

    OperatorMerge(boolean z10, int i10) {
        this.delayErrors = z10;
        this.maxConcurrent = i10;
    }

    public static <T> OperatorMerge<T> instance(boolean z10) {
        return z10 ? (OperatorMerge<T>) HolderDelayErrors.INSTANCE : (OperatorMerge<T>) HolderNoDelay.INSTANCE;
    }

    @Override // rx.functions.Func1
    public Subscriber<Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        MergeSubscriber mergeSubscriber = new MergeSubscriber(subscriber, this.delayErrors, this.maxConcurrent);
        MergeProducer<T> mergeProducer = new MergeProducer<>(mergeSubscriber);
        mergeSubscriber.producer = mergeProducer;
        subscriber.add(mergeSubscriber);
        subscriber.setProducer(mergeProducer);
        return mergeSubscriber;
    }

    public static <T> OperatorMerge<T> instance(boolean z10, int i10) {
        if (i10 > 0) {
            if (i10 == Integer.MAX_VALUE) {
                return instance(z10);
            }
            return new OperatorMerge<>(z10, i10);
        }
        throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i10);
    }
}
