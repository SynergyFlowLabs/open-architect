package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.e;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class JsonIteratorWsSeparated<T> implements Iterator<T>, qj.a {

    @NotNull
    private final e<T> deserializer;

    @NotNull
    private final Json json;

    @NotNull
    private final ReaderJsonLexer lexer;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonIteratorWsSeparated(@NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull e<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.json = json;
        this.lexer = lexer;
        this.deserializer = deserializer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.lexer.isNotEof();
    }

    @Override // java.util.Iterator
    public T next() {
        return (T) new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null).decodeSerializableValue(this.deserializer);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
