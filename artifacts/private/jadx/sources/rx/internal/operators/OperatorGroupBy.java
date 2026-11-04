package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.UtilityFunctions;
import rx.observables.GroupedObservable;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorGroupBy<T, K, V> implements Observable.Operator<GroupedObservable<K, V>, T> {
    final int bufferSize;
    final boolean delayError;
    final Func1<? super T, ? extends K> keySelector;
    final Func1<Action1<K>, Map<K, Object>> mapFactory;
    final Func1<? super T, ? extends V> valueSelector;

    public static final class GroupByProducer implements Producer {
        final GroupBySubscriber<?, ?, ?> parent;

        public GroupByProducer(GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.parent = groupBySubscriber;
        }

        @Override // rx.Producer
        public void request(long j10) {
            this.parent.requestMore(j10);
        }
    }

    static final class GroupedUnicast<K, T> extends GroupedObservable<K, T> {
        final State<T, K> state;

        protected GroupedUnicast(K k10, State<T, K> state) {
            super(k10, state);
            this.state = state;
        }

        public static <T, K> GroupedUnicast<K, T> createWith(K k10, int i10, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z10) {
            return new GroupedUnicast<>(k10, new State(i10, groupBySubscriber, k10, z10));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th2) {
            this.state.onError(th2);
        }

        public void onNext(T t10) {
            this.state.onNext(t10);
        }
    }

    static final class State<T, K> extends AtomicInteger implements Producer, Subscription, Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final GroupBySubscriber<?, K, T> parent;
        final Queue<Object> queue = new ConcurrentLinkedQueue();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<Subscriber<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public State(int i10, GroupBySubscriber<?, K, T> groupBySubscriber, K k10, boolean z10) {
            this.parent = groupBySubscriber;
            this.key = k10;
            this.delayError = z10;
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<? super T> subscriber, boolean z12) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                this.queue.clear();
                subscriber.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.queue;
            boolean z10 = this.delayError;
            Subscriber<? super T> subscriber = this.actual.get();
            NotificationLite notificationLiteInstance = NotificationLite.instance();
            int iAddAndGet = 1;
            while (true) {
                if (subscriber != null) {
                    if (checkTerminated(this.done, queue.isEmpty(), subscriber, z10)) {
                        return;
                    }
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z11 = this.done;
                        Object objPoll = queue.poll();
                        boolean z12 = objPoll == null;
                        if (checkTerminated(z11, z12, subscriber, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        subscriber.onNext((Object) notificationLiteInstance.getValue(objPoll));
                        j11++;
                    }
                    if (j11 != 0) {
                        if (j10 != Long.MAX_VALUE) {
                            BackpressureUtils.produced(this.requested, j11);
                        }
                        this.parent.f366759s.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (subscriber == null) {
                    subscriber = this.actual.get();
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancelled.get();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        public void onNext(T t10) {
            if (t10 == null) {
                this.error = new NullPointerException();
                this.done = true;
            } else {
                this.queue.offer(NotificationLite.instance().next(t10));
            }
            drain();
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j10);
            }
            if (j10 != 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j10);
                drain();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.parent.cancel(this.key);
            }
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            if (!this.once.compareAndSet(false, true)) {
                subscriber.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            subscriber.add(this);
            subscriber.setProducer(this);
            this.actual.lazySet(subscriber);
            drain();
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1) {
        this(func1, UtilityFunctions.identity(), RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2) {
        this(func1, func2, RxRingBuffer.SIZE, false, null);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super GroupedObservable<K, V>> subscriber) {
        Subscriber<? super GroupedObservable<K, V>> subscriber2;
        try {
            subscriber2 = subscriber;
            try {
                final GroupBySubscriber groupBySubscriber = new GroupBySubscriber(subscriber2, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, this.mapFactory);
                subscriber2.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorGroupBy.1
                    @Override // rx.functions.Action0
                    public void call() {
                        groupBySubscriber.cancel();
                    }
                }));
                subscriber2.setProducer(groupBySubscriber.producer);
                return groupBySubscriber;
            } catch (Throwable th2) {
                th = th2;
                Exceptions.throwOrReport(th, subscriber2);
                Subscriber<? super T> subscriberEmpty = Subscribers.empty();
                subscriberEmpty.unsubscribe();
                return subscriberEmpty;
            }
        } catch (Throwable th3) {
            th = th3;
            subscriber2 = subscriber;
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends Subscriber<T> {
        static final Object NULL_KEY = new Object();
        final Subscriber<? super GroupedObservable<K, V>> actual;
        final int bufferSize;
        final AtomicBoolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final Queue<K> evictedKeys;
        final AtomicInteger groupCount;
        final Map<Object, GroupedUnicast<K, V>> groups;
        final Func1<? super T, ? extends K> keySelector;
        final GroupByProducer producer;
        final Queue<GroupedObservable<K, V>> queue = new ConcurrentLinkedQueue();
        final AtomicLong requested;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final ProducerArbiter f366759s;
        final Func1<? super T, ? extends V> valueSelector;
        final AtomicInteger wip;

        static class EvictionAction<K> implements Action1<K> {
            final Queue<K> evictedKeys;

            EvictionAction(Queue<K> queue) {
                this.evictedKeys = queue;
            }

            @Override // rx.functions.Action1
            public void call(K k10) {
                this.evictedKeys.offer(k10);
            }
        }

        public GroupBySubscriber(Subscriber<? super GroupedObservable<K, V>> subscriber, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, int i10, boolean z10, Func1<Action1<K>, Map<K, Object>> func3) {
            this.actual = subscriber;
            this.keySelector = func1;
            this.valueSelector = func2;
            this.bufferSize = i10;
            this.delayError = z10;
            ProducerArbiter producerArbiter = new ProducerArbiter();
            this.f366759s = producerArbiter;
            producerArbiter.request(i10);
            this.producer = new GroupByProducer(this);
            this.cancelled = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.groupCount = new AtomicInteger(1);
            this.wip = new AtomicInteger();
            if (func3 == null) {
                this.groups = new ConcurrentHashMap();
                this.evictedKeys = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.evictedKeys = concurrentLinkedQueue;
                this.groups = createMap(func3, new EvictionAction(concurrentLinkedQueue));
            }
        }

        private Map<Object, GroupedUnicast<K, V>> createMap(Func1<Action1<K>, Map<K, Object>> func1, Action1<K> action1) {
            return func1.call(action1);
        }

        public void cancel() {
            if (this.cancelled.compareAndSet(false, true) && this.groupCount.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue) {
            if (!z10) {
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                errorAll(subscriber, queue, th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.actual.onCompleted();
            return true;
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Queue<GroupedObservable<K, V>> queue = this.queue;
            Subscriber<? super GroupedObservable<K, V>> subscriber = this.actual;
            int iAddAndGet = 1;
            while (!checkTerminated(this.done, queue.isEmpty(), subscriber, queue)) {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.done;
                    GroupedObservable<K, V> groupedObservablePoll = queue.poll();
                    boolean z11 = groupedObservablePoll == null;
                    if (checkTerminated(z10, z11, subscriber, queue)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(groupedObservablePoll);
                    j11++;
                }
                if (j11 != 0) {
                    if (j10 != Long.MAX_VALUE) {
                        BackpressureUtils.produced(this.requested, j11);
                    }
                    this.f366759s.request(j11);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void errorAll(Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue, Throwable th2) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            Queue<K> queue2 = this.evictedKeys;
            if (queue2 != null) {
                queue2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((GroupedUnicast) it.next()).onError(th2);
            }
            subscriber.onError(th2);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.groups.clear();
            Queue<K> queue = this.evictedKeys;
            if (queue != null) {
                queue.clear();
            }
            this.done = true;
            this.groupCount.decrementAndGet();
            drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            this.groupCount.decrementAndGet();
            drain();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            boolean z10;
            if (this.done) {
                return;
            }
            Queue<?> queue = this.queue;
            Subscriber<? super GroupedObservable<K, V>> subscriber = this.actual;
            try {
                K kCall = this.keySelector.call(t10);
                Object obj = kCall != null ? kCall : NULL_KEY;
                GroupedUnicast<K, V> groupedUnicastCreateWith = this.groups.get(obj);
                if (groupedUnicastCreateWith != null) {
                    z10 = true;
                } else {
                    if (this.cancelled.get()) {
                        return;
                    }
                    groupedUnicastCreateWith = GroupedUnicast.createWith(kCall, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, groupedUnicastCreateWith);
                    this.groupCount.getAndIncrement();
                    queue.offer(groupedUnicastCreateWith);
                    drain();
                    z10 = false;
                }
                try {
                    groupedUnicastCreateWith.onNext(this.valueSelector.call(t10));
                    if (this.evictedKeys != null) {
                        while (true) {
                            K kPoll = this.evictedKeys.poll();
                            if (kPoll == null) {
                                break;
                            }
                            GroupedUnicast<K, V> groupedUnicast = this.groups.get(kPoll);
                            if (groupedUnicast != null) {
                                groupedUnicast.onComplete();
                            }
                        }
                    }
                    if (z10) {
                        this.f366759s.request(1L);
                    }
                } catch (Throwable th2) {
                    unsubscribe();
                    errorAll(subscriber, queue, th2);
                }
            } catch (Throwable th3) {
                unsubscribe();
                errorAll(subscriber, queue, th3);
            }
        }

        public void requestMore(long j10) {
            if (j10 >= 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j10);
                drain();
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j10);
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.f366759s.setProducer(producer);
        }

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) NULL_KEY;
            }
            if (this.groups.remove(k10) == null || this.groupCount.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, Func1<Action1<K>, Map<K, Object>> func3) {
        this(func1, func2, RxRingBuffer.SIZE, false, func3);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, int i10, boolean z10, Func1<Action1<K>, Map<K, Object>> func3) {
        this.keySelector = func1;
        this.valueSelector = func2;
        this.bufferSize = i10;
        this.delayError = z10;
        this.mapFactory = func3;
    }
}
