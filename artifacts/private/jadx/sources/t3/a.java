package t3;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements KSerializer<n3<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f376184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f376185b;

    public a(@NotNull KSerializer<T> valueSerializer) {
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f376184a = valueSerializer;
        l kind = valueSerializer.getDescriptor().getKind();
        this.f376185b = kind instanceof kotlinx.serialization.descriptors.e ? k.c("androidx.compose.runtime.MutableState", (kotlinx.serialization.descriptors.e) kind) : k.d("androidx.compose.runtime.MutableState", valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void c() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n3<T> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return d7.g(decoder.decodeSerializableValue(this.f376184a), null, 2, null);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull n3<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.f376184a, value.getValue());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f376185b;
    }
}
