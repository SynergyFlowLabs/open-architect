package androidx.core.text;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final boolean a(@NotNull CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@NotNull CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
