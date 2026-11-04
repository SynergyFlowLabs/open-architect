package io.intercom.android.sdk.survey;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class SurveyLaunchMode {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class Automatic extends SurveyLaunchMode {
        public static final int $stable = 8;

        @NotNull
        private final SurveyData surveyData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Automatic(@NotNull SurveyData surveyData) {
            super(null);
            Intrinsics.checkNotNullParameter(surveyData, "surveyData");
            this.surveyData = surveyData;
        }

        public static /* synthetic */ Automatic copy$default(Automatic automatic, SurveyData surveyData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                surveyData = automatic.surveyData;
            }
            return automatic.copy(surveyData);
        }

        @NotNull
        public final SurveyData component1() {
            return this.surveyData;
        }

        @NotNull
        public final Automatic copy(@NotNull SurveyData surveyData) {
            Intrinsics.checkNotNullParameter(surveyData, "surveyData");
            return new Automatic(surveyData);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Automatic) && Intrinsics.areEqual(this.surveyData, ((Automatic) obj).surveyData);
        }

        @NotNull
        public final SurveyData getSurveyData() {
            return this.surveyData;
        }

        public int hashCode() {
            return this.surveyData.hashCode();
        }

        @NotNull
        public String toString() {
            return "Automatic(surveyData=" + this.surveyData + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Programmatic extends SurveyLaunchMode {
        public static final int $stable = 0;

        @NotNull
        private final String surveyId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Programmatic(@NotNull String surveyId) {
            super(null);
            Intrinsics.checkNotNullParameter(surveyId, "surveyId");
            this.surveyId = surveyId;
        }

        public static /* synthetic */ Programmatic copy$default(Programmatic programmatic, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = programmatic.surveyId;
            }
            return programmatic.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.surveyId;
        }

        @NotNull
        public final Programmatic copy(@NotNull String surveyId) {
            Intrinsics.checkNotNullParameter(surveyId, "surveyId");
            return new Programmatic(surveyId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Programmatic) && Intrinsics.areEqual(this.surveyId, ((Programmatic) obj).surveyId);
        }

        @NotNull
        public final String getSurveyId() {
            return this.surveyId;
        }

        public int hashCode() {
            return this.surveyId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Programmatic(surveyId=" + this.surveyId + ')';
        }
    }

    public /* synthetic */ SurveyLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SurveyLaunchMode() {
    }
}
