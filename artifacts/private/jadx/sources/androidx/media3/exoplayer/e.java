package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f63762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.u f63763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63764d;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f63765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.common.util.u f63766b;

        public a(androidx.media3.common.util.u uVar, b bVar) {
            this.f63766b = uVar;
            this.f63765a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (e.this.f63764d) {
                this.f63765a.j();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f63766b.g(new Runnable() { // from class: androidx.media3.exoplayer.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63548a.b();
                    }
                });
            }
        }
    }

    public interface b {
        void j();
    }

    public e(Context context, Looper looper, Looper looper2, b bVar, androidx.media3.common.util.j jVar) {
        this.f63761a = context.getApplicationContext();
        this.f63763c = jVar.d(looper, null);
        this.f63762b = new a(jVar.d(looper2, null), bVar);
    }

    @e.a({"UnprotectedReceiver"})
    public void d(boolean z10) {
        if (z10 == this.f63764d) {
            return;
        }
        if (z10) {
            this.f63763c.g(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.f63502a;
                    eVar.f63761a.registerReceiver(eVar.f63762b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f63764d = true;
        } else {
            this.f63763c.g(new Runnable() { // from class: androidx.media3.exoplayer.c
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.f63516a;
                    eVar.f63761a.unregisterReceiver(eVar.f63762b);
                }
            });
            this.f63764d = false;
        }
    }
}
