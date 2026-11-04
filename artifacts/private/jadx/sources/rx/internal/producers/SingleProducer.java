package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleProducer<T> extends AtomicBoolean implements Producer {
    private static final long serialVersionUID = -3353584923995471404L;
    final Subscriber<? super T> child;
    final T value;

    public SingleProducer(Subscriber<? super T> subscriber, T t10) {
        this.child = subscriber;
        this.value = t10;
    }

    @Override // rx.Producer
    public void request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j10 != 0 && compareAndSet(false, true)) {
            Subscriber<? super T> subscriber = this.child;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t10 = this.value;
            try {
                subscriber.onNext(t10);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber, t10);
            }
        }
    }
}
