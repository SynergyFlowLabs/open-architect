package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(25)
class h0 extends g0 {
    public h0(@NotNull InputConnection inputConnection, @NotNull Function1<? super e0, Unit> function1) {
        super(inputConnection, function1);
    }

    @Override // androidx.compose.ui.text.input.f0, android.view.inputmethod.InputConnection
    public final boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
