package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(34)
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f19686a = new l();

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public final void b(@Nullable androidx.compose.foundation.text.g4 g4Var, @Nullable androidx.compose.foundation.text.selection.u3 u3Var, @NotNull HandwritingGesture handwritingGesture, @Nullable androidx.compose.ui.platform.o4 o4Var, @Nullable Executor executor, @Nullable final IntConsumer intConsumer, @NotNull Function1<? super androidx.compose.ui.text.input.j, Unit> function1) {
        final int iN = g4Var != null ? d3.f19532a.n(g4Var, handwritingGesture, u3Var, o4Var, function1) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.input.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.c(intConsumer, iN);
                }
            });
        } else {
            intConsumer.accept(iN);
        }
    }

    public final boolean d(@Nullable androidx.compose.foundation.text.g4 g4Var, @Nullable androidx.compose.foundation.text.selection.u3 u3Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        if (g4Var != null) {
            return d3.f19532a.H(g4Var, previewableHandwritingGesture, u3Var, cancellationSignal);
        }
        return false;
    }
}
