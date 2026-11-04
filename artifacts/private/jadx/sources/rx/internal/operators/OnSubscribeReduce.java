package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeReduce<T> implements Observable.OnSubscribe<T> {
    final Func2<T, T, T> reducer;
    final Observable<T> source;

    static final class ReduceSubscriber<T> extends Subscriber<T> {
        static final Object EMPTY = new Object();
        final Subscriber<? super T> actual;
        boolean done;
        final Func2<T, T, T> reducer;
        T value = (T) EMPTY;

        public ReduceSubscriber(Subscriber<? super T> subscriber, Func2<T, T, T> func2) {
            this.actual = subscriber;
            this.reducer = func2;
            request(0L);
        }

        void downstreamRequest(long j10) {
            if (j10 >= 0) {
                if (j10 != 0) {
                    request(Long.MAX_VALUE);
                }
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j10);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t10 = this.value;
            if (t10 == EMPTY) {
                this.actual.onError(new NoSuchElementException());
            } else {
                this.actual.onNext(t10);
                this.actual.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
            } else {
                this.done = true;
                this.actual.onError(th2);
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            T t11 = this.value;
            if (t11 == EMPTY) {
                this.value = t10;
                return;
            }
            try {
                this.value = this.reducer.call(t11, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public OnSubscribeReduce(Observable<T> observable, Func2<T, T, T> func2) {
        this.source = observable;
        this.reducer = func2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        final ReduceSubscriber reduceSubscriber = new ReduceSubscriber(subscriber, this.reducer);
        subscriber.add(reduceSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeReduce.1
            @Override // rx.Producer
            public void request(long j10) {
                reduceSubscriber.downstreamRequest(j10);
            }
        });
        this.source.unsafeSubscribe(reduceSubscriber);
    }
}
