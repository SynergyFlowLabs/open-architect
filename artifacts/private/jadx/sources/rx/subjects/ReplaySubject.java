package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.internal.operators.BackpressureUtils;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes14.dex */
public final class ReplaySubject<T> extends Subject<T, T> {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    final ReplayState<T> state;

    interface ReplayBuffer<T> {
        void complete();

        void drain(ReplayProducer<T> replayProducer);

        Throwable error();

        void error(Throwable th2);

        boolean isComplete();

        boolean isEmpty();

        T last();

        void next(T t10);

        int size();

        T[] toArray(T[] tArr);
    }

    static final class ReplayProducer<T> extends AtomicInteger implements Producer, Subscription {
        private static final long serialVersionUID = -5006209596735204567L;
        final Subscriber<? super T> actual;
        int index;
        Object node;
        final AtomicLong requested = new AtomicLong();
        final ReplayState<T> state;
        int tailIndex;

        public ReplayProducer(Subscriber<? super T> subscriber, ReplayState<T> replayState) {
            this.actual = subscriber;
            this.state = replayState;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.actual.isUnsubscribed();
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 > 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j10);
                this.state.buffer.drain(this);
            } else {
                if (j10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= required but it was " + j10);
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.state.remove(this);
        }
    }

    static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        static final ReplayProducer[] EMPTY = new ReplayProducer[0];
        static final ReplayProducer[] TERMINATED = new ReplayProducer[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final ReplayBuffer<T> buffer;

        public ReplayState(ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
            lazySet(EMPTY);
        }

        boolean add(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr == TERMINATED) {
                    return false;
                }
                int length = replayProducerArr.length;
                replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
            return true;
        }

        boolean isTerminated() {
            return get() == TERMINATED;
        }

        @Override // rx.Observer
        public void onCompleted() {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.complete();
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                replayBuffer.drain(replayProducer);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.error(th2);
            ArrayList arrayList = null;
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                try {
                    replayBuffer.drain(replayProducer);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.next(t10);
            for (ReplayProducer<T> replayProducer : get()) {
                replayBuffer.drain(replayProducer);
            }
        }

        void remove(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr != TERMINATED && replayProducerArr != EMPTY) {
                    int length = replayProducerArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (replayProducerArr[i10] == replayProducer) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 < 0) {
                        return;
                    }
                    if (length == 1) {
                        replayProducerArr2 = EMPTY;
                    } else {
                        ReplayProducer[] replayProducerArr3 = new ReplayProducer[length - 1];
                        System.arraycopy(replayProducerArr, 0, replayProducerArr3, 0, i10);
                        System.arraycopy(replayProducerArr, i10 + 1, replayProducerArr3, i10, (length - i10) - 1);
                        replayProducerArr2 = replayProducerArr3;
                    }
                }
                return;
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(subscriber, this);
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            if (add(replayProducer) && replayProducer.isUnsubscribed()) {
                remove(replayProducer);
            } else {
                this.buffer.drain(replayProducer);
            }
        }
    }

    ReplaySubject(ReplayState<T> replayState) {
        super(replayState);
        this.state = replayState;
    }

    public static <T> ReplaySubject<T> create() {
        return create(16);
    }

    static <T> ReplaySubject<T> createUnbounded() {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(Integer.MAX_VALUE)));
    }

    static <T> ReplaySubject<T> createUnboundedTime() {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeAndTimeBoundBuffer(Integer.MAX_VALUE, Long.MAX_VALUE, Schedulers.immediate())));
    }

    public static <T> ReplaySubject<T> createWithSize(int i10) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(i10)));
    }

    public static <T> ReplaySubject<T> createWithTime(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return createWithTimeAndSize(j10, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public static <T> ReplaySubject<T> createWithTimeAndSize(long j10, TimeUnit timeUnit, int i10, Scheduler scheduler) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeAndTimeBoundBuffer(i10, timeUnit.toMillis(j10), scheduler)));
    }

    public Throwable getThrowable() {
        if (this.state.isTerminated()) {
            return this.state.buffer.error();
        }
        return null;
    }

    public T getValue() {
        return this.state.buffer.last();
    }

    public T[] getValues(T[] tArr) {
        return this.state.buffer.toArray(tArr);
    }

    public boolean hasAnyValue() {
        return !this.state.buffer.isEmpty();
    }

    public boolean hasCompleted() {
        return this.state.isTerminated() && this.state.buffer.error() == null;
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.state.isTerminated() && this.state.buffer.error() != null;
    }

    public boolean hasValue() {
        return hasAnyValue();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.state.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.state.onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.state.onNext(t10);
    }

    public int size() {
        return this.state.buffer.size();
    }

    int subscriberCount() {
        return this.state.get().length;
    }

    static final class ReplaySizeBoundBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile Node<T> head;
        final int limit;
        int size;
        Node<T> tail;

        static final class Node<T> extends AtomicReference<Node<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T value;

            public Node(T t10) {
                this.value = t10;
            }
        }

        public ReplaySizeBoundBuffer(int i10) {
            this.limit = i10;
            Node<T> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void drain(ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replayProducer.actual;
            int iAddAndGet = 1;
            do {
                long j10 = replayProducer.requested.get();
                Node<T> node = (Node) replayProducer.node;
                if (node == null) {
                    node = this.head;
                }
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z10 = this.done;
                    Node<T> node2 = node.get();
                    boolean z11 = node2 == null;
                    if (z10 && z11) {
                        replayProducer.node = null;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(node2.value);
                    j11++;
                    node = node2;
                }
                if (j11 == j10) {
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z12 = this.done;
                    boolean z13 = node.get() == null;
                    if (z12 && z13) {
                        replayProducer.node = null;
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            subscriber.onError(th3);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    BackpressureUtils.produced(replayProducer.requested, j11);
                }
                replayProducer.node = node;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void error(Throwable th2) {
            this.error = th2;
            this.done = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isComplete() {
            return this.done;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isEmpty() {
            return this.head.get() == null;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T last() {
            Node<T> node = this.head;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void next(T t10) {
            Node<T> node = new Node<>(t10);
            this.tail.set(node);
            this.tail = node;
            int i10 = this.size;
            if (i10 == this.limit) {
                this.head = this.head.get();
            } else {
                this.size = i10 + 1;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            Node<T> node = this.head.get();
            int i10 = 0;
            while (node != null && i10 != Integer.MAX_VALUE) {
                node = node.get();
                i10++;
            }
            return i10;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            Node<T> node = this.head.get();
            while (true) {
                Node<T> node2 = node;
                if (node2 == null) {
                    return (T[]) arrayList.toArray(tArr);
                }
                arrayList.add(node2.value);
                node = node2.get();
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public Throwable error() {
            return this.error;
        }
    }

    public static <T> ReplaySubject<T> create(int i10) {
        if (i10 > 0) {
            return new ReplaySubject<>(new ReplayState(new ReplayUnboundedBuffer(i10)));
        }
        throw new IllegalArgumentException("capacity > 0 required but it was " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    static final class ReplaySizeAndTimeBoundBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile TimedNode<T> head;
        final int limit;
        final long maxAgeMillis;
        final Scheduler scheduler;
        int size;
        TimedNode<T> tail;

        static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final long timestamp;
            final T value;

            public TimedNode(T t10, long j10) {
                this.value = t10;
                this.timestamp = j10;
            }
        }

        public ReplaySizeAndTimeBoundBuffer(int i10, long j10, Scheduler scheduler) {
            this.limit = i10;
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
            this.maxAgeMillis = j10;
            this.scheduler = scheduler;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void complete() {
            evictFinal();
            this.done = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void drain(ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replayProducer.actual;
            int iAddAndGet = 1;
            do {
                long j10 = replayProducer.requested.get();
                TimedNode<T> timedNodeLatestHead = (TimedNode) replayProducer.node;
                if (timedNodeLatestHead == null) {
                    timedNodeLatestHead = latestHead();
                }
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z10 = this.done;
                    TimedNode<T> timedNode = timedNodeLatestHead.get();
                    boolean z11 = timedNode == null;
                    if (z10 && z11) {
                        replayProducer.node = null;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(timedNode.value);
                    j11++;
                    timedNodeLatestHead = timedNode;
                }
                if (j11 == j10) {
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z12 = this.done;
                    boolean z13 = timedNodeLatestHead.get() == null;
                    if (z12 && z13) {
                        replayProducer.node = null;
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            subscriber.onError(th3);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    BackpressureUtils.produced(replayProducer.requested, j11);
                }
                replayProducer.node = timedNodeLatestHead;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void error(Throwable th2) {
            evictFinal();
            this.error = th2;
            this.done = true;
        }

        void evictFinal() {
            long jNow = this.scheduler.now() - this.maxAgeMillis;
            TimedNode<T> timedNode = this.head;
            TimedNode<T> timedNode2 = timedNode;
            while (true) {
                TimedNode<T> timedNode3 = timedNode2.get();
                if (timedNode3 == null || timedNode3.timestamp > jNow) {
                    break;
                } else {
                    timedNode2 = timedNode3;
                }
            }
            if (timedNode != timedNode2) {
                this.head = timedNode2;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isComplete() {
            return this.done;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isEmpty() {
            return latestHead().get() == null;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T last() {
            TimedNode<T> timedNodeLatestHead = latestHead();
            while (true) {
                TimedNode<T> timedNode = timedNodeLatestHead.get();
                if (timedNode == null) {
                    return timedNodeLatestHead.value;
                }
                timedNodeLatestHead = timedNode;
            }
        }

        TimedNode<T> latestHead() {
            long jNow = this.scheduler.now() - this.maxAgeMillis;
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null || timedNode2.timestamp > jNow) {
                    break;
                }
                timedNode = timedNode2;
            }
            return timedNode;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void next(T t10) {
            TimedNode<T> timedNode;
            long jNow = this.scheduler.now();
            TimedNode<T> timedNode2 = new TimedNode<>(t10, jNow);
            this.tail.set(timedNode2);
            this.tail = timedNode2;
            long j10 = jNow - this.maxAgeMillis;
            int i10 = this.size;
            TimedNode<T> timedNode3 = this.head;
            if (i10 == this.limit) {
                timedNode = timedNode3.get();
            } else {
                i10++;
                timedNode = timedNode3;
            }
            while (true) {
                TimedNode<T> timedNode4 = timedNode.get();
                if (timedNode4 == null || timedNode4.timestamp > j10) {
                    break;
                    break;
                } else {
                    i10--;
                    timedNode = timedNode4;
                }
            }
            this.size = i10;
            if (timedNode != timedNode3) {
                this.head = timedNode;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            TimedNode<T> timedNode = latestHead().get();
            int i10 = 0;
            while (timedNode != null && i10 != Integer.MAX_VALUE) {
                timedNode = timedNode.get();
                i10++;
            }
            return i10;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (TimedNode<T> timedNode = latestHead().get(); timedNode != null; timedNode = timedNode.get()) {
                arrayList.add(timedNode.value);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public Throwable error() {
            return this.error;
        }
    }

    static final class ReplayUnboundedBuffer<T> implements ReplayBuffer<T> {
        final int capacity;
        volatile boolean done;
        Throwable error;
        final Object[] head;
        volatile int size;
        Object[] tail;
        int tailIndex;

        public ReplayUnboundedBuffer(int i10) {
            this.capacity = i10;
            Object[] objArr = new Object[i10 + 1];
            this.head = objArr;
            this.tail = objArr;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void drain(ReplayProducer<T> replayProducer) {
            long j10;
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replayProducer.actual;
            int i10 = this.capacity;
            int iAddAndGet = 1;
            do {
                long j11 = replayProducer.requested.get();
                Object[] objArr = (Object[]) replayProducer.node;
                if (objArr == null) {
                    objArr = this.head;
                }
                int i11 = replayProducer.tailIndex;
                int i12 = replayProducer.index;
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j10 = 0;
                        break;
                    }
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    j10 = 0;
                    boolean z10 = this.done;
                    boolean z11 = i12 == this.size;
                    if (z10 && z11) {
                        replayProducer.node = null;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    if (i11 == i10) {
                        objArr = (Object[]) objArr[i11];
                        i11 = 0;
                    }
                    subscriber.onNext(objArr[i11]);
                    j12++;
                    i11++;
                    i12++;
                }
                if (j12 == j11) {
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z12 = this.done;
                    boolean z13 = i12 == this.size;
                    if (z12 && z13) {
                        replayProducer.node = null;
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            subscriber.onError(th3);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j12 != j10 && j11 != Long.MAX_VALUE) {
                    BackpressureUtils.produced(replayProducer.requested, j12);
                }
                replayProducer.index = i12;
                replayProducer.tailIndex = i11;
                replayProducer.node = objArr;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void error(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
            } else {
                this.error = th2;
                this.done = true;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isComplete() {
            return this.done;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isEmpty() {
            return this.size == 0;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T last() {
            int i10 = this.size;
            if (i10 == 0) {
                return null;
            }
            Object[] objArr = this.head;
            int i11 = this.capacity;
            while (i10 >= i11) {
                objArr = (Object[]) objArr[i11];
                i10 -= i11;
            }
            return (T) objArr[i10 - 1];
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void next(T t10) {
            if (this.done) {
                return;
            }
            int i10 = this.tailIndex;
            Object[] objArr = this.tail;
            if (i10 == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t10;
                this.tailIndex = 1;
                objArr[i10] = objArr2;
                this.tail = objArr2;
            } else {
                objArr[i10] = t10;
                this.tailIndex = i10 + 1;
            }
            this.size++;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            return this.size;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T[] toArray(T[] tArr) {
            int i10 = this.size;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            Object[] objArr = this.head;
            int i11 = this.capacity;
            int i12 = 7 ^ 0;
            int i13 = 0;
            while (true) {
                int i14 = i13 + i11;
                if (i14 >= i10) {
                    break;
                }
                System.arraycopy(objArr, 0, tArr, i13, i11);
                objArr = objArr[i11];
                i13 = i14;
            }
            System.arraycopy(objArr, 0, tArr, i13, i10 - i13);
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public Throwable error() {
            return this.error;
        }
    }
}
