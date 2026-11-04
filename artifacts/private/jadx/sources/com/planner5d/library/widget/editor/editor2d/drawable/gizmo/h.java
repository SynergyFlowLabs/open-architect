package com.planner5d.library.widget.editor.editor2d.drawable.gizmo;

import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.services.c0;

/* JADX INFO: loaded from: classes12.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Item f254951a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f254952b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f254953c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f254954d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f254955e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    k f254956f = new k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    k f254957g = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    k f254958h = new k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    k f254959i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f254960j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final c0 f254961k = new c0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final k f254962l = new k(1.0f, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m f254963m = new m(1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f254964n = new k();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ItemLayout f254965o = new ItemLayout();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final m f254966p = new m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor2d.drawable.pr.g f254967q = new com.planner5d.library.widget.editor.editor2d.drawable.pr.g();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    com.planner5d.library.widget.editor.editor2d.painter.d.c f254968r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f254969s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f254970t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor2d.painter.d.c f254971u = null;

    h() {
    }

    private void a(Item item) {
        if (item instanceof ItemDoor) {
            ((ItemDoor) item).getLayoutWithOffset(this.f254965o, false);
        } else if (item instanceof ItemRoom) {
            ((ItemRoom) item).getLayoutForRotation(this.f254965o);
        } else {
            item.getLayout(this.f254965o);
        }
    }

    long b() {
        return this.f254969s;
    }

    void c(com.planner5d.library.widget.editor.editor2d.painter.d.c cVar) {
        this.f254971u = cVar;
        this.f254970t = true;
    }

    boolean d(com.planner5d.library.widget.editor.editor2d.painter.d dVar, Item item) {
        boolean z10 = (item instanceof ItemRoom) && ((ItemRoom) item).isInRotation();
        this.f254955e = z10;
        boolean z11 = item instanceof ItemNs;
        if (!z11 && !(item instanceof ItemPr) && !(item instanceof ItemUnknown) && !z10) {
            this.f254951a = null;
            return false;
        }
        float fP = dVar.p();
        if (!this.f254970t && this.f254951a == item && fP == this.f254960j) {
            a(item);
            boolean zEquals = this.f254954d ? this.f254965o.getScale(this.f254966p).equals(this.f254963m) : this.f254965o.getScale(this.f254964n).equals(this.f254962l);
            if (this.f254965o.getRotationY() == this.f254952b && zEquals && this.f254965o.getPosition(this.f254964n).equals(this.f254956f)) {
                return false;
            }
        }
        this.f254968r = this.f254971u;
        com.planner5d.library.widget.editor.editor2d.painter.d.C1727d c1727dN = dVar.n();
        this.f254953c = (c1727dN == null || !c1727dN.f()) ? 0 : c1727dN.f255206d.intValue();
        this.f254960j = fP;
        this.f254951a = item;
        a(item);
        this.f254952b = this.f254965o.getRotationY();
        this.f254965o.getScale(this.f254962l);
        this.f254965o.getScale(this.f254963m);
        this.f254965o.getPosition(this.f254956f);
        c.q(item, this.f254965o, this.f254958h);
        c.q(item, this.f254965o, this.f254957g);
        this.f254959i.V(this.f254957g);
        if (z11) {
            this.f254959i.U(((ItemNs) item).getSize(this.f254966p).f180482a, this.f254966p.f180483b);
            if (item instanceof ItemWindow) {
                k kVar = this.f254959i;
                kVar.f180481b = kVar.f180480a * this.f254965o.getScaleX();
            } else {
                this.f254959i.S(this.f254965o.getScaleX(), this.f254965o.getScaleY());
            }
        }
        boolean z12 = (this.f254965o.getRotationX() == 0.0f && this.f254965o.getRotationZ() == 0.0f) ? false : true;
        this.f254954d = z12;
        if ((item instanceof ItemPr) && z12) {
            synchronized (this.f254967q) {
                try {
                    c0 c0VarA = this.f254967q.v(this.f254965o).a();
                    this.f254958h.U(c0VarA.k(), c0VarA.e());
                    c.p(this.f254961k, fP, this.f254956f, c0VarA);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            c.o(this.f254961k, fP, this.f254956f, this.f254957g, this.f254952b);
        }
        this.f254970t = false;
        this.f254969s++;
        return true;
    }
}
