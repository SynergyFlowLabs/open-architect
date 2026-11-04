package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = JsonNullSerializer.class)
public final class JsonNull extends JsonPrimitive {

    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();

    @NotNull
    private static final String content = AbstractJsonLexerKt.NULL;

    private JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String getContent() {
        return content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return false;
    }

    @NotNull
    public final KSerializer<JsonNull> serializer() {
        return JsonNullSerializer.INSTANCE;
    }
}
