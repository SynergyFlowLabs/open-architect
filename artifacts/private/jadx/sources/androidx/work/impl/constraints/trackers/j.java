package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.w0;
import androidx.work.impl.utils.q;
import androidx.work.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@w0(24)
public final class j extends h<androidx.work.impl.constraints.c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ConnectivityManager f76805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final a f76806g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities capabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            v.e().a(k.f76808a, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.h(k.c(jVar.f76805f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            v.e().a(k.f76808a, "Network connection lost");
            j jVar = j.this;
            jVar.h(k.c(jVar.f76805f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f76805f = (ConnectivityManager) systemService;
        this.f76806g = new a();
    }

    @Override // androidx.work.impl.constraints.trackers.h
    public void i() {
        try {
            v.e().a(k.f76808a, "Registering network callback");
            q.a(this.f76805f, this.f76806g);
        } catch (IllegalArgumentException e10) {
            v.e().d(k.f76808a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            v.e().d(k.f76808a, "Received exception while registering network callback", e11);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.h
    public void j() {
        try {
            v.e().a(k.f76808a, "Unregistering network callback");
            androidx.work.impl.utils.o.c(this.f76805f, this.f76806g);
        } catch (IllegalArgumentException e10) {
            v.e().d(k.f76808a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            v.e().d(k.f76808a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.h
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.work.impl.constraints.c f() {
        return k.c(this.f76805f);
    }
}
