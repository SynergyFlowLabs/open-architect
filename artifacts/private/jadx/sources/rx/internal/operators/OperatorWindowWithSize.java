package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.subjects.Subject;
import rx.subjects.UnicastSubject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorWindowWithSize<T> implements Observable.Operator<Observable<T>, T> {
    final int size;
    final int skip;

    static final class WindowExact<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> actual;
        final Subscription cancel;
        int index;
        final int size;
        Subject<T, T> window;
        final AtomicInteger wip = new AtomicInteger(1);

        public WindowExact(Subscriber<? super Observable<T>> subscriber, int i10) {
            this.actual = subscriber;
            this.size = i10;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.cancel = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.wip.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        Producer createProducer() {
            return new Producer() { // from class: rx.internal.operators.OperatorWindowWithSize.WindowExact.1
                @Override // rx.Producer
                public void request(long j10) {
                    if (j10 < 0) {
                        throw new IllegalArgumentException("n >= 0 required but it was " + j10);
                    }
                    if (j10 != 0) {
                        WindowExact.this.request(BackpressureUtils.multiplyCap(WindowExact.this.size, j10));
                    }
                }
            };
        }

        @Override // rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onCompleted();
            }
            this.actual.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onError(th2);
            }
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            int i10 = this.index;
            UnicastSubject unicastSubjectCreate = this.window;
            if (i10 == 0) {
                this.wip.getAndIncrement();
                unicastSubjectCreate = UnicastSubject.create(this.size, this);
                this.window = unicastSubjectCreate;
                this.actual.onNext(unicastSubjectCreate);
            }
            int i11 = i10 + 1;
            unicastSubjectCreate.onNext(t10);
            if (i11 != this.size) {
                this.index = i11;
                return;
            }
            this.index = 0;
            this.window = null;
            unicastSubjectCreate.onCompleted();
        }
    }

    static final class WindowOverlap<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> actual;
        final Subscription cancel;
        volatile boolean done;
        Throwable error;
        int index;
        int produced;
        final Queue<Subject<T, T>> queue;
        final int size;
        final int skip;
        final AtomicInteger wip = new AtomicInteger(1);
        final ArrayDeque<Subject<T, T>> windows = new ArrayDeque<>();
        final AtomicInteger drainWip = new AtomicInteger();
        final AtomicLong requested = new AtomicLong();

        final class WindowOverlapProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            WindowOverlapProducer() {
            }

            @Override // rx.Producer
            public void request(long j10) {
                if (j10 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j10);
                }
                if (j10 != 0) {
                    WindowOverlap windowOverlap = WindowOverlap.this;
                    if (get() || !compareAndSet(false, true)) {
                        WindowOverlap.this.request(BackpressureUtils.multiplyCap(windowOverlap.skip, j10));
                    } else {
                        windowOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(windowOverlap.skip, j10 - 1), windowOverlap.size));
                    }
                    BackpressureUtils.getAndAddRequest(windowOverlap.requested, j10);
                    windowOverlap.drain();
                }
            }
        }

        public WindowOverlap(Subscriber<? super Observable<T>> subscriber, int i10, int i11) {
            this.actual = subscriber;
            this.size = i10;
            this.skip = i11;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.cancel = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
            this.queue = new SpscLinkedArrayQueue((i10 + (i11 - 1)) / i11);
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.wip.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<? super Subject<T, T>> subscriber, Queue<Subject<T, T>> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (z10) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    queue.clear();
                    subscriber.onError(th2);
                    return true;
                }
                if (z11) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        Producer createProducer() {
            return new WindowOverlapProducer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain() {
            AtomicInteger atomicInteger = this.drainWip;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Observable<T>> subscriber = this.actual;
            Queue<Subject<T, T>> queue = this.queue;
            int iAddAndGet = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.done;
                    Subject<T, T> subjectPoll = queue.poll();
                    boolean z11 = subjectPoll == null;
                    if (checkTerminated(z10, z11, subscriber, queue)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(subjectPoll);
                    j11++;
                }
                if (j11 == j10 && checkTerminated(this.done, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.Observer
        public void onCompleted() {
            Iterator<Subject<T, T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            Iterator<Subject<T, T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.windows.clear();
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            int i10 = this.index;
            ArrayDeque<Subject<T, T>> arrayDeque = this.windows;
            if (i10 == 0 && !this.actual.isUnsubscribed()) {
                this.wip.getAndIncrement();
                UnicastSubject unicastSubjectCreate = UnicastSubject.create(16, this);
                arrayDeque.offer(unicastSubjectCreate);
                this.queue.offer(unicastSubjectCreate);
                drain();
            }
            Iterator<Subject<T, T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            int i11 = this.produced + 1;
            if (i11 == this.size) {
                this.produced = i11 - this.skip;
                Subject<T, T> subjectPoll = arrayDeque.poll();
                if (subjectPoll != null) {
                    subjectPoll.onCompleted();
                }
            } else {
                this.produced = i11;
            }
            int i12 = i10 + 1;
            if (i12 == this.skip) {
                this.index = 0;
            } else {
                this.index = i12;
            }
        }
    }

    static final class WindowSkip<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> actual;
        final Subscription cancel;
        int index;
        final int size;
        final int skip;
        Subject<T, T> window;
        final AtomicInteger wip = new AtomicInteger(1);

        final class WindowSkipProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            WindowSkipProducer() {
            }

            @Override // rx.Producer
            public void request(long j10) {
                if (j10 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j10);
                }
                if (j10 != 0) {
                    WindowSkip windowSkip = WindowSkip.this;
                    if (!get() && compareAndSet(false, true)) {
                        windowSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j10, windowSkip.size), BackpressureUtils.multiplyCap(windowSkip.skip - windowSkip.size, j10 - 1)));
                        return;
                    }
                    windowSkip.request(BackpressureUtils.multiplyCap(j10, windowSkip.skip));
                }
            }
        }

        public WindowSkip(Subscriber<? super Observable<T>> subscriber, int i10, int i11) {
            this.actual = subscriber;
            this.size = i10;
            this.skip = i11;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.cancel = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.wip.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        Producer createProducer() {
            return new WindowSkipProducer();
        }

        @Override // rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onCompleted();
            }
            this.actual.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onError(th2);
            }
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            int i10 = this.index;
            UnicastSubject unicastSubjectCreate = this.window;
            if (i10 == 0) {
                this.wip.getAndIncrement();
                unicastSubjectCreate = UnicastSubject.create(this.size, this);
                this.window = unicastSubjectCreate;
                this.actual.onNext(unicastSubjectCreate);
            }
            int i11 = i10 + 1;
            if (unicastSubjectCreate != null) {
                unicastSubjectCreate.onNext(t10);
            }
            if (i11 == this.size) {
                this.index = i11;
                this.window = null;
                unicastSubjectCreate.onCompleted();
            } else if (i11 == this.skip) {
                this.index = 0;
            } else {
                this.index = i11;
            }
        }
    }

    public OperatorWindowWithSize(int i10, int i11) {
        this.size = i10;
        this.skip = i11;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        int i10 = this.skip;
        int i11 = this.size;
        if (i10 == i11) {
            WindowExact windowExact = new WindowExact(subscriber, i11);
            subscriber.add(windowExact.cancel);
            subscriber.setProducer(windowExact.createProducer());
            return windowExact;
        }
        if (i10 > i11) {
            WindowSkip windowSkip = new WindowSkip(subscriber, i11, i10);
            subscriber.add(windowSkip.cancel);
            subscriber.setProducer(windowSkip.createProducer());
            return windowSkip;
        }
        WindowOverlap windowOverlap = new WindowOverlap(subscriber, i11, i10);
        subscriber.add(windowOverlap.cancel);
        subscriber.setProducer(windowOverlap.createProducer());
        return windowOverlap;
    }
}
