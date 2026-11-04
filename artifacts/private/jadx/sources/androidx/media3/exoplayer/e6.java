package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class e6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63772e = "WifiLockManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63773f = "ExoPlayer:WifiLockManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f63774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.u f63775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63777d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f63778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private WifiManager.WifiLock f63779b;

        public a(Context context) {
            this.f63778a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f63779b == null) {
                WifiManager wifiManager = (WifiManager) this.f63778a.getApplicationContext().getSystemService(com.segment.analytics.kotlin.android.plugins.a.f266549p2);
                if (wifiManager == null) {
                    androidx.media3.common.util.z.n(e6.f63772e, "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, e6.f63773f);
                    this.f63779b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f63779b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public e6(Context context, Looper looper, androidx.media3.common.util.j jVar) {
        this.f63774a = new a(context.getApplicationContext());
        this.f63775b = jVar.d(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f63776c == z10) {
            return;
        }
        this.f63776c = z10;
        final boolean z11 = this.f63777d;
        this.f63775b.g(new Runnable() { // from class: androidx.media3.exoplayer.c6
            @Override // java.lang.Runnable
            public final void run() {
                this.f63545a.f63774a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f63777d != z10) {
            this.f63777d = z10;
            if (this.f63776c) {
                this.f63775b.g(new Runnable() { // from class: androidx.media3.exoplayer.d6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63566a.f63774a.a(true, z10);
                    }
                });
            }
        }
    }
}
