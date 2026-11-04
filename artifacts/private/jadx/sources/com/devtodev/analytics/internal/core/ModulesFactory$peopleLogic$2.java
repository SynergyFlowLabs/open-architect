package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.modues.people.PeopleLogic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulesFactory$peopleLogic$2 extends l0 implements Function0<PeopleLogic> {
    final /* synthetic */ IServicesFactory $servicesFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModulesFactory$peopleLogic$2(IServicesFactory iServicesFactory) {
        super(0);
        this.$servicesFactory = iServicesFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PeopleLogic invoke() {
        return new PeopleLogic(this.$servicesFactory);
    }
}
