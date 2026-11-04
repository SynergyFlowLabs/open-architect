package androidx.compose.material3.carousel;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nKeylines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keylines.kt\nandroidx/compose/material3/carousel/KeylinesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
public final class w0 {
    private static final float c(float f10, float f11, float f12) {
        float fMax = Math.max(1.5f * f12, f10);
        float f13 = 0.85f * f11;
        if (fMax > f13) {
            fMax = Math.min(Math.max(f13, f12 * 1.2f), f11);
        }
        return fMax;
    }

    @NotNull
    public static final p0 d(float f10, float f11, final float f12, final float f13, @NotNull final a aVar) {
        return q0.c(f10, f11, b.f26536b.a(), new Function1() { // from class: androidx.compose.material3.carousel.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.e(f12, aVar, f13, (r0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(float f10, a aVar, float f11, r0 r0Var) {
        r0Var.a(f10, true);
        int iG = aVar.g() / 2;
        for (int i10 = 0; i10 < iG; i10++) {
            r0.b(r0Var, aVar.h(), false, 2, null);
        }
        int iE = aVar.e() / 2;
        for (int i11 = 0; i11 < iE; i11++) {
            r0.b(r0Var, aVar.f(), false, 2, null);
        }
        int iC = aVar.c();
        for (int i12 = 0; i12 < iC; i12++) {
            r0.b(r0Var, aVar.d(), false, 2, null);
        }
        int iE2 = aVar.e() / 2;
        for (int i13 = 0; i13 < iE2; i13++) {
            r0.b(r0Var, aVar.f(), false, 2, null);
        }
        int iG2 = aVar.g() / 2;
        for (int i14 = 0; i14 < iG2; i14++) {
            r0.b(r0Var, aVar.h(), false, 2, null);
        }
        r0Var.a(f11, true);
        return Unit.f312394a;
    }

    @NotNull
    public static final p0 f(float f10, float f11, final float f12, final float f13, @NotNull final a aVar) {
        return q0.c(f10, f11, b.f26536b.c(), new Function1() { // from class: androidx.compose.material3.carousel.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.g(f12, aVar, f13, (r0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(float f10, a aVar, float f11, r0 r0Var) {
        r0Var.a(f10, true);
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            r0.b(r0Var, aVar.d(), false, 2, null);
        }
        int iE = aVar.e();
        for (int i11 = 0; i11 < iE; i11++) {
            r0.b(r0Var, aVar.f(), false, 2, null);
        }
        int iG = aVar.g();
        for (int i12 = 0; i12 < iG; i12++) {
            r0.b(r0Var, aVar.h(), false, 2, null);
        }
        r0Var.a(f11, true);
        return Unit.f312394a;
    }

    @NotNull
    public static final p0 h(@NotNull androidx.compose.ui.unit.d dVar, float f10, @Nullable Float f11, float f12, int i10, boolean z10, float f13, float f14) {
        if (f10 == 0.0f) {
            return q0.a();
        }
        boolean z11 = z10 && i10 >= 3;
        int[] iArr = new int[1];
        if (z11) {
            iArr[0] = 2;
        } else {
            iArr[0] = 1;
        }
        float fMin = Math.min(f11 != null ? f11.floatValue() : f10, f10);
        float fH = kotlin.ranges.r.H(fMin / 3.0f, f13, f14);
        if (f10 < (ArraysKt.maxOrThrow(iArr) * f13) + (1.25f * f13)) {
            iArr = new int[]{0};
        }
        int iMax = Math.max(1, (int) Math.floor((f10 - (ArraysKt.maxOrThrow(iArr) * f13)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i11 = (iCeil - iMax) + 1;
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr2[i12] = iCeil - i12;
        }
        float fS7 = dVar.S7(c.f26546a.a());
        a aVarB = a.f26523h.b(f10, f12, fH, f13, f14, iArr, 0.0f, new int[]{0}, fMin, iArr2);
        if (aVarB == null) {
            return q0.a();
        }
        return (!z11 || i10 < aVarB.j()) ? f(f10, f12, fS7, fS7, aVarB) : d(f10, f12, fS7, fS7, aVarB);
    }

    public static /* synthetic */ p0 i(androidx.compose.ui.unit.d dVar, float f10, Float f11, float f12, int i10, boolean z10, float f13, float f14, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 64) != 0) {
            f13 = dVar.S7(c.f26546a.c());
        }
        float f15 = f13;
        if ((i11 & 128) != 0) {
            f14 = dVar.S7(c.f26546a.b());
        }
        return h(dVar, f10, f11, f12, i10, z11, f15, f14);
    }

    @NotNull
    public static final p0 j(@NotNull androidx.compose.ui.unit.d dVar, float f10, float f11, float f12, int i10, float f13, float f14) {
        float f15;
        if (f10 == 0.0f || f11 == 0.0f) {
            return q0.a();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f11, f10);
        float fH = kotlin.ranges.r.H(fMin / 3.0f, f13, f14);
        float f16 = (fMin + fH) / 2.0f;
        if (f10 < 2 * f13) {
            iArr = new int[]{0};
        }
        int[] iArr3 = iArr;
        int iMax = Math.max(1, (int) Math.floor(((f10 - (ArraysKt.maxOrThrow(iArr2) * f16)) - (ArraysKt.maxOrThrow(iArr3) * f14)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i11 = (iCeil - iMax) + 1;
        int[] iArr4 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr4[i12] = iCeil - i12;
        }
        float fS7 = dVar.S7(c.f26546a.a());
        a aVarB = a.f26523h.b(f10, f12, fH, f13, f14, iArr3, f16, iArr2, fMin, iArr4);
        if (aVarB == null || aVarB.j() <= i10) {
            f15 = f10;
        } else {
            int iG = aVarB.g();
            int iE = aVarB.e();
            for (int iJ = aVarB.j() - i10; iJ > 0; iJ--) {
                if (iG > 0) {
                    iG--;
                } else if (iE > 1) {
                    iE--;
                }
            }
            f15 = f10;
            aVarB = a.f26523h.b(f15, f12, fH, f13, f14, new int[]{iG}, f16, new int[]{iE}, fMin, iArr4);
        }
        return aVarB == null ? q0.a() : f(f15, f12, fS7, fS7, aVarB);
    }

    public static /* synthetic */ p0 k(androidx.compose.ui.unit.d dVar, float f10, float f11, float f12, int i10, float f13, float f14, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            f13 = dVar.S7(c.f26546a.c());
        }
        float f15 = f13;
        if ((i11 & 64) != 0) {
            f14 = dVar.S7(c.f26546a.b());
        }
        return j(dVar, f10, f11, f12, i10, f15, f14);
    }

    @NotNull
    public static final p0 l(@NotNull androidx.compose.ui.unit.d dVar, float f10, float f11, float f12) {
        if (f10 != 0.0f && f11 != 0.0f) {
            float fMin = Math.min(f11 + f12, f10);
            int iMax = Math.max(1, (int) Math.floor(f10 / fMin));
            float f13 = f10 - (iMax * fMin);
            int i10 = f13 <= 0.0f ? 0 : 1;
            float fS7 = dVar.S7(c.f26546a.a());
            float fC = c(fS7, fMin, f13);
            return f(f10, f12, Math.max(Math.min(fS7, f11), fC * 0.5f), fS7, new a(0, 0.0f, 0, fC, i10, fMin, iMax));
        }
        return q0.a();
    }
}
