package com.planner5d.library.math;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f180477a;

    public interface a {
        @NotNull
        float[] a(@NotNull float[][] fArr);
    }

    public h(@NotNull a implementation) {
        Intrinsics.checkNotNullParameter(implementation, "implementation");
        this.f180477a = implementation;
    }

    private final boolean a(float[] fArr, int i10, int i11) {
        int i12;
        int i13;
        float f10 = 0.0f;
        int i14 = i10;
        while (true) {
            i12 = i10 + i11;
            i13 = i12 - 2;
            if (i14 >= i13) {
                break;
            }
            int i15 = i14 + 2;
            f10 += (fArr[i15] - fArr[i14]) * (fArr[i14 + 3] + fArr[i14 + 1]);
            i14 = i15;
        }
        return f10 + ((fArr[i10] - fArr[i13]) * (fArr[i12 - 1] + fArr[i10 + 1])) > 0.0f;
    }

    private final void b(float[] fArr, int i10, int i11) {
        float[] fArr2 = new float[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            fArr2[i13] = fArr[i10 + i13];
        }
        for (int i14 = i11 - 2; i14 >= 0; i14 -= 2) {
            int i15 = i12 + 1;
            fArr[i10 + i12] = fArr2[i14];
            i12 += 2;
            fArr[i15 + i10] = fArr2[i14 + 1];
        }
    }

    private final void d(float[] fArr, boolean z10, int i10, int i11) {
        if (fArr.length == 0) {
            return;
        }
        if (a(fArr, i10, i11)) {
            if (z10) {
                b(fArr, i10, i11);
            }
        } else {
            if (z10) {
                return;
            }
            b(fArr, i10, i11);
        }
    }

    private final float[] e(float[] fArr, boolean z10) {
        for (int i10 = 0; i10 < fArr.length; i10 += 6) {
            d(fArr, z10, i10, 6);
        }
        return fArr;
    }

    public final void c(@NotNull float[] points, boolean z10) {
        Intrinsics.checkNotNullParameter(points, "points");
        d(points, z10, 0, points.length);
    }

    @NotNull
    public final float[] f(@NotNull float[] polygon, boolean z10) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        return g(polygon, new float[0][], z10);
    }

    @NotNull
    public final float[] g(@NotNull float[] polygon, @NotNull float[][] holes, boolean z10) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        Intrinsics.checkNotNullParameter(holes, "holes");
        c(polygon, false);
        List listMutableListOf = CollectionsKt.mutableListOf(polygon);
        for (float[] fArr : holes) {
            if (!(fArr.length == 0)) {
                c(fArr, true);
                listMutableListOf.add(fArr);
            }
        }
        Object[] array = listMutableListOf.toArray(new float[0][]);
        if (array != null) {
            return i((float[][]) array, z10);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final float[] h(@NotNull k[] polygon, boolean z10) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        float[] fArr = new float[polygon.length * 2];
        for (int i10 = 0; i10 < polygon.length; i10++) {
            int i11 = i10 * 2;
            k kVar = polygon[i10];
            fArr[i11] = kVar.f180480a;
            fArr[i11 + 1] = kVar.f180481b;
        }
        return f(fArr, z10);
    }

    @NotNull
    public final float[] i(@Nullable float[][] fArr, boolean z10) {
        if (fArr != null && fArr.length != 0) {
            return e(this.f180477a.a(fArr), z10);
        }
        return new float[0];
    }
}
