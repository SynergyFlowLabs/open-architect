package androidx.media3.exoplayer.offline;

import androidx.annotation.p0;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.q0;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f64402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.x f64403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.cache.c f64404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.datasource.cache.j f64405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final androidx.media3.common.b1 f64406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private x.a f64407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile q0<Void, IOException> f64408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f64409h;

    class a extends q0<Void, IOException> {
        a() {
        }

        @Override // androidx.media3.common.util.q0
        protected void c() {
            c0.this.f64405d.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.media3.common.util.q0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            c0.this.f64405d.a();
            return null;
        }
    }

    public c0(k0 k0Var, androidx.media3.datasource.cache.c.d dVar) {
        this(k0Var, dVar, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j10, long j11, long j12) {
        x.a aVar = this.f64407f;
        if (aVar == null) {
            return;
        }
        aVar.a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0026 */
    @Override // androidx.media3.exoplayer.offline.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@androidx.annotation.p0 androidx.media3.exoplayer.offline.x.a r5) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r4 = this;
            r3 = 7
            r4.f64407f = r5
            androidx.media3.common.b1 r5 = r4.f64406e
            r0 = -4000(0xfffffffffffff060, float:NaN)
            r3 = 1
            if (r5 == 0) goto Le
            r3 = 5
            r5.a(r0)
        Le:
            r5 = 0
            r3 = r5
        L10:
            if (r5 != 0) goto L6f
            boolean r1 = r4.f64409h     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L6f
            androidx.media3.exoplayer.offline.c0$a r1 = new androidx.media3.exoplayer.offline.c0$a     // Catch: java.lang.Throwable -> L26
            r3 = 7
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            r4.f64408g = r1     // Catch: java.lang.Throwable -> L26
            androidx.media3.common.b1 r1 = r4.f64406e     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L28
            r1.b(r0)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r5 = move-exception
            goto L57
        L28:
            java.util.concurrent.Executor r1 = r4.f64402a     // Catch: java.lang.Throwable -> L26
            r3 = 5
            androidx.media3.common.util.q0<java.lang.Void, java.io.IOException> r2 = r4.f64408g     // Catch: java.lang.Throwable -> L26
            r1.execute(r2)     // Catch: java.lang.Throwable -> L26
            androidx.media3.common.util.q0<java.lang.Void, java.io.IOException> r1 = r4.f64408g     // Catch: java.lang.Throwable -> L26 java.util.concurrent.ExecutionException -> L38
            r1.get()     // Catch: java.lang.Throwable -> L26 java.util.concurrent.ExecutionException -> L38
            r3 = 2
            r5 = 1
            goto L10
        L38:
            r1 = move-exception
            r3 = 4
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = androidx.media3.common.util.a.g(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L26
            boolean r2 = r1 instanceof androidx.media3.common.b1.a     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L49
            goto L10
        L49:
            r3 = 5
            boolean r2 = r1 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L53
            androidx.media3.common.util.k1.j2(r1)     // Catch: java.lang.Throwable -> L26
            r3 = 0
            goto L10
        L53:
            java.io.IOException r1 = (java.io.IOException) r1     // Catch: java.lang.Throwable -> L26
            r3 = 4
            throw r1     // Catch: java.lang.Throwable -> L26
        L57:
            r3 = 4
            androidx.media3.common.util.q0<java.lang.Void, java.io.IOException> r1 = r4.f64408g
            java.lang.Object r1 = androidx.media3.common.util.a.g(r1)
            r3 = 6
            androidx.media3.common.util.q0 r1 = (androidx.media3.common.util.q0) r1
            r3 = 2
            r1.a()
            r3 = 4
            androidx.media3.common.b1 r4 = r4.f64406e
            if (r4 == 0) goto L6e
            r3 = 0
            r4.e(r0)
        L6e:
            throw r5
        L6f:
            r3 = 0
            androidx.media3.common.util.q0<java.lang.Void, java.io.IOException> r5 = r4.f64408g
            java.lang.Object r5 = androidx.media3.common.util.a.g(r5)
            androidx.media3.common.util.q0 r5 = (androidx.media3.common.util.q0) r5
            r5.a()
            androidx.media3.common.b1 r4 = r4.f64406e
            if (r4 == 0) goto L82
            r4.e(r0)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.c0.a(androidx.media3.exoplayer.offline.x$a):void");
    }

    @Override // androidx.media3.exoplayer.offline.x
    public void cancel() {
        this.f64409h = true;
        q0<Void, IOException> q0Var = this.f64408g;
        if (q0Var != null) {
            q0Var.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.x
    public void remove() {
        this.f64404c.v().f(this.f64404c.w().b(this.f64403b));
    }

    public c0(k0 k0Var, androidx.media3.datasource.cache.c.d dVar, Executor executor) {
        this.f64402a = (Executor) androidx.media3.common.util.a.g(executor);
        androidx.media3.common.util.a.g(k0Var.f60822b);
        androidx.media3.datasource.x xVarA = new androidx.media3.datasource.x.b().j(k0Var.f60822b.f60920a).g(k0Var.f60822b.f60925f).c(4).a();
        this.f64403b = xVarA;
        androidx.media3.datasource.cache.c cVarD = dVar.d();
        this.f64404c = cVarD;
        int i10 = 3 << 0;
        this.f64405d = new androidx.media3.datasource.cache.j(cVarD, xVarA, null, new androidx.media3.datasource.cache.j.a() { // from class: androidx.media3.exoplayer.offline.b0
            @Override // androidx.media3.datasource.cache.j.a
            public final void a(long j10, long j11, long j12) {
                this.f64398a.d(j10, j11, j12);
            }
        });
        this.f64406e = dVar.i();
    }
}
