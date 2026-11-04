package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public class AFd1hSDK {
    public final long getRevenue;

    public AFd1hSDK(long j10) {
        this.getRevenue = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFd1hSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j10 = this.getRevenue;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
