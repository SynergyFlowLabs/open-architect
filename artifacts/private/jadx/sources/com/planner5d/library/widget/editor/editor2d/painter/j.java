package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.widget.editor.facade.i0;

/* JADX INFO: loaded from: classes12.dex */
class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f255222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f255223c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f255221a = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f255224d = new q();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PointF f255225e = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.C1727d f255226f = null;

    public j(u uVar, i0 i0Var) {
        this.f255222b = new o(uVar);
        this.f255223c = new r(i0Var);
    }

    private boolean c(d.C1727d c1727d) {
        if (c1727d.f()) {
            return this.f255223c.b();
        }
        return c1727d.e() ? this.f255224d.b() : this.f255221a.b();
    }

    private void d(d.C1727d c1727d) {
        if (c1727d.d()) {
            this.f255221a.a(this.f255225e);
        } else if (c1727d.f()) {
            this.f255223c.a(this.f255225e);
        } else if (c1727d.e()) {
            this.f255224d.a(this.f255225e);
        }
    }

    private Item[] e(d.C1727d c1727d, d dVar) {
        if (c1727d.d()) {
            return this.f255221a.f(dVar.f255186s, c1727d.f255203a, c1727d.f255205c, dVar.l());
        }
        return c1727d.e() ? this.f255224d.c(c1727d.f255203a, c1727d.f255205c, c1727d.b(), dVar.E) : this.f255223c.c(c1727d.f255203a, c1727d.f255205c);
    }

    boolean a(d dVar) {
        return this.f255226f != null || dVar.s();
    }

    void b(d dVar, Canvas canvas, Bitmap bitmap) {
        synchronized (dVar.f255184q) {
            try {
                if (this.f255226f == null) {
                    this.f255226f = dVar.n();
                }
                d.C1727d c1727d = this.f255226f;
                if (c1727d == null) {
                    return;
                }
                if (!c(c1727d)) {
                    o oVar = this.f255222b;
                    d.C1727d c1727d2 = this.f255226f;
                    oVar.c(c1727d2.f255203a, canvas, dVar, e(c1727d2, dVar));
                    if (this.f255226f.d()) {
                        this.f255225e.set(this.f255226f.f255205c);
                    }
                }
                synchronized (dVar.f255184q) {
                    try {
                        if (!this.f255225e.equals(this.f255226f.f255204b)) {
                            this.f255225e.set(this.f255226f.f255204b);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c(this.f255226f) && this.f255226f.c()) {
                    d(this.f255226f);
                    this.f255222b.b(bitmap, dVar.f255182o, dVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    boolean f(d dVar) {
        d.C1727d c1727d = this.f255226f;
        if (c1727d == null || dVar.t(c1727d)) {
            return false;
        }
        this.f255222b.d();
        this.f255221a.g();
        this.f255223c.d();
        this.f255224d.d();
        int i10 = 4 ^ 0;
        this.f255226f = null;
        return true;
    }
}
