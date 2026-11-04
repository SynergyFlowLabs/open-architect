package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorMaterialize<T> implements Observable.Operator<Notification<T>, T> {

    static final class Holder {
        static final OperatorMaterialize<Object> INSTANCE = new OperatorMaterialize<>();

        Holder() {
        }
    }

    static class ParentSubscriber<T> extends Subscriber<T> {
        private boolean busy;
        private final Subscriber<? super Notification<T>> child;
        private boolean missed;
        private final AtomicLong requested = new AtomicLong();
        private volatile Notification<T> terminalNotification;

        ParentSubscriber(Subscriber<? super Notification<T>> subscriber) {
            this.child = subscriber;
        }

        private void decrementRequested() {
            long j10;
            AtomicLong atomicLong = this.requested;
            do {
                j10 = atomicLong.get();
                if (j10 == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j10, j10 - 1));
        }

        private void drain() {
            synchronized (this) {
                try {
                    if (this.busy) {
                        this.missed = true;
                        return;
                    }
                    AtomicLong atomicLong = this.requested;
                    while (!this.child.isUnsubscribed()) {
                        Notification<T> notification = this.terminalNotification;
                        if (notification != null && atomicLong.get() > 0) {
                            this.terminalNotification = null;
                            this.child.onNext(notification);
                            if (this.child.isUnsubscribed()) {
                                break;
                            }
                            this.child.onCompleted();
                            return;
                        }
                        synchronized (this) {
                            try {
                                if (!this.missed) {
                                    this.busy = false;
                                    return;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.terminalNotification = Notification.createOnCompleted();
            drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.terminalNotification = Notification.createOnError(th2);
            RxJavaHooks.onError(th2);
            drain();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.child.onNext(Notification.createOnNext(t10));
            decrementRequested();
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(0L);
        }

        void requestMore(long j10) {
            BackpressureUtils.getAndAddRequest(this.requested, j10);
            request(j10);
            drain();
        }
    }

    OperatorMaterialize() {
    }

    public static <T> OperatorMaterialize<T> instance() {
        return (OperatorMaterialize<T>) Holder.INSTANCE;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Notification<T>> subscriber) {
        final ParentSubscriber parentSubscriber = new ParentSubscriber(subscriber);
        subscriber.add(parentSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorMaterialize.1
            @Override // rx.Producer
            public void request(long j10) {
                if (j10 > 0) {
                    parentSubscriber.requestMore(j10);
                }
            }
        });
        return parentSubscriber;
    }
}
