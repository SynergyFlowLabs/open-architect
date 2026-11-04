package com.superwall.sdk.analytics;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultClassifierDataFactory implements ClassifierDataFactory {

    @NotNull
    private final Function0<Context> _context;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultClassifierDataFactory(@NotNull Function0<? extends Context> _context) {
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public long advertisedMemory() {
        return ClassifierDataFactory.DefaultImpls.advertisedMemory(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public List<String> codecs() {
        return ClassifierDataFactory.DefaultImpls.codecs(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public Context context() {
        return this._context.invoke();
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public CPUInfo.Data getCpuInfo() {
        return ClassifierDataFactory.DefaultImpls.getCpuInfo(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public DeviceClassifier.Orientation getOrientation() {
        return ClassifierDataFactory.DefaultImpls.getOrientation(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public int getScreenHeight() {
        return ClassifierDataFactory.DefaultImpls.getScreenHeight(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public double getScreenSize() {
        return ClassifierDataFactory.DefaultImpls.getScreenSize(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public int getScreenWidth() {
        return ClassifierDataFactory.DefaultImpls.getScreenWidth(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public boolean isTabletMinWidth() {
        return ClassifierDataFactory.DefaultImpls.isTabletMinWidth(this);
    }
}
