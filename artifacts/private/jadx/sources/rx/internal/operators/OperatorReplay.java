package rx.internal.operators;

import androidx.compose.animation.core.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.internal.util.OpenHashSet;
import rx.observables.ConnectableObservable;
import rx.schedulers.Timestamped;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorReplay<T> extends ConnectableObservable<T> {
    static final Func0 DEFAULT_UNBOUNDED_FACTORY = new Func0() { // from class: rx.internal.operators.OperatorReplay.1
        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    };
    final Func0<? extends ReplayBuffer<T>> bufferFactory;
    final AtomicReference<ReplaySubscriber<T>> current;
    final Observable<? extends T> source;

    static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366763nl = NotificationLite.instance();
        int size;
        Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0L);
            this.tail = node;
            set(node);
        }

        final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        final void collect(Collection<? super T> collection) {
            Node initialHead = getInitialHead();
            while (true) {
                initialHead = initialHead.get();
                if (initialHead == null) {
                    return;
                }
                Object objLeaveTransform = leaveTransform(initialHead.value);
                if (this.f366763nl.isCompleted(objLeaveTransform) || this.f366763nl.isError(objLeaveTransform)) {
                    return;
                } else {
                    collection.add(this.f366763nl.getValue(objLeaveTransform));
                }
            }
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void complete() {
            Object objEnterTransform = enterTransform(this.f366763nl.completed());
            long j10 = this.index + 1;
            this.index = j10;
            addLast(new Node(objEnterTransform, j10));
            truncateFinal();
        }

        Object enterTransform(Object obj) {
            return obj;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void error(Throwable th2) {
            Object objEnterTransform = enterTransform(this.f366763nl.error(th2));
            long j10 = this.index + 1;
            this.index = j10;
            addLast(new Node(objEnterTransform, j10));
            truncateFinal();
        }

        Node getInitialHead() {
            return get();
        }

        boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && this.f366763nl.isCompleted(leaveTransform(obj));
        }

        boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && this.f366763nl.isError(leaveTransform(obj));
        }

        Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void next(T t10) {
            Object objEnterTransform = enterTransform(this.f366763nl.next(t10));
            long j10 = this.index + 1;
            this.index = j10;
            addLast(new Node(objEnterTransform, j10));
            truncate();
        }

        final void removeFirst() {
            Node node = get().get();
            if (node == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.size--;
            setFirst(node);
        }

        final void removeSome(int i10) {
            Node node = get();
            while (i10 > 0) {
                node = node.get();
                i10--;
                this.size--;
            }
            setFirst(node);
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public final void replay(InnerProducer<T> innerProducer) {
            Subscriber<? super T> subscriber;
            Node node;
            synchronized (innerProducer) {
                try {
                    if (innerProducer.emitting) {
                        innerProducer.missed = true;
                        return;
                    }
                    innerProducer.emitting = true;
                    while (!innerProducer.isUnsubscribed()) {
                        Node initialHead = (Node) innerProducer.index();
                        if (initialHead == null) {
                            initialHead = getInitialHead();
                            innerProducer.index = initialHead;
                            innerProducer.addTotalRequested(initialHead.index);
                        }
                        if (innerProducer.isUnsubscribed() || (subscriber = innerProducer.child) == null) {
                            return;
                        }
                        long j10 = innerProducer.get();
                        long j11 = 0;
                        while (j11 != j10 && (node = initialHead.get()) != null) {
                            Object objLeaveTransform = leaveTransform(node.value);
                            try {
                                if (this.f366763nl.accept(subscriber, objLeaveTransform)) {
                                    innerProducer.index = null;
                                    return;
                                }
                                j11++;
                                if (innerProducer.isUnsubscribed()) {
                                    return;
                                } else {
                                    initialHead = node;
                                }
                            } catch (Throwable th2) {
                                innerProducer.index = null;
                                Exceptions.throwIfFatal(th2);
                                innerProducer.unsubscribe();
                                if (this.f366763nl.isError(objLeaveTransform) || this.f366763nl.isCompleted(objLeaveTransform)) {
                                    return;
                                }
                                subscriber.onError(OnErrorThrowable.addValueAsLastCause(th2, this.f366763nl.getValue(objLeaveTransform)));
                                return;
                            }
                        }
                        if (j11 != 0) {
                            innerProducer.index = initialHead;
                            if (j10 != Long.MAX_VALUE) {
                                innerProducer.produced(j11);
                            }
                        }
                        synchronized (innerProducer) {
                            try {
                                if (!innerProducer.missed) {
                                    innerProducer.emitting = false;
                                    return;
                                }
                                innerProducer.missed = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        final void setFirst(Node node) {
            set(node);
        }

        void truncate() {
        }

        void truncateFinal() {
        }
    }

    static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        Subscriber<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final ReplaySubscriber<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        public InnerProducer(ReplaySubscriber<T> replaySubscriber, Subscriber<? super T> subscriber) {
            this.parent = replaySubscriber;
            this.child = subscriber;
        }

        void addTotalRequested(long j10) {
            long j11;
            long j12;
            do {
                j11 = this.totalRequested.get();
                j12 = j11 + j10;
                if (j12 < 0) {
                    j12 = Long.MAX_VALUE;
                }
            } while (!this.totalRequested.compareAndSet(j11, j12));
        }

        <U> U index() {
            return (U) this.index;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long j10) {
            long j11;
            long j12;
            if (j10 <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j11 = get();
                if (j11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j12 = j11 - j10;
                if (j12 < 0) {
                    throw new IllegalStateException("More produced (" + j10 + ") than requested (" + j11 + ")");
                }
            } while (!compareAndSet(j11, j12));
            return j12;
        }

        @Override // rx.Producer
        public void request(long j10) {
            long j11;
            long j12;
            if (j10 < 0) {
                return;
            }
            do {
                j11 = get();
                if (j11 == Long.MIN_VALUE) {
                    return;
                }
                if (j11 >= 0 && j10 == 0) {
                    return;
                }
                j12 = j11 + j10;
                if (j12 < 0) {
                    j12 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j11, j12));
            addTotalRequested(j10);
            this.parent.manageRequests(this);
            this.parent.buffer.replay(this);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.parent.remove(this);
            this.parent.manageRequests(this);
            this.child = null;
        }
    }

    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        public Node(Object obj, long j10) {
            this.value = obj;
            this.index = j10;
        }
    }

    interface ReplayBuffer<T> {
        void complete();

        void error(Throwable th2);

        void next(T t10);

        void replay(InnerProducer<T> innerProducer);
    }

    static final class ReplaySubscriber<T> extends Subscriber<T> implements Subscription {
        static final InnerProducer[] EMPTY = new InnerProducer[0];
        static final InnerProducer[] TERMINATED = new InnerProducer[0];
        final ReplayBuffer<T> buffer;
        boolean coordinateAll;
        List<InnerProducer<T>> coordinationQueue;
        boolean done;
        boolean emitting;
        long maxChildRequested;
        long maxUpstreamRequested;
        boolean missed;
        volatile Producer producer;
        long producersCacheVersion;
        volatile long producersVersion;
        volatile boolean terminated;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366764nl = NotificationLite.instance();
        final OpenHashSet<InnerProducer<T>> producers = new OpenHashSet<>();
        InnerProducer<T>[] producersCache = EMPTY;
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public ReplaySubscriber(ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
            request(0L);
        }

        boolean add(InnerProducer<T> innerProducer) {
            innerProducer.getClass();
            if (this.terminated) {
                return false;
            }
            synchronized (this.producers) {
                try {
                    if (this.terminated) {
                        return false;
                    }
                    this.producers.add(innerProducer);
                    this.producersVersion++;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        InnerProducer<T>[] copyProducers() {
            InnerProducer<T>[] innerProducerArr;
            synchronized (this.producers) {
                InnerProducer<T>[] innerProducerArrValues = this.producers.values();
                int length = innerProducerArrValues.length;
                innerProducerArr = new InnerProducer[length];
                System.arraycopy(innerProducerArrValues, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        void init() {
            add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorReplay.ReplaySubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    if (ReplaySubscriber.this.terminated) {
                        return;
                    }
                    synchronized (ReplaySubscriber.this.producers) {
                        try {
                            if (!ReplaySubscriber.this.terminated) {
                                ReplaySubscriber.this.producers.terminate();
                                ReplaySubscriber.this.producersVersion++;
                                ReplaySubscriber.this.terminated = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }));
        }

        void makeRequest(long j10, long j11) {
            long j12 = this.maxUpstreamRequested;
            Producer producer = this.producer;
            long j13 = j10 - j11;
            if (j13 == 0) {
                if (j12 == 0 || producer == null) {
                    return;
                }
                this.maxUpstreamRequested = 0L;
                producer.request(j12);
                return;
            }
            this.maxChildRequested = j10;
            if (producer == null) {
                long j14 = j12 + j13;
                if (j14 < 0) {
                    j14 = Long.MAX_VALUE;
                }
                this.maxUpstreamRequested = j14;
                return;
            }
            if (j12 == 0) {
                producer.request(j13);
            } else {
                this.maxUpstreamRequested = 0L;
                producer.request(j12 + j13);
            }
        }

        void manageRequests(InnerProducer<T> innerProducer) {
            long jMax;
            List<InnerProducer<T>> list;
            boolean z10;
            long jMax2;
            if (!isUnsubscribed()) {
                synchronized (this) {
                    try {
                        if (this.emitting) {
                            if (innerProducer != null) {
                                List arrayList = this.coordinationQueue;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    this.coordinationQueue = arrayList;
                                }
                                arrayList.add(innerProducer);
                            } else {
                                this.coordinateAll = true;
                            }
                            this.missed = true;
                            return;
                        }
                        this.emitting = true;
                        long j10 = this.maxChildRequested;
                        if (innerProducer != null) {
                            jMax = Math.max(j10, innerProducer.totalRequested.get());
                        } else {
                            long jMax3 = j10;
                            for (InnerProducer<T> innerProducer2 : copyProducers()) {
                                if (innerProducer2 != null) {
                                    jMax3 = Math.max(jMax3, innerProducer2.totalRequested.get());
                                }
                            }
                            jMax = jMax3;
                        }
                        makeRequest(jMax, j10);
                        while (!isUnsubscribed()) {
                            synchronized (this) {
                                try {
                                    if (!this.missed) {
                                        this.emitting = false;
                                        return;
                                    }
                                    this.missed = false;
                                    list = this.coordinationQueue;
                                    this.coordinationQueue = null;
                                    z10 = this.coordinateAll;
                                    this.coordinateAll = false;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            long j11 = this.maxChildRequested;
                            if (list != null) {
                                Iterator<InnerProducer<T>> it = list.iterator();
                                jMax2 = j11;
                                while (it.hasNext()) {
                                    jMax2 = Math.max(jMax2, it.next().totalRequested.get());
                                }
                            } else {
                                jMax2 = j11;
                            }
                            if (z10) {
                                for (InnerProducer<T> innerProducer3 : copyProducers()) {
                                    if (innerProducer3 != null) {
                                        jMax2 = Math.max(jMax2, innerProducer3.totalRequested.get());
                                    }
                                }
                            }
                            makeRequest(jMax2, j11);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            try {
                this.buffer.complete();
                replay();
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                return;
            }
            this.done = true;
            try {
                this.buffer.error(th2);
                replay();
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (!this.done) {
                this.buffer.next(t10);
                replay();
            }
        }

        void remove(InnerProducer<T> innerProducer) {
            if (this.terminated) {
                return;
            }
            synchronized (this.producers) {
                try {
                    if (this.terminated) {
                        return;
                    }
                    this.producers.remove(innerProducer);
                    if (this.producers.isEmpty()) {
                        this.producersCache = EMPTY;
                    }
                    this.producersVersion++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void replay() {
            InnerProducer<T>[] innerProducerArr = this.producersCache;
            if (this.producersCacheVersion != this.producersVersion) {
                synchronized (this.producers) {
                    try {
                        innerProducerArr = this.producersCache;
                        InnerProducer<T>[] innerProducerArrValues = this.producers.values();
                        int length = innerProducerArrValues.length;
                        if (innerProducerArr.length != length) {
                            innerProducerArr = new InnerProducer[length];
                            this.producersCache = innerProducerArr;
                        }
                        System.arraycopy(innerProducerArrValues, 0, innerProducerArr, 0, length);
                        this.producersCacheVersion = this.producersVersion;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            ReplayBuffer<T> replayBuffer = this.buffer;
            for (InnerProducer<T> innerProducer : innerProducerArr) {
                if (innerProducer != null) {
                    replayBuffer.replay(innerProducer);
                }
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            if (this.producer != null) {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.producer = producer;
            manageRequests(null);
            replay();
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAgeInMillis;
        final Scheduler scheduler;

        public SizeAndTimeBoundReplayBuffer(int i10, long j10, Scheduler scheduler) {
            this.scheduler = scheduler;
            this.limit = i10;
            this.maxAgeInMillis = j10;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        Object enterTransform(Object obj) {
            return new Timestamped(this.scheduler.now(), obj);
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        Node getInitialHead() {
            Node node;
            long jNow = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || ((Timestamped) node2.value).getTimestampMillis() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        Object leaveTransform(Object obj) {
            return ((Timestamped) obj).getValue();
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        void truncate() {
            Node node;
            long jNow = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i11 = this.size;
                    if (i11 <= this.limit) {
                        if (((Timestamped) node2.value).getTimestampMillis() > jNow) {
                            break;
                        }
                        i10++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i10++;
                        this.size = i11 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        void truncateFinal() {
            Node node;
            long jNow = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            boolean z10 = false & false;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((Timestamped) node2.value).getTimestampMillis() > jNow) {
                    break;
                }
                i10++;
                this.size--;
                node3 = node2.get();
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        public SizeBoundReplayBuffer(int i10) {
            this.limit = i10;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366765nl;
        volatile int size;

        public UnboundedReplayBuffer(int i10) {
            super(i10);
            this.f366765nl = NotificationLite.instance();
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public void complete() {
            add(this.f366765nl.completed());
            this.size++;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public void error(Throwable th2) {
            add(this.f366765nl.error(th2));
            this.size++;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public void next(T t10) {
            add(this.f366765nl.next(t10));
            this.size++;
        }

        @Override // rx.internal.operators.OperatorReplay.ReplayBuffer
        public void replay(InnerProducer<T> innerProducer) {
            synchronized (innerProducer) {
                try {
                    if (innerProducer.emitting) {
                        innerProducer.missed = true;
                        return;
                    }
                    innerProducer.emitting = true;
                    while (!innerProducer.isUnsubscribed()) {
                        int i10 = this.size;
                        Integer num = (Integer) innerProducer.index();
                        int iIntValue = num != null ? num.intValue() : 0;
                        Subscriber<? super T> subscriber = innerProducer.child;
                        if (subscriber == null) {
                            return;
                        }
                        long j10 = innerProducer.get();
                        long j11 = 0;
                        while (j11 != j10 && iIntValue < i10) {
                            Object obj = get(iIntValue);
                            try {
                                if (this.f366765nl.accept(subscriber, obj) || innerProducer.isUnsubscribed()) {
                                    return;
                                }
                                iIntValue++;
                                j11++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                innerProducer.unsubscribe();
                                if (this.f366765nl.isError(obj) || this.f366765nl.isCompleted(obj)) {
                                    return;
                                }
                                subscriber.onError(OnErrorThrowable.addValueAsLastCause(th2, this.f366765nl.getValue(obj)));
                                return;
                            }
                        }
                        if (j11 != 0) {
                            innerProducer.index = Integer.valueOf(iIntValue);
                            if (j10 != Long.MAX_VALUE) {
                                innerProducer.produced(j11);
                            }
                        }
                        synchronized (innerProducer) {
                            try {
                                if (!innerProducer.missed) {
                                    innerProducer.emitting = false;
                                    return;
                                }
                                innerProducer.missed = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private OperatorReplay(Observable.OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<ReplaySubscriber<T>> atomicReference, Func0<? extends ReplayBuffer<T>> func0) {
        super(onSubscribe);
        this.source = observable;
        this.current = atomicReference;
        this.bufferFactory = func0;
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        return create(observable, DEFAULT_UNBOUNDED_FACTORY);
    }

    public static <T, U, R> Observable<R> multicastSelector(final Func0<? extends ConnectableObservable<U>> func0, final Func1<? super Observable<U>, ? extends Observable<R>> func1) {
        return Observable.create(new Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorReplay.2
            @Override // rx.functions.Action1
            public void call(final Subscriber<? super R> subscriber) {
                try {
                    ConnectableObservable connectableObservable = (ConnectableObservable) func0.call();
                    ((Observable) func1.call(connectableObservable)).subscribe((Subscriber) subscriber);
                    connectableObservable.connect(new Action1<Subscription>() { // from class: rx.internal.operators.OperatorReplay.2.1
                        @Override // rx.functions.Action1
                        public void call(Subscription subscription) {
                            subscriber.add(subscription);
                        }
                    });
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, subscriber);
                }
            }
        });
    }

    public static <T> ConnectableObservable<T> observeOn(final ConnectableObservable<T> connectableObservable, Scheduler scheduler) {
        final Observable<T> observableObserveOn = connectableObservable.observeOn(scheduler);
        return new ConnectableObservable<T>(new Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorReplay.3
            @Override // rx.functions.Action1
            public void call(final Subscriber<? super T> subscriber) {
                observableObserveOn.unsafeSubscribe(new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorReplay.3.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        subscriber.onError(th2);
                    }

                    @Override // rx.Observer
                    public void onNext(T t10) {
                        subscriber.onNext(t10);
                    }
                });
            }
        }) { // from class: rx.internal.operators.OperatorReplay.4
            @Override // rx.observables.ConnectableObservable
            public void connect(Action1<? super Subscription> action1) {
                connectableObservable.connect(action1);
            }
        };
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.current.get();
            if (replaySubscriber != null && !replaySubscriber.isUnsubscribed()) {
                break;
            }
            ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.bufferFactory.call());
            replaySubscriber2.init();
            if (z1.a(this.current, replaySubscriber, replaySubscriber2)) {
                replaySubscriber = replaySubscriber2;
                break;
            }
        }
        boolean z10 = false;
        if (!replaySubscriber.shouldConnect.get() && replaySubscriber.shouldConnect.compareAndSet(false, true)) {
            z10 = true;
        }
        action1.call(replaySubscriber);
        if (z10) {
            this.source.unsafeSubscribe(replaySubscriber);
        }
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, final int i10) {
        return i10 == Integer.MAX_VALUE ? create(observable) : create(observable, new Func0<ReplayBuffer<T>>() { // from class: rx.internal.operators.OperatorReplay.5
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public ReplayBuffer<T> call() {
                return new SizeBoundReplayBuffer(i10);
            }
        });
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return create(observable, j10, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j10, TimeUnit timeUnit, final Scheduler scheduler, final int i10) {
        final long millis = timeUnit.toMillis(j10);
        return create(observable, new Func0<ReplayBuffer<T>>() { // from class: rx.internal.operators.OperatorReplay.6
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public ReplayBuffer<T> call() {
                return new SizeAndTimeBoundReplayBuffer(i10, millis, scheduler);
            }
        });
    }

    static <T> ConnectableObservable<T> create(Observable<? extends T> observable, final Func0<? extends ReplayBuffer<T>> func0) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorReplay.7
            @Override // rx.functions.Action1
            public void call(Subscriber<? super T> subscriber) {
                ReplaySubscriber replaySubscriber;
                ReplaySubscriber replaySubscriber2;
                do {
                    replaySubscriber = (ReplaySubscriber) atomicReference.get();
                    if (replaySubscriber == null) {
                        replaySubscriber2 = new ReplaySubscriber((ReplayBuffer) func0.call());
                        replaySubscriber2.init();
                    }
                    InnerProducer<T> innerProducer = new InnerProducer<>(replaySubscriber, subscriber);
                    replaySubscriber.add((InnerProducer) innerProducer);
                    subscriber.add(innerProducer);
                    replaySubscriber.buffer.replay(innerProducer);
                    subscriber.setProducer(innerProducer);
                } while (!z1.a(atomicReference, replaySubscriber, replaySubscriber2));
                replaySubscriber = replaySubscriber2;
                InnerProducer<T> innerProducer2 = new InnerProducer<>(replaySubscriber, subscriber);
                replaySubscriber.add((InnerProducer) innerProducer2);
                subscriber.add(innerProducer2);
                replaySubscriber.buffer.replay(innerProducer2);
                subscriber.setProducer(innerProducer2);
            }
        }, observable, atomicReference, func0);
    }
}
