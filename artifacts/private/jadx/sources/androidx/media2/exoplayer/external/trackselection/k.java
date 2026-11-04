package androidx.media2.exoplayer.external.trackselection;

import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.TrackGroup;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class k extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Random f57215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f57216h;

    public k(TrackGroup group, int... tracks) {
        super(group, tracks);
        Random random = new Random();
        this.f57215g = random;
        this.f57216h = random.nextInt(this.f57151b);
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public int a() {
        return this.f57216h;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    @p0
    public Object n() {
        return null;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public int o() {
        return 3;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
    public void p(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue, androidx.media2.exoplayer.external.source.chunk.m[] mediaChunkIterators) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f57151b; i11++) {
            if (!c(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        this.f57216h = this.f57215g.nextInt(i10);
        if (i10 != this.f57151b) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f57151b; i13++) {
                if (!c(i13, jElapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.f57216h == i12) {
                        this.f57216h = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }

    public static final class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f57217a;

        public a() {
            this.f57217a = new Random();
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public m a(TrackGroup trackGroup, androidx.media2.exoplayer.external.upstream.d dVar, int... iArr) {
            return n.a(this, trackGroup, dVar, iArr);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public m[] b(m.a[] definitions, androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
            return q.a(definitions, new q.a(this) { // from class: androidx.media2.exoplayer.external.trackselection.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final k.a f57214a;

                {
                    this.f57214a = this;
                }

                @Override // androidx.media2.exoplayer.external.trackselection.q.a
                public m a(m.a aVar) {
                    return this.f57214a.c(aVar);
                }
            });
        }

        final /* synthetic */ m c(m.a aVar) {
            return new k(aVar.f57218a, aVar.f57219b, this.f57217a);
        }

        public a(int seed) {
            this.f57217a = new Random(seed);
        }
    }

    public k(TrackGroup group, int[] tracks, long seed) {
        this(group, tracks, new Random(seed));
    }

    public k(TrackGroup group, int[] tracks, Random random) {
        super(group, tracks);
        this.f57215g = random;
        this.f57216h = random.nextInt(this.f57151b);
    }
}
