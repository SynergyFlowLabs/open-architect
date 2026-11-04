package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;
import io.sentry.ILogger;
import io.sentry.f6;
import io.sentry.ja;
import io.sentry.n8;
import io.sentry.y7;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.x1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f303977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u0 f303978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f303979c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private n8 f303980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @lm.n
    @Nullable
    volatile b f303981e;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f303982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f303983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f303984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f303985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f303986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        final String f303987f;

        @e.a({"NewApi"})
        a(@NotNull NetworkCapabilities networkCapabilities, @NotNull u0 u0Var, long j10) {
            io.sentry.util.y.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.y.c(u0Var, "BuildInfoProvider is required");
            this.f303982a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f303983b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = u0Var.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f303984c = signalStrength > -100 ? signalStrength : 0;
            this.f303986e = networkCapabilities.hasTransport(4);
            String strK0 = io.sentry.android.core.internal.util.e.k0(networkCapabilities);
            this.f303987f = strK0 == null ? "" : strK0;
            this.f303985d = j10;
        }

        boolean a(@NotNull a aVar) {
            int iAbs = Math.abs(this.f303984c - aVar.f303984c);
            int iAbs2 = Math.abs(this.f303982a - aVar.f303982a);
            int iAbs3 = Math.abs(this.f303983b - aVar.f303983b);
            boolean z10 = io.sentry.p.l((double) Math.abs(this.f303985d - aVar.f303985d)) < 5000.0d;
            return this.f303986e == aVar.f303986e && this.f303987f.equals(aVar.f303987f) && (z10 || iAbs <= 5) && (z10 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.f303982a)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.f303982a)) * 0.1d) ? 0 : -1)) <= 0) && (z10 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.f303983b)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.f303983b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        final io.sentry.i1 f303988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        final u0 f303989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        NetworkCapabilities f303990c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f303991d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        final f6 f303992e;

        b(@NotNull io.sentry.i1 i1Var, @NotNull u0 u0Var, @NotNull f6 f6Var) {
            this.f303988a = (io.sentry.i1) io.sentry.util.y.c(i1Var, "Scopes are required");
            this.f303989b = (u0) io.sentry.util.y.c(u0Var, "BuildInfoProvider is required");
            this.f303992e = (f6) io.sentry.util.y.c(f6Var, "SentryDateProvider is required");
        }

        private io.sentry.f a(String str) {
            io.sentry.f fVar = new io.sentry.f();
            fVar.Y("system");
            fVar.T("network.event");
            fVar.U(com.facebook.internal.w0.f100156c1, str);
            fVar.V(y7.INFO);
            return fVar;
        }

        @Nullable
        private a b(@Nullable NetworkCapabilities networkCapabilities, @NotNull NetworkCapabilities networkCapabilities2, long j10, long j11) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f303989b, j11);
            }
            a aVar = new a(networkCapabilities, this.f303989b, j10);
            a aVar2 = new a(networkCapabilities2, this.f303989b, j11);
            if (aVar.a(aVar2)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            this.f303988a.k(a("NETWORK_AVAILABLE"));
            this.f303990c = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            long jK = this.f303992e.a().k();
            a aVarB = b(this.f303990c, networkCapabilities, this.f303991d, jK);
            if (aVarB == null) {
                return;
            }
            this.f303990c = networkCapabilities;
            this.f303991d = jK;
            io.sentry.f fVarA = a("NETWORK_CAPABILITIES_CHANGED");
            fVarA.U("download_bandwidth", Integer.valueOf(aVarB.f303982a));
            fVarA.U("upload_bandwidth", Integer.valueOf(aVarB.f303983b));
            fVarA.U("vpn_active", Boolean.valueOf(aVarB.f303986e));
            fVarA.U("network_type", aVarB.f303987f);
            int i10 = aVarB.f303984c;
            if (i10 != 0) {
                fVarA.U("signal_strength", Integer.valueOf(i10));
            }
            io.sentry.n0 n0Var = new io.sentry.n0();
            n0Var.o(ja.f305672p, aVarB);
            this.f303988a.m(fVarA, n0Var);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            this.f303988a.k(a("NETWORK_LOST"));
            this.f303990c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(@NotNull Context context, @NotNull u0 u0Var) {
        this.f303977a = (Context) io.sentry.util.y.c(a1.g(context), "Context is required");
        this.f303978b = (u0) io.sentry.util.y.c(u0Var, "BuildInfoProvider is required");
    }

    @Override // io.sentry.x1
    public void c(@NotNull io.sentry.i1 i1Var, @NotNull n8 n8Var) {
        io.sentry.util.y.c(i1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(n8Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) n8Var : null, "SentryAndroidOptions is required");
        this.f303980d = n8Var;
        ILogger logger = n8Var.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f303978b.d() < 24) {
                n8Var.getLogger().c(y7Var, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            io.sentry.m1 m1VarA = this.f303979c.a();
            try {
                this.f303981e = new b(i1Var, this.f303978b, n8Var.getDateProvider());
                if (io.sentry.android.core.internal.util.e.T(this.f303977a, n8Var.getLogger(), this.f303978b, this.f303981e)) {
                    n8Var.getLogger().c(y7Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.q.a("NetworkBreadcrumbs");
                } else {
                    n8Var.getLogger().c(y7Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        io.sentry.m1 m1VarA = this.f303979c.a();
        try {
            b bVar = this.f303981e;
            this.f303981e = null;
            if (m1VarA != null) {
                m1VarA.close();
            }
            if (bVar != null) {
                io.sentry.android.core.internal.util.e.M0(bVar);
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
