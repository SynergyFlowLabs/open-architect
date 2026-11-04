package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1146\n97#2:1157\n97#2:1159\n97#2:1161\n97#2:1163\n101#3,10:1136\n101#3,10:1147\n105#3:1158\n105#3:1160\n105#3:1162\n105#3:1164\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n*L\n1079#1:1135\n1085#1:1146\n1102#1:1157\n1110#1:1159\n1118#1:1161\n1126#1:1163\n1080#1:1136,10\n1086#1:1147,10\n1102#1:1158\n1110#1:1160\n1118#1:1162\n1126#1:1164\n*E\n"})
final class s6 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f16412t;

    public /* synthetic */ s6(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void A9(float f10) {
        this.f16411s = f10;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        int iL0 = yVar.L0(i10);
        int iG6 = !Float.isNaN(this.f16411s) ? zVar.g6(this.f16411s) : 0;
        return iL0 < iG6 ? iG6 : iL0;
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        int iM0 = yVar.M0(i10);
        int iG6 = !Float.isNaN(this.f16411s) ? zVar.g6(this.f16411s) : 0;
        return iM0 < iG6 ? iG6 : iM0;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int iR;
        int iQ;
        if (Float.isNaN(this.f16411s) || androidx.compose.ui.unit.b.r(j10) != 0) {
            iR = androidx.compose.ui.unit.b.r(j10);
        } else {
            int iG6 = c1Var.g6(this.f16411s);
            iR = androidx.compose.ui.unit.b.p(j10);
            if (iG6 < 0) {
                iG6 = 0;
            }
            if (iG6 <= iR) {
                iR = iG6;
            }
        }
        int iP = androidx.compose.ui.unit.b.p(j10);
        if (Float.isNaN(this.f16412t) || androidx.compose.ui.unit.b.q(j10) != 0) {
            iQ = androidx.compose.ui.unit.b.q(j10);
        } else {
            int iG7 = c1Var.g6(this.f16412t);
            iQ = androidx.compose.ui.unit.b.o(j10);
            int i10 = iG7 >= 0 ? iG7 : 0;
            if (i10 <= iQ) {
                iQ = i10;
            }
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.a(iR, iP, iQ, androidx.compose.ui.unit.b.o(j10)));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.r6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s6.y9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        int iP0 = yVar.p0(i10);
        int iG6 = !Float.isNaN(this.f16412t) ? zVar.g6(this.f16412t) : 0;
        return iP0 < iG6 ? iG6 : iP0;
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        int iD0 = yVar.D0(i10);
        int iG6 = !Float.isNaN(this.f16412t) ? zVar.g6(this.f16412t) : 0;
        return iD0 < iG6 ? iG6 : iD0;
    }

    public final float w9() {
        return this.f16412t;
    }

    public final float x9() {
        return this.f16411s;
    }

    public final void z9(float f10) {
        this.f16412t = f10;
    }

    public /* synthetic */ s6(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f11, null);
    }

    private s6(float f10, float f11) {
        this.f16411s = f10;
        this.f16412t = f11;
    }
}
