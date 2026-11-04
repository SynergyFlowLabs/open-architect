package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f63806j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f63807k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f63808l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f63809m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f63810n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f63811o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f63812p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f63813q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f63814r = "AudioFocusManager";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f63815s = 0.2f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f63816t = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.s0<AudioManager> f63817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f63818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private b f63819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.d f63820d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63822f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.common.audio.a f63824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f63825i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f63823g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63821e = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void g(float f10);

        void h(int i10);
    }

    public h(final Context context, Looper looper, b bVar) {
        this.f63817a = com.google.common.base.t0.b(new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.g
            @Override // com.google.common.base.s0
            public final Object get() {
                return androidx.media3.common.audio.d.c(context);
            }
        });
        this.f63819c = bVar;
        this.f63818b = new Handler(looper);
        int i10 = 1 >> 0;
    }

    private void c() {
        int i10 = this.f63821e;
        if (i10 == 1 || i10 == 0 || this.f63824h == null) {
            return;
        }
        androidx.media3.common.audio.d.b(this.f63817a.get(), this.f63824h);
    }

    private static int d(@androidx.annotation.p0 androidx.media3.common.d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.f60480c) {
            case 0:
                androidx.media3.common.util.z.n(f63814r, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (dVar.f60478a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                androidx.media3.common.util.z.n(f63814r, "Unidentified audio usage: " + dVar.f60480c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i10) {
        b bVar = this.f63819c;
        if (bVar != null) {
            bVar.h(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !p()) {
                m(4);
                return;
            }
            e(0);
            m(3);
            return;
        }
        if (i10 == -1) {
            e(-1);
            c();
            m(1);
        } else if (i10 == 1) {
            m(2);
            e(1);
        } else {
            androidx.media3.common.util.z.n(f63814r, "Unknown focus change type: " + i10);
        }
    }

    private int j() {
        if (this.f63821e == 2) {
            return 1;
        }
        if (k() == 1) {
            m(2);
            return 1;
        }
        m(1);
        return -1;
    }

    private int k() {
        androidx.media3.common.audio.a aVar = this.f63824h;
        if (aVar == null || this.f63825i) {
            this.f63824h = (aVar == null ? new androidx.media3.common.audio.a.b(this.f63822f) : aVar.a()).c((androidx.media3.common.d) androidx.media3.common.util.a.g(this.f63820d)).g(p()).f(new f(this), this.f63818b).a();
            this.f63825i = false;
        }
        return androidx.media3.common.audio.d.h(this.f63817a.get(), this.f63824h);
    }

    private void m(int i10) {
        if (this.f63821e == i10) {
            return;
        }
        this.f63821e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f63823g == f10) {
            return;
        }
        this.f63823g = f10;
        b bVar = this.f63819c;
        if (bVar != null) {
            bVar.g(f10);
        }
    }

    private boolean n(int i10) {
        return i10 != 1 && this.f63822f == 1;
    }

    private boolean p() {
        androidx.media3.common.d dVar = this.f63820d;
        return dVar != null && dVar.f60478a == 1;
    }

    @androidx.annotation.l1
    AudioManager.OnAudioFocusChangeListener f() {
        return new f(this);
    }

    public float g() {
        return this.f63823g;
    }

    public void i() {
        this.f63819c = null;
        c();
        m(0);
    }

    public void l(@androidx.annotation.p0 androidx.media3.common.d dVar) {
        if (Objects.equals(this.f63820d, dVar)) {
            return;
        }
        this.f63820d = dVar;
        int iD = d(dVar);
        this.f63822f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        androidx.media3.common.util.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int o(boolean z10, int i10) {
        if (!n(i10)) {
            c();
            m(0);
            return 1;
        }
        if (z10) {
            return j();
        }
        int i11 = this.f63821e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }
}
