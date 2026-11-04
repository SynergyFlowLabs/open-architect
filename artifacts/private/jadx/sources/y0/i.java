package y0;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    @NotNull
    public static final String a(@NotNull Locale locale) {
        return locale.getLanguage();
    }

    @NotNull
    public static final String b(@NotNull Locale locale) {
        return locale.toLanguageTag();
    }

    @NotNull
    public static final String c(@NotNull Locale locale) {
        return locale.getCountry();
    }

    @NotNull
    public static final String d(@NotNull Locale locale) {
        return locale.getScript();
    }
}
