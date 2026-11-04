package androidx.media3.extractor.jpeg;

import androidx.media3.extractor.c0;
import androidx.media3.extractor.s;

/* JADX INFO: loaded from: classes3.dex */
final class d extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f67414c;

    public d(s sVar, long j10) {
        super(sVar);
        androidx.media3.common.util.a.a(sVar.getPosition() >= j10);
        this.f67414c = j10;
    }

    @Override // androidx.media3.extractor.c0, androidx.media3.extractor.s
    public <E extends Throwable> void g(long j10, E e10) throws Throwable {
        super.g(j10 + this.f67414c, e10);
    }

    @Override // androidx.media3.extractor.c0, androidx.media3.extractor.s
    public long getLength() {
        return super.getLength() - this.f67414c;
    }

    @Override // androidx.media3.extractor.c0, androidx.media3.extractor.s
    public long getPosition() {
        return super.getPosition() - this.f67414c;
    }

    @Override // androidx.media3.extractor.c0, androidx.media3.extractor.s
    public long m() {
        return super.m() - this.f67414c;
    }
}
