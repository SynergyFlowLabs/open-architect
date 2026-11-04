package com.superwall.sdk.config.models;

import io.sentry.rrweb.h;
import java.util.List;
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
import kotlinx.serialization.internal.e0;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class Survey$$serializer implements p0<Survey> {

    @NotNull
    public static final Survey$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Survey$$serializer survey$$serializer = new Survey$$serializer();
        INSTANCE = survey$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.config.models.Survey", survey$$serializer, 9);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i("assignmentKey", false);
        pluginGeneratedSerialDescriptor.i("title", false);
        pluginGeneratedSerialDescriptor.i("message", false);
        pluginGeneratedSerialDescriptor.i(h.f306695g, false);
        pluginGeneratedSerialDescriptor.i("presentationCondition", false);
        pluginGeneratedSerialDescriptor.i("presentationProbability", false);
        pluginGeneratedSerialDescriptor.i("includeOtherOption", false);
        pluginGeneratedSerialDescriptor.i("includeCloseOption", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Survey$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = Survey.$childSerializers[4];
        b3 b3Var = b3.f315897a;
        i iVar = i.f315935a;
        return new KSerializer[]{b3Var, b3Var, b3Var, b3Var, kSerializer, SurveyShowConditionSerializer.INSTANCE, e0.f315908a, iVar, iVar};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Survey deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        SurveyShowCondition surveyShowCondition;
        List list;
        boolean zDecodeBooleanElement2;
        int i10;
        double d10;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Survey.$childSerializers;
        int i11 = 7;
        if (dVarBeginStructure.c()) {
            String strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            SurveyShowCondition surveyShowCondition2 = (SurveyShowCondition) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, SurveyShowConditionSerializer.INSTANCE, null);
            double dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 6);
            list = list2;
            str = strDecodeStringElement;
            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            surveyShowCondition = surveyShowCondition2;
            str4 = strDecodeStringElement4;
            i10 = 511;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            d10 = dDecodeDoubleElement;
        } else {
            boolean z10 = true;
            boolean zDecodeBooleanElement3 = false;
            SurveyShowCondition surveyShowCondition3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            double dDecodeDoubleElement2 = 0.0d;
            boolean zDecodeBooleanElement4 = false;
            int i12 = 0;
            List list3 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = 7;
                        break;
                    case 0:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i12 |= 1;
                        i11 = 7;
                        break;
                    case 1:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list3);
                        i12 |= 16;
                        break;
                    case 5:
                        surveyShowCondition3 = (SurveyShowCondition) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, SurveyShowConditionSerializer.INSTANCE, surveyShowCondition3);
                        i12 |= 32;
                        break;
                    case 6:
                        dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, i11);
                        i12 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i12 |= 256;
                        break;
                    default:
                        throw new t0(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            surveyShowCondition = surveyShowCondition3;
            list = list3;
            zDecodeBooleanElement2 = zDecodeBooleanElement4;
            i10 = i12;
            d10 = dDecodeDoubleElement2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Survey(i10, str, str2, str3, str4, list, surveyShowCondition, d10, zDecodeBooleanElement, zDecodeBooleanElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Survey value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Survey.write$Self$superwall_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
