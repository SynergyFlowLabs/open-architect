package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final int a(int i10) {
        return Character.charCount(i10);
    }

    public static final int b(@NotNull CharSequence charSequence, int i10) {
        return Character.codePointAt(charSequence, i10);
    }

    public static final int c(@NotNull CharSequence charSequence, int i10) {
        return Character.codePointBefore(charSequence, i10);
    }
}
