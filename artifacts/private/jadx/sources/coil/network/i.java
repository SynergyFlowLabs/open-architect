package coil.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"MissingPermission"})
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12511#2,2:113\n12511#2,2:115\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n*L\n82#1:113,2\n96#1:115,2\n*E\n"})
final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConnectivityManager f87602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g.a f87603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f87604c;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            i.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            i.this.d(network, false);
        }
    }

    public i(@NotNull ConnectivityManager connectivityManager, @NotNull g.a aVar) {
        this.f87602a = connectivityManager;
        this.f87603b = aVar;
        a aVar2 = new a();
        this.f87604c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f87602a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Network network, boolean z10) {
        boolean z11 = false;
        for (Network network2 : this.f87602a.getAllNetworks()) {
            if (Intrinsics.areEqual(network2, network) ? z10 : c(network2)) {
                z11 = true;
                break;
            }
        }
        this.f87603b.a(z11);
    }

    @Override // coil.network.g
    public boolean a() {
        for (Network network : this.f87602a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.network.g
    public void shutdown() {
        this.f87602a.unregisterNetworkCallback(this.f87604c);
    }
}
