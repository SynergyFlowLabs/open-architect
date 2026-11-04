package androidx.media2.common;

import android.graphics.Bitmap;
import androidx.annotation.b1;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class BitmapEntryParcelizer {
    public static MediaMetadata.BitmapEntry read(e eVar) {
        MediaMetadata.BitmapEntry bitmapEntry = new MediaMetadata.BitmapEntry();
        bitmapEntry.f53028q = eVar.d0(bitmapEntry.f53028q, 1);
        bitmapEntry.f53029r = (Bitmap) eVar.W(bitmapEntry.f53029r, 2);
        return bitmapEntry;
    }

    public static void write(MediaMetadata.BitmapEntry bitmapEntry, e eVar) {
        eVar.j0(false, false);
        eVar.f1(bitmapEntry.f53028q, 1);
        eVar.X0(bitmapEntry.f53029r, 2);
    }
}
