package androidx.media3.container;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f62240a;

    public k(byte[] bArr) {
        this.f62240a = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            return Arrays.equals(this.f62240a, ((k) obj).f62240a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f62240a);
    }

    public String toString() {
        return "XMP: " + k1.v2(this.f62240a);
    }
}
