package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.util.o;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final AudioAttributesCompat f52717g = new AudioAttributesCompat.d().e(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f52719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f52720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioAttributesCompat f52721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f52722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f52723f;

    /* JADX INFO: renamed from: androidx.media.a$a, reason: collision with other inner class name */
    @w0(26)
    private static class C0490a {
        private C0490a() {
        }

        @u
        static AudioFocusRequest a(int focusGain, AudioAttributes audioAttributes, boolean pauseOnDuck, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler focusChangeHandler) {
            return new AudioFocusRequest.Builder(focusGain).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(pauseOnDuck).setOnAudioFocusChangeListener(onAudioFocusChangeListener, focusChangeHandler).build();
        }
    }

    private static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f52729c = 2782386;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f52730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f52731b;

        c(@NonNull AudioManager.OnAudioFocusChangeListener listener, @NonNull Handler handler) {
            this.f52731b = listener;
            this.f52730a = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != f52729c) {
                return false;
            }
            this.f52731b.onAudioFocusChange(message.arg1);
            return true;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int focusChange) {
            Handler handler = this.f52730a;
            handler.sendMessage(Message.obtain(handler, f52729c, focusChange, 0));
        }
    }

    a(int focusGain, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler focusChangeHandler, AudioAttributesCompat audioFocusRequestCompat, boolean pauseOnDuck) {
        this.f52718a = focusGain;
        this.f52720c = focusChangeHandler;
        this.f52721d = audioFocusRequestCompat;
        this.f52722e = pauseOnDuck;
        this.f52719b = onAudioFocusChangeListener;
        this.f52723f = C0490a.a(focusGain, a(), pauseOnDuck, onAudioFocusChangeListener, focusChangeHandler);
    }

    @w0(21)
    AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f52721d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.g();
        }
        return null;
    }

    @NonNull
    public AudioAttributesCompat b() {
        return this.f52721d;
    }

    @w0(26)
    AudioFocusRequest c() {
        return (AudioFocusRequest) this.f52723f;
    }

    @NonNull
    public Handler d() {
        return this.f52720c;
    }

    public int e() {
        return this.f52718a;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof a)) {
            return false;
        }
        a aVar = (a) o10;
        return this.f52718a == aVar.f52718a && this.f52722e == aVar.f52722e && o.a(this.f52719b, aVar.f52719b) && o.a(this.f52720c, aVar.f52720c) && o.a(this.f52721d, aVar.f52721d);
    }

    @NonNull
    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f52719b;
    }

    public boolean g() {
        return this.f52722e;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f52718a), this.f52719b, this.f52720c, this.f52721d, Boolean.valueOf(this.f52722e));
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f52725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f52726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AudioAttributesCompat f52727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f52728e;

        public b(int focusGain) {
            this.f52727d = a.f52717g;
            d(focusGain);
        }

        private static boolean b(int focusGain) {
            return focusGain == 1 || focusGain == 2 || focusGain == 3 || focusGain == 4;
        }

        public a a() {
            if (this.f52725b != null) {
                return new a(this.f52724a, this.f52725b, this.f52726c, this.f52727d, this.f52728e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @NonNull
        public b c(@NonNull AudioAttributesCompat attributes) {
            if (attributes == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.f52727d = attributes;
            return this;
        }

        @NonNull
        public b d(int focusGain) {
            if (b(focusGain)) {
                this.f52724a = focusGain;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + focusGain);
        }

        @NonNull
        public b e(@NonNull AudioManager.OnAudioFocusChangeListener listener) {
            return f(listener, new Handler(Looper.getMainLooper()));
        }

        @NonNull
        public b f(@NonNull AudioManager.OnAudioFocusChangeListener listener, @NonNull Handler handler) {
            if (listener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f52725b = listener;
            this.f52726c = handler;
            return this;
        }

        @NonNull
        public b g(boolean pauseOnDuck) {
            this.f52728e = pauseOnDuck;
            return this;
        }

        public b(@NonNull a requestToCopy) {
            this.f52727d = a.f52717g;
            if (requestToCopy == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
            }
            this.f52724a = requestToCopy.e();
            this.f52725b = requestToCopy.f();
            this.f52726c = requestToCopy.d();
            this.f52727d = requestToCopy.b();
            this.f52728e = requestToCopy.g();
        }
    }
}
