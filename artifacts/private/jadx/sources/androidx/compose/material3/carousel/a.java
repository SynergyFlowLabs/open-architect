package androidx.compose.material3.carousel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final C0210a f26523h = new C0210a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f26524i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f26525j = 0.1f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f26527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f26529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f26531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f26532g;

    /* JADX INFO: renamed from: androidx.compose.material3.carousel.a$a, reason: collision with other inner class name */
    public static final class C0210a {
        public /* synthetic */ C0210a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float a(float f10, int i10, float f11, int i11, int i12) {
            float f12 = i10;
            float f13 = i11 / 2.0f;
            return (f10 - ((f12 + f13) * f11)) / (i12 + f13);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0042  */
        /* JADX WARN: Code duplicated, block: B:23:0x006a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        private final a c(int i10, float f10, float f11, int i11, float f12, float f13, float f14, int i12, float f15, int i13, float f16) {
            float fMax;
            float f17;
            float fA;
            float f18;
            float f19;
            float fMin;
            float f20 = f10 - ((((i13 + i12) + i11) - 1) * f11);
            float fH = kotlin.ranges.r.H(f12, f13, f14);
            float f21 = i13;
            float f22 = i12;
            float f23 = i11;
            float f24 = f20 - (((f16 * f21) + (f15 * f22)) + (fH * f23));
            if (i11 <= 0 || f24 <= 0.0f) {
                if (i11 > 0 && f24 < 0.0f) {
                    fMax = Math.max(f24 / f23, f13 - fH);
                }
                if (i11 > 0) {
                    f17 = fH;
                } else {
                    f17 = 0.0f;
                }
                fA = a(f20, i11, f17, i12, i13);
                float f25 = f17;
                f18 = (fA + f25) / 2.0f;
                if (i12 > 0 && fA != f16) {
                    f19 = (f16 - fA) * f21;
                    fMin = Math.min(Math.abs(f19), 0.1f * f18 * f22);
                    if (f19 > 0.0f) {
                        f18 -= fMin / f22;
                        fA += fMin / f21;
                    } else {
                        f18 += fMin / f22;
                        fA -= fMin / f21;
                    }
                }
                return new a(i10, f25, i11, f18, i12, fA, i13);
            }
            fMax = Math.min(f24 / f23, f14 - fH);
            fH += fMax;
            if (i11 > 0) {
                f17 = fH;
            } else {
                f17 = 0.0f;
            }
            fA = a(f20, i11, f17, i12, i13);
            float f26 = f17;
            f18 = (fA + f26) / 2.0f;
            if (i12 > 0) {
                f19 = (f16 - fA) * f21;
                fMin = Math.min(Math.abs(f19), 0.1f * f18 * f22);
                if (f19 > 0.0f) {
                    f18 -= fMin / f22;
                    fA += fMin / f21;
                } else {
                    f18 += fMin / f22;
                    fA -= fMin / f21;
                }
            }
            return new a(i10, f26, i11, f18, i12, fA, i13);
        }

        @Nullable
        public final a b(float f10, float f11, float f12, float f13, float f14, @NotNull int[] iArr, float f15, @NotNull int[] iArr2, float f16, @NotNull int[] iArr3) {
            int length = iArr3.length;
            a aVar = null;
            int i10 = 1;
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr3[i11];
                int length2 = iArr2.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = iArr2[i13];
                    int length3 = iArr.length;
                    int i15 = 0;
                    while (i15 < length3) {
                        int i16 = i13;
                        int i17 = iArr[i15];
                        a aVar2 = aVar;
                        int i18 = i11;
                        int i19 = length2;
                        int i20 = length3;
                        int i21 = i15;
                        a aVarC = c(i10, f10, f11, i17, f12, f13, f14, i14, f15, i12, f16);
                        if (aVar2 != null && aVarC.b(f16) >= aVar2.b(f16)) {
                            aVar = aVar2;
                        } else {
                            if (aVarC.b(f16) == 0.0f) {
                                return aVarC;
                            }
                            aVar = aVarC;
                        }
                        i10++;
                        i15 = i21 + 1;
                        iArr = iArr;
                        i11 = i18;
                        length2 = i19;
                        i13 = i16;
                        length3 = i20;
                    }
                    i13++;
                    iArr = iArr;
                }
                i11++;
            }
            return aVar;
        }

        private C0210a() {
        }
    }

    public a(int i10, float f10, int i11, float f11, int i12, float f12, int i13) {
        this.f26526a = i10;
        this.f26527b = f10;
        this.f26528c = i11;
        this.f26529d = f11;
        this.f26530e = i12;
        this.f26531f = f12;
        this.f26532g = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float b(float f10) {
        if (i()) {
            return Math.abs(f10 - this.f26531f) * this.f26526a;
        }
        return Float.MAX_VALUE;
    }

    private final boolean i() {
        int i10 = this.f26532g;
        if (i10 <= 0 || this.f26528c <= 0 || this.f26530e <= 0) {
            return i10 <= 0 || this.f26528c <= 0 || this.f26531f > this.f26527b;
        }
        float f10 = this.f26531f;
        float f11 = this.f26529d;
        return f10 > f11 && f11 > this.f26527b;
    }

    public final int c() {
        return this.f26532g;
    }

    public final float d() {
        return this.f26531f;
    }

    public final int e() {
        return this.f26530e;
    }

    public final float f() {
        return this.f26529d;
    }

    public final int g() {
        return this.f26528c;
    }

    public final float h() {
        return this.f26527b;
    }

    public final int j() {
        return this.f26532g + this.f26530e + this.f26528c;
    }
}
