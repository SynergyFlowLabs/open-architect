package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.w0;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(31)
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApi31.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApi31.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi31\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class AFi1sSDK extends AFi1pSDK {

    @NotNull
    private String AFAdRevenueData;

    @Nullable
    private Network getRevenue;

    public static final class AFa1vSDK extends ConnectivityManager.NetworkCallback {
        AFa1vSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1sSDK.this.getRevenue = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1sSDK.this.getRevenue = network;
            AFi1sSDK.this.AFAdRevenueData = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1sSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AFAdRevenueData = "unknown";
        AFa1vSDK aFa1vSDK = new AFa1vSDK();
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1vSDK);
            }
        } catch (Throwable th2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th2, true, false, false, false, 96, null);
        }
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    protected final String getRevenue() {
        Network network = this.getRevenue;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getMonetizationNetwork() {
        Network network = this.getRevenue;
        if (network != null) {
            if (Intrinsics.areEqual(this.AFAdRevenueData, "NetworkLost")) {
                network = null;
            }
            if (network != null) {
                ConnectivityManager connectivityManager = this.getMonetizationNetwork;
                NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
                if (networkCapabilities != null) {
                    return y_(networkCapabilities);
                }
            }
        }
        return false;
    }
}
