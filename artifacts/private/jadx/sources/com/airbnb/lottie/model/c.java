package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f88383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Typeface f88384e;

    public c(String str, String str2, String str3, float f10) {
        this.f88380a = str;
        this.f88381b = str2;
        this.f88382c = str3;
        this.f88383d = f10;
    }

    float a() {
        return this.f88383d;
    }

    public String b() {
        return this.f88380a;
    }

    public String c() {
        return this.f88381b;
    }

    public String d() {
        return this.f88382c;
    }

    @p0
    public Typeface e() {
        return this.f88384e;
    }

    public void f(@p0 Typeface typeface) {
        this.f88384e = typeface;
    }
}
