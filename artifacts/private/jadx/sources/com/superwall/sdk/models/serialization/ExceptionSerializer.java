package com.superwall.sdk.models.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = Exception.class)
public final class ExceptionSerializer implements KSerializer<Exception> {

    @NotNull
    public static final ExceptionSerializer INSTANCE = new ExceptionSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.c("Exception", e.i.f315839a);

    private ExceptionSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public Exception deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new Exception(decoder.decodeString());
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull Exception value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String message = value.getMessage();
        if (message == null) {
            message = "Unknown exception";
        }
        encoder.encodeString(message);
    }
}
