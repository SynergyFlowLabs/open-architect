package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.r;

/* JADX INFO: loaded from: classes3.dex */
final class b extends androidx.media3.extractor.text.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f65613p;

    public b(String str, r rVar) {
        super(str);
        this.f65613p = rVar;
    }

    @Override // androidx.media3.extractor.text.i
    protected androidx.media3.extractor.text.j B(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f65613p.reset();
        }
        return this.f65613p.d(bArr, 0, i10);
    }
}
