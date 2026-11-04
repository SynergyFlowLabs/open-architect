package com.superwall.sdk.models.paywall;

import hk.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class LocalNotification$$serializer implements p0<LocalNotification> {

    @NotNull
    public static final LocalNotification$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        LocalNotification$$serializer localNotification$$serializer = new LocalNotification$$serializer();
        INSTANCE = localNotification$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.models.paywall.LocalNotification", localNotification$$serializer, 6);
        pluginGeneratedSerialDescriptor.i("id", true);
        pluginGeneratedSerialDescriptor.i("type", false);
        pluginGeneratedSerialDescriptor.i("title", false);
        pluginGeneratedSerialDescriptor.i("subtitle", true);
        pluginGeneratedSerialDescriptor.i("body", false);
        pluginGeneratedSerialDescriptor.i("delay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocalNotification$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        int i10 = 0 >> 6;
        return new KSerializer[]{y0.f316055a, LocalNotificationTypeSerializer.INSTANCE, b3Var, a.v(b3Var), b3Var, k1.f315958a};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final LocalNotification deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i10;
        long jDecodeLongElement;
        LocalNotificationType localNotificationType;
        String str;
        String str2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
            LocalNotificationType localNotificationType2 = (LocalNotificationType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, LocalNotificationTypeSerializer.INSTANCE, null);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            i10 = 63;
            str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, null);
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
            str = strDecodeStringElement2;
            localNotificationType = localNotificationType2;
            jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 5);
        } else {
            long jDecodeLongElement2 = 0;
            boolean z10 = true;
            iDecodeIntElement = 0;
            LocalNotificationType localNotificationType3 = null;
            String strDecodeStringElement3 = null;
            String str3 = null;
            String strDecodeStringElement4 = null;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        localNotificationType3 = (LocalNotificationType) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, LocalNotificationTypeSerializer.INSTANCE, localNotificationType3);
                        i11 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, str3);
                        i11 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            i10 = i11;
            jDecodeLongElement = jDecodeLongElement2;
            localNotificationType = localNotificationType3;
            str = strDecodeStringElement3;
            str2 = str3;
            strDecodeStringElement = strDecodeStringElement4;
        }
        int i12 = iDecodeIntElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new LocalNotification(i10, i12, localNotificationType, str, str2, strDecodeStringElement, jDecodeLongElement, (v2) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull LocalNotification value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        LocalNotification.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
