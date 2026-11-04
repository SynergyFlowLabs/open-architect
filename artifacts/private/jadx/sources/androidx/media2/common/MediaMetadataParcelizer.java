package androidx.media2.common;

import androidx.annotation.b1;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class MediaMetadataParcelizer {
    public static MediaMetadata read(e eVar) {
        MediaMetadata mediaMetadata = new MediaMetadata();
        mediaMetadata.f53025r = eVar.q(mediaMetadata.f53025r, 1);
        mediaMetadata.f53026s = (ParcelImplListSlice) eVar.W(mediaMetadata.f53026s, 2);
        mediaMetadata.d();
        return mediaMetadata;
    }

    public static void write(MediaMetadata mediaMetadata, e eVar) {
        eVar.j0(false, false);
        mediaMetadata.f(eVar.i());
        eVar.r0(mediaMetadata.f53025r, 1);
        eVar.X0(mediaMetadata.f53026s, 2);
    }
}
