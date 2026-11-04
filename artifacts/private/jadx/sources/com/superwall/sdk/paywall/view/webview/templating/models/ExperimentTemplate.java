package com.superwall.sdk.paywall.view.webview.templating.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class ExperimentTemplate {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String campaignId;

    @NotNull
    private final String eventName;

    @NotNull
    private final String experimentId;

    @NotNull
    private final String variantId;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ExperimentTemplate> serializer() {
            return ExperimentTemplate$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExperimentTemplate(int i10, String str, String str2, String str3, String str4, v2 v2Var) {
        if (14 != (i10 & 14)) {
            g2.b(i10, 14, ExperimentTemplate$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.eventName = "experiment";
        } else {
            this.eventName = str;
        }
        this.experimentId = str2;
        this.variantId = str3;
        this.campaignId = str4;
    }

    public static /* synthetic */ ExperimentTemplate copy$default(ExperimentTemplate experimentTemplate, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = experimentTemplate.eventName;
        }
        if ((i10 & 2) != 0) {
            str2 = experimentTemplate.experimentId;
        }
        if ((i10 & 4) != 0) {
            str3 = experimentTemplate.variantId;
        }
        if ((i10 & 8) != 0) {
            str4 = experimentTemplate.campaignId;
        }
        return experimentTemplate.copy(str, str2, str3, str4);
    }

    @a0("campaignId")
    public static /* synthetic */ void getCampaignId$annotations() {
    }

    @a0("eventName")
    public static /* synthetic */ void getEventName$annotations() {
    }

    @a0("experimentId")
    public static /* synthetic */ void getExperimentId$annotations() {
    }

    @a0("variantId")
    public static /* synthetic */ void getVariantId$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(ExperimentTemplate experimentTemplate, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(experimentTemplate.eventName, "experiment")) {
            eVar.encodeStringElement(serialDescriptor, 0, experimentTemplate.eventName);
        }
        eVar.encodeStringElement(serialDescriptor, 1, experimentTemplate.experimentId);
        eVar.encodeStringElement(serialDescriptor, 2, experimentTemplate.variantId);
        eVar.encodeStringElement(serialDescriptor, 3, experimentTemplate.campaignId);
    }

    @NotNull
    public final String component1() {
        return this.eventName;
    }

    @NotNull
    public final String component2() {
        return this.experimentId;
    }

    @NotNull
    public final String component3() {
        return this.variantId;
    }

    @NotNull
    public final String component4() {
        return this.campaignId;
    }

    @NotNull
    public final ExperimentTemplate copy(@NotNull String eventName, @NotNull String experimentId, @NotNull String variantId, @NotNull String campaignId) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(variantId, "variantId");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        return new ExperimentTemplate(eventName, experimentId, variantId, campaignId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperimentTemplate)) {
            return false;
        }
        ExperimentTemplate experimentTemplate = (ExperimentTemplate) obj;
        return Intrinsics.areEqual(this.eventName, experimentTemplate.eventName) && Intrinsics.areEqual(this.experimentId, experimentTemplate.experimentId) && Intrinsics.areEqual(this.variantId, experimentTemplate.variantId) && Intrinsics.areEqual(this.campaignId, experimentTemplate.campaignId);
    }

    @NotNull
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final String getExperimentId() {
        return this.experimentId;
    }

    @NotNull
    public final String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return (((((this.eventName.hashCode() * 31) + this.experimentId.hashCode()) * 31) + this.variantId.hashCode()) * 31) + this.campaignId.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExperimentTemplate(eventName=" + this.eventName + ", experimentId=" + this.experimentId + ", variantId=" + this.variantId + ", campaignId=" + this.campaignId + ")";
    }

    public ExperimentTemplate(@NotNull String eventName, @NotNull String experimentId, @NotNull String variantId, @NotNull String campaignId) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(variantId, "variantId");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.eventName = eventName;
        this.experimentId = experimentId;
        this.variantId = variantId;
        this.campaignId = campaignId;
    }

    public /* synthetic */ ExperimentTemplate(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "experiment" : str, str2, str3, str4);
    }
}
