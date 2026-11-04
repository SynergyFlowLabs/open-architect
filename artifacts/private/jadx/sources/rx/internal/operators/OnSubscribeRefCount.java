package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeRefCount<T> implements Observable.OnSubscribe<T> {
    private final ConnectableObservable<? extends T> source;
    volatile CompositeSubscription baseSubscription = new CompositeSubscription();
    final AtomicInteger subscriptionCount = new AtomicInteger(0);
    final ReentrantLock lock = new ReentrantLock();

    public OnSubscribeRefCount(ConnectableObservable<? extends T> connectableObservable) {
        this.source = connectableObservable;
    }

    private Subscription disconnect(final CompositeSubscription compositeSubscription) {
        return Subscriptions.create(new Action0() { // from class: rx.internal.operators.OnSubscribeRefCount.3
            @Override // rx.functions.Action0
            public void call() {
                OnSubscribeRefCount.this.lock.lock();
                try {
                    if (OnSubscribeRefCount.this.baseSubscription == compositeSubscription && OnSubscribeRefCount.this.subscriptionCount.decrementAndGet() == 0) {
                        OnSubscribeRefCount.this.baseSubscription.unsubscribe();
                        OnSubscribeRefCount.this.baseSubscription = new CompositeSubscription();
                    }
                    ReentrantLock reentrantLock = OnSubscribeRefCount.this.lock;
                } finally {
                    OnSubscribeRefCount.this.lock.unlock();
                }
            }
        });
    }

    private Action1<Subscription> onSubscribe(final Subscriber<? super T> subscriber, final AtomicBoolean atomicBoolean) {
        return new Action1<Subscription>() { // from class: rx.internal.operators.OnSubscribeRefCount.1
            @Override // rx.functions.Action1
            public void call(Subscription subscription) {
                try {
                    OnSubscribeRefCount.this.baseSubscription.add(subscription);
                    OnSubscribeRefCount onSubscribeRefCount = OnSubscribeRefCount.this;
                    onSubscribeRefCount.doSubscribe(subscriber, onSubscribeRefCount.baseSubscription);
                    OnSubscribeRefCount.this.lock.unlock();
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                } finally {
                    OnSubscribeRefCount.this.lock.unlock();
                    atomicBoolean.set(false);
                }
            }
        };
    }

    void doSubscribe(final Subscriber<? super T> subscriber, final CompositeSubscription compositeSubscription) {
        subscriber.add(disconnect(compositeSubscription));
        this.source.unsafeSubscribe((Subscriber<? super Object>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OnSubscribeRefCount.2
            void cleanup() {
                OnSubscribeRefCount.this.lock.lock();
                try {
                    if (OnSubscribeRefCount.this.baseSubscription == compositeSubscription) {
                        OnSubscribeRefCount.this.baseSubscription.unsubscribe();
                        OnSubscribeRefCount.this.baseSubscription = new CompositeSubscription();
                        OnSubscribeRefCount.this.subscriptionCount.set(0);
                    }
                    OnSubscribeRefCount.this.lock.unlock();
                } catch (Throwable th2) {
                    OnSubscribeRefCount.this.lock.unlock();
                    throw th2;
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                cleanup();
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                cleanup();
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                subscriber.onNext(t10);
            }
        });
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        this.lock.lock();
        int i10 = 4 ^ 1;
        if (this.subscriptionCount.incrementAndGet() != 1) {
            try {
                doSubscribe(subscriber, this.baseSubscription);
                this.lock.unlock();
                return;
            } catch (Throwable th2) {
                this.lock.unlock();
                throw th2;
            }
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        try {
            this.source.connect(onSubscribe(subscriber, atomicBoolean));
            if (atomicBoolean.get()) {
                this.lock.unlock();
            }
        } catch (Throwable th3) {
            if (atomicBoolean.get()) {
                this.lock.unlock();
            }
            throw th3;
        }
    }
}
