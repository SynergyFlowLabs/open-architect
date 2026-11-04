package androidx.compose.foundation.layout;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,623:1\n1#2:624\n54#3:625\n59#3:627\n54#3:647\n59#3:656\n85#4:626\n90#4:628\n53#4,3:630\n60#4:634\n70#4:641\n85#4:648\n60#4:650\n90#4:657\n70#4:659\n30#5:629\n65#6:633\n69#6:640\n65#6:649\n69#6:658\n22#7,5:635\n22#7,5:642\n22#7,5:651\n22#7,5:660\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode\n*L\n568#1:625\n568#1:627\n574#1:647\n575#1:656\n568#1:626\n568#1:628\n568#1:630,3\n572#1:634\n573#1:641\n574#1:648\n574#1:650\n575#1:657\n575#1:659\n568#1:629\n572#1:633\n573#1:640\n574#1:649\n575#1:658\n572#1:635,5\n573#1:642,5\n574#1:651,5\n575#1:660,5\n*E\n"})
final class p5 extends androidx.compose.ui.a0.d implements androidx.compose.ui.modifier.j, androidx.compose.ui.node.g0, androidx.compose.ui.node.v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final t6 f16273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f16274t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.modifier.i f16275v;

    public p5() {
        t6 t6Var = new t6(new a4(0, 0, 0, 0), MetricTracker.Object.RESET);
        this.f16273s = t6Var;
        this.f16274t = androidx.compose.ui.unit.q.f42709b.b();
        this.f16275v = androidx.compose.ui.modifier.k.d(TuplesKt.to(t7.e(), t6Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A9(p5 p5Var, androidx.compose.ui.layout.z0 z0Var, int i10, int i11, androidx.compose.ui.layout.i2.a aVar) {
        v6 v6Var;
        androidx.compose.ui.layout.g0 g0VarN = aVar.n();
        if (g0VarN != null) {
            p5Var.f16274t = androidx.compose.ui.unit.r.g(androidx.compose.ui.layout.h0.f(g0VarN));
        }
        if (g0VarN == null) {
            v6Var = (v6) p5Var.I(t7.e());
        } else {
            long jF = androidx.compose.ui.layout.h0.f(g0VarN);
            long jA = g0VarN.a();
            float f10 = (int) (jA >> 32);
            long jK0 = g0VarN.k0(n0.g.g((((long) Float.floatToRawIntBits((int) (jA & com.rabbitmq.client.k0.f265952a))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32)));
            long jA2 = androidx.compose.ui.layout.h0.d(g0VarN).a();
            int iRound = Math.round(Float.intBitsToFloat((int) (jF >> 32)));
            int iRound2 = Math.round(Float.intBitsToFloat((int) (jF & com.rabbitmq.client.k0.f265952a)));
            int iRound3 = ((int) (jA2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jK0 >> 32)));
            int iRound4 = ((int) (jA2 & com.rabbitmq.client.k0.f265952a)) - Math.round(Float.intBitsToFloat((int) (jK0 & com.rabbitmq.client.k0.f265952a)));
            a4 a4VarF = p5Var.f16273s.f();
            if (a4VarF.b() != iRound || a4VarF.d() != iRound2 || a4VarF.c() != iRound3 || a4VarF.a() != iRound4) {
                p5Var.f16273s.g(new a4(iRound, iRound2, iRound3, iRound4));
            }
            v6Var = p5Var.f16273s;
        }
        p5Var.o7(t7.e(), v6Var);
        androidx.compose.ui.layout.i2.a.P(aVar, z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(i10, i11)), 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void B9(long j10) {
        this.f16274t = j10;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.L0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.M0(i10);
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull final androidx.compose.ui.layout.z0 z0Var, long j10) {
        if (androidx.compose.ui.unit.b.n(j10) && androidx.compose.ui.unit.b.l(j10)) {
            final int iP = androidx.compose.ui.unit.b.p(j10);
            final int iO = androidx.compose.ui.unit.b.o(j10);
            return androidx.compose.ui.layout.c1.h6(c1Var, iP, iO, null, new Function1() { // from class: androidx.compose.foundation.layout.o5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p5.A9(this.f16261a, z0Var, iP, iO, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        o7(t7.e(), I(t7.e()));
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.n5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p5.z9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.p0(i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.D0(i10);
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        long jG = androidx.compose.ui.unit.r.g(androidx.compose.ui.layout.h0.f(g0Var));
        boolean zK = androidx.compose.ui.unit.q.k(this.f16274t, jG);
        this.f16274t = jG;
        if (zK) {
            return;
        }
        androidx.compose.ui.node.j0.c(this);
    }

    @Override // androidx.compose.ui.modifier.j
    @NotNull
    public androidx.compose.ui.modifier.i x1() {
        return this.f16275v;
    }

    @NotNull
    public final t6 x9() {
        return this.f16273s;
    }

    public final long y9() {
        return this.f16274t;
    }
}
