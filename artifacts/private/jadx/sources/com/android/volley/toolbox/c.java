package com.android.volley.toolbox;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f89518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f89519b;

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f89520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f89521b;

        a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f89520a = atomicReference;
            this.f89521b = countDownLatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.c.b
        public void a(IOException iOException) {
            this.f89520a.set(new C0834c(null, iOException, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
            this.f89521b.countDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.c.b
        public void b(com.android.volley.d dVar) {
            this.f89520a.set(new C0834c(null, 0 == true ? 1 : 0, dVar, 0 == true ? 1 : 0));
            this.f89521b.countDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.c.b
        public void c(n nVar) {
            this.f89520a.set(new C0834c(nVar, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
            this.f89521b.countDown();
        }
    }

    public interface b {
        void a(IOException iOException);

        void b(com.android.volley.d dVar);

        void c(n nVar);
    }

    /* JADX INFO: renamed from: com.android.volley.toolbox.c$c, reason: collision with other inner class name */
    private static class C0834c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        n f89523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IOException f89524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.android.volley.d f89525c;

        /* synthetic */ C0834c(n nVar, IOException iOException, com.android.volley.d dVar, a aVar) {
            this(nVar, iOException, dVar);
        }

        private C0834c(@p0 n nVar, @p0 IOException iOException, @p0 com.android.volley.d dVar) {
            this.f89523a = nVar;
            this.f89524b = iOException;
            this.f89525c = dVar;
        }
    }

    @Override // com.android.volley.toolbox.e
    public final n b(com.android.volley.s<?> sVar, Map<String, String> map) throws com.android.volley.d, IOException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        c(sVar, map, new a(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
            C0834c c0834c = (C0834c) atomicReference.get();
            n nVar = c0834c.f89523a;
            if (nVar != null) {
                return nVar;
            }
            IOException iOException = c0834c.f89524b;
            if (iOException != null) {
                throw iOException;
            }
            throw c0834c.f89525c;
        } catch (InterruptedException e10) {
            com.android.volley.b0.d(e10, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(e10.toString());
        }
    }

    public abstract void c(com.android.volley.s<?> sVar, Map<String, String> map, b bVar);

    protected ExecutorService d() {
        return this.f89518a;
    }

    protected ExecutorService e() {
        return this.f89519b;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        this.f89518a = executorService;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        this.f89519b = executorService;
    }
}
