package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    private n() {
    }

    public static int a(@p0 Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @NonNull
    public static String b(@NonNull String str) {
        return TextUtils.htmlEncode(str);
    }
}
