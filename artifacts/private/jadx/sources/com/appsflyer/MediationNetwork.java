package com.appsflyer;

import com.devtodev.analytics.internal.utils.BuildConfigData;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum MediationNetwork {
    IRONSOURCE("ironsource"),
    APPLOVIN_MAX("applovinmax"),
    GOOGLE_ADMOB("googleadmob"),
    FYBER("fyber"),
    APPODEAL("appodeal"),
    ADMOST("Admost"),
    TOPON("Topon"),
    TRADPLUS("Tradplus"),
    YANDEX("Yandex"),
    CHARTBOOST("chartboost"),
    UNITY(BuildConfigData.Unity),
    TOPON_PTE("toponpte"),
    CUSTOM_MEDIATION("customMediation"),
    DIRECT_MONETIZATION_NETWORK("directMonetizationNetwork");


    @NotNull
    private final String value;

    MediationNetwork(String str) {
        this.value = str;
    }

    @i(name = "getValue")
    @NotNull
    public final String getValue() {
        return this.value;
    }
}
