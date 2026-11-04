package androidx.media2.common;

import androidx.annotation.b1;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class MediaItemParcelizer {
    public static MediaItem read(e eVar) {
        MediaItem mediaItem = new MediaItem();
        mediaItem.f52986r = (MediaMetadata) eVar.h0(mediaItem.f52986r, 1);
        mediaItem.f52987s = eVar.R(mediaItem.f52987s, 2);
        int i10 = 2 & 3;
        mediaItem.f52988t = eVar.R(mediaItem.f52988t, 3);
        mediaItem.d();
        return mediaItem;
    }

    public static void write(MediaItem mediaItem, e eVar) {
        eVar.j0(false, false);
        mediaItem.f(eVar.i());
        eVar.m1(mediaItem.f52986r, 1);
        eVar.R0(mediaItem.f52987s, 2);
        eVar.R0(mediaItem.f52988t, 3);
    }
}
