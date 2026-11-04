package androidx.media2.session;

import androidx.media2.common.Rating;

/* JADX INFO: loaded from: classes2.dex */
public final class HeartRating implements Rating {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f58495q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f58496r;

    public HeartRating() {
    }

    @Override // androidx.media2.common.Rating
    public boolean b() {
        return this.f58495q;
    }

    public boolean d() {
        return this.f58496r;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        if (this.f58496r != heartRating.f58496r || this.f58495q != heartRating.f58495q) {
            return false;
        }
        int i10 = 7 ^ 1;
        return true;
    }

    public int hashCode() {
        return androidx.core.util.o.b(Boolean.valueOf(this.f58495q), Boolean.valueOf(this.f58496r));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HeartRating: ");
        if (this.f58495q) {
            str = "hasHeart=" + this.f58496r;
        } else {
            str = "unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public HeartRating(boolean z10) {
        this.f58496r = z10;
    }
}
