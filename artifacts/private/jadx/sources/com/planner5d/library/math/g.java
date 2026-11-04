package com.planner5d.library.math;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f180476a = new g();

    private g() {
    }

    @NotNull
    public final float[] a(@NotNull h tessellator, @NotNull k[] points) {
        Intrinsics.checkNotNullParameter(tessellator, "tessellator");
        Intrinsics.checkNotNullParameter(points, "points");
        ArrayList arrayList = new ArrayList();
        k kVar = null;
        for (k kVar2 : points) {
            if (kVar == null || !Intrinsics.areEqual(kVar, kVar2)) {
                arrayList.add(Float.valueOf(kVar2.f180480a));
                arrayList.add(Float.valueOf(kVar2.f180481b));
                kVar = kVar2;
            }
        }
        float[] fArrF = tessellator.f(CollectionsKt.toFloatArray(arrayList), false);
        arrayList.clear();
        return fArrF;
    }

    @NotNull
    public final float[] b(@NotNull float[][] contours) {
        Intrinsics.checkNotNullParameter(contours, "contours");
        int length = 0;
        for (float[] fArr : contours) {
            length += fArr.length + 1;
        }
        float[] fArr2 = new float[length];
        int length2 = contours.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2) {
            float[] fArr3 = contours[i10];
            int i12 = i11 + 1;
            fArr2[i11] = fArr3.length;
            int length3 = fArr3.length;
            int i13 = 0;
            while (i13 < length3) {
                fArr2[i12] = fArr3[i13];
                i13++;
                i12++;
            }
            i10++;
            i11 = i12;
        }
        return fArr2;
    }
}
