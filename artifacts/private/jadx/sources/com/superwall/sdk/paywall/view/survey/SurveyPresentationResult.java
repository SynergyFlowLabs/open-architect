package com.superwall.sdk.paywall.view.survey;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum SurveyPresentationResult {
    SHOW("show"),
    HOLDOUT("holdout"),
    NOSHOW("noShow");

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    private final String rawValue;

    SurveyPresentationResult(String str) {
        this.rawValue = str;
    }

    @NotNull
    public static kotlin.enums.a<SurveyPresentationResult> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
