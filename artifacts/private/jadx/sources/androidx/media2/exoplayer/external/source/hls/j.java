package androidx.media2.exoplayer.external.source.hls;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.source.v0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class j implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f56027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f56028c = -1;

    public j(n sampleStreamWrapper, int trackGroupIndex) {
        this.f56027b = sampleStreamWrapper;
        this.f56026a = trackGroupIndex;
    }

    private boolean c() {
        int i10 = this.f56028c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public void a() throws IOException {
        int i10 = this.f56028c;
        if (i10 == -2) {
            throw new o(this.f56027b.m().a(this.f56026a).a(0).f53103i);
        }
        if (i10 == -1) {
            this.f56027b.O();
        } else {
            if (i10 != -3) {
                this.f56027b.P(i10);
            }
        }
    }

    public void b() {
        androidx.media2.exoplayer.external.util.a.a(this.f56028c == -1);
        this.f56028c = this.f56027b.v(this.f56026a);
    }

    public void d() {
        if (this.f56028c != -1) {
            this.f56027b.f0(this.f56026a);
            this.f56028c = -1;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public boolean isReady() {
        if (this.f56028c != -3) {
            return c() && this.f56027b.L(this.f56028c);
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public int l(long positionUs) {
        if (c()) {
            return this.f56027b.e0(this.f56028c, positionUs);
        }
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.source.v0
    public int q(d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean requireFormat) {
        if (this.f56028c == -3) {
            buffer.c(4);
            return -4;
        }
        if (c()) {
            return this.f56027b.W(this.f56028c, formatHolder, buffer, requireFormat);
        }
        return -3;
    }
}
