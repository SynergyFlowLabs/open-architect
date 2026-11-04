package androidx.media2.exoplayer.external.extractor.mp3;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.o;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a extends androidx.media2.exoplayer.external.extractor.d implements e.b {
    public a(long inputLength, long firstFramePosition, o mpegAudioHeader) {
        super(inputLength, firstFramePosition, mpegAudioHeader.f54572f, mpegAudioHeader.f54569c);
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long d() {
        return -1L;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long e(long position) {
        return b(position);
    }
}
