package rx.observables;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.annotations.Beta;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func1;
import rx.internal.operators.BlockingOperatorLatest;
import rx.internal.operators.BlockingOperatorMostRecent;
import rx.internal.operators.BlockingOperatorNext;
import rx.internal.operators.BlockingOperatorToFuture;
import rx.internal.operators.BlockingOperatorToIterator;
import rx.internal.operators.NotificationLite;
import rx.internal.util.BlockingUtils;
import rx.internal.util.UtilityFunctions;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class BlockingObservable<T> {
    static final Object ON_START = new Object();
    static final Object SET_PRODUCER = new Object();
    static final Object UNSUBSCRIBE = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Observable<? extends T> f366786o;

    private BlockingObservable(Observable<? extends T> observable) {
        this.f366786o = observable;
    }

    private T blockForSingle(Observable<? extends T> observable) {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, observable.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.3
            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                atomicReference2.set(th2);
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                atomicReference.set(t10);
            }
        }));
        if (atomicReference2.get() != null) {
            Exceptions.propagate((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    public static <T> BlockingObservable<T> from(Observable<? extends T> observable) {
        return new BlockingObservable<>(observable);
    }

    public T first() {
        return blockForSingle(this.f366786o.first());
    }

    public T firstOrDefault(T t10) {
        return blockForSingle(this.f366786o.map(UtilityFunctions.identity()).firstOrDefault(t10));
    }

    public void forEach(final Action1<? super T> action1) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        BlockingUtils.awaitForComplete(countDownLatch, this.f366786o.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.1
            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                atomicReference.set(th2);
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                action1.call(t10);
            }
        }));
        if (atomicReference.get() != null) {
            Exceptions.propagate((Throwable) atomicReference.get());
        }
    }

    public Iterator<T> getIterator() {
        return BlockingOperatorToIterator.toIterator(this.f366786o);
    }

    public T last() {
        return blockForSingle(this.f366786o.last());
    }

    public T lastOrDefault(T t10) {
        return blockForSingle(this.f366786o.map(UtilityFunctions.identity()).lastOrDefault(t10));
    }

    public Iterable<T> latest() {
        return BlockingOperatorLatest.latest(this.f366786o);
    }

    public Iterable<T> mostRecent(T t10) {
        return BlockingOperatorMostRecent.mostRecent(this.f366786o, t10);
    }

    public Iterable<T> next() {
        return BlockingOperatorNext.next(this.f366786o);
    }

    public T single() {
        return blockForSingle(this.f366786o.single());
    }

    public T singleOrDefault(T t10) {
        return blockForSingle(this.f366786o.map(UtilityFunctions.identity()).singleOrDefault(t10));
    }

    @Beta
    public void subscribe() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = {null};
        BlockingUtils.awaitForComplete(countDownLatch, this.f366786o.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.4
            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                thArr[0] = th2;
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onNext(T t10) {
            }
        }));
        boolean z10 = false & false;
        Throwable th2 = thArr[0];
        if (th2 != null) {
            Exceptions.propagate(th2);
        }
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.f366786o);
    }

    public Iterable<T> toIterable() {
        return new Iterable<T>() { // from class: rx.observables.BlockingObservable.2
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return BlockingObservable.this.getIterator();
            }
        };
    }

    public T first(Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f366786o.first(func1));
    }

    public T firstOrDefault(T t10, Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f366786o.filter(func1).map(UtilityFunctions.identity()).firstOrDefault(t10));
    }

    public T last(Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f366786o.last(func1));
    }

    public T lastOrDefault(T t10, Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f366786o.filter(func1).map(UtilityFunctions.identity()).lastOrDefault(t10));
    }

    public T single(Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f366786o.single(func1));
    }

    public T singleOrDefault(T t10, Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f366786o.filter(func1).map(UtilityFunctions.identity()).singleOrDefault(t10));
    }

    @Beta
    public void subscribe(Observer<? super T> observer) {
        Object objPoll;
        final NotificationLite notificationLiteInstance = NotificationLite.instance();
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Subscription subscriptionSubscribe = this.f366786o.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.5
            @Override // rx.Observer
            public void onCompleted() {
                linkedBlockingQueue.offer(notificationLiteInstance.completed());
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                linkedBlockingQueue.offer(notificationLiteInstance.error(th2));
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                linkedBlockingQueue.offer(notificationLiteInstance.next(t10));
            }
        });
        do {
            try {
                try {
                    objPoll = linkedBlockingQueue.poll();
                    if (objPoll == null) {
                        objPoll = linkedBlockingQueue.take();
                    }
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    observer.onError(e10);
                    subscriptionSubscribe.unsubscribe();
                    return;
                }
            } catch (Throwable th2) {
                subscriptionSubscribe.unsubscribe();
                throw th2;
            }
        } while (!notificationLiteInstance.accept(observer, objPoll));
        subscriptionSubscribe.unsubscribe();
    }

    @Beta
    public void subscribe(Subscriber<? super T> subscriber) {
        final NotificationLite notificationLiteInstance = NotificationLite.instance();
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final Producer[] producerArr = {null};
        Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.observables.BlockingObservable.6
            @Override // rx.Observer
            public void onCompleted() {
                linkedBlockingQueue.offer(notificationLiteInstance.completed());
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                linkedBlockingQueue.offer(notificationLiteInstance.error(th2));
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                linkedBlockingQueue.offer(notificationLiteInstance.next(t10));
            }

            @Override // rx.Subscriber
            public void onStart() {
                linkedBlockingQueue.offer(BlockingObservable.ON_START);
            }

            @Override // rx.Subscriber
            public void setProducer(Producer producer) {
                producerArr[0] = producer;
                linkedBlockingQueue.offer(BlockingObservable.SET_PRODUCER);
            }
        };
        subscriber.add(subscriber2);
        subscriber.add(Subscriptions.create(new Action0() { // from class: rx.observables.BlockingObservable.7
            @Override // rx.functions.Action0
            public void call() {
                linkedBlockingQueue.offer(BlockingObservable.UNSUBSCRIBE);
            }
        }));
        this.f366786o.subscribe((Subscriber<? super Object>) subscriber2);
        while (!subscriber.isUnsubscribed()) {
            try {
                try {
                    Object objPoll = linkedBlockingQueue.poll();
                    if (objPoll == null) {
                        objPoll = linkedBlockingQueue.take();
                    }
                    if (subscriber.isUnsubscribed() || objPoll == UNSUBSCRIBE) {
                        break;
                        break;
                    } else if (objPoll == ON_START) {
                        subscriber.onStart();
                    } else if (objPoll == SET_PRODUCER) {
                        subscriber.setProducer(producerArr[0]);
                    } else if (notificationLiteInstance.accept(subscriber, objPoll)) {
                        subscriber2.unsubscribe();
                        return;
                    }
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    subscriber.onError(e10);
                    subscriber2.unsubscribe();
                    return;
                }
            } catch (Throwable th2) {
                subscriber2.unsubscribe();
                throw th2;
            }
        }
        subscriber2.unsubscribe();
    }

    @Beta
    public void subscribe(Action1<? super T> action1) {
        subscribe(action1, new Action1<Throwable>() { // from class: rx.observables.BlockingObservable.8
            @Override // rx.functions.Action1
            public void call(Throwable th2) {
                throw new OnErrorNotImplementedException(th2);
            }
        }, Actions.empty());
    }

    @Beta
    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action2) {
        subscribe(action1, action2, Actions.empty());
    }

    @Beta
    public void subscribe(final Action1<? super T> action1, final Action1<? super Throwable> action2, final Action0 action0) {
        subscribe(new Observer<T>() { // from class: rx.observables.BlockingObservable.9
            @Override // rx.Observer
            public void onCompleted() {
                action0.call();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                action2.call(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                action1.call(t10);
            }
        });
    }
}
