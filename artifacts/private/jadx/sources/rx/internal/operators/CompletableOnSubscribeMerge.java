package rx.internal.operators;

import androidx.compose.animation.core.z1;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableOnSubscribeMerge implements Completable.OnSubscribe {
    final boolean delayErrors;
    final int maxConcurrency;
    final Observable<Completable> source;

    static final class CompletableMergeSubscriber extends Subscriber<Completable> {
        final CompletableSubscriber actual;
        final boolean delayErrors;
        volatile boolean done;
        final CompositeSubscription set = new CompositeSubscription();
        final AtomicInteger wip = new AtomicInteger(1);
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicReference<Queue<Throwable>> errors = new AtomicReference<>();

        public CompletableMergeSubscriber(CompletableSubscriber completableSubscriber, int i10, boolean z10) {
            this.actual = completableSubscriber;
            this.delayErrors = z10;
            if (i10 == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request(i10);
            }
        }

        Queue<Throwable> getOrCreateErrors() {
            Queue<Throwable> queue = this.errors.get();
            if (queue != null) {
                return queue;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            return z1.a(this.errors, null, concurrentLinkedQueue) ? concurrentLinkedQueue : this.errors.get();
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            terminate();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
                return;
            }
            getOrCreateErrors().offer(th2);
            this.done = true;
            terminate();
        }

        void terminate() {
            Queue<Throwable> queue;
            if (this.wip.decrementAndGet() != 0) {
                if (this.delayErrors || (queue = this.errors.get()) == null || queue.isEmpty()) {
                    return;
                }
                Throwable thCollectErrors = CompletableOnSubscribeMerge.collectErrors(queue);
                if (this.once.compareAndSet(false, true)) {
                    this.actual.onError(thCollectErrors);
                    return;
                } else {
                    RxJavaHooks.onError(thCollectErrors);
                    return;
                }
            }
            Queue<Throwable> queue2 = this.errors.get();
            if (queue2 == null || queue2.isEmpty()) {
                this.actual.onCompleted();
                return;
            }
            Throwable thCollectErrors2 = CompletableOnSubscribeMerge.collectErrors(queue2);
            if (this.once.compareAndSet(false, true)) {
                this.actual.onError(thCollectErrors2);
            } else {
                RxJavaHooks.onError(thCollectErrors2);
            }
        }

        @Override // rx.Observer
        public void onNext(Completable completable) {
            if (this.done) {
                return;
            }
            this.wip.getAndIncrement();
            completable.unsafeSubscribe(new CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Subscription f366747d;
                boolean innerDone;

                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    if (this.innerDone) {
                        return;
                    }
                    this.innerDone = true;
                    CompletableMergeSubscriber.this.set.remove(this.f366747d);
                    CompletableMergeSubscriber.this.terminate();
                    if (CompletableMergeSubscriber.this.done) {
                        return;
                    }
                    CompletableMergeSubscriber.this.request(1L);
                }

                @Override // rx.CompletableSubscriber
                public void onError(Throwable th2) {
                    if (this.innerDone) {
                        RxJavaHooks.onError(th2);
                        return;
                    }
                    this.innerDone = true;
                    CompletableMergeSubscriber.this.set.remove(this.f366747d);
                    CompletableMergeSubscriber.this.getOrCreateErrors().offer(th2);
                    CompletableMergeSubscriber.this.terminate();
                    CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                    if (completableMergeSubscriber.delayErrors && !completableMergeSubscriber.done) {
                        CompletableMergeSubscriber.this.request(1L);
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(Subscription subscription) {
                    this.f366747d = subscription;
                    CompletableMergeSubscriber.this.set.add(subscription);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeMerge(Observable<? extends Completable> observable, int i10, boolean z10) {
        this.source = observable;
        this.maxConcurrency = i10;
        this.delayErrors = z10;
    }

    public static Throwable collectErrors(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable thPoll = queue.poll();
            if (thPoll == null) {
                break;
            }
            arrayList.add(thPoll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (Throwable) arrayList.get(0) : new CompositeException(arrayList);
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompletableMergeSubscriber completableMergeSubscriber = new CompletableMergeSubscriber(completableSubscriber, this.maxConcurrency, this.delayErrors);
        completableSubscriber.onSubscribe(completableMergeSubscriber);
        this.source.subscribe((Subscriber<? super Completable>) completableMergeSubscriber);
    }
}
