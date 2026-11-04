package com.devtodev.analytics.internal.core;

import android.content.Context;
import com.devtodev.analytics.external.abtest.DTDRemoteConfigListener;
import com.devtodev.analytics.internal.managers.IEventController;
import com.devtodev.analytics.internal.modues.abtest.IAbTestLogic;
import com.devtodev.analytics.internal.modues.analytics.IAnalyticLogic;
import com.devtodev.analytics.internal.modues.anticheat.IAntiCheatLogic;
import com.devtodev.analytics.internal.modues.messaging.IMessaging;
import com.devtodev.analytics.internal.modues.people.IPeopleLogic;
import com.devtodev.analytics.internal.modues.purchases.IPurchases;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulesFactory implements IModulesFactory {

    @NotNull
    private final f0 abTestLogic$delegate;

    @NotNull
    private final f0 analyticsLogic$delegate;

    @NotNull
    private final f0 antiCheatLogic$delegate;

    @NotNull
    private final f0 messagingLogic$delegate;

    @NotNull
    private final f0 peopleLogic$delegate;

    @NotNull
    private final f0 purchasesLogic$delegate;

    public ModulesFactory(@NotNull IServicesFactory servicesFactory, @NotNull IEventController eventController, @Nullable DTDRemoteConfigListener dTDRemoteConfigListener, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(servicesFactory, "servicesFactory");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(context, "context");
        j0 j0Var = j0.PUBLICATION;
        this.abTestLogic$delegate = g0.b(j0Var, new ModulesFactory$abTestLogic$2(servicesFactory, eventController, dTDRemoteConfigListener));
        this.analyticsLogic$delegate = g0.b(j0Var, new ModulesFactory$analyticsLogic$2(servicesFactory, context));
        this.antiCheatLogic$delegate = g0.b(j0Var, new ModulesFactory$antiCheatLogic$2(servicesFactory));
        this.peopleLogic$delegate = g0.b(j0Var, new ModulesFactory$peopleLogic$2(servicesFactory));
        this.messagingLogic$delegate = g0.b(j0Var, new ModulesFactory$messagingLogic$2(servicesFactory));
        this.purchasesLogic$delegate = g0.b(j0Var, new ModulesFactory$purchasesLogic$2(servicesFactory));
    }

    @Override // com.devtodev.analytics.internal.core.IModulesFactory
    @NotNull
    public IAbTestLogic getAbTestLogic() {
        return (IAbTestLogic) this.abTestLogic$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IModulesFactory
    @NotNull
    public IAnalyticLogic getAnalyticsLogic() {
        return (IAnalyticLogic) this.analyticsLogic$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IModulesFactory
    @NotNull
    public IAntiCheatLogic getAntiCheatLogic() {
        return (IAntiCheatLogic) this.antiCheatLogic$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IModulesFactory
    @NotNull
    public IMessaging getMessagingLogic() {
        return (IMessaging) this.messagingLogic$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IModulesFactory
    @NotNull
    public IPeopleLogic getPeopleLogic() {
        return (IPeopleLogic) this.peopleLogic$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.IModulesFactory
    @NotNull
    public IPurchases getPurchasesLogic() {
        return (IPurchases) this.purchasesLogic$delegate.getValue();
    }
}
