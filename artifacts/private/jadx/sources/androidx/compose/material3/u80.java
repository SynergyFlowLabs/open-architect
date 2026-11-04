package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@af
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1654:1\n1#2:1655\n75#3:1656\n75#3:1663\n75#3:1670\n75#3:1677\n1282#4,6:1657\n1282#4,6:1664\n1282#4,6:1671\n1282#4,6:1678\n113#5:1684\n113#5:1685\n113#5:1686\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n*L\n710#1:1656\n749#1:1663\n802#1:1670\n852#1:1677\n711#1:1657,6\n750#1:1664,6\n803#1:1671,6\n853#1:1678,6\n638#1:1684\n641#1:1685\n644#1:1686\n*E\n"})
public final class u80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u80 f33535a = new u80();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f33536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f33537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f33538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final oc f33539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f33540f = 0;

    @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults$rememberPlainTooltipPositionProvider$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1654:1\n54#2:1655\n59#2:1657\n85#3:1656\n90#3:1658\n80#3:1660\n32#4:1659\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults$rememberPlainTooltipPositionProvider$1$1\n*L\n719#1:1655\n724#1:1657\n719#1:1656\n724#1:1658\n726#1:1660\n726#1:1659\n*E\n"})
    public static final class a implements androidx.compose.ui.window.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33541a;

        a(int i10) {
            this.f33541a = i10;
        }

        @Override // androidx.compose.ui.window.s
        public long a(androidx.compose.ui.unit.s sVar, long j10, androidx.compose.ui.unit.w wVar, long j11) {
            int iT = sVar.t() + ((sVar.G() - ((int) (j11 >> 32))) / 2);
            int iB = (sVar.B() - ((int) (j11 & com.rabbitmq.client.k0.f265952a))) - this.f33541a;
            if (iB < 0) {
                iB = sVar.j() + this.f33541a;
            }
            return androidx.compose.ui.unit.q.f((((long) iT) << 32) | (((long) iB) & com.rabbitmq.client.k0.f265952a));
        }
    }

    @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults$rememberRichTooltipPositionProvider$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1654:1\n54#2:1655\n54#2:1657\n54#2:1659\n59#2:1661\n85#3:1656\n85#3:1658\n85#3:1660\n90#3:1662\n80#3:1664\n32#4:1663\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults$rememberRichTooltipPositionProvider$1$1\n*L\n761#1:1655\n762#1:1657\n767#1:1659\n773#1:1661\n761#1:1656\n762#1:1658\n767#1:1660\n773#1:1662\n775#1:1664\n775#1:1663\n*E\n"})
    public static final class b implements androidx.compose.ui.window.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33542a;

        b(int i10) {
            this.f33542a = i10;
        }

        @Override // androidx.compose.ui.window.s
        public long a(androidx.compose.ui.unit.s sVar, long j10, androidx.compose.ui.unit.w wVar, long j11) {
            int iT = sVar.t();
            int i10 = (int) (j11 >> 32);
            if (iT + i10 > ((int) (j10 >> 32)) && (iT = sVar.x() - i10) < 0) {
                iT = sVar.t() + ((sVar.G() - i10) / 2);
            }
            int iB = (sVar.B() - ((int) (j11 & com.rabbitmq.client.k0.f265952a))) - this.f33542a;
            if (iB < 0) {
                iB = sVar.j() + this.f33542a;
            }
            return androidx.compose.ui.unit.q.f((((long) iT) << 32) | (((long) iB) & com.rabbitmq.client.k0.f265952a));
        }
    }

    @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults$rememberTooltipPositionProvider$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1654:1\n54#2:1655\n54#2:1657\n54#2:1659\n59#2:1661\n85#3:1656\n85#3:1658\n85#3:1660\n90#3:1662\n80#3:1664\n32#4:1663\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults$rememberTooltipPositionProvider$1$1\n*L\n815#1:1655\n821#1:1657\n824#1:1659\n830#1:1661\n815#1:1656\n821#1:1658\n824#1:1660\n830#1:1662\n832#1:1664\n832#1:1663\n*E\n"})
    public static final class c implements androidx.compose.ui.window.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33543a;

        c(int i10) {
            this.f33543a = i10;
        }

        @Override // androidx.compose.ui.window.s
        public long a(androidx.compose.ui.unit.s sVar, long j10, androidx.compose.ui.unit.w wVar, long j11) {
            int i10 = (int) (j11 >> 32);
            int iT = sVar.t() + ((sVar.G() - i10) / 2);
            if (iT < 0) {
                iT = sVar.t();
            } else if (iT + i10 > ((int) (j10 >> 32))) {
                iT = sVar.x() - i10;
            }
            int iB = (sVar.B() - ((int) (j11 & com.rabbitmq.client.k0.f265952a))) - this.f33543a;
            if (iB < 0) {
                iB = sVar.j() + this.f33543a;
            }
            return androidx.compose.ui.unit.q.f((((long) iT) << 32) | (((long) iB) & com.rabbitmq.client.k0.f265952a));
        }
    }

    static {
        long jB = androidx.compose.ui.unit.i.b(androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(8));
        f33536b = jB;
        f33537c = androidx.compose.ui.unit.h.r(200);
        f33538d = androidx.compose.ui.unit.h.r(com.rabbitmq.client.a.f264844o);
        f33539e = new oc(jB, null);
    }

    private u80() {
    }

    public static /* synthetic */ androidx.compose.ui.graphics.q3 c(u80 u80Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f33536b;
        }
        return u80Var.b(j10);
    }

    @NotNull
    public final oc a() {
        return f33539e;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 b(long j10) {
        return new oc(j10, null);
    }

    public final long d() {
        return f33536b;
    }

    @NotNull
    public final oc e() {
        return f33539e;
    }

    @NotNull
    public final ct f(@NotNull l6 l6Var) {
        ct ctVarP = l6Var.P();
        if (ctVarP != null) {
            return ctVarP;
        }
        d0.e2 e2Var = d0.e2.f267955a;
        ct ctVar = new ct(o6.o(l6Var, e2Var.f()), o6.o(l6Var, e2Var.k()), o6.o(l6Var, e2Var.i()), o6.o(l6Var, e2Var.c()), null);
        l6Var.H1(ctVar);
        return ctVar;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getPlainTooltipContainerColor")
    public final long g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(102696215, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:626)");
        }
        long jR = o6.r(d0.a2.f267585a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getPlainTooltipContainerShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 h(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(49570325, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:622)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.a2.f267585a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getPlainTooltipContentColor")
    public final long i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1982928937, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:630)");
        }
        long jR = o6.r(d0.a2.f267585a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float j() {
        return f33537c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getRichTooltipContainerShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1138709783, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:634)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.e2.f267955a.h(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float l() {
        return f33538d;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Deprecated in favor of rememberTooltipPositionProvider API.", replaceWith = @kotlin.b1(expression = "rememberTooltipPositionProvider(spacingBetweenTooltipAndAnchor)", imports = {}))
    @NotNull
    public final androidx.compose.ui.window.s m(float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = h90.M();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1047866909, i10, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:707)");
        }
        int iG6 = ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).g6(f10);
        boolean zK = c0Var.K(iG6);
        Object objI0 = c0Var.i0();
        if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new a(iG6);
            c0Var.Y(objI0);
        }
        a aVar = (a) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Deprecated in favor of rememberTooltipPositionProvider API.", replaceWith = @kotlin.b1(expression = "rememberTooltipPositionProvider(spacingBetweenTooltipAndAnchor)", imports = {}))
    @NotNull
    public final androidx.compose.ui.window.s n(float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = h90.M();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1538806795, i10, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:746)");
        }
        int iG6 = ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).g6(f10);
        boolean zK = c0Var.K(iG6);
        Object objI0 = c0Var.i0();
        if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new b(iG6);
            c0Var.Y(objI0);
        }
        b bVar = (b) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return bVar;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.ui.window.s o(int i10, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        if ((i12 & 2) != 0) {
            f10 = h90.M();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-573803578, i11, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:849)");
        }
        int iG6 = ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).g6(f10);
        boolean zK = c0Var.K(iG6) | ((((i11 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i11 & 6) == 4);
        Object objI0 = c0Var.i0();
        if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new j90(i10, iG6, null);
            c0Var.Y(objI0);
        }
        j90 j90Var = (j90) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j90Var;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Deprecated in favor of rememberTooltipPositionProvider API that takes a preferred positioning. Please use rememberTooltipPositionProvider with TooltipAnchorPosition.Above if this same behavior is desired.", replaceWith = @kotlin.b1(expression = "rememberTooltipPositionProvider(TooltipAnchorPosition.ABOVE, spacingBetweenTooltipAndAnchor)", imports = {}))
    @NotNull
    public final androidx.compose.ui.window.s p(float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = h90.M();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1613894159, i10, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:799)");
        }
        int iG6 = ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).g6(f10);
        boolean zK = c0Var.K(iG6);
        Object objI0 = c0Var.i0();
        if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new c(iG6);
            c0Var.Y(objI0);
        }
        c cVar = (c) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return cVar;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ct q(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1622312141, i10, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:660)");
        }
        ct ctVarF = f(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ctVarF;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ct r(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1498555081, i10, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:673)");
        }
        long j14 = j11;
        long j15 = j10;
        ct ctVarA = f(pj.f31758a.a(c0Var, 6)).a(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ctVarA;
    }
}
