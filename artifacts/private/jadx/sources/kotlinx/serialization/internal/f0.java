package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class f0 implements KSerializer<kotlin.time.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f315915a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f315916b = new r2("kotlin.time.Duration", kotlinx.serialization.descriptors.e.i.f315839a);

    private f0() {
    }

    public long b(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlin.time.c.f313406b.n0(decoder.decodeString());
    }

    public void c(@NotNull Encoder encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeString(kotlin.time.c.J0(j10));
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return kotlin.time.c.q(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f315916b;
    }

    @Override // kotlinx.serialization.d0
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((kotlin.time.c) obj).S0());
    }
}
