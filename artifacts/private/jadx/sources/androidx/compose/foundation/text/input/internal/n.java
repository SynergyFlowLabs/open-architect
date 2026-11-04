package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(34)
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f19711a = new n();

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public final void b(@NotNull o6 o6Var, @NotNull HandwritingGesture handwritingGesture, @Nullable Executor executor, @Nullable final IntConsumer intConsumer) {
        final int iD = o6Var.d(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.input.internal.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.c(intConsumer, iD);
                }
            });
        } else {
            intConsumer.accept(iD);
        }
    }

    public final boolean d(@NotNull o6 o6Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        return o6Var.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
