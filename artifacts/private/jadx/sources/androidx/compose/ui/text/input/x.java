package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.l(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public interface x {
    void a(int i10, int i11, int i12, int i13);

    void b();

    void c();

    void d(@NotNull CursorAnchorInfo cursorAnchorInfo);

    void e(int i10, @NotNull ExtractedText extractedText);

    void f();

    boolean isActive();
}
