package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,477:1\n1#2:478\n48#3:479\n53#3:482\n60#4:480\n70#4:483\n53#4,3:485\n22#5:481\n33#6:484\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n476#1:479\n476#1:482\n476#1:480\n476#1:483\n476#1:485,3\n476#1:481\n476#1:484\n*E\n"})
public final class t0 {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @NotNull a1 a1Var, @NotNull androidx.compose.ui.graphics.q3 q3Var) {
        return k(a0Var, a1Var.d(), a1Var.c(), q3Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, a1 a1Var, androidx.compose.ui.graphics.q3 q3Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.ui.graphics.d3.a();
        }
        return g(a0Var, a1Var, q3Var);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, float f10, long j10, @NotNull androidx.compose.ui.graphics.q3 q3Var) {
        return k(a0Var, f10, new androidx.compose.ui.graphics.s3(j10, null), q3Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 j(androidx.compose.ui.a0 a0Var, float f10, long j10, androidx.compose.ui.graphics.q3 q3Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            q3Var = androidx.compose.ui.graphics.d3.a();
        }
        return i(a0Var, f10, j10, q3Var);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, float f10, @NotNull androidx.compose.ui.graphics.i0 i0Var, @NotNull androidx.compose.ui.graphics.q3 q3Var) {
        return a0Var.B2(new BorderModifierNodeElement(f10, i0Var, q3Var, null));
    }

    private static final n0.l l(float f10, n0.l lVar) {
        return new n0.l(f10, f10, lVar.v() - f10, lVar.p() - f10, r(lVar.t(), f10), r(lVar.u(), f10), r(lVar.o(), f10), r(lVar.n(), f10), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.k2 m(androidx.compose.ui.graphics.k2 k2Var, n0.l lVar, float f10, boolean z10) {
        k2Var.reset();
        androidx.compose.ui.graphics.k2.S(k2Var, lVar, null, 2, null);
        if (!z10) {
            androidx.compose.ui.graphics.k2 k2VarA = androidx.compose.ui.graphics.u.a();
            androidx.compose.ui.graphics.k2.S(k2VarA, l(f10, lVar), null, 2, null);
            k2Var.X(k2Var, k2VarA, androidx.compose.ui.graphics.t2.f38235b.a());
        }
        return k2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o n(androidx.compose.ui.draw.i iVar) {
        return iVar.N(new Function1() { // from class: androidx.compose.foundation.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.o((androidx.compose.ui.graphics.drawscope.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o p(androidx.compose.ui.draw.i iVar, final androidx.compose.ui.graphics.i0 i0Var, long j10, long j11, boolean z10, float f10) {
        final long jE = z10 ? n0.g.f332700b.e() : j10;
        final long jD = z10 ? iVar.d() : j11;
        final androidx.compose.ui.graphics.drawscope.i nVar = z10 ? androidx.compose.ui.graphics.drawscope.m.f37744a : new androidx.compose.ui.graphics.drawscope.n(f10, 0.0f, 0, 0, null, 30, null);
        return iVar.N(new Function1() { // from class: androidx.compose.foundation.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.q(i0Var, jE, jD, nVar, (androidx.compose.ui.graphics.drawscope.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.graphics.i0 i0Var, long j10, long j11, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        androidx.compose.ui.graphics.drawscope.f.b3(cVar, i0Var, j10, j11, 0.0f, iVar, null, 0, 104, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(long j10, float f10) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j10 >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) - f10);
        return n0.a.e((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & com.rabbitmq.client.k0.f265952a));
    }
}
