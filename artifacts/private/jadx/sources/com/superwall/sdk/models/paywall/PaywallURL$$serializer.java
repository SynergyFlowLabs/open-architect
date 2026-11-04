package com.superwall.sdk.models.paywall;

import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.u0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class PaywallURL$$serializer implements p0<PaywallURL> {

    @NotNull
    public static final PaywallURL$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PaywallURL$$serializer paywallURL$$serializer = new PaywallURL$$serializer();
        INSTANCE = paywallURL$$serializer;
        u0 u0Var = new u0("com.superwall.sdk.models.paywall.PaywallURL", paywallURL$$serializer);
        u0Var.i("value", false);
        descriptor = u0Var;
    }

    private PaywallURL$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{b3.f315897a};
    }

    @Override // kotlinx.serialization.e
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return PaywallURL.m46boximpl(m53deserializeFL48qAY(decoder));
    }

    @NotNull
    /* JADX INFO: renamed from: deserialize-FL48qAY, reason: not valid java name */
    public final String m53deserializeFL48qAY(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return PaywallURL.m47constructorimpl(decoder.decodeInline(descriptor).decodeString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m54serialize1pAmztU(encoder, ((PaywallURL) obj).m52unboximpl());
    }

    /* JADX INFO: renamed from: serialize-1pAmztU, reason: not valid java name */
    public final void m54serialize1pAmztU(@NotNull Encoder encoder, @NotNull String value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
        if (encoderEncodeInline == null) {
            return;
        }
        encoderEncodeInline.encodeString(value);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
