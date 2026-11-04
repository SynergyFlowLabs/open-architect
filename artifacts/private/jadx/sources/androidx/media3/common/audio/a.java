package androidx.media3.common.audio;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f60299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f60300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.d f60301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f60302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final Object f60303f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private AudioManager.OnAudioFocusChangeListener f60305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Handler f60306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.common.d f60307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f60308e;

        private static boolean b(int i10) {
            return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }

        public a a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f60305b;
            if (onAudioFocusChangeListener != null) {
                return new a(this.f60304a, onAudioFocusChangeListener, (Handler) androidx.media3.common.util.a.g(this.f60306c), this.f60307d, this.f60308e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @z7.a
        public b c(androidx.media3.common.d dVar) {
            androidx.media3.common.util.a.g(dVar);
            this.f60307d = dVar;
            return this;
        }

        @z7.a
        public b d(int i10) {
            androidx.media3.common.util.a.a(b(i10));
            this.f60304a = i10;
            return this;
        }

        @z7.a
        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        @z7.a
        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            androidx.media3.common.util.a.g(onAudioFocusChangeListener);
            androidx.media3.common.util.a.g(handler);
            this.f60305b = onAudioFocusChangeListener;
            this.f60306c = handler;
            return this;
        }

        @z7.a
        public b g(boolean z10) {
            this.f60308e = z10;
            return this;
        }

        public b(int i10) {
            this.f60307d = androidx.media3.common.d.f60472g;
            this.f60304a = i10;
        }

        private b(a aVar) {
            this.f60304a = aVar.e();
            this.f60305b = aVar.f();
            this.f60306c = aVar.d();
            this.f60307d = aVar.b();
            this.f60308e = aVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f60309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f60310b;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f60310b = onAudioFocusChangeListener;
            this.f60309a = k1.G(handler.getLooper(), null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            k1.O1(this.f60309a, new Runnable() { // from class: androidx.media3.common.audio.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60311a.f60310b.onAudioFocusChange(i10);
                }
            });
        }
    }

    a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, androidx.media3.common.d dVar, boolean z10) {
        this.f60298a = i10;
        this.f60300c = handler;
        this.f60301d = dVar;
        this.f60302e = z10;
        int i11 = k1.f61540a;
        if (i11 < 26) {
            this.f60299b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f60299b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f60303f = new AudioFocusRequest.Builder(i10).setAudioAttributes(dVar.b().f60484a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f60303f = null;
        }
    }

    public b a() {
        return new b();
    }

    public androidx.media3.common.d b() {
        return this.f60301d;
    }

    @w0(26)
    AudioFocusRequest c() {
        return (AudioFocusRequest) androidx.media3.common.util.a.g(this.f60303f);
    }

    public Handler d() {
        return this.f60300c;
    }

    public int e() {
        return this.f60298a;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f60298a == aVar.f60298a && this.f60302e == aVar.f60302e && Objects.equals(this.f60299b, aVar.f60299b) && Objects.equals(this.f60300c, aVar.f60300c) && Objects.equals(this.f60301d, aVar.f60301d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f60299b;
    }

    public boolean g() {
        return this.f60302e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f60298a), this.f60299b, this.f60300c, this.f60301d, Boolean.valueOf(this.f60302e));
    }
}
