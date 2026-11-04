package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class w1<T> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f316045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f316046b;

    public w1(@NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f316045a = serializer;
        this.f316046b = new u2(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.e
    @Nullable
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeNotNullMark() ? (T) decoder.decodeSerializableValue(this.f316045a) : (T) decoder.decodeNull();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w1.class == obj.getClass() && Intrinsics.areEqual(this.f316045a, ((w1) obj).f316045a);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f316046b;
    }

    public int hashCode() {
        return this.f316045a.hashCode();
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (t10 == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.f316045a, t10);
        }
    }
}
