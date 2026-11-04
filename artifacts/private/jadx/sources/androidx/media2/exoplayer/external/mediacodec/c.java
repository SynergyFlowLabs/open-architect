package androidx.media2.exoplayer.external.mediacodec;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f55390a = new a();

    class a implements c {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.c
        public List<androidx.media2.exoplayer.external.mediacodec.a> a(String mimeType, boolean requiresSecureDecoder, boolean requiresTunnelingDecoder) throws h.c {
            return h.j(mimeType, requiresSecureDecoder, requiresTunnelingDecoder);
        }

        @Override // androidx.media2.exoplayer.external.mediacodec.c
        @p0
        public androidx.media2.exoplayer.external.mediacodec.a b() throws h.c {
            return h.o();
        }
    }

    List<androidx.media2.exoplayer.external.mediacodec.a> a(String mimeType, boolean requiresSecureDecoder, boolean requiresTunnelingDecoder) throws h.c;

    @p0
    androidx.media2.exoplayer.external.mediacodec.a b() throws h.c;
}
