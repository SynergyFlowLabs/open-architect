package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@Deprecated
public interface c1 extends t0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final c1 f64843b = new a();

    class a implements c1 {
        a() {
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        public int[] c() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        public t0 h(androidx.media3.common.k0 k0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c1 e(@androidx.annotation.p0 androidx.media3.exoplayer.drm.w wVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c1 f(@androidx.annotation.p0 androidx.media3.exoplayer.upstream.m mVar) {
            return this;
        }
    }
}
