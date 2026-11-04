package androidx.media2.exoplayer.external.trackselection;

import androidx.media2.exoplayer.external.source.TrackGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n {
    @Deprecated
    public static m a(m.b bVar, TrackGroup trackGroup, androidx.media2.exoplayer.external.upstream.d dVar, int... iArr) {
        throw new UnsupportedOperationException();
    }

    public static m[] b(final m.b bVar, m.a[] aVarArr, final androidx.media2.exoplayer.external.upstream.d dVar) {
        return q.a(aVarArr, new q.a(bVar, dVar) { // from class: androidx.media2.exoplayer.external.trackselection.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final m.b f57222a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final androidx.media2.exoplayer.external.upstream.d f57223b;

            {
                this.f57222a = bVar;
                this.f57223b = dVar;
            }

            @Override // androidx.media2.exoplayer.external.trackselection.q.a
            public m a(m.a aVar) {
                return this.f57222a.a(aVar.f57218a, this.f57223b, aVar.f57219b);
            }
        });
    }
}
