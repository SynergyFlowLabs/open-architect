package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.b1;
import androidx.work.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f76808a;

    static {
        String strI = v.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        f76808a = strI;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public static final h<androidx.work.impl.constraints.c> a(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    @NotNull
    public static final androidx.work.impl.constraints.c c(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zE = e(connectivityManager);
        boolean zC = androidx.core.net.a.c(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new androidx.work.impl.constraints.c(z11, zE, zC, z10);
    }

    public static /* synthetic */ void d(ConnectivityManager connectivityManager) {
    }

    public static final boolean e(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = androidx.work.impl.utils.o.a(connectivityManager, androidx.work.impl.utils.p.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return androidx.work.impl.utils.o.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e10) {
            v.e().d(f76808a, "Unable to validate active network", e10);
            return false;
        }
    }
}
