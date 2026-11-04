package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.modues.abtest.IAbTestLogic;
import com.devtodev.analytics.internal.modues.analytics.IAnalyticLogic;
import com.devtodev.analytics.internal.modues.anticheat.IAntiCheatLogic;
import com.devtodev.analytics.internal.modues.messaging.IMessaging;
import com.devtodev.analytics.internal.modues.people.IPeopleLogic;
import com.devtodev.analytics.internal.modues.purchases.IPurchases;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IModulesFactory {
    @NotNull
    IAbTestLogic getAbTestLogic();

    @NotNull
    IAnalyticLogic getAnalyticsLogic();

    @NotNull
    IAntiCheatLogic getAntiCheatLogic();

    @NotNull
    IMessaging getMessagingLogic();

    @NotNull
    IPeopleLogic getPeopleLogic();

    @NotNull
    IPurchases getPurchasesLogic();
}
