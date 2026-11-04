package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements Producer {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2873467947112093874L;
    final Subscriber<? super T> child;
    T value;

    public SingleDelayedProducer(Subscriber<? super T> subscriber) {
        this.child = subscriber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void emit(Subscriber<? super T> subscriber, T t10) {
        if (subscriber.isUnsubscribed()) {
            return;
        }
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

    @Override // rx.Producer
    public void request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j10 == 0) {
            return;
        }
        do {
            int i10 = get();
            if (i10 != 0) {
                if (i10 == 1 && compareAndSet(1, 3)) {
                    emit(this.child, this.value);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    public void setValue(T t10) {
        do {
            int i10 = get();
            if (i10 != 0) {
                if (i10 != 2 || !compareAndSet(2, 3)) {
                    break;
                    break;
                } else {
                    emit(this.child, t10);
                    break;
                }
            }
            this.value = t10;
        } while (!compareAndSet(0, 1));
    }
}
