package rx.internal.util;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public final class BackpressureDrainManager extends AtomicLong implements Producer {
    private static final long serialVersionUID = 2826241102729529449L;
    final BackpressureQueueCallback actual;
    boolean emitting;
    Throwable exception;
    volatile boolean terminated;

    public interface BackpressureQueueCallback {
        boolean accept(Object obj);

        void complete(Throwable th2);

        Object peek();

        Object poll();
    }

    public BackpressureDrainManager(BackpressureQueueCallback backpressureQueueCallback) {
        this.actual = backpressureQueueCallback;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0045 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x001b, B:35:0x004b, B:20:0x002b, B:33:0x0045, B:72:0x009c), top: B:89:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x009c A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x001b, B:35:0x004b, B:20:0x002b, B:33:0x0045, B:72:0x009c), top: B:89:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a4 A[LOOP:1: B:15:0x0020->B:76:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a3 A[SYNTHETIC] */
    public void drain() throws Throwable {
        Object objPoll;
        synchronized (this) {
            try {
                if (this.emitting) {
                    return;
                }
                boolean z10 = true;
                this.emitting = true;
                boolean z11 = this.terminated;
                long j10 = get();
                try {
                    BackpressureQueueCallback backpressureQueueCallback = this.actual;
                    while (true) {
                        int i10 = 0;
                        while (true) {
                            try {
                                if (j10 <= 0 && !z11) {
                                    break;
                                }
                                if (!z11) {
                                    objPoll = backpressureQueueCallback.poll();
                                    if (objPoll != null) {
                                        break;
                                    }
                                    if (backpressureQueueCallback.accept(objPoll)) {
                                        return;
                                    }
                                    j10--;
                                    i10++;
                                } else if (backpressureQueueCallback.peek() != null) {
                                    if (j10 == 0) {
                                        break;
                                    }
                                    objPoll = backpressureQueueCallback.poll();
                                    if (objPoll != null) {
                                        break;
                                    }
                                    if (backpressureQueueCallback.accept(objPoll)) {
                                        return;
                                    }
                                    j10--;
                                    i10++;
                                } else {
                                    backpressureQueueCallback.complete(this.exception);
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z10) {
                                    synchronized (this) {
                                        try {
                                            this.emitting = false;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            synchronized (this) {
                                try {
                                    z11 = this.terminated;
                                    boolean z12 = backpressureQueueCallback.peek() != null;
                                    if (get() != Long.MAX_VALUE) {
                                        long jAddAndGet = addAndGet(-i10);
                                        if ((jAddAndGet != 0 && z12) || (z11 && !z12)) {
                                            j10 = jAddAndGet;
                                        }
                                        this.emitting = false;
                                        return;
                                    }
                                    if (!z12 && !z11) {
                                        this.emitting = false;
                                        return;
                                    }
                                    j10 = Long.MAX_VALUE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    z10 = false;
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    public boolean isTerminated() {
        return this.terminated;
    }

    @Override // rx.Producer
    public void request(long j10) throws Throwable {
        boolean z10;
        long j11;
        if (j10 == 0) {
            return;
        }
        while (true) {
            long j12 = get();
            boolean z11 = true;
            z10 = j12 == 0;
            if (j12 == Long.MAX_VALUE) {
                break;
            }
            if (j10 == Long.MAX_VALUE) {
                j11 = j10;
            } else {
                j11 = j12 <= Long.MAX_VALUE - j10 ? j12 + j10 : Long.MAX_VALUE;
                z11 = z10;
            }
            if (compareAndSet(j12, j11)) {
                z10 = z11;
                break;
            }
        }
        if (z10) {
            drain();
        }
    }

    public void terminate() {
        this.terminated = true;
    }

    public void terminateAndDrain() throws Throwable {
        this.terminated = true;
        drain();
    }

    public void terminate(Throwable th2) {
        if (this.terminated) {
            return;
        }
        this.exception = th2;
        this.terminated = true;
    }

    public void terminateAndDrain(Throwable th2) throws Throwable {
        if (this.terminated) {
            return;
        }
        this.exception = th2;
        this.terminated = true;
        drain();
    }
}
