package com.airbnb.lottie;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f88952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f88953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f88955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f88956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private Bitmap f88957f;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public x0(int i10, int i11, String str, String str2, String str3) {
        this.f88952a = i10;
        this.f88953b = i11;
        this.f88954c = str;
        this.f88955d = str2;
        this.f88956e = str3;
    }

    public x0 a(float f10) {
        x0 x0Var = new x0((int) (this.f88952a * f10), (int) (this.f88953b * f10), this.f88954c, this.f88955d, this.f88956e);
        Bitmap bitmap = this.f88957f;
        if (bitmap != null) {
            x0Var.i(Bitmap.createScaledBitmap(bitmap, x0Var.f88952a, x0Var.f88953b, true));
        }
        return x0Var;
    }

    @androidx.annotation.p0
    public Bitmap b() {
        return this.f88957f;
    }

    public String c() {
        return this.f88956e;
    }

    public String d() {
        return this.f88955d;
    }

    public int e() {
        return this.f88953b;
    }

    public String f() {
        return this.f88954c;
    }

    public int g() {
        return this.f88952a;
    }

    public boolean h() {
        if (this.f88957f == null) {
            return this.f88955d.startsWith("data:") && this.f88955d.indexOf("base64,") > 0;
        }
        return true;
    }

    public void i(@androidx.annotation.p0 Bitmap bitmap) {
        this.f88957f = bitmap;
    }
}
