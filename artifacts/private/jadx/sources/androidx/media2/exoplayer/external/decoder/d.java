package androidx.media2.exoplayer.external.decoder;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53784i;

    public synchronized void a() {
    }

    public void b(d other) {
        this.f53776a += other.f53776a;
        this.f53777b += other.f53777b;
        this.f53778c += other.f53778c;
        this.f53779d += other.f53779d;
        this.f53780e += other.f53780e;
        this.f53781f += other.f53781f;
        this.f53782g += other.f53782g;
        this.f53783h = Math.max(this.f53783h, other.f53783h);
        this.f53784i += other.f53784i;
    }
}
