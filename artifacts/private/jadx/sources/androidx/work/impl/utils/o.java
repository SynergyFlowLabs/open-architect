package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(21)
@oj.i(name = "NetworkApi21")
public final class o {
    @androidx.annotation.u
    @Nullable
    public static final NetworkCapabilities a(@NotNull ConnectivityManager connectivityManager, @Nullable Network network) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    @androidx.annotation.u
    public static final boolean b(@NotNull NetworkCapabilities networkCapabilities, int i10) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    @androidx.annotation.u
    public static final void c(@NotNull ConnectivityManager connectivityManager, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
