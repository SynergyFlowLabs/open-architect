package com.planner5d.library.services.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
@SourceDebugExtension({"SMAP\nNetworkStateUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkStateUtility.kt\ncom/planner5d/library/services/utility/NetworkStateUtility\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f225170a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static Long f225171b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static b2 f225172c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f225173d = 10000;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public c2() {
    }

    public final void a(@Nullable b2 b2Var) {
        f225172c = b2Var;
    }

    @NotNull
    public final b2 b(@Nullable Context context) {
        b2 b2Var = f225172c;
        if (b2Var != null) {
            return b2Var;
        }
        Object systemService = context != null ? context.getSystemService("connectivity") : null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                for (NetworkInfo networkInfo : connectivityManager.getAllNetworkInfo()) {
                    if (networkInfo != null && networkInfo.isConnected() && networkInfo.getType() != 17) {
                        return networkInfo.getType() == 1 ? b2.ONLINE_WITH_WIFI : b2.ONLINE;
                    }
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
        }
        return b2.OFFLINE;
    }

    public final boolean c(@Nullable Context context) {
        Long l10 = f225171b;
        if (d(context)) {
            return l10 == null || System.currentTimeMillis() - l10.longValue() > 10000;
        }
        return false;
    }

    public final boolean d(@Nullable Context context) {
        return b(context) != b2.OFFLINE;
    }

    public final void e(boolean z10) {
        f225171b = z10 ? Long.valueOf(System.currentTimeMillis()) : null;
    }
}
