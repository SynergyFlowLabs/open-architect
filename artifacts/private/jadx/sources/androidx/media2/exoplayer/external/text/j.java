package androidx.media2.exoplayer.external.text;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class j extends androidx.media2.exoplayer.external.decoder.f implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private e f56774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f56775e;

    @Override // androidx.media2.exoplayer.external.text.e
    public long b(int index) {
        return ((e) androidx.media2.exoplayer.external.util.a.g(this.f56774d)).b(index) + this.f56775e;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int k() {
        return ((e) androidx.media2.exoplayer.external.util.a.g(this.f56774d)).k();
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int l(long timeUs) {
        return ((e) androidx.media2.exoplayer.external.util.a.g(this.f56774d)).l(timeUs - this.f56775e);
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public List<b> n(long timeUs) {
        return ((e) androidx.media2.exoplayer.external.util.a.g(this.f56774d)).n(timeUs - this.f56775e);
    }

    @Override // androidx.media2.exoplayer.external.decoder.a
    public void o() {
        super.o();
        this.f56774d = null;
    }

    @Override // androidx.media2.exoplayer.external.decoder.f
    public abstract void x();

    public void z(long timeUs, e subtitle, long subsampleOffsetUs) {
        this.f53793b = timeUs;
        this.f56774d = subtitle;
        if (subsampleOffsetUs != Long.MAX_VALUE) {
            timeUs = subsampleOffsetUs;
        }
        this.f56775e = timeUs;
    }
}
