package androidx.media3.extractor.text;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class p extends androidx.media3.decoder.h implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private j f68549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f68550f;

    public void E(long j10, j jVar, long j11) {
        this.f62708b = j10;
        this.f68549e = jVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f68550f = j10;
    }

    @Override // androidx.media3.extractor.text.j
    public long b(int i10) {
        return ((j) androidx.media3.common.util.a.g(this.f68549e)).b(i10) + this.f68550f;
    }

    @Override // androidx.media3.extractor.text.j
    public int k() {
        return ((j) androidx.media3.common.util.a.g(this.f68549e)).k();
    }

    @Override // androidx.media3.extractor.text.j
    public int l(long j10) {
        return ((j) androidx.media3.common.util.a.g(this.f68549e)).l(j10 - this.f68550f);
    }

    @Override // androidx.media3.extractor.text.j
    public List<androidx.media3.common.text.a> n(long j10) {
        return ((j) androidx.media3.common.util.a.g(this.f68549e)).n(j10 - this.f68550f);
    }

    @Override // androidx.media3.decoder.h, androidx.media3.decoder.a
    public void o() {
        super.o();
        this.f68549e = null;
    }
}
