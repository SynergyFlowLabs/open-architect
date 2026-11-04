package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import io.sentry.ILogger;
import io.sentry.android.core.a1;
import io.sentry.android.core.s0;
import io.sentry.m1;
import io.sentry.n8;
import io.sentry.u0;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class e implements u0, s0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private static volatile ConnectivityManager f304290m = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f304295v = 120000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f304297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.u0 f304298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.p f304299d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private volatile ConnectivityManager.NetworkCallback f304302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private volatile NetworkCapabilities f304303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private volatile Network f304304i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f304289l = new io.sentry.util.a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f304291n = new io.sentry.util.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final List<ConnectivityManager.NetworkCallback> f304292o = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f304293s = {1, 0, 3, 2};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f304294t = new int[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304301f = new io.sentry.util.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile long f304305j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304306k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<u0.b> f304300e = new ArrayList();

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        private void a() {
            e.this.f304306k.set(false);
            m1 m1VarA = e.this.f304301f.a();
            try {
                e.this.f304303h = null;
                e.this.f304304i = null;
                e eVar = e.this;
                eVar.f304305j = eVar.f304299d.a();
                e.this.f304297b.getLogger().c(y7.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = e.this.f304300e.iterator();
                while (it.hasNext()) {
                    ((u0.b) it.next()).h(u0.a.DISCONNECTED);
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

        private boolean b(@NotNull NetworkCapabilities networkCapabilities, @NotNull NetworkCapabilities networkCapabilities2) {
            for (int i10 : e.f304294t) {
                if (i10 != 0 && networkCapabilities.hasCapability(i10) != networkCapabilities2.hasCapability(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean c(@NotNull NetworkCapabilities networkCapabilities, @NotNull NetworkCapabilities networkCapabilities2) {
            for (int i10 : e.f304293s) {
                if (networkCapabilities.hasTransport(i10) != networkCapabilities2.hasTransport(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean d(@Nullable NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2 = e.this.f304303h;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                return true;
            }
            if (networkCapabilities2 == null && networkCapabilities == null) {
                return false;
            }
            return b(networkCapabilities2, networkCapabilities) || c(networkCapabilities2, networkCapabilities);
        }

        private void e(@Nullable Network network, @Nullable NetworkCapabilities networkCapabilities) {
            if (d(networkCapabilities)) {
                e.this.T0(networkCapabilities);
                u0.a aVarG0 = e.this.g0();
                m1 m1VarA = e.this.f304301f.a();
                try {
                    Iterator it = e.this.f304300e.iterator();
                    while (it.hasNext()) {
                        ((u0.b) it.next()).h(aVarG0);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            e.this.f304304i = network;
            if (e.this.f304306k.getAndSet(true)) {
                return;
            }
            m1 m1VarA = e.f304291n.a();
            try {
                Iterator it = e.f304292o.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            if (network.equals(e.this.f304304i)) {
                e(network, networkCapabilities);
                m1 m1VarA = e.f304291n.a();
                try {
                    Iterator it = e.f304292o.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            if (network.equals(e.this.f304304i)) {
                a();
                m1 m1VarA = e.f304291n.a();
                try {
                    Iterator it = e.f304292o.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        @w0(26)
        public void onUnavailable() {
            a();
            m1 m1VarA = e.f304291n.a();
            try {
                Iterator it = e.f304292o.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
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

    static {
        int i10 = 1 | 2;
    }

    @e.a({"InlinedApi"})
    public e(@NotNull Context context, @NotNull n8 n8Var, @NotNull io.sentry.android.core.u0 u0Var, @NotNull io.sentry.transport.p pVar) {
        this.f304296a = a1.g(context);
        this.f304297b = n8Var;
        this.f304298c = u0Var;
        this.f304299d = pVar;
        int[] iArr = f304294t;
        iArr[0] = 12;
        if (u0Var.d() >= 23) {
            iArr[1] = 16;
        }
        O0(new Runnable() { // from class: io.sentry.android.core.internal.util.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f304271a.X();
            }
        });
        s0.g().d(this);
    }

    @e.a({"InlinedApi"})
    private boolean B0(@Nullable NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (this.f304298c.d() >= 23) {
            zHasCapability = zHasCapability && networkCapabilities.hasCapability(16);
        }
        if (!zHasCapability) {
            return false;
        }
        for (int i10 : f304293s) {
            if (networkCapabilities.hasTransport(i10)) {
                return true;
            }
        }
        return false;
    }

    @e.a({"MissingPermission", "NewApi"})
    static boolean H0(@NotNull Context context, @NotNull ILogger iLogger, @NotNull io.sentry.android.core.u0 u0Var, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        if (u0Var.d() < 24) {
            iLogger.c(y7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerR0 = r0(context, iLogger);
        if (connectivityManagerR0 == null) {
            return false;
        }
        if (!r.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(y7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerR0.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th2) {
            iLogger.a(y7.WARNING, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    public static void M0(@NotNull ConnectivityManager.NetworkCallback networkCallback) {
        m1 m1VarA = f304291n.a();
        try {
            f304292o.remove(networkCallback);
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

    private void O0(@NotNull Runnable runnable) {
        try {
            this.f304297b.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            this.f304297b.getLogger().a(y7.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    @e.a({"NewApi"})
    static void Q0(@NotNull Context context, @NotNull ILogger iLogger, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerR0 = r0(context, iLogger);
        if (connectivityManagerR0 == null) {
            return;
        }
        try {
            connectivityManagerR0.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th2) {
            iLogger.a(y7.WARNING, "unregisterNetworkCallback failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(boolean z10) {
        m1 m1VarA = this.f304301f.a();
        if (z10) {
            try {
                this.f304300e.clear();
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
        ConnectivityManager.NetworkCallback networkCallback = this.f304302g;
        this.f304302g = null;
        if (networkCallback != null) {
            Q0(this.f304296a, this.f304297b.getLogger(), networkCallback);
        }
        this.f304303h = null;
        this.f304304i = null;
        this.f304305j = 0L;
        if (m1VarA != null) {
            m1VarA.close();
        }
        this.f304297b.getLogger().c(y7.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public static boolean T(@NotNull Context context, @NotNull ILogger iLogger, @NotNull io.sentry.android.core.u0 u0Var, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        if (u0Var.d() < 24) {
            iLogger.c(y7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!r.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(y7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        m1 m1VarA = f304291n.a();
        try {
            f304292o.add(networkCallback);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return true;
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

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"NewApi", "MissingPermission"})
    public void T0(@Nullable NetworkCapabilities networkCapabilities) {
        m1 m1VarA = this.f304301f.a();
        try {
            if (networkCapabilities != null) {
                this.f304303h = networkCapabilities;
            } else {
                if (!r.a(this.f304296a, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.f304297b.getLogger().c(y7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f304303h = null;
                    this.f304305j = this.f304299d.a();
                    if (m1VarA != null) {
                        m1VarA.close();
                        return;
                    }
                    return;
                }
                if (this.f304298c.d() < 23) {
                    this.f304303h = null;
                    this.f304305j = this.f304299d.a();
                    if (m1VarA != null) {
                        m1VarA.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager connectivityManagerR0 = r0(this.f304296a, this.f304297b.getLogger());
                if (connectivityManagerR0 != null) {
                    Network activeNetwork = connectivityManagerR0.getActiveNetwork();
                    this.f304303h = activeNetwork != null ? connectivityManagerR0.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f304303h = null;
                }
            }
            this.f304305j = this.f304299d.a();
            this.f304297b.getLogger().c(y7.DEBUG, "Cache updated - Status: " + g0() + ", Type: " + o0(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f304297b.getLogger().a(y7.WARNING, "Failed to update connection status cache", th2);
                this.f304303h = null;
                this.f304305j = this.f304299d.a();
            } catch (Throwable th3) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (m1VarA != null) {
            m1VarA.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        if (a1.t() && this.f304302g == null) {
            m1 m1VarA = this.f304301f.a();
            try {
                if (this.f304302g != null) {
                    if (m1VarA != null) {
                        m1VarA.close();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                if (H0(this.f304296a, this.f304297b.getLogger(), this.f304298c, aVar)) {
                    this.f304302g = aVar;
                    this.f304297b.getLogger().c(y7.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f304297b.getLogger().c(y7.WARNING, "Failed to register network callback", new Object[0]);
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

    @lm.n
    @NotNull
    public static List<ConnectivityManager.NetworkCallback> d0() {
        return f304292o;
    }

    public static /* synthetic */ void e(e eVar) {
        eVar.R0(true);
        m1 m1VarA = f304291n.a();
        try {
            f304292o.clear();
            if (m1VarA != null) {
                m1VarA.close();
            }
            m1 m1VarA2 = f304289l.a();
            try {
                f304290m = null;
                if (m1VarA2 != null) {
                    m1VarA2.close();
                }
                s0.g().m(eVar);
            } catch (Throwable th2) {
                if (m1VarA2 != null) {
                    try {
                        m1VarA2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public static /* synthetic */ void f(e eVar) {
        eVar.T0(null);
        u0.a aVarG0 = eVar.g0();
        if (aVarG0 == u0.a.DISCONNECTED) {
            eVar.f304306k.set(false);
            m1 m1VarA = f304291n.a();
            try {
                Iterator<ConnectivityManager.NetworkCallback> it = f304292o.iterator();
                while (it.hasNext()) {
                    it.next().onLost(null);
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
        m1 m1VarA2 = eVar.f304301f.a();
        try {
            Iterator<u0.b> it2 = eVar.f304300e.iterator();
            while (it2.hasNext()) {
                it2.next().h(aVarG0);
            }
            if (m1VarA2 != null) {
                m1VarA2.close();
            }
            eVar.X();
        } catch (Throwable th4) {
            if (m1VarA2 != null) {
                try {
                    m1VarA2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @NotNull
    private static u0.a f0(@NotNull Context context, @NotNull ConnectivityManager connectivityManager, @NotNull ILogger iLogger) {
        if (!r.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(y7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return u0.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? u0.a.CONNECTED : u0.a.DISCONNECTED;
            }
            iLogger.c(y7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return u0.a.DISCONNECTED;
        } catch (Throwable th2) {
            iLogger.a(y7.WARNING, "Could not retrieve Connection Status", th2);
            return u0.a.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public u0.a g0() {
        if (this.f304303h != null) {
            return B0(this.f304303h) ? u0.a.CONNECTED : u0.a.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerR0 = r0(this.f304296a, this.f304297b.getLogger());
        return connectivityManagerR0 != null ? f0(this.f304296a, connectivityManagerR0, this.f304297b.getLogger()) : u0.a.UNKNOWN;
    }

    @e.a({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    @Nullable
    public static String j0(@NotNull Context context, @NotNull ILogger iLogger, @NotNull io.sentry.android.core.u0 u0Var) {
        ConnectivityManager connectivityManagerR0 = r0(context, iLogger);
        if (connectivityManagerR0 == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!r.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(y7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (u0Var.d() >= 23) {
                Network activeNetwork = connectivityManagerR0.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(y7.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerR0.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(y7.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerR0.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(y7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport = false;
                } else if (type != 1) {
                    if (type == 9) {
                        zHasTransport = true;
                    }
                    zHasTransport2 = zHasTransport;
                } else {
                    zHasTransport = true;
                    zHasTransport2 = false;
                }
            }
            if (zHasTransport) {
                return "ethernet";
            }
            if (zHasTransport) {
                return com.segment.analytics.kotlin.android.plugins.a.f266549p2;
            }
            if (zHasTransport2) {
                return com.segment.analytics.kotlin.android.plugins.a.H1;
            }
            return null;
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Failed to retrieve network info", th2);
        }
    }

    @Nullable
    public static String k0(@NotNull NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return com.segment.analytics.kotlin.android.plugins.a.f266549p2;
        }
        if (networkCapabilities.hasTransport(0)) {
            return com.segment.analytics.kotlin.android.plugins.a.H1;
        }
        return null;
    }

    @Nullable
    private String o0() {
        NetworkCapabilities networkCapabilities = this.f304303h;
        return networkCapabilities != null ? k0(networkCapabilities) : j0(this.f304296a, this.f304297b.getLogger(), this.f304298c);
    }

    @Nullable
    private static ConnectivityManager r0(@NotNull Context context, @NotNull ILogger iLogger) {
        if (f304290m != null) {
            return f304290m;
        }
        m1 m1VarA = f304289l.a();
        try {
            if (f304290m != null) {
                ConnectivityManager connectivityManager = f304290m;
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return connectivityManager;
            }
            f304290m = (ConnectivityManager) context.getSystemService("connectivity");
            if (f304290m == null) {
                iLogger.c(y7.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f304290m;
            if (m1VarA != null) {
                m1VarA.close();
            }
            return connectivityManager2;
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

    private boolean y0() {
        return this.f304299d.a() - this.f304305j < f304295v;
    }

    @Override // io.sentry.u0
    @NotNull
    public u0.a L3() {
        if (!y0()) {
            T0(null);
        }
        return g0();
    }

    @Override // io.sentry.u0
    public boolean Pd(@NotNull u0.b bVar) {
        m1 m1VarA = this.f304301f.a();
        try {
            this.f304300e.add(bVar);
            if (m1VarA != null) {
                m1VarA.close();
            }
            X();
            return this.f304302g != null;
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

    @Override // io.sentry.u0
    public void T7(@NotNull u0.b bVar) {
        m1 m1VarA = this.f304301f.a();
        try {
            this.f304300e.remove(bVar);
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

    @lm.n
    @Nullable
    public NetworkCapabilities Y() {
        return this.f304303h;
    }

    @Override // io.sentry.android.core.s0.a
    public void a() {
        if (this.f304302g != null) {
            return;
        }
        O0(new Runnable() { // from class: io.sentry.android.core.internal.util.d
            @Override // java.lang.Runnable
            public final void run() {
                e.f(this.f304288a);
            }
        });
    }

    @Override // io.sentry.android.core.s0.a
    public void b() {
        if (this.f304302g == null) {
            return;
        }
        O0(new Runnable() { // from class: io.sentry.android.core.internal.util.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f304268a.R0(false);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        O0(new Runnable() { // from class: io.sentry.android.core.internal.util.c
            @Override // java.lang.Runnable
            public final void run() {
                e.e(this.f304287a);
            }
        });
    }

    @Override // io.sentry.u0
    @Nullable
    public String k2() {
        if (!y0()) {
            T0(null);
        }
        return o0();
    }

    @lm.n
    @Nullable
    public ConnectivityManager.NetworkCallback w0() {
        return this.f304302g;
    }

    @lm.n
    @NotNull
    public List<u0.b> x0() {
        return this.f304300e;
    }
}
