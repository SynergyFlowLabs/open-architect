package androidx.compose.foundation.text.input.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nImeEditCommand.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,462:1\n1107#2:463\n1085#2,2:464\n519#3:466\n424#3,8:478\n323#4,2:467\n327#4:477\n328#4,2:486\n330#4:494\n270#5,8:469\n279#5,6:488\n*S KotlinDebug\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope\n*L\n102#1:463\n102#1:464,2\n117#1:466\n122#1:478,8\n119#1:467,2\n119#1:477\n119#1:486,2\n119#1:494\n119#1:469,8\n119#1:488,6\n*E\n"})
public final class e1 implements f3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19574d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w6 f19575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<Function1<androidx.compose.foundation.text.input.j, Unit>> f19577c = new androidx.compose.runtime.collection.d<>(new Function1[16], 0);

    public e1(@NotNull w6 w6Var) {
        this.f19575a = w6Var;
    }

    @Override // androidx.compose.foundation.text.input.internal.f3
    public void b(@NotNull Function1<? super androidx.compose.foundation.text.input.j, Unit> function1) {
        beginBatchEdit();
        this.f19577c.d(function1);
        endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.f3
    public boolean beginBatchEdit() {
        this.f19576b++;
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.f3
    public long e(long j10) {
        return this.f19575a.A(j10);
    }

    @Override // androidx.compose.foundation.text.input.internal.f3
    public boolean endBatchEdit() {
        int i10 = this.f19576b - 1;
        this.f19576b = i10;
        if (i10 == 0 && this.f19577c.R() != 0) {
            w6 w6Var = this.f19575a;
            androidx.compose.foundation.text.input.p pVar = w6Var.f20179a;
            androidx.compose.foundation.text.input.c cVar = w6Var.f20180b;
            androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
            pVar.m().l().e();
            androidx.compose.foundation.text.input.j jVarM = pVar.m();
            androidx.compose.runtime.collection.d<Function1<androidx.compose.foundation.text.input.j, Unit>> dVar = this.f19577c;
            Function1<androidx.compose.foundation.text.input.j, Unit>[] function1Arr = dVar.f35552a;
            int iR = dVar.R();
            for (int i11 = 0; i11 < iR; i11++) {
                function1Arr[i11].invoke(jVarM);
            }
            w6Var.Q(jVarM);
            pVar.e(cVar, false, cVar2);
            this.f19577c.r();
        }
        return this.f19576b > 0;
    }

    @Override // androidx.compose.foundation.text.input.internal.f3
    public long f(long j10) {
        return this.f19575a.x(j10);
    }
}
