package com.superwall.sdk.config.models;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = SurveyShowCondition.class)
@SourceDebugExtension({"SMAP\nSurveyShowCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyShowCondition.kt\ncom/superwall/sdk/config/models/SurveyShowConditionSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class SurveyShowConditionSerializer implements KSerializer<SurveyShowCondition> {

    @NotNull
    public static final SurveyShowConditionSerializer INSTANCE = new SurveyShowConditionSerializer();

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.config.models.SurveyShowCondition", null, 1);
        pluginGeneratedSerialDescriptor.i("rawValue", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SurveyShowConditionSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    @Override // kotlinx.serialization.e
    @NotNull
    public SurveyShowCondition deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        for (SurveyShowCondition surveyShowCondition : SurveyShowCondition.values()) {
            if (Intrinsics.areEqual(surveyShowCondition.getRawValue(), strDecodeString)) {
                if (surveyShowCondition != null) {
                    return surveyShowCondition;
                }
                throw new IllegalArgumentException("Unsupported survey condition.");
            }
        }
        surveyShowCondition = null;
        if (surveyShowCondition != null) {
            return surveyShowCondition;
        }
        throw new IllegalArgumentException("Unsupported survey condition.");
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull SurveyShowCondition value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.getRawValue());
    }
}
