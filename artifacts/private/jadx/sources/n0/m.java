package n0;

import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,423:1\n33#2:424\n53#3,3:425\n60#3:429\n70#3:432\n60#3:434\n70#3:437\n60#3:439\n70#3:442\n60#3:445\n70#3:448\n60#3:451\n70#3:454\n60#3:457\n70#3:460\n60#3:472\n70#3:475\n53#3,3:478\n48#4:428\n53#4:431\n48#4:433\n53#4:436\n48#4:450\n53#4:453\n48#4:456\n53#4:459\n79#4,2:463\n79#4,2:465\n79#4,2:467\n79#4,2:469\n48#4:471\n53#4:474\n86#4:481\n22#5:430\n22#5:435\n22#5:440\n22#5:443\n22#5:446\n22#5:449\n22#5:452\n22#5:455\n22#5:458\n22#5:461\n22#5:473\n22#5:476\n65#6:438\n69#6:441\n65#6:444\n69#6:447\n139#7:462\n30#8:477\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n*L\n235#1:424\n235#1:425,3\n253#1:429\n253#1:432\n273#1:434\n273#1:437\n302#1:439\n303#1:442\n304#1:445\n305#1:448\n325#1:451\n326#1:454\n327#1:457\n328#1:460\n361#1:472\n362#1:475\n383#1:478,3\n253#1:428\n253#1:431\n273#1:433\n273#1:436\n325#1:450\n326#1:453\n327#1:456\n328#1:459\n350#1:463,2\n351#1:465,2\n352#1:467,2\n353#1:469,2\n361#1:471\n362#1:474\n391#1:481\n253#1:430\n273#1:435\n302#1:440\n303#1:443\n304#1:446\n305#1:449\n325#1:452\n326#1:455\n327#1:458\n328#1:461\n361#1:473\n362#1:476\n302#1:438\n303#1:441\n304#1:444\n305#1:447\n345#1:462\n383#1:477\n*E\n"})
public final class m {
    @NotNull
    public static final l a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jE = a.e((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & k0.f265952a));
        return new l(f10, f11, f12, f13, jE, jE, jE, jE, null);
    }

    @NotNull
    public static final l b(@NotNull j jVar, float f10, float f11) {
        return a(jVar.t(), jVar.B(), jVar.x(), jVar.j(), f10, f11);
    }

    @NotNull
    public static final l c(@NotNull j jVar, long j10, long j11, long j12, long j13) {
        return new l(jVar.t(), jVar.B(), jVar.x(), jVar.j(), j10, j11, j12, j13, null);
    }

    @NotNull
    public static final l e(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & k0.f265952a)));
    }

    @NotNull
    public static final l f(@NotNull j jVar, long j10) {
        return b(jVar, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & k0.f265952a)));
    }

    @NotNull
    public static final j g(@NotNull l lVar) {
        return new j(lVar.q(), lVar.s(), lVar.r(), lVar.m());
    }

    public static final long h(@NotNull l lVar) {
        float fQ = lVar.q() + (lVar.v() / 2.0f);
        return g.g((((long) Float.floatToRawIntBits(lVar.s() + (lVar.p() / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(fQ) << 32));
    }

    public static final float i(@NotNull l lVar) {
        return Math.max(Math.abs(lVar.v()), Math.abs(lVar.p()));
    }

    public static final float j(@NotNull l lVar) {
        return Math.min(Math.abs(lVar.v()), Math.abs(lVar.p()));
    }

    @NotNull
    public static final j k(@NotNull l lVar) {
        return new j(lVar.q() + (Math.max(Float.intBitsToFloat((int) (lVar.n() >> 32)), Float.intBitsToFloat((int) (lVar.t() >> 32))) * 0.29289323f), lVar.s() + (Math.max(Float.intBitsToFloat((int) (lVar.t() & k0.f265952a)), Float.intBitsToFloat((int) (lVar.u() & k0.f265952a))) * 0.29289323f), lVar.r() - (Math.max(Float.intBitsToFloat((int) (lVar.u() >> 32)), Float.intBitsToFloat((int) (lVar.o() >> 32))) * 0.29289323f), lVar.m() - (Math.max(Float.intBitsToFloat((int) (lVar.o() & k0.f265952a)), Float.intBitsToFloat((int) (lVar.n() & k0.f265952a))) * 0.29289323f));
    }

    public static final boolean l(@NotNull l lVar) {
        return lVar.v() == lVar.p() && m(lVar);
    }

    public static final boolean m(@NotNull l lVar) {
        return lVar.t() == lVar.u() && lVar.u() == lVar.o() && lVar.o() == lVar.n() && ((double) lVar.v()) <= ((double) Float.intBitsToFloat((int) (lVar.t() >> 32))) * 2.0d && ((double) lVar.p()) <= ((double) Float.intBitsToFloat((int) (lVar.t() & k0.f265952a))) * 2.0d;
    }

    public static final boolean n(@NotNull l lVar) {
        return lVar.q() >= lVar.r() || lVar.s() >= lVar.m();
    }

    public static final boolean o(@NotNull l lVar) {
        return (Float.floatToRawIntBits(lVar.q()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(lVar.s()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(lVar.r()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(lVar.m()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean p(@NotNull l lVar) {
        long jT = lVar.t() & 9223372034707292159L;
        if (((~jT) & (jT - d.f332692g) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jU = lVar.u() & 9223372034707292159L;
        if (((~jU) & (jU - d.f332692g) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jN = lVar.n() & 9223372034707292159L;
        if (((~jN) & (jN - d.f332692g) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jO = lVar.o() & 9223372034707292159L;
        return (((~jO) & (jO - d.f332692g)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean q(@NotNull l lVar) {
        long jT = lVar.t();
        return (jT >>> 32) == (jT & k0.f265952a) && lVar.t() == lVar.u() && lVar.t() == lVar.o() && lVar.t() == lVar.n();
    }

    @NotNull
    public static final l r(@NotNull l lVar, @NotNull l lVar2, float f10) {
        return new l(androidx.compose.ui.util.e.r(lVar.q(), lVar2.q(), f10), androidx.compose.ui.util.e.r(lVar.s(), lVar2.s(), f10), androidx.compose.ui.util.e.r(lVar.r(), lVar2.r(), f10), androidx.compose.ui.util.e.r(lVar.m(), lVar2.m(), f10), b.c(lVar.t(), lVar2.t(), f10), b.c(lVar.u(), lVar2.u(), f10), b.c(lVar.o(), lVar2.o(), f10), b.c(lVar.n(), lVar2.n(), f10), null);
    }

    @NotNull
    public static final l s(@NotNull l lVar, long j10) {
        int i10 = (int) (j10 >> 32);
        float fQ = lVar.q() + Float.intBitsToFloat(i10);
        float fS = lVar.s();
        int i11 = (int) (k0.f265952a & j10);
        return new l(fQ, fS + Float.intBitsToFloat(i11), lVar.r() + Float.intBitsToFloat(i10), Float.intBitsToFloat(i11) + lVar.m(), lVar.t(), lVar.u(), lVar.o(), lVar.n(), null);
    }
}
