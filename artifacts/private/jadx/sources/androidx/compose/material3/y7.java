package androidx.compose.material3;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface y7 {
    static /* synthetic */ String b(y7 y7Var, Long l10, Locale locale, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatDate");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return y7Var.c(l10, locale, z10);
    }

    @Nullable
    String a(@Nullable Long l10, @NotNull Locale locale);

    @Nullable
    String c(@Nullable Long l10, @NotNull Locale locale, boolean z10);
}
