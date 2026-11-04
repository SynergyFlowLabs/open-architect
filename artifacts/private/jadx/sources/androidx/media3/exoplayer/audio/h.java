package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f63200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f63201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final c f63202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f63203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final d f63204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.audio.e f63205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private i f63206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.media3.common.d f63207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f63208j;

    @androidx.annotation.w0(23)
    private static final class b {
        private b() {
        }

        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            androidx.media3.common.audio.d.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            androidx.media3.common.audio.d.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    @androidx.annotation.w0(23)
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            h hVar = h.this;
            hVar.f(androidx.media3.exoplayer.audio.e.h(hVar.f63199a, h.this.f63207i, h.this.f63206h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (k1.z(audioDeviceInfoArr, h.this.f63206h)) {
                h.this.f63206h = null;
            }
            h hVar = h.this;
            hVar.f(androidx.media3.exoplayer.audio.e.h(hVar.f63199a, h.this.f63207i, h.this.f63206h));
        }
    }

    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f63210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f63211b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f63210a = contentResolver;
            this.f63211b = uri;
        }

        public void a() {
            this.f63210a.registerContentObserver(this.f63211b, false, this);
        }

        public void b() {
            this.f63210a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            h hVar = h.this;
            hVar.f(androidx.media3.exoplayer.audio.e.h(hVar.f63199a, h.this.f63207i, h.this.f63206h));
        }
    }

    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            h hVar = h.this;
            hVar.f(androidx.media3.exoplayer.audio.e.g(context, intent, hVar.f63207i, h.this.f63206h));
        }
    }

    public interface f {
        void a(androidx.media3.exoplayer.audio.e eVar);
    }

    @Deprecated
    public h(Context context, f fVar) {
        this(context, fVar, androidx.media3.common.d.f60472g, (AudioDeviceInfo) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(androidx.media3.exoplayer.audio.e eVar) {
        if (this.f63208j && !eVar.equals(this.f63205g)) {
            this.f63205g = eVar;
            this.f63200b.a(eVar);
        }
    }

    public androidx.media3.exoplayer.audio.e g() {
        c cVar;
        if (this.f63208j) {
            return (androidx.media3.exoplayer.audio.e) androidx.media3.common.util.a.g(this.f63205g);
        }
        this.f63208j = true;
        d dVar = this.f63204f;
        if (dVar != null) {
            dVar.a();
        }
        if (k1.f61540a >= 23 && (cVar = this.f63202d) != null) {
            b.a(this.f63199a, cVar, this.f63201c);
        }
        androidx.media3.exoplayer.audio.e eVarG = androidx.media3.exoplayer.audio.e.g(this.f63199a, this.f63199a.registerReceiver(this.f63203e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f63201c), this.f63207i, this.f63206h);
        this.f63205g = eVarG;
        return eVarG;
    }

    public void h(androidx.media3.common.d dVar) {
        this.f63207i = dVar;
        f(androidx.media3.exoplayer.audio.e.h(this.f63199a, dVar, this.f63206h));
    }

    @androidx.annotation.w0(23)
    public void i(@androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo) {
        i iVar = this.f63206h;
        if (Objects.equals(audioDeviceInfo, iVar == null ? null : iVar.f63215a)) {
            return;
        }
        i iVar2 = audioDeviceInfo != null ? new i(audioDeviceInfo) : null;
        this.f63206h = iVar2;
        f(androidx.media3.exoplayer.audio.e.h(this.f63199a, this.f63207i, iVar2));
    }

    public void j() {
        c cVar;
        if (this.f63208j) {
            this.f63205g = null;
            if (k1.f61540a >= 23 && (cVar = this.f63202d) != null) {
                b.b(this.f63199a, cVar);
            }
            this.f63199a.unregisterReceiver(this.f63203e);
            d dVar = this.f63204f;
            if (dVar != null) {
                dVar.b();
            }
            this.f63208j = false;
        }
    }

    public h(Context context, f fVar, androidx.media3.common.d dVar, @androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo) {
        this(context, fVar, dVar, (k1.f61540a < 23 || audioDeviceInfo == null) ? null : new i(audioDeviceInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    h(Context context, f fVar, androidx.media3.common.d dVar, @androidx.annotation.p0 i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f63199a = applicationContext;
        this.f63200b = (f) androidx.media3.common.util.a.g(fVar);
        this.f63207i = dVar;
        this.f63206h = iVar;
        Handler handlerJ = k1.J();
        this.f63201c = handlerJ;
        Object[] objArr = 0;
        this.f63202d = k1.f61540a >= 23 ? new c() : null;
        this.f63203e = new e();
        Uri uriL = androidx.media3.exoplayer.audio.e.l();
        this.f63204f = uriL != null ? new d(handlerJ, applicationContext.getContentResolver(), uriL) : null;
    }
}
