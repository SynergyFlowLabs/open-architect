package kotlinx.serialization.json;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.d0;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringJsonLexerKt;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.m0;
import kotlinx.serialization.modules.h;
import kotlinx.serialization.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Json implements r0 {

    @NotNull
    public static final Default Default = new Default(null);

    @NotNull
    private final DescriptorSchemaCache _schemaCache;

    @NotNull
    private final JsonConfiguration configuration;

    @NotNull
    private final kotlinx.serialization.modules.f serializersModule;

    public static final class Default extends Json {
        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Default() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), h.a(), null);
        }
    }

    public /* synthetic */ Json(JsonConfiguration jsonConfiguration, kotlinx.serialization.modules.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, fVar);
    }

    @l(level = n.ERROR, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @b1(expression = "schemaCache", imports = {}))
    public static /* synthetic */ void get_schemaCache$kotlinx_serialization_json$annotations() {
    }

    public final <T> T decodeFromJsonElement(@NotNull kotlinx.serialization.e<? extends T> deserializer, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return (T) TreeJsonDecoderKt.readJson(this, element, deserializer);
    }

    @Override // kotlinx.serialization.r0
    public final <T> T decodeFromString(@NotNull kotlinx.serialization.e<? extends T> deserializer, @org.intellij.lang.annotations.d(prefix = "", suffix = "", value = PeopleCardEntry.json) @NotNull String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        StringJsonLexer StringJsonLexer = StringJsonLexerKt.StringJsonLexer(this, string);
        T t10 = (T) new StreamingJsonDecoder(this, WriteMode.OBJ, StringJsonLexer, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        StringJsonLexer.expectEof();
        return t10;
    }

    @NotNull
    public final <T> JsonElement encodeToJsonElement(@NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return TreeJsonEncoderKt.writeJson(this, t10, serializer);
    }

    @Override // kotlinx.serialization.r0
    @NotNull
    public final <T> String encodeToString(@NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        JsonToStringWriter jsonToStringWriter = new JsonToStringWriter();
        try {
            JsonStreamsKt.encodeByWriter(this, jsonToStringWriter, serializer, t10);
            return jsonToStringWriter.toString();
        } finally {
            jsonToStringWriter.release();
        }
    }

    @NotNull
    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // kotlinx.serialization.x
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return this.serializersModule;
    }

    @NotNull
    public final DescriptorSchemaCache get_schemaCache$kotlinx_serialization_json() {
        return this._schemaCache;
    }

    @NotNull
    public final JsonElement parseToJsonElement(@org.intellij.lang.annotations.d(prefix = "", suffix = "", value = PeopleCardEntry.json) @NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return (JsonElement) decodeFromString(JsonElementSerializer.INSTANCE, string);
    }

    private Json(JsonConfiguration jsonConfiguration, kotlinx.serialization.modules.f fVar) {
        this.configuration = jsonConfiguration;
        this.serializersModule = fVar;
        this._schemaCache = new DescriptorSchemaCache();
    }

    public final /* synthetic */ <T> T decodeFromString(@org.intellij.lang.annotations.d(prefix = "", suffix = "", value = PeopleCardEntry.json) String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.serialization.modules.f serializersModule = getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromString(m0.o(serializersModule, null), string);
    }

    public final /* synthetic */ <T> String encodeToString(T t10) {
        kotlinx.serialization.modules.f serializersModule = getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return encodeToString(m0.o(serializersModule, null), t10);
    }
}
