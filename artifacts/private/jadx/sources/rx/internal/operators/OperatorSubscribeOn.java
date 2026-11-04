package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorSubscribeOn<T> implements Observable.OnSubscribe<T> {
    final Scheduler scheduler;
    final Observable<T> source;

    /* JADX INFO: renamed from: rx.internal.operators.OperatorSubscribeOn$1, reason: invalid class name */
    class AnonymousClass1 implements Action0 {
        final /* synthetic */ Scheduler.Worker val$inner;
        final /* synthetic */ Subscriber val$subscriber;

        AnonymousClass1(Subscriber subscriber, Scheduler.Worker worker) {
            this.val$subscriber = subscriber;
            this.val$inner = worker;
        }

        @Override // rx.functions.Action0
        public void call() {
            final Thread threadCurrentThread = Thread.currentThread();
            OperatorSubscribeOn.this.source.unsafeSubscribe(new Subscriber<T>(this.val$subscriber) { // from class: rx.internal.operators.OperatorSubscribeOn.1.1
                @Override // rx.Observer
                public void onCompleted() {
                    try {
                        AnonymousClass1.this.val$subscriber.onCompleted();
                        AnonymousClass1.this.val$inner.unsubscribe();
                    } catch (Throwable th2) {
                        AnonymousClass1.this.val$inner.unsubscribe();
                        throw th2;
                    }
                }

                @Override // rx.Observer
                public void onError(Throwable th2) {
                    try {
                        AnonymousClass1.this.val$subscriber.onError(th2);
                        Scheduler.Worker worker = AnonymousClass1.this.val$inner;
                    } finally {
                        AnonymousClass1.this.val$inner.unsubscribe();
                    }
                }

                @Override // rx.Observer
                public void onNext(T t10) {
                    AnonymousClass1.this.val$subscriber.onNext(t10);
                }

                @Override // rx.Subscriber
                public void setProducer(final Producer producer) {
                    AnonymousClass1.this.val$subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorSubscribeOn.1.1.1
                        @Override // rx.Producer
                        public void request(final long j10) {
                            if (threadCurrentThread == Thread.currentThread()) {
                                producer.request(j10);
                            } else {
                                AnonymousClass1.this.val$inner.schedule(new Action0() { // from class: rx.internal.operators.OperatorSubscribeOn.1.1.1.1
                                    @Override // rx.functions.Action0
                                    public void call() {
                                        producer.request(j10);
                                    }
                                });
                            }
                        }
                    });
                }
            });
        }
    }

    public OperatorSubscribeOn(Observable<T> observable, Scheduler scheduler) {
        this.scheduler = scheduler;
        this.source = observable;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedule(new AnonymousClass1(subscriber, workerCreateWorker));
    }
}
