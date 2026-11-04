package com.badlogic.gdx.graphics.g2d;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float[] f94285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f94286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final short[] f94287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final e f94288d;

    public d(e eVar, float[] fArr, short[] sArr) {
        this.f94288d = eVar;
        this.f94286b = fArr;
        this.f94287c = sArr;
        float[] fArr2 = new float[fArr.length];
        this.f94285a = fArr2;
        float f10 = eVar.f94290b;
        float f11 = eVar.f94291c;
        float f12 = eVar.f94292d - f10;
        float f13 = eVar.f94293e - f11;
        int i10 = eVar.f94294f;
        int i11 = eVar.f94295g;
        int length = fArr.length;
        for (int i12 = 0; i12 < length; i12 += 2) {
            fArr2[i12] = ((fArr[i12] / i10) * f12) + f10;
            int i13 = i12 + 1;
            fArr2[i13] = ((1.0f - (fArr[i13] / i11)) * f13) + f11;
        }
    }

    public e a() {
        return this.f94288d;
    }

    public float[] b() {
        return this.f94285a;
    }

    public short[] c() {
        return this.f94287c;
    }

    public float[] d() {
        return this.f94286b;
    }
}
