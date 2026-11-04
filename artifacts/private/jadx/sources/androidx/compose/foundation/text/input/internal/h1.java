package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h1 f19614a = new h1();

    private h1() {
    }

    public final byte a(@NotNull Locale locale) {
        return Character.getDirectionality(s.b(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0));
    }
}
