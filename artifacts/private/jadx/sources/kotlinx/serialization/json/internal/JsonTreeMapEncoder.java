package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class JsonTreeMapEncoder extends JsonTreeEncoder {
    private boolean isKey;
    private String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapEncoder(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    @NotNull
    public JsonElement getCurrent() {
        return new JsonObject(getContent());
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void putElement(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.isKey) {
            Map<String, JsonElement> content = getContent();
            String str = this.tag;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                str = null;
            }
            content.put(str, element);
            this.isKey = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.tag = ((JsonPrimitive) element).getContent();
            this.isKey = false;
        } else {
            if (element instanceof JsonObject) {
                throw JsonExceptionsKt.InvalidKeyKindException(JsonObjectSerializer.INSTANCE.getDescriptor());
            }
            if (!(element instanceof JsonArray)) {
                throw new k0();
            }
            throw JsonExceptionsKt.InvalidKeyKindException(JsonArraySerializer.INSTANCE.getDescriptor());
        }
    }
}
