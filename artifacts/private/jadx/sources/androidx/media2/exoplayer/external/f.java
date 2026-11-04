package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.TrackGroupArray;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class f implements f0 {
    public static final int A = 36438016;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55181n = 15000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f55182o = 50000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f55183p = 2500;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f55184q = 5000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f55185r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f55186s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f55187t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f55188u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f55189v = 32768000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f55190w = 3538944;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f55191x = 131072;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f55192y = 131072;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f55193z = 131072;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.p f55194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f55195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f55196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f55197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f55198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f55199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f55200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f55201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f55202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f55203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f55206m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media2.exoplayer.external.upstream.p f55207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f55208b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f55209c = 50000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f55210d = 50000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f55211e = 2500;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f55212f = 5000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f55213g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f55214h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f55215i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f55216j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f55217k;

        public f a() {
            androidx.media2.exoplayer.external.util.a.i(!this.f55217k);
            this.f55217k = true;
            if (this.f55207a == null) {
                this.f55207a = new androidx.media2.exoplayer.external.upstream.p(true, 65536);
            }
            return new f(this.f55207a, this.f55208b, this.f55209c, this.f55210d, this.f55211e, this.f55212f, this.f55213g, this.f55214h, this.f55215i, this.f55216j);
        }

        public a b(androidx.media2.exoplayer.external.upstream.p allocator) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55217k);
            this.f55207a = allocator;
            return this;
        }

        public a c(int backBufferDurationMs, boolean retainBackBufferFromKeyframe) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55217k);
            f.k(backBufferDurationMs, 0, "backBufferDurationMs", com.facebook.appevents.p.f99189d0);
            this.f55215i = backBufferDurationMs;
            this.f55216j = retainBackBufferFromKeyframe;
            return this;
        }

        public a d(int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55217k);
            f.k(bufferForPlaybackMs, 0, "bufferForPlaybackMs", com.facebook.appevents.p.f99189d0);
            f.k(bufferForPlaybackAfterRebufferMs, 0, "bufferForPlaybackAfterRebufferMs", com.facebook.appevents.p.f99189d0);
            f.k(minBufferMs, bufferForPlaybackMs, "minBufferMs", "bufferForPlaybackMs");
            f.k(minBufferMs, bufferForPlaybackAfterRebufferMs, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            f.k(maxBufferMs, minBufferMs, "maxBufferMs", "minBufferMs");
            this.f55208b = minBufferMs;
            this.f55209c = minBufferMs;
            this.f55210d = maxBufferMs;
            this.f55211e = bufferForPlaybackMs;
            this.f55212f = bufferForPlaybackAfterRebufferMs;
            return this;
        }

        public a e(boolean prioritizeTimeOverSizeThresholds) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55217k);
            this.f55214h = prioritizeTimeOverSizeThresholds;
            return this;
        }

        public a f(int targetBufferBytes) {
            androidx.media2.exoplayer.external.util.a.i(!this.f55217k);
            this.f55213g = targetBufferBytes;
            return this;
        }
    }

    public f() {
        this(new androidx.media2.exoplayer.external.upstream.p(true, 65536));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(int value1, int value2, String name1, String name2) {
        boolean z10 = value1 >= value2;
        StringBuilder sb2 = new StringBuilder(String.valueOf(name1).length() + 21 + String.valueOf(name2).length());
        sb2.append(name1);
        sb2.append(" cannot be less than ");
        sb2.append(name2);
        androidx.media2.exoplayer.external.util.a.b(z10, sb2.toString());
    }

    private static int m(int trackType) {
        switch (trackType) {
            case 0:
                return A;
            case 1:
                return f55190w;
            case 2:
                return f55189v;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static boolean n(t0[] renderers, androidx.media2.exoplayer.external.trackselection.p trackSelectionArray) {
        for (int i10 = 0; i10 < renderers.length; i10++) {
            if (renderers[i10].f() == 2 && trackSelectionArray.a(i10) != null) {
                return true;
            }
        }
        return false;
    }

    private void o(boolean resetAllocator) {
        this.f55204k = 0;
        this.f55205l = false;
        if (resetAllocator) {
            this.f55194a.g();
        }
    }

    @Override // androidx.media2.exoplayer.external.f0
    public void a() {
        o(false);
    }

    @Override // androidx.media2.exoplayer.external.f0
    public boolean b() {
        return this.f55203j;
    }

    @Override // androidx.media2.exoplayer.external.f0
    public void c() {
        o(true);
    }

    @Override // androidx.media2.exoplayer.external.f0
    public long d() {
        return this.f55202i;
    }

    @Override // androidx.media2.exoplayer.external.f0
    public androidx.media2.exoplayer.external.upstream.b e() {
        return this.f55194a;
    }

    @Override // androidx.media2.exoplayer.external.f0
    public void f() {
        o(true);
    }

    @Override // androidx.media2.exoplayer.external.f0
    public boolean g(long bufferedDurationUs, float playbackSpeed, boolean rebuffering) {
        long jY = androidx.media2.exoplayer.external.util.q0.Y(bufferedDurationUs, playbackSpeed);
        long j10 = rebuffering ? this.f55199f : this.f55198e;
        return j10 <= 0 || jY >= j10 || (!this.f55201h && this.f55194a.a() >= this.f55204k);
    }

    @Override // androidx.media2.exoplayer.external.f0
    public void h(t0[] renderers, TrackGroupArray trackGroups, androidx.media2.exoplayer.external.trackselection.p trackSelections) {
        this.f55206m = n(renderers, trackSelections);
        int iL = this.f55200g;
        if (iL == -1) {
            iL = l(renderers, trackSelections);
        }
        this.f55204k = iL;
        this.f55194a.h(iL);
    }

    @Override // androidx.media2.exoplayer.external.f0
    public boolean i(long bufferedDurationUs, float playbackSpeed) {
        boolean z10 = true;
        boolean z11 = this.f55194a.a() >= this.f55204k;
        long jMin = this.f55206m ? this.f55196c : this.f55195b;
        if (playbackSpeed > 1.0f) {
            jMin = Math.min(androidx.media2.exoplayer.external.util.q0.R(jMin, playbackSpeed), this.f55197d);
        }
        if (bufferedDurationUs < jMin) {
            if (!this.f55201h && z11) {
                z10 = false;
            }
            this.f55205l = z10;
        } else if (bufferedDurationUs >= this.f55197d || z11) {
            this.f55205l = false;
        }
        return this.f55205l;
    }

    protected int l(t0[] renderers, androidx.media2.exoplayer.external.trackselection.p trackSelectionArray) {
        int iM = 0;
        for (int i10 = 0; i10 < renderers.length; i10++) {
            if (trackSelectionArray.a(i10) != null) {
                iM += m(renderers[i10].f());
            }
        }
        return iM;
    }

    @Deprecated
    public f(androidx.media2.exoplayer.external.upstream.p allocator) {
        this(allocator, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    @Deprecated
    public f(androidx.media2.exoplayer.external.upstream.p allocator, int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs, int targetBufferBytes, boolean prioritizeTimeOverSizeThresholds) {
        this(allocator, minBufferMs, minBufferMs, maxBufferMs, bufferForPlaybackMs, bufferForPlaybackAfterRebufferMs, targetBufferBytes, prioritizeTimeOverSizeThresholds, 0, false);
    }

    protected f(androidx.media2.exoplayer.external.upstream.p allocator, int minBufferAudioMs, int minBufferVideoMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs, int targetBufferBytes, boolean prioritizeTimeOverSizeThresholds, int backBufferDurationMs, boolean retainBackBufferFromKeyframe) {
        k(bufferForPlaybackMs, 0, "bufferForPlaybackMs", com.facebook.appevents.p.f99189d0);
        k(bufferForPlaybackAfterRebufferMs, 0, "bufferForPlaybackAfterRebufferMs", com.facebook.appevents.p.f99189d0);
        k(minBufferAudioMs, bufferForPlaybackMs, "minBufferAudioMs", "bufferForPlaybackMs");
        k(minBufferVideoMs, bufferForPlaybackMs, "minBufferVideoMs", "bufferForPlaybackMs");
        k(minBufferAudioMs, bufferForPlaybackAfterRebufferMs, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        k(minBufferVideoMs, bufferForPlaybackAfterRebufferMs, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        k(maxBufferMs, minBufferAudioMs, "maxBufferMs", "minBufferAudioMs");
        k(maxBufferMs, minBufferVideoMs, "maxBufferMs", "minBufferVideoMs");
        k(backBufferDurationMs, 0, "backBufferDurationMs", com.facebook.appevents.p.f99189d0);
        this.f55194a = allocator;
        this.f55195b = c.b(minBufferAudioMs);
        this.f55196c = c.b(minBufferVideoMs);
        this.f55197d = c.b(maxBufferMs);
        this.f55198e = c.b(bufferForPlaybackMs);
        this.f55199f = c.b(bufferForPlaybackAfterRebufferMs);
        this.f55200g = targetBufferBytes;
        this.f55201h = prioritizeTimeOverSizeThresholds;
        this.f55202i = c.b(backBufferDurationMs);
        this.f55203j = retainBackBufferFromKeyframe;
    }
}
