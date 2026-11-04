package rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorToObservableList<T> implements Observable.Operator<List<T>, T> {

    static final class Holder {
        static final OperatorToObservableList<Object> INSTANCE = new OperatorToObservableList<>();

        Holder() {
        }
    }

    OperatorToObservableList() {
    }

    public static <T> OperatorToObservableList<T> instance() {
        return (OperatorToObservableList<T>) Holder.INSTANCE;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super List<T>> subscriber) {
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OperatorToObservableList.1
            boolean completed;
            List<T> list = new LinkedList();

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.completed) {
                    this.completed = true;
                    try {
                        ArrayList arrayList = new ArrayList(this.list);
                        this.list = null;
                        singleDelayedProducer.setValue(arrayList);
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this);
                    }
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                if (this.completed) {
                    return;
                }
                this.list.add(t10);
            }

            @Override // rx.Subscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }
}
