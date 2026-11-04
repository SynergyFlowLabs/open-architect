package androidx.media2.exoplayer.external.text.subrip;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.e;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.text.b[] f56831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f56832b;

    public b(androidx.media2.exoplayer.external.text.b[] cues, long[] cueTimesUs) {
        this.f56831a = cues;
        this.f56832b = cueTimesUs;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public long b(int index) {
        androidx.media2.exoplayer.external.util.a.a(index >= 0);
        androidx.media2.exoplayer.external.util.a.a(index < this.f56832b.length);
        return this.f56832b[index];
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int k() {
        return this.f56832b.length;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int l(long timeUs) {
        int iE = q0.e(this.f56832b, timeUs, false, false);
        if (iE < this.f56832b.length) {
            return iE;
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public List<androidx.media2.exoplayer.external.text.b> n(long timeUs) {
        androidx.media2.exoplayer.external.text.b bVar;
        int iH = q0.h(this.f56832b, timeUs, true, false);
        return (iH == -1 || (bVar = this.f56831a[iH]) == androidx.media2.exoplayer.external.text.b.f56537o) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
    }
}
