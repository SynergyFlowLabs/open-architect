package androidx.media2.player;

import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class i implements androidx.media2.exoplayer.external.metadata.c {

    class a implements androidx.media2.exoplayer.external.metadata.b {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.metadata.b
        public Metadata a(androidx.media2.exoplayer.external.metadata.d dVar) {
            long j10 = dVar.f53790d;
            byte[] bArrArray = dVar.f53789c.array();
            return new Metadata(new ByteArrayFrame(j10, Arrays.copyOf(bArrArray, bArrArray.length)));
        }
    }

    i() {
    }

    @Override // androidx.media2.exoplayer.external.metadata.c
    public androidx.media2.exoplayer.external.metadata.b a(Format format) {
        return new a();
    }

    @Override // androidx.media2.exoplayer.external.metadata.c
    public boolean b(Format format) {
        return "application/id3".equals(format.f53103i);
    }
}
