package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class m3 implements KSerializer<kotlin.q1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m3 f315975a = new m3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f315976b = v0.a("kotlin.UByte", hk.a.D(kotlin.jvm.internal.o.f312769a));

    private m3() {
    }

    public byte b(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlin.q1.n(decoder.decodeInline(getDescriptor()).decodeByte());
    }

    public void c(@NotNull Encoder encoder, byte b10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeByte(b10);
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return kotlin.q1.c(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f315976b;
    }

    @Override // kotlinx.serialization.d0
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((kotlin.q1) obj).x0());
    }
}
