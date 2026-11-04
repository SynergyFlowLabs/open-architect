package androidx.media3.extractor.text.ttml;

import androidx.annotation.l1;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.text.j;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f68787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f68788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, g> f68789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, e> f68790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f68791e;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f68787a = cVar;
        this.f68790d = map2;
        this.f68791e = map3;
        this.f68789c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f68788b = cVar.j();
    }

    @l1
    Map<String, g> a() {
        return this.f68789c;
    }

    @Override // androidx.media3.extractor.text.j
    public long b(int i10) {
        return this.f68788b[i10];
    }

    @l1
    c c() {
        return this.f68787a;
    }

    @Override // androidx.media3.extractor.text.j
    public int k() {
        return this.f68788b.length;
    }

    @Override // androidx.media3.extractor.text.j
    public int l(long j10) {
        int iJ = k1.j(this.f68788b, j10, false, false);
        if (iJ < this.f68788b.length) {
            return iJ;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.j
    public List<androidx.media3.common.text.a> n(long j10) {
        return this.f68787a.h(j10, this.f68789c, this.f68790d, this.f68791e);
    }
}
