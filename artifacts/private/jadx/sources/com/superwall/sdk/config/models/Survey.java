package com.superwall.sdk.config.models;

import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.storage.SurveyAssignmentKey;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Survey {

    @NotNull
    private final String assignmentKey;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267397id;
    private final boolean includeCloseOption;
    private final boolean includeOtherOption;

    @NotNull
    private final String message;

    @NotNull
    private final List<SurveyOption> options;

    @NotNull
    private final SurveyShowCondition presentationCondition;
    private final double presentationProbability;

    @NotNull
    private final String title;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new kotlinx.serialization.internal.f(SurveyOption$$serializer.INSTANCE), null, null, null, null};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Survey> serializer() {
            return Survey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Survey(int i10, String str, String str2, String str3, String str4, List list, SurveyShowCondition surveyShowCondition, double d10, boolean z10, boolean z11, v2 v2Var) {
        if (511 != (i10 & 511)) {
            g2.b(i10, 511, Survey$$serializer.INSTANCE.getDescriptor());
        }
        this.f267397id = str;
        this.assignmentKey = str2;
        this.title = str3;
        this.message = str4;
        this.options = list;
        this.presentationCondition = surveyShowCondition;
        this.presentationProbability = d10;
        this.includeOtherOption = z10;
        this.includeCloseOption = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Survey copy$default(Survey survey, String str, String str2, String str3, String str4, List list, SurveyShowCondition surveyShowCondition, double d10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = survey.f267397id;
        }
        if ((i10 & 2) != 0) {
            str2 = survey.assignmentKey;
        }
        if ((i10 & 4) != 0) {
            str3 = survey.title;
        }
        if ((i10 & 8) != 0) {
            str4 = survey.message;
        }
        if ((i10 & 16) != 0) {
            list = survey.options;
        }
        if ((i10 & 32) != 0) {
            surveyShowCondition = survey.presentationCondition;
        }
        if ((i10 & 64) != 0) {
            d10 = survey.presentationProbability;
        }
        if ((i10 & 128) != 0) {
            z10 = survey.includeOtherOption;
        }
        if ((i10 & 256) != 0) {
            z11 = survey.includeCloseOption;
        }
        double d11 = d10;
        List list2 = list;
        SurveyShowCondition surveyShowCondition2 = surveyShowCondition;
        String str5 = str3;
        String str6 = str4;
        return survey.copy(str, str2, str5, str6, list2, surveyShowCondition2, d11, z10, z11);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Survey survey, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, survey.f267397id);
        eVar.encodeStringElement(serialDescriptor, 1, survey.assignmentKey);
        eVar.encodeStringElement(serialDescriptor, 2, survey.title);
        eVar.encodeStringElement(serialDescriptor, 3, survey.message);
        int i10 = 4 ^ 4;
        eVar.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], survey.options);
        eVar.encodeSerializableElement(serialDescriptor, 5, SurveyShowConditionSerializer.INSTANCE, survey.presentationCondition);
        eVar.encodeDoubleElement(serialDescriptor, 6, survey.presentationProbability);
        eVar.encodeBooleanElement(serialDescriptor, 7, survey.includeOtherOption);
        eVar.encodeBooleanElement(serialDescriptor, 8, survey.includeCloseOption);
    }

    @NotNull
    public final String component1() {
        return this.f267397id;
    }

    @NotNull
    public final String component2() {
        return this.assignmentKey;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.message;
    }

    @NotNull
    public final List<SurveyOption> component5() {
        return this.options;
    }

    @NotNull
    public final SurveyShowCondition component6() {
        return this.presentationCondition;
    }

    public final double component7() {
        return this.presentationProbability;
    }

    public final boolean component8() {
        return this.includeOtherOption;
    }

    public final boolean component9() {
        return this.includeCloseOption;
    }

    @NotNull
    public final Survey copy(@NotNull String id2, @NotNull String assignmentKey, @NotNull String title, @NotNull String message, @NotNull List<SurveyOption> options, @NotNull SurveyShowCondition presentationCondition, double d10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(assignmentKey, "assignmentKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(presentationCondition, "presentationCondition");
        return new Survey(id2, assignmentKey, title, message, options, presentationCondition, d10, z10, z11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Survey)) {
            return false;
        }
        Survey survey = (Survey) obj;
        return Intrinsics.areEqual(this.f267397id, survey.f267397id) && Intrinsics.areEqual(this.assignmentKey, survey.assignmentKey) && Intrinsics.areEqual(this.title, survey.title) && Intrinsics.areEqual(this.message, survey.message) && Intrinsics.areEqual(this.options, survey.options) && this.presentationCondition == survey.presentationCondition && Double.compare(this.presentationProbability, survey.presentationProbability) == 0 && this.includeOtherOption == survey.includeOtherOption && this.includeCloseOption == survey.includeCloseOption;
    }

    @NotNull
    public final String getAssignmentKey() {
        return this.assignmentKey;
    }

    @NotNull
    public final String getId() {
        return this.f267397id;
    }

    public final boolean getIncludeCloseOption() {
        return this.includeCloseOption;
    }

    public final boolean getIncludeOtherOption() {
        return this.includeOtherOption;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<SurveyOption> getOptions() {
        return this.options;
    }

    @NotNull
    public final SurveyShowCondition getPresentationCondition() {
        return this.presentationCondition;
    }

    public final double getPresentationProbability() {
        return this.presentationProbability;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean hasSeenSurvey(@NotNull LocalStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        String str = (String) storage.read(SurveyAssignmentKey.INSTANCE);
        if (str == null) {
            return false;
        }
        return Intrinsics.areEqual(str, this.assignmentKey);
    }

    public int hashCode() {
        return (((((((((((((((this.f267397id.hashCode() * 31) + this.assignmentKey.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.options.hashCode()) * 31) + this.presentationCondition.hashCode()) * 31) + Double.hashCode(this.presentationProbability)) * 31) + Boolean.hashCode(this.includeOtherOption)) * 31) + Boolean.hashCode(this.includeCloseOption);
    }

    public final boolean shouldAssignHoldout(boolean z10) {
        if (z10) {
            return false;
        }
        return this.presentationProbability == 0.0d || Math.random() >= this.presentationProbability;
    }

    @NotNull
    public String toString() {
        return "Survey(id=" + this.f267397id + ", assignmentKey=" + this.assignmentKey + ", title=" + this.title + ", message=" + this.message + ", options=" + this.options + ", presentationCondition=" + this.presentationCondition + ", presentationProbability=" + this.presentationProbability + ", includeOtherOption=" + this.includeOtherOption + ", includeCloseOption=" + this.includeCloseOption + ")";
    }

    public Survey(@NotNull String id2, @NotNull String assignmentKey, @NotNull String title, @NotNull String message, @NotNull List<SurveyOption> options, @NotNull SurveyShowCondition presentationCondition, double d10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(assignmentKey, "assignmentKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(presentationCondition, "presentationCondition");
        this.f267397id = id2;
        this.assignmentKey = assignmentKey;
        this.title = title;
        this.message = message;
        this.options = options;
        this.presentationCondition = presentationCondition;
        this.presentationProbability = d10;
        this.includeOtherOption = z10;
        this.includeCloseOption = z11;
    }
}
