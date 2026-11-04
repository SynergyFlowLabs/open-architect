package androidx.compose.foundation.text.selection;

import java.util.Comparator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n54#2:367\n59#2:369\n85#3:368\n90#3:370\n60#3:373\n60#3:376\n70#3:379\n70#3:382\n70#3:385\n70#3:388\n278#4:371\n65#5:372\n65#5:375\n69#5:378\n69#5:381\n69#5:384\n69#5:387\n22#6:374\n22#6:377\n22#6:380\n22#6:383\n22#6:386\n22#6:389\n1#7:390\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n*L\n230#1:367\n231#1:369\n230#1:368\n231#1:370\n325#1:373\n326#1:376\n332#1:379\n333#1:382\n361#1:385\n362#1:388\n290#1:371\n325#1:372\n326#1:375\n332#1:378\n333#1:381\n361#1:384\n362#1:387\n325#1:374\n326#1:377\n332#1:380\n333#1:383\n361#1:386\n362#1:389\n*E\n"})
public final class v {
    public static final void a(@NotNull p1 p1Var, @NotNull androidx.compose.ui.text.p3 p3Var, long j10, long j11, long j12) {
        n nVar;
        n nVar2;
        long j13;
        n nVarB;
        n nVar3;
        n nVarB2;
        n nVar4;
        n nVar5;
        int iD;
        int iE;
        h0.a aVarH;
        h0.a aVarF;
        n0.j jVar = new n0.j(0.0f, 0.0f, (int) (p3Var.C() >> 32), (int) (p3Var.C() & com.rabbitmq.client.k0.f265952a));
        n nVarF = f(j10, jVar);
        n nVarG = g(j10, jVar);
        if (p1Var.h()) {
            h0 h0VarF = p1Var.f();
            nVar = nVarG;
            nVar2 = nVarF;
            j13 = j12;
            nVar4 = nVar2;
            nVarB2 = b(nVar2, nVar, p1Var, j12, h0VarF != null ? h0VarF.f() : null);
            nVar3 = nVarB2;
            nVar5 = nVar3;
            nVarB = nVar;
        } else {
            nVar = nVarG;
            nVar2 = nVarF;
            h0 h0VarF2 = p1Var.f();
            j13 = j12;
            nVarB = b(nVar2, nVar, p1Var, j13, h0VarF2 != null ? h0VarF2.h() : null);
            nVar3 = nVar2;
            nVarB2 = nVar;
            nVar4 = nVarB;
            nVar5 = nVar4;
        }
        if (h(r1.e(nVar2, nVar), nVar5)) {
            int length = p3Var.l().n().length();
            if (p1Var.h()) {
                iE = d(j10, p3Var);
                h0 h0VarF3 = p1Var.f();
                iD = (h0VarF3 == null || (aVarF = h0VarF3.f()) == null) ? iE : e(aVarF, p1Var.g(), j13, length);
            } else {
                iD = d(j10, p3Var);
                h0 h0VarF4 = p1Var.f();
                iE = (h0VarF4 == null || (aVarH = h0VarF4.h()) == null) ? iD : e(aVarH, p1Var.g(), j13, length);
            }
            p1Var.a(j13, iE, nVar4, nVarB, iD, nVar3, nVarB2, (9223372034707292159L & j11) == n0.d.f332689d ? -1 : d(j11, p3Var), p3Var);
        }
    }

    private static final n b(n nVar, n nVar2, p1 p1Var, long j10, h0.a aVar) {
        n nVarC;
        return (aVar == null || (nVarC = c(p1Var, aVar.h(), j10)) == null) ? r1.e(nVar, nVar2) : nVarC;
    }

    private static final n c(p1 p1Var, long j10, long j11) {
        int iCompare = p1Var.g().compare(Long.valueOf(j10), Long.valueOf(j11));
        if (iCompare < 0) {
            return n.BEFORE;
        }
        return iCompare > 0 ? n.AFTER : n.ON;
    }

    private static final int d(long j10, androidx.compose.ui.text.p3 p3Var) {
        int i10 = (int) (com.rabbitmq.client.k0.f265952a & j10);
        if (Float.intBitsToFloat(i10) > 0.0f) {
            return Float.intBitsToFloat(i10) >= p3Var.x().k() ? p3Var.l().n().length() : p3Var.y(j10);
        }
        int i11 = 5 << 0;
        return 0;
    }

    private static final int e(h0.a aVar, Comparator<Long> comparator, long j10, int i10) {
        int iCompare = comparator.compare(Long.valueOf(aVar.h()), Long.valueOf(j10));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare > 0 ? i10 : aVar.g();
    }

    private static final n f(long j10, n0.j jVar) {
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) < jVar.t()) {
            return n.BEFORE;
        }
        return Float.intBitsToFloat(i10) > jVar.x() ? n.AFTER : n.ON;
    }

    private static final n g(long j10, n0.j jVar) {
        int i10 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        if (Float.intBitsToFloat(i10) < jVar.B()) {
            return n.BEFORE;
        }
        return Float.intBitsToFloat(i10) > jVar.j() ? n.AFTER : n.ON;
    }

    private static final boolean h(n nVar, n nVar2) {
        return nVar == n.ON || nVar != nVar2;
    }
}
