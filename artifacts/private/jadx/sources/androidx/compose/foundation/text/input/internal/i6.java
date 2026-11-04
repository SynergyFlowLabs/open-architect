package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class i6 {
    @NotNull
    public static final h6 b() {
        return new d();
    }

    public static final boolean c(@NotNull KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(KeyEvent keyEvent, int i10) {
        return androidx.compose.ui.input.key.i.b(androidx.compose.ui.input.key.e.a(keyEvent)) == i10;
    }
}
