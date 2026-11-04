package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(24)
final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g1 f19605a = new g1();

    private g1() {
    }

    public final byte a(@NotNull Locale locale) {
        return Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
    }
}
