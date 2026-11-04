package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@JsonDslMarker
public final class JsonArrayBuilder {

    @NotNull
    private final List<JsonElement> content = new ArrayList();

    @a1
    public JsonArrayBuilder() {
    }

    public final boolean add(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.content.add(element);
        return true;
    }

    @kotlinx.serialization.g
    public final boolean addAll(@NotNull Collection<? extends JsonElement> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.content.addAll(elements);
    }

    @a1
    @NotNull
    public final JsonArray build() {
        return new JsonArray(this.content);
    }
}
