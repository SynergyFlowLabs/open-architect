package com.superwall.sdk.models.serialization;

import java.util.UUID;
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
@e0(forClass = UUID.class)
public final class UUIDSerializer implements KSerializer<UUID> {

    @NotNull
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.c("UUID", e.i.f315839a);

    private UUIDSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public UUID deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        UUID uuidFromString = UUID.fromString(decoder.decodeString());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        return uuidFromString;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull UUID value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        encoder.encodeString(string);
    }
}
