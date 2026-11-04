package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class JsonTreeListDecoder extends AbstractJsonTreeDecoder {
    private int currentIndex;
    private final int size;

    @NotNull
    private final JsonArray value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListDecoder(@NotNull Json json, @NotNull JsonArray value) {
        super(json, value, null, 4, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 2 | 4;
        this.value = value;
        this.size = getValue().size();
        this.currentIndex = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    @NotNull
    public JsonElement currentElement(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return getValue().get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.encoding.d
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.currentIndex;
        if (i10 >= this.size - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.currentIndex = i11;
        return i11;
    }

    @Override // kotlinx.serialization.internal.r1
    @NotNull
    protected String elementName(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    @NotNull
    public JsonArray getValue() {
        return this.value;
    }
}
