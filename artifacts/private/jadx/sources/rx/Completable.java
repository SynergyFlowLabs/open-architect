package rx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.annotations.Beta;
import rx.annotations.Experimental;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.operators.CompletableFromEmitter;
import rx.internal.operators.CompletableOnSubscribeConcat;
import rx.internal.operators.CompletableOnSubscribeConcatArray;
import rx.internal.operators.CompletableOnSubscribeConcatIterable;
import rx.internal.operators.CompletableOnSubscribeMerge;
import rx.internal.operators.CompletableOnSubscribeMergeArray;
import rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray;
import rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable;
import rx.internal.operators.CompletableOnSubscribeMergeIterable;
import rx.internal.operators.CompletableOnSubscribeTimeout;
import rx.internal.util.SubscriptionList;
import rx.internal.util.UtilityFunctions;
import rx.observers.SafeCompletableSubscriber;
import rx.observers.SafeSubscriber;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.MultipleAssignmentSubscription;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
@Beta
public class Completable {
    static final Completable COMPLETE = new Completable(new OnSubscribe() { // from class: rx.Completable.1
        @Override // rx.functions.Action1
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onCompleted();
        }
    }, false);
    static final Completable NEVER = new Completable(new OnSubscribe() { // from class: rx.Completable.2
        @Override // rx.functions.Action1
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
        }
    }, false);
    private final OnSubscribe onSubscribe;

    /* JADX INFO: renamed from: rx.Completable$19, reason: invalid class name */
    class AnonymousClass19 implements OnSubscribe {
        final /* synthetic */ Action0 val$onAfterComplete;
        final /* synthetic */ Action0 val$onComplete;
        final /* synthetic */ Action1 val$onError;
        final /* synthetic */ Action1 val$onSubscribe;
        final /* synthetic */ Action0 val$onUnsubscribe;

        AnonymousClass19(Action0 action0, Action0 action1, Action1 action2, Action1 action3, Action0 action4) {
            this.val$onComplete = action0;
            this.val$onAfterComplete = action1;
            this.val$onError = action2;
            this.val$onSubscribe = action3;
            this.val$onUnsubscribe = action4;
        }

        @Override // rx.functions.Action1
        public void call(final CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.19.1
                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    try {
                        AnonymousClass19.this.val$onComplete.call();
                        completableSubscriber.onCompleted();
                        try {
                            AnonymousClass19.this.val$onAfterComplete.call();
                        } catch (Throwable th2) {
                            RxJavaHooks.onError(th2);
                        }
                    } catch (Throwable th3) {
                        completableSubscriber.onError(th3);
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onError(Throwable th2) {
                    try {
                        AnonymousClass19.this.val$onError.call(th2);
                    } catch (Throwable th3) {
                        th2 = new CompositeException(Arrays.asList(th2, th3));
                    }
                    completableSubscriber.onError(th2);
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(final Subscription subscription) {
                    try {
                        AnonymousClass19.this.val$onSubscribe.call(subscription);
                        completableSubscriber.onSubscribe(Subscriptions.create(new Action0() { // from class: rx.Completable.19.1.1
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    AnonymousClass19.this.val$onUnsubscribe.call();
                                } catch (Throwable th2) {
                                    RxJavaHooks.onError(th2);
                                }
                                subscription.unsubscribe();
                            }
                        }));
                    } catch (Throwable th2) {
                        subscription.unsubscribe();
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(th2);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: rx.Completable$35, reason: invalid class name */
    class AnonymousClass35 implements OnSubscribe {
        final /* synthetic */ Scheduler val$scheduler;

        AnonymousClass35(Scheduler scheduler) {
            this.val$scheduler = scheduler;
        }

        @Override // rx.functions.Action1
        public void call(final CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.35.1
                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    completableSubscriber.onCompleted();
                }

                @Override // rx.CompletableSubscriber
                public void onError(Throwable th2) {
                    completableSubscriber.onError(th2);
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(final Subscription subscription) {
                    completableSubscriber.onSubscribe(Subscriptions.create(new Action0() { // from class: rx.Completable.35.1.1
                        @Override // rx.functions.Action0
                        public void call() {
                            final Scheduler.Worker workerCreateWorker = AnonymousClass35.this.val$scheduler.createWorker();
                            workerCreateWorker.schedule(new Action0() { // from class: rx.Completable.35.1.1.1
                                @Override // rx.functions.Action0
                                public void call() {
                                    try {
                                        subscription.unsubscribe();
                                        workerCreateWorker.unsubscribe();
                                    } catch (Throwable th2) {
                                        workerCreateWorker.unsubscribe();
                                        throw th2;
                                    }
                                }
                            });
                        }
                    }));
                }
            });
        }
    }

    public interface OnSubscribe extends Action1<CompletableSubscriber> {
    }

    public interface Operator extends Func1<CompletableSubscriber, CompletableSubscriber> {
    }

    public interface Transformer extends Func1<Completable, Completable> {
    }

    protected Completable(OnSubscribe onSubscribe) {
        this.onSubscribe = RxJavaHooks.onCreate(onSubscribe);
    }

    public static Completable amb(final Completable... completableArr) {
        requireNonNull(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        if (completableArr.length != 1) {
            return create(new OnSubscribe() { // from class: rx.Completable.3
                @Override // rx.functions.Action1
                public void call(final CompletableSubscriber completableSubscriber) {
                    final CompositeSubscription compositeSubscription = new CompositeSubscription();
                    completableSubscriber.onSubscribe(compositeSubscription);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    CompletableSubscriber completableSubscriber2 = new CompletableSubscriber() { // from class: rx.Completable.3.1
                        @Override // rx.CompletableSubscriber
                        public void onCompleted() {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onCompleted();
                            }
                        }

                        @Override // rx.CompletableSubscriber
                        public void onError(Throwable th2) {
                            int i10 = 3 << 1;
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                RxJavaHooks.onError(th2);
                            } else {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onError(th2);
                            }
                        }

                        @Override // rx.CompletableSubscriber
                        public void onSubscribe(Subscription subscription) {
                            compositeSubscription.add(subscription);
                        }
                    };
                    for (Completable completable : completableArr) {
                        if (compositeSubscription.isUnsubscribed()) {
                            return;
                        }
                        if (completable == null) {
                            Throwable nullPointerException = new NullPointerException("One of the sources is null");
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                RxJavaHooks.onError(nullPointerException);
                                return;
                            } else {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onError(nullPointerException);
                                return;
                            }
                        }
                        if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                            return;
                        }
                        completable.unsafeSubscribe(completableSubscriber2);
                    }
                }
            });
        }
        int i10 = 0 << 0;
        return completableArr[0];
    }

    public static Completable complete() {
        Completable completable = COMPLETE;
        OnSubscribe onSubscribeOnCreate = RxJavaHooks.onCreate(completable.onSubscribe);
        return onSubscribeOnCreate == completable.onSubscribe ? completable : new Completable(onSubscribeOnCreate, false);
    }

    public static Completable concat(Completable... completableArr) {
        requireNonNull(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        return completableArr.length == 1 ? completableArr[0] : create(new CompletableOnSubscribeConcatArray(completableArr));
    }

    public static Completable create(OnSubscribe onSubscribe) {
        requireNonNull(onSubscribe);
        try {
            return new Completable(onSubscribe);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            RxJavaHooks.onError(th2);
            throw toNpe(th2);
        }
    }

    public static Completable defer(final Func0<? extends Completable> func0) {
        requireNonNull(func0);
        return create(new OnSubscribe() { // from class: rx.Completable.5
            @Override // rx.functions.Action1
            public void call(CompletableSubscriber completableSubscriber) {
                try {
                    Completable completable = (Completable) func0.call();
                    if (completable != null) {
                        completable.unsafeSubscribe(completableSubscriber);
                    } else {
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(new NullPointerException("The completable returned is null"));
                    }
                } catch (Throwable th2) {
                    completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                    completableSubscriber.onError(th2);
                }
            }
        });
    }

    static void deliverUncaughtException(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    public static Completable error(final Func0<? extends Throwable> func0) {
        requireNonNull(func0);
        return create(new OnSubscribe() { // from class: rx.Completable.6
            @Override // rx.functions.Action1
            public void call(CompletableSubscriber completableSubscriber) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                try {
                    th = (Throwable) func0.call();
                } catch (Throwable th2) {
                    th = th2;
                }
                if (th == null) {
                    th = new NullPointerException("The error supplied is null");
                }
                completableSubscriber.onError(th);
            }
        });
    }

    public static Completable fromAction(final Action0 action0) {
        requireNonNull(action0);
        return create(new OnSubscribe() { // from class: rx.Completable.8
            @Override // rx.functions.Action1
            public void call(CompletableSubscriber completableSubscriber) {
                BooleanSubscription booleanSubscription = new BooleanSubscription();
                completableSubscriber.onSubscribe(booleanSubscription);
                try {
                    action0.call();
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber.onCompleted();
                } catch (Throwable th2) {
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber.onError(th2);
                }
            }
        });
    }

    public static Completable fromCallable(final Callable<?> callable) {
        requireNonNull(callable);
        return create(new OnSubscribe() { // from class: rx.Completable.9
            @Override // rx.functions.Action1
            public void call(CompletableSubscriber completableSubscriber) {
                BooleanSubscription booleanSubscription = new BooleanSubscription();
                completableSubscriber.onSubscribe(booleanSubscription);
                try {
                    callable.call();
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber.onCompleted();
                } catch (Throwable th2) {
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber.onError(th2);
                }
            }
        });
    }

    @Experimental
    public static Completable fromEmitter(Action1<CompletableEmitter> action1) {
        return create(new CompletableFromEmitter(action1));
    }

    public static Completable fromFuture(Future<?> future) {
        requireNonNull(future);
        return fromObservable(Observable.from(future));
    }

    public static Completable fromObservable(final Observable<?> observable) {
        requireNonNull(observable);
        return create(new OnSubscribe() { // from class: rx.Completable.10
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                Subscriber<Object> subscriber = new Subscriber<Object>() { // from class: rx.Completable.10.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        completableSubscriber.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        completableSubscriber.onError(th2);
                    }

                    @Override // rx.Observer
                    public void onNext(Object obj) {
                    }
                };
                completableSubscriber.onSubscribe(subscriber);
                observable.unsafeSubscribe(subscriber);
            }
        });
    }

    public static Completable fromSingle(final Single<?> single) {
        requireNonNull(single);
        return create(new OnSubscribe() { // from class: rx.Completable.11
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                SingleSubscriber<Object> singleSubscriber = new SingleSubscriber<Object>() { // from class: rx.Completable.11.1
                    @Override // rx.SingleSubscriber
                    public void onError(Throwable th2) {
                        completableSubscriber.onError(th2);
                    }

                    @Override // rx.SingleSubscriber
                    public void onSuccess(Object obj) {
                        completableSubscriber.onCompleted();
                    }
                };
                completableSubscriber.onSubscribe(singleSubscriber);
                single.subscribe(singleSubscriber);
            }
        });
    }

    public static Completable merge(Completable... completableArr) {
        requireNonNull(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        return completableArr.length == 1 ? completableArr[0] : create(new CompletableOnSubscribeMergeArray(completableArr));
    }

    protected static Completable merge0(Observable<? extends Completable> observable, int i10, boolean z10) {
        requireNonNull(observable);
        if (i10 >= 1) {
            return create(new CompletableOnSubscribeMerge(observable, i10, z10));
        }
        throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i10);
    }

    public static Completable mergeDelayError(Completable... completableArr) {
        requireNonNull(completableArr);
        return create(new CompletableOnSubscribeMergeDelayErrorArray(completableArr));
    }

    public static Completable never() {
        Completable completable = NEVER;
        OnSubscribe onSubscribeOnCreate = RxJavaHooks.onCreate(completable.onSubscribe);
        return onSubscribeOnCreate == completable.onSubscribe ? completable : new Completable(onSubscribeOnCreate, false);
    }

    static <T> T requireNonNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static Completable timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, Schedulers.computation());
    }

    static NullPointerException toNpe(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    public static <R> Completable using(Func0<R> func0, Func1<? super R, ? extends Completable> func1, Action1<? super R> action1) {
        return using(func0, func1, action1, true);
    }

    public final Completable ambWith(Completable completable) {
        requireNonNull(completable);
        return amb(this, completable);
    }

    public final <T> Observable<T> andThen(Observable<T> observable) {
        requireNonNull(observable);
        return observable.delaySubscription(toObservable());
    }

    public final void await() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.14
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th2) {
                thArr[0] = th2;
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
            }
        });
        if (countDownLatch.getCount() == 0) {
            Throwable th2 = thArr[0];
            if (th2 != null) {
                Exceptions.propagate(th2);
                return;
            }
            return;
        }
        try {
            countDownLatch.await();
            Throwable th3 = thArr[0];
            if (th3 != null) {
                Exceptions.propagate(th3);
            }
        } catch (InterruptedException e10) {
            throw Exceptions.propagate(e10);
        }
    }

    public final Completable compose(Transformer transformer) {
        return (Completable) to(transformer);
    }

    public final Completable concatWith(Completable completable) {
        requireNonNull(completable);
        return concat(this, completable);
    }

    public final Completable delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, Schedulers.computation(), false);
    }

    public final Completable doAfterTerminate(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), Actions.empty(), action0, Actions.empty());
    }

    public final Completable doOnCompleted(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), action0, Actions.empty(), Actions.empty());
    }

    public final Completable doOnEach(final Action1<Notification<Object>> action1) {
        if (action1 != null) {
            return doOnLifecycle(Actions.empty(), new Action1<Throwable>() { // from class: rx.Completable.17
                @Override // rx.functions.Action1
                public void call(Throwable th2) {
                    action1.call(Notification.createOnError(th2));
                }
            }, new Action0() { // from class: rx.Completable.18
                @Override // rx.functions.Action0
                public void call() {
                    action1.call(Notification.createOnCompleted());
                }
            }, Actions.empty(), Actions.empty());
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final Completable doOnError(Action1<? super Throwable> action1) {
        return doOnLifecycle(Actions.empty(), action1, Actions.empty(), Actions.empty(), Actions.empty());
    }

    protected final Completable doOnLifecycle(Action1<? super Subscription> action1, Action1<? super Throwable> action2, Action0 action0, Action0 action3, Action0 action4) {
        requireNonNull(action1);
        requireNonNull(action2);
        requireNonNull(action0);
        requireNonNull(action3);
        requireNonNull(action4);
        return create(new AnonymousClass19(action0, action3, action2, action1, action4));
    }

    public final Completable doOnSubscribe(Action1<? super Subscription> action1) {
        return doOnLifecycle(action1, Actions.empty(), Actions.empty(), Actions.empty(), Actions.empty());
    }

    public final Completable doOnTerminate(final Action0 action0) {
        return doOnLifecycle(Actions.empty(), new Action1<Throwable>() { // from class: rx.Completable.20
            @Override // rx.functions.Action1
            public void call(Throwable th2) {
                action0.call();
            }
        }, action0, Actions.empty(), Actions.empty());
    }

    public final Completable doOnUnsubscribe(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), Actions.empty(), Actions.empty(), action0);
    }

    public final Throwable get() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.21
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th2) {
                thArr[0] = th2;
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
            }
        });
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            countDownLatch.await();
            return thArr[0];
        } catch (InterruptedException e10) {
            throw Exceptions.propagate(e10);
        }
    }

    public final Completable lift(final Operator operator) {
        requireNonNull(operator);
        return create(new OnSubscribe() { // from class: rx.Completable.23
            @Override // rx.functions.Action1
            public void call(CompletableSubscriber completableSubscriber) {
                try {
                    Completable.this.unsafeSubscribe(RxJavaHooks.onCompletableLift(operator).call(completableSubscriber));
                } catch (NullPointerException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    throw Completable.toNpe(th2);
                }
            }
        });
    }

    public final Completable mergeWith(Completable completable) {
        requireNonNull(completable);
        return merge(this, completable);
    }

    public final Completable observeOn(final Scheduler scheduler) {
        requireNonNull(scheduler);
        return create(new OnSubscribe() { // from class: rx.Completable.24
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                final SubscriptionList subscriptionList = new SubscriptionList();
                final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                subscriptionList.add(workerCreateWorker);
                completableSubscriber.onSubscribe(subscriptionList);
                Completable.this.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.24.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        workerCreateWorker.schedule(new Action0() { // from class: rx.Completable.24.1.1
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    completableSubscriber.onCompleted();
                                    subscriptionList.unsubscribe();
                                } catch (Throwable th2) {
                                    subscriptionList.unsubscribe();
                                    throw th2;
                                }
                            }
                        });
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(final Throwable th2) {
                        workerCreateWorker.schedule(new Action0() { // from class: rx.Completable.24.1.2
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    completableSubscriber.onError(th2);
                                    SubscriptionList subscriptionList2 = subscriptionList;
                                } finally {
                                    subscriptionList.unsubscribe();
                                }
                            }
                        });
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        subscriptionList.add(subscription);
                    }
                });
            }
        });
    }

    public final Completable onErrorComplete() {
        return onErrorComplete(UtilityFunctions.alwaysTrue());
    }

    public final Completable onErrorResumeNext(final Func1<? super Throwable, ? extends Completable> func1) {
        requireNonNull(func1);
        return create(new OnSubscribe() { // from class: rx.Completable.26
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                final SerialSubscription serialSubscription = new SerialSubscription();
                Completable.this.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.26.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        completableSubscriber.onCompleted();
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(Throwable th2) {
                        try {
                            Completable completable = (Completable) func1.call(th2);
                            if (completable != null) {
                                completable.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.26.1.1
                                    @Override // rx.CompletableSubscriber
                                    public void onCompleted() {
                                        completableSubscriber.onCompleted();
                                    }

                                    @Override // rx.CompletableSubscriber
                                    public void onError(Throwable th3) {
                                        completableSubscriber.onError(th3);
                                    }

                                    @Override // rx.CompletableSubscriber
                                    public void onSubscribe(Subscription subscription) {
                                        serialSubscription.set(subscription);
                                    }
                                });
                            } else {
                                int i10 = 0 & 2;
                                completableSubscriber.onError(new CompositeException(Arrays.asList(th2, new NullPointerException("The completable returned is null"))));
                            }
                        } catch (Throwable th3) {
                            completableSubscriber.onError(new CompositeException(Arrays.asList(th2, th3)));
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        serialSubscription.set(subscription);
                    }
                });
            }
        });
    }

    public final Completable repeat() {
        return fromObservable(toObservable().repeat());
    }

    public final Completable repeatWhen(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        requireNonNull(func1);
        return fromObservable(toObservable().repeatWhen(func1));
    }

    public final Completable retry() {
        return fromObservable(toObservable().retry());
    }

    public final Completable retryWhen(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return fromObservable(toObservable().retryWhen(func1));
    }

    public final Completable startWith(Completable completable) {
        requireNonNull(completable);
        return concat(completable, this);
    }

    public final Subscription subscribe() {
        final MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.27
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                multipleAssignmentSubscription.unsubscribe();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th2) {
                RxJavaHooks.onError(th2);
                multipleAssignmentSubscription.unsubscribe();
                Completable.deliverUncaughtException(th2);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                multipleAssignmentSubscription.set(subscription);
            }
        });
        return multipleAssignmentSubscription;
    }

    public final Completable subscribeOn(final Scheduler scheduler) {
        requireNonNull(scheduler);
        return create(new OnSubscribe() { // from class: rx.Completable.31
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                workerCreateWorker.schedule(new Action0() { // from class: rx.Completable.31.1
                    @Override // rx.functions.Action0
                    public void call() {
                        try {
                            Completable.this.unsafeSubscribe(completableSubscriber);
                            workerCreateWorker.unsubscribe();
                        } catch (Throwable th2) {
                            workerCreateWorker.unsubscribe();
                            throw th2;
                        }
                    }
                });
            }
        });
    }

    public final Completable timeout(long j10, TimeUnit timeUnit) {
        return timeout0(j10, timeUnit, Schedulers.computation(), null);
    }

    public final Completable timeout0(long j10, TimeUnit timeUnit, Scheduler scheduler, Completable completable) {
        requireNonNull(timeUnit);
        requireNonNull(scheduler);
        return create(new CompletableOnSubscribeTimeout(this, j10, timeUnit, scheduler, completable));
    }

    public final <R> R to(Func1<? super Completable, R> func1) {
        return func1.call(this);
    }

    public final <T> Observable<T> toObservable() {
        return Observable.create(new Observable.OnSubscribe<T>() { // from class: rx.Completable.32
            @Override // rx.functions.Action1
            public void call(Subscriber<? super T> subscriber) {
                Completable.this.unsafeSubscribe(subscriber);
            }
        });
    }

    public final <T> Single<T> toSingle(final Func0<? extends T> func0) {
        requireNonNull(func0);
        return Single.create(new Single.OnSubscribe<T>() { // from class: rx.Completable.33
            @Override // rx.functions.Action1
            public void call(final SingleSubscriber<? super T> singleSubscriber) {
                Completable.this.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.33.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        try {
                            Object objCall = func0.call();
                            if (objCall == null) {
                                singleSubscriber.onError(new NullPointerException("The value supplied is null"));
                            } else {
                                singleSubscriber.onSuccess(objCall);
                            }
                        } catch (Throwable th2) {
                            singleSubscriber.onError(th2);
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(Throwable th2) {
                        singleSubscriber.onError(th2);
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        singleSubscriber.add(subscription);
                    }
                });
            }
        });
    }

    public final <T> Single<T> toSingleDefault(final T t10) {
        requireNonNull(t10);
        return toSingle(new Func0<T>() { // from class: rx.Completable.34
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public T call() {
                return (T) t10;
            }
        });
    }

    public final void unsafeSubscribe(CompletableSubscriber completableSubscriber) {
        requireNonNull(completableSubscriber);
        try {
            RxJavaHooks.onCompletableStart(this, this.onSubscribe).call(completableSubscriber);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            Throwable thOnCompletableError = RxJavaHooks.onCompletableError(th2);
            RxJavaHooks.onError(thOnCompletableError);
            throw toNpe(thOnCompletableError);
        }
    }

    public final Completable unsubscribeOn(Scheduler scheduler) {
        requireNonNull(scheduler);
        return create(new AnonymousClass35(scheduler));
    }

    public static Completable timer(final long j10, final TimeUnit timeUnit, final Scheduler scheduler) {
        requireNonNull(timeUnit);
        requireNonNull(scheduler);
        return create(new OnSubscribe() { // from class: rx.Completable.12
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
                completableSubscriber.onSubscribe(multipleAssignmentSubscription);
                if (multipleAssignmentSubscription.isUnsubscribed()) {
                    return;
                }
                final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                multipleAssignmentSubscription.set(workerCreateWorker);
                workerCreateWorker.schedule(new Action0() { // from class: rx.Completable.12.1
                    @Override // rx.functions.Action0
                    public void call() {
                        try {
                            completableSubscriber.onCompleted();
                            workerCreateWorker.unsubscribe();
                        } catch (Throwable th2) {
                            workerCreateWorker.unsubscribe();
                            throw th2;
                        }
                    }
                }, j10, timeUnit);
            }
        });
    }

    public static <R> Completable using(final Func0<R> func0, final Func1<? super R, ? extends Completable> func1, final Action1<? super R> action1, final boolean z10) {
        requireNonNull(func0);
        requireNonNull(func1);
        requireNonNull(action1);
        return create(new OnSubscribe() { // from class: rx.Completable.13

            /* JADX INFO: renamed from: rx.Completable$13$1, reason: invalid class name */
            class AnonymousClass1 implements CompletableSubscriber {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Subscription f366741d;
                final /* synthetic */ AtomicBoolean val$once;
                final /* synthetic */ Object val$resource;
                final /* synthetic */ CompletableSubscriber val$s;

                AnonymousClass1(AtomicBoolean atomicBoolean, Object obj, CompletableSubscriber completableSubscriber) {
                    this.val$once = atomicBoolean;
                    this.val$resource = obj;
                    this.val$s = completableSubscriber;
                }

                void dispose() {
                    this.f366741d.unsubscribe();
                    if (this.val$once.compareAndSet(false, true)) {
                        try {
                            action1.call(this.val$resource);
                        } catch (Throwable th2) {
                            RxJavaHooks.onError(th2);
                        }
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    if (z10 && this.val$once.compareAndSet(false, true)) {
                        try {
                            action1.call(this.val$resource);
                        } catch (Throwable th2) {
                            this.val$s.onError(th2);
                            return;
                        }
                    }
                    this.val$s.onCompleted();
                    if (!z10) {
                        dispose();
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onError(Throwable th2) {
                    if (z10 && this.val$once.compareAndSet(false, true)) {
                        try {
                            action1.call(this.val$resource);
                        } catch (Throwable th3) {
                            th2 = new CompositeException(Arrays.asList(th2, th3));
                        }
                    }
                    this.val$s.onError(th2);
                    if (z10) {
                        return;
                    }
                    dispose();
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(Subscription subscription) {
                    this.f366741d = subscription;
                    this.val$s.onSubscribe(Subscriptions.create(new Action0() { // from class: rx.Completable.13.1.1
                        @Override // rx.functions.Action0
                        public void call() {
                            AnonymousClass1.this.dispose();
                        }
                    }));
                }
            }

            @Override // rx.functions.Action1
            public void call(CompletableSubscriber completableSubscriber) {
                try {
                    Object objCall = func0.call();
                    try {
                        Completable completable = (Completable) func1.call(objCall);
                        if (completable != null) {
                            completable.unsafeSubscribe(new AnonymousClass1(new AtomicBoolean(), objCall, completableSubscriber));
                            return;
                        }
                        try {
                            action1.call(objCall);
                            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                            completableSubscriber.onError(new NullPointerException("The completable supplied is null"));
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                            int i10 = 2 >> 0;
                            completableSubscriber.onError(new CompositeException(Arrays.asList(new NullPointerException("The completable supplied is null"), th2)));
                        }
                    } catch (Throwable th3) {
                        try {
                            action1.call(objCall);
                            Exceptions.throwIfFatal(th3);
                            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                            completableSubscriber.onError(th3);
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th3);
                            Exceptions.throwIfFatal(th4);
                            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                            completableSubscriber.onError(new CompositeException(Arrays.asList(th3, th4)));
                        }
                    }
                } catch (Throwable th5) {
                    completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                    completableSubscriber.onError(th5);
                }
            }
        });
    }

    public final Completable delay(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j10, timeUnit, scheduler, false);
    }

    public final Completable onErrorComplete(final Func1<? super Throwable, Boolean> func1) {
        requireNonNull(func1);
        return create(new OnSubscribe() { // from class: rx.Completable.25
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                Completable.this.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.25.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        completableSubscriber.onCompleted();
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(Throwable th2) {
                        boolean zBooleanValue;
                        try {
                            zBooleanValue = ((Boolean) func1.call(th2)).booleanValue();
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            CompositeException compositeException = new CompositeException(Arrays.asList(th2, th3));
                            zBooleanValue = false;
                            boolean z10 = false & false;
                            th2 = compositeException;
                        }
                        if (zBooleanValue) {
                            completableSubscriber.onCompleted();
                        } else {
                            completableSubscriber.onError(th2);
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        completableSubscriber.onSubscribe(subscription);
                    }
                });
            }
        });
    }

    public final Completable repeat(long j10) {
        return fromObservable(toObservable().repeat(j10));
    }

    public final Completable retry(Func2<Integer, Throwable, Boolean> func2) {
        return fromObservable(toObservable().retry(func2));
    }

    public final Completable timeout(long j10, TimeUnit timeUnit, Completable completable) {
        requireNonNull(completable);
        return timeout0(j10, timeUnit, Schedulers.computation(), completable);
    }

    protected Completable(OnSubscribe onSubscribe, boolean z10) {
        this.onSubscribe = z10 ? RxJavaHooks.onCreate(onSubscribe) : onSubscribe;
    }

    public static Completable error(final Throwable th2) {
        requireNonNull(th2);
        return create(new OnSubscribe() { // from class: rx.Completable.7
            @Override // rx.functions.Action1
            public void call(CompletableSubscriber completableSubscriber) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(th2);
            }
        });
    }

    public static Completable mergeDelayError(Iterable<? extends Completable> iterable) {
        requireNonNull(iterable);
        return create(new CompletableOnSubscribeMergeDelayErrorIterable(iterable));
    }

    public final <T> Single<T> andThen(Single<T> single) {
        requireNonNull(single);
        return single.delaySubscription(toObservable());
    }

    public final Completable delay(final long j10, final TimeUnit timeUnit, final Scheduler scheduler, final boolean z10) {
        requireNonNull(timeUnit);
        requireNonNull(scheduler);
        return create(new OnSubscribe() { // from class: rx.Completable.16
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                final CompositeSubscription compositeSubscription = new CompositeSubscription();
                final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                compositeSubscription.add(workerCreateWorker);
                Completable.this.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.16.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        CompositeSubscription compositeSubscription2 = compositeSubscription;
                        Scheduler.Worker worker = workerCreateWorker;
                        Action0 action0 = new Action0() { // from class: rx.Completable.16.1.1
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    completableSubscriber.onCompleted();
                                    workerCreateWorker.unsubscribe();
                                } catch (Throwable th2) {
                                    workerCreateWorker.unsubscribe();
                                    throw th2;
                                }
                            }
                        };
                        AnonymousClass16 anonymousClass16 = AnonymousClass16.this;
                        compositeSubscription2.add(worker.schedule(action0, j10, timeUnit));
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(final Throwable th2) {
                        if (!z10) {
                            completableSubscriber.onError(th2);
                            return;
                        }
                        CompositeSubscription compositeSubscription2 = compositeSubscription;
                        Scheduler.Worker worker = workerCreateWorker;
                        Action0 action0 = new Action0() { // from class: rx.Completable.16.1.2
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    completableSubscriber.onError(th2);
                                    workerCreateWorker.unsubscribe();
                                } catch (Throwable th3) {
                                    workerCreateWorker.unsubscribe();
                                    throw th3;
                                }
                            }
                        };
                        AnonymousClass16 anonymousClass16 = AnonymousClass16.this;
                        compositeSubscription2.add(worker.schedule(action0, j10, timeUnit));
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        compositeSubscription.add(subscription);
                        completableSubscriber.onSubscribe(compositeSubscription);
                    }
                });
            }
        });
    }

    public final Completable retry(long j10) {
        return fromObservable(toObservable().retry(j10));
    }

    public final <T> Observable<T> startWith(Observable<T> observable) {
        requireNonNull(observable);
        return toObservable().startWith((Observable) observable);
    }

    public final Subscription subscribe(final Action0 action0) {
        requireNonNull(action0);
        final MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.28
            boolean done;

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (this.done) {
                    return;
                }
                this.done = true;
                try {
                    action0.call();
                } catch (Throwable th2) {
                    try {
                        RxJavaHooks.onError(th2);
                        Completable.deliverUncaughtException(th2);
                    } catch (Throwable th3) {
                        multipleAssignmentSubscription.unsubscribe();
                        throw th3;
                    }
                }
                multipleAssignmentSubscription.unsubscribe();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th2) {
                RxJavaHooks.onError(th2);
                multipleAssignmentSubscription.unsubscribe();
                Completable.deliverUncaughtException(th2);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                multipleAssignmentSubscription.set(subscription);
            }
        });
        return multipleAssignmentSubscription;
    }

    public final Completable timeout(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j10, timeUnit, scheduler, null);
    }

    public static Completable mergeDelayError(Observable<? extends Completable> observable) {
        int i10 = 0 >> 1;
        return merge0(observable, Integer.MAX_VALUE, true);
    }

    public final Completable andThen(Completable completable) {
        return concatWith(completable);
    }

    public final Completable timeout(long j10, TimeUnit timeUnit, Scheduler scheduler, Completable completable) {
        requireNonNull(completable);
        return timeout0(j10, timeUnit, scheduler, completable);
    }

    public static Completable mergeDelayError(Observable<? extends Completable> observable, int i10) {
        return merge0(observable, i10, true);
    }

    public final Subscription subscribe(final Action0 action0, final Action1<? super Throwable> action1) {
        requireNonNull(action0);
        requireNonNull(action1);
        final MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.29
            boolean done;

            void callOnError(Throwable th2) {
                try {
                    action1.call(th2);
                } catch (Throwable th3) {
                    try {
                        CompositeException compositeException = new CompositeException(Arrays.asList(th2, th3));
                        RxJavaHooks.onError(compositeException);
                        Completable.deliverUncaughtException(compositeException);
                    } catch (Throwable th4) {
                        multipleAssignmentSubscription.unsubscribe();
                        throw th4;
                    }
                }
                multipleAssignmentSubscription.unsubscribe();
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (!this.done) {
                    this.done = true;
                    try {
                        action0.call();
                        multipleAssignmentSubscription.unsubscribe();
                    } catch (Throwable th2) {
                        callOnError(th2);
                    }
                }
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th2) {
                if (this.done) {
                    RxJavaHooks.onError(th2);
                    Completable.deliverUncaughtException(th2);
                } else {
                    this.done = true;
                    callOnError(th2);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                multipleAssignmentSubscription.set(subscription);
            }
        });
        return multipleAssignmentSubscription;
    }

    public static Completable amb(final Iterable<? extends Completable> iterable) {
        requireNonNull(iterable);
        return create(new OnSubscribe() { // from class: rx.Completable.4
            @Override // rx.functions.Action1
            public void call(final CompletableSubscriber completableSubscriber) {
                final CompositeSubscription compositeSubscription = new CompositeSubscription();
                completableSubscriber.onSubscribe(compositeSubscription);
                try {
                    Iterator it = iterable.iterator();
                    if (it == null) {
                        completableSubscriber.onError(new NullPointerException("The iterator returned is null"));
                        return;
                    }
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    CompletableSubscriber completableSubscriber2 = new CompletableSubscriber() { // from class: rx.Completable.4.1
                        @Override // rx.CompletableSubscriber
                        public void onCompleted() {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onCompleted();
                            }
                        }

                        @Override // rx.CompletableSubscriber
                        public void onError(Throwable th2) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                RxJavaHooks.onError(th2);
                            } else {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onError(th2);
                            }
                        }

                        @Override // rx.CompletableSubscriber
                        public void onSubscribe(Subscription subscription) {
                            compositeSubscription.add(subscription);
                        }
                    };
                    boolean z10 = true;
                    while (!atomicBoolean.get() && !compositeSubscription.isUnsubscribed()) {
                        try {
                            if (!it.hasNext()) {
                                if (z10) {
                                    completableSubscriber.onCompleted();
                                    return;
                                }
                                return;
                            }
                            if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                                return;
                            }
                            try {
                                Completable completable = (Completable) it.next();
                                if (completable == null) {
                                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                                    if (!atomicBoolean.compareAndSet(false, true)) {
                                        RxJavaHooks.onError(nullPointerException);
                                        return;
                                    } else {
                                        compositeSubscription.unsubscribe();
                                        completableSubscriber.onError(nullPointerException);
                                        return;
                                    }
                                }
                                if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                                    return;
                                }
                                completable.unsafeSubscribe(completableSubscriber2);
                                z10 = false;
                            } catch (Throwable th2) {
                                if (!atomicBoolean.compareAndSet(false, true)) {
                                    RxJavaHooks.onError(th2);
                                    return;
                                } else {
                                    compositeSubscription.unsubscribe();
                                    completableSubscriber.onError(th2);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                RxJavaHooks.onError(th3);
                                return;
                            } else {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onError(th3);
                                return;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    completableSubscriber.onError(th4);
                }
            }
        });
    }

    public static Completable concat(Iterable<? extends Completable> iterable) {
        requireNonNull(iterable);
        return create(new CompletableOnSubscribeConcatIterable(iterable));
    }

    public static Completable merge(Iterable<? extends Completable> iterable) {
        requireNonNull(iterable);
        return create(new CompletableOnSubscribeMergeIterable(iterable));
    }

    public static Completable concat(Observable<? extends Completable> observable) {
        return concat(observable, 2);
    }

    public static Completable merge(Observable<? extends Completable> observable) {
        return merge0(observable, Integer.MAX_VALUE, false);
    }

    public final Throwable get(long j10, TimeUnit timeUnit) {
        requireNonNull(timeUnit);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.22
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th2) {
                thArr[0] = th2;
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
            }
        });
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            if (countDownLatch.await(j10, timeUnit)) {
                return thArr[0];
            }
            Exceptions.propagate(new TimeoutException());
            return null;
        } catch (InterruptedException e10) {
            throw Exceptions.propagate(e10);
        }
    }

    public final <T> void unsafeSubscribe(Subscriber<T> subscriber) {
        unsafeSubscribe(subscriber, true);
    }

    public static Completable concat(Observable<? extends Completable> observable, int i10) {
        requireNonNull(observable);
        if (i10 >= 1) {
            return create(new CompletableOnSubscribeConcat(observable, i10));
        }
        throw new IllegalArgumentException("prefetch > 0 required but it was " + i10);
    }

    public static Completable merge(Observable<? extends Completable> observable, int i10) {
        return merge0(observable, i10, false);
    }

    private <T> void unsafeSubscribe(final Subscriber<T> subscriber, boolean z10) {
        requireNonNull(subscriber);
        if (z10) {
            try {
                subscriber.onStart();
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                Throwable thOnObservableError = RxJavaHooks.onObservableError(th2);
                RxJavaHooks.onError(thOnObservableError);
                throw toNpe(thOnObservableError);
            }
        }
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.30
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th3) {
                subscriber.onError(th3);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                subscriber.add(subscription);
            }
        });
        RxJavaHooks.onObservableReturn(subscriber);
    }

    public final void subscribe(CompletableSubscriber completableSubscriber) {
        if (!(completableSubscriber instanceof SafeCompletableSubscriber)) {
            completableSubscriber = new SafeCompletableSubscriber(completableSubscriber);
        }
        unsafeSubscribe(completableSubscriber);
    }

    public final boolean await(long j10, TimeUnit timeUnit) {
        Throwable th2;
        requireNonNull(timeUnit);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new CompletableSubscriber() { // from class: rx.Completable.15
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th3) {
                thArr[0] = th3;
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
            }
        });
        if (countDownLatch.getCount() == 0) {
            Throwable th3 = thArr[0];
            if (th3 != null) {
                Exceptions.propagate(th3);
            }
            return true;
        }
        try {
            boolean zAwait = countDownLatch.await(j10, timeUnit);
            if (zAwait && (th2 = thArr[0]) != null) {
                Exceptions.propagate(th2);
            }
            return zAwait;
        } catch (InterruptedException e10) {
            throw Exceptions.propagate(e10);
        }
    }

    public final <T> void subscribe(Subscriber<T> subscriber) {
        subscriber.onStart();
        if (!(subscriber instanceof SafeSubscriber)) {
            subscriber = new SafeSubscriber(subscriber);
        }
        unsafeSubscribe(subscriber, false);
    }
}
