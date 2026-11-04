package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.services.ConfigService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ServicesFactory$configService$2 extends l0 implements Function0<ConfigService> {
    final /* synthetic */ ServicesFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicesFactory$configService$2(ServicesFactory servicesFactory) {
        super(0);
        this.this$0 = servicesFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ConfigService invoke() {
        return new ConfigService(this.this$0.stateManager, this.this$0.abTestManager, this.this$0.coreFactory.getBackend());
    }
}
