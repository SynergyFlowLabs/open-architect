package androidx.media2.exoplayer.external;

import android.util.Pair;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f57952a = new a();

    class a extends z0 {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int b(Object uid) {
            return -1;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public b g(int periodIndex, b period, boolean setIds) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int i() {
            return 0;
        }

        @Override // androidx.media2.exoplayer.external.z0
        public Object m(int periodIndex) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media2.exoplayer.external.z0
        public c o(int windowIndex, c window, long defaultPositionProjectionUs) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media2.exoplayer.external.z0
        public int r() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f57953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f57954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f57955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f57956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f57957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media2.exoplayer.external.source.ads.a f57958f = androidx.media2.exoplayer.external.source.ads.a.f55693k;

        public int a(int adGroupIndex) {
            return this.f57958f.f55696c[adGroupIndex].f55699a;
        }

        public long b(int adGroupIndex, int adIndexInAdGroup) {
            androidx.media2.exoplayer.external.source.ads.a.C0515a c0515a = this.f57958f.f55696c[adGroupIndex];
            if (c0515a.f55699a != -1) {
                return c0515a.f55702d[adIndexInAdGroup];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f57958f.f55694a;
        }

        public int d(long positionUs) {
            return this.f57958f.a(positionUs, this.f57956d);
        }

        public int e(long positionUs) {
            return this.f57958f.b(positionUs);
        }

        public long f(int adGroupIndex) {
            return this.f57958f.f55695b[adGroupIndex];
        }

        public long g() {
            return this.f57958f.f55697d;
        }

        public long h() {
            return androidx.media2.exoplayer.external.c.c(this.f57956d);
        }

        public long i() {
            return this.f57956d;
        }

        public int j(int adGroupIndex) {
            return this.f57958f.f55696c[adGroupIndex].c();
        }

        public int k(int adGroupIndex, int lastPlayedAdIndex) {
            return this.f57958f.f55696c[adGroupIndex].d(lastPlayedAdIndex);
        }

        public long l() {
            return androidx.media2.exoplayer.external.c.c(this.f57957e);
        }

        public long m() {
            return this.f57957e;
        }

        public boolean n(int adGroupIndex) {
            return !this.f57958f.f55696c[adGroupIndex].e();
        }

        public boolean o(int adGroupIndex, int adIndexInAdGroup) {
            androidx.media2.exoplayer.external.source.ads.a.C0515a c0515a = this.f57958f.f55696c[adGroupIndex];
            return (c0515a.f55699a == -1 || c0515a.f55701c[adIndexInAdGroup] == 0) ? false : true;
        }

        public b p(@androidx.annotation.p0 Object id2, @androidx.annotation.p0 Object uid, int windowIndex, long durationUs, long positionInWindowUs) {
            return q(id2, uid, windowIndex, durationUs, positionInWindowUs, androidx.media2.exoplayer.external.source.ads.a.f55693k);
        }

        public b q(@androidx.annotation.p0 Object id2, @androidx.annotation.p0 Object uid, int windowIndex, long durationUs, long positionInWindowUs, androidx.media2.exoplayer.external.source.ads.a adPlaybackState) {
            this.f57953a = id2;
            this.f57954b = uid;
            this.f57955c = windowIndex;
            this.f57956d = durationUs;
            this.f57957e = positionInWindowUs;
            this.f57958f = adPlaybackState;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f57959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f57960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f57961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f57962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f57963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f57964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f57965g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f57966h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f57967i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f57968j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f57969k;

        public long a() {
            return androidx.media2.exoplayer.external.c.c(this.f57967i);
        }

        public long b() {
            return this.f57967i;
        }

        public long c() {
            return androidx.media2.exoplayer.external.c.c(this.f57968j);
        }

        public long d() {
            return this.f57968j;
        }

        public long e() {
            return androidx.media2.exoplayer.external.c.c(this.f57969k);
        }

        public long f() {
            return this.f57969k;
        }

        public c g(@androidx.annotation.p0 Object tag, @androidx.annotation.p0 Object manifest, long presentationStartTimeMs, long windowStartTimeMs, boolean isSeekable, boolean isDynamic, long defaultPositionUs, long durationUs, int firstPeriodIndex, int lastPeriodIndex, long positionInFirstPeriodUs) {
            this.f57959a = tag;
            this.f57960b = manifest;
            this.f57961c = presentationStartTimeMs;
            this.f57962d = windowStartTimeMs;
            this.f57963e = isSeekable;
            this.f57964f = isDynamic;
            this.f57967i = defaultPositionUs;
            this.f57968j = durationUs;
            this.f57965g = firstPeriodIndex;
            this.f57966h = lastPeriodIndex;
            this.f57969k = positionInFirstPeriodUs;
            return this;
        }
    }

    public int a(boolean shuffleModeEnabled) {
        return s() ? -1 : 0;
    }

    public abstract int b(Object uid);

    public int c(boolean shuffleModeEnabled) {
        if (s()) {
            return -1;
        }
        return r() - 1;
    }

    public final int d(int periodIndex, b period, c window, int repeatMode, boolean shuffleModeEnabled) {
        int i10 = f(periodIndex, period).f57955c;
        if (n(i10, window).f57966h != periodIndex) {
            return periodIndex + 1;
        }
        int iE = e(i10, repeatMode, shuffleModeEnabled);
        if (iE == -1) {
            return -1;
        }
        return n(iE, window).f57965g;
    }

    public int e(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        if (repeatMode == 0) {
            if (windowIndex == c(shuffleModeEnabled)) {
                return -1;
            }
            return windowIndex + 1;
        }
        if (repeatMode == 1) {
            return windowIndex;
        }
        if (repeatMode == 2) {
            return windowIndex == c(shuffleModeEnabled) ? a(shuffleModeEnabled) : windowIndex + 1;
        }
        throw new IllegalStateException();
    }

    public final b f(int periodIndex, b period) {
        return g(periodIndex, period, false);
    }

    public abstract b g(int periodIndex, b period, boolean setIds);

    public b h(Object periodUid, b period) {
        return g(b(periodUid), period, true);
    }

    public abstract int i();

    public final Pair<Object, Long> j(c window, b period, int windowIndex, long windowPositionUs) {
        return (Pair) androidx.media2.exoplayer.external.util.a.g(k(window, period, windowIndex, windowPositionUs, 0L));
    }

    @androidx.annotation.p0
    public final Pair<Object, Long> k(c window, b period, int windowIndex, long windowPositionUs, long defaultPositionProjectionUs) {
        androidx.media2.exoplayer.external.util.a.c(windowIndex, 0, r());
        o(windowIndex, window, defaultPositionProjectionUs);
        if (windowPositionUs == -9223372036854775807L) {
            windowPositionUs = window.b();
            if (windowPositionUs == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = window.f57965g;
        long jF = window.f() + windowPositionUs;
        long jI = g(i10, period, true).i();
        while (jI != -9223372036854775807L && jF >= jI && i10 < window.f57966h) {
            jF -= jI;
            i10++;
            jI = g(i10, period, true).i();
        }
        return Pair.create(androidx.media2.exoplayer.external.util.a.g(period.f57954b), Long.valueOf(jF));
    }

    public int l(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        if (repeatMode == 0) {
            if (windowIndex == a(shuffleModeEnabled)) {
                return -1;
            }
            return windowIndex - 1;
        }
        if (repeatMode == 1) {
            return windowIndex;
        }
        if (repeatMode == 2) {
            return windowIndex == a(shuffleModeEnabled) ? c(shuffleModeEnabled) : windowIndex - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int periodIndex);

    public final c n(int windowIndex, c window) {
        return o(windowIndex, window, 0L);
    }

    public c o(int windowIndex, c window, long defaultPositionProjectionUs) {
        return q(windowIndex, window, true, defaultPositionProjectionUs);
    }

    @Deprecated
    public final c p(int windowIndex, c window, boolean setTag) {
        return o(windowIndex, window, 0L);
    }

    @Deprecated
    public c q(int windowIndex, c window, boolean setTag, long defaultPositionProjectionUs) {
        return o(windowIndex, window, defaultPositionProjectionUs);
    }

    public abstract int r();

    public final boolean s() {
        return r() == 0;
    }

    public final boolean t(int periodIndex, b period, c window, int repeatMode, boolean shuffleModeEnabled) {
        return d(periodIndex, period, window, repeatMode, shuffleModeEnabled) == -1;
    }
}
