package kotlinx.serialization.json;

import androidx.collection.g3;
import com.rabbitmq.client.k0;
import kotlin.a0;
import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import kotlin.y1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,350:1\n337#1,4:351\n329#1,4:355\n337#1,4:359\n329#1,4:363\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n259#1:351,4\n269#1:355,4\n278#1:359,4\n284#1:363,4\n*E\n"})
public final class JsonElementKt {

    @NotNull
    private static final SerialDescriptor jsonUnquotedLiteralDescriptor = v0.a("kotlinx.serialization.json.JsonUnquotedLiteral", hk.a.K(q1.f312784a));

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new JsonLiteral(bool, false, null, 4, null);
    }

    @kotlinx.serialization.g
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final JsonPrimitive m1612JsonPrimitive7apg3OU(byte b10) {
        return m1613JsonPrimitiveVKZWuLQ(y1.n(((long) b10) & 255));
    }

    @SuppressAnimalSniffer
    @kotlinx.serialization.g
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final JsonPrimitive m1613JsonPrimitiveVKZWuLQ(long j10) {
        return JsonUnquotedLiteral(Long.toUnsignedString(j10));
    }

    @kotlinx.serialization.g
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final JsonPrimitive m1614JsonPrimitiveWZ4Q5Ns(int i10) {
        return m1613JsonPrimitiveVKZWuLQ(y1.n(((long) i10) & k0.f265952a));
    }

    @kotlinx.serialization.g
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final JsonPrimitive m1615JsonPrimitivexj2QHRw(short s10) {
        return m1613JsonPrimitiveVKZWuLQ(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @kotlinx.serialization.g
    @NotNull
    public static final JsonPrimitive JsonUnquotedLiteral(@Nullable String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        if (Intrinsics.areEqual(str, JsonNull.INSTANCE.getContent())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new JsonLiteral(str, false, jsonUnquotedLiteralDescriptor);
    }

    private static final Void error(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + j1.d(jsonElement.getClass()) + " is not a " + str);
    }

    private static final <T> T exceptionToNull(Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    private static final <T> T exceptionToNumberFormatException(Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final boolean getBoolean(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        Boolean booleanStrictOrNull = StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    @Nullable
    public static final String getContentOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final double getDouble(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.L0(jsonPrimitive.getContent());
    }

    public static final float getFloat(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.N0(jsonPrimitive.getContent());
    }

    public static final int getInt(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            long longImpl = parseLongImpl(jsonPrimitive);
            if (g3.f12261h <= longImpl && longImpl <= g3.f12256c) {
                return (int) longImpl;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (g3.f12261h <= jLongValue && jLongValue <= g3.f12256c) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    @NotNull
    public static final JsonArray getJsonArray(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        error(jsonElement, "JsonArray");
        throw new a0();
    }

    @NotNull
    public static final JsonNull getJsonNull(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonNull jsonNull = jsonElement instanceof JsonNull ? (JsonNull) jsonElement : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        error(jsonElement, "JsonNull");
        throw new a0();
    }

    @NotNull
    public static final JsonObject getJsonObject(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        error(jsonElement, "JsonObject");
        throw new a0();
    }

    @NotNull
    public static final JsonPrimitive getJsonPrimitive(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error(jsonElement, "JsonPrimitive");
        throw new a0();
    }

    @NotNull
    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    public static final long getLong(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return parseLongImpl(jsonPrimitive);
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    @Nullable
    public static final Long getLongOrNull(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(parseLongImpl(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final long parseLongImpl(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteralFully();
    }

    @a1
    @NotNull
    public static final Void unexpectedJson(@NotNull String key, @NotNull String expected) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expected, "expected");
        throw new IllegalArgumentException("Element " + key + " is not a " + expected);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        int i10 = 5 << 0;
        return new JsonLiteral(number, false, null, 4, null);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(str, true, null, 4, null);
    }

    @kotlinx.serialization.g
    @NotNull
    public static final JsonNull JsonPrimitive(@Nullable Void r10) {
        return JsonNull.INSTANCE;
    }
}
