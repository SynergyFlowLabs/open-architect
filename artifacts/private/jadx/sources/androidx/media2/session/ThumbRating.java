package androidx.media2.session;

import androidx.media2.common.Rating;

/* JADX INFO: loaded from: classes2.dex */
public final class ThumbRating implements Rating {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f58724q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f58725r;

    public ThumbRating() {
    }

    @Override // androidx.media2.common.Rating
    public boolean b() {
        return this.f58724q;
    }

    public boolean d() {
        return this.f58725r;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.f58725r == thumbRating.f58725r && this.f58724q == thumbRating.f58724q;
    }

    public int hashCode() {
        return androidx.core.util.o.b(Boolean.valueOf(this.f58724q), Boolean.valueOf(this.f58725r));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ThumbRating: ");
        if (this.f58724q) {
            str = "isThumbUp=" + this.f58725r;
        } else {
            str = "unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public ThumbRating(boolean z10) {
        this.f58725r = z10;
    }
}
