package androidx.media3.container;

import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f62100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f62101b;

    public c(@x(from = -90.0d, to = 90.0d) float f10, @x(from = -180.0d, to = 180.0d) float f11) {
        androidx.media3.common.util.a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f62100a = f10;
        this.f62101b = f11;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f62100a == cVar.f62100a && this.f62101b == cVar.f62101b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.g.j(this.f62100a)) * 31) + com.google.common.primitives.g.j(this.f62101b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f62100a + ", longitude=" + this.f62101b;
    }
}
