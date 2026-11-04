package androidx.media2.exoplayer.external.trackselection;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class a extends androidx.media2.exoplayer.external.trackselection.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f57121r = 10000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f57122s = 25000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f57123t = 25000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f57124u = 0.75f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f57125v = 0.75f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f57126w = 2000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f57127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f57128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f57129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f57130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f57131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f57132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.c f57133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f57134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f57135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f57136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f57137q;

    private interface b {
        long a();
    }

    private static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.d f57138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f57139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f57140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private long[][] f57141d;

        c(androidx.media2.exoplayer.external.upstream.d bandwidthMeter, float bandwidthFraction, long reservedBandwidth) {
            this.f57138a = bandwidthMeter;
            this.f57139b = bandwidthFraction;
            this.f57140c = reservedBandwidth;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.a.b
        public long a() {
            long[][] jArr;
            long jMax = Math.max(0L, ((long) (this.f57138a.b() * this.f57139b)) - this.f57140c);
            if (this.f57141d == null) {
                return jMax;
            }
            int i10 = 1;
            while (true) {
                jArr = this.f57141d;
                if (i10 >= jArr.length - 1 || jArr[i10][0] >= jMax) {
                    break;
                }
                i10++;
            }
            long[] jArr2 = jArr[i10 - 1];
            long[] jArr3 = jArr[i10];
            long j10 = jArr2[0];
            float f10 = (jMax - j10) / (jArr3[0] - j10);
            long j11 = jArr2[1];
            return j11 + ((long) (f10 * (jArr3[1] - j11)));
        }

        void b(long[][] allocationCheckpoints) {
            androidx.media2.exoplayer.external.util.a.a(allocationCheckpoints.length >= 2);
            this.f57141d = allocationCheckpoints;
        }
    }

    public static class d implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final androidx.media2.exoplayer.external.upstream.d f57142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f57143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f57144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f57145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f57146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f57147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f57148g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.c f57149h;

        public d() {
            this(10000, 25000, 25000, 0.75f, 0.75f, 2000L, androidx.media2.exoplayer.external.util.c.f57511a);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public m a(TrackGroup trackGroup, androidx.media2.exoplayer.external.upstream.d dVar, int... iArr) {
            return n.a(this, trackGroup, dVar, iArr);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public final m[] b(m.a[] definitions, androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
            androidx.media2.exoplayer.external.upstream.d dVar = this.f57142a;
            if (dVar != null) {
                bandwidthMeter = dVar;
            }
            m[] mVarArr = new m[definitions.length];
            int i10 = 0;
            for (int i11 = 0; i11 < definitions.length; i11++) {
                m.a aVar = definitions[i11];
                if (aVar != null) {
                    int[] iArr = aVar.f57219b;
                    if (iArr.length == 1) {
                        mVarArr[i11] = new h(aVar.f57218a, iArr[0], aVar.f57220c, aVar.f57221d);
                        int i12 = aVar.f57218a.a(aVar.f57219b[0]).f53097e;
                        if (i12 != -1) {
                            i10 += i12;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < definitions.length; i13++) {
                m.a aVar2 = definitions[i13];
                if (aVar2 != null) {
                    int[] iArr2 = aVar2.f57219b;
                    if (iArr2.length > 1) {
                        a aVarC = c(aVar2.f57218a, bandwidthMeter, iArr2, i10);
                        arrayList.add(aVarC);
                        mVarArr[i13] = aVarC;
                    }
                }
            }
            if (arrayList.size() > 1) {
                long[][] jArr = new long[arrayList.size()][];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    a aVar3 = (a) arrayList.get(i14);
                    jArr[i14] = new long[aVar3.length()];
                    for (int i15 = 0; i15 < aVar3.length(); i15++) {
                        jArr[i14][i15] = aVar3.l((aVar3.length() - i15) - 1).f53097e;
                    }
                }
                long[][][] jArrY = a.y(jArr);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((a) arrayList.get(i16)).x(jArrY[i16]);
                }
            }
            return mVarArr;
        }

        protected a c(TrackGroup group, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, int[] tracks, int totalFixedTrackBandwidth) {
            return new a(group, tracks, new c(bandwidthMeter, this.f57146e, totalFixedTrackBandwidth), this.f57143b, this.f57144c, this.f57145d, this.f57147f, this.f57148g, this.f57149h);
        }

        @Deprecated
        public d(androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
            this(bandwidthMeter, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, androidx.media2.exoplayer.external.util.c.f57511a);
        }

        public d(int minDurationForQualityIncreaseMs, int maxDurationForQualityDecreaseMs, int minDurationToRetainAfterDiscardMs, float bandwidthFraction) {
            this(minDurationForQualityIncreaseMs, maxDurationForQualityDecreaseMs, minDurationToRetainAfterDiscardMs, bandwidthFraction, 0.75f, 2000L, androidx.media2.exoplayer.external.util.c.f57511a);
        }

        @Deprecated
        public d(androidx.media2.exoplayer.external.upstream.d bandwidthMeter, int minDurationForQualityIncreaseMs, int maxDurationForQualityDecreaseMs, int minDurationToRetainAfterDiscardMs, float bandwidthFraction) {
            this(bandwidthMeter, minDurationForQualityIncreaseMs, maxDurationForQualityDecreaseMs, minDurationToRetainAfterDiscardMs, bandwidthFraction, 0.75f, 2000L, androidx.media2.exoplayer.external.util.c.f57511a);
        }

        public d(int minDurationForQualityIncreaseMs, int maxDurationForQualityDecreaseMs, int minDurationToRetainAfterDiscardMs, float bandwidthFraction, float bufferedFractionToLiveEdgeForQualityIncrease, long minTimeBetweenBufferReevaluationMs, androidx.media2.exoplayer.external.util.c clock) {
            this(null, minDurationForQualityIncreaseMs, maxDurationForQualityDecreaseMs, minDurationToRetainAfterDiscardMs, bandwidthFraction, bufferedFractionToLiveEdgeForQualityIncrease, minTimeBetweenBufferReevaluationMs, clock);
        }

        @Deprecated
        public d(@p0 androidx.media2.exoplayer.external.upstream.d bandwidthMeter, int minDurationForQualityIncreaseMs, int maxDurationForQualityDecreaseMs, int minDurationToRetainAfterDiscardMs, float bandwidthFraction, float bufferedFractionToLiveEdgeForQualityIncrease, long minTimeBetweenBufferReevaluationMs, androidx.media2.exoplayer.external.util.c clock) {
            this.f57142a = bandwidthMeter;
            this.f57143b = minDurationForQualityIncreaseMs;
            this.f57144c = maxDurationForQualityDecreaseMs;
            this.f57145d = minDurationToRetainAfterDiscardMs;
            this.f57146e = bandwidthFraction;
            this.f57147f = bufferedFractionToLiveEdgeForQualityIncrease;
            this.f57148g = minTimeBetweenBufferReevaluationMs;
            this.f57149h = clock;
        }
    }

    private static double[][] B(double[][] logBitrates) {
        double[][] dArr = new double[logBitrates.length][];
        for (int i10 = 0; i10 < logBitrates.length; i10++) {
            double[] dArr2 = new double[logBitrates[i10].length - 1];
            dArr[i10] = dArr2;
            if (dArr2.length != 0) {
                double[] dArr3 = logBitrates[i10];
                double d10 = dArr3[dArr3.length - 1] - dArr3[0];
                int i11 = 0;
                while (true) {
                    double[] dArr4 = logBitrates[i10];
                    if (i11 < dArr4.length - 1) {
                        int i12 = i11 + 1;
                        dArr[i10][i11] = d10 == 0.0d ? 1.0d : (((dArr4[i11] + dArr4[i12]) * 0.5d) - dArr4[0]) / d10;
                        i11 = i12;
                    }
                }
            }
        }
        return dArr;
    }

    private long C(long availableDurationUs) {
        return (availableDurationUs == -9223372036854775807L || availableDurationUs > this.f57128h) ? this.f57128h : (long) (availableDurationUs * this.f57131k);
    }

    private static void D(long[][][] checkpoints, int checkpointIndex, long[][] trackBitrates, int[] selectedTracks) {
        long j10 = 0;
        for (int i10 = 0; i10 < checkpoints.length; i10++) {
            long[] jArr = checkpoints[i10][checkpointIndex];
            long j11 = trackBitrates[i10][selectedTracks[i10]];
            jArr[1] = j11;
            j10 += j11;
        }
        for (long[][] jArr2 : checkpoints) {
            jArr2[checkpointIndex][0] = j10;
        }
    }

    private static int v(double[][] array) {
        int length = 0;
        for (double[] dArr : array) {
            length += dArr.length;
        }
        return length;
    }

    private int w(long nowMs) {
        a aVar;
        long jA = this.f57127g.a();
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f57151b) {
            if (nowMs == Long.MIN_VALUE || !this.c(i10, nowMs)) {
                Format formatL = this.l(i10);
                a aVar2 = this;
                boolean zU = aVar2.u(formatL, formatL.f53097e, this.f57134n, jA);
                aVar = aVar2;
                if (zU) {
                    return i10;
                }
                i11 = i10;
            } else {
                aVar = this;
            }
            i10++;
            this = aVar;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long[][][] y(long[][] trackBitrates) {
        int i10;
        double[][] dArrZ = z(trackBitrates);
        double[][] dArrB = B(dArrZ);
        int iV = v(dArrB);
        int i11 = 2;
        long[][][] jArr = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, dArrZ.length, iV + 3, 2);
        int[] iArr = new int[dArrZ.length];
        D(jArr, 1, trackBitrates, iArr);
        while (true) {
            i10 = iV + 2;
            if (i11 >= i10) {
                break;
            }
            double d10 = Double.MAX_VALUE;
            int i12 = 0;
            for (int i13 = 0; i13 < dArrZ.length; i13++) {
                int i14 = iArr[i13];
                if (i14 + 1 != dArrZ[i13].length) {
                    double d11 = dArrB[i13][i14];
                    if (d11 < d10) {
                        i12 = i13;
                        d10 = d11;
                    }
                }
            }
            iArr[i12] = iArr[i12] + 1;
            D(jArr, i11, trackBitrates, iArr);
            i11++;
        }
        for (long[][] jArr2 : jArr) {
            long[] jArr3 = jArr2[i10];
            long[] jArr4 = jArr2[iV + 1];
            jArr3[0] = jArr4[0] * 2;
            jArr3[1] = jArr4[1] * 2;
        }
        return jArr;
    }

    private static double[][] z(long[][] values) {
        double[][] dArr = new double[values.length][];
        for (int i10 = 0; i10 < values.length; i10++) {
            dArr[i10] = new double[values[i10].length];
            int i11 = 0;
            while (true) {
                long[] jArr = values[i10];
                if (i11 < jArr.length) {
                    double[] dArr2 = dArr[i10];
                    long j10 = jArr[i11];
                    dArr2[i11] = j10 == -1 ? 0.0d : Math.log(j10);
                    i11++;
                }
            }
        }
        return dArr;
    }

    protected long A() {
        return this.f57130j;
    }

    protected boolean E(long nowMs) {
        long j10 = this.f57137q;
        return j10 == -9223372036854775807L || nowMs - j10 >= this.f57132l;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public int a() {
        return this.f57135o;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
    public void h() {
        this.f57137q = -9223372036854775807L;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
    public int i(long playbackPositionUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue) {
        int i10;
        int i11;
        long jB = this.f57133m.b();
        if (!E(jB)) {
            return queue.size();
        }
        this.f57137q = jB;
        if (queue.isEmpty()) {
            return 0;
        }
        int size = queue.size();
        long jY = q0.Y(queue.get(size - 1).f55779f - playbackPositionUs, this.f57134n);
        long jA = A();
        if (jY >= jA) {
            Format formatL = l(w(jB));
            for (int i12 = 0; i12 < size; i12++) {
                androidx.media2.exoplayer.external.source.chunk.l lVar = queue.get(i12);
                Format format = lVar.f55776c;
                if (q0.Y(lVar.f55779f - playbackPositionUs, this.f57134n) >= jA && format.f53097e < formatL.f53097e && (i10 = format.f53111o) != -1 && i10 < 720 && (i11 = format.f53110n) != -1 && i11 < 1280 && i10 < formatL.f53111o) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
    public void m(float playbackSpeed) {
        this.f57134n = playbackSpeed;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    @p0
    public Object n() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public int o() {
        return this.f57136p;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
    public void p(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue, androidx.media2.exoplayer.external.source.chunk.m[] mediaChunkIterators) {
        long jB = this.f57133m.b();
        if (this.f57136p == 0) {
            int i10 = 4 << 1;
            this.f57136p = 1;
            this.f57135o = w(jB);
            return;
        }
        int i11 = this.f57135o;
        int iW = w(jB);
        this.f57135o = iW;
        if (iW != i11) {
            if (!c(i11, jB)) {
                Format formatL = l(i11);
                Format formatL2 = l(this.f57135o);
                if (formatL2.f53097e > formatL.f53097e && bufferedDurationUs < C(availableDurationUs)) {
                    this.f57135o = i11;
                } else if (formatL2.f53097e < formatL.f53097e && bufferedDurationUs >= this.f57129i) {
                    this.f57135o = i11;
                }
            }
            if (this.f57135o != i11) {
                this.f57136p = 3;
            }
        }
    }

    protected boolean u(Format format, int trackBitrate, float playbackSpeed, long effectiveBitrate) {
        return ((long) Math.round(((float) trackBitrate) * playbackSpeed)) <= effectiveBitrate;
    }

    public void x(long[][] allocationCheckpoints) {
        ((c) this.f57127g).b(allocationCheckpoints);
    }

    public a(TrackGroup group, int[] tracks, androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
        this(group, tracks, bandwidthMeter, 0L, 10000L, 25000L, 25000L, 0.75f, 0.75f, 2000L, androidx.media2.exoplayer.external.util.c.f57511a);
    }

    public a(TrackGroup group, int[] tracks, androidx.media2.exoplayer.external.upstream.d bandwidthMeter, long reservedBandwidth, long minDurationForQualityIncreaseMs, long maxDurationForQualityDecreaseMs, long minDurationToRetainAfterDiscardMs, float bandwidthFraction, float bufferedFractionToLiveEdgeForQualityIncrease, long minTimeBetweenBufferReevaluationMs, androidx.media2.exoplayer.external.util.c clock) {
        this(group, tracks, new c(bandwidthMeter, bandwidthFraction, reservedBandwidth), minDurationForQualityIncreaseMs, maxDurationForQualityDecreaseMs, minDurationToRetainAfterDiscardMs, bufferedFractionToLiveEdgeForQualityIncrease, minTimeBetweenBufferReevaluationMs, clock);
    }

    private a(TrackGroup group, int[] tracks, b bandwidthProvider, long minDurationForQualityIncreaseMs, long maxDurationForQualityDecreaseMs, long minDurationToRetainAfterDiscardMs, float bufferedFractionToLiveEdgeForQualityIncrease, long minTimeBetweenBufferReevaluationMs, androidx.media2.exoplayer.external.util.c clock) {
        super(group, tracks);
        this.f57127g = bandwidthProvider;
        this.f57128h = minDurationForQualityIncreaseMs * 1000;
        this.f57129i = maxDurationForQualityDecreaseMs * 1000;
        this.f57130j = minDurationToRetainAfterDiscardMs * 1000;
        this.f57131k = bufferedFractionToLiveEdgeForQualityIncrease;
        this.f57132l = minTimeBetweenBufferReevaluationMs;
        this.f57133m = clock;
        this.f57134n = 1.0f;
        this.f57136p = 0;
        this.f57137q = -9223372036854775807L;
    }
}
