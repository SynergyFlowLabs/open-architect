package com.nineoldandroids.animation;

/* JADX INFO: loaded from: classes5.dex */
public class o extends q {

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private a f131262t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private long f131263u3 = -1;

    public interface a {
        void a(o oVar, long j10, long j11);
    }

    @Override // com.nineoldandroids.animation.q
    void F(float f10) {
    }

    @Override // com.nineoldandroids.animation.q
    boolean G(long j10) {
        if (this.f131287i == 0) {
            this.f131287i = 1;
            long j11 = this.f131281c;
            if (j11 < 0) {
                this.f131280b = j10;
            } else {
                this.f131280b = j10 - j11;
                this.f131281c = -1L;
            }
        }
        a aVar = this.f131262t3;
        if (aVar != null) {
            long j12 = j10 - this.f131280b;
            long j13 = this.f131263u3;
            long j14 = j13 >= 0 ? j10 - j13 : 0L;
            this.f131263u3 = j10;
            aVar.a(this, j12, j14);
        }
        return false;
    }

    @Override // com.nineoldandroids.animation.q
    void W() {
    }

    public void q0(a aVar) {
        this.f131262t3 = aVar;
    }
}
