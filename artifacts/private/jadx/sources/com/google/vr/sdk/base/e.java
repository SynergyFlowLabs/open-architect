package com.google.vr.sdk.base;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f127539e = 60.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f127540f = 60.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f127541g = 60.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f127542h = 40.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f127543i = 40.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f127544j = 40.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f127545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f127546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f127547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f127548d;

    public e() {
        this.f127545a = 60.0f;
        this.f127546b = 60.0f;
        this.f127547c = 60.0f;
        this.f127548d = 60.0f;
    }

    public static e a() {
        e eVar = new e();
        eVar.h(40.0f, 40.0f, 40.0f, 40.0f);
        return eVar;
    }

    public static e g(float[] fArr) {
        if (fArr.length != 4) {
            return null;
        }
        return new e(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public void b(e eVar) {
        this.f127545a = eVar.f127545a;
        this.f127546b = eVar.f127546b;
        this.f127547c = eVar.f127547c;
        this.f127548d = eVar.f127548d;
    }

    public float c() {
        return this.f127547c;
    }

    public float d() {
        return this.f127545a;
    }

    public float e() {
        return this.f127546b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f127545a == eVar.f127545a && this.f127546b == eVar.f127546b && this.f127547c == eVar.f127547c && this.f127548d == eVar.f127548d;
    }

    public float f() {
        return this.f127548d;
    }

    public void h(float f10, float f11, float f12, float f13) {
        this.f127545a = f10;
        this.f127546b = f11;
        this.f127547c = f12;
        this.f127548d = f13;
    }

    public void i(float f10) {
        this.f127547c = f10;
    }

    public void j(float f10) {
        this.f127545a = f10;
    }

    public void k(float f10) {
        this.f127546b = f10;
    }

    public void l(float f10) {
        this.f127548d = f10;
    }

    public void m(float f10, float f11, float[] fArr, int i10) {
        if (i10 + 16 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        Matrix.frustumM(fArr, i10, ((float) (-Math.tan(Math.toRadians(this.f127545a)))) * f10, ((float) Math.tan(Math.toRadians(this.f127546b))) * f10, ((float) (-Math.tan(Math.toRadians(this.f127547c)))) * f10, ((float) Math.tan(Math.toRadians(this.f127548d))) * f10, f10, f11);
    }

    public float[] n() {
        return new float[]{this.f127545a, this.f127546b, this.f127547c, this.f127548d};
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        float f10 = this.f127545a;
        StringBuilder sb3 = new StringBuilder(25);
        sb3.append("  left: ");
        sb3.append(f10);
        sb3.append(",\n");
        sb2.append(sb3.toString());
        float f11 = this.f127546b;
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("  right: ");
        sb4.append(f11);
        sb4.append(",\n");
        sb2.append(sb4.toString());
        float f12 = this.f127547c;
        StringBuilder sb5 = new StringBuilder(27);
        sb5.append("  bottom: ");
        sb5.append(f12);
        sb5.append(",\n");
        sb2.append(sb5.toString());
        float f13 = this.f127548d;
        StringBuilder sb6 = new StringBuilder(24);
        sb6.append("  top: ");
        sb6.append(f13);
        sb6.append(",\n");
        sb2.append(sb6.toString());
        sb2.append("}");
        return sb2.toString();
    }

    public e(float f10, float f11, float f12, float f13) {
        h(f10, f11, f12, f13);
    }

    public e(e eVar) {
        b(eVar);
    }
}
