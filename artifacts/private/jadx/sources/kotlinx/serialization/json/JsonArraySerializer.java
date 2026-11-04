package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@a1
public final class JsonArraySerializer implements KSerializer<JsonArray> {

    @NotNull
    public static final JsonArraySerializer INSTANCE = new JsonArraySerializer();

    @NotNull
    private static final SerialDescriptor descriptor = JsonArrayDescriptor.INSTANCE;

    private static final class JsonArrayDescriptor implements SerialDescriptor {

        @NotNull
        public static final JsonArrayDescriptor INSTANCE = new JsonArrayDescriptor();

        @NotNull
        private static final String serialName = "kotlinx.serialization.json.JsonArray";
        private final /* synthetic */ SerialDescriptor $$delegate_0 = hk.a.i(JsonElementSerializer.INSTANCE).getDescriptor();

        private JsonArrayDescriptor() {
        }

        @kotlinx.serialization.g
        public static /* synthetic */ void getSerialName$annotations() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public List<Annotation> getAnnotations() {
            return this.$$delegate_0.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public List<Annotation> getElementAnnotations(int i10) {
            return this.$$delegate_0.getElementAnnotations(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public SerialDescriptor getElementDescriptor(int i10) {
            return this.$$delegate_0.getElementDescriptor(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int getElementIndex(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.$$delegate_0.getElementIndex(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public String getElementName(int i10) {
            return this.$$delegate_0.getElementName(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int getElementsCount() {
            return this.$$delegate_0.getElementsCount();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public l getKind() {
            return this.$$delegate_0.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @NotNull
        public String getSerialName() {
            return serialName;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isElementOptional(int i10) {
            return this.$$delegate_0.isElementOptional(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.$$delegate_0.isInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isNullable() {
            return this.$$delegate_0.isNullable();
        }
    }

    private JsonArraySerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public JsonArray deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElementSerializersKt.verify(decoder);
        return new JsonArray((List) hk.a.i(JsonElementSerializer.INSTANCE).deserialize(decoder));
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull JsonArray value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        hk.a.i(JsonElementSerializer.INSTANCE).serialize(encoder, value);
    }
}
