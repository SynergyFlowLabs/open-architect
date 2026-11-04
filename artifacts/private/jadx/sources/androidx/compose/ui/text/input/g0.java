package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(24)
class g0 extends f0 {
    public g0(@NotNull InputConnection inputConnection, @NotNull Function1<? super e0, Unit> function1) {
        super(inputConnection, function1);
    }

    @Override // androidx.compose.ui.text.input.f0
    protected final void b(@NotNull InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.ui.text.input.f0, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.f0, android.view.inputmethod.InputConnection
    @Nullable
    public final Handler getHandler() {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.getHandler();
        }
        return null;
    }
}
