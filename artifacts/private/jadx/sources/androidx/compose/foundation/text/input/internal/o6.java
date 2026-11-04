package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface o6 extends f3 {
    void a(int i10);

    boolean c(@NotNull w.g gVar);

    int d(@NotNull HandwritingGesture handwritingGesture);

    @NotNull
    androidx.compose.foundation.text.input.l getText();

    boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i10);

    void sendKeyEvent(@NotNull KeyEvent keyEvent);
}
