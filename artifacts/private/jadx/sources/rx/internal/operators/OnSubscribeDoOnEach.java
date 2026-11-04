package rx.internal.operators;

import java.util.Arrays;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public class OnSubscribeDoOnEach<T> implements Observable.OnSubscribe<T> {
    private final Observer<? super T> doOnEachObserver;
    private final Observable<T> source;

    private static final class DoOnEachSubscriber<T> extends Subscriber<T> {
        private final Observer<? super T> doOnEachObserver;
        private boolean done;
        private final Subscriber<? super T> subscriber;

        DoOnEachSubscriber(Subscriber<? super T> subscriber, Observer<? super T> observer) {
            super(subscriber);
            this.subscriber = subscriber;
            this.doOnEachObserver = observer;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            try {
                this.doOnEachObserver.onCompleted();
                this.done = true;
                this.subscriber.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.doOnEachObserver.onError(th2);
                this.subscriber.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.subscriber.onError(new CompositeException(Arrays.asList(th2, th3)));
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                this.doOnEachObserver.onNext(t10);
                this.subscriber.onNext(t10);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, t10);
            }
        }
    }

    public OnSubscribeDoOnEach(Observable<T> observable, Observer<? super T> observer) {
        this.source = observable;
        this.doOnEachObserver = observer;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        this.source.unsafeSubscribe(new DoOnEachSubscriber(subscriber, this.doOnEachObserver));
    }
}
