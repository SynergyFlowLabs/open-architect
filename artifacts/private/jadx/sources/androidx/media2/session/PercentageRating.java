package androidx.media2.session;

import androidx.media2.common.Rating;

/* JADX INFO: loaded from: classes2.dex */
public final class PercentageRating implements Rating {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f58650r = -1.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f58651q;

    public PercentageRating() {
        this.f58651q = -1.0f;
    }

    @Override // androidx.media2.common.Rating
    public boolean b() {
        return this.f58651q != -1.0f;
    }

    public float d() {
        return this.f58651q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.f58651q == ((PercentageRating) obj).f58651q;
    }

    public int hashCode() {
        return androidx.core.util.o.b(Float.valueOf(this.f58651q));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PercentageRating: ");
        if (b()) {
            str = "percentage=" + this.f58651q;
        } else {
            str = "unrated";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public PercentageRating(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            this.f58651q = f10;
            return;
        }
        throw new IllegalArgumentException("percent should be in the rage of [0, 100]");
    }
}
