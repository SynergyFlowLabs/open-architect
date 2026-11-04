package com.planner5d.library.services.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nNetworkWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkWatcher.kt\ncom/planner5d/library/services/network/NetworkWatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1863#2,2:110\n*S KotlinDebug\n*F\n+ 1 NetworkWatcher.kt\ncom/planner5d/library/services/network/NetworkWatcher\n*L\n103#1:110,2\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f224451h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f224452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConnectivityManager f224453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f224454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f224455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f224456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Function0<Unit>> f224457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f224458g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @l(message = "Avoid in future, instead use NetworkWatcher.create or NetworkWatcher.networkWatcherProviderProvider")
        @NotNull
        public final BroadcastReceiver a(@NotNull Context context, @NotNull BroadcastReceiver receiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            androidx.core.content.d.w(context, receiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
            return receiver;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.network.b$b, reason: collision with other inner class name */
    public static final class C1675b extends ConnectivityManager.NetworkCallback {
        C1675b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(b bVar) {
            bVar.e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            b.this.f224455d = true;
            Handler handler = b.this.f224454c;
            final b bVar = b.this;
            handler.post(new Runnable() { // from class: com.planner5d.library.services.network.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C1675b.b(bVar);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            b.this.f224455d = false;
        }
    }

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f224453b = (ConnectivityManager) systemService;
        this.f224454c = new Handler(Looper.getMainLooper());
        this.f224457f = new ArrayList();
        this.f224458g = g0.c(new Function0() { // from class: com.planner5d.library.services.network.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.i(this.f224450a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l0
    public final void e() {
        ArrayList arrayList = new ArrayList();
        Iterator<Function0<Unit>> it = this.f224457f.iterator();
        while (it.hasNext() && this.f224455d && this.f224456e && this.f224452a) {
            arrayList.add(it.next());
            it.remove();
        }
        if (this.f224457f.isEmpty()) {
            m();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }

    private final C1675b g() {
        return (C1675b) this.f224458g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1675b i(b bVar) {
        return bVar.new C1675b();
    }

    @n
    @l(message = "Avoid in future, instead use NetworkWatcher.create or NetworkWatcher.networkWatcherProviderProvider")
    @NotNull
    public static final BroadcastReceiver k(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver) {
        return f224451h.a(context, broadcastReceiver);
    }

    @l0
    public final void f(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f224457f.add(action);
        j();
    }

    public final boolean h() {
        return this.f224452a;
    }

    @l0
    public final void j() {
        if (!this.f224456e && !this.f224457f.isEmpty()) {
            this.f224456e = true;
            this.f224453b.registerDefaultNetworkCallback(g());
        }
        e();
    }

    public final void l(boolean z10) {
        this.f224452a = z10;
    }

    @l0
    public final void m() {
        if (this.f224456e) {
            this.f224456e = false;
            this.f224453b.unregisterNetworkCallback(g());
            this.f224455d = false;
        }
        this.f224457f.clear();
    }
}
