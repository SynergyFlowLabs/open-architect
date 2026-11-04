package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.StreamKey;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.q0;
import androidx.media3.exoplayer.offline.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class d0<M extends z<M>> implements x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f64429l = 20000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f64430m = 131072;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.x f64431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.q.a<M> f64432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<StreamKey> f64433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.datasource.cache.c.d f64434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.datasource.cache.a f64435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.datasource.cache.h f64436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final androidx.media3.common.b1 f64437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f64438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f64439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayList<q0<?, ?>> f64440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f64441k;

    class a extends q0<M, IOException> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.media3.datasource.p f64442h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.media3.datasource.x f64443i;

        a(androidx.media3.datasource.p pVar, androidx.media3.datasource.x xVar) {
            this.f64442h = pVar;
            this.f64443i = xVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.media3.common.util.q0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public M d() throws IOException {
            return (M) androidx.media3.exoplayer.upstream.q.h(this.f64442h, d0.this.f64432b, this.f64443i, 4);
        }
    }

    private static final class b implements androidx.media3.datasource.cache.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x.a f64445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f64446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f64447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f64448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f64449e;

        public b(x.a aVar, long j10, int i10, long j11, int i11) {
            this.f64445a = aVar;
            this.f64446b = j10;
            this.f64447c = i10;
            this.f64448d = j11;
            this.f64449e = i11;
        }

        private float b() {
            float f10;
            float f11;
            long j10 = this.f64446b;
            if (j10 == -1 || j10 == 0) {
                int i10 = this.f64447c;
                if (i10 == 0) {
                    return -1.0f;
                }
                f10 = this.f64449e * 100.0f;
                f11 = i10;
            } else {
                f10 = this.f64448d * 100.0f;
                f11 = j10;
            }
            return f10 / f11;
        }

        @Override // androidx.media3.datasource.cache.j.a
        public void a(long j10, long j11, long j12) {
            long j13 = this.f64448d + j12;
            this.f64448d = j13;
            this.f64445a.a(this.f64446b, j13, b());
        }

        public void c() {
            this.f64449e++;
            this.f64445a.a(this.f64446b, this.f64448d, b());
        }
    }

    protected static class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.datasource.x f64451b;

        public c(long j10, androidx.media3.datasource.x xVar) {
            this.f64450a = j10;
            this.f64451b = xVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return k1.u(this.f64450a, cVar.f64450a);
        }
    }

    private static final class d extends q0<Void, IOException> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c f64452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.media3.datasource.cache.c f64453i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private final b f64454j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final byte[] f64455k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final androidx.media3.datasource.cache.j f64456l;

        public d(c cVar, androidx.media3.datasource.cache.c cVar2, @p0 b bVar, byte[] bArr) {
            this.f64452h = cVar;
            this.f64453i = cVar2;
            this.f64454j = bVar;
            this.f64455k = bArr;
            this.f64456l = new androidx.media3.datasource.cache.j(cVar2, cVar.f64451b, bArr, bVar);
        }

        @Override // androidx.media3.common.util.q0
        protected void c() {
            this.f64456l.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.media3.common.util.q0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            this.f64456l.a();
            b bVar = this.f64454j;
            if (bVar != null) {
                bVar.c();
            }
            return null;
        }
    }

    @Deprecated
    public d0(k0 k0Var, androidx.media3.exoplayer.upstream.q.a<M> aVar, androidx.media3.datasource.cache.c.d dVar, Executor executor) {
        this(k0Var, aVar, dVar, executor, 20000L);
    }

    private <T> void c(q0<T, ?> q0Var) throws InterruptedException {
        synchronized (this.f64440j) {
            try {
                if (this.f64441k) {
                    throw new InterruptedException();
                }
                this.f64440j.add(q0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean d(androidx.media3.datasource.x xVar, androidx.media3.datasource.x xVar2) {
        if (!xVar.f62594a.equals(xVar2.f62594a)) {
            return false;
        }
        long j10 = xVar.f62601h;
        return j10 != -1 && xVar.f62600g + j10 == xVar2.f62600g && Objects.equals(xVar.f62602i, xVar2.f62602i) && xVar.f62603j == xVar2.f62603j && xVar.f62596c == xVar2.f62596c && xVar.f62598e.equals(xVar2.f62598e);
    }

    protected static androidx.media3.datasource.x f(Uri uri) {
        return new androidx.media3.datasource.x.b().j(uri).c(1).a();
    }

    private static void i(List<c> list, androidx.media3.datasource.cache.h hVar, long j10) {
        HashMap map = new HashMap();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            String strB = hVar.b(cVar.f64451b);
            Integer num = (Integer) map.get(strB);
            c cVar2 = num == null ? null : list.get(num.intValue());
            if (cVar2 == null || cVar.f64450a > cVar2.f64450a + j10 || !d(cVar2.f64451b, cVar.f64451b)) {
                map.put(strB, Integer.valueOf(i10));
                list.set(i10, cVar);
                i10++;
            } else {
                long j11 = cVar.f64451b.f62601h;
                list.set(((Integer) androidx.media3.common.util.a.g(num)).intValue(), new c(cVar2.f64450a, cVar2.f64451b.f(0L, j11 != -1 ? cVar2.f64451b.f62601h + j11 : -1L)));
            }
        }
        k1.T1(list, i10, list.size());
    }

    private void j(int i10) {
        synchronized (this.f64440j) {
            try {
                this.f64440j.remove(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k(q0<?, ?> q0Var) {
        synchronized (this.f64440j) {
            this.f64440j.remove(q0Var);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0034 */
    @Override // androidx.media3.exoplayer.offline.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@androidx.annotation.p0 androidx.media3.exoplayer.offline.x.a r27) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.d0.a(androidx.media3.exoplayer.offline.x$a):void");
    }

    @Override // androidx.media3.exoplayer.offline.x
    public void cancel() {
        synchronized (this.f64440j) {
            try {
                this.f64441k = true;
                for (int i10 = 0; i10 < this.f64440j.size(); i10++) {
                    this.f64440j.get(i10).cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final <T> T e(q0<T, ?> q0Var, boolean z10) throws Throwable {
        if (z10) {
            q0Var.run();
            try {
                return q0Var.get();
            } catch (ExecutionException e10) {
                Throwable th2 = (Throwable) androidx.media3.common.util.a.g(e10.getCause());
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                k1.j2(e10);
            }
        }
        while (!this.f64441k) {
            androidx.media3.common.b1 b1Var = this.f64437g;
            if (b1Var != null) {
                b1Var.b(-4000);
            }
            c(q0Var);
            this.f64438h.execute(q0Var);
            try {
                try {
                    T t10 = q0Var.get();
                    q0Var.a();
                    k(q0Var);
                    return t10;
                } catch (ExecutionException e11) {
                    Throwable th3 = (Throwable) androidx.media3.common.util.a.g(e11.getCause());
                    if (!(th3 instanceof androidx.media3.common.b1.a)) {
                        if (th3 instanceof IOException) {
                            throw ((IOException) th3);
                        }
                        k1.j2(e11);
                    }
                    q0Var.a();
                    k(q0Var);
                }
            } catch (Throwable th4) {
                q0Var.a();
                k(q0Var);
                throw th4;
            }
        }
        throw new InterruptedException();
    }

    protected final M g(androidx.media3.datasource.p pVar, androidx.media3.datasource.x xVar, boolean z10) throws InterruptedException, IOException {
        return (M) e(new a(pVar, xVar), z10);
    }

    protected abstract List<c> h(androidx.media3.datasource.p pVar, M m10, boolean z10) throws InterruptedException, IOException;

    @Override // androidx.media3.exoplayer.offline.x
    public final void remove() {
        androidx.media3.datasource.cache.a aVar;
        String strB;
        androidx.media3.datasource.cache.c cVarE = this.f64434d.e();
        try {
            List<c> listH = h(cVarE, g(cVarE, this.f64431a, true), true);
            for (int i10 = 0; i10 < listH.size(); i10++) {
                this.f64435e.f(this.f64436f.b(listH.get(i10).f64451b));
            }
            aVar = this.f64435e;
            strB = this.f64436f.b(this.f64431a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            aVar = this.f64435e;
            strB = this.f64436f.b(this.f64431a);
        } catch (Exception unused2) {
            aVar = this.f64435e;
            strB = this.f64436f.b(this.f64431a);
        } finally {
            this.f64435e.f(this.f64436f.b(this.f64431a));
        }
    }

    public d0(k0 k0Var, androidx.media3.exoplayer.upstream.q.a<M> aVar, androidx.media3.datasource.cache.c.d dVar, Executor executor, long j10) {
        androidx.media3.common.util.a.g(k0Var.f60822b);
        this.f64431a = f(k0Var.f60822b.f60920a);
        this.f64432b = aVar;
        this.f64433c = new ArrayList<>(k0Var.f60822b.f60924e);
        this.f64434d = dVar;
        this.f64438h = executor;
        this.f64435e = (androidx.media3.datasource.cache.a) androidx.media3.common.util.a.g(dVar.g());
        this.f64436f = dVar.h();
        this.f64437g = dVar.i();
        this.f64440j = new ArrayList<>();
        this.f64439i = k1.D1(j10);
    }
}
