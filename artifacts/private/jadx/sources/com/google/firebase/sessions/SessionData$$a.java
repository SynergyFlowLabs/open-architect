package com.google.firebase.sessions;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SessionData$$a implements kotlinx.serialization.internal.p0<SessionData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SessionData$$a f124829a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionData$$a sessionData$$a = new SessionData$$a();
        f124829a = sessionData$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionData", sessionData$$a, 3);
        pluginGeneratedSerialDescriptor.i("sessionDetails", false);
        pluginGeneratedSerialDescriptor.i("backgroundTime", true);
        pluginGeneratedSerialDescriptor.i("processDataMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SessionData$$a() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SessionData deserialize(@NotNull Decoder decoder) {
        int i10;
        SessionDetails sessionDetails;
        Time time;
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SessionData.f124825d;
        SessionDetails sessionDetails2 = null;
        if (dVarBeginStructure.c()) {
            SessionDetails sessionDetails3 = (SessionDetails) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, SessionDetails$$a.f124834a, null);
            Time time2 = (Time) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Time$$a.f124838a, null);
            map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            sessionDetails = sessionDetails3;
            i10 = 7;
            time = time2;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Time time3 = null;
            Map map2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    sessionDetails2 = (SessionDetails) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, SessionDetails$$a.f124834a, sessionDetails2);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    time3 = (Time) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Time$$a.f124838a, time3);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new kotlinx.serialization.t0(iDecodeElementIndex);
                    }
                    map2 = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], map2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            sessionDetails = sessionDetails2;
            time = time3;
            map = map2;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new SessionData(i10, sessionDetails, time, map, (v2) null);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void serialize(@NotNull Encoder encoder, @NotNull SessionData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        SessionData.j(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SessionDetails$$a.f124834a, hk.a.v(Time$$a.f124838a), hk.a.v(SessionData.f124825d[2])};
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
