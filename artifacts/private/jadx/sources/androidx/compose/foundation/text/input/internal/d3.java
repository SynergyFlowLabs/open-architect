package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(34)
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1099:1\n1#2:1100\n319#3,6:1101\n327#3,3:1115\n330#3:1124\n319#3,6:1125\n327#3,3:1139\n330#3:1148\n319#3,6:1149\n327#3,3:1163\n330#3:1172\n270#4,8:1107\n279#4,6:1118\n270#4,8:1131\n279#4,6:1142\n270#4,8:1155\n279#4,6:1166\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n353#1:1101,6\n353#1:1115,3\n353#1:1124\n367#1:1125,6\n367#1:1139,3\n367#1:1148\n92#1:1149,6\n92#1:1163,3\n92#1:1172\n353#1:1107,8\n353#1:1118,6\n367#1:1131,8\n367#1:1142,6\n92#1:1155,8\n92#1:1166,6\n*E\n"})
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d3 f19532a = new d3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19533b = 0;

    private d3() {
    }

    private final int A(androidx.compose.foundation.text.g4 g4Var, SelectRangeGesture selectRangeGesture, androidx.compose.foundation.text.selection.u3 u3Var, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        long jX = e3.x(g4Var, androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionEndArea()), P(selectRangeGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jX)) {
            return f19532a.f(w2.a(selectRangeGesture), function1);
        }
        C(jX, u3Var, function1);
        return 1;
    }

    private final int B(w6 w6Var, SelectRangeGesture selectRangeGesture, q6 q6Var, Function0<Unit> function0) {
        long jY = e3.y(q6Var, androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionEndArea()), P(selectRangeGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jY)) {
            return f19532a.e(w6Var, w2.a(selectRangeGesture));
        }
        w6Var.L(jY);
        if (function0 == null) {
            return 1;
        }
        function0.invoke();
        return 1;
    }

    private final void C(long j10, androidx.compose.foundation.text.selection.u3 u3Var, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        function1.invoke(new androidx.compose.ui.text.input.v0(androidx.compose.ui.text.w3.n(j10), androidx.compose.ui.text.w3.i(j10)));
        if (u3Var != null) {
            u3Var.H(true);
        }
    }

    private final void D(androidx.compose.foundation.text.g4 g4Var, DeleteGesture deleteGesture, androidx.compose.foundation.text.selection.u3 u3Var) {
        if (u3Var != null) {
            u3Var.F0(e3.v(g4Var, androidx.compose.ui.graphics.c3.f(deleteGesture.getDeletionArea()), P(deleteGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()));
        }
    }

    private final void E(w6 w6Var, DeleteGesture deleteGesture, q6 q6Var) {
        g(w6Var, e3.w(q6Var, androidx.compose.ui.graphics.c3.f(deleteGesture.getDeletionArea()), P(deleteGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()), androidx.compose.foundation.text.input.s.f20317b.a());
    }

    private final void F(androidx.compose.foundation.text.g4 g4Var, DeleteRangeGesture deleteRangeGesture, androidx.compose.foundation.text.selection.u3 u3Var) {
        if (u3Var != null) {
            u3Var.F0(e3.x(g4Var, androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionEndArea()), P(deleteRangeGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()));
        }
    }

    private final void G(w6 w6Var, DeleteRangeGesture deleteRangeGesture, q6 q6Var) {
        g(w6Var, e3.y(q6Var, androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionEndArea()), P(deleteRangeGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()), androidx.compose.foundation.text.input.s.f20317b.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(w6 w6Var) {
        androidx.compose.foundation.text.input.p pVar = w6Var.f20179a;
        androidx.compose.foundation.text.input.c cVar = w6Var.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        jVarM.h();
        w6Var.Q(jVarM);
        pVar.e(cVar, true, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(androidx.compose.foundation.text.selection.u3 u3Var) {
        if (u3Var != null) {
            u3Var.z();
        }
    }

    private final void L(androidx.compose.foundation.text.g4 g4Var, SelectGesture selectGesture, androidx.compose.foundation.text.selection.u3 u3Var) {
        if (u3Var != null) {
            u3Var.R0(e3.v(g4Var, androidx.compose.ui.graphics.c3.f(selectGesture.getSelectionArea()), P(selectGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()));
        }
    }

    private final void M(w6 w6Var, SelectGesture selectGesture, q6 q6Var) {
        g(w6Var, e3.w(q6Var, androidx.compose.ui.graphics.c3.f(selectGesture.getSelectionArea()), P(selectGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()), androidx.compose.foundation.text.input.s.f20317b.b());
    }

    private final void N(androidx.compose.foundation.text.g4 g4Var, SelectRangeGesture selectRangeGesture, androidx.compose.foundation.text.selection.u3 u3Var) {
        if (u3Var != null) {
            u3Var.R0(e3.x(g4Var, androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionEndArea()), P(selectRangeGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()));
        }
    }

    private final void O(w6 w6Var, SelectRangeGesture selectRangeGesture, q6 q6Var) {
        g(w6Var, e3.y(q6Var, androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.c3.f(selectRangeGesture.getSelectionEndArea()), P(selectRangeGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i()), androidx.compose.foundation.text.input.s.f20317b.b());
    }

    private final int P(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? androidx.compose.ui.text.i3.f41793b.a() : androidx.compose.ui.text.i3.f41793b.a();
        }
        return androidx.compose.ui.text.i3.f41793b.b();
    }

    private final int e(w6 w6Var, HandwritingGesture handwritingGesture) {
        androidx.compose.foundation.text.input.p pVar = w6Var.f20179a;
        androidx.compose.foundation.text.input.c cVar = w6Var.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        jVarM.h();
        w6Var.Q(jVarM);
        pVar.e(cVar, true, cVar2);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        w6.H(w6Var, fallbackText, true, null, false, 12, null);
        return 5;
    }

    private final int f(HandwritingGesture handwritingGesture, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        function1.invoke(new androidx.compose.ui.text.input.b(fallbackText, 1));
        return 5;
    }

    private final void g(w6 w6Var, long j10, int i10) {
        if (!androidx.compose.ui.text.w3.h(j10)) {
            w6Var.v(i10, j10);
            return;
        }
        androidx.compose.foundation.text.input.p pVar = w6Var.f20179a;
        androidx.compose.foundation.text.input.c cVar = w6Var.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        jVarM.h();
        w6Var.Q(jVarM);
        pVar.e(cVar, true, cVar2);
    }

    private final int h(androidx.compose.foundation.text.g4 g4Var, DeleteGesture deleteGesture, androidx.compose.ui.text.f fVar, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        int iP = P(deleteGesture.getGranularity());
        long jV = e3.v(g4Var, androidx.compose.ui.graphics.c3.f(deleteGesture.getDeletionArea()), iP, androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jV)) {
            return f19532a.f(w2.a(deleteGesture), function1);
        }
        m(jV, fVar, androidx.compose.ui.text.i3.f(iP, androidx.compose.ui.text.i3.f41793b.b()), function1);
        return 1;
    }

    private final int i(w6 w6Var, DeleteGesture deleteGesture, q6 q6Var) {
        int iP = P(deleteGesture.getGranularity());
        long jW = e3.w(q6Var, androidx.compose.ui.graphics.c3.f(deleteGesture.getDeletionArea()), iP, androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jW)) {
            return f19532a.e(w6Var, w2.a(deleteGesture));
        }
        l(w6Var, jW, androidx.compose.ui.text.i3.f(iP, androidx.compose.ui.text.i3.f41793b.b()));
        return 1;
    }

    private final int j(androidx.compose.foundation.text.g4 g4Var, DeleteRangeGesture deleteRangeGesture, androidx.compose.ui.text.f fVar, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        int iP = P(deleteRangeGesture.getGranularity());
        long jX = e3.x(g4Var, androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionEndArea()), iP, androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jX)) {
            return f19532a.f(w2.a(deleteRangeGesture), function1);
        }
        m(jX, fVar, androidx.compose.ui.text.i3.f(iP, androidx.compose.ui.text.i3.f41793b.b()), function1);
        return 1;
    }

    private final int k(w6 w6Var, DeleteRangeGesture deleteRangeGesture, q6 q6Var) {
        int iP = P(deleteRangeGesture.getGranularity());
        long jY = e3.y(q6Var, androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.c3.f(deleteRangeGesture.getDeletionEndArea()), iP, androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jY)) {
            return f19532a.e(w6Var, w2.a(deleteRangeGesture));
        }
        l(w6Var, jY, androidx.compose.ui.text.i3.f(iP, androidx.compose.ui.text.i3.f41793b.b()));
        return 1;
    }

    private final void l(w6 w6Var, long j10, boolean z10) {
        if (z10) {
            j10 = e3.m(j10, w6Var.u());
        }
        w6.J(w6Var, "", j10, null, false, 12, null);
    }

    private final void m(long j10, androidx.compose.ui.text.f fVar, boolean z10, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        if (z10) {
            j10 = e3.m(j10, fVar);
        }
        function1.invoke(e3.n(new androidx.compose.ui.text.input.v0(androidx.compose.ui.text.w3.i(j10), androidx.compose.ui.text.w3.i(j10)), new androidx.compose.ui.text.input.h(androidx.compose.ui.text.w3.j(j10), 0)));
    }

    private final int p(androidx.compose.foundation.text.g4 g4Var, InsertGesture insertGesture, androidx.compose.ui.platform.o4 o4Var, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        androidx.compose.foundation.text.y6 y6VarN;
        androidx.compose.ui.text.p3 p3VarI;
        if (o4Var == null) {
            return f(w2.a(insertGesture), function1);
        }
        int iQ = e3.q(g4Var, e3.F(insertGesture.getInsertionPoint()), o4Var);
        if (iQ == -1 || !((y6VarN = g4Var.n()) == null || (p3VarI = y6VarN.i()) == null || !e3.z(p3VarI, iQ))) {
            return f(w2.a(insertGesture), function1);
        }
        r(iQ, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    private final int q(w6 w6Var, InsertGesture insertGesture, q6 q6Var, androidx.compose.ui.platform.o4 o4Var) {
        int iR = e3.r(q6Var, e3.F(insertGesture.getInsertionPoint()), o4Var);
        if (iR == -1) {
            return e(w6Var, w2.a(insertGesture));
        }
        w6.J(w6Var, insertGesture.getTextToInsert(), androidx.compose.ui.text.x3.a(iR), null, false, 12, null);
        return 1;
    }

    private final void r(int i10, String str, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        function1.invoke(e3.n(new androidx.compose.ui.text.input.v0(i10, i10), new androidx.compose.ui.text.input.b(str, 1)));
    }

    private final int s(androidx.compose.foundation.text.g4 g4Var, JoinOrSplitGesture joinOrSplitGesture, androidx.compose.ui.text.f fVar, androidx.compose.ui.platform.o4 o4Var, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        androidx.compose.foundation.text.y6 y6VarN;
        androidx.compose.ui.text.p3 p3VarI;
        if (o4Var == null) {
            return f(w2.a(joinOrSplitGesture), function1);
        }
        int iQ = e3.q(g4Var, e3.F(joinOrSplitGesture.getJoinOrSplitPoint()), o4Var);
        if (iQ == -1 || !((y6VarN = g4Var.n()) == null || (p3VarI = y6VarN.i()) == null || !e3.z(p3VarI, iQ))) {
            return f(w2.a(joinOrSplitGesture), function1);
        }
        long jE = e3.E(fVar, iQ);
        if (androidx.compose.ui.text.w3.h(jE)) {
            r(androidx.compose.ui.text.w3.n(jE), " ", function1);
        } else {
            m(jE, fVar, false, function1);
        }
        return 1;
    }

    private final int t(w6 w6Var, JoinOrSplitGesture joinOrSplitGesture, q6 q6Var, androidx.compose.ui.platform.o4 o4Var) {
        androidx.compose.ui.text.p3 p3VarF;
        if (w6Var.r() != w6Var.t()) {
            return 3;
        }
        int iR = e3.r(q6Var, e3.F(joinOrSplitGesture.getJoinOrSplitPoint()), o4Var);
        if (iR == -1 || ((p3VarF = q6Var.f()) != null && e3.z(p3VarF, iR))) {
            return e(w6Var, w2.a(joinOrSplitGesture));
        }
        long jE = e3.E(w6Var.u(), iR);
        if (androidx.compose.ui.text.w3.h(jE)) {
            w6.J(w6Var, " ", jE, null, false, 12, null);
        } else {
            l(w6Var, jE, false);
        }
        return 1;
    }

    private final int u(androidx.compose.foundation.text.g4 g4Var, RemoveSpaceGesture removeSpaceGesture, androidx.compose.ui.text.f fVar, androidx.compose.ui.platform.o4 o4Var, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        androidx.compose.foundation.text.y6 y6VarN = g4Var.n();
        long jT = e3.t(y6VarN != null ? y6VarN.i() : null, e3.F(removeSpaceGesture.getStartPoint()), e3.F(removeSpaceGesture.getEndPoint()), g4Var.m(), o4Var);
        if (androidx.compose.ui.text.w3.h(jT)) {
            return f19532a.f(w2.a(removeSpaceGesture), function1);
        }
        final kotlin.jvm.internal.i1.f fVar2 = new kotlin.jvm.internal.i1.f();
        fVar2.f312749a = -1;
        final kotlin.jvm.internal.i1.f fVar3 = new kotlin.jvm.internal.i1.f();
        fVar3.f312749a = -1;
        String strM = new Regex("\\s+").m(androidx.compose.ui.text.x3.e(fVar, jT), new Function1() { // from class: androidx.compose.foundation.text.input.internal.b3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d3.w(fVar2, fVar3, (MatchResult) obj);
            }
        });
        if (fVar2.f312749a == -1 || fVar3.f312749a == -1) {
            return f(w2.a(removeSpaceGesture), function1);
        }
        int iN = androidx.compose.ui.text.w3.n(jT) + fVar2.f312749a;
        int iN2 = androidx.compose.ui.text.w3.n(jT) + fVar3.f312749a;
        String strSubstring = strM.substring(fVar2.f312749a, strM.length() - (androidx.compose.ui.text.w3.j(jT) - fVar3.f312749a));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        function1.invoke(e3.n(new androidx.compose.ui.text.input.v0(iN, iN2), new androidx.compose.ui.text.input.b(strSubstring, 1)));
        return 1;
    }

    private final int v(w6 w6Var, RemoveSpaceGesture removeSpaceGesture, q6 q6Var, androidx.compose.ui.platform.o4 o4Var) {
        long jT = e3.t(q6Var.f(), e3.F(removeSpaceGesture.getStartPoint()), e3.F(removeSpaceGesture.getEndPoint()), q6Var.k(), o4Var);
        if (androidx.compose.ui.text.w3.h(jT)) {
            return f19532a.e(w6Var, w2.a(removeSpaceGesture));
        }
        final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        fVar.f312749a = -1;
        final kotlin.jvm.internal.i1.f fVar2 = new kotlin.jvm.internal.i1.f();
        fVar2.f312749a = -1;
        String strM = new Regex("\\s+").m(androidx.compose.ui.text.x3.e(w6Var.u(), jT), new Function1() { // from class: androidx.compose.foundation.text.input.internal.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d3.x(fVar, fVar2, (MatchResult) obj);
            }
        });
        if (fVar.f312749a != -1 && fVar2.f312749a != -1) {
            long jB = androidx.compose.ui.text.x3.b(androidx.compose.ui.text.w3.n(jT) + fVar.f312749a, androidx.compose.ui.text.w3.n(jT) + fVar2.f312749a);
            String strSubstring = strM.substring(fVar.f312749a, strM.length() - (androidx.compose.ui.text.w3.j(jT) - fVar2.f312749a));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            w6.J(w6Var, strSubstring, jB, null, false, 12, null);
            return 1;
        }
        return e(w6Var, w2.a(removeSpaceGesture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence w(kotlin.jvm.internal.i1.f fVar, kotlin.jvm.internal.i1.f fVar2, MatchResult matchResult) {
        if (fVar.f312749a == -1) {
            fVar.f312749a = matchResult.o6().l();
        }
        fVar2.f312749a = matchResult.o6().m() + 1;
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence x(kotlin.jvm.internal.i1.f fVar, kotlin.jvm.internal.i1.f fVar2, MatchResult matchResult) {
        if (fVar.f312749a == -1) {
            fVar.f312749a = matchResult.o6().l();
        }
        fVar2.f312749a = matchResult.o6().m() + 1;
        return "";
    }

    private final int y(androidx.compose.foundation.text.g4 g4Var, SelectGesture selectGesture, androidx.compose.foundation.text.selection.u3 u3Var, Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        long jV = e3.v(g4Var, androidx.compose.ui.graphics.c3.f(selectGesture.getSelectionArea()), P(selectGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jV)) {
            return f19532a.f(w2.a(selectGesture), function1);
        }
        C(jV, u3Var, function1);
        return 1;
    }

    private final int z(w6 w6Var, SelectGesture selectGesture, q6 q6Var, Function0<Unit> function0) {
        long jW = e3.w(q6Var, androidx.compose.ui.graphics.c3.f(selectGesture.getSelectionArea()), P(selectGesture.getGranularity()), androidx.compose.ui.text.m3.f41991a.i());
        if (androidx.compose.ui.text.w3.h(jW)) {
            return f19532a.e(w6Var, w2.a(selectGesture));
        }
        w6Var.L(jW);
        if (function0 != null) {
            function0.invoke();
        }
        return 1;
    }

    public final boolean H(@NotNull androidx.compose.foundation.text.g4 g4Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable final androidx.compose.foundation.text.selection.u3 u3Var, @Nullable CancellationSignal cancellationSignal) {
        androidx.compose.ui.text.p3 p3VarI;
        androidx.compose.ui.text.o3 o3VarL;
        androidx.compose.ui.text.f fVarB = g4Var.B();
        if (fVarB == null) {
            return false;
        }
        androidx.compose.foundation.text.y6 y6VarN = g4Var.n();
        if (!Intrinsics.areEqual(fVarB, (y6VarN == null || (p3VarI = y6VarN.i()) == null || (o3VarL = p3VarI.l()) == null) ? null : o3VarL.n())) {
            return false;
        }
        if (x2.a(previewableHandwritingGesture)) {
            L(g4Var, y2.a(previewableHandwritingGesture), u3Var);
        } else if (v1.a(previewableHandwritingGesture)) {
            D(g4Var, w1.a(previewableHandwritingGesture), u3Var);
        } else if (x1.a(previewableHandwritingGesture)) {
            N(g4Var, y1.a(previewableHandwritingGesture), u3Var);
        } else {
            if (!z1.a(previewableHandwritingGesture)) {
                return false;
            }
            F(g4Var, a2.a(previewableHandwritingGesture), u3Var);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.z2
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    d3.K(u3Var);
                }
            });
        }
        return true;
    }

    public final boolean I(@NotNull final w6 w6Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @NotNull q6 q6Var, @Nullable CancellationSignal cancellationSignal) {
        if (x2.a(previewableHandwritingGesture)) {
            M(w6Var, y2.a(previewableHandwritingGesture), q6Var);
        } else if (v1.a(previewableHandwritingGesture)) {
            E(w6Var, w1.a(previewableHandwritingGesture), q6Var);
        } else if (x1.a(previewableHandwritingGesture)) {
            O(w6Var, y1.a(previewableHandwritingGesture), q6Var);
        } else {
            if (!z1.a(previewableHandwritingGesture)) {
                return false;
            }
            G(w6Var, a2.a(previewableHandwritingGesture), q6Var);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.c3
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    d3.J(w6Var);
                }
            });
        }
        return true;
    }

    public final int n(@NotNull androidx.compose.foundation.text.g4 g4Var, @NotNull HandwritingGesture handwritingGesture, @Nullable androidx.compose.foundation.text.selection.u3 u3Var, @Nullable androidx.compose.ui.platform.o4 o4Var, @NotNull Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        androidx.compose.ui.text.p3 p3VarI;
        androidx.compose.ui.text.o3 o3VarL;
        androidx.compose.ui.text.f fVarB = g4Var.B();
        if (fVarB == null) {
            return 3;
        }
        androidx.compose.foundation.text.y6 y6VarN = g4Var.n();
        if (!Intrinsics.areEqual(fVarB, (y6VarN == null || (p3VarI = y6VarN.i()) == null || (o3VarL = p3VarI.l()) == null) ? null : o3VarL.n())) {
            return 3;
        }
        if (x2.a(handwritingGesture)) {
            return y(g4Var, y2.a(handwritingGesture), u3Var, function1);
        }
        if (v1.a(handwritingGesture)) {
            return h(g4Var, w1.a(handwritingGesture), fVarB, function1);
        }
        if (x1.a(handwritingGesture)) {
            return A(g4Var, y1.a(handwritingGesture), u3Var, function1);
        }
        if (z1.a(handwritingGesture)) {
            return j(g4Var, a2.a(handwritingGesture), fVarB, function1);
        }
        if (o2.a(handwritingGesture)) {
            return s(g4Var, p2.a(handwritingGesture), fVarB, o4Var, function1);
        }
        if (k2.a(handwritingGesture)) {
            return p(g4Var, l2.a(handwritingGesture), o4Var, function1);
        }
        if (m2.a(handwritingGesture)) {
            return u(g4Var, n2.a(handwritingGesture), fVarB, o4Var, function1);
        }
        return 2;
    }

    public final int o(@NotNull w6 w6Var, @NotNull HandwritingGesture handwritingGesture, @NotNull q6 q6Var, @Nullable Function0<Unit> function0, @Nullable androidx.compose.ui.platform.o4 o4Var) {
        if (x2.a(handwritingGesture)) {
            return z(w6Var, y2.a(handwritingGesture), q6Var, function0);
        }
        if (v1.a(handwritingGesture)) {
            return i(w6Var, w1.a(handwritingGesture), q6Var);
        }
        if (x1.a(handwritingGesture)) {
            return B(w6Var, y1.a(handwritingGesture), q6Var, function0);
        }
        if (z1.a(handwritingGesture)) {
            return k(w6Var, a2.a(handwritingGesture), q6Var);
        }
        if (o2.a(handwritingGesture)) {
            return t(w6Var, p2.a(handwritingGesture), q6Var, o4Var);
        }
        if (k2.a(handwritingGesture)) {
            return q(w6Var, l2.a(handwritingGesture), q6Var, o4Var);
        }
        if (m2.a(handwritingGesture)) {
            return v(w6Var, n2.a(handwritingGesture), q6Var, o4Var);
        }
        return 2;
    }
}
