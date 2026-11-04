package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AFd1aSDK<Body> implements ResponseNetwork<Body> {
    final boolean AFAdRevenueData;

    @NonNull
    final Map<String, List<String>> getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NonNull
    private final Body getMonetizationNetwork;

    @NonNull
    public final AFd1hSDK getRevenue;

    public AFd1aSDK(@NonNull Body body, int i10, boolean z10, Map<String, List<String>> map, @NonNull AFd1hSDK aFd1hSDK) {
        this.getMonetizationNetwork = body;
        this.getMediationNetwork = i10;
        this.AFAdRevenueData = z10;
        this.getCurrencyIso4217Code = new HashMap(map);
        this.getRevenue = aFd1hSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1aSDK aFd1aSDK = (AFd1aSDK) obj;
        if (this.getMediationNetwork == aFd1aSDK.getMediationNetwork && this.AFAdRevenueData == aFd1aSDK.AFAdRevenueData && this.getMonetizationNetwork.equals(aFd1aSDK.getMonetizationNetwork) && this.getCurrencyIso4217Code.equals(aFd1aSDK.getCurrencyIso4217Code)) {
            return this.getRevenue.equals(aFd1aSDK.getRevenue);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getMonetizationNetwork;
    }

    @androidx.annotation.p0
    public final String getCurrencyIso4217Code(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @androidx.annotation.p0
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getCurrencyIso4217Code.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getCurrencyIso4217Code.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMediationNetwork;
    }

    public int hashCode() {
        return (((((((this.getMonetizationNetwork.hashCode() * 31) + this.getMediationNetwork) * 31) + (this.AFAdRevenueData ? 1 : 0)) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.getRevenue.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.AFAdRevenueData;
    }
}
