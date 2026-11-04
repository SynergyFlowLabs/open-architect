package androidx.media3.common.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
class p implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f60409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f60410c;

    public p(Object obj, boolean z10) {
        this.f60409b = obj;
        this.f60410c = new m(z10);
    }

    @Override // androidx.media3.common.audio.g
    public final boolean a() {
        boolean zA;
        synchronized (this.f60409b) {
            zA = this.f60410c.a();
        }
        return zA;
    }

    @Override // androidx.media3.common.audio.g
    public final void b(ByteBuffer byteBuffer) {
        synchronized (this.f60409b) {
            this.f60410c.b(byteBuffer);
        }
    }

    @Override // androidx.media3.common.audio.g
    public final void c() {
        synchronized (this.f60409b) {
            this.f60410c.c();
        }
    }

    @Override // androidx.media3.common.audio.g
    public final ByteBuffer d() {
        ByteBuffer byteBufferD;
        synchronized (this.f60409b) {
            try {
                byteBufferD = this.f60410c.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteBufferD;
    }

    @Override // androidx.media3.common.audio.g
    public final g.a e(g.a aVar) throws g.b {
        g.a aVarE;
        synchronized (this.f60409b) {
            try {
                aVarE = this.f60410c.e(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarE;
    }

    @Override // androidx.media3.common.audio.g
    public long f(long j10) {
        return h(j10);
    }

    @Override // androidx.media3.common.audio.g
    public final void flush() {
        synchronized (this.f60409b) {
            try {
                this.f60410c.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long g(long j10) {
        long jH;
        synchronized (this.f60409b) {
            try {
                jH = this.f60410c.h(j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jH;
    }

    public final long h(long j10) {
        long jI;
        synchronized (this.f60409b) {
            jI = this.f60410c.i(j10);
        }
        return jI;
    }

    public final long i() {
        long j10;
        synchronized (this.f60409b) {
            j10 = this.f60410c.j();
        }
        return j10;
    }

    @Override // androidx.media3.common.audio.g
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.f60409b) {
            try {
                zIsActive = this.f60410c.isActive();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zIsActive;
    }

    public final void j(int i10) {
        synchronized (this.f60409b) {
            this.f60410c.k(i10);
        }
    }

    public final void k(float f10) {
        synchronized (this.f60409b) {
            try {
                this.f60410c.l(f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(float f10) {
        synchronized (this.f60409b) {
            try {
                this.f60410c.m(f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.common.audio.g
    public final void reset() {
        synchronized (this.f60409b) {
            this.f60410c.reset();
        }
    }
}
