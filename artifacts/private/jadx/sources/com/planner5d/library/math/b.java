package com.planner5d.library.math;

import java.util.Iterator;
import java.util.List;
import klipper.q;
import klipper.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f180462a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final k f180463b = new k();

    static final class a extends l0 implements Function1<klipper.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float[] f180464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float[] f180465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float[] fArr, float[] fArr2) {
            super(1);
            this.f180464a = fArr;
            this.f180465b = fArr2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull klipper.b clipper) {
            Intrinsics.checkNotNullParameter(clipper, "$this$clipper");
            List<List<klipper.k>> listF = q.f(new List[0]);
            clipper.a(j.e(this.f180464a), z.Subject, true);
            clipper.a(j.e(this.f180465b), z.Clip, true);
            klipper.b.f0(clipper, klipper.a.Intersection, listF, null, 4, null);
            Iterator<T> it = listF.iterator();
            double dN = 0.0d;
            while (it.hasNext()) {
                dN += q.n((List) it.next());
            }
            return Boolean.valueOf(dN > 0.0d);
        }
    }

    private b() {
    }

    public final float a(@NotNull k start, @NotNull k end, @NotNull k point) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(point, "point");
        return j(start, end, point, f180463b).m(point);
    }

    public final boolean b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, @Nullable k kVar) {
        float f18 = f17 - f15;
        float f19 = f12 - f10;
        float f20 = f16 - f14;
        float f21 = f13 - f11;
        float f22 = (f18 * f19) - (f20 * f21);
        if (f22 == 0.0f) {
            return false;
        }
        if (kVar == null) {
            return true;
        }
        float f23 = ((f20 * (f11 - f15)) - (f18 * (f10 - f14))) / f22;
        kVar.U(f10 + (f19 * f23), f11 + (f21 * f23));
        return true;
    }

    public final boolean c(@NotNull k p10, @NotNull k p11, @NotNull k p12, @NotNull k p13, @Nullable k kVar) {
        Intrinsics.checkNotNullParameter(p10, "p1");
        Intrinsics.checkNotNullParameter(p11, "p2");
        Intrinsics.checkNotNullParameter(p12, "p3");
        Intrinsics.checkNotNullParameter(p13, "p4");
        return b(p10.f180480a, p10.f180481b, p11.f180480a, p11.f180481b, p12.f180480a, p12.f180481b, p13.f180480a, p13.f180481b, kVar);
    }

    public final boolean d(@NotNull float[] polygon1, @NotNull float[] polygon2) {
        Intrinsics.checkNotNullParameter(polygon1, "polygon1");
        Intrinsics.checkNotNullParameter(polygon2, "polygon2");
        int length = polygon1.length;
        int i10 = length - 2;
        int length2 = polygon2.length;
        int i11 = length2 - 2;
        float f10 = polygon1[i10];
        float f11 = polygon1[length - 1];
        float f12 = f10;
        int i12 = 0;
        while (i12 <= i10) {
            float f13 = polygon1[i12];
            float f14 = polygon1[i12 + 1];
            float f15 = polygon2[i11];
            int i13 = 0;
            float f16 = polygon2[length2 - 1];
            while (i13 <= i11) {
                float f17 = polygon2[i13];
                float f18 = polygon2[i13 + 1];
                if (f(f12, f11, f13, f14, f15, f16, f17, f18, null)) {
                    return true;
                }
                i13 += 2;
                f15 = f17;
                f16 = f18;
            }
            i12 += 2;
            f12 = f13;
            f11 = f14;
        }
        return false;
    }

    public final boolean e(@NotNull float[] polygon1, @NotNull float[] polygon2) {
        Intrinsics.checkNotNullParameter(polygon1, "polygon1");
        Intrinsics.checkNotNullParameter(polygon2, "polygon2");
        if (i(polygon1, 0, polygon1.length, polygon2[0], polygon2[1]) || i(polygon2, 0, polygon2.length, polygon1[0], polygon1[1])) {
            return true;
        }
        return d(polygon1, polygon2);
    }

    public final boolean f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, @Nullable k kVar) {
        float f18 = f17 - f15;
        float f19 = f12 - f10;
        float f20 = f16 - f14;
        float f21 = f13 - f11;
        float f22 = (f18 * f19) - (f20 * f21);
        if (f22 == 0.0f) {
            return false;
        }
        float f23 = f11 - f15;
        float f24 = f10 - f14;
        float f25 = ((f20 * f23) - (f18 * f24)) / f22;
        if (f25 >= 0.0f && f25 <= 1.0f) {
            float f26 = ((f23 * f19) - (f24 * f21)) / f22;
            if (f26 >= 0.0f && f26 <= 1.0f) {
                if (kVar == null) {
                    return true;
                }
                kVar.U(f10 + (f19 * f25), f11 + (f21 * f25));
                return true;
            }
        }
        return false;
    }

    public final boolean g(@NotNull k p10, @NotNull k p11, @NotNull k p12, @NotNull k p13, @Nullable k kVar) {
        Intrinsics.checkNotNullParameter(p10, "p1");
        Intrinsics.checkNotNullParameter(p11, "p2");
        Intrinsics.checkNotNullParameter(p12, "p3");
        Intrinsics.checkNotNullParameter(p13, "p4");
        return f(p10.f180480a, p10.f180481b, p11.f180480a, p11.f180481b, p12.f180480a, p12.f180481b, p13.f180480a, p13.f180481b, kVar);
    }

    public final boolean h(@NotNull float[] polygonA, @NotNull float[] polygonB) {
        Intrinsics.checkNotNullParameter(polygonA, "polygonA");
        Intrinsics.checkNotNullParameter(polygonB, "polygonB");
        return ((Boolean) j.c(new a(polygonA, polygonB))).booleanValue();
    }

    public final boolean i(@NotNull float[] polygon, int i10, int i11, float f10, float f11) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        float f12 = polygon[i10];
        float f13 = polygon[i10 + 1];
        int i12 = i10 + 3;
        int i13 = i10 + i11;
        boolean z10 = false;
        float f14 = f13;
        while (i12 < i13) {
            float f15 = polygon[i12];
            if ((f15 < f11 && f14 >= f11) || (f14 < f11 && f15 >= f11)) {
                float f16 = polygon[i12 - 1];
                if (f16 + (((f11 - f15) / (f14 - f15)) * (polygon[i12 - 3] - f16)) < f10) {
                    z10 = !z10;
                }
            }
            i12 += 2;
            f14 = f15;
        }
        return (((f13 >= f11 || f14 < f11) && (f14 >= f11 || f13 < f11)) || f12 + (((f11 - f13) / (f14 - f13)) * (polygon[i12 + (-3)] - f12)) >= f10) ? z10 : !z10;
    }

    @NotNull
    public final k j(@NotNull k start, @NotNull k end, @NotNull k point, @NotNull k nearest) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(nearest, "nearest");
        float fO = start.o(end);
        if (fO == 0.0f) {
            return nearest.V(start);
        }
        float f10 = point.f180480a;
        float f11 = start.f180480a;
        float f12 = end.f180480a;
        float f13 = point.f180481b;
        float f14 = start.f180481b;
        float f15 = end.f180481b;
        float f16 = (((f10 - f11) * (f12 - f11)) + ((f13 - f14) * (f15 - f14))) / fO;
        if (f16 < 0.0f) {
            return nearest.V(start);
        }
        return f16 > 1.0f ? nearest.V(end) : nearest.U(f11 + ((f12 - f11) * f16), f14 + (f16 * (f15 - f14)));
    }
}
