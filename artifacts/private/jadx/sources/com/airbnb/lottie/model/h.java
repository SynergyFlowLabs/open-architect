package com.airbnb.lottie.model;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f88540d = "\r";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f88543c;

    public h(String str, float f10, float f11) {
        this.f88541a = str;
        this.f88543c = f11;
        this.f88542b = f10;
    }

    public float a() {
        return this.f88543c;
    }

    public String b() {
        return this.f88541a;
    }

    public float c() {
        return this.f88542b;
    }

    public boolean d(String str) {
        if (this.f88541a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f88541a.endsWith("\r")) {
            String str2 = this.f88541a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
