package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class p3 implements KSerializer<kotlin.u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p3 f315995a = new p3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f315996b = v0.a("kotlin.UInt", hk.a.H(kotlin.jvm.internal.i0.f312739a));

    private p3() {
    }

    public int b(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlin.u1.n(decoder.decodeInline(getDescriptor()).decodeInt());
    }

    public void c(@NotNull Encoder encoder, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeInt(i10);
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return kotlin.u1.c(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f315996b;
    }

    @Override // kotlinx.serialization.d0
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((kotlin.u1) obj).z0());
    }
}
