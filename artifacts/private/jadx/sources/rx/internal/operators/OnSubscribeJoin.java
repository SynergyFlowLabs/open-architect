package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeJoin<TLeft, TRight, TLeftDuration, TRightDuration, R> implements Observable.OnSubscribe<R> {
    final Observable<TLeft> left;
    final Func1<TLeft, Observable<TLeftDuration>> leftDurationSelector;
    final Func2<TLeft, TRight, R> resultSelector;
    final Observable<TRight> right;
    final Func1<TRight, Observable<TRightDuration>> rightDurationSelector;

    final class ResultSink extends HashMap<Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;
        boolean leftDone;
        int leftId;
        boolean rightDone;
        int rightId;
        final Subscriber<? super R> subscriber;
        final CompositeSubscription group = new CompositeSubscription();
        final Map<Integer, TRight> rightMap = new HashMap();

        final class LeftSubscriber extends Subscriber<TLeft> {

            final class LeftDurationSubscriber extends Subscriber<TLeftDuration> {

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                final int f366756id;
                boolean once = true;

                public LeftDurationSubscriber(int i10) {
                    this.f366756id = i10;
                }

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.once) {
                        this.once = false;
                        LeftSubscriber.this.expire(this.f366756id, this);
                    }
                }

                @Override // rx.Observer
                public void onError(Throwable th2) {
                    LeftSubscriber.this.onError(th2);
                }

                @Override // rx.Observer
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            LeftSubscriber() {
            }

            protected void expire(int i10, Subscription subscription) {
                boolean z10;
                synchronized (ResultSink.this) {
                    try {
                        z10 = ResultSink.this.leftMap().remove(Integer.valueOf(i10)) != null && ResultSink.this.leftMap().isEmpty() && ResultSink.this.leftDone;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z10) {
                    ResultSink.this.group.remove(subscription);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                boolean z10;
                synchronized (ResultSink.this) {
                    try {
                        ResultSink resultSink = ResultSink.this;
                        z10 = true;
                        resultSink.leftDone = true;
                        if (!resultSink.rightDone && !resultSink.leftMap().isEmpty()) {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z10) {
                    ResultSink.this.group.remove(this);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                ResultSink.this.subscriber.onError(th2);
                ResultSink.this.subscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(TLeft tleft) {
                int i10;
                ResultSink resultSink;
                int i11;
                synchronized (ResultSink.this) {
                    try {
                        ResultSink resultSink2 = ResultSink.this;
                        i10 = resultSink2.leftId;
                        resultSink2.leftId = i10 + 1;
                        resultSink2.leftMap().put(Integer.valueOf(i10), tleft);
                        resultSink = ResultSink.this;
                        i11 = resultSink.rightId;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    Observable<TLeftDuration> observableCall = OnSubscribeJoin.this.leftDurationSelector.call(tleft);
                    LeftDurationSubscriber leftDurationSubscriber = new LeftDurationSubscriber(i10);
                    ResultSink.this.group.add(leftDurationSubscriber);
                    observableCall.unsafeSubscribe(leftDurationSubscriber);
                    ArrayList arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        try {
                            for (Map.Entry<Integer, TRight> entry : ResultSink.this.rightMap.entrySet()) {
                                if (entry.getKey().intValue() < i11) {
                                    arrayList.add(entry.getValue());
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.resultSelector.call(tleft, (TRight) it.next()));
                    }
                } catch (Throwable th4) {
                    Exceptions.throwOrReport(th4, this);
                }
            }
        }

        final class RightSubscriber extends Subscriber<TRight> {

            final class RightDurationSubscriber extends Subscriber<TRightDuration> {

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                final int f366757id;
                boolean once = true;

                public RightDurationSubscriber(int i10) {
                    this.f366757id = i10;
                }

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.once) {
                        this.once = false;
                        RightSubscriber.this.expire(this.f366757id, this);
                    }
                }

                @Override // rx.Observer
                public void onError(Throwable th2) {
                    RightSubscriber.this.onError(th2);
                }

                @Override // rx.Observer
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            RightSubscriber() {
            }

            void expire(int i10, Subscription subscription) {
                boolean z10;
                synchronized (ResultSink.this) {
                    try {
                        z10 = ResultSink.this.rightMap.remove(Integer.valueOf(i10)) != null && ResultSink.this.rightMap.isEmpty() && ResultSink.this.rightDone;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z10) {
                    ResultSink.this.group.remove(subscription);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                boolean z10;
                synchronized (ResultSink.this) {
                    try {
                        ResultSink resultSink = ResultSink.this;
                        z10 = true;
                        resultSink.rightDone = true;
                        if (!resultSink.leftDone && !resultSink.rightMap.isEmpty()) {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z10) {
                    ResultSink.this.group.remove(this);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                ResultSink.this.subscriber.onError(th2);
                ResultSink.this.subscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(TRight tright) {
                int i10;
                int i11;
                synchronized (ResultSink.this) {
                    try {
                        ResultSink resultSink = ResultSink.this;
                        i10 = resultSink.rightId;
                        resultSink.rightId = i10 + 1;
                        resultSink.rightMap.put(Integer.valueOf(i10), tright);
                        i11 = ResultSink.this.leftId;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ResultSink.this.group.add(new SerialSubscription());
                try {
                    Observable<TRightDuration> observableCall = OnSubscribeJoin.this.rightDurationSelector.call(tright);
                    RightDurationSubscriber rightDurationSubscriber = new RightDurationSubscriber(i10);
                    ResultSink.this.group.add(rightDurationSubscriber);
                    observableCall.unsafeSubscribe(rightDurationSubscriber);
                    ArrayList arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        try {
                            for (Map.Entry<Integer, TLeft> entry : ResultSink.this.leftMap().entrySet()) {
                                if (entry.getKey().intValue() < i11) {
                                    arrayList.add(entry.getValue());
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.resultSelector.call((TLeft) it.next(), tright));
                    }
                } catch (Throwable th4) {
                    Exceptions.throwOrReport(th4, this);
                }
            }
        }

        public ResultSink(Subscriber<? super R> subscriber) {
            this.subscriber = subscriber;
        }

        HashMap<Integer, TLeft> leftMap() {
            return this;
        }

        public void run() {
            this.subscriber.add(this.group);
            LeftSubscriber leftSubscriber = new LeftSubscriber();
            RightSubscriber rightSubscriber = new RightSubscriber();
            this.group.add(leftSubscriber);
            this.group.add(rightSubscriber);
            OnSubscribeJoin.this.left.unsafeSubscribe(leftSubscriber);
            OnSubscribeJoin.this.right.unsafeSubscribe(rightSubscriber);
        }
    }

    public OnSubscribeJoin(Observable<TLeft> observable, Observable<TRight> observable2, Func1<TLeft, Observable<TLeftDuration>> func1, Func1<TRight, Observable<TRightDuration>> func2, Func2<TLeft, TRight, R> func3) {
        this.left = observable;
        this.right = observable2;
        this.leftDurationSelector = func1;
        this.rightDurationSelector = func2;
        this.resultSelector = func3;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        new ResultSink(new SerializedSubscriber(subscriber)).run();
    }
}
