package com.superwall.sdk.models.triggers;

import androidx.exifinterface.media.a;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.config.ComputedPropertyRequest$$serializer;
import com.superwall.sdk.models.triggers.TriggerRule;
import io.ktor.http.t1;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class TriggerRule {

    @NotNull
    private final List<ComputedPropertyRequest> computedPropertyRequests;

    @NotNull
    private String experimentGroupId;

    @NotNull
    private String experimentId;

    @Nullable
    private final String expression;

    @Nullable
    private final String expressionCEL;

    @Nullable
    private final String expressionJs;

    @Nullable
    private final TriggerRuleOccurrence occurrence;

    @NotNull
    private final TriggerPreload preload;

    @NotNull
    private List<VariantOption> variants;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, new kotlinx.serialization.internal.f(VariantOption$$serializer.INSTANCE), null, null, null, null, new kotlinx.serialization.internal.f(ComputedPropertyRequest$$serializer.INSTANCE), null};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TriggerRule> serializer() {
            return TriggerRule$$serializer.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final TriggerRule stub() {
            List listListOf = CollectionsKt.listOf(new VariantOption(Experiment.Variant.VariantType.HOLDOUT, a.f51345a5, 20, null));
            List listEmptyList = CollectionsKt.emptyList();
            TriggerPreloadBehavior triggerPreloadBehavior = TriggerPreloadBehavior.ALWAYS;
            String str = null;
            String str2 = null;
            TriggerRuleOccurrence triggerRuleOccurrence = null;
            int i10 = 0 >> 0;
            return new TriggerRule("1", "2", listListOf, (String) (0 == true ? 1 : 0), str, str2, triggerRuleOccurrence, listEmptyList, new TriggerPreload(triggerPreloadBehavior, null, 2, 0 == true ? 1 : 0), 32, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    @SourceDebugExtension({"SMAP\nTriggerRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TriggerRule.kt\ncom/superwall/sdk/models/triggers/TriggerRule$TriggerPreloadSerializer\n+ 2 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,180:1\n315#2,8:181\n315#2,8:189\n*S KotlinDebug\n*F\n+ 1 TriggerRule.kt\ncom/superwall/sdk/models/triggers/TriggerRule$TriggerPreloadSerializer\n*L\n109#1:181,8\n110#1:189,8\n*E\n"})
    public static final class TriggerPreloadSerializer implements KSerializer<TriggerPreload> {

        @NotNull
        public static final TriggerPreloadSerializer INSTANCE = new TriggerPreloadSerializer();

        @NotNull
        private static final SerialDescriptor descriptor = k.e("TriggerPreload", new SerialDescriptor[0], new Function1() { // from class: bg.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TriggerRule.TriggerPreloadSerializer.descriptor$lambda$0((kotlinx.serialization.descriptors.a) obj);
            }
        });

        private TriggerPreloadSerializer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit descriptor$lambda$0(kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            buildClassSerialDescriptor.a("behavior", b3.f315897a.getDescriptor(), CollectionsKt.emptyList(), false);
            buildClassSerialDescriptor.a("requiresReEvaluation", i.f315935a.getDescriptor(), CollectionsKt.emptyList(), true);
            return Unit.f312394a;
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
        @NotNull
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.e
        @NotNull
        public TriggerPreload deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            d dVarBeginStructure = decoder.beginStructure(getDescriptor());
            TriggerPreloadBehavior triggerPreloadBehaviorValueOf = null;
            Boolean boolValueOf = null;
            while (true) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    dVarBeginStructure.endStructure(getDescriptor());
                    if (triggerPreloadBehaviorValueOf != null) {
                        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE) ? new TriggerPreload(TriggerPreloadBehavior.ALWAYS, boolValueOf) : new TriggerPreload(triggerPreloadBehaviorValueOf, boolValueOf);
                    }
                    throw new c0("Behavior is missing");
                }
                if (iDecodeElementIndex == 0) {
                    String upperCase = dVarBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    triggerPreloadBehaviorValueOf = TriggerPreloadBehavior.valueOf(upperCase);
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new c0("Unknown index " + iDecodeElementIndex);
                    }
                    boolValueOf = Boolean.valueOf(dVarBeginStructure.decodeBooleanElement(getDescriptor(), iDecodeElementIndex));
                }
            }
        }

        @Override // kotlinx.serialization.d0
        public void serialize(@NotNull Encoder encoder, @NotNull TriggerPreload value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            e eVarBeginStructure = encoder.beginStructure(getDescriptor());
            eVarBeginStructure.encodeStringElement(getDescriptor(), 0, value.getBehavior().getRawValue());
            if (value.getRequiresReEvaluation() != null) {
                eVarBeginStructure.encodeBooleanElement(getDescriptor(), 1, value.getRequiresReEvaluation().booleanValue());
            }
            eVarBeginStructure.endStructure(getDescriptor());
        }
    }

    public /* synthetic */ TriggerRule(int i10, String str, String str2, List list, String str3, String str4, String str5, TriggerRuleOccurrence triggerRuleOccurrence, List list2, TriggerPreload triggerPreload, v2 v2Var) {
        if (263 != (i10 & 263)) {
            g2.b(i10, 263, TriggerRule$$serializer.INSTANCE.getDescriptor());
        }
        this.experimentId = str;
        this.experimentGroupId = str2;
        this.variants = list;
        if ((i10 & 8) == 0) {
            this.expression = null;
        } else {
            this.expression = str3;
        }
        if ((i10 & 16) == 0) {
            this.expressionJs = null;
        } else {
            this.expressionJs = str4;
        }
        if ((i10 & 32) == 0) {
            this.expressionCEL = null;
        } else {
            this.expressionCEL = str5;
        }
        if ((i10 & 64) == 0) {
            this.occurrence = null;
        } else {
            this.occurrence = triggerRuleOccurrence;
        }
        if ((i10 & 128) == 0) {
            this.computedPropertyRequests = CollectionsKt.emptyList();
        } else {
            this.computedPropertyRequests = list2;
        }
        this.preload = triggerPreload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TriggerRule copy$default(TriggerRule triggerRule, String str, String str2, List list, String str3, String str4, String str5, TriggerRuleOccurrence triggerRuleOccurrence, List list2, TriggerPreload triggerPreload, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = triggerRule.experimentId;
        }
        if ((i10 & 2) != 0) {
            str2 = triggerRule.experimentGroupId;
        }
        if ((i10 & 4) != 0) {
            list = triggerRule.variants;
        }
        if ((i10 & 8) != 0) {
            str3 = triggerRule.expression;
        }
        if ((i10 & 16) != 0) {
            str4 = triggerRule.expressionJs;
        }
        if ((i10 & 32) != 0) {
            str5 = triggerRule.expressionCEL;
        }
        if ((i10 & 64) != 0) {
            triggerRuleOccurrence = triggerRule.occurrence;
        }
        if ((i10 & 128) != 0) {
            list2 = triggerRule.computedPropertyRequests;
        }
        if ((i10 & 256) != 0) {
            triggerPreload = triggerRule.preload;
        }
        List list3 = list2;
        TriggerPreload triggerPreload2 = triggerPreload;
        String str6 = str5;
        TriggerRuleOccurrence triggerRuleOccurrence2 = triggerRuleOccurrence;
        String str7 = str4;
        List list4 = list;
        return triggerRule.copy(str, str2, list4, str3, str7, str6, triggerRuleOccurrence2, list3, triggerPreload2);
    }

    @a0("computed_properties")
    public static /* synthetic */ void getComputedPropertyRequests$annotations() {
    }

    @a0("experiment_group_id")
    public static /* synthetic */ void getExperimentGroupId$annotations() {
    }

    @a0("experiment_id")
    public static /* synthetic */ void getExperimentId$annotations() {
    }

    @a0("expression")
    public static /* synthetic */ void getExpression$annotations() {
    }

    @a0("expression_cel")
    public static /* synthetic */ void getExpressionCEL$annotations() {
    }

    @a0("expression_js")
    public static /* synthetic */ void getExpressionJs$annotations() {
    }

    @a0("occurrence")
    public static /* synthetic */ void getOccurrence$annotations() {
    }

    @a0(t1.b.f296118f)
    public static /* synthetic */ void getPreload$annotations() {
    }

    @a0("variants")
    public static /* synthetic */ void getVariants$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(TriggerRule triggerRule, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, triggerRule.experimentId);
        eVar.encodeStringElement(serialDescriptor, 1, triggerRule.experimentGroupId);
        int i10 = 6 | 2;
        eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], triggerRule.variants);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || triggerRule.expression != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, triggerRule.expression);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 4) || triggerRule.expressionJs != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 4, b3.f315897a, triggerRule.expressionJs);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || triggerRule.expressionCEL != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 5, b3.f315897a, triggerRule.expressionCEL);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 6) || triggerRule.occurrence != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 6, TriggerRuleOccurrence$$serializer.INSTANCE, triggerRule.occurrence);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.areEqual(triggerRule.computedPropertyRequests, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], triggerRule.computedPropertyRequests);
        }
        eVar.encodeSerializableElement(serialDescriptor, 8, TriggerPreloadSerializer.INSTANCE, triggerRule.preload);
    }

    @NotNull
    public final String component1() {
        return this.experimentId;
    }

    @NotNull
    public final String component2() {
        return this.experimentGroupId;
    }

    @NotNull
    public final List<VariantOption> component3() {
        return this.variants;
    }

    @Nullable
    public final String component4() {
        return this.expression;
    }

    @Nullable
    public final String component5() {
        return this.expressionJs;
    }

    @Nullable
    public final String component6() {
        return this.expressionCEL;
    }

    @Nullable
    public final TriggerRuleOccurrence component7() {
        return this.occurrence;
    }

    @NotNull
    public final List<ComputedPropertyRequest> component8() {
        return this.computedPropertyRequests;
    }

    @NotNull
    public final TriggerPreload component9() {
        return this.preload;
    }

    @NotNull
    public final TriggerRule copy(@NotNull String experimentId, @NotNull String experimentGroupId, @NotNull List<VariantOption> variants, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable TriggerRuleOccurrence triggerRuleOccurrence, @NotNull List<ComputedPropertyRequest> computedPropertyRequests, @NotNull TriggerPreload preload) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(experimentGroupId, "experimentGroupId");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(computedPropertyRequests, "computedPropertyRequests");
        Intrinsics.checkNotNullParameter(preload, "preload");
        return new TriggerRule(experimentId, experimentGroupId, variants, str, str2, str3, triggerRuleOccurrence, computedPropertyRequests, preload);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerRule)) {
            return false;
        }
        TriggerRule triggerRule = (TriggerRule) obj;
        return Intrinsics.areEqual(this.experimentId, triggerRule.experimentId) && Intrinsics.areEqual(this.experimentGroupId, triggerRule.experimentGroupId) && Intrinsics.areEqual(this.variants, triggerRule.variants) && Intrinsics.areEqual(this.expression, triggerRule.expression) && Intrinsics.areEqual(this.expressionJs, triggerRule.expressionJs) && Intrinsics.areEqual(this.expressionCEL, triggerRule.expressionCEL) && Intrinsics.areEqual(this.occurrence, triggerRule.occurrence) && Intrinsics.areEqual(this.computedPropertyRequests, triggerRule.computedPropertyRequests) && Intrinsics.areEqual(this.preload, triggerRule.preload);
    }

    @NotNull
    public final List<ComputedPropertyRequest> getComputedPropertyRequests() {
        return this.computedPropertyRequests;
    }

    @NotNull
    public final RawExperiment getExperiment() {
        return new RawExperiment(this.experimentId, this.experimentGroupId, this.variants);
    }

    @NotNull
    public final String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    @NotNull
    public final String getExperimentId() {
        return this.experimentId;
    }

    @Nullable
    public final String getExpression() {
        return this.expression;
    }

    @Nullable
    public final String getExpressionCEL() {
        return this.expressionCEL;
    }

    @Nullable
    public final String getExpressionJs() {
        return this.expressionJs;
    }

    @Nullable
    public final TriggerRuleOccurrence getOccurrence() {
        return this.occurrence;
    }

    @NotNull
    public final TriggerPreload getPreload() {
        return this.preload;
    }

    @NotNull
    public final List<VariantOption> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        int iHashCode = ((((this.experimentId.hashCode() * 31) + this.experimentGroupId.hashCode()) * 31) + this.variants.hashCode()) * 31;
        String str = this.expression;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expressionJs;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expressionCEL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TriggerRuleOccurrence triggerRuleOccurrence = this.occurrence;
        return ((((iHashCode4 + (triggerRuleOccurrence != null ? triggerRuleOccurrence.hashCode() : 0)) * 31) + this.computedPropertyRequests.hashCode()) * 31) + this.preload.hashCode();
    }

    public final void setExperimentGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.experimentGroupId = str;
    }

    public final void setExperimentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.experimentId = str;
    }

    public final void setVariants(@NotNull List<VariantOption> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.variants = list;
    }

    @NotNull
    public String toString() {
        return "TriggerRule(experimentId=" + this.experimentId + ", experimentGroupId=" + this.experimentGroupId + ", variants=" + this.variants + ", expression=" + this.expression + ", expressionJs=" + this.expressionJs + ", expressionCEL=" + this.expressionCEL + ", occurrence=" + this.occurrence + ", computedPropertyRequests=" + this.computedPropertyRequests + ", preload=" + this.preload + ")";
    }

    @b0(with = TriggerPreloadSerializer.class)
    public static final class TriggerPreload {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private TriggerPreloadBehavior behavior;

        @Nullable
        private final Boolean requiresReEvaluation;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<TriggerPreload> serializer() {
                return TriggerPreloadSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public TriggerPreload(@NotNull TriggerPreloadBehavior behavior, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            this.behavior = behavior;
            this.requiresReEvaluation = bool;
        }

        public static /* synthetic */ TriggerPreload copy$default(TriggerPreload triggerPreload, TriggerPreloadBehavior triggerPreloadBehavior, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                triggerPreloadBehavior = triggerPreload.behavior;
            }
            if ((i10 & 2) != 0) {
                bool = triggerPreload.requiresReEvaluation;
            }
            return triggerPreload.copy(triggerPreloadBehavior, bool);
        }

        @NotNull
        public final TriggerPreloadBehavior component1() {
            return this.behavior;
        }

        @Nullable
        public final Boolean component2() {
            return this.requiresReEvaluation;
        }

        @NotNull
        public final TriggerPreload copy(@NotNull TriggerPreloadBehavior behavior, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            return new TriggerPreload(behavior, bool);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TriggerPreload)) {
                return false;
            }
            TriggerPreload triggerPreload = (TriggerPreload) obj;
            return this.behavior == triggerPreload.behavior && Intrinsics.areEqual(this.requiresReEvaluation, triggerPreload.requiresReEvaluation);
        }

        @NotNull
        public final TriggerPreloadBehavior getBehavior() {
            return this.behavior;
        }

        @Nullable
        public final Boolean getRequiresReEvaluation() {
            return this.requiresReEvaluation;
        }

        public int hashCode() {
            int iHashCode = this.behavior.hashCode() * 31;
            Boolean bool = this.requiresReEvaluation;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final void setBehavior(@NotNull TriggerPreloadBehavior triggerPreloadBehavior) {
            Intrinsics.checkNotNullParameter(triggerPreloadBehavior, "<set-?>");
            this.behavior = triggerPreloadBehavior;
        }

        @NotNull
        public String toString() {
            return "TriggerPreload(behavior=" + this.behavior + ", requiresReEvaluation=" + this.requiresReEvaluation + ")";
        }

        public /* synthetic */ TriggerPreload(TriggerPreloadBehavior triggerPreloadBehavior, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(triggerPreloadBehavior, (i10 & 2) != 0 ? null : bool);
        }
    }

    public TriggerRule(@NotNull String experimentId, @NotNull String experimentGroupId, @NotNull List<VariantOption> variants, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable TriggerRuleOccurrence triggerRuleOccurrence, @NotNull List<ComputedPropertyRequest> computedPropertyRequests, @NotNull TriggerPreload preload) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(experimentGroupId, "experimentGroupId");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(computedPropertyRequests, "computedPropertyRequests");
        Intrinsics.checkNotNullParameter(preload, "preload");
        this.experimentId = experimentId;
        this.experimentGroupId = experimentGroupId;
        this.variants = variants;
        this.expression = str;
        this.expressionJs = str2;
        this.expressionCEL = str3;
        this.occurrence = triggerRuleOccurrence;
        this.computedPropertyRequests = computedPropertyRequests;
        this.preload = preload;
    }

    public /* synthetic */ TriggerRule(String str, String str2, List list, String str3, String str4, String str5, TriggerRuleOccurrence triggerRuleOccurrence, List list2, TriggerPreload triggerPreload, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : triggerRuleOccurrence, (i10 & 128) != 0 ? CollectionsKt.emptyList() : list2, triggerPreload);
    }
}
