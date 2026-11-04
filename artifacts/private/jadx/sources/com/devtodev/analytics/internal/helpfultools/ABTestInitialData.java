package com.devtodev.analytics.internal.helpfultools;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ABTestInitialData {
    private double abConfigWaiting;
    private double abGroupWaiting;
    private boolean cacheTestExperiment;

    public ABTestInitialData(double d10, double d11, boolean z10) {
        this.abConfigWaiting = d10;
        this.abGroupWaiting = d11;
        this.cacheTestExperiment = z10;
    }

    @NotNull
    public final ABTestInitialData clone() {
        return new ABTestInitialData(this.abConfigWaiting, this.abGroupWaiting, this.cacheTestExperiment);
    }

    public final double getAbConfigWaiting() {
        return this.abConfigWaiting;
    }

    public final double getAbGroupWaiting() {
        return this.abGroupWaiting;
    }

    public final boolean getCacheTestExperiment() {
        return this.cacheTestExperiment;
    }

    public final void setAbConfigWaiting(double d10) {
        this.abConfigWaiting = d10;
    }

    public final void setAbGroupWaiting(double d10) {
        this.abGroupWaiting = d10;
    }

    public final void setCacheTestExperiment(boolean z10) {
        this.cacheTestExperiment = z10;
    }

    public /* synthetic */ ABTestInitialData(double d10, double d11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, (i10 & 4) != 0 ? false : z10);
    }
}
