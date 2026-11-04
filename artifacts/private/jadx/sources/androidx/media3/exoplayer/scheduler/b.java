package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f64728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f64729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Requirements f64730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f64731d = k1.J();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private C0589b f64732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f64733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private d f64734g;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.scheduler.b$b, reason: collision with other inner class name */
    private class C0589b extends BroadcastReceiver {
        private C0589b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b.this.e();
        }
    }

    public interface c {
        void a(b bVar, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @w0(24)
    final class d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f64736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64737b;

        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (b.this.f64734g != null) {
                b.this.g();
            }
        }

        public static /* synthetic */ void b(d dVar) {
            if (b.this.f64734g != null) {
                b.this.e();
            }
        }

        private void c() {
            b.this.f64731d.post(new Runnable() { // from class: androidx.media3.exoplayer.scheduler.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.b(this.f64739a);
                }
            });
        }

        private void d() {
            b.this.f64731d.post(new Runnable() { // from class: androidx.media3.exoplayer.scheduler.d
                @Override // java.lang.Runnable
                public final void run() {
                    b.d.a(this.f64740a);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            if (!z10) {
                d();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f64736a && this.f64737b == zHasCapability) {
                if (zHasCapability) {
                    d();
                    return;
                }
                return;
            }
            this.f64736a = true;
            this.f64737b = zHasCapability;
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            c();
        }
    }

    public b(Context context, c cVar, Requirements requirements) {
        this.f64728a = context.getApplicationContext();
        this.f64729b = cVar;
        this.f64730c = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int iE = this.f64730c.e(this.f64728a);
        if (this.f64733f != iE) {
            this.f64733f = iE;
            this.f64729b.a(this, iE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if ((this.f64733f & 3) == 0) {
            return;
        }
        e();
    }

    @w0(24)
    private void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.media3.common.util.a.g((ConnectivityManager) this.f64728a.getSystemService("connectivity"));
        d dVar = new d();
        this.f64734g = dVar;
        connectivityManager.registerDefaultNetworkCallback(dVar);
    }

    @w0(24)
    private void k() {
        ((ConnectivityManager) androidx.media3.common.util.a.g((ConnectivityManager) this.f64728a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) androidx.media3.common.util.a.g(this.f64734g));
        this.f64734g = null;
    }

    public Requirements f() {
        return this.f64730c;
    }

    public int i() {
        this.f64733f = this.f64730c.e(this.f64728a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f64730c.l()) {
            if (k1.f61540a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f64730c.g()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f64730c.j()) {
            if (k1.f61540a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f64730c.n()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        C0589b c0589b = new C0589b();
        this.f64732e = c0589b;
        this.f64728a.registerReceiver(c0589b, intentFilter, null, this.f64731d);
        return this.f64733f;
    }

    public void j() {
        this.f64728a.unregisterReceiver((BroadcastReceiver) androidx.media3.common.util.a.g(this.f64732e));
        this.f64732e = null;
        if (k1.f61540a < 24 || this.f64734g == null) {
            return;
        }
        k();
    }
}
