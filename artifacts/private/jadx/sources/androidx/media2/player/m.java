package androidx.media2.player;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class m {
    public static final int A = 702;
    public static final int B = 703;
    public static final int C = 704;
    public static final int D = 800;
    public static final int E = 801;
    public static final int F = 802;
    public static final int G = 803;
    public static final int H = 804;
    public static final int I = 805;
    public static final int J = 901;
    public static final int K = 902;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 3;
    public static final int O = 4;
    public static final int P = 5;
    public static final int Q = 6;
    public static final int R = 14;
    public static final int S = 15;
    public static final int T = 16;
    public static final int U = 17;
    public static final int V = 18;
    public static final int W = 19;
    public static final int X = 22;
    public static final int Y = 23;
    public static final int Z = 24;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f58351a = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f58352a0 = 26;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58353b = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f58354b0 = 27;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58355c = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f58356c0 = 29;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58357d = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f58358d0 = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58359e = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f58360e0 = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f58361f = 1001;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f58362f0 = 1001;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f58363g = 1002;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f58364g0 = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f58365h = 1003;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f58366h0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f58367i = 1004;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f58368i0 = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f58369j = 1005;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f58370j0 = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f58371k = 1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f58372k0 = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f58373l = -1004;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f58374l0 = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f58375m = -1007;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f58376m0 = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f58377n = -1010;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f58378n0 = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f58379o = -110;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f58380o0 = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f58381p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f58382p0 = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f58383q = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f58384q0 = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f58385r = 2;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f58386r0 = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f58387s = 3;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f58388s0 = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f58389t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f58390u = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f58391v = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f58392w = 7;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f58393x = 100;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f58394y = 700;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f58395z = 701;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    public static abstract class c {
        public void a(m mVar, MediaItem mediaItem, d dVar) {
        }

        public void b(m mVar, MediaItem mediaItem, int i10) {
        }
    }

    public static abstract class d {
        public abstract Map<UUID, byte[]> a();

        public abstract List<UUID> b();
    }

    public static abstract class e {
        public void a(m mVar, MediaItem mediaItem, int i10, int i11) {
        }

        public void b(m mVar, @NonNull Object obj) {
        }

        public void c(m mVar, MediaItem mediaItem, int i10, int i11) {
        }

        public void d(m mVar, MediaItem mediaItem, int i10, int i11) {
        }

        public void e(m mVar, MediaItem mediaItem, n nVar) {
        }

        public void f(@NonNull m mVar, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        }

        public void g(m mVar, MediaItem mediaItem, t tVar) {
        }

        public void h(@NonNull m mVar, @NonNull List<SessionPlayer.TrackInfo> list) {
        }

        public void i(m mVar, MediaItem mediaItem, int i10, int i11) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface h {
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f58396a = "android.media.mediaplayer.video.mime";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f58397b = "android.media.mediaplayer.video.codec";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f58398c = "android.media.mediaplayer.width";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f58399d = "android.media.mediaplayer.height";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f58400e = "android.media.mediaplayer.frames";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f58401f = "android.media.mediaplayer.dropped";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f58402g = "android.media.mediaplayer.audio.mime";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f58403h = "android.media.mediaplayer.audio.codec";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f58404i = "android.media.mediaplayer.durationMs";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f58405j = "android.media.mediaplayer.playingMs";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f58406k = "android.media.mediaplayer.err";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f58407l = "android.media.mediaplayer.errcode";

        private i() {
        }
    }

    static class j extends Exception {
        j(String str) {
            super(str);
        }
    }

    public interface k {
        void a(m mVar, MediaItem mediaItem);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface l {
    }

    /* JADX INFO: renamed from: androidx.media2.player.m$m, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface InterfaceC0540m {
    }

    protected m() {
    }

    @NonNull
    public static m x(@NonNull Context context) {
        return new androidx.media2.player.d(context);
    }

    public abstract int A();

    public abstract long B();

    @p0
    public abstract MediaItem C();

    public abstract long D();

    public abstract d E();

    @NonNull
    public abstract MediaDrm.KeyRequest F(@p0 byte[] bArr, @p0 byte[] bArr2, @p0 String str, int i10, @p0 Map<String, String> map) throws j;

    @NonNull
    public abstract String G(@NonNull String str) throws j;

    public abstract long H();

    public float I() {
        return 1.0f;
    }

    @w0(21)
    public abstract PersistableBundle J();

    @NonNull
    public abstract p K();

    public abstract float L();

    @p0
    public abstract SessionPlayer.TrackInfo M(int i10);

    public abstract int N();

    @p0
    public abstract n O();

    @NonNull
    public abstract List<SessionPlayer.TrackInfo> P();

    public abstract int Q();

    public abstract int R();

    public abstract Object S(boolean z10);

    public abstract Object T(@NonNull Object obj);

    public abstract Object U();

    public abstract Object V();

    public abstract Object W();

    public abstract Object X(@NonNull UUID uuid);

    public abstract byte[] Y(@p0 byte[] bArr, @NonNull byte[] bArr2) throws DeniedByServerException, j;

    public abstract void Z() throws j;

    public abstract void a0();

    public abstract void b0(@NonNull byte[] bArr) throws j;

    public Object c0(long j10) {
        return d0(j10, 0);
    }

    public abstract Object d0(long j10, int i10);

    @NonNull
    public abstract Object e0(int i10);

    public abstract Object f0(@NonNull AudioAttributesCompat audioAttributesCompat);

    public abstract Object g0(int i10);

    public abstract Object h0(float f10);

    public abstract void i0(@NonNull Executor executor, @NonNull c cVar);

    public abstract void j0(@NonNull String str, @NonNull String str2) throws j;

    public abstract void k0(@NonNull Executor executor, @NonNull e eVar);

    public abstract Object l0(@NonNull MediaItem mediaItem);

    public abstract Object m0(@NonNull MediaItem mediaItem);

    public abstract Object n0(@NonNull List<MediaItem> list);

    public abstract void o0(k kVar);

    public abstract Object p0(@NonNull p pVar);

    public abstract Object q0(float f10);

    public abstract Object r(int i10);

    public abstract Object r0(@p0 Surface surface);

    public abstract boolean s(Object obj);

    public abstract Object s0();

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract void w();

    @NonNull
    public abstract Object y(int i10);

    @p0
    public abstract AudioAttributesCompat z();
}
