package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public class OperatorSkipLast<T> implements Observable.Operator<T, T> {
    final int count;

    public OperatorSkipLast(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.count = i10;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipLast.1
            private final NotificationLite<T> on = NotificationLite.instance();
            private final Deque<Object> deque = new ArrayDeque();

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                if (OperatorSkipLast.this.count == 0) {
                    subscriber.onNext(t10);
                    return;
                }
                if (this.deque.size() == OperatorSkipLast.this.count) {
                    subscriber.onNext(this.on.getValue(this.deque.removeFirst()));
                } else {
                    request(1L);
                }
                this.deque.offerLast(this.on.next(t10));
            }
        };
    }
}
