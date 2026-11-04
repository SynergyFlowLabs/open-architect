package rx.internal.operators;

import androidx.compose.animation.core.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.FuncN;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeCombineLatest<T, R> implements Observable.OnSubscribe<R> {
    final int bufferSize;
    final FuncN<? extends R> combiner;
    final boolean delayError;
    final Observable<? extends T>[] sources;
    final Iterable<? extends Observable<? extends T>> sourcesIterable;

    static final class CombinerSubscriber<T, R> extends Subscriber<T> {
        boolean done;
        final int index;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366749nl = NotificationLite.instance();
        final LatestCoordinator<T, R> parent;

        public CombinerSubscriber(LatestCoordinator<T, R> latestCoordinator, int i10) {
            this.parent = latestCoordinator;
            this.index = i10;
            request(latestCoordinator.bufferSize);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.combine(null, this.index);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.parent.onError(th2);
            this.done = true;
            this.parent.combine(null, this.index);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            this.parent.combine(this.f366749nl.next(t10), this.index);
        }

        public void requestMore(long j10) {
            request(j10);
        }
    }

    static final class LatestCoordinator<T, R> extends AtomicInteger implements Producer, Subscription {
        static final Object MISSING = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final Subscriber<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final FuncN<? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombinerSubscriber<T, R>[] subscribers;

        public LatestCoordinator(Subscriber<? super R> subscriber, FuncN<? extends R> funcN, int i10, int i11, boolean z10) {
            this.actual = subscriber;
            this.combiner = funcN;
            this.bufferSize = i11;
            this.delayError = z10;
            Object[] objArr = new Object[i10];
            this.latest = objArr;
            Arrays.fill(objArr, MISSING);
            this.subscribers = new CombinerSubscriber[i10];
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
        }

        void cancel(Queue<?> queue) {
            queue.clear();
            for (CombinerSubscriber<T, R> combinerSubscriber : this.subscribers) {
                combinerSubscriber.unsubscribe();
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<?> subscriber, Queue<?> queue, boolean z12) {
            if (this.cancelled) {
                cancel(queue);
                return true;
            }
            if (z10) {
                if (!z12) {
                    Throwable th2 = this.error.get();
                    if (th2 != null) {
                        cancel(queue);
                        subscriber.onError(th2);
                        return true;
                    }
                    if (z11) {
                        subscriber.onCompleted();
                        return true;
                    }
                } else if (z11) {
                    Throwable th3 = this.error.get();
                    if (th3 != null) {
                        subscriber.onError(th3);
                    } else {
                        subscriber.onCompleted();
                    }
                    return true;
                }
            }
            return false;
        }

        void combine(Object obj, int i10) {
            boolean z10;
            CombinerSubscriber<T, R> combinerSubscriber = this.subscribers[i10];
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int length = objArr.length;
                    Object obj2 = objArr[i10];
                    int i11 = this.active;
                    Object obj3 = MISSING;
                    if (obj2 == obj3) {
                        i11++;
                        this.active = i11;
                    }
                    int i12 = this.complete;
                    if (obj == null) {
                        i12++;
                        this.complete = i12;
                    } else {
                        objArr[i10] = combinerSubscriber.f366749nl.getValue(obj);
                    }
                    z10 = i11 == length;
                    if (i12 == length || (obj == null && obj2 == obj3)) {
                        this.done = true;
                    } else if (obj != null && z10) {
                        this.queue.offer(combinerSubscriber, this.latest.clone());
                    } else if (obj == null && this.error.get() != null && (obj2 == obj3 || !this.delayError)) {
                        this.done = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10 || obj == null) {
                drain();
            } else {
                combinerSubscriber.requestMore(1L);
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            Subscriber<? super R> subscriber = this.actual;
            boolean z10 = this.delayError;
            AtomicLong atomicLong = this.requested;
            int iAddAndGet = 1;
            while (true) {
                LatestCoordinator<T, R> latestCoordinator = this;
                if (latestCoordinator.checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue, z10)) {
                    return;
                }
                long j10 = atomicLong.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z11 = latestCoordinator.done;
                    CombinerSubscriber combinerSubscriber = (CombinerSubscriber) spscLinkedArrayQueue.peek();
                    boolean z12 = combinerSubscriber == null;
                    if (latestCoordinator.checkTerminated(z11, z12, subscriber, spscLinkedArrayQueue, z10)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    Object[] objArr = (Object[]) spscLinkedArrayQueue.poll();
                    if (objArr == null) {
                        latestCoordinator.cancelled = true;
                        latestCoordinator.cancel(spscLinkedArrayQueue);
                        subscriber.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                        return;
                    }
                    try {
                        subscriber.onNext(latestCoordinator.combiner.call(objArr));
                        combinerSubscriber.requestMore(1L);
                        j11++;
                    } catch (Throwable th2) {
                        latestCoordinator.cancelled = true;
                        latestCoordinator.cancel(spscLinkedArrayQueue);
                        subscriber.onError(th2);
                        return;
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    BackpressureUtils.produced(atomicLong, j11);
                }
                iAddAndGet = latestCoordinator.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    this = latestCoordinator;
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancelled;
        }

        void onError(Throwable th2) {
            Throwable th3;
            Throwable compositeException;
            AtomicReference<Throwable> atomicReference = this.error;
            do {
                th3 = atomicReference.get();
                if (th3 == null) {
                    compositeException = th2;
                } else if (th3 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                    arrayList.add(th2);
                    compositeException = new CompositeException(arrayList);
                } else {
                    compositeException = new CompositeException(Arrays.asList(th3, th2));
                }
            } while (!z1.a(atomicReference, th3, compositeException));
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 >= 0) {
                if (j10 != 0) {
                    BackpressureUtils.getAndAddRequest(this.requested, j10);
                    drain();
                }
            } else {
                throw new IllegalArgumentException("n >= required but it was " + j10);
            }
        }

        public void subscribe(Observable<? extends T>[] observableArr) {
            CombinerSubscriber<T, R>[] combinerSubscriberArr = this.subscribers;
            int length = combinerSubscriberArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                combinerSubscriberArr[i10] = new CombinerSubscriber<>(this, i10);
            }
            lazySet(0);
            this.actual.add(this);
            this.actual.setProducer(this);
            for (int i11 = 0; i11 < length && !this.cancelled; i11++) {
                observableArr[i11].subscribe((Subscriber<? super Object>) combinerSubscriberArr[i11]);
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (getAndIncrement() == 0) {
                cancel(this.queue);
            }
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN) {
        this(null, iterable, funcN, RxRingBuffer.SIZE, false);
    }

    public OnSubscribeCombineLatest(Observable<? extends T>[] observableArr, Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN, int i10, boolean z10) {
        this.sources = observableArr;
        this.sourcesIterable = iterable;
        this.combiner = funcN;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        int length;
        int i10;
        Observable<? extends T>[] observableArr = this.sources;
        if (observableArr == null) {
            Iterable<? extends Observable<? extends T>> iterable = this.sourcesIterable;
            if (iterable instanceof List) {
                List list = (List) iterable;
                observableArr = (Observable[]) list.toArray(new Observable[list.size()]);
                length = observableArr.length;
            } else {
                Observable<? extends T>[] observableArr2 = new Observable[8];
                int i11 = 0;
                for (Observable<? extends T> observable : iterable) {
                    if (i11 == observableArr2.length) {
                        Observable<? extends T>[] observableArr3 = new Observable[(i11 >> 2) + i11];
                        System.arraycopy(observableArr2, 0, observableArr3, 0, i11);
                        observableArr2 = observableArr3;
                    }
                    observableArr2[i11] = observable;
                    i11++;
                }
                observableArr = observableArr2;
                i10 = i11;
            }
            if (i10 == 0) {
                subscriber.onCompleted();
            } else {
                new LatestCoordinator(subscriber, this.combiner, i10, this.bufferSize, this.delayError).subscribe(observableArr);
            }
        }
        length = observableArr.length;
        i10 = length;
        if (i10 == 0) {
            subscriber.onCompleted();
        } else {
            new LatestCoordinator(subscriber, this.combiner, i10, this.bufferSize, this.delayError).subscribe(observableArr);
        }
    }
}
