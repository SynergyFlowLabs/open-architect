package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorTakeLast<T> implements Observable.Operator<T, T> {
    final int count;

    static final class TakeLastSubscriber<T> extends Subscriber<T> implements Func1<Object, T> {
        final Subscriber<? super T> actual;
        final int count;
        final AtomicLong requested = new AtomicLong();
        final ArrayDeque<Object> queue = new ArrayDeque<>();

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366769nl = NotificationLite.instance();

        public TakeLastSubscriber(Subscriber<? super T> subscriber, int i10) {
            this.actual = subscriber;
            this.count = i10;
        }

        @Override // rx.functions.Func1
        public T call(Object obj) {
            return this.f366769nl.getValue(obj);
        }

        @Override // rx.Observer
        public void onCompleted() {
            BackpressureUtils.postCompleteDone(this.requested, this.queue, this.actual, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.queue.clear();
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.queue.size() == this.count) {
                this.queue.poll();
            }
            this.queue.offer(this.f366769nl.next(t10));
        }

        void requestMore(long j10) {
            if (j10 > 0) {
                BackpressureUtils.postCompleteRequest(this.requested, j10, this.queue, this.actual, this);
            }
        }
    }

    public OperatorTakeLast(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("count cannot be negative");
        }
        this.count = i10;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final TakeLastSubscriber takeLastSubscriber = new TakeLastSubscriber(subscriber, this.count);
        subscriber.add(takeLastSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTakeLast.1
            @Override // rx.Producer
            public void request(long j10) {
                takeLastSubscriber.requestMore(j10);
            }
        });
        return takeLastSubscriber;
    }
}
