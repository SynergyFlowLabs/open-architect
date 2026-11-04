package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53507c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f53509b;

    public v(int effectId, float sendLevel) {
        this.f53508a = effectId;
        this.f53509b = sendLevel;
    }

    public boolean equals(@p0 Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && v.class == o10.getClass()) {
            v vVar = (v) o10;
            if (this.f53508a == vVar.f53508a && Float.compare(vVar.f53509b, this.f53509b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f53508a) * 31) + Float.floatToIntBits(this.f53509b);
    }
}
