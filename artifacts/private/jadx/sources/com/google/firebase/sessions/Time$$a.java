package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.k1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Time$$a implements kotlinx.serialization.internal.p0<Time> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Time$$a f124838a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Time$$a time$$a = new Time$$a();
        f124838a = time$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.Time", time$$a, 3);
        pluginGeneratedSerialDescriptor.i("ms", false);
        pluginGeneratedSerialDescriptor.i("us", true);
        pluginGeneratedSerialDescriptor.i("seconds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Time$$a() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Time deserialize(@NotNull Decoder decoder) {
        int i10;
        long jDecodeLongElement;
        long j10;
        long j11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        if (dVarBeginStructure.c()) {
            long jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement3 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
            jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
            i10 = 7;
            j10 = jDecodeLongElement2;
            j11 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement4 = 0;
            boolean z10 = true;
            int i11 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement5 = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement6 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new kotlinx.serialization.t0(iDecodeElementIndex);
                    }
                    jDecodeLongElement4 = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            jDecodeLongElement = jDecodeLongElement4;
            j10 = jDecodeLongElement5;
            j11 = jDecodeLongElement6;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Time(i10, j10, j11, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void serialize(@NotNull Encoder encoder, @NotNull Time value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Time.h(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        k1 k1Var = k1.f315958a;
        return new KSerializer[]{k1Var, k1Var, k1Var};
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
