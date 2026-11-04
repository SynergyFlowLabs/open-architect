package io.intercom.android.sdk.survey;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class SurveyEffects {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class ExitSurvey extends SurveyEffects {
        public static final int $stable = 0;

        @NotNull
        public static final ExitSurvey INSTANCE = new ExitSurvey();

        private ExitSurvey() {
            super(null);
        }
    }

    public /* synthetic */ SurveyEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SurveyEffects() {
    }
}
