package rx.internal.util;

import androidx.compose.animation.core.z1;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.GenericScheduledExecutorService;
import rx.internal.schedulers.SchedulerLifecycle;
import rx.internal.util.unsafe.MpmcArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ObjectPool<T> implements SchedulerLifecycle {
    final int maxSize;
    final int minSize;
    private final AtomicReference<Future<?>> periodicTask;
    Queue<T> pool;
    private final long validationInterval;

    public ObjectPool() {
        this(0, 0, 67L);
    }

    private void initialize(int i10) {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.pool = new MpmcArrayQueue(Math.max(this.maxSize, 1024));
        } else {
            this.pool = new ConcurrentLinkedQueue();
        }
        for (int i11 = 0; i11 < i10; i11++) {
            this.pool.add(createObject());
        }
    }

    public T borrowObject() {
        T tPoll = this.pool.poll();
        return tPoll == null ? createObject() : tPoll;
    }

    protected abstract T createObject();

    public void returnObject(T t10) {
        if (t10 == null) {
            return;
        }
        this.pool.offer(t10);
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        Future<?> andSet = this.periodicTask.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        while (this.periodicTask.get() == null) {
            ScheduledExecutorService genericScheduledExecutorService = GenericScheduledExecutorService.getInstance();
            try {
                Runnable runnable = new Runnable() { // from class: rx.internal.util.ObjectPool.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int size = ObjectPool.this.pool.size();
                        ObjectPool objectPool = ObjectPool.this;
                        int i10 = 0;
                        if (size < objectPool.minSize) {
                            int i11 = objectPool.maxSize - size;
                            while (i10 < i11) {
                                ObjectPool objectPool2 = ObjectPool.this;
                                objectPool2.pool.add((T) objectPool2.createObject());
                                i10++;
                            }
                            return;
                        }
                        int i12 = objectPool.maxSize;
                        if (size > i12) {
                            int i13 = size - i12;
                            while (i10 < i13) {
                                ObjectPool.this.pool.poll();
                                i10++;
                            }
                        }
                    }
                };
                long j10 = this.validationInterval;
                ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = genericScheduledExecutorService.scheduleAtFixedRate(runnable, j10, j10, TimeUnit.SECONDS);
                if (z1.a(this.periodicTask, null, scheduledFutureScheduleAtFixedRate)) {
                    return;
                } else {
                    scheduledFutureScheduleAtFixedRate.cancel(false);
                }
            } catch (RejectedExecutionException e10) {
                RxJavaHooks.onError(e10);
                return;
            }
        }
    }

    private ObjectPool(int i10, int i11, long j10) {
        this.minSize = i10;
        this.maxSize = i11;
        this.validationInterval = j10;
        this.periodicTask = new AtomicReference<>();
        initialize(i10);
        start();
    }
}
