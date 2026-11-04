package com.planner5d.library.services.utility;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<Boolean> f225271a;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            i1.this.f225271a.setValue(Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            i1.this.f225271a.setValue(Boolean.FALSE);
        }
    }

    @ij.a
    public i1(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f225271a = kotlinx.coroutines.flow.b1.a(Boolean.FALSE);
        ((ConnectivityManager) application.getSystemService(ConnectivityManager.class)).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(16).build(), new a());
    }

    private static Object c(i1 i1Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(i1Var, i1.class, "internetAvailableInternal", "getInternetAvailableInternal()Lkotlinx/coroutines/flow/MutableStateFlow;", 0));
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<Boolean> b() {
        return this.f225271a;
    }
}
