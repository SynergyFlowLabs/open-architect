package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,435:1\n97#1:436\n254#1:441\n363#1:448\n424#1:458\n429#1:460\n139#2:437\n53#3,3:438\n53#3,3:442\n53#3,3:445\n53#3,3:450\n53#3,3:453\n58#4:449\n52#4:456\n52#4:457\n52#4:459\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n108#1:436\n265#1:441\n374#1:448\n434#1:458\n434#1:460\n166#1:437\n188#1:438,3\n280#1:442,3\n287#1:445,3\n379#1:450,3\n397#1:453,3\n379#1:449\n424#1:456\n429#1:457\n434#1:459\n*E\n"})
public final class i {
    @k7
    public static /* synthetic */ void A(long j10) {
    }

    public static final boolean B(float f10) {
        return Float.isNaN(f10);
    }

    @k7
    public static /* synthetic */ void C(float f10) {
    }

    public static final boolean D(long j10) {
        return j10 == n0.d.f332689d;
    }

    @k7
    public static /* synthetic */ void E(long j10) {
    }

    public static final boolean F(long j10) {
        return j10 == n0.d.f332689d;
    }

    @k7
    public static /* synthetic */ void G(long j10) {
    }

    @k7
    public static final long H(long j10, long j11, float f10) {
        float fI = I(l.p(j10), l.p(j11), f10);
        float fI2 = I(l.m(j10), l.m(j11), f10);
        return l.f((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI2)) & k0.f265952a));
    }

    @k7
    public static final float I(float f10, float f11, float f12) {
        return h.r(androidx.compose.ui.util.e.r(f10, f11, f12));
    }

    @k7
    public static final long J(long j10, long j11, float f10) {
        float fR = androidx.compose.ui.util.e.r(j.j(j10), j.j(j11), f10);
        float fR2 = androidx.compose.ui.util.e.r(j.l(j10), j.l(j11), f10);
        return j.d((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & k0.f265952a));
    }

    @k7
    public static final float K(float f10, float f11) {
        return h.r(Math.max(f10, f11));
    }

    @k7
    public static final float L(float f10, float f11) {
        return h.r(Math.min(f10, f11));
    }

    public static final float M(float f10, @NotNull Function0<h> function0) {
        return !Float.isNaN(f10) ? f10 : function0.invoke().O();
    }

    public static final long N(long j10, @NotNull Function0<j> function0) {
        return j10 != n0.d.f332689d ? j10 : function0.invoke().r();
    }

    public static final long O(long j10, @NotNull Function0<l> function0) {
        return j10 != n0.d.f332689d ? j10 : function0.invoke().x();
    }

    @k7
    public static final float P(double d10, float f10) {
        return h.r(((float) d10) * f10);
    }

    @k7
    public static final float Q(float f10, float f11) {
        return h.r(f10 * f11);
    }

    @k7
    public static final float R(int i10, float f10) {
        return h.r(i10 * f10);
    }

    @k7
    public static final long S(float f10, long j10) {
        return l.u(j10, f10);
    }

    @k7
    public static final long T(int i10, long j10) {
        return l.v(j10, i10);
    }

    @k7
    public static final long a(float f10, float f11) {
        return j.d((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    @k7
    public static final long b(float f10, float f11) {
        return l.f((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    @k7
    public static final float c(float f10, float f11) {
        return h.r(kotlin.ranges.r.t(f10, f11));
    }

    @k7
    public static final float d(float f10, float f11) {
        return h.r(kotlin.ranges.r.A(f10, f11));
    }

    @k7
    public static final float e(float f10, float f11, float f12) {
        return h.r(kotlin.ranges.r.H(f10, f11, f12));
    }

    public static final long f(long j10) {
        float fR = h.r(l.p(j10) / 2.0f);
        return j.d((((long) Float.floatToRawIntBits(h.r(l.m(j10) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(fR) << 32));
    }

    @k7
    public static /* synthetic */ void g(long j10) {
    }

    public static final float h(double d10) {
        return h.r((float) d10);
    }

    public static final float i(float f10) {
        return h.r(f10);
    }

    public static final float j(int i10) {
        return h.r(i10);
    }

    @k7
    public static /* synthetic */ void k(double d10) {
    }

    @k7
    public static /* synthetic */ void l(float f10) {
    }

    @k7
    public static /* synthetic */ void m(int i10) {
    }

    public static final float n(@NotNull k kVar) {
        return h.r(kVar.g() - kVar.m());
    }

    @k7
    public static /* synthetic */ void o(k kVar) {
    }

    public static final long p(@NotNull k kVar) {
        return b(h.r(kVar.k() - kVar.i()), h.r(kVar.g() - kVar.m()));
    }

    @k7
    public static /* synthetic */ void q(k kVar) {
    }

    public static final float r(@NotNull k kVar) {
        return h.r(kVar.k() - kVar.i());
    }

    @k7
    public static /* synthetic */ void s(k kVar) {
    }

    public static final boolean t(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040;
    }

    @k7
    public static /* synthetic */ void u(float f10) {
    }

    public static final boolean v(float f10) {
        return !Float.isNaN(f10);
    }

    @k7
    public static /* synthetic */ void w(float f10) {
    }

    public static final boolean x(long j10) {
        return j10 != n0.d.f332689d;
    }

    @k7
    public static /* synthetic */ void y(long j10) {
    }

    public static final boolean z(long j10) {
        if (j10 == n0.d.f332689d) {
            return false;
        }
        boolean z10 = false & true;
        return true;
    }
}
