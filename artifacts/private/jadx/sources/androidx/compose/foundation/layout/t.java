package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,240:1\n54#2:241\n59#2:243\n85#3:242\n90#3:244\n80#3:252\n80#3:255\n80#3:258\n80#3:261\n26#4:245\n26#4:246\n26#4:247\n26#4:248\n26#4:250\n26#4:253\n26#4:256\n26#4:259\n1#5:249\n30#6:251\n30#6:254\n30#6:257\n30#6:260\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n115#1:241\n115#1:243\n115#1:242\n115#1:244\n192#1:252\n205#1:255\n217#1:258\n228#1:261\n128#1:245\n138#1:246\n148#1:247\n158#1:248\n189#1:250\n202#1:253\n214#1:256\n225#1:259\n192#1:251\n205#1:254\n217#1:257\n228#1:260\n*E\n"})
final class t extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16414t;

    public t(float f10, boolean z10) {
        this.f16413s = f10;
        this.f16414t = z10;
    }

    private final long C9(long j10, boolean z10) {
        int iRound;
        int iO = androidx.compose.ui.unit.b.o(j10);
        return (iO == Integer.MAX_VALUE || (iRound = Math.round(((float) iO) * this.f16413s)) <= 0 || (z10 && !r.c(j10, iRound, iO))) ? androidx.compose.ui.unit.u.f42720b.a() : androidx.compose.ui.unit.u.e((((long) iRound) << 32) | (((long) iO) & com.rabbitmq.client.k0.f265952a));
    }

    private final long D9(long j10, boolean z10) {
        int iRound;
        int iP = androidx.compose.ui.unit.b.p(j10);
        return (iP == Integer.MAX_VALUE || (iRound = Math.round(((float) iP) / this.f16413s)) <= 0 || (z10 && !r.c(j10, iP, iRound))) ? androidx.compose.ui.unit.u.f42720b.a() : androidx.compose.ui.unit.u.e((((long) iP) << 32) | (((long) iRound) & com.rabbitmq.client.k0.f265952a));
    }

    private final long E9(long j10, boolean z10) {
        int iQ = androidx.compose.ui.unit.b.q(j10);
        int iRound = Math.round(iQ * this.f16413s);
        return (iRound <= 0 || (z10 && !r.c(j10, iRound, iQ))) ? androidx.compose.ui.unit.u.f42720b.a() : androidx.compose.ui.unit.u.e((((long) iRound) << 32) | (((long) iQ) & com.rabbitmq.client.k0.f265952a));
    }

    private final long F9(long j10, boolean z10) {
        int iR = androidx.compose.ui.unit.b.r(j10);
        int iRound = Math.round(iR / this.f16413s);
        return (iRound <= 0 || (z10 && !r.c(j10, iR, iRound))) ? androidx.compose.ui.unit.u.f42720b.a() : androidx.compose.ui.unit.u.e((((long) iR) << 32) | (((long) iRound) & com.rabbitmq.client.k0.f265952a));
    }

    private final long w9(long j10) {
        if (this.f16414t) {
            long jC9 = C9(j10, true);
            androidx.compose.ui.unit.u.a aVar = androidx.compose.ui.unit.u.f42720b;
            if (!androidx.compose.ui.unit.u.h(jC9, aVar.a())) {
                return jC9;
            }
            long jD9 = D9(j10, true);
            if (!androidx.compose.ui.unit.u.h(jD9, aVar.a())) {
                return jD9;
            }
            long jE9 = E9(j10, true);
            if (!androidx.compose.ui.unit.u.h(jE9, aVar.a())) {
                return jE9;
            }
            long jF9 = F9(j10, true);
            if (!androidx.compose.ui.unit.u.h(jF9, aVar.a())) {
                return jF9;
            }
            long jC10 = C9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jC10, aVar.a())) {
                return jC10;
            }
            long jD10 = D9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jD10, aVar.a())) {
                return jD10;
            }
            long jE10 = E9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jE10, aVar.a())) {
                return jE10;
            }
            long jF10 = F9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jF10, aVar.a())) {
                return jF10;
            }
        } else {
            long jD11 = D9(j10, true);
            androidx.compose.ui.unit.u.a aVar2 = androidx.compose.ui.unit.u.f42720b;
            if (!androidx.compose.ui.unit.u.h(jD11, aVar2.a())) {
                return jD11;
            }
            long jC11 = C9(j10, true);
            if (!androidx.compose.ui.unit.u.h(jC11, aVar2.a())) {
                return jC11;
            }
            long jF11 = F9(j10, true);
            if (!androidx.compose.ui.unit.u.h(jF11, aVar2.a())) {
                return jF11;
            }
            long jE11 = E9(j10, true);
            if (!androidx.compose.ui.unit.u.h(jE11, aVar2.a())) {
                return jE11;
            }
            long jD12 = D9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jD12, aVar2.a())) {
                return jD12;
            }
            long jC12 = C9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jC12, aVar2.a())) {
                return jC12;
            }
            long jF12 = F9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jF12, aVar2.a())) {
                return jF12;
            }
            long jE12 = E9(j10, false);
            if (!androidx.compose.ui.unit.u.h(jE12, aVar2.a())) {
                return jE12;
            }
        }
        return androidx.compose.ui.unit.u.f42720b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void A9(float f10) {
        this.f16413s = f10;
    }

    public final void B9(boolean z10) {
        this.f16414t = z10;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f16413s) : yVar.L0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f16413s) : yVar.M0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        long jW9 = w9(j10);
        if (!androidx.compose.ui.unit.u.h(jW9, androidx.compose.ui.unit.u.f42720b.a())) {
            j10 = androidx.compose.ui.unit.b.f42658b.c((int) (jW9 >> 32), (int) (jW9 & com.rabbitmq.client.k0.f265952a));
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.z9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f16413s) : yVar.p0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f16413s) : yVar.D0(i10);
    }

    public final float x9() {
        return this.f16413s;
    }

    public final boolean y9() {
        return this.f16414t;
    }
}
