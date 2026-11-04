package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.l(message = "Use Clipboard instead, which supports suspend functions.", replaceWith = @kotlin.b1(expression = "Clipboard", imports = {"androidx.compose.ui.platform.Clipboard"}))
public interface o1 {
    default boolean T3() {
        androidx.compose.ui.text.f text = getText();
        return text != null && text.length() > 0;
    }

    default void U3(@Nullable k1 k1Var) {
    }

    void V3(@NotNull androidx.compose.ui.text.f fVar);

    @NotNull
    default ClipboardManager a() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    @Nullable
    default k1 b() {
        return null;
    }

    @Nullable
    androidx.compose.ui.text.f getText();
}
