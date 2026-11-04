package androidx.compose.animation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f12617a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f12618b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final float[] f12619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final float[] f12620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12621e;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12622c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f12623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f12624b;

        public a(float f10, float f11) {
            this.f12623a = f10;
            this.f12624b = f11;
        }

        public static /* synthetic */ a d(a aVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f12623a;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f12624b;
            }
            return aVar.c(f10, f11);
        }

        public final float a() {
            return this.f12623a;
        }

        public final float b() {
            return this.f12624b;
        }

        @NotNull
        public final a c(float f10, float f11) {
            return new a(f10, f11);
        }

        public final float e() {
            return this.f12623a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f12623a, aVar.f12623a) == 0 && Float.compare(this.f12624b, aVar.f12624b) == 0;
        }

        public final float f() {
            return this.f12624b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f12623a) * 31) + Float.hashCode(this.f12624b);
        }

        @NotNull
        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f12623a + ", velocityCoefficient=" + this.f12624b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f12619c = fArr;
        float[] fArr2 = new float[101];
        f12620d = fArr2;
        l1.b(fArr, fArr2, 100);
        f12621e = 8;
    }

    private b() {
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    @NotNull
    public final a b(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fH = kotlin.ranges.r.H(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fH);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f12619c;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            f12 = f16 + ((fH - f14) * f17);
            f11 = f17;
        }
        return new a(f12, f11);
    }
}
