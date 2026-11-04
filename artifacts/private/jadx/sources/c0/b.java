package c0;

import androidx.compose.runtime.internal.w0;
import androidx.core.graphics.h;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCamUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CamUtils.android.kt\nandroidx/compose/material3/internal/colorUtil/CamUtils\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,278:1\n125#2:279\n133#2:280\n141#2:281\n125#2:282\n133#2:283\n141#2:284\n*S KotlinDebug\n*F\n+ 1 CamUtils.android.kt\nandroidx/compose/material3/internal/colorUtil/CamUtils\n*L\n228#1:279\n229#1:280\n230#1:281\n237#1:282\n238#1:283\n239#1:284\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f82345a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final float[][] f82346b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final float[][] f82347c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final float[] f82348d = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final double[][] f82349e = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final double[][] f82350f = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f82351g = 8;

    private b() {
    }

    private final int c(int i10, int i11, int i12) {
        return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
    }

    private final int d(double d10, double d11, double d12) {
        double[][] dArr = f82350f;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        return c(f(d13), f(d14), f((dArr4[0] * d10) + (dArr4[1] * d11) + (dArr4[2] * d12)));
    }

    private final int e(int i10, int i11, int i12) {
        if (i12 < i10) {
            return i10;
        }
        return i12 > i11 ? i11 : i12;
    }

    private final int f(double d10) {
        double d11 = d10 / 100.0d;
        return e(0, 255, (int) Math.round((d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    private final float k(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4f)) * 100.0f;
    }

    private final float m(float f10) {
        float f11 = f10 / 100.0f;
        return f11 <= 0.008856452f ? f11 * 903.2963f : (((float) Math.cbrt(f11)) * 116.0f) - 16.0f;
    }

    private final float p(int i10) {
        float fK = k((i10 >> 16) & 255);
        float fK2 = k((i10 >> 8) & 255);
        float fK3 = k(i10 & 255);
        double[] dArr = f82349e[1];
        return (float) ((((double) fK) * dArr[0]) + (((double) fK2) * dArr[1]) + (((double) fK3) * dArr[2]));
    }

    public final int a(double d10, double d11, double d12) {
        return c(f(d10), f(d11), f(d12));
    }

    public final int b(double d10) {
        double d11 = (d10 + 16.0d) / 116.0d;
        double d12 = d10 > 8.0d ? d11 * d11 * d11 : d10 / 903.2962962962963d;
        double d13 = d11 * d11 * d11;
        boolean z10 = d13 > 0.008856451679035631d;
        double d14 = z10 ? d13 : d10 / 903.2962962962963d;
        if (!z10) {
            d13 = d10 / 903.2962962962963d;
        }
        float[] fArr = f82348d;
        return d(d14 * ((double) fArr[0]), d12 * ((double) fArr[1]), d13 * ((double) fArr[2]));
    }

    @NotNull
    public final float[][] g() {
        return f82347c;
    }

    @NotNull
    public final float[] h() {
        return f82348d;
    }

    @NotNull
    public final float[][] i() {
        return f82346b;
    }

    public final int j(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f82348d;
        return h.h(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public final float l(int i10) {
        return m(p(i10));
    }

    public final int n(double d10) {
        if (d10 < 0.0d) {
            return -1;
        }
        return d10 == 0.0d ? 0 : 1;
    }

    @NotNull
    public final float[] o(int i10) {
        float fK = k((i10 >> 16) & 255);
        float fK2 = k((i10 >> 8) & 255);
        float fK3 = k(i10 & 255);
        double[][] dArr = f82349e;
        double d10 = fK;
        double[] dArr2 = dArr[0];
        double d11 = fK2;
        double d12 = fK3;
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        return new float[]{(float) d13, (float) d14, (float) ((d10 * dArr4[0]) + (d11 * dArr4[1]) + (d12 * dArr4[2]))};
    }

    public final double q(double d10) {
        return d10 > 8.0d ? Math.pow((d10 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d10 / 903.2962962962963d) * 100.0d;
    }
}
