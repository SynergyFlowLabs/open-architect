package androidx.media2.exoplayer.external.text.dvb;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.media2.exoplayer.external.text.b> f56771a;

    public c(List<androidx.media2.exoplayer.external.text.b> cues) {
        this.f56771a = cues;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public long b(int index) {
        return 0L;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int k() {
        return 1;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int l(long timeUs) {
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public List<androidx.media2.exoplayer.external.text.b> n(long timeUs) {
        return this.f56771a;
    }
}
