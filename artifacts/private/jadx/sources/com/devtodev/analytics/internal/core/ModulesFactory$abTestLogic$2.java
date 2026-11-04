package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.external.abtest.DTDRemoteConfigListener;
import com.devtodev.analytics.internal.managers.IEventController;
import com.devtodev.analytics.internal.modues.abtest.AbTestLogic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulesFactory$abTestLogic$2 extends l0 implements Function0<AbTestLogic> {
    final /* synthetic */ IEventController $eventController;
    final /* synthetic */ DTDRemoteConfigListener $remoteConfigListener;
    final /* synthetic */ IServicesFactory $servicesFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModulesFactory$abTestLogic$2(IServicesFactory iServicesFactory, IEventController iEventController, DTDRemoteConfigListener dTDRemoteConfigListener) {
        super(0);
        this.$servicesFactory = iServicesFactory;
        this.$eventController = iEventController;
        this.$remoteConfigListener = dTDRemoteConfigListener;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final AbTestLogic invoke() {
        return new AbTestLogic(this.$servicesFactory, this.$eventController, this.$remoteConfigListener);
    }
}
