package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class PercentageRatingParcelizer {
    public static PercentageRating read(androidx.versionedparcelable.e eVar) {
        PercentageRating percentageRating = new PercentageRating();
        percentageRating.f58651q = eVar.H(percentageRating.f58651q, 1);
        return percentageRating;
    }

    public static void write(PercentageRating percentageRating, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.I0(percentageRating.f58651q, 1);
    }
}
