package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorSkipUntil<T, U> implements Observable.Operator<T, T> {
    final Observable<U> other;

    public OperatorSkipUntil(Observable<U> observable) {
        this.other = observable;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        Subscriber<U> subscriber2 = new Subscriber<U>() { // from class: rx.internal.operators.OperatorSkipUntil.1
            @Override // rx.Observer
            public void onCompleted() {
                unsubscribe();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                serializedSubscriber.onError(th2);
                serializedSubscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(U u10) {
                atomicBoolean.set(true);
                unsubscribe();
            }
        };
        subscriber.add(subscriber2);
        this.other.unsafeSubscribe(subscriber2);
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipUntil.2
            @Override // rx.Observer
            public void onCompleted() {
                serializedSubscriber.onCompleted();
                unsubscribe();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                serializedSubscriber.onError(th2);
                unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                if (atomicBoolean.get()) {
                    serializedSubscriber.onNext(t10);
                } else {
                    request(1L);
                }
            }
        };
    }
}
