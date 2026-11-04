package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorBufferWithSize<T> implements Observable.Operator<List<T>, T> {
    final int count;
    final int skip;

    static final class BufferExact<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> actual;
        List<T> buffer;
        final int count;

        public BufferExact(Subscriber<? super List<T>> subscriber, int i10) {
            this.actual = subscriber;
            this.count = i10;
            request(0L);
        }

        Producer createProducer() {
            return new Producer() { // from class: rx.internal.operators.OperatorBufferWithSize.BufferExact.1
                @Override // rx.Producer
                public void request(long j10) {
                    if (j10 < 0) {
                        throw new IllegalArgumentException("n >= required but it was " + j10);
                    }
                    if (j10 != 0) {
                        BufferExact.this.request(BackpressureUtils.multiplyCap(j10, BufferExact.this.count));
                    }
                }
            };
        }

        @Override // rx.Observer
        public void onCompleted() {
            List<T> list = this.buffer;
            if (list != null) {
                this.actual.onNext(list);
            }
            this.actual.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.buffer = null;
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            List arrayList = this.buffer;
            if (arrayList == null) {
                arrayList = new ArrayList(this.count);
                this.buffer = arrayList;
            }
            arrayList.add(t10);
            if (arrayList.size() == this.count) {
                this.buffer = null;
                this.actual.onNext(arrayList);
            }
        }
    }

    static final class BufferOverlap<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> actual;
        final int count;
        long index;
        long produced;
        final ArrayDeque<List<T>> queue = new ArrayDeque<>();
        final AtomicLong requested = new AtomicLong();
        final int skip;

        final class BufferOverlapProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = -4015894850868853147L;

            BufferOverlapProducer() {
            }

            @Override // rx.Producer
            public void request(long j10) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (!BackpressureUtils.postCompleteRequest(bufferOverlap.requested, j10, bufferOverlap.queue, bufferOverlap.actual) || j10 == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bufferOverlap.request(BackpressureUtils.multiplyCap(bufferOverlap.skip, j10));
                } else {
                    bufferOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bufferOverlap.skip, j10 - 1), bufferOverlap.count));
                }
            }
        }

        public BufferOverlap(Subscriber<? super List<T>> subscriber, int i10, int i11) {
            this.actual = subscriber;
            this.count = i10;
            this.skip = i11;
            request(0L);
        }

        Producer createProducer() {
            return new BufferOverlapProducer();
        }

        @Override // rx.Observer
        public void onCompleted() {
            long j10 = this.produced;
            if (j10 != 0) {
                if (j10 > this.requested.get()) {
                    this.actual.onError(new MissingBackpressureException("More produced than requested? " + j10));
                    return;
                }
                this.requested.addAndGet(-j10);
            }
            BackpressureUtils.postCompleteDone(this.requested, this.queue, this.actual);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.queue.clear();
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            long j10 = this.index;
            if (j10 == 0) {
                this.queue.offer(new ArrayList(this.count));
            }
            long j11 = j10 + 1;
            if (j11 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j11;
            }
            Iterator<List<T>> it = this.queue.iterator();
            while (it.hasNext()) {
                it.next().add(t10);
            }
            List<T> listPeek = this.queue.peek();
            if (listPeek == null || listPeek.size() != this.count) {
                return;
            }
            this.queue.poll();
            this.produced++;
            this.actual.onNext(listPeek);
        }
    }

    static final class BufferSkip<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> actual;
        List<T> buffer;
        final int count;
        long index;
        final int skip;

        final class BufferSkipProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 3428177408082367154L;

            BufferSkipProducer() {
            }

            @Override // rx.Producer
            public void request(long j10) {
                if (j10 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j10);
                }
                if (j10 != 0) {
                    BufferSkip bufferSkip = BufferSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        bufferSkip.request(BackpressureUtils.multiplyCap(j10, bufferSkip.skip));
                    } else {
                        bufferSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j10, bufferSkip.count), BackpressureUtils.multiplyCap(bufferSkip.skip - bufferSkip.count, j10 - 1)));
                    }
                }
            }
        }

        public BufferSkip(Subscriber<? super List<T>> subscriber, int i10, int i11) {
            this.actual = subscriber;
            this.count = i10;
            this.skip = i11;
            request(0L);
        }

        Producer createProducer() {
            return new BufferSkipProducer();
        }

        @Override // rx.Observer
        public void onCompleted() {
            List<T> list = this.buffer;
            if (list != null) {
                this.buffer = null;
                this.actual.onNext(list);
            }
            this.actual.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.buffer = null;
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            long j10 = this.index;
            List arrayList = this.buffer;
            if (j10 == 0) {
                arrayList = new ArrayList(this.count);
                this.buffer = arrayList;
            }
            long j11 = j10 + 1;
            if (j11 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j11;
            }
            if (arrayList != null) {
                arrayList.add(t10);
                if (arrayList.size() == this.count) {
                    this.buffer = null;
                    this.actual.onNext(arrayList);
                }
            }
        }
    }

    public OperatorBufferWithSize(int i10, int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("skip must be greater than 0");
        }
        this.count = i10;
        this.skip = i11;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        int i10 = this.skip;
        int i11 = this.count;
        if (i10 == i11) {
            BufferExact bufferExact = new BufferExact(subscriber, i11);
            subscriber.add(bufferExact);
            subscriber.setProducer(bufferExact.createProducer());
            return bufferExact;
        }
        if (i10 > i11) {
            BufferSkip bufferSkip = new BufferSkip(subscriber, i11, i10);
            subscriber.add(bufferSkip);
            subscriber.setProducer(bufferSkip.createProducer());
            return bufferSkip;
        }
        BufferOverlap bufferOverlap = new BufferOverlap(subscriber, i11, i10);
        subscriber.add(bufferOverlap);
        subscriber.setProducer(bufferOverlap.createProducer());
        return bufferOverlap;
    }
}
