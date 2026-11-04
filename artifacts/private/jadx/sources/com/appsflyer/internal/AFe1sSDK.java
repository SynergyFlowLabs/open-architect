package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFe1sSDK<Result> implements Comparable<AFe1sSDK<?>>, Callable<AFe1rSDK> {
    private static final AtomicInteger component4 = new AtomicInteger();

    @NonNull
    public final Set<AFe1mSDK> AFAdRevenueData;

    @androidx.annotation.p0
    private Throwable areAllFieldsValid;
    private final String component1;
    private final int component2;
    private long component3;

    @NonNull
    public final Set<AFe1mSDK> getCurrencyIso4217Code;

    @androidx.annotation.p0
    public AFe1rSDK getMediationNetwork;

    @NonNull
    public final AFe1mSDK getMonetizationNetwork;
    public volatile int getRevenue;
    private boolean hashCode;

    public AFe1sSDK(@NonNull AFe1mSDK aFe1mSDK, @NonNull AFe1mSDK[] aFe1mSDKArr, @androidx.annotation.p0 String str) {
        HashSet hashSet = new HashSet();
        this.getCurrencyIso4217Code = hashSet;
        this.AFAdRevenueData = new HashSet();
        int iIncrementAndGet = component4.incrementAndGet();
        this.component2 = iIncrementAndGet;
        this.hashCode = false;
        this.getRevenue = 0;
        this.getMonetizationNetwork = aFe1mSDK;
        Collections.addAll(hashSet, aFe1mSDKArr);
        if (str != null) {
            this.component1 = str;
        } else {
            this.component1 = String.valueOf(iIncrementAndGet);
        }
    }

    @androidx.annotation.i
    @m1
    public void AFAdRevenueData() {
        this.hashCode = true;
    }

    protected final boolean areAllFieldsValid() {
        return this.hashCode;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: component2, reason: merged with bridge method [inline-methods] */
    public final AFe1rSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMediationNetwork = null;
        this.areAllFieldsValid = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.getRevenue++;
        try {
            AFe1rSDK currencyIso4217Code = getCurrencyIso4217Code();
            this.getMediationNetwork = currencyIso4217Code;
            this.component3 = System.currentTimeMillis() - jCurrentTimeMillis;
            getRevenue();
            return currencyIso4217Code;
        } catch (Throwable th2) {
            try {
                this.areAllFieldsValid = th2;
                this.getMediationNetwork = AFe1rSDK.FAILURE;
                getCurrencyIso4217Code(th2);
                throw th2;
            } catch (Throwable th3) {
                this.component3 = System.currentTimeMillis() - jCurrentTimeMillis;
                getRevenue();
                throw th3;
            }
        }
    }

    @androidx.annotation.p0
    public final Throwable component4() {
        return this.areAllFieldsValid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFe1sSDK aFe1sSDK = (AFe1sSDK) obj;
            if (this.getMonetizationNetwork != aFe1sSDK.getMonetizationNetwork) {
                return false;
            }
            return this.component1.equals(aFe1sSDK.component1);
        }
        return false;
    }

    @NonNull
    @m1
    protected abstract AFe1rSDK getCurrencyIso4217Code() throws Exception;

    @m1
    protected void getCurrencyIso4217Code(Throwable th2) {
    }

    @m1
    protected abstract boolean getMediationNetwork();

    protected abstract long getMonetizationNetwork();

    @m1
    public void getRevenue() {
    }

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component1.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getMonetizationNetwork);
        sb2.append("-");
        sb2.append(this.component1);
        String string = sb2.toString();
        if (String.valueOf(this.component2).equals(this.component1)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("-");
        sb3.append(this.component2);
        return sb3.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1sSDK<?> aFe1sSDK) {
        int i10 = this.getMonetizationNetwork.f89672w - aFe1sSDK.getMonetizationNetwork.f89672w;
        if (i10 != 0) {
            return i10;
        }
        if (this.component1.equals(aFe1sSDK.component1)) {
            return 0;
        }
        return this.component2 - aFe1sSDK.component2;
    }
}
