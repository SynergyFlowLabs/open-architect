package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n26#2:1135\n26#2:1146\n101#3,10:1136\n101#3,10:1147\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n*L\n700#1:1135\n713#1:1146\n701#1:1136,10\n714#1:1147,10\n*E\n"})
final class x1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private r1 f16535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f16536t;

    public x1(@NotNull r1 r1Var, float f10) {
        this.f16535s = r1Var;
        this.f16536t = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void A9(float f10) {
        this.f16536t = f10;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int iR;
        int iP;
        int iO;
        int i10;
        if (!androidx.compose.ui.unit.b.j(j10) || this.f16535s == r1.Vertical) {
            iR = androidx.compose.ui.unit.b.r(j10);
            iP = androidx.compose.ui.unit.b.p(j10);
        } else {
            int iRound = Math.round(androidx.compose.ui.unit.b.p(j10) * this.f16536t);
            int iR2 = androidx.compose.ui.unit.b.r(j10);
            iR = androidx.compose.ui.unit.b.p(j10);
            if (iRound < iR2) {
                iRound = iR2;
            }
            if (iRound <= iR) {
                iR = iRound;
            }
            iP = iR;
        }
        if (!androidx.compose.ui.unit.b.i(j10) || this.f16535s == r1.Horizontal) {
            int iQ = androidx.compose.ui.unit.b.q(j10);
            int iO2 = androidx.compose.ui.unit.b.o(j10);
            iO = iQ;
            i10 = iO2;
        } else {
            int iRound2 = Math.round(androidx.compose.ui.unit.b.o(j10) * this.f16536t);
            int iQ2 = androidx.compose.ui.unit.b.q(j10);
            iO = androidx.compose.ui.unit.b.o(j10);
            if (iRound2 < iQ2) {
                iRound2 = iQ2;
            }
            if (iRound2 <= iO) {
                iO = iRound2;
            }
            i10 = iO;
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.a(iR, iP, iO, i10));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x1.y9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @NotNull
    public final r1 w9() {
        return this.f16535s;
    }

    public final float x9() {
        return this.f16536t;
    }

    public final void z9(@NotNull r1 r1Var) {
        this.f16535s = r1Var;
    }
}
