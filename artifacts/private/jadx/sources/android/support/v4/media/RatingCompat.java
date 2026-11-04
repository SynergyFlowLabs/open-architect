package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9467d = "Rating";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9468e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9469f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9470g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9471h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9472i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9473j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9474k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f9475l = -1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f9478c;

    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel p10) {
            return new RatingCompat(p10.readInt(), p10.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int size) {
            return new RatingCompat[size];
        }
    }

    @w0(19)
    private static class b {
        private b() {
        }

        @u
        static float a(Rating rating) {
            return rating.getPercentRating();
        }

        @u
        static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        @u
        static float c(Rating rating) {
            return rating.getStarRating();
        }

        @u
        static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        @u
        static boolean e(Rating rating) {
            return rating.isRated();
        }

        @u
        static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        @u
        static Rating g(boolean hasHeart) {
            return Rating.newHeartRating(hasHeart);
        }

        @u
        static Rating h(float percent) {
            return Rating.newPercentageRating(percent);
        }

        @u
        static Rating i(int starRatingStyle, float starRating) {
            return Rating.newStarRating(starRatingStyle, starRating);
        }

        @u
        static Rating j(boolean thumbIsUp) {
            return Rating.newThumbRating(thumbIsUp);
        }

        @u
        static Rating k(int ratingStyle) {
            return Rating.newUnratedRating(ratingStyle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface d {
    }

    RatingCompat(int ratingStyle, float rating) {
        this.f9476a = ratingStyle;
        this.f9477b = rating;
    }

    public static RatingCompat a(Object ratingObj) {
        RatingCompat ratingCompatN = null;
        if (ratingObj != null) {
            Rating rating = (Rating) ratingObj;
            int iB = b.b(rating);
            if (b.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompatN = j(b.d(rating));
                        break;
                    case 2:
                        ratingCompatN = m(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatN = l(iB, b.c(rating));
                        break;
                    case 6:
                        ratingCompatN = k(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatN = n(iB);
            }
            ratingCompatN.f9478c = ratingObj;
        }
        return ratingCompatN;
    }

    public static RatingCompat j(boolean hasHeart) {
        return new RatingCompat(1, hasHeart ? 1.0f : 0.0f);
    }

    public static RatingCompat k(float percent) {
        if (percent >= 0.0f && percent <= 100.0f) {
            return new RatingCompat(6, percent);
        }
        return null;
    }

    public static RatingCompat l(int starRatingStyle, float starRating) {
        float f10;
        if (starRatingStyle == 3) {
            f10 = 3.0f;
        } else if (starRatingStyle == 4) {
            f10 = 4.0f;
        } else {
            if (starRatingStyle != 5) {
                return null;
            }
            f10 = 5.0f;
        }
        if (starRating < 0.0f || starRating > f10) {
            return null;
        }
        return new RatingCompat(starRatingStyle, starRating);
    }

    public static RatingCompat m(boolean thumbIsUp) {
        return new RatingCompat(2, thumbIsUp ? 1.0f : 0.0f);
    }

    public static RatingCompat n(int ratingStyle) {
        switch (ratingStyle) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(ratingStyle, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.f9476a == 6 && h()) {
            return this.f9477b;
        }
        return -1.0f;
    }

    public Object c() {
        if (this.f9478c == null) {
            if (h()) {
                int i10 = this.f9476a;
                switch (i10) {
                    case 1:
                        this.f9478c = b.g(g());
                        break;
                    case 2:
                        this.f9478c = b.j(i());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f9478c = b.i(i10, f());
                        break;
                    case 6:
                        this.f9478c = b.h(b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f9478c = b.k(this.f9476a);
            }
        }
        return this.f9478c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f9476a;
    }

    public int e() {
        return this.f9476a;
    }

    public float f() {
        int i10 = this.f9476a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && h()) {
            return this.f9477b;
        }
        return -1.0f;
    }

    public boolean g() {
        return this.f9476a == 1 && this.f9477b == 1.0f;
    }

    public boolean h() {
        return this.f9477b >= 0.0f;
    }

    public boolean i() {
        return this.f9476a == 2 && this.f9477b == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f9476a);
        sb2.append(" rating=");
        float f10 = this.f9477b;
        boolean z10 = false | false;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f9476a);
        dest.writeFloat(this.f9477b);
    }
}
