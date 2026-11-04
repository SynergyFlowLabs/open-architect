package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFi1mSDK implements AFi1lSDK {

    @NotNull
    private PluginInfo getCurrencyIso4217Code = new PluginInfo(Plugin.NATIVE, "6.17.0", null, 4, null);

    public AFi1mSDK() {
        int i10 = 7 ^ 0;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void AFAdRevenueData(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getCurrencyIso4217Code = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("platform", this.getCurrencyIso4217Code.getPlugin().getPluginName()), TuplesKt.to("version", this.getCurrencyIso4217Code.getVersion()));
        if (!this.getCurrencyIso4217Code.getAdditionalParams().isEmpty()) {
            mapMutableMapOf.put(com.facebook.bolts.e.f99330c, this.getCurrencyIso4217Code.getAdditionalParams());
        }
        return mapMutableMapOf;
    }
}
