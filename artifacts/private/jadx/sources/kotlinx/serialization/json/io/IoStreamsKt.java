package kotlinx.serialization.json.io;

import androidx.exifinterface.media.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlin.sequences.Sequence;
import kotlinx.io.c0;
import kotlinx.io.x;
import kotlinx.serialization.d0;
import kotlinx.serialization.e;
import kotlinx.serialization.g;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.io.internal.IoSerialReader;
import kotlinx.serialization.json.io.internal.JsonToIoStreamWriter;
import kotlinx.serialization.m0;
import kotlinx.serialization.modules.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class IoStreamsKt {
    @g
    public static final <T> T decodeFromSource(@NotNull Json json, @NotNull e<? extends T> deserializer, @NotNull c0 source) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(source, "source");
        return (T) JsonStreamsKt.decodeByReader(json, deserializer, new IoSerialReader(source));
    }

    @g
    @NotNull
    public static final <T> Sequence<T> decodeSourceToSequence(@NotNull Json json, @NotNull c0 source, @NotNull e<? extends T> deserializer, @NotNull DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        return JsonStreamsKt.decodeToSequenceByReader(json, new IoSerialReader(source), deserializer, format);
    }

    public static /* synthetic */ Sequence decodeSourceToSequence$default(Json json, c0 c0Var, e eVar, DecodeSequenceMode decodeSequenceMode, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeSourceToSequence(json, c0Var, eVar, decodeSequenceMode);
    }

    @g
    public static final <T> void encodeToSink(@NotNull Json json, @NotNull d0<? super T> serializer, T t10, @NotNull x sink) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(sink, "sink");
        JsonToIoStreamWriter jsonToIoStreamWriter = new JsonToIoStreamWriter(sink);
        try {
            JsonStreamsKt.encodeByWriter(json, jsonToIoStreamWriter, serializer, t10);
        } finally {
            jsonToIoStreamWriter.release();
        }
    }

    @g
    public static final /* synthetic */ <T> T decodeFromSource(Json json, c0 source) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSource(json, m0.o(serializersModule, null), source);
    }

    @g
    public static final /* synthetic */ <T> Sequence<T> decodeSourceToSequence(Json json, c0 source, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(format, "format");
        f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return decodeSourceToSequence(json, source, m0.o(serializersModule, null), format);
    }

    public static /* synthetic */ Sequence decodeSourceToSequence$default(Json json, c0 source, DecodeSequenceMode format, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(format, "format");
        f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return decodeSourceToSequence(json, source, m0.o(serializersModule, null), format);
    }

    @g
    public static final /* synthetic */ <T> void encodeToSink(Json json, T t10, x sink) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        encodeToSink(json, m0.o(serializersModule, null), t10, sink);
    }
}
