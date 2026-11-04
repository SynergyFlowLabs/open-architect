package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.modues.messaging.MessagingLogic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulesFactory$messagingLogic$2 extends l0 implements Function0<MessagingLogic> {
    final /* synthetic */ IServicesFactory $servicesFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModulesFactory$messagingLogic$2(IServicesFactory iServicesFactory) {
        super(0);
        this.$servicesFactory = iServicesFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MessagingLogic invoke() {
        return new MessagingLogic(this.$servicesFactory);
    }
}
