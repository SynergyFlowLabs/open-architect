package androidx.compose.foundation.text.input.internal;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f1 f19601a = new f1();

    private f1() {
    }

    public final byte a(@NotNull Locale locale) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
    }
}
