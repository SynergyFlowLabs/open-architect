package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import kotlinx.serialization.d0;
import kotlinx.serialization.e;
import kotlinx.serialization.g;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.m0;
import kotlinx.serialization.modules.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JsonStreamsKt {
    private static final int HIGH_SURROGATE_HEADER = 55232;
    private static final int LOW_SURROGATE_HEADER = 56320;
    private static final int SINGLE_CHAR_MAX_CODEPOINT = 65535;

    @JsonFriendModuleApi
    public static final <T> T decodeByReader(@NotNull Json json, @NotNull e<? extends T> deserializer, @NotNull InternalJsonReader reader) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        int i10 = 5 ^ 4;
        ReaderJsonLexer readerJsonLexerReaderJsonLexer$default = ReaderJsonLexerKt.ReaderJsonLexer$default(json, reader, null, 4, null);
        try {
            T t10 = (T) new StreamingJsonDecoder(json, WriteMode.OBJ, readerJsonLexerReaderJsonLexer$default, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
            readerJsonLexerReaderJsonLexer$default.expectEof();
            readerJsonLexerReaderJsonLexer$default.release();
            return t10;
        } catch (Throwable th2) {
            readerJsonLexerReaderJsonLexer$default.release();
            throw th2;
        }
    }

    @JsonFriendModuleApi
    @g
    @NotNull
    public static final <T> Sequence<T> decodeToSequenceByReader(@NotNull Json json, @NotNull InternalJsonReader reader, @NotNull e<? extends T> deserializer, @NotNull DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        final Iterator itJsonIterator = JsonIteratorKt.JsonIterator(format, json, ReaderJsonLexerKt.ReaderJsonLexer(json, reader, new char[16384]), deserializer);
        return o.f(new Sequence<T>() { // from class: kotlinx.serialization.json.internal.JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return itJsonIterator;
            }
        });
    }

    public static /* synthetic */ Sequence decodeToSequenceByReader$default(Json json, InternalJsonReader internalJsonReader, e eVar, DecodeSequenceMode decodeSequenceMode, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequenceByReader(json, internalJsonReader, eVar, decodeSequenceMode);
    }

    @JsonFriendModuleApi
    public static final <T> void encodeByWriter(@NotNull Json json, @NotNull InternalJsonWriter writer, @NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new StreamingJsonEncoder(writer, json, WriteMode.OBJ, new JsonEncoder[WriteMode.getEntries().size()]).encodeSerializableValue(serializer, t10);
    }

    public static /* synthetic */ Sequence decodeToSequenceByReader$default(Json json, InternalJsonReader reader, DecodeSequenceMode format, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(format, "format");
        f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, m0.o(serializersModule, null), format);
    }

    @JsonFriendModuleApi
    @g
    public static final /* synthetic */ <T> Sequence<T> decodeToSequenceByReader(Json json, InternalJsonReader reader, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(format, "format");
        f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, m0.o(serializersModule, null), format);
    }
}
