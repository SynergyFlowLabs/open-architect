package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes3.dex */
final class b6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63508e = "WakeLockManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63509f = "ExoPlayer:WakeLockManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f63510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.u f63511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63513d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f63514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private PowerManager.WakeLock f63515b;

        public a(Context context) {
            this.f63514a = context;
        }

        @e.a({"WakelockTimeout"})
        public void a(boolean z10, boolean z11) {
            if (z10 && this.f63515b == null) {
                PowerManager powerManager = (PowerManager) this.f63514a.getSystemService("power");
                if (powerManager == null) {
                    androidx.media3.common.util.z.n(b6.f63508e, "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, b6.f63509f);
                    this.f63515b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f63515b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public b6(Context context, Looper looper, androidx.media3.common.util.j jVar) {
        this.f63510a = new a(context.getApplicationContext());
        this.f63511b = jVar.d(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f63512c == z10) {
            return;
        }
        this.f63512c = z10;
        final boolean z11 = this.f63513d;
        this.f63511b.g(new Runnable() { // from class: androidx.media3.exoplayer.a6
            @Override // java.lang.Runnable
            public final void run() {
                this.f62790a.f63510a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f63513d == z10) {
            return;
        }
        this.f63513d = z10;
        if (this.f63512c) {
            this.f63511b.g(new Runnable() { // from class: androidx.media3.exoplayer.z5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66983a.f63510a.a(true, z10);
                }
            });
        }
    }
}
