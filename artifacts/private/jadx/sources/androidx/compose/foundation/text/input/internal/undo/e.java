package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.j;
import androidx.compose.foundation.text.input.k;
import androidx.compose.foundation.text.input.p;
import androidx.compose.ui.text.w3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,171:1\n297#2,11:172\n297#2,11:183\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n*L\n114#1:172,11\n122#1:183,11\n*E\n"})
public final class e {
    public static final void a(@NotNull p pVar, @NotNull d dVar) {
        pVar.m().l().e();
        j jVarM = pVar.m();
        jVarM.C(dVar.d(), dVar.d() + dVar.h().length(), dVar.f());
        k.i(jVarM, w3.n(dVar.e()), w3.i(dVar.e()));
        pVar.C(pVar.t(), j.R(pVar.m(), 0L, null, null, null, 15, null), true);
    }

    public static final void b(@NotNull p pVar, @NotNull d dVar) {
        pVar.m().l().e();
        j jVarM = pVar.m();
        jVarM.C(dVar.d(), dVar.d() + dVar.f().length(), dVar.h());
        k.i(jVarM, w3.n(dVar.g()), w3.i(dVar.g()));
        pVar.C(pVar.t(), j.R(pVar.m(), 0L, null, null, null, 15, null), true);
    }
}
