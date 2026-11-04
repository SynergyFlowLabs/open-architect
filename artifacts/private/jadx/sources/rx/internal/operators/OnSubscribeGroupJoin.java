package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.PublishSubject;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.RefCountSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeGroupJoin<T1, T2, D1, D2, R> implements Observable.OnSubscribe<R> {
    final Observable<T1> left;
    final Func1<? super T1, ? extends Observable<D1>> leftDuration;
    final Func2<? super T1, ? super Observable<T2>, ? extends R> resultSelector;
    final Observable<T2> right;
    final Func1<? super T2, ? extends Observable<D2>> rightDuration;

    final class ResultManager extends HashMap<Integer, Observer<T2>> implements Subscription {
        private static final long serialVersionUID = -3035156013812425335L;
        final RefCountSubscription cancel;
        final CompositeSubscription group;
        boolean leftDone;
        int leftIds;
        boolean rightDone;
        int rightIds;
        final Map<Integer, T2> rightMap = new HashMap();
        final Subscriber<? super R> subscriber;

        final class LeftDurationObserver extends Subscriber<D1> {

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            final int f366754id;
            boolean once = true;

            public LeftDurationObserver(int i10) {
                this.f366754id = i10;
            }

            @Override // rx.Observer
            public void onCompleted() {
                Observer<T2> observerRemove;
                if (this.once) {
                    this.once = false;
                    synchronized (ResultManager.this) {
                        try {
                            observerRemove = ResultManager.this.leftMap().remove(Integer.valueOf(this.f366754id));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (observerRemove != null) {
                        observerRemove.onCompleted();
                    }
                    ResultManager.this.group.remove(this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorMain(th2);
            }

            @Override // rx.Observer
            public void onNext(D1 d10) {
                onCompleted();
            }
        }

        final class LeftObserver extends Subscriber<T1> {
            LeftObserver() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    try {
                        ResultManager resultManager = ResultManager.this;
                        resultManager.leftDone = true;
                        if (resultManager.rightDone) {
                            arrayList = new ArrayList(ResultManager.this.leftMap().values());
                            ResultManager.this.leftMap().clear();
                            ResultManager.this.rightMap.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorAll(th2);
            }

            @Override // rx.Observer
            public void onNext(T1 t10) {
                int i10;
                ArrayList arrayList;
                try {
                    PublishSubject publishSubjectCreate = PublishSubject.create();
                    SerializedObserver serializedObserver = new SerializedObserver(publishSubjectCreate);
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i10 = resultManager.leftIds;
                        resultManager.leftIds = i10 + 1;
                        resultManager.leftMap().put(Integer.valueOf(i10), serializedObserver);
                    }
                    Observable observableCreate = Observable.create(new WindowObservableFunc(publishSubjectCreate, ResultManager.this.cancel));
                    Observable<D1> observableCall = OnSubscribeGroupJoin.this.leftDuration.call(t10);
                    LeftDurationObserver leftDurationObserver = ResultManager.this.new LeftDurationObserver(i10);
                    ResultManager.this.group.add(leftDurationObserver);
                    observableCall.unsafeSubscribe(leftDurationObserver);
                    R rCall = OnSubscribeGroupJoin.this.resultSelector.call(t10, observableCreate);
                    synchronized (ResultManager.this) {
                        try {
                            arrayList = new ArrayList(ResultManager.this.rightMap.values());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ResultManager.this.subscriber.onNext(rCall);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        serializedObserver.onNext(it.next());
                    }
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, this);
                }
            }
        }

        final class RightDurationObserver extends Subscriber<D2> {

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            final int f366755id;
            boolean once = true;

            public RightDurationObserver(int i10) {
                this.f366755id = i10;
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.once) {
                    this.once = false;
                    synchronized (ResultManager.this) {
                        ResultManager.this.rightMap.remove(Integer.valueOf(this.f366755id));
                    }
                    ResultManager.this.group.remove(this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorMain(th2);
            }

            @Override // rx.Observer
            public void onNext(D2 d10) {
                onCompleted();
            }
        }

        final class RightObserver extends Subscriber<T2> {
            RightObserver() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    try {
                        ResultManager resultManager = ResultManager.this;
                        resultManager.rightDone = true;
                        if (resultManager.leftDone) {
                            arrayList = new ArrayList(ResultManager.this.leftMap().values());
                            ResultManager.this.leftMap().clear();
                            ResultManager.this.rightMap.clear();
                        } else {
                            arrayList = null;
                        }
                    } finally {
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorAll(th2);
            }

            @Override // rx.Observer
            public void onNext(T2 t10) {
                int i10;
                ArrayList arrayList;
                try {
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i10 = resultManager.rightIds;
                        resultManager.rightIds = i10 + 1;
                        resultManager.rightMap.put(Integer.valueOf(i10), t10);
                    }
                    Observable<D2> observableCall = OnSubscribeGroupJoin.this.rightDuration.call(t10);
                    RightDurationObserver rightDurationObserver = ResultManager.this.new RightDurationObserver(i10);
                    ResultManager.this.group.add(rightDurationObserver);
                    observableCall.unsafeSubscribe(rightDurationObserver);
                    synchronized (ResultManager.this) {
                        try {
                            arrayList = new ArrayList(ResultManager.this.leftMap().values());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Observer) it.next()).onNext(t10);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, this);
                }
            }
        }

        public ResultManager(Subscriber<? super R> subscriber) {
            this.subscriber = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.group = compositeSubscription;
            this.cancel = new RefCountSubscription(compositeSubscription);
        }

        void complete(List<Observer<T2>> list) {
            if (list != null) {
                Iterator<Observer<T2>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onCompleted();
                }
                this.subscriber.onCompleted();
                this.cancel.unsubscribe();
            }
        }

        void errorAll(Throwable th2) {
            ArrayList arrayList;
            synchronized (this) {
                try {
                    arrayList = new ArrayList(leftMap().values());
                    leftMap().clear();
                    this.rightMap.clear();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Observer) it.next()).onError(th2);
            }
            this.subscriber.onError(th2);
            this.cancel.unsubscribe();
        }

        void errorMain(Throwable th2) {
            synchronized (this) {
                try {
                    leftMap().clear();
                    this.rightMap.clear();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.subscriber.onError(th2);
            this.cancel.unsubscribe();
        }

        public void init() {
            LeftObserver leftObserver = new LeftObserver();
            RightObserver rightObserver = new RightObserver();
            this.group.add(leftObserver);
            this.group.add(rightObserver);
            OnSubscribeGroupJoin.this.left.unsafeSubscribe(leftObserver);
            OnSubscribeGroupJoin.this.right.unsafeSubscribe(rightObserver);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancel.isUnsubscribed();
        }

        Map<Integer, Observer<T2>> leftMap() {
            return this;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.cancel.unsubscribe();
        }
    }

    static final class WindowObservableFunc<T> implements Observable.OnSubscribe<T> {
        final RefCountSubscription refCount;
        final Observable<T> underlying;

        final class WindowSubscriber extends Subscriber<T> {
            private final Subscription ref;
            final Subscriber<? super T> subscriber;

            public WindowSubscriber(Subscriber<? super T> subscriber, Subscription subscription) {
                super(subscriber);
                this.subscriber = subscriber;
                this.ref = subscription;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.subscriber.onCompleted();
                this.ref.unsubscribe();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                this.subscriber.onError(th2);
                this.ref.unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                this.subscriber.onNext(t10);
            }
        }

        public WindowObservableFunc(Observable<T> observable, RefCountSubscription refCountSubscription) {
            this.refCount = refCountSubscription;
            this.underlying = observable;
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            Subscription subscription = this.refCount.get();
            WindowSubscriber windowSubscriber = new WindowSubscriber(subscriber, subscription);
            windowSubscriber.add(subscription);
            this.underlying.unsafeSubscribe(windowSubscriber);
        }
    }

    public OnSubscribeGroupJoin(Observable<T1> observable, Observable<T2> observable2, Func1<? super T1, ? extends Observable<D1>> func1, Func1<? super T2, ? extends Observable<D2>> func2, Func2<? super T1, ? super Observable<T2>, ? extends R> func3) {
        this.left = observable;
        this.right = observable2;
        this.leftDuration = func1;
        this.rightDuration = func2;
        this.resultSelector = func3;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        ResultManager resultManager = new ResultManager(new SerializedSubscriber(subscriber));
        subscriber.add(resultManager);
        resultManager.init();
    }
}
