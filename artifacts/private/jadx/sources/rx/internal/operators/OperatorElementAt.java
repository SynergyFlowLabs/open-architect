package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorElementAt<T> implements Observable.Operator<T, T> {
    final T defaultValue;
    final boolean hasDefault;
    final int index;

    static class InnerProducer extends AtomicBoolean implements Producer {
        private static final long serialVersionUID = 1;
        final Producer actual;

        public InnerProducer(Producer producer) {
            this.actual = producer;
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j10 <= 0 || !compareAndSet(false, true)) {
                return;
            }
            this.actual.request(Long.MAX_VALUE);
        }
    }

    public OperatorElementAt(int i10) {
        this(i10, null, false);
    }

    public OperatorElementAt(int i10, T t10) {
        this(i10, t10, true);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OperatorElementAt.1
            private int currentIndex;

            @Override // rx.Observer
            public void onCompleted() {
                int i10 = this.currentIndex;
                OperatorElementAt operatorElementAt = OperatorElementAt.this;
                if (i10 <= operatorElementAt.index) {
                    if (operatorElementAt.hasDefault) {
                        subscriber.onNext(operatorElementAt.defaultValue);
                        subscriber.onCompleted();
                        return;
                    }
                    subscriber.onError(new IndexOutOfBoundsException(OperatorElementAt.this.index + " is out of bounds"));
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                int i10 = this.currentIndex;
                this.currentIndex = i10 + 1;
                if (i10 == OperatorElementAt.this.index) {
                    subscriber.onNext(t10);
                    subscriber.onCompleted();
                    unsubscribe();
                }
            }

            @Override // rx.Subscriber
            public void setProducer(Producer producer) {
                subscriber.setProducer(new InnerProducer(producer));
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }

    private OperatorElementAt(int i10, T t10, boolean z10) {
        if (i10 >= 0) {
            this.index = i10;
            this.defaultValue = t10;
            this.hasDefault = z10;
        } else {
            throw new IndexOutOfBoundsException(i10 + " is out of bounds");
        }
    }
}
