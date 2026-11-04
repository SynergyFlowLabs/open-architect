package androidx.media2.exoplayer.external.trackselection;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m[] f57225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57226c;

    public p(m... trackSelections) {
        this.f57225b = trackSelections;
        this.f57224a = trackSelections.length;
    }

    @p0
    public m a(int index) {
        return this.f57225b[index];
    }

    public m[] b() {
        return (m[]) this.f57225b.clone();
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            return Arrays.equals(this.f57225b, ((p) obj).f57225b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f57226c == 0) {
            this.f57226c = 527 + Arrays.hashCode(this.f57225b);
        }
        return this.f57226c;
    }
}
