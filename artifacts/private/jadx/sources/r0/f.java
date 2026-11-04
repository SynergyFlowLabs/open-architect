package r0;

import androidx.compose.ui.input.pointer.c0;
import androidx.compose.ui.input.pointer.r;
import androidx.compose.ui.o;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,725:1\n687#1:736\n694#1,2:737\n690#1,6:739\n687#1:745\n687#1:746\n682#1:747\n669#1:749\n669#1:750\n35#2,5:726\n35#2,5:731\n69#3:748\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n506#1:736\n508#1:737,2\n510#1:739,6\n517#1:745\n519#1:746\n532#1:747\n654#1:749\n660#1:750\n403#1:726,5\n441#1:731,5\n532#1:748\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f359050a = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f359051b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f359052c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f359053d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f359054e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f359055f;

    private static final float[][] a(int i10, int i11) {
        float[][] fArr = new float[i10][];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = new float[i11];
        }
        return fArr;
    }

    public static final void d(@NotNull e eVar, @NotNull c0 c0Var) {
        e(eVar, c0Var, g.f332700b.e());
    }

    public static final void e(@NotNull e eVar, @NotNull c0 c0Var, long j10) {
        if (f359054e) {
            g(eVar, c0Var, j10);
        } else {
            f(eVar, c0Var, j10);
        }
    }

    private static final void f(e eVar, c0 c0Var, long j10) {
        if (r.c(c0Var)) {
            eVar.g(c0Var.u());
            eVar.f();
        }
        long jY = c0Var.y();
        List<androidx.compose.ui.input.pointer.f> listR = c0Var.r();
        int size = listR.size();
        int i10 = 0;
        while (i10 < size) {
            androidx.compose.ui.input.pointer.f fVar = listR.get(i10);
            long jV = g.v(fVar.b(), jY);
            long jB = fVar.b();
            eVar.g(g.w(eVar.d(), jV));
            eVar.a(fVar.c(), g.w(eVar.d(), j10));
            i10++;
            jY = jB;
        }
        eVar.g(g.w(eVar.d(), g.v(c0Var.u(), jY)));
        eVar.a(c0Var.D(), g.w(eVar.d(), j10));
    }

    private static final void g(e eVar, c0 c0Var, long j10) {
        if (r.c(c0Var)) {
            eVar.f();
        }
        if (!r.e(c0Var)) {
            List<androidx.compose.ui.input.pointer.f> listR = c0Var.r();
            int size = listR.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.input.pointer.f fVar = listR.get(i10);
                eVar.a(fVar.c(), g.w(fVar.a(), j10));
            }
            eVar.a(c0Var.D(), g.w(c0Var.t(), j10));
        }
        if (r.e(c0Var) && c0Var.D() - eVar.e() > 40) {
            eVar.f();
        }
        eVar.h(c0Var.D());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float[] fArr, float[] fArr2, int i10, boolean z10) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float fSignum = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f11 = fArr2[i13];
            if (f10 != f11) {
                float f12 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f11);
                fSignum += (f12 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f12);
                if (i12 == i11) {
                    fSignum *= 0.5f;
                }
            }
            i12--;
            f10 = f11;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float i(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    private static final float j(float[][] fArr, int i10, int i11) {
        return fArr[i10][i11];
    }

    public static final boolean k() {
        return f359054e;
    }

    @o
    public static /* synthetic */ void l() {
    }

    public static final boolean m() {
        return f359055f;
    }

    @b
    public static /* synthetic */ void n() {
    }

    private static final float o(float f10) {
        return Math.signum(f10) * ((float) Math.sqrt(2 * Math.abs(f10)));
    }

    private static final float p(float[] fArr) {
        return (float) Math.sqrt(i(fArr, fArr));
    }

    @NotNull
    public static final float[] q(@NotNull float[] fArr, @NotNull float[] fArr2, int i10, int i11, @NotNull float[] fArr3) {
        int i12 = i11;
        if (i12 < 1) {
            s0.a.g("The degree must be at positive integer");
        }
        if (i10 == 0) {
            s0.a.g("At least one point must be provided");
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i10];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            ArraysKt.copyInto(fArr4[i19], fArr7, 0, 0, i10);
            for (int i20 = 0; i20 < i19; i20++) {
                float[] fArr8 = fArr5[i20];
                float fI = i(fArr7, fArr8);
                for (int i21 = 0; i21 < i10; i21++) {
                    fArr7[i21] = fArr7[i21] - (fArr8[i21] * fI);
                }
            }
            float fSqrt = (float) Math.sqrt(i(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i22 = 0; i22 < i10; i22++) {
                fArr7[i22] = fArr7[i22] * f10;
            }
            float[] fArr9 = fArr6[i19];
            int i23 = 0;
            while (i23 < i13) {
                fArr9[i23] = i23 < i19 ? 0.0f : i(fArr7, fArr4[i23]);
                i23++;
            }
            i19++;
        }
        for (int i24 = i12; -1 < i24; i24--) {
            float fI2 = i(fArr5[i24], fArr2);
            float[] fArr10 = fArr6[i24];
            int i25 = i24 + 1;
            if (i25 <= i12) {
                int i26 = i12;
                while (true) {
                    fI2 -= fArr10[i26] * fArr3[i26];
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            fArr3[i24] = fI2 / fArr10[i24];
        }
        return fArr3;
    }

    public static /* synthetic */ float[] r(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            fArr3 = new float[kotlin.ranges.r.u(i11 + 1, 0)];
        }
        return q(fArr, fArr2, i10, i11, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(a[] aVarArr, int i10, long j10, float f10) {
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVarArr[i10] = new a(j10, f10);
        } else {
            aVar.h(j10);
            aVar.g(f10);
        }
    }

    private static final void t(float[][] fArr, int i10, int i11, float f10) {
        fArr[i10][i11] = f10;
    }

    public static final void u(boolean z10) {
        f359054e = z10;
    }

    public static final void v(boolean z10) {
        f359055f = z10;
    }
}
