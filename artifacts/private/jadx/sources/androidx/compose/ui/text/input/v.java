package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.l(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public interface v {
    void a(int i10);

    void b(@NotNull List<? extends j> list);

    void c(@NotNull KeyEvent keyEvent);

    void d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15);

    void e(@NotNull r0 r0Var);
}
