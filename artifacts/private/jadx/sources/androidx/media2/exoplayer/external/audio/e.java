package androidx.media2.exoplayer.external.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f53303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f53304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f53305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final BroadcastReceiver f53306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final b f53307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    androidx.media2.exoplayer.external.audio.d f53308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53309g;

    private final class b extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f53310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f53311b;

        public b(Handler handler, ContentResolver resolver, Uri settingUri) {
            super(handler);
            this.f53310a = resolver;
            this.f53311b = settingUri;
        }

        public void a() {
            this.f53310a.registerContentObserver(this.f53311b, false, this);
        }

        public void b() {
            this.f53310a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            e eVar = e.this;
            eVar.c(androidx.media2.exoplayer.external.audio.d.b(eVar.f53303a));
        }
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            e.this.c(androidx.media2.exoplayer.external.audio.d.c(context, intent));
        }
    }

    public interface d {
        void a(androidx.media2.exoplayer.external.audio.d audioCapabilities);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f53303a = applicationContext;
        this.f53304b = (d) androidx.media2.exoplayer.external.util.a.g(dVar);
        Handler handler = new Handler(q0.Q());
        this.f53305c = handler;
        this.f53306d = q0.f57626a >= 21 ? new c() : null;
        Uri uriD = androidx.media2.exoplayer.external.audio.d.d();
        this.f53307e = uriD != null ? new b(handler, applicationContext.getContentResolver(), uriD) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(androidx.media2.exoplayer.external.audio.d newAudioCapabilities) {
        if (!this.f53309g || newAudioCapabilities.equals(this.f53308f)) {
            return;
        }
        this.f53308f = newAudioCapabilities;
        this.f53304b.a(newAudioCapabilities);
    }

    public androidx.media2.exoplayer.external.audio.d d() {
        if (this.f53309g) {
            return (androidx.media2.exoplayer.external.audio.d) androidx.media2.exoplayer.external.util.a.g(this.f53308f);
        }
        this.f53309g = true;
        b bVar = this.f53307e;
        if (bVar != null) {
            bVar.a();
        }
        Intent intentRegisterReceiver = null;
        if (this.f53306d != null) {
            intentRegisterReceiver = this.f53303a.registerReceiver(this.f53306d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f53305c);
        }
        androidx.media2.exoplayer.external.audio.d dVarC = androidx.media2.exoplayer.external.audio.d.c(this.f53303a, intentRegisterReceiver);
        this.f53308f = dVarC;
        return dVarC;
    }

    public void e() {
        if (this.f53309g) {
            this.f53308f = null;
            BroadcastReceiver broadcastReceiver = this.f53306d;
            if (broadcastReceiver != null) {
                this.f53303a.unregisterReceiver(broadcastReceiver);
            }
            b bVar = this.f53307e;
            if (bVar != null) {
                bVar.b();
            }
            this.f53309g = false;
        }
    }
}
