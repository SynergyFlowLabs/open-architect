package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class e0 implements KSerializer<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f315908a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f315909b = new r2("kotlin.Double", kotlinx.serialization.descriptors.e.d.f315834a);

    private e0() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.decodeDouble());
    }

    public void c(@NotNull Encoder encoder, double d10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeDouble(d10);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f315909b;
    }

    @Override // kotlinx.serialization.d0
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Number) obj).doubleValue());
    }
}
