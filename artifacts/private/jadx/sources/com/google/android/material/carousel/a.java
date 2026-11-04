package com.google.android.material.carousel;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f111735i = 0.1f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f111736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f111737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f111738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f111739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f111740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f111741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f111742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f111743h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f111736a = i10;
        this.f111737b = n1.a.d(f10, f11, f12);
        this.f111738c = i11;
        this.f111740e = f13;
        this.f111739d = i12;
        this.f111741f = f14;
        this.f111742g = i13;
        d(f15, f11, f12, f14);
        this.f111743h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i10;
        float f13 = i11 / 2.0f;
        return (f10 - ((f12 + f13) * f11)) / (i12 + f13);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f111741f) * this.f111736a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f111743h < aVar.f111743h) {
                        if (aVar2.f111743h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f111738c;
        int i11 = 2 | 0;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f111737b;
            this.f111737b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f111737b;
            this.f111737b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i12 = this.f111738c;
        float f17 = i12 > 0 ? this.f111737b : 0.0f;
        this.f111737b = f17;
        float fA = a(f10, i12, f17, this.f111739d, this.f111742g);
        this.f111741f = fA;
        float f18 = (this.f111737b + fA) / 2.0f;
        this.f111740e = f18;
        int i13 = this.f111739d;
        if (i13 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f111742g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i13);
        if (f19 > 0.0f) {
            this.f111740e -= fMin / this.f111739d;
            this.f111741f += fMin / this.f111742g;
        } else {
            this.f111740e += fMin / this.f111739d;
            this.f111741f -= fMin / this.f111742g;
        }
    }

    private float f() {
        return (this.f111741f * this.f111742g) + (this.f111740e * this.f111739d) + (this.f111737b * this.f111738c);
    }

    private boolean g() {
        int i10 = this.f111742g;
        if (i10 > 0 && this.f111738c > 0 && this.f111739d > 0) {
            float f10 = this.f111741f;
            float f11 = this.f111740e;
            return f10 > f11 && f11 > this.f111737b;
        }
        if (i10 <= 0 || this.f111738c <= 0) {
            return true;
        }
        return this.f111741f > this.f111737b;
    }

    int e() {
        return this.f111738c + this.f111739d + this.f111742g;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f111736a + ", smallCount=" + this.f111738c + ", smallSize=" + this.f111737b + ", mediumCount=" + this.f111739d + ", mediumSize=" + this.f111740e + ", largeCount=" + this.f111742g + ", largeSize=" + this.f111741f + ", cost=" + this.f111743h + "]";
    }
}
