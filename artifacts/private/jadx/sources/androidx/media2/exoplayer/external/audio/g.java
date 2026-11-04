package androidx.media2.exoplayer.external.audio;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f53364j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f53365k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f53366l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f53367m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f53368n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f53369o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f53370p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f53371q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f53372r = "AudioFocusManager";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f53373s = 0.2f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f53374t = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f53375a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f53377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.audio.c f53378d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53380f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f53382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53383i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f53381g = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f53376b = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53379e = 0;

    private class b implements AudioManager.OnAudioFocusChangeListener {
        private b() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
            if (focusChange != -3) {
                int i10 = 7 ^ (-2);
                if (focusChange == -2) {
                    g.this.f53379e = 2;
                } else if (focusChange == -1) {
                    g.this.f53379e = -1;
                } else {
                    if (focusChange != 1) {
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append("Unknown focus change type: ");
                        sb2.append(focusChange);
                        androidx.media2.exoplayer.external.util.p.l(g.f53372r, sb2.toString());
                        return;
                    }
                    g.this.f53379e = 1;
                }
            } else if (g.this.w()) {
                g.this.f53379e = 2;
            } else {
                g.this.f53379e = 3;
            }
            int i11 = g.this.f53379e;
            if (i11 == -1) {
                g.this.f53377c.h(-1);
                g.this.b(true);
            } else if (i11 != 0) {
                if (i11 == 1) {
                    g.this.f53377c.h(1);
                } else if (i11 == 2) {
                    g.this.f53377c.h(0);
                } else if (i11 != 3) {
                    int i12 = g.this.f53379e;
                    StringBuilder sb3 = new StringBuilder(38);
                    sb3.append("Unknown audio focus state: ");
                    sb3.append(i12);
                    throw new IllegalStateException(sb3.toString());
                }
            }
            float f10 = g.this.f53379e == 3 ? 0.2f : 1.0f;
            if (g.this.f53381g != f10) {
                g.this.f53381g = f10;
                g.this.f53377c.g(f10);
            }
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface c {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public interface e {
        void g(float volumeMultiplier);

        void h(int playerCommand);
    }

    public g(Context context, e playerControl) {
        this.f53375a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f53377c = playerControl;
    }

    private void a() {
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean forceAbandon) {
        int i10 = this.f53380f;
        if (i10 == 0 && this.f53379e == 0) {
            return;
        }
        if (i10 != 1 || this.f53379e == -1 || forceAbandon) {
            if (q0.f57626a >= 26) {
                d();
            } else {
                c();
            }
            this.f53379e = 0;
        }
    }

    private void c() {
        this.f53375a.abandonAudioFocus(this.f53376b);
    }

    @w0(26)
    private void d() {
        AudioFocusRequest audioFocusRequest = this.f53382h;
        if (audioFocusRequest != null) {
            this.f53375a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int l(@p0 androidx.media2.exoplayer.external.audio.c audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        int i10 = audioAttributes.f53276c;
        switch (i10) {
            case 0:
                androidx.media2.exoplayer.external.util.p.l(f53372r, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (audioAttributes.f53274a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unidentified audio usage: ");
                sb2.append(i10);
                androidx.media2.exoplayer.external.util.p.l(f53372r, sb2.toString());
                return 0;
            case 16:
                if (q0.f57626a < 19) {
                    return 2;
                }
                int i11 = 7 & 4;
                return 4;
        }
        return 3;
    }

    private int o(boolean playWhenReady) {
        return playWhenReady ? 1 : -1;
    }

    private int s() {
        if (this.f53380f == 0) {
            if (this.f53379e != 0) {
                b(true);
            }
            return 1;
        }
        if (this.f53379e == 0) {
            this.f53379e = (q0.f57626a >= 26 ? u() : t()) == 1 ? 1 : 0;
        }
        int i10 = this.f53379e;
        if (i10 == 0) {
            return -1;
        }
        return i10 == 2 ? 0 : 1;
    }

    private int t() {
        return this.f53375a.requestAudioFocus(this.f53376b, q0.a0(((androidx.media2.exoplayer.external.audio.c) androidx.media2.exoplayer.external.util.a.g(this.f53378d)).f53276c), this.f53380f);
    }

    @w0(26)
    private int u() {
        AudioFocusRequest audioFocusRequest = this.f53382h;
        if (audioFocusRequest == null || this.f53383i) {
            this.f53382h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f53380f) : new AudioFocusRequest.Builder(this.f53382h)).setAudioAttributes(((androidx.media2.exoplayer.external.audio.c) androidx.media2.exoplayer.external.util.a.g(this.f53378d)).a()).setWillPauseWhenDucked(w()).setOnAudioFocusChangeListener(this.f53376b).build();
            this.f53383i = false;
        }
        return this.f53375a.requestAudioFocus(this.f53382h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        androidx.media2.exoplayer.external.audio.c cVar = this.f53378d;
        return cVar != null && cVar.f53274a == 1;
    }

    @l1
    AudioManager.OnAudioFocusChangeListener m() {
        return this.f53376b;
    }

    public float n() {
        return this.f53381g;
    }

    public int p(boolean playWhenReady) {
        if (playWhenReady) {
            return s();
        }
        return -1;
    }

    public int q(boolean playWhenReady, int playerState) {
        if (playWhenReady) {
            return playerState == 1 ? o(playWhenReady) : s();
        }
        a();
        return -1;
    }

    public void r() {
        b(true);
    }

    public int v(@p0 androidx.media2.exoplayer.external.audio.c audioAttributes, boolean playWhenReady, int playerState) {
        if (!q0.b(this.f53378d, audioAttributes)) {
            this.f53378d = audioAttributes;
            int iL = l(audioAttributes);
            this.f53380f = iL;
            androidx.media2.exoplayer.external.util.a.b(iL == 1 || iL == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
            if (playWhenReady && (playerState == 2 || playerState == 3)) {
                return s();
            }
        }
        return playerState == 1 ? o(playWhenReady) : p(playWhenReady);
    }
}
