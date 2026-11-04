package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final long a(@NotNull KeyEvent keyEvent) {
        return i.a(keyEvent.getKeyCode());
    }

    public static final int b(@NotNull KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? d.f38913b.c() : d.f38913b.b();
        }
        return d.f38913b.a();
    }

    public static final int c(@NotNull KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(@NotNull KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(@NotNull KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(@NotNull KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    public static final boolean g(@NotNull KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
