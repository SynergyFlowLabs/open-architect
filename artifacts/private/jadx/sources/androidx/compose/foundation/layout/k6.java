package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1137\n97#2:1139\n97#2:1150\n97#2:1161\n97#2:1163\n97#2:1165\n97#2:1167\n105#3:1136\n105#3:1138\n101#3,10:1140\n101#3,10:1151\n110#3:1162\n105#3:1164\n110#3:1166\n105#3:1168\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n*L\n789#1:1135\n795#1:1137\n801#1:1139\n809#1:1150\n834#1:1161\n840#1:1163\n846#1:1165\n852#1:1167\n790#1:1136\n796#1:1138\n802#1:1140,10\n810#1:1151,10\n837#1:1162\n843#1:1164\n849#1:1166\n855#1:1168\n*E\n"})
final class k6 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {
    private boolean X;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f16196t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f16197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f16198w;

    public /* synthetic */ k6(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    private final long B9(androidx.compose.ui.unit.d dVar) {
        int iG6;
        int iG7;
        int iG8;
        int i10 = 0;
        if (Float.isNaN(this.f16197v)) {
            iG6 = Integer.MAX_VALUE;
        } else {
            iG6 = dVar.g6(this.f16197v);
            if (iG6 < 0) {
                iG6 = 0;
            }
        }
        if (Float.isNaN(this.f16198w)) {
            iG7 = Integer.MAX_VALUE;
        } else {
            iG7 = dVar.g6(this.f16198w);
            if (iG7 < 0) {
                iG7 = 0;
            }
        }
        if (Float.isNaN(this.f16195s)) {
            iG8 = 0;
        } else {
            iG8 = dVar.g6(this.f16195s);
            if (iG8 < 0) {
                iG8 = 0;
            }
            if (iG8 > iG6) {
                iG8 = iG6;
            }
            if (iG8 == Integer.MAX_VALUE) {
                iG8 = 0;
            }
        }
        if (!Float.isNaN(this.f16196t)) {
            int iG9 = dVar.g6(this.f16196t);
            if (iG9 < 0) {
                iG9 = 0;
            }
            if (iG9 > iG7) {
                iG9 = iG7;
            }
            if (iG9 != Integer.MAX_VALUE) {
                i10 = iG9;
            }
        }
        return androidx.compose.ui.unit.c.a(iG8, iG6, i10, iG7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final float A9() {
        return this.f16195s;
    }

    public final void D9(boolean z10) {
        this.X = z10;
    }

    public final void E9(float f10) {
        this.f16198w = f10;
    }

    public final void F9(float f10) {
        this.f16197v = f10;
    }

    public final void G9(float f10) {
        this.f16196t = f10;
    }

    public final void H9(float f10) {
        this.f16195s = f10;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        long jB9 = B9(zVar);
        if (androidx.compose.ui.unit.b.n(jB9)) {
            return androidx.compose.ui.unit.b.p(jB9);
        }
        if (!this.X) {
            i10 = androidx.compose.ui.unit.c.h(jB9, i10);
        }
        return androidx.compose.ui.unit.c.i(jB9, yVar.L0(i10));
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        long jB9 = B9(zVar);
        if (androidx.compose.ui.unit.b.n(jB9)) {
            return androidx.compose.ui.unit.b.p(jB9);
        }
        if (!this.X) {
            i10 = androidx.compose.ui.unit.c.h(jB9, i10);
        }
        return androidx.compose.ui.unit.c.i(jB9, yVar.M0(i10));
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int iR;
        int iP;
        int iQ;
        int iO;
        long jA;
        long jB9 = B9(c1Var);
        if (this.X) {
            jA = androidx.compose.ui.unit.c.g(j10, jB9);
        } else {
            if (Float.isNaN(this.f16195s)) {
                iR = androidx.compose.ui.unit.b.r(j10);
                int iP2 = androidx.compose.ui.unit.b.p(jB9);
                if (iR > iP2) {
                    iR = iP2;
                }
            } else {
                iR = androidx.compose.ui.unit.b.r(jB9);
            }
            if (Float.isNaN(this.f16197v)) {
                iP = androidx.compose.ui.unit.b.p(j10);
                int iR2 = androidx.compose.ui.unit.b.r(jB9);
                if (iP < iR2) {
                    iP = iR2;
                }
            } else {
                iP = androidx.compose.ui.unit.b.p(jB9);
            }
            if (Float.isNaN(this.f16196t)) {
                iQ = androidx.compose.ui.unit.b.q(j10);
                int iO2 = androidx.compose.ui.unit.b.o(jB9);
                if (iQ > iO2) {
                    iQ = iO2;
                }
            } else {
                iQ = androidx.compose.ui.unit.b.q(jB9);
            }
            if (Float.isNaN(this.f16198w)) {
                iO = androidx.compose.ui.unit.b.o(j10);
                int iQ2 = androidx.compose.ui.unit.b.q(jB9);
                if (iO < iQ2) {
                    iO = iQ2;
                }
            } else {
                iO = androidx.compose.ui.unit.b.o(jB9);
            }
            jA = androidx.compose.ui.unit.c.a(iR, iP, iQ, iO);
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(jA);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.j6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k6.C9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        long jB9 = B9(zVar);
        if (androidx.compose.ui.unit.b.l(jB9)) {
            return androidx.compose.ui.unit.b.o(jB9);
        }
        if (!this.X) {
            i10 = androidx.compose.ui.unit.c.i(jB9, i10);
        }
        return androidx.compose.ui.unit.c.h(jB9, yVar.p0(i10));
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        long jB9 = B9(zVar);
        if (androidx.compose.ui.unit.b.l(jB9)) {
            return androidx.compose.ui.unit.b.o(jB9);
        }
        if (!this.X) {
            i10 = androidx.compose.ui.unit.c.i(jB9, i10);
        }
        return androidx.compose.ui.unit.c.h(jB9, yVar.D0(i10));
    }

    public final boolean w9() {
        return this.X;
    }

    public final float x9() {
        return this.f16198w;
    }

    public final float y9() {
        return this.f16197v;
    }

    public final float z9() {
        return this.f16196t;
    }

    public /* synthetic */ k6(float f10, float f11, float f12, float f13, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f11, (i10 & 4) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f12, (i10 & 8) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f13, z10, null);
    }

    private k6(float f10, float f11, float f12, float f13, boolean z10) {
        this.f16195s = f10;
        this.f16196t = f11;
        this.f16197v = f12;
        this.f16198w = f13;
        this.X = z10;
    }
}
