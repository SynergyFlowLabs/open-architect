package androidx.compose.ui.text.input;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(34)
class k0 extends h0 {
    public k0(@NotNull InputConnection inputConnection, @NotNull Function1<? super e0, Unit> function1) {
        super(inputConnection, function1);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture, @Nullable Executor executor, @Nullable IntConsumer intConsumer) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            inputConnectionC.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
