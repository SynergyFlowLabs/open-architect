package com.devtodev.analytics.internal.core;

import android.content.Context;
import com.devtodev.analytics.internal.modues.analytics.AnalyticsLogic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulesFactory$analyticsLogic$2 extends l0 implements Function0<AnalyticsLogic> {
    final /* synthetic */ Context $context;
    final /* synthetic */ IServicesFactory $servicesFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModulesFactory$analyticsLogic$2(IServicesFactory iServicesFactory, Context context) {
        super(0);
        this.$servicesFactory = iServicesFactory;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final AnalyticsLogic invoke() {
        return new AnalyticsLogic(this.$servicesFactory, this.$context);
    }
}
