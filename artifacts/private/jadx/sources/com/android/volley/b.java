package com.android.volley;

import androidx.annotation.b1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f89368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f89369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f89370c;

    class a implements InterfaceC0829b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f89371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f89372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicReference f89373c;

        a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f89371a = atomicReference;
            this.f89372b = countDownLatch;
            this.f89373c = atomicReference2;
        }

        @Override // com.android.volley.b.InterfaceC0829b
        public void a(a0 a0Var) {
            this.f89373c.set(a0Var);
            this.f89372b.countDown();
        }

        @Override // com.android.volley.b.InterfaceC0829b
        public void b(o oVar) {
            this.f89371a.set(oVar);
            this.f89372b.countDown();
        }
    }

    /* JADX INFO: renamed from: com.android.volley.b$b, reason: collision with other inner class name */
    public interface InterfaceC0829b {
        void a(a0 a0Var);

        void b(o oVar);
    }

    protected b() {
    }

    @Override // com.android.volley.l
    public o a(s<?> sVar) throws a0 {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        e(sVar, new a(atomicReference, countDownLatch, atomicReference2));
        try {
            countDownLatch.await();
            if (atomicReference.get() != null) {
                return (o) atomicReference.get();
            }
            if (atomicReference2.get() != null) {
                throw ((a0) atomicReference2.get());
            }
            throw new a0("Neither response entry was set");
        } catch (InterruptedException e10) {
            b0.d(e10, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new a0(e10);
        }
    }

    protected ExecutorService b() {
        return this.f89368a;
    }

    protected ExecutorService c() {
        return this.f89369b;
    }

    protected ScheduledExecutorService d() {
        return this.f89370c;
    }

    public abstract void e(s<?> sVar, InterfaceC0829b interfaceC0829b);

    @b1({b1.a.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        this.f89368a = executorService;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        this.f89369b = executorService;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void h(ScheduledExecutorService scheduledExecutorService) {
        this.f89370c = scheduledExecutorService;
    }
}
