package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1#2:351\n*E\n"})
public final class JsonLiteral extends JsonPrimitive {

    @Nullable
    private final SerialDescriptor coerceToInlineType;

    @NotNull
    private final String content;
    private final boolean isString;

    public /* synthetic */ JsonLiteral(Object obj, boolean z10, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : serialDescriptor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && JsonLiteral.class == obj.getClass()) {
            JsonLiteral jsonLiteral = (JsonLiteral) obj;
            return isString() == jsonLiteral.isString() && Intrinsics.areEqual(getContent(), jsonLiteral.getContent());
        }
        return false;
    }

    @Nullable
    public final SerialDescriptor getCoerceToInlineType$kotlinx_serialization_json() {
        return this.coerceToInlineType;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String getContent() {
        return this.content;
    }

    @SuppressAnimalSniffer
    public int hashCode() {
        return (Boolean.hashCode(isString()) * 31) + getContent().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return this.isString;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String toString() {
        if (!isString()) {
            return getContent();
        }
        StringBuilder sb2 = new StringBuilder();
        StringOpsKt.printQuoted(sb2, getContent());
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonLiteral(@NotNull Object body, boolean z10, @Nullable SerialDescriptor serialDescriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.isString = z10;
        this.coerceToInlineType = serialDescriptor;
        this.content = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
