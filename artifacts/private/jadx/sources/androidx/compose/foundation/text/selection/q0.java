package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.b5;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionAdjustment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionAdjustment.kt\nandroidx/compose/foundation/text/selection/SelectionAdjustmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
public final class q0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(o1 o1Var, k kVar) {
        boolean z10 = o1Var.d() == m.CROSSED;
        return new h0(f(o1Var.h(), z10, true, o1Var.i(), kVar), f(o1Var.g(), z10, false, o1Var.k(), kVar), z10);
    }

    private static final h0.a f(f0 f0Var, boolean z10, boolean z11, int i10, k kVar) {
        int iG = z11 ? f0Var.g() : f0Var.e();
        if (i10 != f0Var.i()) {
            return f0Var.a(iG);
        }
        long jA = kVar.a(f0Var, iG);
        return f0Var.a(z10 ^ z11 ? androidx.compose.ui.text.w3.n(jA) : androidx.compose.ui.text.w3.i(jA));
    }

    private static final h0.a g(h0.a aVar, f0 f0Var, int i10) {
        int i11 = 4 << 0;
        return h0.a.e(aVar, f0Var.k().c(i10), i10, 0L, 4, null);
    }

    @NotNull
    public static final h0 h(@NotNull h0 h0Var, @NotNull o1 o1Var) {
        if (r1.c(h0Var, o1Var)) {
            String strC = o1Var.c().c();
            if (o1Var.getSize() <= 1 && o1Var.e() != null) {
                if (strC.length() == 0) {
                    return h0Var;
                }
                h0Var = i(h0Var, o1Var);
            }
        }
        return h0Var;
    }

    private static final h0 i(h0 h0Var, o1 o1Var) {
        f0 f0VarC = o1Var.c();
        String strC = f0VarC.c();
        int iG = f0VarC.g();
        int length = strC.length();
        if (iG == 0) {
            int iC = b5.c(strC, 0);
            return o1Var.a() ? h0.e(h0Var, g(h0Var.h(), f0VarC, iC), null, true, 2, null) : h0.e(h0Var, null, g(h0Var.f(), f0VarC, iC), false, 1, null);
        }
        if (iG == length) {
            int iD = b5.d(strC, length);
            return o1Var.a() ? h0.e(h0Var, g(h0Var.h(), f0VarC, iD), null, false, 2, null) : h0.e(h0Var, null, g(h0Var.f(), f0VarC, iD), true, 1, null);
        }
        h0 h0VarE = o1Var.e();
        boolean z10 = h0VarE != null && h0VarE.g();
        int iD2 = o1Var.a() ^ z10 ? b5.d(strC, iG) : b5.c(strC, iG);
        return o1Var.a() ? h0.e(h0Var, g(h0Var.h(), f0VarC, iD2), null, z10, 2, null) : h0.e(h0Var, null, g(h0Var.f(), f0VarC, iD2), z10, 1, null);
    }

    private static final boolean j(f0 f0Var, int i10, boolean z10) {
        if (f0Var.f() == -1) {
            return true;
        }
        if (i10 == f0Var.f()) {
            return false;
        }
        if (z10 ^ (f0Var.d() == m.CROSSED)) {
            return i10 < f0Var.f();
        }
        return i10 > f0Var.f();
    }

    private static final h0.a k(f0 f0Var, int i10, int i11, int i12, boolean z10, boolean z11) {
        int iV;
        int iQ;
        long jD = f0Var.k().D(i11);
        if (f0Var.k().r(androidx.compose.ui.text.w3.n(jD)) == i10) {
            iV = androidx.compose.ui.text.w3.n(jD);
        } else {
            iV = i10 >= f0Var.k().o() ? f0Var.k().v(f0Var.k().o() - 1) : f0Var.k().v(i10);
        }
        if (f0Var.k().r(androidx.compose.ui.text.w3.i(jD)) == i10) {
            iQ = androidx.compose.ui.text.w3.i(jD);
        } else {
            iQ = i10 >= f0Var.k().o() ? androidx.compose.ui.text.p3.q(f0Var.k(), f0Var.k().o() - 1, false, 2, null) : androidx.compose.ui.text.p3.q(f0Var.k(), i10, false, 2, null);
        }
        if (iV == i12) {
            return f0Var.a(iQ);
        }
        if (iQ == i12) {
            return f0Var.a(iV);
        }
        if (!(z10 ^ z11) ? i11 >= iV : i11 > iQ) {
            iV = iQ;
        }
        return f0Var.a(iV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0.a l(final o1 o1Var, final f0 f0Var, h0.a aVar) {
        final int iG = o1Var.a() ? f0Var.g() : f0Var.e();
        if ((o1Var.a() ? o1Var.i() : o1Var.k()) != f0Var.i()) {
            return f0Var.a(iG);
        }
        kotlin.j0 j0Var = kotlin.j0.NONE;
        final kotlin.f0 f0VarB = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.compose.foundation.text.selection.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(q0.m(f0Var, iG));
            }
        });
        final int iE = o1Var.a() ? f0Var.e() : f0Var.g();
        kotlin.f0 f0VarB2 = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.compose.foundation.text.selection.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q0.o(f0Var, iG, iE, o1Var, f0VarB);
            }
        });
        if (f0Var.h() != aVar.h()) {
            return p(f0VarB2);
        }
        int iF = f0Var.f();
        if (iG == iF) {
            return aVar;
        }
        if (n(f0VarB) != f0Var.k().r(iF)) {
            return p(f0VarB2);
        }
        int iG2 = aVar.g();
        long jD = f0Var.k().D(iG2);
        if (!j(f0Var, iG, o1Var.a())) {
            return f0Var.a(iG);
        }
        if (iG2 != androidx.compose.ui.text.w3.n(jD) && iG2 != androidx.compose.ui.text.w3.i(jD)) {
            return f0Var.a(iG);
        }
        return p(f0VarB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(f0 f0Var, int i10) {
        return f0Var.k().r(i10);
    }

    private static final int n(kotlin.f0<Integer> f0Var) {
        return f0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0.a o(f0 f0Var, int i10, int i11, o1 o1Var, kotlin.f0 f0Var2) {
        boolean z10;
        int iN = n(f0Var2);
        boolean zA = o1Var.a();
        if (o1Var.d() == m.CROSSED) {
            z10 = true;
            int i12 = 6 | 1;
        } else {
            z10 = false;
        }
        return k(f0Var, iN, i10, i11, zA, z10);
    }

    private static final h0.a p(kotlin.f0<h0.a> f0Var) {
        return f0Var.getValue();
    }
}
