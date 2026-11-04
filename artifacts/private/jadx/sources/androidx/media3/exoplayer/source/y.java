package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.b4;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class y implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f65552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f65553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h2 f65554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f65555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f65556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Throwable> f65557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.common.util.concurrent.t1<?> f65558g;

    class a implements com.google.common.util.concurrent.e1<Object> {
        a() {
        }

        @Override // com.google.common.util.concurrent.e1
        public void b(@androidx.annotation.p0 Object obj) {
            y.this.f65556e.set(true);
        }

        @Override // com.google.common.util.concurrent.e1
        public void onFailure(Throwable th2) {
            y.this.f65557f.set(th2);
        }
    }

    private final class b implements s1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f65560c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f65561d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f65562e = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f65563a = 0;

        public b() {
        }

        @Override // androidx.media3.exoplayer.source.s1
        public void a() throws IOException {
            Throwable th2 = (Throwable) y.this.f65557f.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // androidx.media3.exoplayer.source.s1
        public boolean isReady() {
            return y.this.f65556e.get();
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int l(long j10) {
            return 0;
        }

        @Override // androidx.media3.exoplayer.source.s1
        public int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10) {
            int i11 = this.f65563a;
            if (i11 == 2) {
                gVar.c(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                p3Var.f64600b = y.this.f65554c.c(0).c(0);
                this.f65563a = 1;
                return -5;
            }
            if (!y.this.f65556e.get()) {
                return -3;
            }
            int length = y.this.f65555d.length;
            gVar.c(1);
            gVar.f62702f = 0L;
            if ((i10 & 4) == 0) {
                gVar.E(length);
                gVar.f62700d.put(y.this.f65555d, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f65563a = 2;
            }
            return -4;
        }
    }

    public y(Uri uri, String str, x xVar) {
        this.f65552a = uri;
        androidx.media3.common.w wVarN = new androidx.media3.common.w.b().u0(str).N();
        this.f65553b = xVar;
        this.f65554c = new h2(new b4(wVarN));
        this.f65555d = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f65556e = new AtomicBoolean();
        this.f65557f = new AtomicReference<>();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        return this.f65556e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        return !this.f65556e.get();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        return this.f65556e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        return !this.f65556e.get();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        return this.f65554c;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() {
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
    }

    public void q() {
        com.google.common.util.concurrent.t1<?> t1Var = this.f65558g;
        if (t1Var != null) {
            t1Var.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < c0VarArr.length; i10++) {
            if (s1VarArr[i10] != null && (c0VarArr[i10] == null || !zArr[i10])) {
                s1VarArr[i10] = null;
            }
            if (s1VarArr[i10] == null && c0VarArr[i10] != null) {
                s1VarArr[i10] = new b();
                int i11 = 2 << 1;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        aVar.j(this);
        com.google.common.util.concurrent.t1<?> t1VarA = this.f65553b.a(new x.a(this.f65552a));
        this.f65558g = t1VarA;
        com.google.common.util.concurrent.h1.c(t1VarA, new a(), com.google.common.util.concurrent.a2.c());
    }
}
