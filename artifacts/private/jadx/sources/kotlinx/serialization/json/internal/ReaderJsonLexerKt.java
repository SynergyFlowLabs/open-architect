package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ReaderJsonLexerKt {
    public static final int BATCH_SIZE = 16384;
    private static final int DEFAULT_THRESHOLD = 128;

    @NotNull
    public static final ReaderJsonLexer ReaderJsonLexer(@NotNull Json json, @NotNull InternalJsonReader reader, @NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return !json.getConfiguration().getAllowComments() ? new ReaderJsonLexer(reader, buffer) : new ReaderJsonLexerWithComments(reader, buffer);
    }

    public static /* synthetic */ ReaderJsonLexer ReaderJsonLexer$default(Json json, InternalJsonReader internalJsonReader, char[] cArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cArr = CharArrayPoolBatchSize.INSTANCE.take();
        }
        return ReaderJsonLexer(json, internalJsonReader, cArr);
    }
}
