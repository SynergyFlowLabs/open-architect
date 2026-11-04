package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public enum v0 {
    fit,
    fill,
    fillX,
    fillY,
    stretch,
    stretchX,
    stretchY,
    none;


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.badlogic.gdx.math.c0 f95795i = new com.badlogic.gdx.math.c0();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95797a;

        static {
            int[] iArr = new int[v0.values().length];
            f95797a = iArr;
            try {
                iArr[v0.fit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95797a[v0.fill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95797a[v0.fillX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95797a[v0.fillY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95797a[v0.stretch.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95797a[v0.stretchX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f95797a[v0.stretchY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f95797a[v0.none.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public com.badlogic.gdx.math.c0 l(float f10, float f11, float f12, float f13) {
        switch (a.f95797a[ordinal()]) {
            case 1:
                float f14 = f13 / f12 > f11 / f10 ? f12 / f10 : f13 / f11;
                com.badlogic.gdx.math.c0 c0Var = f95795i;
                c0Var.f94907a = f10 * f14;
                c0Var.f94908b = f11 * f14;
                break;
            case 2:
                float f15 = f13 / f12 < f11 / f10 ? f12 / f10 : f13 / f11;
                com.badlogic.gdx.math.c0 c0Var2 = f95795i;
                c0Var2.f94907a = f10 * f15;
                c0Var2.f94908b = f11 * f15;
                break;
            case 3:
                float f16 = f12 / f10;
                com.badlogic.gdx.math.c0 c0Var3 = f95795i;
                c0Var3.f94907a = f10 * f16;
                c0Var3.f94908b = f11 * f16;
                break;
            case 4:
                float f17 = f13 / f11;
                com.badlogic.gdx.math.c0 c0Var4 = f95795i;
                c0Var4.f94907a = f10 * f17;
                c0Var4.f94908b = f11 * f17;
                break;
            case 5:
                com.badlogic.gdx.math.c0 c0Var5 = f95795i;
                c0Var5.f94907a = f12;
                c0Var5.f94908b = f13;
                break;
            case 6:
                com.badlogic.gdx.math.c0 c0Var6 = f95795i;
                c0Var6.f94907a = f12;
                c0Var6.f94908b = f11;
                break;
            case 7:
                com.badlogic.gdx.math.c0 c0Var7 = f95795i;
                c0Var7.f94907a = f10;
                c0Var7.f94908b = f13;
                break;
            case 8:
                com.badlogic.gdx.math.c0 c0Var8 = f95795i;
                c0Var8.f94907a = f10;
                c0Var8.f94908b = f11;
                break;
        }
        return f95795i;
    }
}
