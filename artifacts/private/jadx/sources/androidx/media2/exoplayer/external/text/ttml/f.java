package androidx.media2.exoplayer.external.text.ttml;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class f implements androidx.media2.exoplayer.external.text.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f56911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f56912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, e> f56913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, c> f56914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f56915e;

    public f(b root, Map<String, e> globalStyles, Map<String, c> regionMap, Map<String, String> imageMap) {
        this.f56911a = root;
        this.f56914d = regionMap;
        this.f56915e = imageMap;
        this.f56913c = globalStyles != null ? Collections.unmodifiableMap(globalStyles) : Collections.EMPTY_MAP;
        this.f56912b = root.j();
    }

    @l1
    Map<String, e> a() {
        return this.f56913c;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public long b(int index) {
        return this.f56912b[index];
    }

    @l1
    b c() {
        return this.f56911a;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int k() {
        return this.f56912b.length;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int l(long timeUs) {
        int iE = q0.e(this.f56912b, timeUs, false, false);
        if (iE < this.f56912b.length) {
            return iE;
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public List<androidx.media2.exoplayer.external.text.b> n(long timeUs) {
        return this.f56911a.h(timeUs, this.f56913c, this.f56914d, this.f56915e);
    }
}
