package io.ably.lib.http;

import io.ably.lib.types.b0;
import io.ably.lib.types.r;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class l implements AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f287392c = "io.ably.lib.http.l";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final io.ably.lib.http.e f287393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f287394b;

    private class b<T> extends d<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f287395m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f287396n;

        private String f(String str) {
            return b0.c(this.f287407f, "request_id") == null ? str : String.format(Locale.ROOT, "%s request_id=%s", str, b0.c(this.f287407f, "request_id"));
        }

        @Override // java.lang.Runnable
        public void run() {
            String strC = l.this.f287394b.f287346d.c();
            int i10 = l.this.f287394b.f287346d.a(strC) > 0 ? l.this.f287394b.f287345c.E : 0;
            while (!this.f287411j) {
                try {
                    T tB = b(strC, this.f287395m, this.f287396n);
                    this.f287403b = tB;
                    e(tB);
                    l.this.f287394b.f287346d.e(strC, true);
                } catch (io.ably.lib.types.a.C1945a e10) {
                    try {
                        i10--;
                        if (i10 < 0) {
                            r rVar = e10.f287918a;
                            rVar.f288158c = f(rVar.f288158c);
                            d(e10.f287918a);
                        } else {
                            String str = l.f287392c;
                            io.ably.lib.util.k.b(str, f("Connection failed to host `" + strC + "`. Searching for new host..."));
                            strC = l.this.f287394b.f287346d.b(strC);
                            if (strC == null) {
                                r rVar2 = e10.f287918a;
                                rVar2.f288158c = f(rVar2.f288158c);
                                d(e10.f287918a);
                            } else {
                                io.ably.lib.util.k.b(str, f("Switched to `" + strC + "`."));
                                a();
                            }
                        }
                    } catch (Throwable th2) {
                        a();
                        throw th2;
                    }
                } catch (io.ably.lib.types.a e11) {
                    r rVar3 = e11.f287918a;
                    rVar3.f288158c = f(rVar3.f288158c);
                    d(e11.f287918a);
                }
                a();
            }
        }

        private b(String str, String str2, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
            super(str2, b0VarArr, b0VarArr2, cVar, eVar, iVar);
            this.f287395m = str;
            this.f287396n = z10;
        }
    }

    private class c<T> extends d<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f287398m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f287399n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Boolean f287400o;

        @Override // java.lang.Runnable
        public void run() {
            try {
                T tB = b(this.f287398m, this.f287399n, this.f287400o.booleanValue());
                this.f287403b = tB;
                e(tB);
            } catch (io.ably.lib.types.a e10) {
                d(e10.f287918a);
            } finally {
                a();
            }
        }

        private c(String str, String str2, String str3, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
            super(str3, b0VarArr, b0VarArr2, cVar, eVar, iVar);
            this.f287398m = str;
            this.f287399n = str2;
            this.f287400o = Boolean.valueOf(z10);
        }
    }

    private abstract class d<T> implements Future<T>, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected io.ably.lib.network.j f287402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected T f287403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected r f287404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final String f287405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final b0[] f287406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final b0[] f287407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected final i.c f287408g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final i.e<T> f287409h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected final io.ably.lib.types.i<T> f287410i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected boolean f287411j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected boolean f287412k;

        protected synchronized boolean a() {
            boolean z10;
            try {
                io.ably.lib.network.j jVar = this.f287402a;
                z10 = jVar != null;
                if (z10) {
                    jVar.cancel();
                    this.f287402a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return z10;
        }

        protected T b(String str, String str2, boolean z10) throws io.ably.lib.types.a {
            return (T) l.this.f287394b.i(m.a(l.this.f287394b.f287343a, str, l.this.f287394b.f287344b, str2, this.f287407f), this.f287405d, this.f287406e, this.f287408g, this.f287409h, z10);
        }

        protected T c(URL url) throws io.ably.lib.types.a {
            return (T) l.this.f287394b.i(url, this.f287405d, this.f287406e, this.f287408g, this.f287409h, false);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            this.f287411j = true;
            return a();
        }

        protected void d(r rVar) {
            synchronized (this) {
                try {
                    this.f287404c = rVar;
                    this.f287412k = true;
                    notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            io.ably.lib.types.i<T> iVar = this.f287410i;
            if (iVar != null) {
                iVar.a(rVar);
            }
        }

        protected void e(T t10) {
            synchronized (this) {
                this.f287403b = t10;
                this.f287412k = true;
                notifyAll();
            }
            io.ably.lib.types.i<T> iVar = this.f287410i;
            if (iVar != null) {
                iVar.b(t10);
            }
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            synchronized (this) {
                while (!this.f287412k) {
                    try {
                        wait();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f287404c != null) {
                    throw new ExecutionException(io.ably.lib.types.a.a(this.f287404c));
                }
            }
            return this.f287403b;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f287411j;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f287412k;
        }

        private d(String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, io.ably.lib.types.i<T> iVar) {
            this.f287411j = false;
            this.f287412k = false;
            this.f287405d = str;
            this.f287406e = b0VarArr;
            this.f287407f = b0VarArr2;
            this.f287408g = cVar;
            this.f287409h = eVar;
            this.f287410i = iVar;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            long millis = timeUnit.toMillis(j10);
            long jCurrentTimeMillis = System.currentTimeMillis() + millis;
            synchronized (this) {
                while (millis > 0) {
                    try {
                        wait(millis);
                        if (this.f287412k) {
                            break;
                        }
                        millis = jCurrentTimeMillis - System.currentTimeMillis();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f287412k) {
                    if (this.f287404c != null) {
                        throw new ExecutionException(io.ably.lib.types.a.a(this.f287404c));
                    }
                } else {
                    throw new TimeoutException();
                }
            }
            return this.f287403b;
        }
    }

    private class e<T> extends d<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final URL f287414m;

        @Override // java.lang.Runnable
        public void run() {
            try {
                e(c(this.f287414m));
            } catch (io.ably.lib.types.a e10) {
                d(e10.f287918a);
            } finally {
                a();
            }
        }

        private e(URL url, String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, io.ably.lib.types.i<T> iVar) {
            super(str, b0VarArr, b0VarArr2, cVar, eVar, iVar);
            this.f287414m = url;
        }
    }

    protected l(i iVar, io.ably.lib.http.e eVar) {
        this.f287394b = iVar;
        this.f287393a = eVar;
    }

    public <T> Future<T> a(String str, String str2, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        b bVar = new b(str, str2, b0VarArr, b0VarArr2, cVar, eVar, z10, iVar);
        this.f287393a.execute(bVar);
        return bVar;
    }

    public <T> Future<T> b(String str, String str2, String str3, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        c cVar2 = new c(str, str2, str3, b0VarArr, b0VarArr2, cVar, eVar, z10, iVar);
        this.f287393a.execute(cVar2);
        return cVar2;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        androidx.documentfile.provider.b.a(this.f287393a);
    }

    public <T> Future<T> d(String str, b0[] b0VarArr, b0[] b0VarArr2, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        return a(str, "DELETE", b0VarArr, b0VarArr2, null, eVar, z10, iVar);
    }

    public <T> Future<T> e(String str, String str2, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        return a(str, str2, b0VarArr, b0VarArr2, cVar, eVar, z10, iVar);
    }

    public void f(Runnable runnable) {
        this.f287393a.execute(runnable);
    }

    public <T> Future<T> g(String str, b0[] b0VarArr, b0[] b0VarArr2, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        return a(str, "GET", b0VarArr, b0VarArr2, null, eVar, z10, iVar);
    }

    public <T> Future<T> h(URL url, String str, b0[] b0VarArr, i.c cVar, i.e<T> eVar, io.ably.lib.types.i<T> iVar) {
        e eVar2 = new e(url, str, b0VarArr, null, cVar, eVar, iVar);
        this.f287393a.execute(eVar2);
        return eVar2;
    }

    public <T> Future<T> j(String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        return a(str, "PATCH", b0VarArr, b0VarArr2, cVar, eVar, z10, iVar);
    }

    public <T> Future<T> l(String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        return a(str, "POST", b0VarArr, b0VarArr2, cVar, eVar, z10, iVar);
    }

    public <T> Future<T> m(String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10, io.ably.lib.types.i<T> iVar) {
        return a(str, "PUT", b0VarArr, b0VarArr2, cVar, eVar, z10, iVar);
    }
}
