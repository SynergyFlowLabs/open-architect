package androidx.media2.exoplayer.external.trackselection;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.v0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0[] f57230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f57231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f57232d;

    public s(v0[] rendererConfigurations, m[] selections, Object info) {
        this.f57230b = rendererConfigurations;
        this.f57231c = new p(selections);
        this.f57232d = info;
        this.f57229a = rendererConfigurations.length;
    }

    public boolean a(@p0 s other) {
        if (other != null && other.f57231c.f57224a == this.f57231c.f57224a) {
            for (int i10 = 0; i10 < this.f57231c.f57224a; i10++) {
                if (!b(other, i10)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean b(@p0 s other, int index) {
        return other != null && q0.b(this.f57230b[index], other.f57230b[index]) && q0.b(this.f57231c.a(index), other.f57231c.a(index));
    }

    public boolean c(int index) {
        return this.f57230b[index] != null;
    }
}
