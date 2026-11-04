package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.l1;
import io.sentry.k4;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f48173i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f48174j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("mLock")
    private HandlerThread f48176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("mLock")
    private Handler f48177c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f48182h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48175a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler.Callback f48179e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("mLock")
    private int f48178d = 0;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                j.this.c();
                return true;
            }
            if (i10 != 1) {
                return true;
            }
            j.this.d((Runnable) message.obj);
            return true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f48184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f48185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f48186c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f48188a;

            a(Object obj) {
                this.f48188a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f48186c.a(this.f48188a);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f48184a = callable;
            this.f48185b = handler;
            this.f48186c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f48184a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f48185b.post(new a(objCall));
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f48190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f48191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f48192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f48193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Condition f48194e;

        c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f48190a = atomicReference;
            this.f48191b = callable;
            this.f48192c = reentrantLock;
            this.f48193d = atomicBoolean;
            this.f48194e = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f48190a.set(this.f48191b.call());
            } catch (Exception unused) {
            }
            this.f48192c.lock();
            try {
                this.f48193d.set(false);
                this.f48194e.signal();
                ReentrantLock reentrantLock = this.f48192c;
            } finally {
                this.f48192c.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t10);
    }

    public j(String str, int i10, int i11) {
        this.f48182h = str;
        this.f48181g = i10;
        this.f48180f = i11;
    }

    private void e(Runnable runnable) {
        synchronized (this.f48175a) {
            try {
                if (this.f48176b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f48182h, this.f48181g);
                    this.f48176b = handlerThread;
                    handlerThread.start();
                    this.f48177c = new Handler(this.f48176b.getLooper(), this.f48179e);
                    this.f48178d++;
                }
                this.f48177c.removeMessages(0);
                Handler handler = this.f48177c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    public int a() {
        int i10;
        synchronized (this.f48175a) {
            try {
                i10 = this.f48178d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @l1
    public boolean b() {
        boolean z10;
        synchronized (this.f48175a) {
            try {
                z10 = this.f48176b != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    void c() {
        synchronized (this.f48175a) {
            try {
                if (this.f48177c.hasMessages(1)) {
                    return;
                }
                this.f48176b.quit();
                this.f48176b = null;
                this.f48177c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f48175a) {
            try {
                this.f48177c.removeMessages(0);
                Handler handler = this.f48177c;
                handler.sendMessageDelayed(handler.obtainMessage(0), this.f48180f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, androidx.core.provider.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i10) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t10 = (T) atomicReference.get();
                reentrantLock.unlock();
                return t10;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t11 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t11;
                }
            } while (nanos > 0);
            throw new InterruptedException(k4.f305718l3);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
