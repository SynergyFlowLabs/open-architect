package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorAll<T> implements Observable.Operator<Boolean, T> {
    final Func1<? super T, Boolean> predicate;

    public OperatorAll(Func1<? super T, Boolean> func1) {
        this.predicate = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super Boolean> subscriber) {
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OperatorAll.1
            boolean done;

            @Override // rx.Observer
            public void onCompleted() {
                if (this.done) {
                    return;
                }
                this.done = true;
                singleDelayedProducer.setValue(Boolean.TRUE);
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                if (this.done) {
                    RxJavaHooks.onError(th2);
                } else {
                    this.done = true;
                    subscriber.onError(th2);
                }
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                if (!this.done) {
                    try {
                        if (!OperatorAll.this.predicate.call(t10).booleanValue()) {
                            this.done = true;
                            singleDelayedProducer.setValue(Boolean.FALSE);
                            unsubscribe();
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this, t10);
                    }
                }
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }
}
