package androidx.compose.ui.text.android;

import android.text.Spanned;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    public static final boolean a(@NotNull Spanned spanned, @NotNull Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(@NotNull Spanned spanned, @NotNull Class<?> cls, int i10, int i11) {
        return spanned.nextSpanTransition(i10 - 1, i11, cls) != i11;
    }
}
