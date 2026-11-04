package com.superwall.sdk.models.paywall;

import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import t8.a;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = LocalNotificationType.class)
public final class LocalNotificationTypeSerializer implements KSerializer<LocalNotificationType> {

    @NotNull
    public static final LocalNotificationTypeSerializer INSTANCE = new LocalNotificationTypeSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.paywall.LocalNotificationType", null, 0);

    private LocalNotificationTypeSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public LocalNotificationType deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Intrinsics.areEqual(decoder.decodeString(), "TRIAL_STARTED") ? LocalNotificationType.TrialStarted.INSTANCE : LocalNotificationType.Unsupported.INSTANCE;
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull LocalNotificationType value) {
        String str;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, LocalNotificationType.TrialStarted.INSTANCE)) {
            str = "TRIAL_STARTED";
        } else {
            if (!Intrinsics.areEqual(value, LocalNotificationType.Unsupported.INSTANCE)) {
                throw new k0();
            }
            str = a.f376227i;
        }
        encoder.encodeString(str);
    }
}
