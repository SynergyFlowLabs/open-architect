package androidx.media2.exoplayer.external.trackselection;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.TrackGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f57198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final Object f57199h;

    public h(TrackGroup group, int track) {
        this(group, track, 0, null);
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public int a() {
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    @p0
    public Object n() {
        return this.f57199h;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public int o() {
        return this.f57198g;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
    public void p(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue, androidx.media2.exoplayer.external.source.chunk.m[] mediaChunkIterators) {
    }

    public h(TrackGroup group, int track, int reason, @p0 Object data) {
        super(group, track);
        this.f57198g = reason;
        this.f57199h = data;
    }

    @Deprecated
    public static final class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f57200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final Object f57201b;

        public a() {
            this.f57200a = 0;
            this.f57201b = null;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public m a(TrackGroup trackGroup, androidx.media2.exoplayer.external.upstream.d dVar, int... iArr) {
            return n.a(this, trackGroup, dVar, iArr);
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m.b
        public m[] b(m.a[] definitions, androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
            return q.a(definitions, new q.a(this) { // from class: androidx.media2.exoplayer.external.trackselection.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final h.a f57197a;

                {
                    this.f57197a = this;
                }

                @Override // androidx.media2.exoplayer.external.trackselection.q.a
                public m a(m.a aVar) {
                    return this.f57197a.c(aVar);
                }
            });
        }

        final /* synthetic */ m c(m.a aVar) {
            return new h(aVar.f57218a, aVar.f57219b[0], this.f57200a, this.f57201b);
        }

        public a(int reason, @p0 Object data) {
            this.f57200a = reason;
            this.f57201b = data;
        }
    }
}
