package androidx.compose.ui.graphics.colorspace;

import androidx.collection.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,717:1\n326#2:718\n679#3:719\n1#4:720\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n401#1:718\n401#1:719\n401#1:720\n*E\n"})
public final class d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(t(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(v(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    @oj.j
    @NotNull
    public static final c c(@NotNull c cVar, @NotNull m0 m0Var) {
        return e(cVar, m0Var, null, 2, null);
    }

    @oj.j
    @NotNull
    public static final c d(@NotNull c cVar, @NotNull m0 m0Var, @NotNull a aVar) {
        if (b.h(cVar.g(), b.f37572b.c())) {
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            j0 j0Var = (j0) cVar;
            if (!h(j0Var.a0(), m0Var)) {
                return new j0(j0Var, n(f(aVar.d(), j0Var.a0().g(), m0Var.g()), j0Var.Z()), m0Var);
            }
        }
        return cVar;
    }

    public static /* synthetic */ c e(c cVar, m0 m0Var, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.f37566b.a();
        }
        return d(cVar, m0Var, aVar);
    }

    @NotNull
    public static final float[] f(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        float[] fArrP = p(fArr, fArr2);
        float[] fArrP2 = p(fArr, fArr3);
        boolean z10 = false | false;
        return n(m(fArr), o(new float[]{fArrP2[0] / fArrP[0], fArrP2[1] / fArrP[1], fArrP2[2] / fArrP[2]}, fArr));
    }

    public static final boolean g(@NotNull k0 k0Var, @Nullable k0 k0Var2) {
        return k0Var2 != null && Math.abs(k0Var.j() - k0Var2.j()) < 0.001d && Math.abs(k0Var.k() - k0Var2.k()) < 0.001d && Math.abs(k0Var.l() - k0Var2.l()) < 0.001d && Math.abs(k0Var.m() - k0Var2.m()) < 0.002d && Math.abs(k0Var.n() - k0Var2.n()) < 0.001d && Math.abs(k0Var.o() - k0Var2.o()) < 0.001d && Math.abs(k0Var.p() - k0Var2.p()) < 0.001d;
    }

    public static final boolean h(@NotNull m0 m0Var, @NotNull m0 m0Var2) {
        if (m0Var == m0Var2) {
            return true;
        }
        return Math.abs(m0Var.e() - m0Var2.e()) < 0.001f && Math.abs(m0Var.f() - m0Var2.f()) < 0.001f;
    }

    public static final boolean i(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final l j(@NotNull c cVar, @NotNull c cVar2, int i10) {
        int iD = cVar.d();
        int iD2 = cVar2.d();
        if ((iD | iD2) < 0) {
            return l(cVar, cVar2, i10);
        }
        t1<l> t1VarB = m.b();
        int i11 = iD | (iD2 << 6) | (i10 << 12);
        l lVarN = t1VarB.n(i11);
        if (lVarN == null) {
            lVarN = l(cVar, cVar2, i10);
            t1VarB.j0(i11, lVarN);
        }
        return lVarN;
    }

    public static /* synthetic */ l k(c cVar, c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = k.f37611a.K();
        }
        if ((i11 & 2) != 0) {
            i10 = r.f37680b.b();
        }
        return j(cVar, cVar2, i10);
    }

    private static final l l(c cVar, c cVar2, int i10) {
        if (cVar == cVar2) {
            return l.f37644g.c(cVar);
        }
        long jG = cVar.g();
        b.a aVar = b.f37572b;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!b.h(jG, aVar.c()) || !b.h(cVar2.g(), aVar.c())) {
            return new l(cVar, cVar2, i10, defaultConstructorMarker);
        }
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Intrinsics.checkNotNull(cVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new l.b((j0) cVar, (j0) cVar2, i10, defaultConstructorMarker);
    }

    @NotNull
    public static final float[] m(@NotNull float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    @NotNull
    public static final float[] n(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        fArr3[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        fArr3[1] = (f15 * f16) + (f12 * f17) + (f18 * f14);
        float f19 = fArr[2] * f16;
        float f20 = fArr[5];
        float f21 = f19 + (fArr2[1] * f20);
        float f22 = fArr[8];
        fArr3[2] = f21 + (f14 * f22);
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = f24 + (f11 * f25);
        float f27 = fArr2[5];
        fArr3[3] = f26 + (f13 * f27);
        float f28 = fArr[1];
        float f29 = fArr2[3];
        fArr3[4] = (f28 * f29) + (f17 * f25) + (f18 * f27);
        float f30 = fArr[2];
        fArr3[5] = (f29 * f30) + (f20 * fArr2[4]) + (f27 * f22);
        float f31 = f23 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = f31 + (f32 * f33);
        float f35 = fArr2[8];
        fArr3[6] = f34 + (f13 * f35);
        float f36 = fArr2[6];
        fArr3[7] = (f28 * f36) + (fArr[4] * f33) + (f18 * f35);
        fArr3[8] = (f30 * f36) + (fArr[5] * fArr2[7]) + (f22 * f35);
        return fArr3;
    }

    @NotNull
    public static final float[] o(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    @NotNull
    public static final float[] p(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final float q(@NotNull float[] fArr, float f10, float f11, float f12) {
        return (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
    }

    public static final float r(@NotNull float[] fArr, float f10, float f11, float f12) {
        return (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
    }

    public static final float s(@NotNull float[] fArr, float f10, float f11, float f12) {
        return (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
    }

    public static final double t(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double u(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double v(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    public static final double w(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
