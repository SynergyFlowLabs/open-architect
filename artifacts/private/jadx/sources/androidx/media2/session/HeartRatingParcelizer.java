package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class HeartRatingParcelizer {
    public static HeartRating read(androidx.versionedparcelable.e eVar) {
        HeartRating heartRating = new HeartRating();
        heartRating.f58495q = eVar.m(heartRating.f58495q, 1);
        heartRating.f58496r = eVar.m(heartRating.f58496r, 2);
        return heartRating;
    }

    public static void write(HeartRating heartRating, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.n0(heartRating.f58495q, 1);
        eVar.n0(heartRating.f58496r, 2);
    }
}
