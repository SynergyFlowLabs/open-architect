package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class StarRatingParcelizer {
    public static StarRating read(androidx.versionedparcelable.e eVar) {
        StarRating starRating = new StarRating();
        starRating.f58722q = eVar.M(starRating.f58722q, 1);
        int i10 = 6 | 2;
        starRating.f58723r = eVar.H(starRating.f58723r, 2);
        return starRating;
    }

    public static void write(StarRating starRating, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.M0(starRating.f58722q, 1);
        eVar.I0(starRating.f58723r, 2);
    }
}
