package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f69561a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f69562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f69564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69567g;

    public void a(u0 u0Var, @androidx.annotation.p0 u0.a aVar) {
        if (this.f69563c > 0) {
            u0Var.g(this.f69564d, this.f69565e, this.f69566f, this.f69567g, aVar);
            this.f69563c = 0;
        }
    }

    public void b() {
        this.f69562b = false;
        this.f69563c = 0;
    }

    public void c(u0 u0Var, long j10, int i10, int i11, int i12, @androidx.annotation.p0 u0.a aVar) {
        androidx.media3.common.util.a.j(this.f69567g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f69562b) {
            int i13 = this.f69563c;
            int i14 = i13 + 1;
            this.f69563c = i14;
            if (i13 == 0) {
                this.f69564d = j10;
                this.f69565e = i10;
                this.f69566f = 0;
            }
            this.f69566f += i11;
            this.f69567g = i12;
            if (i14 >= 16) {
                a(u0Var, aVar);
            }
        }
    }

    public void d(s sVar) throws IOException {
        if (this.f69562b) {
            return;
        }
        sVar.i(this.f69561a, 0, 10);
        sVar.l();
        if (b.j(this.f69561a) == 0) {
            return;
        }
        this.f69562b = true;
    }
}
