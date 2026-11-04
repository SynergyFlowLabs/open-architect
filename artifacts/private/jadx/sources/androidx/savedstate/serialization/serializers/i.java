package androidx.savedstate.serialization.serializers;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> implements KSerializer<k0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f75236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f75237b;

    public i(@NotNull KSerializer<T> valueSerializer) {
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f75236a = valueSerializer;
        kotlinx.serialization.descriptors.l kind = valueSerializer.getDescriptor().getKind();
        this.f75237b = kind instanceof kotlinx.serialization.descriptors.e ? kotlinx.serialization.descriptors.k.c("kotlinx.coroutines.flow.MutableStateFlow", (kotlinx.serialization.descriptors.e) kind) : kotlinx.serialization.descriptors.k.d("kotlinx.coroutines.flow.MutableStateFlow", valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void c() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k0<T> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return b1.a(decoder.decodeSerializableValue(this.f75236a));
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull k0<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.f75236a, value.getValue());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f75237b;
    }
}
