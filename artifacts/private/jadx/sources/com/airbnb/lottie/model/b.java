package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.b1;
import androidx.annotation.l;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f88363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f88364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f88365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f88366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f88368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f88369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    public int f88370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l
    public int f88371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f88372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f88373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    public PointF f88374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    public PointF f88375m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, @l int i11, @l int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, @l int i11, @l int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f88363a = str;
        this.f88364b = str2;
        this.f88365c = f10;
        this.f88366d = aVar;
        this.f88367e = i10;
        this.f88368f = f11;
        this.f88369g = f12;
        this.f88370h = i11;
        this.f88371i = i12;
        this.f88372j = f13;
        this.f88373k = z10;
        this.f88374l = pointF;
        this.f88375m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f88363a.hashCode() * 31) + this.f88364b.hashCode()) * 31) + this.f88365c)) * 31) + this.f88366d.ordinal()) * 31) + this.f88367e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f88368f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f88370h;
    }

    public b() {
    }
}
