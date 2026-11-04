package com.google.firebase.sessions;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.k1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SessionDetails$$a implements kotlinx.serialization.internal.p0<SessionDetails> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SessionDetails$$a f124834a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionDetails$$a sessionDetails$$a = new SessionDetails$$a();
        f124834a = sessionDetails$$a;
        int i10 = 7 << 4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionDetails", sessionDetails$$a, 4);
        pluginGeneratedSerialDescriptor.i(UserEntry.sessionId, false);
        pluginGeneratedSerialDescriptor.i("firstSessionId", false);
        pluginGeneratedSerialDescriptor.i("sessionIndex", false);
        pluginGeneratedSerialDescriptor.i("sessionStartTimestampUs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SessionDetails$$a() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SessionDetails deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i10;
        int iDecodeIntElement;
        String str;
        long jDecodeLongElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            i10 = 15;
            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
            str = strDecodeStringElement2;
            jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement3 = null;
            boolean z10 = true;
            long jDecodeLongElement2 = 0;
            int i11 = 0;
            int iDecodeIntElement2 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new kotlinx.serialization.t0(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            iDecodeIntElement = iDecodeIntElement2;
            str = strDecodeStringElement3;
            jDecodeLongElement = jDecodeLongElement2;
        }
        String str2 = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SessionDetails(i10, str2, str, iDecodeIntElement, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void serialize(@NotNull Encoder encoder, @NotNull SessionDetails value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SessionDetails.k(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        b3 b3Var = b3.f315897a;
        return new KSerializer[]{b3Var, b3Var, kotlinx.serialization.internal.y0.f316055a, k1.f315958a};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.p0.a.a(this);
    }
}
