package androidx.media3.extractor.text.cea;

import androidx.media3.extractor.text.j;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.media3.common.text.a> f68443a;

    public f(List<androidx.media3.common.text.a> list) {
        this.f68443a = list;
    }

    @Override // androidx.media3.extractor.text.j
    public long b(int i10) {
        androidx.media3.common.util.a.a(i10 == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.j
    public int k() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.j
    public int l(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // androidx.media3.extractor.text.j
    public List<androidx.media3.common.text.a> n(long j10) {
        return j10 >= 0 ? this.f68443a : Collections.EMPTY_LIST;
    }
}
