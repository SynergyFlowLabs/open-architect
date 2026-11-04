package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class s3 implements KSerializer<kotlin.y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s3 f316008a = new s3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f316009b = v0.a("kotlin.ULong", hk.a.I(kotlin.jvm.internal.o0.f312774a));

    private s3() {
    }

    public long b(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlin.y1.n(decoder.decodeInline(getDescriptor()).decodeLong());
    }

    public void c(@NotNull Encoder encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeLong(j10);
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return kotlin.y1.c(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f316009b;
    }

    @Override // kotlinx.serialization.d0
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((kotlin.y1) obj).z0());
    }
}
