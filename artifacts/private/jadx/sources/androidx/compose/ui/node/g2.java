package androidx.compose.ui.node;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface g2 {

    public interface a {
        void a(@NotNull Throwable th2);
    }

    @kotlin.l(message = "Use PlatformTextInputModifierNode instead.")
    static /* synthetic */ void getTextInputService$annotations() {
    }

    @androidx.compose.ui.p
    default boolean N(@NotNull androidx.compose.ui.input.indirect.c cVar) {
        return false;
    }

    default void P(boolean z10) {
    }

    @NotNull
    androidx.compose.ui.unit.d getDensity();

    @NotNull
    androidx.compose.ui.semantics.x getSemanticsOwner();

    @NotNull
    androidx.compose.ui.text.input.a1 getTextInputService();

    default void m() {
    }

    boolean r(@NotNull KeyEvent keyEvent);

    default void setAccessibilityEventBatchIntervalMillis(long j10) {
    }

    default void setUncaughtExceptionHandler(@Nullable a aVar) {
    }
}
