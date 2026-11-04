package ni;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull String data, int i10, @NotNull String pattern) {
        super("Failed to parse date string: \"" + data + "\" at index " + i10 + ". Pattern: \"" + pattern + '\"');
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
    }
}
