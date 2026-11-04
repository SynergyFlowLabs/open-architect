package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleDoOnEvent<T> implements Single.OnSubscribe<T> {
    final Action1<Throwable> onError;
    final Action1<? super T> onSuccess;
    final Single<T> source;

    static final class SingleDoOnEventSubscriber<T> extends SingleSubscriber<T> {
        final SingleSubscriber<? super T> actual;
        final Action1<Throwable> onError;
        final Action1<? super T> onSuccess;

        SingleDoOnEventSubscriber(SingleSubscriber<? super T> singleSubscriber, Action1<? super T> action1, Action1<Throwable> action2) {
            this.actual = singleSubscriber;
            this.onSuccess = action1;
            this.onError = action2;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                this.onError.call(th2);
                this.actual.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.actual.onError(new CompositeException(th2, th3));
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t10) {
            try {
                this.onSuccess.call(t10);
                this.actual.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, t10);
            }
        }
    }

    public SingleDoOnEvent(Single<T> single, Action1<? super T> action1, Action1<Throwable> action2) {
        this.source = single;
        this.onSuccess = action1;
        this.onError = action2;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        SingleDoOnEventSubscriber singleDoOnEventSubscriber = new SingleDoOnEventSubscriber(singleSubscriber, this.onSuccess, this.onError);
        singleSubscriber.add(singleDoOnEventSubscriber);
        this.source.subscribe(singleDoOnEventSubscriber);
    }
}
