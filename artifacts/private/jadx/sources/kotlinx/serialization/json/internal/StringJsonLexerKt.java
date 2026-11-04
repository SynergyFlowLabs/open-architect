package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class StringJsonLexerKt {
    @NotNull
    public static final StringJsonLexer StringJsonLexer(@NotNull Json json, @NotNull String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        return !json.getConfiguration().getAllowComments() ? new StringJsonLexer(source) : new StringJsonLexerWithComments(source);
    }
}
