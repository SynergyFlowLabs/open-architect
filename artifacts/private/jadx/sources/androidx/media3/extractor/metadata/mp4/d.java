package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import com.google.common.primitives.g;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f67604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67605b;

    public d(float f10, int i10) {
        this.f67604a = f10;
        this.f67605b = i10;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f67604a == dVar.f67604a && this.f67605b == dVar.f67605b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + g.j(this.f67604a)) * 31) + this.f67605b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f67604a + ", svcTemporalLayerCount=" + this.f67605b;
    }
}
