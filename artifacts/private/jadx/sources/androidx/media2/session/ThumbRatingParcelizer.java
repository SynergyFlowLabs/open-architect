package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class ThumbRatingParcelizer {
    public static ThumbRating read(androidx.versionedparcelable.e eVar) {
        ThumbRating thumbRating = new ThumbRating();
        thumbRating.f58724q = eVar.m(thumbRating.f58724q, 1);
        thumbRating.f58725r = eVar.m(thumbRating.f58725r, 2);
        return thumbRating;
    }

    public static void write(ThumbRating thumbRating, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.n0(thumbRating.f58724q, 1);
        eVar.n0(thumbRating.f58725r, 2);
    }
}
