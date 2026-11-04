package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float[] f94944a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f94946c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94945b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f94947d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f94948e = true;

    public f0(int i10) {
        this.f94944a = new float[i10];
    }

    public void a(float f10) {
        int i10 = this.f94945b;
        float[] fArr = this.f94944a;
        if (i10 < fArr.length) {
            this.f94945b = i10 + 1;
        }
        int i11 = this.f94946c;
        int i12 = i11 + 1;
        this.f94946c = i12;
        fArr[i11] = f10;
        if (i12 > fArr.length - 1) {
            this.f94946c = 0;
        }
        this.f94948e = true;
    }

    public void b() {
        int i10 = 0;
        this.f94945b = 0;
        this.f94946c = 0;
        while (true) {
            float[] fArr = this.f94944a;
            if (i10 >= fArr.length) {
                this.f94948e = true;
                return;
            } else {
                fArr[i10] = 0.0f;
                i10++;
            }
        }
    }

    public float c() {
        float[] fArr = this.f94944a;
        int length = this.f94946c;
        if (length - 1 == -1) {
            length = fArr.length;
        }
        return fArr[length - 1];
    }

    public float d() {
        float[] fArr;
        float f10 = 0.0f;
        if (!g()) {
            return 0.0f;
        }
        if (this.f94948e) {
            int i10 = 0;
            while (true) {
                fArr = this.f94944a;
                if (i10 >= fArr.length) {
                    break;
                }
                f10 += fArr[i10];
                i10++;
            }
            this.f94947d = f10 / fArr.length;
            this.f94948e = false;
        }
        return this.f94947d;
    }

    public float e() {
        int i10 = this.f94946c;
        float[] fArr = this.f94944a;
        return i10 == fArr.length + (-1) ? fArr[0] : fArr[i10 + 1];
    }

    public int f() {
        return this.f94944a.length;
    }

    public boolean g() {
        return this.f94945b >= this.f94944a.length;
    }

    public float h() {
        float f10 = 0.0f;
        if (!g()) {
            return 0.0f;
        }
        float fD = d();
        int i10 = 0;
        while (true) {
            float[] fArr = this.f94944a;
            if (i10 >= fArr.length) {
                return (float) Math.sqrt(f10 / fArr.length);
            }
            float f11 = fArr[i10];
            f10 += (f11 - fD) * (f11 - fD);
            i10++;
        }
    }
}
