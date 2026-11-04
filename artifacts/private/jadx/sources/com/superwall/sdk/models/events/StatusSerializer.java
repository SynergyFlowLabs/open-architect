package com.superwall.sdk.models.events;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class StatusSerializer implements KSerializer<EventsResponse.Status> {

    @NotNull
    public static final StatusSerializer INSTANCE = new StatusSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = k.c("Status", e.i.f315839a);

    private StatusSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public EventsResponse.Status deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        try {
            String upperCase = decoder.decodeString().toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return EventsResponse.Status.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            return EventsResponse.Status.PARTIAL_SUCCESS;
        }
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull EventsResponse.Status value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.name());
    }
}
