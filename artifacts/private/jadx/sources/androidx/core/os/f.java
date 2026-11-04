package androidx.core.os;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f48038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f48039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f48040d;

    public interface a {
        void onCancel();
    }

    private void f() {
        while (this.f48040d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f48037a) {
                    return;
                }
                this.f48037a = true;
                this.f48040d = true;
                a aVar = this.f48038b;
                Object obj = this.f48039c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f48040d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f48040d = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @androidx.annotation.p0
    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f48039c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f48039c = cancellationSignal;
                    if (this.f48037a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f48039c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public boolean c() {
        boolean z10;
        synchronized (this) {
            z10 = this.f48037a;
        }
        return z10;
    }

    public void d(@androidx.annotation.p0 a aVar) {
        synchronized (this) {
            try {
                f();
                if (this.f48038b == aVar) {
                    return;
                }
                this.f48038b = aVar;
                if (this.f48037a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        if (c()) {
            throw new u();
        }
    }
}
