package com.google.vr.sdk.base;

import com.google.vr.cardboard.UsedByNative;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class Eye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f127513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f127514b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Viewport f127515c = new Viewport();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f127516d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f127517e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f127518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f127519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f127520h;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127521a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127522b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127523c = 2;
    }

    @UsedByNative
    public Eye(int i10) {
        this.f127513a = i10;
    }

    @UsedByNative
    private void setValues(int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        this.f127515c.setViewport(i10, i11, i12, i13);
        this.f127516d.h(f10, f11, f12, f13);
        this.f127517e = true;
    }

    public e a() {
        return this.f127516d;
    }

    public float[] b(float f10, float f11) {
        if (!this.f127517e && this.f127519g == f10 && this.f127520h == f11) {
            return this.f127518f;
        }
        if (this.f127518f == null) {
            this.f127518f = new float[16];
        }
        a().m(f10, f11, this.f127518f, 0);
        this.f127519g = f10;
        this.f127520h = f11;
        this.f127517e = false;
        return this.f127518f;
    }

    public boolean c() {
        return this.f127517e;
    }

    public int d() {
        return this.f127513a;
    }

    public Viewport e() {
        return this.f127515c;
    }

    public void f() {
        this.f127517e = true;
    }

    @UsedByNative
    public float[] getEyeView() {
        return this.f127514b;
    }
}
