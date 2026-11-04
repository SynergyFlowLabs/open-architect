package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class e implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<q0> f57269c = new ArrayList<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private o f57271e;

    protected e(boolean isNetwork) {
        this.f57268b = isNetwork;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map a() {
        return k.a(this);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public final void c(q0 transferListener) {
        if (this.f57269c.contains(transferListener)) {
            return;
        }
        this.f57269c.add(transferListener);
        this.f57270d++;
    }

    protected final void d(int bytesTransferred) {
        o oVar = (o) androidx.media2.exoplayer.external.util.q0.i(this.f57271e);
        for (int i10 = 0; i10 < this.f57270d; i10++) {
            this.f57269c.get(i10).d(this, oVar, this.f57268b, bytesTransferred);
        }
    }

    protected final void e() {
        o oVar = (o) androidx.media2.exoplayer.external.util.q0.i(this.f57271e);
        for (int i10 = 0; i10 < this.f57270d; i10++) {
            this.f57269c.get(i10).c(this, oVar, this.f57268b);
        }
        this.f57271e = null;
    }

    protected final void g(o dataSpec) {
        for (int i10 = 0; i10 < this.f57270d; i10++) {
            this.f57269c.get(i10).a(this, dataSpec, this.f57268b);
        }
    }

    protected final void i(o dataSpec) {
        this.f57271e = dataSpec;
        for (int i10 = 0; i10 < this.f57270d; i10++) {
            this.f57269c.get(i10).h(this, dataSpec, this.f57268b);
        }
    }
}
