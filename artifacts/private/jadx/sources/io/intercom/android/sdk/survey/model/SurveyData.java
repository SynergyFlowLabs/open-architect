package io.intercom.android.sdk.survey.model;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.unit.h;
import com.facebook.appevents.p;
import com.google.gson.annotations.c;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.l;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SurveyData {

    @c("format")
    @NotNull
    private final String _format;

    @c("customization_options")
    @NotNull
    private final SurveyCustomization customization;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    @NotNull
    private final String f293317id;

    @c("dismissible")
    private final boolean isDismissible;

    @c("sender")
    @Nullable
    private final SurveySenderData sender;

    @c("show_progress_bar")
    private final boolean showProgressBar;

    @c("step_count")
    private final int stepCount;

    @c("steps")
    @NotNull
    private final List<Step> steps;

    @c("survey_progress_id")
    @NotNull
    private final String surveyProgressId;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final SurveyData NULL = new SurveyData("1", "", CollectionsKt.emptyList(), p.f99189d0, new SurveyCustomization(null, null, 3, null), new SurveySenderData(null, null, null, null, 15, null), 0, true, false, 256, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SurveyData getNULL() {
            return SurveyData.NULL;
        }

        private Companion() {
        }
    }

    public enum StepType {
        CONTENT,
        QUESTION,
        INTRO,
        THANK_YOU,
        UNSUPPORTED;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

        static {
            int i10 = 6 ^ 4;
        }

        @NotNull
        public static a<StepType> getEntries() {
            return $ENTRIES;
        }
    }

    public enum SurveyFormat {
        SMALL_FORMAT,
        LARGE_FORMAT;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static a<SurveyFormat> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyFormat.values().length];
            try {
                iArr[SurveyFormat.SMALL_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyFormat.LARGE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SurveyData(@NotNull String _format, @NotNull String id2, @NotNull List<Step> steps, @NotNull String surveyProgressId, @NotNull SurveyCustomization customization, @Nullable SurveySenderData surveySenderData, int i10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(_format, "_format");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(customization, "customization");
        this._format = _format;
        this.f293317id = id2;
        this.steps = steps;
        this.surveyProgressId = surveyProgressId;
        this.customization = customization;
        this.sender = surveySenderData;
        this.stepCount = i10;
        this.isDismissible = z10;
        this.showProgressBar = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyData copy$default(SurveyData surveyData, String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = surveyData._format;
        }
        if ((i11 & 2) != 0) {
            str2 = surveyData.f293317id;
        }
        if ((i11 & 4) != 0) {
            list = surveyData.steps;
        }
        if ((i11 & 8) != 0) {
            str3 = surveyData.surveyProgressId;
        }
        if ((i11 & 16) != 0) {
            surveyCustomization = surveyData.customization;
        }
        if ((i11 & 32) != 0) {
            surveySenderData = surveyData.sender;
        }
        if ((i11 & 64) != 0) {
            i10 = surveyData.stepCount;
        }
        if ((i11 & 128) != 0) {
            z10 = surveyData.isDismissible;
        }
        if ((i11 & 256) != 0) {
            z11 = surveyData.showProgressBar;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        SurveySenderData surveySenderData2 = surveySenderData;
        int i12 = i10;
        SurveyCustomization surveyCustomization2 = surveyCustomization;
        List list2 = list;
        return surveyData.copy(str, str2, list2, str3, surveyCustomization2, surveySenderData2, i12, z12, z13);
    }

    @NotNull
    public final String component1() {
        return this._format;
    }

    @NotNull
    public final String component2() {
        return this.f293317id;
    }

    @NotNull
    public final List<Step> component3() {
        return this.steps;
    }

    @NotNull
    public final String component4() {
        return this.surveyProgressId;
    }

    @NotNull
    public final SurveyCustomization component5() {
        return this.customization;
    }

    @Nullable
    public final SurveySenderData component6() {
        return this.sender;
    }

    public final int component7() {
        return this.stepCount;
    }

    public final boolean component8() {
        return this.isDismissible;
    }

    public final boolean component9() {
        return this.showProgressBar;
    }

    @NotNull
    public final SurveyData copy(@NotNull String _format, @NotNull String id2, @NotNull List<Step> steps, @NotNull String surveyProgressId, @NotNull SurveyCustomization customization, @Nullable SurveySenderData surveySenderData, int i10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(_format, "_format");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(customization, "customization");
        return new SurveyData(_format, id2, steps, surveyProgressId, customization, surveySenderData, i10, z10, z11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyData)) {
            return false;
        }
        SurveyData surveyData = (SurveyData) obj;
        return Intrinsics.areEqual(this._format, surveyData._format) && Intrinsics.areEqual(this.f293317id, surveyData.f293317id) && Intrinsics.areEqual(this.steps, surveyData.steps) && Intrinsics.areEqual(this.surveyProgressId, surveyData.surveyProgressId) && Intrinsics.areEqual(this.customization, surveyData.customization) && Intrinsics.areEqual(this.sender, surveyData.sender) && this.stepCount == surveyData.stepCount && this.isDismissible == surveyData.isDismissible && this.showProgressBar == surveyData.showProgressBar;
    }

    @NotNull
    public final SurveyCustomization getCustomization() {
        return this.customization;
    }

    @NotNull
    public final SurveyFormat getFormat() {
        return Integer.parseInt(this._format) == 0 ? SurveyFormat.SMALL_FORMAT : SurveyFormat.LARGE_FORMAT;
    }

    @NotNull
    public final String getFormatMetric() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getFormat().ordinal()];
        if (i10 == 1) {
            return "small_full_screen";
        }
        if (i10 == 2) {
            return "large_full_screen";
        }
        throw new k0();
    }

    @NotNull
    public final String getId() {
        return this.f293317id;
    }

    @Nullable
    public final SurveySenderData getSender() {
        return this.sender;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    @NotNull
    public final List<Step> getSteps() {
        return this.steps;
    }

    @NotNull
    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    @NotNull
    public final String get_format() {
        return this._format;
    }

    public int hashCode() {
        int iHashCode = ((((((((this._format.hashCode() * 31) + this.f293317id.hashCode()) * 31) + this.steps.hashCode()) * 31) + this.surveyProgressId.hashCode()) * 31) + this.customization.hashCode()) * 31;
        SurveySenderData surveySenderData = this.sender;
        return ((((((iHashCode + (surveySenderData == null ? 0 : surveySenderData.hashCode())) * 31) + Integer.hashCode(this.stepCount)) * 31) + Boolean.hashCode(this.isDismissible)) * 31) + Boolean.hashCode(this.showProgressBar);
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    @NotNull
    public String toString() {
        return "SurveyData(_format=" + this._format + ", id=" + this.f293317id + ", steps=" + this.steps + ", surveyProgressId=" + this.surveyProgressId + ", customization=" + this.customization + ", sender=" + this.sender + ", stepCount=" + this.stepCount + ", isDismissible=" + this.isDismissible + ", showProgressBar=" + this.showProgressBar + ')';
    }

    @w0(parameters = 1)
    public static final class SurveyActions {
        public static final int $stable = 0;

        @c("action_title")
        @NotNull
        private final String actionTitle;

        @c("android_uri")
        @Nullable
        private final String androidUri;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @c("id")
        private final int f293321id;

        @c("web_url")
        @Nullable
        private final String webUrl;

        public SurveyActions(@NotNull String actionTitle, int i10, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
            this.actionTitle = actionTitle;
            this.f293321id = i10;
            this.webUrl = str;
            this.androidUri = str2;
        }

        public static /* synthetic */ SurveyActions copy$default(SurveyActions surveyActions, String str, int i10, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = surveyActions.actionTitle;
            }
            if ((i11 & 2) != 0) {
                i10 = surveyActions.f293321id;
            }
            if ((i11 & 4) != 0) {
                str2 = surveyActions.webUrl;
            }
            if ((i11 & 8) != 0) {
                str3 = surveyActions.androidUri;
            }
            return surveyActions.copy(str, i10, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.actionTitle;
        }

        public final int component2() {
            return this.f293321id;
        }

        @Nullable
        public final String component3() {
            return this.webUrl;
        }

        @Nullable
        public final String component4() {
            return this.androidUri;
        }

        @NotNull
        public final SurveyActions copy(@NotNull String actionTitle, int i10, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
            return new SurveyActions(actionTitle, i10, str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyActions)) {
                return false;
            }
            SurveyActions surveyActions = (SurveyActions) obj;
            return Intrinsics.areEqual(this.actionTitle, surveyActions.actionTitle) && this.f293321id == surveyActions.f293321id && Intrinsics.areEqual(this.webUrl, surveyActions.webUrl) && Intrinsics.areEqual(this.androidUri, surveyActions.androidUri);
        }

        @NotNull
        public final String getActionTitle() {
            return this.actionTitle;
        }

        @Nullable
        public final String getAndroidUri() {
            return this.androidUri;
        }

        public final int getId() {
            return this.f293321id;
        }

        @Nullable
        public final String getWebUrl() {
            return this.webUrl;
        }

        public int hashCode() {
            int iHashCode = ((this.actionTitle.hashCode() * 31) + Integer.hashCode(this.f293321id)) * 31;
            String str = this.webUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.androidUri;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SurveyActions(actionTitle=" + this.actionTitle + ", id=" + this.f293321id + ", webUrl=" + this.webUrl + ", androidUri=" + this.androidUri + ')';
        }

        public /* synthetic */ SurveyActions(String str, int i10, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    @w0(parameters = 0)
    public static final class Step {
        public static final int $stable = 8;

        @c("step_type")
        private final int _type;

        @c("actions")
        @NotNull
        private final List<SurveyActions> actions;

        @c("blocks")
        @NotNull
        private final List<Block.Builder> blocks;

        @c("custom_button_text")
        @Nullable
        private final String customButtonText;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @c("id")
        @NotNull
        private final String f293318id;

        @c("questions")
        @NotNull
        private final List<Question> questions;

        @w0(parameters = 0)
        @SourceDebugExtension({"SMAP\nSurveyData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyData.kt\nio/intercom/android/sdk/survey/model/SurveyData$Step$Question\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n1557#2:412\n1628#2,3:413\n1557#2:416\n1628#2,3:417\n1557#2:420\n1628#2,3:421\n1557#2:424\n1628#2,3:425\n1557#2:428\n1628#2,3:429\n*S KotlinDebug\n*F\n+ 1 SurveyData.kt\nio/intercom/android/sdk/survey/model/SurveyData$Step$Question\n*L\n194#1:412\n194#1:413,3\n231#1:416\n231#1:417,3\n235#1:420\n235#1:421,3\n253#1:424\n253#1:425,3\n261#1:428\n261#1:429,3\n*E\n"})
        public static final class Question {
            public static final int $stable = 8;

            @c("blocks")
            @NotNull
            private final List<Block.Builder> blocks;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @c("id")
            @NotNull
            private final String f293319id;

            @c("data")
            @NotNull
            private final QuestionData questionData;

            @c("question_type")
            private final int questionType;

            @w0(parameters = 1)
            public static final class DatePickerQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DatePickerQuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, boolean z10) {
                    super(id2, title, null, z10, 4, null);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                }
            }

            @w0(parameters = 1)
            public static final class LongTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                @Nullable
                private final Integer characterLimit;
                private final int maxLine;
                private final float minHeight;

                @Nullable
                private final Integer placeHolderStringRes;

                @NotNull
                private final String placeholder;

                @NotNull
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z10, String str2, QuestionValidation.ValidationType validationType, Integer num, float f10, int i10, @f1 Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z10, str2, validationType, num, f10, i10, num2);
                }

                @Nullable
                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final int getMaxLine() {
                    return this.maxLine;
                }

                /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
                public final float m466getMinHeightD9Ej5fM() {
                    return this.minHeight;
                }

                @Nullable
                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @NotNull
                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z10, String str2, QuestionValidation.ValidationType validationType, Integer num, float f10, int i10, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z10, (i11 & 8) != 0 ? "" : str2, validationType, num, (i11 & 64) != 0 ? h.f42689b.e() : f10, (i11 & 128) != 0 ? 6 : i10, (i11 & 256) != 0 ? null : num2, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private LongTextQuestionModel(String id2, List<Block.Builder> title, boolean z10, String placeholder, QuestionValidation.ValidationType validationType, Integer num, float f10, int i10, Integer num2) {
                    super(id2, title, null, z10, 4, null);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    Intrinsics.checkNotNullParameter(validationType, "validationType");
                    this.placeholder = placeholder;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.minHeight = f10;
                    this.maxLine = i10;
                    this.placeHolderStringRes = num2;
                }
            }

            @w0(parameters = 0)
            public static final class MultipleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final int maxSelection;
                private final int minSelection;

                @NotNull
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MultipleChoiceQuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, boolean z10, @NotNull List<String> options, boolean z11, int i10, int i11) {
                    super(id2, title, null, z10, 4, null);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(options, "options");
                    this.options = options;
                    this.includeOther = z11;
                    this.minSelection = i10;
                    this.maxSelection = i11;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                @NotNull
                public final List<String> getOptions() {
                    return this.options;
                }
            }

            @w0(parameters = 0)
            public static final class NumericRatingQuestionModel extends QuestionModel {
                public static final int $stable = 8;

                @NotNull
                private final String lowerLabel;

                @NotNull
                private final List<RatingOption> options;

                @NotNull
                private final QuestionData.QuestionSubType questionSubType;
                private final int scaleEnd;
                private final int scaleStart;

                @NotNull
                private final String upperLabel;

                @w0(parameters = 1)
                public static abstract class RatingOption {
                    public static final int $stable = 0;

                    @w0(parameters = 1)
                    public static final class EmojiRatingOption extends RatingOption {
                        public static final int $stable = 0;

                        @c("image_url")
                        @NotNull
                        private final String emojiUrl;

                        @c("unicodeEmoticon")
                        @NotNull
                        private final String unicode;

                        @c("value")
                        private final int value;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public EmojiRatingOption(int i10, @NotNull String emojiUrl, @NotNull String unicode) {
                            super(null);
                            Intrinsics.checkNotNullParameter(emojiUrl, "emojiUrl");
                            Intrinsics.checkNotNullParameter(unicode, "unicode");
                            this.value = i10;
                            this.emojiUrl = emojiUrl;
                            this.unicode = unicode;
                        }

                        @NotNull
                        public final String getEmojiUrl() {
                            return this.emojiUrl;
                        }

                        @NotNull
                        public final String getUnicode() {
                            return this.unicode;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    @w0(parameters = 1)
                    public static final class NumericRatingOption extends RatingOption {
                        public static final int $stable = 0;
                        private final int value;

                        public NumericRatingOption(int i10) {
                            super(null);
                            this.value = i10;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    public /* synthetic */ RatingOption(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private RatingOption() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public NumericRatingQuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, boolean z10, @NotNull List<? extends RatingOption> options, @NotNull String lowerLabel, @NotNull String upperLabel, int i10, int i11, @NotNull QuestionData.QuestionSubType questionSubType) {
                    super(id2, title, null, z10, 4, null);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(options, "options");
                    Intrinsics.checkNotNullParameter(lowerLabel, "lowerLabel");
                    Intrinsics.checkNotNullParameter(upperLabel, "upperLabel");
                    Intrinsics.checkNotNullParameter(questionSubType, "questionSubType");
                    this.options = options;
                    this.lowerLabel = lowerLabel;
                    this.upperLabel = upperLabel;
                    this.scaleStart = i10;
                    this.scaleEnd = i11;
                    this.questionSubType = questionSubType;
                }

                @NotNull
                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                @NotNull
                public final List<RatingOption> getOptions() {
                    return this.options;
                }

                @NotNull
                public final QuestionData.QuestionSubType getQuestionSubType() {
                    return this.questionSubType;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                @NotNull
                public final String getUpperLabel() {
                    return this.upperLabel;
                }
            }

            public enum QuestionType {
                INPUT,
                TEXT,
                DROPDOWN,
                RATING_SCALE,
                MULTI_SELECT;

                private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

                @NotNull
                public static a<QuestionType> getEntries() {
                    return $ENTRIES;
                }
            }

            @w0(parameters = 1)
            public static final class QuestionValidation {
                public static final int $stable = 0;

                @c("type")
                private final int _type;

                public enum ValidationType {
                    TEXT,
                    NUMBER,
                    EMAIL,
                    PHONE,
                    NO_VALIDATION,
                    FLOAT,
                    INTEGER;

                    private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

                    @NotNull
                    public static a<ValidationType> getEntries() {
                        return $ENTRIES;
                    }
                }

                public QuestionValidation(int i10) {
                    this._type = i10;
                }

                private final int component1() {
                    return this._type;
                }

                public static /* synthetic */ QuestionValidation copy$default(QuestionValidation questionValidation, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = questionValidation._type;
                    }
                    return questionValidation.copy(i10);
                }

                @NotNull
                public final QuestionValidation copy(int i10) {
                    return new QuestionValidation(i10);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof QuestionValidation) && this._type == ((QuestionValidation) obj)._type) {
                        return true;
                    }
                    return false;
                }

                @NotNull
                public final ValidationType getValidationType() {
                    int i10 = this._type;
                    ValidationType validationType = ValidationType.TEXT;
                    if (i10 == validationType.ordinal()) {
                        return validationType;
                    }
                    ValidationType validationType2 = ValidationType.NUMBER;
                    if (i10 == validationType2.ordinal()) {
                        return validationType2;
                    }
                    ValidationType validationType3 = ValidationType.EMAIL;
                    if (i10 == validationType3.ordinal()) {
                        return validationType3;
                    }
                    ValidationType validationType4 = ValidationType.PHONE;
                    if (i10 == validationType4.ordinal()) {
                        return validationType4;
                    }
                    ValidationType validationType5 = ValidationType.FLOAT;
                    if (i10 == validationType5.ordinal()) {
                        return validationType5;
                    }
                    ValidationType validationType6 = ValidationType.INTEGER;
                    return i10 == validationType6.ordinal() ? validationType6 : ValidationType.NO_VALIDATION;
                }

                public int hashCode() {
                    return Integer.hashCode(this._type);
                }

                @NotNull
                public String toString() {
                    return "QuestionValidation(_type=" + this._type + ')';
                }
            }

            @w0(parameters = 0)
            public static final class SingleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;

                @NotNull
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SingleChoiceQuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, boolean z10, @NotNull List<String> options, boolean z11) {
                    super(id2, title, null, z10, 4, null);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(options, "options");
                    this.options = options;
                    this.includeOther = z11;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                @NotNull
                public final List<String> getOptions() {
                    return this.options;
                }
            }

            @w0(parameters = 1)
            public static final class UnsupportedQuestion extends QuestionModel {
                public static final int $stable = 0;

                @NotNull
                public static final UnsupportedQuestion INSTANCE = new UnsupportedQuestion();

                private UnsupportedQuestion() {
                    super("", CollectionsKt.emptyList(), null, false, 4, null);
                }
            }

            public Question(@NotNull List<Block.Builder> blocks, @NotNull String id2, int i10, @NotNull QuestionData questionData) {
                Intrinsics.checkNotNullParameter(blocks, "blocks");
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(questionData, "questionData");
                this.blocks = blocks;
                this.f293319id = id2;
                this.questionType = i10;
                this.questionData = questionData;
            }

            private final int component3() {
                return this.questionType;
            }

            private final QuestionData component4() {
                return this.questionData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Question copy$default(Question question, List list, String str, int i10, QuestionData questionData, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = question.blocks;
                }
                if ((i11 & 2) != 0) {
                    str = question.f293319id;
                }
                if ((i11 & 4) != 0) {
                    i10 = question.questionType;
                }
                if ((i11 & 8) != 0) {
                    questionData = question.questionData;
                }
                return question.copy(list, str, i10, questionData);
            }

            @NotNull
            public final List<Block.Builder> component1() {
                return this.blocks;
            }

            @NotNull
            public final String component2() {
                return this.f293319id;
            }

            @NotNull
            public final Question copy(@NotNull List<Block.Builder> blocks, @NotNull String id2, int i10, @NotNull QuestionData questionData) {
                Intrinsics.checkNotNullParameter(blocks, "blocks");
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(questionData, "questionData");
                return new Question(blocks, id2, i10, questionData);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Question)) {
                    return false;
                }
                Question question = (Question) obj;
                return Intrinsics.areEqual(this.blocks, question.blocks) && Intrinsics.areEqual(this.f293319id, question.f293319id) && this.questionType == question.questionType && Intrinsics.areEqual(this.questionData, question.questionData);
            }

            @NotNull
            public final List<Block.Builder> getBlocks() {
                return this.blocks;
            }

            @NotNull
            public final String getId() {
                return this.f293319id;
            }

            @NotNull
            public final QuestionModel getQuestionModel() {
                ArrayList arrayList;
                int i10 = this.questionType;
                if (i10 == QuestionType.DROPDOWN.ordinal()) {
                    String str = this.f293319id;
                    List<Block.Builder> list = this.blocks;
                    boolean required = this.questionData.getRequired();
                    String placeholder = this.questionData.getPlaceholder();
                    i options = this.questionData.getOptions();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
                    Iterator<l> it = options.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().D());
                    }
                    return new DropDownQuestionModel(str, list, required, arrayList2, placeholder, null, 32, null);
                }
                if (i10 == QuestionType.INPUT.ordinal()) {
                    return new ShortTextQuestionModel(this.f293319id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), false, null, null, 448, null);
                }
                if (i10 == QuestionType.TEXT.ordinal()) {
                    return new LongTextQuestionModel(this.f293319id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), 0.0f, 0, null, 448, null);
                }
                if (i10 != QuestionType.RATING_SCALE.ordinal()) {
                    if (i10 != QuestionType.MULTI_SELECT.ordinal()) {
                        return UnsupportedQuestion.INSTANCE;
                    }
                    if (this.questionData.getMaxSelection() == 1) {
                        String str2 = this.f293319id;
                        List<Block.Builder> list2 = this.blocks;
                        boolean required2 = this.questionData.getRequired();
                        i options2 = this.questionData.getOptions();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options2, 10));
                        Iterator<l> it2 = options2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(it2.next().D());
                        }
                        return new SingleChoiceQuestionModel(str2, list2, required2, arrayList3, this.questionData.getIncludeOther());
                    }
                    String str3 = this.f293319id;
                    List<Block.Builder> list3 = this.blocks;
                    boolean required3 = this.questionData.getRequired();
                    i options3 = this.questionData.getOptions();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options3, 10));
                    Iterator<l> it3 = options3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().D());
                    }
                    return new MultipleChoiceQuestionModel(str3, list3, required3, arrayList4, this.questionData.getIncludeOther(), this.questionData.getMinSelection(), this.questionData.getMaxSelection());
                }
                String str4 = this.f293319id;
                List<Block.Builder> list4 = this.blocks;
                boolean required4 = this.questionData.getRequired();
                String lowerLabel = this.questionData.getLowerLabel();
                String upperLabel = this.questionData.getUpperLabel();
                int scaleStart = this.questionData.getScaleStart();
                int scaleEnd = this.questionData.getScaleEnd();
                if (this.questionData.getQuestionSubtype() == QuestionData.QuestionSubType.EMOJI.ordinal()) {
                    f fVar = new f();
                    i options4 = this.questionData.getOptions();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options4, 10));
                    Iterator<l> it4 = options4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add((NumericRatingQuestionModel.RatingOption.EmojiRatingOption) fVar.j(it4.next(), NumericRatingQuestionModel.RatingOption.EmojiRatingOption.class));
                    }
                } else {
                    IntRange intRange = new IntRange(this.questionData.getScaleStart(), this.questionData.getScaleEnd());
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                    Iterator<Integer> it5 = intRange.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(new NumericRatingQuestionModel.RatingOption.NumericRatingOption(((IntIterator) it5).nextInt()));
                    }
                }
                ArrayList arrayList5 = arrayList;
                int questionSubtype = this.questionData.getQuestionSubtype();
                QuestionData.QuestionSubType questionSubType = QuestionData.QuestionSubType.NUMERIC;
                if (questionSubtype != questionSubType.ordinal()) {
                    questionSubType = QuestionData.QuestionSubType.STARS;
                    if (questionSubtype != questionSubType.ordinal()) {
                        questionSubType = QuestionData.QuestionSubType.EMOJI;
                        if (questionSubtype != questionSubType.ordinal()) {
                            questionSubType = QuestionData.QuestionSubType.NPS;
                            if (questionSubtype != questionSubType.ordinal()) {
                                questionSubType = QuestionData.QuestionSubType.UNSUPPORTED;
                            }
                        }
                    }
                }
                return new NumericRatingQuestionModel(str4, list4, required4, arrayList5, lowerLabel, upperLabel, scaleStart, scaleEnd, questionSubType);
            }

            public int hashCode() {
                return (((((this.blocks.hashCode() * 31) + this.f293319id.hashCode()) * 31) + Integer.hashCode(this.questionType)) * 31) + this.questionData.hashCode();
            }

            @NotNull
            public String toString() {
                return "Question(blocks=" + this.blocks + ", id=" + this.f293319id + ", questionType=" + this.questionType + ", questionData=" + this.questionData + ')';
            }

            @w0(parameters = 0)
            public static final class DropDownQuestionModel extends QuestionModel {
                public static final int $stable = 8;

                @NotNull
                private final List<String> options;

                @Nullable
                private final Integer placeHolderStringRes;

                @NotNull
                private final String placeholder;

                public /* synthetic */ DropDownQuestionModel(String str, List list, boolean z10, List list2, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z10, list2, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? null : num);
                }

                @NotNull
                public final List<String> getOptions() {
                    return this.options;
                }

                @Nullable
                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DropDownQuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, boolean z10, @NotNull List<String> options, @NotNull String placeholder, @f1 @Nullable Integer num) {
                    super(id2, title, null, z10, 4, null);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(options, "options");
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    this.options = options;
                    this.placeholder = placeholder;
                    this.placeHolderStringRes = num;
                }
            }

            @w0(parameters = 1)
            public static final class ShortTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                @Nullable
                private final Integer characterLimit;
                private final boolean enabled;

                @Nullable
                private final Integer placeHolderStringRes;

                @NotNull
                private final String placeholder;

                @Nullable
                private final Integer titleStringRes;

                @NotNull
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ ShortTextQuestionModel(String str, List list, boolean z10, String str2, QuestionValidation.ValidationType validationType, Integer num, boolean z11, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z10, (i10 & 8) != 0 ? "" : str2, validationType, num, (i10 & 64) != 0 ? true : z11, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : num3);
                }

                @Nullable
                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getEnabled() {
                    return this.enabled;
                }

                @Nullable
                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @Nullable
                public final Integer getTitleStringRes() {
                    return this.titleStringRes;
                }

                @NotNull
                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ShortTextQuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, boolean z10, @NotNull String placeholder, @NotNull QuestionValidation.ValidationType validationType, @Nullable Integer num, boolean z11, @f1 @Nullable Integer num2, @f1 @Nullable Integer num3) {
                    super(id2, title, null, z10, 4, null);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    Intrinsics.checkNotNullParameter(validationType, "validationType");
                    this.placeholder = placeholder;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.enabled = z11;
                    this.placeHolderStringRes = num2;
                    this.titleStringRes = num3;
                }
            }

            @w0(parameters = 0)
            public static final class UploadFileQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final int maxSelection;

                @NotNull
                private final Set<String> supportedFileType;

                public /* synthetic */ UploadFileQuestionModel(String str, List list, StringProvider stringProvider, boolean z10, int i10, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, (i11 & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z10, i10, set);
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                @NotNull
                public final Set<String> getSupportedFileType() {
                    return this.supportedFileType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFileQuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, @NotNull StringProvider description, boolean z10, int i10, @NotNull Set<String> supportedFileType) {
                    super(id2, title, description, z10);
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(supportedFileType, "supportedFileType");
                    this.maxSelection = i10;
                    this.supportedFileType = supportedFileType;
                }
            }

            @w0(parameters = 0)
            public static class QuestionModel {
                public static final int $stable = 8;

                @NotNull
                private final StringProvider description;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @NotNull
                private final String f293320id;
                private final boolean isRequired;

                @NotNull
                private final List<Block.Builder> title;

                public QuestionModel(@NotNull String id2, @NotNull List<Block.Builder> title, @NotNull StringProvider description, boolean z10) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    this.f293320id = id2;
                    this.title = title;
                    this.description = description;
                    this.isRequired = z10;
                }

                @NotNull
                public final StringProvider getDescription() {
                    return this.description;
                }

                @NotNull
                public final String getId() {
                    return this.f293320id;
                }

                @NotNull
                public final List<Block.Builder> getTitle() {
                    return this.title;
                }

                public final boolean isRequired() {
                    return this.isRequired;
                }

                public /* synthetic */ QuestionModel(String str, List list, StringProvider stringProvider, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, (i10 & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z10);
                }
            }

            @w0(parameters = 0)
            public static final class QuestionData {
                public static final int $stable = 8;

                @c("placeholder")
                @Nullable
                private final String _placeholder;

                @c("character_limit")
                @Nullable
                private final Integer characterLimit;

                @c("include_other")
                private final boolean includeOther;

                @c("lower_label")
                @NotNull
                private final String lowerLabel;

                @c("maximum_selection")
                private final int maxSelection;

                @c("minimum_selection")
                private final int minSelection;

                @c(io.sentry.rrweb.h.f306695g)
                @NotNull
                private final i options;

                @c("type")
                private final int questionSubtype;

                @c("required")
                private final boolean required;

                @c("scale_end")
                private final int scaleEnd;

                @c("scale_start")
                private final int scaleStart;

                @c("upper_label")
                @NotNull
                private final String upperLabel;

                @c("validation")
                @Nullable
                private final QuestionValidation validation;

                public enum QuestionSubType {
                    NUMERIC,
                    STARS,
                    EMOJI,
                    NPS,
                    UNSUPPORTED;

                    private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

                    static {
                        int i10 = 0 | 4;
                    }

                    @NotNull
                    public static a<QuestionSubType> getEntries() {
                        return $ENTRIES;
                    }
                }

                public QuestionData(@Nullable String str, boolean z10, @NotNull i options, @NotNull String lowerLabel, @NotNull String upperLabel, int i10, int i11, boolean z11, int i12, int i13, int i14, @Nullable QuestionValidation questionValidation, @Nullable Integer num) {
                    Intrinsics.checkNotNullParameter(options, "options");
                    Intrinsics.checkNotNullParameter(lowerLabel, "lowerLabel");
                    Intrinsics.checkNotNullParameter(upperLabel, "upperLabel");
                    this._placeholder = str;
                    this.required = z10;
                    this.options = options;
                    this.lowerLabel = lowerLabel;
                    this.upperLabel = upperLabel;
                    this.scaleStart = i10;
                    this.scaleEnd = i11;
                    this.includeOther = z11;
                    this.maxSelection = i12;
                    this.minSelection = i13;
                    this.questionSubtype = i14;
                    this.validation = questionValidation;
                    this.characterLimit = num;
                }

                private final String component1() {
                    return this._placeholder;
                }

                public static /* synthetic */ QuestionData copy$default(QuestionData questionData, String str, boolean z10, i iVar, String str2, String str3, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num, int i15, Object obj) {
                    if ((i15 & 1) != 0) {
                        str = questionData._placeholder;
                    }
                    return questionData.copy(str, (i15 & 2) != 0 ? questionData.required : z10, (i15 & 4) != 0 ? questionData.options : iVar, (i15 & 8) != 0 ? questionData.lowerLabel : str2, (i15 & 16) != 0 ? questionData.upperLabel : str3, (i15 & 32) != 0 ? questionData.scaleStart : i10, (i15 & 64) != 0 ? questionData.scaleEnd : i11, (i15 & 128) != 0 ? questionData.includeOther : z11, (i15 & 256) != 0 ? questionData.maxSelection : i12, (i15 & 512) != 0 ? questionData.minSelection : i13, (i15 & 1024) != 0 ? questionData.questionSubtype : i14, (i15 & 2048) != 0 ? questionData.validation : questionValidation, (i15 & 4096) != 0 ? questionData.characterLimit : num);
                }

                public final int component10() {
                    return this.minSelection;
                }

                public final int component11() {
                    return this.questionSubtype;
                }

                @Nullable
                public final QuestionValidation component12() {
                    return this.validation;
                }

                @Nullable
                public final Integer component13() {
                    return this.characterLimit;
                }

                public final boolean component2() {
                    return this.required;
                }

                @NotNull
                public final i component3() {
                    return this.options;
                }

                @NotNull
                public final String component4() {
                    return this.lowerLabel;
                }

                @NotNull
                public final String component5() {
                    return this.upperLabel;
                }

                public final int component6() {
                    return this.scaleStart;
                }

                public final int component7() {
                    return this.scaleEnd;
                }

                public final boolean component8() {
                    return this.includeOther;
                }

                public final int component9() {
                    return this.maxSelection;
                }

                @NotNull
                public final QuestionData copy(@Nullable String str, boolean z10, @NotNull i options, @NotNull String lowerLabel, @NotNull String upperLabel, int i10, int i11, boolean z11, int i12, int i13, int i14, @Nullable QuestionValidation questionValidation, @Nullable Integer num) {
                    Intrinsics.checkNotNullParameter(options, "options");
                    Intrinsics.checkNotNullParameter(lowerLabel, "lowerLabel");
                    Intrinsics.checkNotNullParameter(upperLabel, "upperLabel");
                    return new QuestionData(str, z10, options, lowerLabel, upperLabel, i10, i11, z11, i12, i13, i14, questionValidation, num);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof QuestionData)) {
                        return false;
                    }
                    QuestionData questionData = (QuestionData) obj;
                    return Intrinsics.areEqual(this._placeholder, questionData._placeholder) && this.required == questionData.required && Intrinsics.areEqual(this.options, questionData.options) && Intrinsics.areEqual(this.lowerLabel, questionData.lowerLabel) && Intrinsics.areEqual(this.upperLabel, questionData.upperLabel) && this.scaleStart == questionData.scaleStart && this.scaleEnd == questionData.scaleEnd && this.includeOther == questionData.includeOther && this.maxSelection == questionData.maxSelection && this.minSelection == questionData.minSelection && this.questionSubtype == questionData.questionSubtype && Intrinsics.areEqual(this.validation, questionData.validation) && Intrinsics.areEqual(this.characterLimit, questionData.characterLimit);
                }

                @Nullable
                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                @NotNull
                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                @NotNull
                public final i getOptions() {
                    return this.options;
                }

                @NotNull
                public final String getPlaceholder() {
                    String str = this._placeholder;
                    return str == null ? "" : str;
                }

                public final int getQuestionSubtype() {
                    return this.questionSubtype;
                }

                public final boolean getRequired() {
                    return this.required;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                @NotNull
                public final String getUpperLabel() {
                    return this.upperLabel;
                }

                @Nullable
                public final QuestionValidation getValidation() {
                    return this.validation;
                }

                public int hashCode() {
                    String str = this._placeholder;
                    int iHashCode = (((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31) + this.options.hashCode()) * 31) + this.lowerLabel.hashCode()) * 31) + this.upperLabel.hashCode()) * 31) + Integer.hashCode(this.scaleStart)) * 31) + Integer.hashCode(this.scaleEnd)) * 31) + Boolean.hashCode(this.includeOther)) * 31) + Integer.hashCode(this.maxSelection)) * 31) + Integer.hashCode(this.minSelection)) * 31) + Integer.hashCode(this.questionSubtype)) * 31;
                    QuestionValidation questionValidation = this.validation;
                    int iHashCode2 = (iHashCode + (questionValidation == null ? 0 : questionValidation.hashCode())) * 31;
                    Integer num = this.characterLimit;
                    return iHashCode2 + (num != null ? num.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "QuestionData(_placeholder=" + this._placeholder + ", required=" + this.required + ", options=" + this.options + ", lowerLabel=" + this.lowerLabel + ", upperLabel=" + this.upperLabel + ", scaleStart=" + this.scaleStart + ", scaleEnd=" + this.scaleEnd + ", includeOther=" + this.includeOther + ", maxSelection=" + this.maxSelection + ", minSelection=" + this.minSelection + ", questionSubtype=" + this.questionSubtype + ", validation=" + this.validation + ", characterLimit=" + this.characterLimit + ')';
                }

                public /* synthetic */ QuestionData(String str, boolean z10, i iVar, String str2, String str3, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, z10, (i15 & 4) != 0 ? new i() : iVar, str2, str3, i10, i11, z11, i12, i13, i14, questionValidation, num);
                }
            }
        }

        public Step(@NotNull List<Block.Builder> blocks, @NotNull String id2, @NotNull List<Question> questions, int i10, @NotNull List<SurveyActions> actions, @Nullable String str) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.blocks = blocks;
            this.f293318id = id2;
            this.questions = questions;
            this._type = i10;
            this.actions = actions;
            this.customButtonText = str;
        }

        private final int component4() {
            return this._type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Step copy$default(Step step, List list, String str, List list2, int i10, List list3, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = step.blocks;
            }
            if ((i11 & 2) != 0) {
                str = step.f293318id;
            }
            if ((i11 & 4) != 0) {
                list2 = step.questions;
            }
            if ((i11 & 8) != 0) {
                i10 = step._type;
            }
            if ((i11 & 16) != 0) {
                list3 = step.actions;
            }
            if ((i11 & 32) != 0) {
                str2 = step.customButtonText;
            }
            List list4 = list3;
            String str3 = str2;
            return step.copy(list, str, list2, i10, list4, str3);
        }

        @NotNull
        public final List<Block.Builder> component1() {
            return this.blocks;
        }

        @NotNull
        public final String component2() {
            return this.f293318id;
        }

        @NotNull
        public final List<Question> component3() {
            return this.questions;
        }

        @NotNull
        public final List<SurveyActions> component5() {
            return this.actions;
        }

        @Nullable
        public final String component6() {
            return this.customButtonText;
        }

        @NotNull
        public final Step copy(@NotNull List<Block.Builder> blocks, @NotNull String id2, @NotNull List<Question> questions, int i10, @NotNull List<SurveyActions> actions, @Nullable String str) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new Step(blocks, id2, questions, i10, actions, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return Intrinsics.areEqual(this.blocks, step.blocks) && Intrinsics.areEqual(this.f293318id, step.f293318id) && Intrinsics.areEqual(this.questions, step.questions) && this._type == step._type && Intrinsics.areEqual(this.actions, step.actions) && Intrinsics.areEqual(this.customButtonText, step.customButtonText);
        }

        @NotNull
        public final List<SurveyActions> getActions() {
            return this.actions;
        }

        @NotNull
        public final List<Block.Builder> getBlocks() {
            return this.blocks;
        }

        @Nullable
        public final String getCustomButtonText() {
            return this.customButtonText;
        }

        @NotNull
        public final String getId() {
            return this.f293318id;
        }

        @NotNull
        public final List<Question> getQuestions() {
            return this.questions;
        }

        @NotNull
        public final StepType getType() {
            int i10 = this._type;
            if (i10 == 0) {
                return StepType.CONTENT;
            }
            if (i10 == 1) {
                return StepType.QUESTION;
            }
            if (i10 != 2) {
                return i10 != 3 ? StepType.UNSUPPORTED : StepType.THANK_YOU;
            }
            return StepType.INTRO;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.blocks.hashCode() * 31) + this.f293318id.hashCode()) * 31) + this.questions.hashCode()) * 31) + Integer.hashCode(this._type)) * 31) + this.actions.hashCode()) * 31;
            String str = this.customButtonText;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Step(blocks=" + this.blocks + ", id=" + this.f293318id + ", questions=" + this.questions + ", _type=" + this._type + ", actions=" + this.actions + ", customButtonText=" + this.customButtonText + ')';
        }

        public /* synthetic */ Step(List list, String str, List list2, int i10, List list3, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, list2, i10, (i11 & 16) != 0 ? CollectionsKt.emptyList() : list3, (i11 & 32) != 0 ? null : str2);
        }
    }

    public /* synthetic */ SurveyData(String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, surveyCustomization, surveySenderData, i10, z10, (i11 & 256) != 0 ? true : z11);
    }
}
