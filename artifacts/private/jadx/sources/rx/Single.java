package rx;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.annotations.Beta;
import rx.annotations.Experimental;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;
import rx.internal.operators.CompletableFlatMapSingleToCompletable;
import rx.internal.operators.OnSubscribeToObservableFuture;
import rx.internal.operators.OperatorDelay;
import rx.internal.operators.OperatorDoOnSubscribe;
import rx.internal.operators.OperatorDoOnUnsubscribe;
import rx.internal.operators.OperatorObserveOn;
import rx.internal.operators.OperatorOnErrorResumeNextViaFunction;
import rx.internal.operators.OperatorTimeout;
import rx.internal.operators.SingleDoAfterTerminate;
import rx.internal.operators.SingleDoOnEvent;
import rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther;
import rx.internal.operators.SingleOnSubscribeMap;
import rx.internal.operators.SingleOnSubscribeUsing;
import rx.internal.operators.SingleOperatorOnErrorResumeNext;
import rx.internal.operators.SingleOperatorZip;
import rx.internal.producers.SingleDelayedProducer;
import rx.internal.util.ScalarSynchronousSingle;
import rx.internal.util.UtilityFunctions;
import rx.observers.SafeSubscriber;
import rx.observers.SerializedSubscriber;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;
import rx.singles.BlockingSingle;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public class Single<T> {
    final Observable.OnSubscribe<T> onSubscribe;

    public interface OnSubscribe<T> extends Action1<SingleSubscriber<? super T>> {
    }

    public interface Transformer<T, R> extends Func1<Single<T>, Single<R>> {
    }

    protected Single(OnSubscribe<T> onSubscribe) {
        final OnSubscribe onSubscribeOnCreate = RxJavaHooks.onCreate(onSubscribe);
        this.onSubscribe = new Observable.OnSubscribe<T>() { // from class: rx.Single.1
            @Override // rx.functions.Action1
            public void call(final Subscriber<? super T> subscriber) {
                final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
                subscriber.setProducer(singleDelayedProducer);
                SingleSubscriber<T> singleSubscriber = new SingleSubscriber<T>() { // from class: rx.Single.1.1
                    @Override // rx.SingleSubscriber
                    public void onError(Throwable th2) {
                        subscriber.onError(th2);
                    }

                    @Override // rx.SingleSubscriber
                    public void onSuccess(T t10) {
                        singleDelayedProducer.setValue(t10);
                    }
                };
                subscriber.add(singleSubscriber);
                onSubscribeOnCreate.call(singleSubscriber);
            }
        };
    }

    private static <T> Observable<T> asObservable(Single<T> single) {
        return Observable.create(single.onSubscribe);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.concat(asObservable(single), asObservable(single2));
    }

    public static <T> Single<T> create(OnSubscribe<T> onSubscribe) {
        return new Single<>(onSubscribe);
    }

    @Beta
    public static <T> Single<T> defer(final Callable<Single<T>> callable) {
        return create(new OnSubscribe<T>() { // from class: rx.Single.28
            @Override // rx.functions.Action1
            public void call(SingleSubscriber<? super T> singleSubscriber) {
                try {
                    ((Single) callable.call()).subscribe(singleSubscriber);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleSubscriber.onError(th2);
                }
            }
        });
    }

    public static <T> Single<T> error(final Throwable th2) {
        return create(new OnSubscribe<T>() { // from class: rx.Single.3
            @Override // rx.functions.Action1
            public void call(SingleSubscriber<? super T> singleSubscriber) {
                singleSubscriber.onError(th2);
            }
        });
    }

    public static <T> Single<T> from(Future<? extends T> future) {
        return new Single<>(OnSubscribeToObservableFuture.toObservableFuture(future));
    }

    public static <T> Single<T> fromCallable(final Callable<? extends T> callable) {
        return create(new OnSubscribe<T>() { // from class: rx.Single.4
            @Override // rx.functions.Action1
            public void call(SingleSubscriber<? super T> singleSubscriber) {
                try {
                    singleSubscriber.onSuccess((Object) callable.call());
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleSubscriber.onError(th2);
                }
            }
        });
    }

    static <T> Single<? extends T>[] iterableToArray(Iterable<? extends Single<? extends T>> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return (Single[]) collection.toArray(new Single[collection.size()]);
        }
        Single<? extends T>[] singleArr = new Single[8];
        int i10 = 0;
        for (Single<? extends T> single : iterable) {
            if (i10 == singleArr.length) {
                Single<? extends T>[] singleArr2 = new Single[(i10 >> 2) + i10];
                System.arraycopy(singleArr, 0, singleArr2, 0, i10);
                singleArr = singleArr2;
            }
            singleArr[i10] = single;
            i10++;
        }
        if (singleArr.length == i10) {
            return singleArr;
        }
        Single<? extends T>[] singleArr3 = new Single[i10];
        System.arraycopy(singleArr, 0, singleArr3, 0, i10);
        return singleArr3;
    }

    public static <T> Single<T> just(T t10) {
        return ScalarSynchronousSingle.create(t10);
    }

    public static <T> Single<T> merge(Single<? extends Single<? extends T>> single) {
        return single instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) single).scalarFlatMap(UtilityFunctions.identity()) : create(new OnSubscribe<T>() { // from class: rx.Single.5
            @Override // rx.functions.Action1
            public void call(final SingleSubscriber<? super T> singleSubscriber) {
                SingleSubscriber<Single<? extends T>> singleSubscriber2 = new SingleSubscriber<Single<? extends T>>() { // from class: rx.Single.5.1
                    @Override // rx.SingleSubscriber
                    public void onError(Throwable th2) {
                        singleSubscriber.onError(th2);
                    }

                    @Override // rx.SingleSubscriber
                    public void onSuccess(Single<? extends T> single2) {
                        single2.subscribe(singleSubscriber);
                    }
                };
                singleSubscriber.add(singleSubscriber2);
                Single.this.subscribe(singleSubscriber2);
            }
        });
    }

    @Beta
    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1) {
        return using(func0, func1, action1, false);
    }

    public static <T1, T2, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, final Func2<? super T1, ? super T2, ? extends R> func2) {
        return SingleOperatorZip.zip(new Single[]{single, single2}, new FuncN<R>() { // from class: rx.Single.6
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func2.call(objArr[0], objArr[1]);
            }
        });
    }

    public <R> Single<R> compose(Transformer<? super T, ? extends R> transformer) {
        return (Single) transformer.call(this);
    }

    public final Observable<T> concatWith(Single<? extends T> single) {
        return concat(this, single);
    }

    @Beta
    public final Single<T> delay(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return (Single<T>) lift(new OperatorDelay(j10, timeUnit, scheduler));
    }

    @Beta
    public final Single<T> delaySubscription(Observable<?> observable) {
        observable.getClass();
        return create(new SingleOnSubscribeDelaySubscriptionOther(this, observable));
    }

    @Beta
    public final Single<T> doAfterTerminate(Action0 action0) {
        return create(new SingleDoAfterTerminate(this, action0));
    }

    @Experimental
    public final Single<T> doOnEach(final Action1<Notification<? extends T>> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, new Action1<T>() { // from class: rx.Single.24
                @Override // rx.functions.Action1
                public void call(T t10) {
                    action1.call(Notification.createOnNext(t10));
                }
            }, new Action1<Throwable>() { // from class: rx.Single.25
                @Override // rx.functions.Action1
                public void call(Throwable th2) {
                    action1.call(Notification.createOnError(th2));
                }
            }));
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    @Beta
    public final Single<T> doOnError(final Action1<Throwable> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, Actions.empty(), new Action1<Throwable>() { // from class: rx.Single.23
                @Override // rx.functions.Action1
                public void call(Throwable th2) {
                    action1.call(th2);
                }
            }));
        }
        throw new IllegalArgumentException("onError is null");
    }

    @Beta
    public final Single<T> doOnSubscribe(Action0 action0) {
        return (Single<T>) lift(new OperatorDoOnSubscribe(action0));
    }

    @Experimental
    public final Single<T> doOnSuccess(final Action1<? super T> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, new Action1<T>() { // from class: rx.Single.26
                @Override // rx.functions.Action1
                public void call(T t10) {
                    action1.call(t10);
                }
            }, new Action1<Throwable>() { // from class: rx.Single.27
                @Override // rx.functions.Action1
                public void call(Throwable th2) {
                }
            }));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    @Beta
    public final Single<T> doOnUnsubscribe(Action0 action0) {
        return (Single<T>) lift(new OperatorDoOnUnsubscribe(action0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Single<R> flatMap(Func1<? super T, ? extends Single<? extends R>> func1) {
        return this instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) this).scalarFlatMap(func1) : merge(map(func1));
    }

    @Beta
    public final Completable flatMapCompletable(Func1<? super T, ? extends Completable> func1) {
        return Completable.create(new CompletableFlatMapSingleToCompletable(this, func1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> flatMapObservable(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.merge(asObservable(map(func1)));
    }

    @Beta
    public final <R> Single<R> lift(final Observable.Operator<? extends R, ? super T> operator) {
        return new Single<>(new Observable.OnSubscribe<R>() { // from class: rx.Single.2
            @Override // rx.functions.Action1
            public void call(Subscriber<? super R> subscriber) {
                try {
                    Subscriber<? super T> subscriberCall = RxJavaHooks.onSingleLift(operator).call(subscriber);
                    try {
                        subscriberCall.onStart();
                        Single.this.onSubscribe.call(subscriberCall);
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, subscriberCall);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, subscriber);
                }
            }
        });
    }

    public final <R> Single<R> map(Func1<? super T, ? extends R> func1) {
        return create(new SingleOnSubscribeMap(this, func1));
    }

    public final Observable<T> mergeWith(Single<? extends T> single) {
        return merge(this, single);
    }

    public final Single<T> observeOn(Scheduler scheduler) {
        return this instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler) : (Single<T>) lift(new OperatorObserveOn(scheduler, false));
    }

    @Beta
    public final Single<T> onErrorResumeNext(Single<? extends T> single) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withOther(this, single));
    }

    public final Single<T> onErrorReturn(Func1<Throwable, ? extends T> func1) {
        return (Single<T>) lift(OperatorOnErrorResumeNextViaFunction.withSingle(func1));
    }

    public final Single<T> retry() {
        return toObservable().retry().toSingle();
    }

    public final Single<T> retryWhen(Func1<Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return toObservable().retryWhen(func1).toSingle();
    }

    public final Subscription subscribe() {
        return subscribe((Subscriber) new Subscriber<T>() { // from class: rx.Single.14
            @Override // rx.Observer
            public final void onCompleted() {
            }

            @Override // rx.Observer
            public final void onError(Throwable th2) {
                throw new OnErrorNotImplementedException(th2);
            }

            @Override // rx.Observer
            public final void onNext(T t10) {
            }
        });
    }

    public final Single<T> subscribeOn(final Scheduler scheduler) {
        return this instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler) : create(new OnSubscribe<T>() { // from class: rx.Single.19
            @Override // rx.functions.Action1
            public void call(final SingleSubscriber<? super T> singleSubscriber) {
                final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                singleSubscriber.add(workerCreateWorker);
                workerCreateWorker.schedule(new Action0() { // from class: rx.Single.19.1
                    @Override // rx.functions.Action0
                    public void call() {
                        SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.Single.19.1.1
                            @Override // rx.SingleSubscriber
                            public void onError(Throwable th2) {
                                try {
                                    singleSubscriber.onError(th2);
                                    workerCreateWorker.unsubscribe();
                                } catch (Throwable th3) {
                                    workerCreateWorker.unsubscribe();
                                    throw th3;
                                }
                            }

                            @Override // rx.SingleSubscriber
                            public void onSuccess(T t10) {
                                try {
                                    singleSubscriber.onSuccess(t10);
                                    workerCreateWorker.unsubscribe();
                                } catch (Throwable th2) {
                                    workerCreateWorker.unsubscribe();
                                    throw th2;
                                }
                            }
                        };
                        singleSubscriber.add(singleSubscriber2);
                        Single.this.subscribe(singleSubscriber2);
                    }
                });
            }
        });
    }

    public final Single<T> takeUntil(final Completable completable) {
        return (Single<T>) lift(new Observable.Operator<T, T>() { // from class: rx.Single.20
            @Override // rx.functions.Func1
            public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
                final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
                final Subscriber<T> subscriber2 = new Subscriber<T>(serializedSubscriber, false) { // from class: rx.Single.20.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        try {
                            serializedSubscriber.onCompleted();
                            Subscriber subscriber3 = serializedSubscriber;
                        } finally {
                            serializedSubscriber.unsubscribe();
                        }
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        try {
                            serializedSubscriber.onError(th2);
                            serializedSubscriber.unsubscribe();
                        } catch (Throwable th3) {
                            serializedSubscriber.unsubscribe();
                            throw th3;
                        }
                    }

                    @Override // rx.Observer
                    public void onNext(T t10) {
                        serializedSubscriber.onNext(t10);
                    }
                };
                CompletableSubscriber completableSubscriber = new CompletableSubscriber() { // from class: rx.Single.20.2
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        onError(new CancellationException("Stream was canceled before emitting a terminal event."));
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(Throwable th2) {
                        subscriber2.onError(th2);
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(Subscription subscription) {
                        serializedSubscriber.add(subscription);
                    }
                };
                serializedSubscriber.add(subscriber2);
                subscriber.add(serializedSubscriber);
                completable.unsafeSubscribe(completableSubscriber);
                return subscriber2;
            }
        });
    }

    public final Single<T> timeout(long j10, TimeUnit timeUnit) {
        return timeout(j10, timeUnit, null, Schedulers.computation());
    }

    @Experimental
    public final <R> R to(Func1<? super Single<T>, R> func1) {
        return func1.call(this);
    }

    @Beta
    public final BlockingSingle<T> toBlocking() {
        return BlockingSingle.from(this);
    }

    @Beta
    public final Completable toCompletable() {
        return Completable.fromSingle(this);
    }

    public final Observable<T> toObservable() {
        return asObservable(this);
    }

    public final Subscription unsafeSubscribe(Subscriber<? super T> subscriber) {
        try {
            subscriber.onStart();
            RxJavaHooks.onSingleStart(this, this.onSubscribe).call(subscriber);
            return RxJavaHooks.onSingleReturn(subscriber);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            try {
                subscriber.onError(RxJavaHooks.onSingleError(th2));
                return Subscriptions.unsubscribed();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                RxJavaHooks.onSingleError(runtimeException);
                throw runtimeException;
            }
        }
    }

    public final <T2, R> Single<R> zipWith(Single<? extends T2> single, Func2<? super T, ? super T2, ? extends R> func2) {
        return zip(this, single, func2);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3));
    }

    public static <T> Single<T> from(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        return new Single<>(OnSubscribeToObservableFuture.toObservableFuture(future, j10, timeUnit));
    }

    @Beta
    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z10) {
        if (func0 == null) {
            throw new NullPointerException("resourceFactory is null");
        }
        if (func1 == null) {
            throw new NullPointerException("singleFactory is null");
        }
        if (action1 != null) {
            return create(new SingleOnSubscribeUsing(func0, func1, action1, z10));
        }
        throw new NullPointerException("disposeAction is null");
    }

    public static <T1, T2, T3, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, final Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3}, new FuncN<R>() { // from class: rx.Single.7
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func3.call(objArr[0], objArr[1], objArr[2]);
            }
        });
    }

    @Beta
    public final Single<T> delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, Schedulers.computation());
    }

    @Beta
    public final Single<T> onErrorResumeNext(Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withFunction(this, func1));
    }

    public final Single<T> retry(long j10) {
        return toObservable().retry(j10).toSingle();
    }

    public final Subscription subscribe(final Action1<? super T> action1) {
        if (action1 != null) {
            return subscribe((Subscriber) new Subscriber<T>() { // from class: rx.Single.15
                @Override // rx.Observer
                public final void onCompleted() {
                }

                @Override // rx.Observer
                public final void onError(Throwable th2) {
                    throw new OnErrorNotImplementedException(th2);
                }

                @Override // rx.Observer
                public final void onNext(T t10) {
                    action1.call(t10);
                }
            });
        }
        throw new IllegalArgumentException("onSuccess can not be null");
    }

    public final <E> Single<T> takeUntil(final Observable<? extends E> observable) {
        return (Single<T>) lift(new Observable.Operator<T, T>() { // from class: rx.Single.21
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // rx.functions.Func1
            public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
                final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
                final Subscriber<T> subscriber2 = new Subscriber<T>(serializedSubscriber, false) { // from class: rx.Single.21.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        try {
                            serializedSubscriber.onCompleted();
                            serializedSubscriber.unsubscribe();
                        } catch (Throwable th2) {
                            serializedSubscriber.unsubscribe();
                            throw th2;
                        }
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        try {
                            serializedSubscriber.onError(th2);
                        } finally {
                            serializedSubscriber.unsubscribe();
                        }
                    }

                    @Override // rx.Observer
                    public void onNext(T t10) {
                        serializedSubscriber.onNext(t10);
                    }
                };
                Subscription subscription = new Subscriber<E>() { // from class: rx.Single.21.2
                    @Override // rx.Observer
                    public void onCompleted() {
                        onError(new CancellationException("Stream was canceled before emitting a terminal event."));
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        subscriber2.onError(th2);
                    }

                    @Override // rx.Observer
                    public void onNext(E e10) {
                        onError(new CancellationException("Stream was canceled before emitting a terminal event."));
                    }
                };
                serializedSubscriber.add(subscriber2);
                serializedSubscriber.add(subscription);
                subscriber.add(serializedSubscriber);
                observable.unsafeSubscribe(subscription);
                return subscriber2;
            }
        });
    }

    public final Single<T> timeout(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout(j10, timeUnit, null, scheduler);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4));
    }

    public static <T> Single<T> from(Future<? extends T> future, Scheduler scheduler) {
        return new Single(OnSubscribeToObservableFuture.toObservableFuture(future)).subscribeOn(scheduler);
    }

    public static <T1, T2, T3, T4, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, final Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4}, new FuncN<R>() { // from class: rx.Single.8
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func4.call(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
    }

    public final Single<T> retry(Func2<Integer, Throwable, Boolean> func2) {
        return toObservable().retry(func2).toSingle();
    }

    public final <E> Single<T> takeUntil(final Single<? extends E> single) {
        return (Single<T>) lift(new Observable.Operator<T, T>() { // from class: rx.Single.22
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // rx.functions.Func1
            public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
                final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
                final Subscriber<T> subscriber2 = new Subscriber<T>(serializedSubscriber, false) { // from class: rx.Single.22.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        try {
                            serializedSubscriber.onCompleted();
                            serializedSubscriber.unsubscribe();
                        } catch (Throwable th2) {
                            serializedSubscriber.unsubscribe();
                            throw th2;
                        }
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        try {
                            serializedSubscriber.onError(th2);
                            serializedSubscriber.unsubscribe();
                        } catch (Throwable th3) {
                            serializedSubscriber.unsubscribe();
                            throw th3;
                        }
                    }

                    @Override // rx.Observer
                    public void onNext(T t10) {
                        serializedSubscriber.onNext(t10);
                    }
                };
                Subscription subscription = new SingleSubscriber<E>() { // from class: rx.Single.22.2
                    @Override // rx.SingleSubscriber
                    public void onError(Throwable th2) {
                        subscriber2.onError(th2);
                    }

                    @Override // rx.SingleSubscriber
                    public void onSuccess(E e10) {
                        onError(new CancellationException("Stream was canceled before emitting a terminal event."));
                    }
                };
                serializedSubscriber.add(subscriber2);
                serializedSubscriber.add(subscription);
                subscriber.add(serializedSubscriber);
                single.subscribe((SingleSubscriber) subscription);
                return subscriber2;
            }
        });
    }

    public final Single<T> timeout(long j10, TimeUnit timeUnit, Single<? extends T> single) {
        return timeout(j10, timeUnit, single, Schedulers.computation());
    }

    private Single(Observable.OnSubscribe<T> onSubscribe) {
        this.onSubscribe = RxJavaHooks.onCreate(onSubscribe);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.merge(asObservable(single), asObservable(single2));
    }

    public static <T1, T2, T3, T4, T5, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, final Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5}, new FuncN<R>() { // from class: rx.Single.9
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func5.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
    }

    public final Subscription subscribe(final Action1<? super T> action1, final Action1<Throwable> action2) {
        if (action1 == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (action2 != null) {
            return subscribe((Subscriber) new Subscriber<T>() { // from class: rx.Single.16
                @Override // rx.Observer
                public final void onCompleted() {
                }

                @Override // rx.Observer
                public final void onError(Throwable th2) {
                    action2.call(th2);
                }

                @Override // rx.Observer
                public final void onNext(T t10) {
                    action1.call(t10);
                }
            });
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public final Single<T> timeout(long j10, TimeUnit timeUnit, Single<? extends T> single, Scheduler scheduler) {
        if (single == null) {
            single = error(new TimeoutException());
        }
        return (Single<T>) lift(new OperatorTimeout(j10, timeUnit, asObservable(single), scheduler));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, final Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func6) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6}, new FuncN<R>() { // from class: rx.Single.10
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func6.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, final Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func7) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7}, new FuncN<R>() { // from class: rx.Single.11
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func7.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, final Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func8) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8}, new FuncN<R>() { // from class: rx.Single.12
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func8.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
    }

    public final Subscription subscribe(final Observer<? super T> observer) {
        if (observer != null) {
            return subscribe(new SingleSubscriber<T>() { // from class: rx.Single.17
                @Override // rx.SingleSubscriber
                public void onError(Throwable th2) {
                    observer.onError(th2);
                }

                @Override // rx.SingleSubscriber
                public void onSuccess(T t10) {
                    observer.onNext(t10);
                    observer.onCompleted();
                }
            });
        }
        throw new NullPointerException("observer is null");
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8), asObservable(single9));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, Single<? extends T9> single9, final Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func9) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8, single9}, new FuncN<R>() { // from class: rx.Single.13
            @Override // rx.functions.FuncN
            public R call(Object... objArr) {
                int i10 = 6 ^ 7;
                return (R) func9.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
        });
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7));
    }

    public static <R> Single<R> zip(Iterable<? extends Single<?>> iterable, FuncN<? extends R> funcN) {
        return SingleOperatorZip.zip(iterableToArray(iterable), funcN);
    }

    public final Subscription subscribe(Subscriber<? super T> subscriber) {
        if (subscriber == null) {
            throw new IllegalArgumentException("observer can not be null");
        }
        if (this.onSubscribe == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        subscriber.onStart();
        if (!(subscriber instanceof SafeSubscriber)) {
            subscriber = new SafeSubscriber(subscriber);
        }
        try {
            RxJavaHooks.onSingleStart(this, this.onSubscribe).call(subscriber);
            return RxJavaHooks.onSingleReturn(subscriber);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            try {
                subscriber.onError(RxJavaHooks.onSingleError(th2));
                return Subscriptions.empty();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                RxJavaHooks.onSingleError(runtimeException);
                throw runtimeException;
            }
        }
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8), asObservable(single9));
    }

    public final Subscription subscribe(final SingleSubscriber<? super T> singleSubscriber) {
        Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.Single.18
            @Override // rx.Observer
            public void onCompleted() {
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                singleSubscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                singleSubscriber.onSuccess(t10);
            }
        };
        singleSubscriber.add(subscriber);
        subscribe((Subscriber) subscriber);
        return subscriber;
    }
}
