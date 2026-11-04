package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFb1tSDK<T> {
    public final FutureTask<T> AFAdRevenueData = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1tSDK.5
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1tSDK.this.getMediationNetwork()) {
                return (T) AFb1tSDK.this.getCurrencyIso4217Code();
            }
            return null;
        }
    });
    public final Context getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final String[] getMonetizationNetwork;
    public final Executor getRevenue;

    public AFb1tSDK(Context context, Executor executor, String str, String... strArr) {
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = strArr;
        this.getRevenue = executor;
    }

    protected abstract T getCurrencyIso4217Code();

    public final boolean getMediationNetwork() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(this.getMediationNetwork, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.getMonetizationNetwork).contains(AFj1iSDK.N_(this.getCurrencyIso4217Code.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
            return false;
        }
    }

    @androidx.annotation.p0
    public T getMonetizationNetwork() {
        try {
            return this.AFAdRevenueData.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
            return null;
        } catch (TimeoutException e11) {
            AFLogger.afErrorLog(e11.getMessage(), e11, false, false);
            return null;
        }
    }
}
