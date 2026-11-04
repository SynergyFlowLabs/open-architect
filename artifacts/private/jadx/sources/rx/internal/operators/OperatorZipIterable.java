package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorZipIterable<T1, T2, R> implements Observable.Operator<R, T1> {
    final Iterable<? extends T2> iterable;
    final Func2<? super T1, ? super T2, ? extends R> zipFunction;

    public OperatorZipIterable(Iterable<? extends T2> iterable, Func2<? super T1, ? super T2, ? extends R> func2) {
        this.iterable = iterable;
        this.zipFunction = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T1> call(final Subscriber<? super R> subscriber) {
        final Iterator<? extends T2> it = this.iterable.iterator();
        try {
            if (it.hasNext()) {
                return new Subscriber<T1>(subscriber) { // from class: rx.internal.operators.OperatorZipIterable.1
                    boolean done;

                    @Override // rx.Observer
                    public void onCompleted() {
                        if (this.done) {
                            return;
                        }
                        this.done = true;
                        subscriber.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        if (this.done) {
                            Exceptions.throwIfFatal(th2);
                        } else {
                            this.done = true;
                            subscriber.onError(th2);
                        }
                    }

                    @Override // rx.Observer
                    public void onNext(T1 t10) {
                        if (this.done) {
                            return;
                        }
                        try {
                            subscriber.onNext(OperatorZipIterable.this.zipFunction.call(t10, (Object) it.next()));
                            if (it.hasNext()) {
                                return;
                            }
                            onCompleted();
                        } catch (Throwable th2) {
                            Exceptions.throwOrReport(th2, this);
                        }
                    }
                };
            }
            subscriber.onCompleted();
            return Subscribers.empty();
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
            return Subscribers.empty();
        }
    }
}
