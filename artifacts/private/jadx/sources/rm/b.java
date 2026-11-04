package rm;

import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f366674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f366675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f366676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f366677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f366678e;

    public b() {
        this.f366674a = 1;
        this.f366676c = new byte[1];
        this.f366677d = new byte[4];
        this.f366678e = new byte[8];
        this.f366675b = null;
    }

    public byte a() throws IOException {
        this.f366675b.read(this.f366676c);
        return this.f366676c[0];
    }

    public double b() throws IOException {
        this.f366675b.read(this.f366678e);
        return c.a(this.f366678e, this.f366674a);
    }

    public int c() throws IOException {
        this.f366675b.read(this.f366677d);
        return c.b(this.f366677d, this.f366674a);
    }

    public long d() throws IOException {
        this.f366675b.read(this.f366678e);
        return c.c(this.f366678e, this.f366674a);
    }

    public void e(d dVar) {
        this.f366675b = dVar;
    }

    public void f(int i10) {
        this.f366674a = i10;
    }

    public b(d dVar) {
        this.f366674a = 1;
        this.f366676c = new byte[1];
        this.f366677d = new byte[4];
        this.f366678e = new byte[8];
        this.f366675b = dVar;
    }
}
