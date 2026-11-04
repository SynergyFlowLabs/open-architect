package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements Observable.OnSubscribe<T>, Observer<T>, Subscription {
    static final PublishProducer<?>[] EMPTY = new PublishProducer[0];
    static final PublishProducer<?>[] TERMINATED = new PublishProducer[0];
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final ParentSubscriber<T> parent;
    final int prefetch;
    volatile Producer producer;
    final Queue<T> queue;
    volatile PublishProducer<T>[] subscribers;

    static final class ParentSubscriber<T> extends Subscriber<T> {
        final OnSubscribePublishMulticast<T> state;

        public ParentSubscriber(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.state = onSubscribePublishMulticast;
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

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.state.setProducer(producer);
        }
    }

    static final class PublishProducer<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = 960704844171597367L;
        final Subscriber<? super T> actual;
        final AtomicBoolean once = new AtomicBoolean();
        final OnSubscribePublishMulticast<T> parent;

        public PublishProducer(Subscriber<? super T> subscriber, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.actual = subscriber;
            this.parent = onSubscribePublishMulticast;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.once.get();
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j10);
            }
            if (j10 != 0) {
                BackpressureUtils.getAndAddRequest(this, j10);
                this.parent.drain();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i10, boolean z10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("prefetch > 0 required but it was " + i10);
        }
        this.prefetch = i10;
        this.delayError = z10;
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.queue = new SpscArrayQueue(i10);
        } else {
            this.queue = new SpscAtomicArrayQueue(i10);
        }
        this.subscribers = (PublishProducer<T>[]) EMPTY;
        this.parent = new ParentSubscriber<>(this);
    }

    boolean add(PublishProducer<T> publishProducer) {
        PublishProducer<T>[] publishProducerArr = this.subscribers;
        PublishProducer<?>[] publishProducerArr2 = TERMINATED;
        if (publishProducerArr == publishProducerArr2) {
            return false;
        }
        synchronized (this) {
            try {
                PublishProducer<T>[] publishProducerArr3 = this.subscribers;
                if (publishProducerArr3 == publishProducerArr2) {
                    return false;
                }
                int length = publishProducerArr3.length;
                PublishProducer<T>[] publishProducerArr4 = new PublishProducer[length + 1];
                System.arraycopy(publishProducerArr3, 0, publishProducerArr4, 0, length);
                publishProducerArr4[length] = publishProducer;
                this.subscribers = publishProducerArr4;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean checkTerminated(boolean z10, boolean z11) {
        int i10 = 0;
        if (z10) {
            if (!this.delayError) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    PublishProducer<T>[] publishProducerArrTerminate = terminate();
                    int length = publishProducerArrTerminate.length;
                    while (i10 < length) {
                        publishProducerArrTerminate[i10].actual.onError(th2);
                        i10++;
                    }
                    return true;
                }
                if (z11) {
                    PublishProducer<T>[] publishProducerArrTerminate2 = terminate();
                    int length2 = publishProducerArrTerminate2.length;
                    while (i10 < length2) {
                        publishProducerArrTerminate2[i10].actual.onCompleted();
                        i10++;
                    }
                    return true;
                }
            } else if (z11) {
                PublishProducer<T>[] publishProducerArrTerminate3 = terminate();
                Throwable th3 = this.error;
                if (th3 != null) {
                    int length3 = publishProducerArrTerminate3.length;
                    while (i10 < length3) {
                        publishProducerArrTerminate3[i10].actual.onError(th3);
                        i10++;
                    }
                } else {
                    int length4 = publishProducerArrTerminate3.length;
                    while (i10 < length4) {
                        publishProducerArrTerminate3[i10].actual.onCompleted();
                        i10++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    void drain() {
        if (getAndIncrement() == 0) {
            Queue<T> queue = this.queue;
            int iAddAndGet = 0;
            loop0: do {
                PublishProducer<T>[] publishProducerArr = this.subscribers;
                int length = publishProducerArr.length;
                long jMin = Long.MAX_VALUE;
                for (PublishProducer<T> publishProducer : publishProducerArr) {
                    jMin = Math.min(jMin, publishProducer.get());
                }
                if (length != 0) {
                    long j10 = 0;
                    while (j10 != jMin) {
                        boolean z10 = this.done;
                        T tPoll = queue.poll();
                        boolean z11 = tPoll == null;
                        if (checkTerminated(z10, z11)) {
                            break loop0;
                        }
                        if (z11) {
                            break;
                        }
                        for (PublishProducer<T> publishProducer2 : publishProducerArr) {
                            publishProducer2.actual.onNext(tPoll);
                        }
                        j10++;
                    }
                    if (j10 == jMin && checkTerminated(this.done, queue.isEmpty())) {
                        break;
                    }
                    if (j10 != 0) {
                        Producer producer = this.producer;
                        if (producer != null) {
                            producer.request(j10);
                        }
                        for (PublishProducer<T> publishProducer3 : publishProducerArr) {
                            BackpressureUtils.produced(publishProducer3, j10);
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                }
            } while (iAddAndGet != 0);
        }
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.parent.isUnsubscribed();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.error = th2;
        this.done = true;
        drain();
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        if (!this.queue.offer(t10)) {
            this.parent.unsubscribe();
            this.error = new MissingBackpressureException("Queue full?!");
            this.done = true;
        }
        drain();
    }

    void remove(PublishProducer<T> publishProducer) {
        PublishProducer<?>[] publishProducerArr;
        PublishProducer[] publishProducerArr2;
        PublishProducer<T>[] publishProducerArr3 = this.subscribers;
        PublishProducer<?>[] publishProducerArr4 = TERMINATED;
        if (publishProducerArr3 == publishProducerArr4 || publishProducerArr3 == (publishProducerArr = EMPTY)) {
            return;
        }
        synchronized (this) {
            try {
                PublishProducer<T>[] publishProducerArr5 = this.subscribers;
                if (publishProducerArr5 != publishProducerArr4 && publishProducerArr5 != publishProducerArr) {
                    int length = publishProducerArr5.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (publishProducerArr5[i10] == publishProducer) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 < 0) {
                        return;
                    }
                    if (length == 1) {
                        publishProducerArr2 = EMPTY;
                    } else {
                        PublishProducer[] publishProducerArr6 = new PublishProducer[length - 1];
                        System.arraycopy(publishProducerArr5, 0, publishProducerArr6, 0, i10);
                        System.arraycopy(publishProducerArr5, i10 + 1, publishProducerArr6, i10, (length - i10) - 1);
                        publishProducerArr2 = publishProducerArr6;
                    }
                    this.subscribers = publishProducerArr2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void setProducer(Producer producer) {
        this.producer = producer;
        producer.request(this.prefetch);
    }

    public Subscriber<T> subscriber() {
        return this.parent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    PublishProducer<T>[] terminate() {
        PublishProducer<T>[] publishProducerArr;
        PublishProducer<T>[] publishProducerArr2 = this.subscribers;
        PublishProducer<T>[] publishProducerArr3 = (PublishProducer<T>[]) TERMINATED;
        if (publishProducerArr2 == publishProducerArr3) {
            return publishProducerArr2;
        }
        synchronized (this) {
            try {
                publishProducerArr = this.subscribers;
                if (publishProducerArr != publishProducerArr3) {
                    this.subscribers = publishProducerArr3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return publishProducerArr;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.parent.unsubscribe();
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        PublishProducer<T> publishProducer = new PublishProducer<>(subscriber, this);
        subscriber.add(publishProducer);
        subscriber.setProducer(publishProducer);
        if (add(publishProducer)) {
            if (publishProducer.isUnsubscribed()) {
                remove(publishProducer);
                return;
            } else {
                drain();
                return;
            }
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            subscriber.onError(th2);
        } else {
            subscriber.onCompleted();
        }
    }
}
