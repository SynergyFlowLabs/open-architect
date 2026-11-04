package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableOnSubscribeConcat implements Completable.OnSubscribe {
    final int prefetch;
    final Observable<Completable> sources;

    static final class CompletableConcatSubscriber extends Subscriber<Completable> {
        final CompletableSubscriber actual;
        volatile boolean done;
        final ConcatInnerSubscriber inner;
        final AtomicBoolean once;
        final SpscArrayQueue<Completable> queue;
        final SerialSubscription sr;
        final AtomicInteger wip;

        final class ConcatInnerSubscriber implements CompletableSubscriber {
            ConcatInnerSubscriber() {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                CompletableConcatSubscriber.this.innerComplete();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th2) {
                CompletableConcatSubscriber.this.innerError(th2);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                CompletableConcatSubscriber.this.sr.set(subscription);
            }
        }

        public CompletableConcatSubscriber(CompletableSubscriber completableSubscriber, int i10) {
            this.actual = completableSubscriber;
            this.queue = new SpscArrayQueue<>(i10);
            SerialSubscription serialSubscription = new SerialSubscription();
            this.sr = serialSubscription;
            this.inner = new ConcatInnerSubscriber();
            this.wip = new AtomicInteger();
            this.once = new AtomicBoolean();
            add(serialSubscription);
            request(i10);
        }

        void innerComplete() {
            if (this.wip.decrementAndGet() != 0) {
                next();
            }
            if (this.done) {
                return;
            }
            request(1L);
        }

        void innerError(Throwable th2) {
            unsubscribe();
            onError(th2);
        }

        void next() {
            boolean z10 = this.done;
            Completable completablePoll = this.queue.poll();
            if (completablePoll != null) {
                completablePoll.unsafeSubscribe(this.inner);
            } else if (!z10) {
                RxJavaHooks.onError(new IllegalStateException("Queue is empty?!"));
            } else if (this.once.compareAndSet(false, true)) {
                this.actual.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                next();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.once.compareAndSet(false, true)) {
                this.actual.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // rx.Observer
        public void onNext(Completable completable) {
            if (!this.queue.offer(completable)) {
                onError(new MissingBackpressureException());
            } else if (this.wip.getAndIncrement() == 0) {
                next();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeConcat(Observable<? extends Completable> observable, int i10) {
        this.sources = observable;
        this.prefetch = i10;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompletableConcatSubscriber completableConcatSubscriber = new CompletableConcatSubscriber(completableSubscriber, this.prefetch);
        completableSubscriber.onSubscribe(completableConcatSubscriber);
        this.sources.subscribe((Subscriber<? super Completable>) completableConcatSubscriber);
    }
}
