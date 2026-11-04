package com.google.vr.ndk.base;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127173b = "DaydreamCompatibility";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127174c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f127175d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f127176e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f127177f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f127178g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f127179h = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f127180a;

    public l(int i10) {
        this.f127180a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public static l a(int i10) {
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 == 2) {
            i11 = 3;
        } else if (i10 != 3) {
            i11 = 0;
        }
        return new l(i11);
    }

    private boolean d() {
        return (this.f127180a & 2) != 0;
    }

    public int b() {
        return this.f127180a;
    }

    public boolean c() {
        return f() && !d();
    }

    public boolean e() {
        return (this.f127180a & 4) != 0;
    }

    public boolean f() {
        return (this.f127180a & 5) != 0;
    }

    public int g() {
        if (c()) {
            return 3;
        }
        return f() ? 2 : 1;
    }

    public l() {
        this(0);
    }
}
