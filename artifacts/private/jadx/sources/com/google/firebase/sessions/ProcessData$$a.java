package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class ProcessData$$a implements kotlinx.serialization.internal.p0<ProcessData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProcessData$$a f124824a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ProcessData$$a processData$$a = new ProcessData$$a();
        f124824a = processData$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.ProcessData", processData$$a, 2);
        pluginGeneratedSerialDescriptor.i("pid", false);
        pluginGeneratedSerialDescriptor.i("uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProcessData$$a() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ProcessData deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String strDecodeStringElement;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            iDecodeIntElement = 0;
            int i11 = 0;
            String strDecodeStringElement2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new kotlinx.serialization.t0(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i11 |= 2;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new ProcessData(i10, iDecodeIntElement, strDecodeStringElement, v2Var);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void serialize(@NotNull Encoder encoder, @NotNull ProcessData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        ProcessData.g(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{kotlinx.serialization.internal.y0.f316055a, b3.f315897a};
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
