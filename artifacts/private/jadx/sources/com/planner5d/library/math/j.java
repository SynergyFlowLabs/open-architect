package com.planner5d.library.math;

import java.util.List;
import klipper.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public static final double a(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    public static final float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static final <T> T c(@NotNull Function1<? super klipper.b, ? extends T> executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        klipper.b bVar = new klipper.b(0, 1, null);
        T tInvoke = executor.invoke(bVar);
        bVar.c();
        return tInvoke;
    }

    @NotNull
    public static final float[] d(@NotNull List<klipper.k> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArr = new float[list.size() * 2];
        int i10 = 0;
        for (klipper.k kVar : list) {
            int i11 = i10 + 1;
            fArr[i10] = kVar.e();
            i10 += 2;
            fArr[i11] = kVar.f();
        }
        return fArr;
    }

    @NotNull
    public static final List<klipper.k> e(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        List<klipper.k> listC = q.c(new klipper.k[0]);
        for (int i10 = 0; i10 < fArr.length; i10 += 2) {
            listC.add(new klipper.k((long) fArr[i10], (long) fArr[i10 + 1]));
        }
        return listC;
    }

    public static final boolean f(float f10, float f11, float f12) {
        return Math.abs(f10 - f11) <= f12;
    }

    public static final boolean g(float f10, float f11) {
        return Math.abs(f10) <= f11;
    }

    public static /* synthetic */ boolean h(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 1.0E-6f;
        }
        return g(f10, f11);
    }

    public static final float i(float f10) {
        float f11 = f10 % 360.0f;
        float fRint = (float) Math.rint((f11 >= 0.0f ? 360.0f : 0.0f) - f11);
        if (fRint == 360.0f) {
            return 0.0f;
        }
        return fRint;
    }

    public static final double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    public static final double k(double d10) {
        return d10 * 0.017453292519943295d;
    }
}
