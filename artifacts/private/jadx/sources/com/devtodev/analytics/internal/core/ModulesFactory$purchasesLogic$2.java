package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.modues.purchases.PurchasesLogic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulesFactory$purchasesLogic$2 extends l0 implements Function0<PurchasesLogic> {
    final /* synthetic */ IServicesFactory $servicesFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModulesFactory$purchasesLogic$2(IServicesFactory iServicesFactory) {
        super(0);
        this.$servicesFactory = iServicesFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PurchasesLogic invoke() {
        return new PurchasesLogic(this.$servicesFactory);
    }
}
