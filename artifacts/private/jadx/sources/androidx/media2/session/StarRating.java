package androidx.media2.session;

import androidx.annotation.g0;
import androidx.media2.common.Rating;

/* JADX INFO: loaded from: classes2.dex */
public final class StarRating implements Rating {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f58721s = -1.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f58722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f58723r;

    StarRating() {
    }

    @Override // androidx.media2.common.Rating
    public boolean b() {
        return this.f58723r >= 0.0f;
    }

    public int d() {
        return this.f58722q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.f58722q == starRating.f58722q && this.f58723r == starRating.f58723r;
    }

    public float f() {
        return this.f58723r;
    }

    public int hashCode() {
        return androidx.core.util.o.b(Integer.valueOf(this.f58722q), Float.valueOf(this.f58723r));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StarRating: maxStars=");
        sb2.append(this.f58722q);
        if (b()) {
            str = ", starRating=" + this.f58723r;
        } else {
            str = ", unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public StarRating(@g0(from = 1) int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxStars should be a positive integer");
        }
        this.f58722q = i10;
        this.f58723r = -1.0f;
    }

    public StarRating(@g0(from = 1) int i10, float f10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxStars should be a positive integer");
        }
        if (f10 < 0.0f || f10 > i10) {
            throw new IllegalArgumentException("starRating is out of range [0, maxStars]");
        }
        this.f58722q = i10;
        this.f58723r = f10;
    }
}
