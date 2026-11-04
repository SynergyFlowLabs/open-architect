package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.i;
import androidx.annotation.p0;
import androidx.core.util.p;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.common.util.concurrent.t1;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SessionPlayer implements Closeable {
    public static final int X = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53040c = "SessionPlayer";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53041d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53042e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f53043f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f53044g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f53045h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f53046i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f53047j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f53048k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f53049l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f53050m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f53051n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f53052o = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f53053s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53054t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f53055v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f53056w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53057a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("mLock")
    private final List<p<b, Executor>> f53058b = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface a {
    }

    public static abstract class b {
        public void b(@NonNull SessionPlayer sessionPlayer, @p0 AudioAttributesCompat audioAttributesCompat) {
        }

        public void c(@NonNull SessionPlayer sessionPlayer, @p0 MediaItem mediaItem, int i10) {
        }

        public void d(@NonNull SessionPlayer sessionPlayer, @p0 MediaItem mediaItem) {
        }

        public void e(@NonNull SessionPlayer sessionPlayer) {
        }

        public void f(@NonNull SessionPlayer sessionPlayer, float f10) {
        }

        public void g(@NonNull SessionPlayer sessionPlayer, int i10) {
        }

        public void h(@NonNull SessionPlayer sessionPlayer, @p0 List<MediaItem> list, @p0 MediaMetadata mediaMetadata) {
        }

        public void i(@NonNull SessionPlayer sessionPlayer, @p0 MediaMetadata mediaMetadata) {
        }

        public void j(@NonNull SessionPlayer sessionPlayer, int i10) {
        }

        public void k(@NonNull SessionPlayer sessionPlayer, long j10) {
        }

        public void l(@NonNull SessionPlayer sessionPlayer, int i10) {
        }

        public void m(@NonNull SessionPlayer sessionPlayer, @NonNull MediaItem mediaItem, @NonNull TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        }

        public void n(@NonNull SessionPlayer sessionPlayer, @NonNull TrackInfo trackInfo) {
        }

        public void o(@NonNull SessionPlayer sessionPlayer, @NonNull TrackInfo trackInfo) {
        }

        public void p(@NonNull SessionPlayer sessionPlayer, @NonNull List<TrackInfo> list) {
        }

        public void q(@NonNull SessionPlayer sessionPlayer, @NonNull VideoSize videoSize) {
        }
    }

    public static class c implements androidx.media2.common.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f53069q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final long f53070r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final MediaItem f53071s;

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        public @interface a {
        }

        public c(int i10, @p0 MediaItem mediaItem) {
            this(i10, mediaItem, SystemClock.elapsedRealtime());
        }

        @NonNull
        @b1({b1.a.LIBRARY_GROUP})
        public static t1<c> a(int i10) {
            androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
            eVarN.E(new c(i10, null));
            return eVarN;
        }

        @Override // androidx.media2.common.a
        @p0
        public MediaItem g() {
            return this.f53071s;
        }

        @Override // androidx.media2.common.a
        public long h() {
            return this.f53070r;
        }

        @Override // androidx.media2.common.a
        public int i() {
            return this.f53069q;
        }

        private c(int i10, @p0 MediaItem mediaItem, long j10) {
            this.f53069q = i10;
            this.f53071s = mediaItem;
            this.f53070r = j10;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface f {
    }

    @NonNull
    public abstract t1<c> A();

    @NonNull
    public t1<c> A0(@NonNull TrackInfo trackInfo) {
        throw new UnsupportedOperationException("selectTrack is not implemented");
    }

    @NonNull
    public abstract t1<c> B();

    public abstract int C();

    @NonNull
    public abstract t1<c> D(int i10);

    @NonNull
    public abstract t1<c> F(long j10);

    @NonNull
    public abstract t1<c> G(float f10);

    @NonNull
    public abstract t1<c> G0(@g0(from = 0) int i10);

    @NonNull
    public List<TrackInfo> G1() {
        throw new UnsupportedOperationException("getTracks is not implemented");
    }

    @NonNull
    public abstract t1<c> H1(@g0(from = 0) int i10);

    @p0
    public TrackInfo I1(int i10) {
        throw new UnsupportedOperationException("getSelectedTrack is not implemented");
    }

    public abstract int J();

    @NonNull
    public abstract t1<c> K(int i10);

    @NonNull
    public t1<c> K0(@NonNull TrackInfo trackInfo) {
        throw new UnsupportedOperationException("deselectTrack is not implemented");
    }

    @p0
    public abstract MediaMetadata V();

    @p0
    public abstract List<MediaItem> V0();

    @NonNull
    public abstract t1<c> Y0(@NonNull List<MediaItem> list, @p0 MediaMetadata mediaMetadata);

    @p0
    public abstract MediaItem Z();

    @NonNull
    public t1<c> Z0(@g0(from = 0) int i10, @g0(from = 0) int i11) {
        throw new UnsupportedOperationException("movePlaylistItem is not implemented");
    }

    @NonNull
    public abstract t1<c> a(int i10, @NonNull MediaItem mediaItem);

    @g0(from = -1)
    public abstract int a0();

    @NonNull
    public abstract t1<c> a1(@p0 MediaMetadata mediaMetadata);

    @p0
    public abstract AudioAttributesCompat b();

    @NonNull
    protected final List<p<b, Executor>> c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f53057a) {
            try {
                arrayList.addAll(this.f53058b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @i
    public void close() {
        synchronized (this.f53057a) {
            this.f53058b.clear();
        }
    }

    public final void d(@NonNull Executor executor, @NonNull b bVar) {
        if (executor == null) {
            throw new NullPointerException("executor shouldn't be null");
        }
        if (bVar == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.f53057a) {
            try {
                for (p<b, Executor> pVar : this.f53058b) {
                    if (pVar.f48411a == bVar && pVar.f48412b != null) {
                        return;
                    }
                }
                this.f53058b.add(new p<>(bVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public abstract t1<c> e(int i10, @NonNull MediaItem mediaItem);

    @g0(from = -1)
    public abstract int e0();

    @NonNull
    public abstract t1<c> f(@NonNull AudioAttributesCompat audioAttributesCompat);

    @NonNull
    public abstract t1<c> g(@NonNull MediaItem mediaItem);

    public abstract long getCurrentPosition();

    public abstract long getDuration();

    @NonNull
    public abstract t1<c> h();

    @NonNull
    public VideoSize h0() {
        throw new UnsupportedOperationException("getVideoSize is not implemented");
    }

    public abstract int i1();

    @NonNull
    public abstract t1<c> j();

    public final void l(@NonNull b bVar) {
        if (bVar == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.f53057a) {
            try {
                for (int size = this.f53058b.size() - 1; size >= 0; size--) {
                    if (this.f53058b.get(size).f48411a == bVar) {
                        this.f53058b.remove(size);
                    }
                }
            } finally {
            }
        }
    }

    @g0(from = -1)
    public abstract int l0();

    @NonNull
    public abstract t1<c> pause();

    public abstract int s0();

    public abstract float t0();

    public abstract long v();

    @NonNull
    public t1<c> z0(@p0 Surface surface) {
        throw new UnsupportedOperationException("setSurface is not implemented");
    }

    public static class TrackInfo extends CustomVersionedParcelable {
        public static final int A = 5;
        private static final String B = "androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL";
        private static final String C = "androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f53059w = 0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f53060x = 1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f53061y = 2;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f53062z = 4;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f53063q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f53064r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @p0
        MediaFormat f53065s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f53066t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Bundle f53067u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final Object f53068v;

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY_GROUP})
        public @interface a {
        }

        TrackInfo() {
            this.f53068v = new Object();
        }

        private static void o(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (mediaFormat.containsKey(str)) {
                bundle.putInt(str, mediaFormat.getInteger(str));
            }
        }

        private static void p(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (mediaFormat.containsKey(str)) {
                bundle.putString(str, mediaFormat.getString(str));
            }
        }

        private static void q(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (bundle.containsKey(str)) {
                mediaFormat.setInteger(str, bundle.getInt(str));
            }
        }

        private static void r(String str, MediaFormat mediaFormat, Bundle bundle) {
            if (bundle.containsKey(str)) {
                mediaFormat.setString(str, bundle.getString(str));
            }
        }

        @Override // androidx.versionedparcelable.CustomVersionedParcelable
        @b1({b1.a.LIBRARY})
        public void d() {
            Bundle bundle = this.f53067u;
            if (bundle != null && !bundle.getBoolean(B)) {
                MediaFormat mediaFormat = new MediaFormat();
                this.f53065s = mediaFormat;
                r("language", mediaFormat, this.f53067u);
                r("mime", this.f53065s, this.f53067u);
                q("is-forced-subtitle", this.f53065s, this.f53067u);
                q("is-autoselect", this.f53065s, this.f53067u);
                q("is-default", this.f53065s, this.f53067u);
            }
            Bundle bundle2 = this.f53067u;
            if (bundle2 != null && bundle2.containsKey(C)) {
                this.f53066t = this.f53067u.getBoolean(C);
                return;
            }
            boolean z10 = true;
            if (this.f53064r == 1) {
                z10 = false;
            }
            this.f53066t = z10;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackInfo) && this.f53063q == ((TrackInfo) obj).f53063q;
        }

        @Override // androidx.versionedparcelable.CustomVersionedParcelable
        @b1({b1.a.LIBRARY})
        public void f(boolean z10) {
            synchronized (this.f53068v) {
                try {
                    Bundle bundle = new Bundle();
                    this.f53067u = bundle;
                    bundle.putBoolean(B, this.f53065s == null);
                    MediaFormat mediaFormat = this.f53065s;
                    if (mediaFormat != null) {
                        p("language", mediaFormat, this.f53067u);
                        p("mime", this.f53065s, this.f53067u);
                        o("is-forced-subtitle", this.f53065s, this.f53067u);
                        o("is-autoselect", this.f53065s, this.f53067u);
                        o("is-default", this.f53065s, this.f53067u);
                    }
                    this.f53067u.putBoolean(C, this.f53066t);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public int hashCode() {
            return this.f53063q;
        }

        @p0
        public MediaFormat j() {
            return this.f53065s;
        }

        public int k() {
            return this.f53063q;
        }

        @NonNull
        public Locale l() {
            MediaFormat mediaFormat = this.f53065s;
            String string = mediaFormat != null ? mediaFormat.getString("language") : null;
            if (string == null) {
                string = "und";
            }
            return new Locale(string);
        }

        public int m() {
            return this.f53064r;
        }

        public boolean n() {
            return this.f53066t;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(getClass().getName());
            sb2.append('#');
            sb2.append(this.f53063q);
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            int i10 = this.f53064r;
            if (i10 != 1) {
                int i11 = 1 >> 2;
                if (i10 == 2) {
                    sb2.append("AUDIO");
                } else if (i10 == 4) {
                    sb2.append("SUBTITLE");
                } else if (i10 != 5) {
                    sb2.append("UNKNOWN");
                } else {
                    sb2.append("METADATA");
                }
            } else {
                sb2.append(com.facebook.share.internal.f.f101822a0);
            }
            sb2.append(", ");
            sb2.append(this.f53065s);
            sb2.append(", isSelectable=");
            sb2.append(this.f53066t);
            sb2.append("}");
            return sb2.toString();
        }

        public TrackInfo(int i10, int i11, @p0 MediaFormat mediaFormat) {
            this(i10, i11, mediaFormat, false);
        }

        public TrackInfo(int i10, int i11, @p0 MediaFormat mediaFormat, boolean z10) {
            this.f53068v = new Object();
            this.f53063q = i10;
            this.f53064r = i11;
            this.f53065s = mediaFormat;
            this.f53066t = z10;
        }
    }
}
