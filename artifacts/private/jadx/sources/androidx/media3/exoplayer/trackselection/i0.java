package androidx.media3.exoplayer.trackselection;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0[] f65707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65708c;

    public i0(h0... h0VarArr) {
        this.f65707b = h0VarArr;
        this.f65706a = h0VarArr.length;
    }

    @p0
    public h0 a(int i10) {
        return this.f65707b[i10];
    }

    public h0[] b() {
        return (h0[]) this.f65707b.clone();
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f65707b, ((i0) obj).f65707b);
    }

    public int hashCode() {
        if (this.f65708c == 0) {
            this.f65708c = 527 + Arrays.hashCode(this.f65707b);
        }
        return this.f65708c;
    }
}
