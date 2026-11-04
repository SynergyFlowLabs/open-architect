package androidx.media3.common.util;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f61573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61574b;

    public m() {
        this(j.f61520a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f61574b) {
            wait();
        }
    }

    public synchronized boolean b(long j10) throws InterruptedException {
        try {
            if (j10 <= 0) {
                return this.f61574b;
            }
            long jB = this.f61573a.b();
            long j11 = j10 + jB;
            if (j11 < jB) {
                a();
            } else {
                while (!this.f61574b && jB < j11) {
                    wait(j11 - jB);
                    jB = this.f61573a.b();
                }
            }
            return this.f61574b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        boolean z10 = false;
        while (!this.f61574b) {
            try {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        boolean z10;
        z10 = this.f61574b;
        this.f61574b = false;
        return z10;
    }

    public synchronized boolean e() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f61574b;
    }

    public synchronized boolean f() {
        try {
            if (this.f61574b) {
                return false;
            }
            this.f61574b = true;
            notifyAll();
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public m(j jVar) {
        this.f61573a = jVar;
    }
}
