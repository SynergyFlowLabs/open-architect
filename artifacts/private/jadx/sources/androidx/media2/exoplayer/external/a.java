package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class a implements o0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final z0.c f53119p = new z0.c();

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.a$a, reason: collision with other inner class name */
    protected static final class C0499a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0.d f53120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f53121b;

        public C0499a(o0.d listener) {
            this.f53120a = listener;
        }

        public void a(b listenerInvocation) {
            if (this.f53121b) {
                return;
            }
            listenerInvocation.a(this.f53120a);
        }

        public void b() {
            this.f53121b = true;
        }

        public boolean equals(@androidx.annotation.p0 Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || C0499a.class != other.getClass()) {
                return false;
            }
            return this.f53120a.equals(((C0499a) other).f53120a);
        }

        public int hashCode() {
            return this.f53120a.hashCode();
        }
    }

    protected interface b {
        void a(o0.d listener);
    }

    private int t() {
        int iC = C();
        if (iC == 1) {
            iC = 0;
        }
        return iC;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final void F(long positionMs) {
        j0(Y(), positionMs);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final long N() {
        z0 z0VarC0 = c0();
        if (z0VarC0.s()) {
            return -9223372036854775807L;
        }
        return z0VarC0.n(Y(), this.f53119p).c();
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final void Q(int windowIndex) {
        j0(windowIndex, -9223372036854775807L);
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final int S() {
        long jV = v();
        long duration = getDuration();
        int i10 = 5 | 0;
        if (jV != -9223372036854775807L && duration != -9223372036854775807L) {
            if (duration == 0) {
                return 100;
            }
            return androidx.media2.exoplayer.external.util.q0.r((int) ((jV * 100) / duration), 0, 100);
        }
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final boolean T() {
        z0 z0VarC0 = c0();
        return !z0VarC0.s() && z0VarC0.n(Y(), this.f53119p).f57963e;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final void U() {
        Q(Y());
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final boolean X() {
        z0 z0VarC0 = c0();
        return !z0VarC0.s() && z0VarC0.n(Y(), this.f53119p).f57964f;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final boolean hasNext() {
        return q0() != -1;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final boolean hasPrevious() {
        return o0() != -1;
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final void next() {
        int iQ0 = q0();
        if (iQ0 != -1) {
            Q(iQ0);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final int o0() {
        z0 z0VarC0 = c0();
        if (z0VarC0.s()) {
            return -1;
        }
        return z0VarC0.l(Y(), t(), s0());
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final void previous() {
        int iO0 = o0();
        if (iO0 != -1) {
            Q(iO0);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final int q0() {
        z0 z0VarC0 = c0();
        if (z0VarC0.s()) {
            return -1;
        }
        return z0VarC0.e(Y(), t(), s0());
    }

    @Override // androidx.media2.exoplayer.external.o0
    public final void stop() {
        L(false);
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public final Object t0() {
        z0 z0VarC0 = c0();
        if (!z0VarC0.s()) {
            return z0VarC0.n(Y(), this.f53119p).f57959a;
        }
        int i10 = 7 << 0;
        return null;
    }

    @Override // androidx.media2.exoplayer.external.o0
    @androidx.annotation.p0
    public final Object z() {
        z0 z0VarC0 = c0();
        if (z0VarC0.s()) {
            return null;
        }
        return z0VarC0.n(Y(), this.f53119p).f57960b;
    }
}
