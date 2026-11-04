package com.planner5d.library.math;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    @NotNull
    public static final float[] a(@NotNull k[] kVarArr) {
        Intrinsics.checkNotNullParameter(kVarArr, "<this>");
        float[] fArr = new float[kVarArr.length * 2];
        int length = kVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            k kVar = kVarArr[i10];
            fArr[i11] = kVar.f180480a;
            fArr[i11 + 1] = kVar.f180481b;
        }
        return fArr;
    }
}
