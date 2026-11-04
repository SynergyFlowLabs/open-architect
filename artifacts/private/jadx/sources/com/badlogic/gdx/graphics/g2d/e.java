package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.k;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    k f94289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f94290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f94291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f94292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f94293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f94294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f94295g;

    public e() {
    }

    public static e[][] C(k kVar, int i10, int i11) {
        return new e(kVar).B(i10, i11);
    }

    public void A(float f10) {
        this.f94293e = f10;
        this.f94295g = Math.round(Math.abs(f10 - this.f94291c) * this.f94289a.f());
    }

    public e[][] B(int i10, int i11) {
        int iD = d();
        int iE = e();
        int i12 = this.f94294f;
        int i13 = this.f94295g / i11;
        int i14 = i12 / i10;
        e[][] eVarArr = (e[][]) Array.newInstance((Class<?>) e.class, i13, i14);
        int i15 = iE;
        int i16 = 0;
        while (i16 < i13) {
            int i17 = iD;
            int i18 = 0;
            while (i18 < i14) {
                eVarArr[i16][i18] = new e(this.f94289a, i17, i15, i10, i11);
                i18++;
                i17 += i10;
            }
            i16++;
            i15 += i11;
        }
        return eVarArr;
    }

    public void a(boolean z10, boolean z11) {
        if (z10) {
            float f10 = this.f94290b;
            this.f94290b = this.f94292d;
            this.f94292d = f10;
        }
        if (z11) {
            float f11 = this.f94291c;
            this.f94291c = this.f94293e;
            this.f94293e = f11;
        }
    }

    public int b() {
        return this.f94295g;
    }

    public int c() {
        return this.f94294f;
    }

    public int d() {
        return Math.round(this.f94290b * this.f94289a.o());
    }

    public int e() {
        return Math.round(this.f94291c * this.f94289a.f());
    }

    public k f() {
        return this.f94289a;
    }

    public float g() {
        return this.f94290b;
    }

    public float h() {
        return this.f94292d;
    }

    public float i() {
        return this.f94291c;
    }

    public float j() {
        return this.f94293e;
    }

    public boolean k() {
        return this.f94290b > this.f94292d;
    }

    public boolean l() {
        return this.f94291c > this.f94293e;
    }

    public void m(float f10, float f11) {
        if (f10 != 0.0f) {
            float fO = (this.f94292d - this.f94290b) * this.f94289a.o();
            float f12 = (this.f94290b + f10) % 1.0f;
            this.f94290b = f12;
            this.f94292d = f12 + (fO / this.f94289a.o());
        }
        if (f11 != 0.0f) {
            float f13 = (this.f94293e - this.f94291c) * this.f94289a.f();
            float f14 = (this.f94291c + f11) % 1.0f;
            this.f94291c = f14;
            this.f94293e = f14 + (f13 / this.f94289a.f());
        }
    }

    public void n(float f10, float f11, float f12, float f13) {
        int iO = this.f94289a.o();
        int iF = this.f94289a.f();
        float f14 = iO;
        this.f94294f = Math.round(Math.abs(f12 - f10) * f14);
        float f15 = iF;
        int iRound = Math.round(Math.abs(f13 - f11) * f15);
        this.f94295g = iRound;
        if (this.f94294f == 1 && iRound == 1) {
            float f16 = 0.25f / f14;
            f10 += f16;
            f12 -= f16;
            float f17 = 0.25f / f15;
            f11 += f17;
            f13 -= f17;
        }
        this.f94290b = f10;
        this.f94291c = f11;
        this.f94292d = f12;
        this.f94293e = f13;
    }

    public void o(int i10, int i11, int i12, int i13) {
        float fO = 1.0f / this.f94289a.o();
        float f10 = 1.0f / this.f94289a.f();
        n(i10 * fO, i11 * f10, (i10 + i12) * fO, (i11 + i13) * f10);
        this.f94294f = Math.abs(i12);
        this.f94295g = Math.abs(i13);
    }

    public void p(k kVar) {
        this.f94289a = kVar;
        o(0, 0, kVar.o(), kVar.f());
    }

    public void q(e eVar) {
        this.f94289a = eVar.f94289a;
        n(eVar.f94290b, eVar.f94291c, eVar.f94292d, eVar.f94293e);
    }

    public void r(e eVar, int i10, int i11, int i12, int i13) {
        this.f94289a = eVar.f94289a;
        o(eVar.d() + i10, eVar.e() + i11, i12, i13);
    }

    public void s(int i10) {
        if (l()) {
            z(this.f94293e + (i10 / this.f94289a.f()));
        } else {
            A(this.f94291c + (i10 / this.f94289a.f()));
        }
    }

    public void t(int i10) {
        if (k()) {
            x(this.f94292d + (i10 / this.f94289a.o()));
        } else {
            y(this.f94290b + (i10 / this.f94289a.o()));
        }
    }

    public void u(int i10) {
        x(i10 / this.f94289a.o());
    }

    public void v(int i10) {
        z(i10 / this.f94289a.f());
    }

    public void w(k kVar) {
        this.f94289a = kVar;
    }

    public void x(float f10) {
        this.f94290b = f10;
        this.f94294f = Math.round(Math.abs(this.f94292d - f10) * this.f94289a.o());
    }

    public void y(float f10) {
        this.f94292d = f10;
        this.f94294f = Math.round(Math.abs(f10 - this.f94290b) * this.f94289a.o());
    }

    public void z(float f10) {
        this.f94291c = f10;
        this.f94295g = Math.round(Math.abs(this.f94293e - f10) * this.f94289a.f());
    }

    public e(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("texture cannot be null.");
        }
        this.f94289a = kVar;
        o(0, 0, kVar.o(), kVar.f());
    }

    public e(k kVar, int i10, int i11) {
        this.f94289a = kVar;
        o(0, 0, i10, i11);
    }

    public e(k kVar, int i10, int i11, int i12, int i13) {
        this.f94289a = kVar;
        o(i10, i11, i12, i13);
    }

    public e(k kVar, float f10, float f11, float f12, float f13) {
        this.f94289a = kVar;
        n(f10, f11, f12, f13);
    }

    public e(e eVar) {
        q(eVar);
    }

    public e(e eVar, int i10, int i11, int i12, int i13) {
        r(eVar, i10, i11, i12, i13);
    }
}
