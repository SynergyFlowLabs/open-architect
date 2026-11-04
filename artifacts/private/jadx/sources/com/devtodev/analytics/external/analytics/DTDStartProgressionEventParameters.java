package com.devtodev.analytics.external.analytics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDStartProgressionEventParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f98046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98047b;

    @NotNull
    public final DTDStartProgressionEventParameters clone$DTDAnalytics_androidRelease() {
        DTDStartProgressionEventParameters dTDStartProgressionEventParameters = new DTDStartProgressionEventParameters();
        dTDStartProgressionEventParameters.f98046a = this.f98046a;
        dTDStartProgressionEventParameters.f98047b = this.f98047b;
        return dTDStartProgressionEventParameters;
    }

    @Nullable
    public final Integer getDifficulty$DTDAnalytics_androidRelease() {
        return this.f98046a;
    }

    @Nullable
    public final String getSource() {
        return this.f98047b;
    }

    public final void setDifficulty(int i10) {
        this.f98046a = Integer.valueOf(i10);
    }

    public final void setDifficulty$DTDAnalytics_androidRelease(@Nullable Integer num) {
        this.f98046a = num;
    }

    public final void setSource(@Nullable String str) {
        this.f98047b = str;
    }

    @NotNull
    public String toString() {
        return "difficulty:" + this.f98046a + "\nsource:" + this.f98047b + "\n";
    }
}
