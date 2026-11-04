package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.x;
import com.google.android.material.shape.h;
import com.google.android.material.shape.r;

/* JADX INFO: loaded from: classes4.dex */
public class b extends h implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f111401g = 90;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f111402h = 180;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f111403i = 270;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f111404j = 180;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f111405k = 1.75f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f111406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f111407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f111408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f111409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f111410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f111411f = -1.0f;

    public b(float f10, float f11, float f12) {
        this.f111407b = f10;
        this.f111406a = f11;
        j(f12);
        this.f111410e = 0.0f;
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        float f13;
        float f14;
        float f15 = this.f111408c;
        if (f15 == 0.0f) {
            rVar.n(f10, 0.0f);
            return;
        }
        float f16 = ((this.f111407b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f111406a;
        float f18 = f11 + this.f111410e;
        float f19 = (this.f111409d * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            rVar.n(f10, 0.0f);
            return;
        }
        float f20 = this.f111411f;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = f111405k;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        rVar.n(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        rVar.a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            rVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f111407b;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            rVar.a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f111407b;
            rVar.n(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f111407b;
            rVar.a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        rVar.a(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        rVar.n(f10, 0.0f);
    }

    float d() {
        return this.f111409d;
    }

    public float e() {
        return this.f111411f;
    }

    float f() {
        return this.f111407b;
    }

    float g() {
        return this.f111406a;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public float h() {
        return this.f111408c;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public float i() {
        return this.f111410e;
    }

    void j(@x(from = 0.0d) float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f111409d = f10;
    }

    public void k(float f10) {
        this.f111411f = f10;
    }

    void l(float f10) {
        this.f111407b = f10;
    }

    void n(float f10) {
        this.f111406a = f10;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void o(float f10) {
        this.f111408c = f10;
    }

    void p(float f10) {
        this.f111410e = f10;
    }
}
