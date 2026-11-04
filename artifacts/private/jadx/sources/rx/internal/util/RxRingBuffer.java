package rx.internal.util;

import java.util.Queue;
import rx.Observer;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;
import rx.internal.util.unsafe.SpmcArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes14.dex */
public class RxRingBuffer implements Subscription {
    private static final NotificationLite<Object> ON = NotificationLite.instance();
    public static final int SIZE;
    public static final ObjectPool<Queue<Object>> SPMC_POOL;
    public static final ObjectPool<Queue<Object>> SPSC_POOL;
    private final ObjectPool<Queue<Object>> pool;
    private Queue<Object> queue;
    private final int size;
    public volatile Object terminalState;

    static {
        int i10 = PlatformDependent.isAndroid() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i10 = Integer.parseInt(property);
            } catch (NumberFormatException e10) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e10.getMessage());
            }
        }
        SIZE = i10;
        SPSC_POOL = new ObjectPool<Queue<Object>>() { // from class: rx.internal.util.RxRingBuffer.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // rx.internal.util.ObjectPool
            public Queue<Object> createObject() {
                return new SpscArrayQueue(RxRingBuffer.SIZE);
            }
        };
        SPMC_POOL = new ObjectPool<Queue<Object>>() { // from class: rx.internal.util.RxRingBuffer.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // rx.internal.util.ObjectPool
            public Queue<Object> createObject() {
                return new SpmcArrayQueue(RxRingBuffer.SIZE);
            }
        };
    }

    private RxRingBuffer(Queue<Object> queue, int i10) {
        this.queue = queue;
        this.pool = null;
        this.size = i10;
    }

    public static RxRingBuffer getSpmcInstance() {
        return UnsafeAccess.isUnsafeAvailable() ? new RxRingBuffer(SPMC_POOL, SIZE) : new RxRingBuffer();
    }

    public static RxRingBuffer getSpscInstance() {
        return UnsafeAccess.isUnsafeAvailable() ? new RxRingBuffer(SPSC_POOL, SIZE) : new RxRingBuffer();
    }

    public boolean accept(Object obj, Observer observer) {
        return ON.accept(observer, obj);
    }

    public Throwable asError(Object obj) {
        return ON.getError(obj);
    }

    public int available() {
        return this.size - count();
    }

    public int capacity() {
        return this.size;
    }

    public int count() {
        Queue<Object> queue = this.queue;
        if (queue == null) {
            return 0;
        }
        return queue.size();
    }

    public Object getValue(Object obj) {
        return ON.getValue(obj);
    }

    public boolean isCompleted(Object obj) {
        return ON.isCompleted(obj);
    }

    public boolean isEmpty() {
        Queue<Object> queue = this.queue;
        return queue == null || queue.isEmpty();
    }

    public boolean isError(Object obj) {
        return ON.isError(obj);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.queue == null;
    }

    public void onCompleted() {
        if (this.terminalState == null) {
            this.terminalState = ON.completed();
        }
    }

    public void onError(Throwable th2) {
        if (this.terminalState == null) {
            this.terminalState = ON.error(th2);
        }
    }

    public void onNext(Object obj) throws MissingBackpressureException {
        boolean z10;
        boolean z11;
        synchronized (this) {
            try {
                Queue<Object> queue = this.queue;
                z10 = true;
                z11 = false;
                if (queue != null) {
                    z10 = false;
                    z11 = !queue.offer(ON.next(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z11) {
            throw new MissingBackpressureException();
        }
    }

    public Object peek() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.queue;
                if (queue == null) {
                    return null;
                }
                Object objPeek = queue.peek();
                Object obj = this.terminalState;
                if (objPeek == null && obj != null && queue.peek() == null) {
                    objPeek = obj;
                }
                return objPeek;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object poll() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.queue;
                if (queue == null) {
                    return null;
                }
                Object objPoll = queue.poll();
                Object obj = this.terminalState;
                if (objPoll == null && obj != null && queue.peek() == null) {
                    this.terminalState = null;
                    objPoll = obj;
                }
                return objPoll;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void release() {
        try {
            Queue<Object> queue = this.queue;
            ObjectPool<Queue<Object>> objectPool = this.pool;
            if (objectPool != null && queue != null) {
                queue.clear();
                this.queue = null;
                objectPool.returnObject(queue);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        release();
    }

    private RxRingBuffer(ObjectPool<Queue<Object>> objectPool, int i10) {
        this.pool = objectPool;
        this.queue = objectPool.borrowObject();
        this.size = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    RxRingBuffer() {
        int i10 = SIZE;
        this(new SynchronizedQueue(i10), i10);
    }
}
