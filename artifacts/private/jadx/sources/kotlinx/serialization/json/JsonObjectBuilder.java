package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@JsonDslMarker
public final class JsonObjectBuilder {

    @NotNull
    private final Map<String, JsonElement> content = new LinkedHashMap();

    @a1
    public JsonObjectBuilder() {
    }

    @a1
    @NotNull
    public final JsonObject build() {
        return new JsonObject(this.content);
    }

    @Nullable
    public final JsonElement put(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return this.content.put(key, element);
    }
}
