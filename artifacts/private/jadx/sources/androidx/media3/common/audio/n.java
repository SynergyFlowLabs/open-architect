package androidx.media3.common.audio;

import androidx.annotation.b0;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.s0;
import androidx.media3.common.util.x0;
import io.sentry.protocol.z;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class n implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f60397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f60398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f60399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0(z.b.f306551r)
    private final androidx.media3.common.util.b0 f60400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0(z.b.f306551r)
    private final Queue<x0> f60401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f60402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f60403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f60404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0(z.b.f306551r)
    private g.a f60405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g.a f60406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g.a f60407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f60408m;

    public n(o oVar) {
        g.a aVar = g.a.f60332e;
        this.f60406k = aVar;
        this.f60407l = aVar;
        this.f60405j = aVar;
        this.f60398c = oVar;
        Object obj = new Object();
        this.f60397b = obj;
        this.f60399d = new p(obj, true);
        this.f60400e = new androidx.media3.common.util.b0();
        this.f60401f = new ArrayDeque();
        m(true);
    }

    private static long g(o oVar, int i10, long j10) {
        return k1.W1(j(oVar, i10, k1.a2(j10, i10, 1000000L, RoundingMode.HALF_EVEN)), i10);
    }

    @l1
    static long h(o oVar, @g0(from = 1) int i10, @g0(from = 0) long j10) {
        int i11 = i10;
        androidx.media3.common.util.a.a(i11 > 0);
        androidx.media3.common.util.a.a(j10 >= 0);
        long j11 = j10;
        long jL = 0;
        while (j11 > 0) {
            long jB = s0.b(oVar, jL, i10);
            float fC = s0.c(oVar, jL, i10);
            long jK = l.k(i11, i10, fC, fC, jB - jL);
            if (jB == -1 || jK > j11) {
                jL += l.l(i10, i10, fC, fC, j11);
                j11 = 0;
            } else {
                j11 -= jK;
                jL = jB;
            }
            i11 = i10;
        }
        return jL;
    }

    public static long j(o oVar, @g0(from = 1) int i10, @g0(from = 0) long j10) {
        androidx.media3.common.util.a.a(oVar != null);
        androidx.media3.common.util.a.a(i10 > 0);
        long j11 = 0;
        androidx.media3.common.util.a.a(j10 >= 0);
        long jK = 0;
        while (j11 < j10) {
            long jB = s0.b(oVar, j11, i10);
            if (jB == -1 || jB > j10) {
                jB = j10;
            }
            float fC = s0.c(oVar, j11, i10);
            jK += l.k(i10, i10, fC, fC, jB - j11);
            j11 = jB;
        }
        return jK;
    }

    private void l() {
        synchronized (this.f60397b) {
            try {
                if (this.f60405j.f60333a == -1) {
                    return;
                }
                while (!this.f60401f.isEmpty()) {
                    this.f60401f.remove().a(g(this.f60398c, this.f60405j.f60333a, this.f60400e.g()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m(boolean z10) {
        if (z10) {
            this.f60402g = 1.0f;
        }
        this.f60403h = 0L;
        this.f60404i = false;
    }

    private void n(float f10) {
        if (f10 != this.f60402g) {
            this.f60402g = f10;
            this.f60399d.l(f10);
            this.f60399d.k(f10);
            this.f60399d.flush();
            this.f60404i = false;
        }
    }

    @Override // androidx.media3.common.audio.g
    public boolean a() {
        return this.f60408m && this.f60399d.a();
    }

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        g.a aVar;
        int i10;
        synchronized (this.f60397b) {
            aVar = this.f60405j;
        }
        float fC = s0.c(this.f60398c, this.f60403h, aVar.f60333a);
        long jB = s0.b(this.f60398c, this.f60403h, aVar.f60333a);
        n(fC);
        int iLimit = byteBuffer.limit();
        if (jB != -1) {
            i10 = (int) ((jB - this.f60403h) * ((long) aVar.f60336d));
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + i10));
        } else {
            i10 = -1;
        }
        long jPosition = byteBuffer.position();
        this.f60399d.b(byteBuffer);
        if (i10 != -1 && ((long) byteBuffer.position()) - jPosition == i10) {
            this.f60399d.c();
            this.f60404i = true;
        }
        long jPosition2 = ((long) byteBuffer.position()) - jPosition;
        androidx.media3.common.util.a.j(jPosition2 % ((long) aVar.f60336d) == 0, "A frame was not queued completely.");
        this.f60403h += jPosition2 / ((long) aVar.f60336d);
        byteBuffer.limit(iLimit);
    }

    @Override // androidx.media3.common.audio.g
    public void c() {
        this.f60408m = true;
        if (this.f60404i) {
            return;
        }
        this.f60399d.c();
        this.f60404i = true;
    }

    @Override // androidx.media3.common.audio.g
    public ByteBuffer d() {
        return this.f60399d.d();
    }

    @Override // androidx.media3.common.audio.g
    public g.a e(g.a aVar) throws g.b {
        this.f60406k = aVar;
        g.a aVarE = this.f60399d.e(aVar);
        this.f60407l = aVarE;
        return aVarE;
    }

    @Override // androidx.media3.common.audio.g
    public long f(long j10) {
        return s0.a(this.f60398c, j10);
    }

    @Override // androidx.media3.common.audio.g
    public void flush() {
        this.f60408m = false;
        m(false);
        synchronized (this.f60397b) {
            try {
                this.f60405j = this.f60406k;
                this.f60399d.flush();
                l();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long i(long j10) {
        int i10;
        synchronized (this.f60397b) {
            try {
                i10 = this.f60405j.f60333a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 == -1) {
            return j10;
        }
        return k1.W1(h(this.f60398c, i10, k1.a2(j10, i10, 1000000L, RoundingMode.HALF_EVEN)), i10);
    }

    @Override // androidx.media3.common.audio.g
    public boolean isActive() {
        return !this.f60407l.equals(g.a.f60332e);
    }

    public void k(long j10, x0 x0Var) {
        synchronized (this.f60397b) {
            try {
                int i10 = this.f60405j.f60333a;
                if (i10 != -1) {
                    x0Var.a(g(this.f60398c, i10, j10));
                } else {
                    this.f60400e.a(j10);
                    this.f60401f.add(x0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.common.audio.g
    public void reset() {
        flush();
        g.a aVar = g.a.f60332e;
        this.f60406k = aVar;
        this.f60407l = aVar;
        synchronized (this.f60397b) {
            this.f60405j = aVar;
            this.f60400e.c();
            this.f60401f.clear();
        }
        m(true);
        this.f60399d.reset();
    }
}
