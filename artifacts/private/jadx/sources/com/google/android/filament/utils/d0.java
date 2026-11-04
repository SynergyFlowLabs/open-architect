package com.google.android.filament.utils;

import kotlin.e2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScalar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,57:1\n34#1:58\n36#1:59\n*S KotlinDebug\n*F\n+ 1 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n38#1:58\n40#1:59\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f104837a = 3.1415927f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f104838b = 1.5707964f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f104839c = 6.2831855f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f104840d = 12.566371f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f104841e = 0.31830987f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f104842f = 0.15915494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f104843g = 0.07957747f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short f104844h = i.D(e2.n((short) 15360));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short f104845i = i.D(e2.n((short) 16384));

    public static final float a(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static final short b(short s10, short s11, short s12) {
        if (i.z(s10, s11) < 0) {
            return s11;
        }
        return i.z(s10, s12) > 0 ? s12 : s10;
    }

    public static final float c(float f10) {
        return f10 * 57.295776f;
    }

    public static final float d(float f10) {
        return f10 % 1;
    }

    public static final short e() {
        return f104844h;
    }

    public static final short f() {
        return f104845i;
    }

    public static final float g(float f10, float f11, float f12) {
        return (f10 * (1.0f - f12)) + (f11 * f12);
    }

    public static final short h(short s10, short s11, short s12) {
        return i.f0(i.i0(s10, i.a0(e(), s12)), i.i0(s11, s12));
    }

    public static final float i(float f10, float f11) {
        return (float) Math.pow(f10, f11);
    }

    public static final float j(float f10) {
        return f10 * 0.017453292f;
    }

    public static final float k(float f10) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static final short l(short s10) {
        short sK = i.f104900b.k();
        short sE = e();
        if (i.z(s10, sK) < 0) {
            return sK;
        }
        return i.z(s10, sE) > 0 ? sE : s10;
    }

    public static final float m(float f10) {
        return f10 * f10;
    }

    public static final short n(short s10) {
        return i.i0(s10, s10);
    }
}
