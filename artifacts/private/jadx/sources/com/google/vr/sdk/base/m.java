package com.google.vr.sdk.base;

import android.util.DisplayMetrics;
import android.view.Display;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f127598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f127599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f127600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f127601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f127602e;

    public m(Display display) {
        DisplayMetrics displayMetricsD = com.google.vr.cardboard.g.d(display);
        this.f127600c = com.google.vr.cardboard.g.g(displayMetricsD.xdpi);
        this.f127601d = com.google.vr.cardboard.g.g(displayMetricsD.ydpi);
        this.f127598a = displayMetricsD.widthPixels;
        this.f127599b = displayMetricsD.heightPixels;
        this.f127602e = com.google.vr.cardboard.g.a(null);
        int i10 = this.f127599b;
        int i11 = this.f127598a;
        if (i10 > i11) {
            this.f127598a = i10;
            this.f127599b = i11;
            float f10 = this.f127600c;
            this.f127600c = this.f127601d;
            this.f127601d = f10;
        }
    }

    public static m a(Display display, com.google.vr.sdk.proto.nano.b.a aVar) {
        if (aVar == null) {
            return null;
        }
        m mVar = new m(display);
        if (aVar.v()) {
            mVar.f127600c = com.google.vr.cardboard.g.g(aVar.s());
        }
        if (aVar.w()) {
            mVar.f127601d = com.google.vr.cardboard.g.g(aVar.t());
        }
        mVar.f127602e = com.google.vr.cardboard.g.a(aVar);
        return mVar;
    }

    public float b() {
        return this.f127602e;
    }

    public int c() {
        return this.f127599b;
    }

    public float d() {
        return this.f127599b * this.f127601d;
    }

    public int e() {
        return this.f127598a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f127598a == mVar.f127598a && this.f127599b == mVar.f127599b && this.f127600c == mVar.f127600c && this.f127601d == mVar.f127601d && this.f127602e == mVar.f127602e;
    }

    public float f() {
        return this.f127598a * this.f127600c;
    }

    public void g(float f10) {
        this.f127602e = f10;
    }

    public void h(int i10) {
        this.f127599b = i10;
    }

    public void i(int i10) {
        this.f127598a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        int i10 = this.f127598a;
        StringBuilder sb3 = new StringBuilder(22);
        sb3.append("  width: ");
        sb3.append(i10);
        sb3.append(",\n");
        sb2.append(sb3.toString());
        int i11 = this.f127599b;
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append("  height: ");
        sb4.append(i11);
        sb4.append(",\n");
        sb2.append(sb4.toString());
        float f10 = this.f127600c;
        StringBuilder sb5 = new StringBuilder(39);
        sb5.append("  x_meters_per_pixel: ");
        sb5.append(f10);
        sb5.append(",\n");
        sb2.append(sb5.toString());
        float f11 = this.f127601d;
        StringBuilder sb6 = new StringBuilder(39);
        sb6.append("  y_meters_per_pixel: ");
        sb6.append(f11);
        sb6.append(",\n");
        sb2.append(sb6.toString());
        float f12 = this.f127602e;
        StringBuilder sb7 = new StringBuilder(39);
        sb7.append("  border_size_meters: ");
        sb7.append(f12);
        sb7.append(",\n");
        sb2.append(sb7.toString());
        sb2.append("}");
        return sb2.toString();
    }

    public m(m mVar) {
        this.f127598a = mVar.f127598a;
        this.f127599b = mVar.f127599b;
        this.f127600c = mVar.f127600c;
        this.f127601d = mVar.f127601d;
        this.f127602e = mVar.f127602e;
    }
}
