package androidx.core.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48009a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48010b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48011c = 3;

    /* JADX INFO: renamed from: androidx.core.net.a$a, reason: collision with other inner class name */
    @w0(24)
    static class C0394a {
        private C0394a() {
        }

        static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    private a() {
    }

    @a1("android.permission.ACCESS_NETWORK_STATE")
    @e.a({"ReferencesDeprecated"})
    @p0
    public static NetworkInfo a(@NonNull ConnectivityManager connectivityManager, @NonNull Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@NonNull ConnectivityManager connectivityManager) {
        return C0394a.a(connectivityManager);
    }

    @a1("android.permission.ACCESS_NETWORK_STATE")
    @v0(expression = "cm.isActiveNetworkMetered()")
    @Deprecated
    public static boolean c(@NonNull ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
