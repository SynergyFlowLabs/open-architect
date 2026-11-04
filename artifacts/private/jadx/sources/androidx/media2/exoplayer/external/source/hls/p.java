package androidx.media2.exoplayer.external.source.hls;

import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<k0> f56075a = new SparseArray<>();

    public k0 a(int discontinuitySequence) {
        k0 k0Var = this.f56075a.get(discontinuitySequence);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(Long.MAX_VALUE);
        this.f56075a.put(discontinuitySequence, k0Var2);
        return k0Var2;
    }

    public void b() {
        this.f56075a.clear();
    }
}
