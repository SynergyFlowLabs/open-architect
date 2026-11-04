package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c1 f37547a = new c1();

    private c1() {
    }

    @oj.n
    @androidx.annotation.w0(26)
    @NotNull
    public static final ColorSpace e(@NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        ColorSpace colorSpaceA;
        androidx.compose.ui.graphics.colorspace.k kVar = androidx.compose.ui.graphics.colorspace.k.f37611a;
        if (Intrinsics.areEqual(cVar, kVar.K())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.areEqual(cVar, kVar.m())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.areEqual(cVar, kVar.n())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.areEqual(cVar, kVar.o())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.areEqual(cVar, kVar.p())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.areEqual(cVar, kVar.v())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.areEqual(cVar, kVar.w())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.areEqual(cVar, kVar.x())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.areEqual(cVar, kVar.A())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.areEqual(cVar, kVar.B())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.areEqual(cVar, kVar.C())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(cVar, kVar.D())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(cVar, kVar.E())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.areEqual(cVar, kVar.F())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.areEqual(cVar, kVar.I())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.areEqual(cVar, kVar.J())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = f1.a(cVar)) != null) {
            return colorSpaceA;
        }
        if (!(cVar instanceof androidx.compose.ui.graphics.colorspace.j0)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        androidx.compose.ui.graphics.colorspace.j0 j0Var = (androidx.compose.ui.graphics.colorspace.j0) cVar;
        float[] fArrG = j0Var.a0().g();
        androidx.compose.ui.graphics.colorspace.k0 k0VarW = j0Var.W();
        ColorSpace.Rgb.TransferParameters transferParameters = k0VarW != null ? new ColorSpace.Rgb.TransferParameters(k0VarW.j(), k0VarW.k(), k0VarW.l(), k0VarW.m(), k0VarW.n(), k0VarW.o(), k0VarW.p()) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(cVar.h(), j0Var.V(), fArrG, transferParameters);
        }
        String strH = cVar.h();
        float[] fArrV = j0Var.V();
        final Function1<Double, Double> function1Q = j0Var.Q();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.y0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                return c1.f(function1Q, d10);
            }
        };
        final Function1<Double, Double> function1K = j0Var.K();
        return new ColorSpace.Rgb(strH, fArrV, fArrG, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.z0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                return c1.g(function1K, d10);
            }
        }, j0Var.f(0), j0Var.e(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    @oj.n
    @androidx.annotation.w0(26)
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.c h(@NotNull final ColorSpace colorSpace) {
        int id2 = colorSpace.getId();
        if (id2 == ColorSpace.Named.SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.K();
        }
        if (id2 == ColorSpace.Named.ACES.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.m();
        }
        if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.n();
        }
        if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.o();
        }
        if (id2 == ColorSpace.Named.BT2020.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.p();
        }
        if (id2 == ColorSpace.Named.BT709.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.v();
        }
        if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.w();
        }
        if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.x();
        }
        if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.A();
        }
        if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.B();
        }
        if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.C();
        }
        if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.D();
        }
        if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.E();
        }
        if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.F();
        }
        if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.I();
        }
        if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.J();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            androidx.compose.ui.graphics.colorspace.c cVarB = f1.b(colorSpace.getId());
            if (!Intrinsics.areEqual(cVarB, androidx.compose.ui.graphics.colorspace.k.f37611a.N())) {
                return cVarB;
            }
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return androidx.compose.ui.graphics.colorspace.k.f37611a.K();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        return new androidx.compose.ui.graphics.colorspace.j0(rgb.getName(), rgb.getPrimaries(), rgb.getWhitePoint().length == 3 ? new androidx.compose.ui.graphics.colorspace.m0(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new androidx.compose.ui.graphics.colorspace.m0(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]), rgb.getTransform(), new androidx.compose.ui.graphics.colorspace.n() { // from class: androidx.compose.ui.graphics.a1
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return c1.i(colorSpace, d10);
            }
        }, new androidx.compose.ui.graphics.colorspace.n() { // from class: androidx.compose.ui.graphics.b1
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return c1.j(colorSpace, d10);
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0), transferParameters != null ? new androidx.compose.ui.graphics.colorspace.k0(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d10);
    }
}
