package androidx.media3.container;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62102a;

    public d(int i10) {
        androidx.media3.common.util.a.b(i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270, "Unsupported orientation");
        this.f62102a = i10;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f62102a == ((d) obj).f62102a;
    }

    public int hashCode() {
        return 527 + Integer.hashCode(this.f62102a);
    }

    public String toString() {
        return "Orientation= " + this.f62102a;
    }
}
