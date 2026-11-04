package androidx.compose.animation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13644d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f13646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f13647c;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f13648d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f13649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f13650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f13651c;

        public a(float f10, float f11, long j10) {
            this.f13649a = f10;
            this.f13650b = f11;
            this.f13651c = j10;
        }

        public static /* synthetic */ a e(a aVar, float f10, float f11, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f13649a;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f13650b;
            }
            if ((i10 & 4) != 0) {
                j10 = aVar.f13651c;
            }
            return aVar.d(f10, f11, j10);
        }

        public final float a() {
            return this.f13649a;
        }

        public final float b() {
            return this.f13650b;
        }

        public final long c() {
            return this.f13651c;
        }

        @NotNull
        public final a d(float f10, float f11, long j10) {
            return new a(f10, f11, j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f13649a, aVar.f13649a) == 0 && Float.compare(this.f13650b, aVar.f13650b) == 0 && this.f13651c == aVar.f13651c;
        }

        public final float f() {
            return this.f13650b;
        }

        public final long g() {
            return this.f13651c;
        }

        public final float h() {
            return this.f13649a;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f13649a) * 31) + Float.hashCode(this.f13650b)) * 31) + Long.hashCode(this.f13651c);
        }

        public final float i(long j10) {
            long j11 = this.f13651c;
            return this.f13650b * Math.signum(this.f13649a) * b.f12617a.b(j11 > 0 ? j10 / j11 : 1.0f).e();
        }

        public final float j(long j10) {
            long j11 = this.f13651c;
            return (((b.f12617a.b(j11 > 0 ? j10 / j11 : 1.0f).f() * Math.signum(this.f13649a)) * this.f13650b) / this.f13651c) * 1000.0f;
        }

        @NotNull
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f13649a + ", distance=" + this.f13650b + ", duration=" + this.f13651c + ')';
        }
    }

    public k0(float f10, @NotNull androidx.compose.ui.unit.d dVar) {
        this.f13645a = f10;
        this.f13646b = dVar;
        this.f13647c = a(dVar);
    }

    private final float a(androidx.compose.ui.unit.d dVar) {
        return l0.c(0.84f, dVar.getDensity());
    }

    private final double f(float f10) {
        return b.f12617a.a(f10, this.f13645a * this.f13647c);
    }

    public final float b(float f10) {
        return (float) (((double) (this.f13645a * this.f13647c)) * Math.exp((((double) l0.f13664c) / (((double) l0.f13664c) - 1.0d)) * f(f10)));
    }

    public final long c(float f10) {
        return (long) (Math.exp(f(f10) / (((double) l0.f13664c) - 1.0d)) * 1000.0d);
    }

    @NotNull
    public final a d(float f10) {
        double dF = f(f10);
        double d10 = ((double) l0.f13664c) - 1.0d;
        return new a(f10, (float) (((double) (this.f13645a * this.f13647c)) * Math.exp((((double) l0.f13664c) / d10) * dF)), (long) (Math.exp(dF / d10) * 1000.0d));
    }

    @NotNull
    public final androidx.compose.ui.unit.d e() {
        return this.f13646b;
    }
}
