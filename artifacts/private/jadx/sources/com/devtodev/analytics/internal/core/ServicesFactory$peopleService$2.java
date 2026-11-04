package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.services.PeopleService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ServicesFactory$peopleService$2 extends l0 implements Function0<PeopleService> {
    final /* synthetic */ ServicesFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicesFactory$peopleService$2(ServicesFactory servicesFactory) {
        super(0);
        this.this$0 = servicesFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PeopleService invoke() {
        return new PeopleService(this.this$0.stateManager, this.this$0.coreFactory.getPeopleCardRepository());
    }
}
