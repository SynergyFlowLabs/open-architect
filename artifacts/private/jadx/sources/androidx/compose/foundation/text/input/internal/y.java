package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(24)
class y extends x {
    public y(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.x, androidx.compose.foundation.text.input.internal.v
    public void sendKeyEvent(@NotNull KeyEvent keyEvent) {
        l().dispatchKeyEventFromInputMethod(k(), keyEvent);
    }
}
