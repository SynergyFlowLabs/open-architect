package com.planner5d.library.widget.editor.editor2d;

import com.planner5d.library.widget.editor.editor2d.painter.x;
import com.planner5d.library.widget.editor.facade.i0;

/* JADX INFO: loaded from: classes12.dex */
class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor2d.painter.d f255129b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0 f255131d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f255128a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f255130c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f255132e = false;

    public m(com.planner5d.library.widget.editor.editor2d.painter.d dVar, i0 i0Var) {
        this.f255129b = dVar;
        this.f255131d = i0Var;
    }

    private void a() {
        synchronized (this.f255128a) {
            try {
                x xVar = this.f255130c;
                if (xVar != null) {
                    h(xVar, 3000, 250);
                }
                this.f255129b.I();
                x xVar2 = this.f255130c;
                if (xVar2 != null) {
                    xVar2.n();
                    this.f255130c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(int i10, int i11) {
        x xVar = this.f255130c;
        if (xVar != null) {
            return (xVar.f() == i10 && this.f255130c.e() == i11) ? false : true;
        }
        return false;
    }

    private void h(@fj.g x xVar, int i10, int i11) {
        synchronized (this.f255128a) {
            int i12 = 0;
            while (i12 < i10) {
                try {
                    if (xVar.h()) {
                        break;
                    }
                    try {
                        Thread.sleep(i11);
                    } catch (InterruptedException unused) {
                    }
                    i12 += i11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void b() {
        this.f255129b.i();
        a();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0017 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x0003, B:6:0x0007, B:13:0x0017, B:14:0x0032, B:11:0x0011), top: B:18:0x0003 }] */
    public void d(int i10, int i11) {
        synchronized (this.f255128a) {
            try {
                if (!this.f255132e && this.f255130c == null) {
                    this.f255132e = true;
                    a();
                    x xVar = new x(this.f255129b, this.f255131d, hashCode(), i10, i11);
                    this.f255130c = xVar;
                    xVar.start();
                } else if (c(i10, i11)) {
                    this.f255132e = true;
                    a();
                    x xVar2 = new x(this.f255129b, this.f255131d, hashCode(), i10, i11);
                    this.f255130c = xVar2;
                    xVar2.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f255128a) {
            try {
                this.f255132e = false;
                a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f() {
        a();
    }

    public void g() {
        synchronized (this.f255128a) {
            try {
                x xVar = this.f255130c;
                if (xVar != null) {
                    xVar.o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
