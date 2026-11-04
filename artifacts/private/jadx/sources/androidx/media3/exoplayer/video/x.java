package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.s0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f66589o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f66590p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f66591q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f66592r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f66593s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f66594t = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f66595u = 50000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f66596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f66597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f66598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66599d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f66602g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f66605j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f66608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f66609n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66600e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f66601f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f66603h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f66604i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f66606k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.common.util.j f66607l = androidx.media3.common.util.j.f61520a;

    @b1
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f66610a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f66611b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f66610a = -9223372036854775807L;
            this.f66611b = -9223372036854775807L;
        }

        public long f() {
            return this.f66610a;
        }

        public long g() {
            return this.f66611b;
        }
    }

    public interface c {
        boolean A(long j10, long j11);

        boolean E(long j10, long j11, boolean z10);

        boolean N(long j10, long j11, long j12, boolean z10, boolean z11) throws s0;
    }

    public x(Context context, c cVar, long j10) {
        this.f66596a = cVar;
        this.f66598c = j10;
        this.f66597b = new z(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f66606k));
        return this.f66599d ? j13 - (k1.D1(this.f66607l.b()) - j11) : j13;
    }

    private void f(int i10) {
        this.f66600e = Math.min(this.f66600e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f66604i != -9223372036854775807L && !this.f66605j) {
            return false;
        }
        int i10 = this.f66600e;
        if (i10 == 0) {
            return this.f66599d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f66599d && this.f66596a.A(j11, k1.D1(this.f66607l.b()) - this.f66602g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f66600e == 0) {
            this.f66600e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, b bVar) throws s0 {
        bVar.h();
        if (this.f66601f == -9223372036854775807L) {
            this.f66601f = j11;
        }
        if (this.f66603h != j10) {
            this.f66597b.h(j10);
            this.f66603h = j10;
        }
        bVar.f66610a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f66608m) {
            this.f66609n = true;
            if (this.f66596a.N(bVar.f66610a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f66599d || bVar.f66610a >= 30000) ? 5 : 3;
        }
        if (s(j11, bVar.f66610a, j13)) {
            return 0;
        }
        if (!this.f66599d || j11 == this.f66601f) {
            return 5;
        }
        long jA = this.f66607l.a();
        bVar.f66611b = this.f66597b.b((bVar.f66610a * 1000) + jA);
        bVar.f66610a = (bVar.f66611b - jA) / 1000;
        boolean z12 = (this.f66604i == -9223372036854775807L || this.f66605j) ? false : true;
        if (this.f66596a.N(bVar.f66610a, j11, j12, z11, z12)) {
            return 4;
        }
        if (this.f66596a.E(bVar.f66610a, j12, z11)) {
            return z12 ? 3 : 2;
        }
        return bVar.f66610a > f66595u ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f66600e == 3 || (!this.f66608m && this.f66609n))) {
            this.f66604i = -9223372036854775807L;
            return true;
        }
        if (this.f66604i == -9223372036854775807L) {
            return false;
        }
        if (this.f66607l.b() < this.f66604i) {
            return true;
        }
        this.f66604i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f66605j = z10;
        this.f66604i = this.f66598c > 0 ? this.f66607l.b() + this.f66598c : -9223372036854775807L;
    }

    public void g() {
        f(0);
    }

    public void h(boolean z10) {
        this.f66600e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f66600e != 3;
        this.f66600e = 3;
        this.f66602g = k1.D1(this.f66607l.b());
        return z10;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f66599d = true;
        this.f66602g = k1.D1(this.f66607l.b());
        this.f66597b.k();
    }

    public void l() {
        this.f66599d = false;
        this.f66604i = -9223372036854775807L;
        this.f66597b.l();
    }

    public void m() {
        this.f66597b.j();
        this.f66603h = -9223372036854775807L;
        this.f66601f = -9223372036854775807L;
        f(1);
        this.f66604i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f66597b.o(i10);
    }

    public void o(androidx.media3.common.util.j jVar) {
        this.f66607l = jVar;
    }

    public void p(float f10) {
        this.f66597b.g(f10);
    }

    public void q(@p0 Surface surface) {
        this.f66608m = surface != null;
        this.f66609n = false;
        this.f66597b.m(surface);
        f(1);
    }

    public void r(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        androidx.media3.common.util.a.a(f10 > 0.0f);
        if (f10 == this.f66606k) {
            return;
        }
        this.f66606k = f10;
        this.f66597b.i(f10);
    }
}
