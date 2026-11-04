package kotlinx.serialization.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlin.sequences.Sequence;
import kotlinx.serialization.d0;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JvmStreamsKt {
    @kotlinx.serialization.g
    public static final <T> T decodeFromStream(@NotNull Json json, @NotNull kotlinx.serialization.e<? extends T> deserializer, @NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        JavaStreamSerialReader javaStreamSerialReader = new JavaStreamSerialReader(stream);
        try {
            T t10 = (T) JsonStreamsKt.decodeByReader(json, deserializer, javaStreamSerialReader);
            javaStreamSerialReader.release();
            return t10;
        } catch (Throwable th2) {
            javaStreamSerialReader.release();
            throw th2;
        }
    }

    @kotlinx.serialization.g
    @NotNull
    public static final <T> Sequence<T> decodeToSequence(@NotNull Json json, @NotNull InputStream stream, @NotNull kotlinx.serialization.e<? extends T> deserializer, @NotNull DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        return JsonStreamsKt.decodeToSequenceByReader(json, new JavaStreamSerialReader(stream), deserializer, format);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream inputStream, kotlinx.serialization.e eVar, DecodeSequenceMode decodeSequenceMode, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, eVar, decodeSequenceMode);
    }

    @kotlinx.serialization.g
    public static final <T> void encodeToStream(@NotNull Json json, @NotNull d0<? super T> serializer, T t10, @NotNull OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        JsonToJavaStreamWriter jsonToJavaStreamWriter = new JsonToJavaStreamWriter(stream);
        try {
            JsonStreamsKt.encodeByWriter(json, jsonToJavaStreamWriter, serializer, t10);
            jsonToJavaStreamWriter.release();
        } catch (Throwable th2) {
            jsonToJavaStreamWriter.release();
            throw th2;
        }
    }

    @kotlinx.serialization.g
    public static final /* synthetic */ <T> Sequence<T> decodeToSequence(Json json, InputStream stream, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, stream, m0.o(serializersModule, null), format);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream stream, DecodeSequenceMode format, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, stream, m0.o(serializersModule, null), format);
    }

    @kotlinx.serialization.g
    public static final /* synthetic */ <T> T decodeFromStream(Json json, InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromStream(json, m0.o(serializersModule, null), stream);
    }

    @kotlinx.serialization.g
    public static final /* synthetic */ <T> void encodeToStream(Json json, T t10, OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        encodeToStream(json, m0.o(serializersModule, null), t10, stream);
    }
}
