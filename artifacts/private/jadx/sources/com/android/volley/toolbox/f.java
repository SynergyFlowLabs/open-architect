package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class f extends com.android.volley.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.android.volley.toolbox.c f89529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f89530e;

    class a implements com.android.volley.toolbox.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.android.volley.s f89531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f89532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.android.volley.b.InterfaceC0829b f89533c;

        a(com.android.volley.s sVar, long j10, com.android.volley.b.InterfaceC0829b interfaceC0829b) {
            this.f89531a = sVar;
            this.f89532b = j10;
            this.f89533c = interfaceC0829b;
        }

        @Override // com.android.volley.toolbox.c.b
        public void a(IOException iOException) {
            f.this.m(this.f89531a, this.f89533c, iOException, this.f89532b, null, null);
        }

        @Override // com.android.volley.toolbox.c.b
        public void b(com.android.volley.d dVar) {
            this.f89533c.a(dVar);
        }

        @Override // com.android.volley.toolbox.c.b
        public void c(n nVar) {
            f.this.n(this.f89531a, this.f89532b, nVar, this.f89533c);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f89535c = 4096;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private com.android.volley.toolbox.c f89536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f89537b = null;

        public b(@NonNull com.android.volley.toolbox.c cVar) {
            this.f89536a = cVar;
        }

        public f a() {
            if (this.f89537b == null) {
                this.f89537b = new h(4096);
            }
            return new f(this.f89536a, this.f89537b, null);
        }

        public b b(h hVar) {
            this.f89537b = hVar;
            return this;
        }
    }

    private class c<T> extends com.android.volley.u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.android.volley.s<T> f89538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final w.b f89539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.android.volley.b.InterfaceC0829b f89540d;

        c(com.android.volley.s<T> sVar, w.b bVar, com.android.volley.b.InterfaceC0829b interfaceC0829b) {
            super(sVar);
            this.f89538b = sVar;
            this.f89539c = bVar;
            this.f89540d = interfaceC0829b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w.a(this.f89538b, this.f89539c);
                f.this.e(this.f89538b, this.f89540d);
            } catch (com.android.volley.a0 e10) {
                this.f89540d.a(e10);
            }
        }
    }

    private class d<T> extends com.android.volley.u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InputStream f89542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        n f89543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.android.volley.s<T> f89544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.android.volley.b.InterfaceC0829b f89545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f89546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<com.android.volley.k> f89547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f89548h;

        d(InputStream inputStream, n nVar, com.android.volley.s<T> sVar, com.android.volley.b.InterfaceC0829b interfaceC0829b, long j10, List<com.android.volley.k> list, int i10) {
            super(sVar);
            this.f89542b = inputStream;
            this.f89543c = nVar;
            this.f89544d = sVar;
            this.f89545e = interfaceC0829b;
            this.f89546f = j10;
            this.f89547g = list;
            this.f89548h = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                f.this.o(this.f89546f, this.f89548h, this.f89543c, this.f89544d, this.f89545e, this.f89547g, w.c(this.f89542b, this.f89543c.c(), f.this.f89530e));
            } catch (IOException e10) {
                f.this.m(this.f89544d, this.f89545e, e10, this.f89546f, this.f89543c, null);
            }
        }
    }

    /* synthetic */ f(com.android.volley.toolbox.c cVar, h hVar, a aVar) {
        this(cVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(com.android.volley.s<?> sVar, com.android.volley.b.InterfaceC0829b interfaceC0829b, IOException iOException, long j10, @p0 n nVar, @p0 byte[] bArr) {
        try {
            b().execute(new c(sVar, w.e(sVar, iOException, j10, nVar, bArr), interfaceC0829b));
        } catch (com.android.volley.a0 e10) {
            interfaceC0829b.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(com.android.volley.s<?> sVar, long j10, n nVar, com.android.volley.b.InterfaceC0829b interfaceC0829b) {
        int iE = nVar.e();
        List<com.android.volley.k> listD = nVar.d();
        if (iE == 304) {
            interfaceC0829b.b(w.b(sVar, SystemClock.elapsedRealtime() - j10, listD));
            return;
        }
        byte[] bArrB = nVar.b();
        if (bArrB == null && nVar.a() == null) {
            bArrB = new byte[0];
        }
        byte[] bArr = bArrB;
        if (bArr != null) {
            o(j10, iE, nVar, sVar, interfaceC0829b, listD, bArr);
        } else {
            b().execute(new d(nVar.a(), nVar, sVar, interfaceC0829b, j10, listD, iE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(long j10, int i10, n nVar, com.android.volley.s<?> sVar, com.android.volley.b.InterfaceC0829b interfaceC0829b, List<com.android.volley.k> list, byte[] bArr) {
        w.d(SystemClock.elapsedRealtime() - j10, sVar, bArr, i10);
        if (i10 < 200 || i10 > 299) {
            m(sVar, interfaceC0829b, new IOException(), j10, nVar, bArr);
        } else {
            interfaceC0829b.b(new com.android.volley.o(i10, bArr, false, SystemClock.elapsedRealtime() - j10, list));
        }
    }

    @Override // com.android.volley.b
    public void e(com.android.volley.s<?> sVar, com.android.volley.b.InterfaceC0829b interfaceC0829b) {
        if (b() == null) {
            throw new IllegalStateException("mBlockingExecuter must be set before making a request");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f89529d.c(sVar, m.c(sVar.getCacheEntry()), new a(sVar, jElapsedRealtime, interfaceC0829b));
    }

    @Override // com.android.volley.b
    @b1({b1.a.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        super.f(executorService);
        this.f89529d.f(executorService);
    }

    @Override // com.android.volley.b
    @b1({b1.a.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        super.g(executorService);
        this.f89529d.g(executorService);
    }

    private f(com.android.volley.toolbox.c cVar, h hVar) {
        this.f89529d = cVar;
        this.f89530e = hVar;
    }
}
