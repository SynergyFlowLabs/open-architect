package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JsonElementSerializersKt {
    @NotNull
    public static final JsonDecoder asJsonDecoder(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + j1.d(decoder.getClass()));
    }

    @NotNull
    public static final JsonEncoder asJsonEncoder(@NotNull Encoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + j1.d(encoder.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor defer(Function0<? extends SerialDescriptor> function0) {
        return new SerialDescriptor(function0) { // from class: kotlinx.serialization.json.JsonElementSerializersKt.defer.1
            private final f0 original$delegate;

            {
                this.original$delegate = g0.c(function0);
            }

            private final SerialDescriptor getOriginal() {
                return (SerialDescriptor) this.original$delegate.getValue();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public List<Annotation> getElementAnnotations(int i10) {
                return getOriginal().getElementAnnotations(i10);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public SerialDescriptor getElementDescriptor(int i10) {
                return getOriginal().getElementDescriptor(i10);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementIndex(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return getOriginal().getElementIndex(name);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getElementName(int i10) {
                return getOriginal().getElementName(i10);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementsCount() {
                return getOriginal().getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public l getKind() {
                return getOriginal().getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getSerialName() {
                return getOriginal().getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isElementOptional(int i10) {
                return getOriginal().isElementOptional(i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(Encoder encoder) {
        asJsonEncoder(encoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(Decoder decoder) {
        asJsonDecoder(decoder);
    }
}
