package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import coil.util.j;
import coil.util.z;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,112:1\n31#2:113\n21#3,4:114\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n*L\n26#1:113\n28#1:114,4\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f87601a = "NetworkObserver";

    @NotNull
    public static final g a(@NotNull Context context, @NotNull g.a aVar, @Nullable z zVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.d.s(context, ConnectivityManager.class);
        if (connectivityManager != null && coil.util.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new i(connectivityManager, aVar);
            } catch (Exception e10) {
                if (zVar != null) {
                    j.b(zVar, f87601a, new RuntimeException("Failed to register network observer.", e10));
                }
                return new e();
            }
        }
        if (zVar != null && zVar.g() <= 5) {
            zVar.h(f87601a, 5, "Unable to register network observer.", null);
        }
        return new e();
    }
}
