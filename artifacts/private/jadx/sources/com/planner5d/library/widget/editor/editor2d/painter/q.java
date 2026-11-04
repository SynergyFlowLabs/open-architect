package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.PointF;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.services.c0;
import com.planner5d.library.widget.editor.helper.r3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
class q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final com.planner5d.library.math.k f255274q = new com.planner5d.library.math.k(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f255275a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Item f255276b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f255277c = new c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ItemLayout f255278d = new ItemLayout();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f255279e = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f255280f = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.k f255281g = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.math.k f255282h = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.math.k f255283i = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.planner5d.library.math.k f255284j = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.planner5d.library.math.k f255285k = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d.c f255286l = d.c.ResizeXYFromTopLeft;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c0.b f255287m = c0.b.Left;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f255288n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r3 f255289o = new r3();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.planner5d.library.widget.editor.projectresources.viewoptions.b f255290p = null;

    q() {
    }

    public void a(PointF pointF) {
        com.planner5d.library.math.c.a aVar = com.planner5d.library.math.c.f180466e;
        com.planner5d.library.math.k kVarU = this.f255282h.U(pointF.x, pointF.y);
        com.planner5d.library.math.k kVar = this.f255283i;
        com.planner5d.library.math.k kVar2 = this.f255279e;
        com.planner5d.library.math.k kVarU2 = kVar.U(kVar2.f180480a, kVar2.f180481b);
        com.planner5d.library.math.k kVar3 = this.f255284j;
        com.planner5d.library.math.k kVar4 = this.f255279e;
        com.planner5d.library.math.k kVarU3 = kVar3.U(kVar4.f180480a, kVar4.f180481b);
        com.planner5d.library.math.k kVar5 = this.f255280f;
        float fH = aVar.h(kVarU, kVarU2, kVarU3.a(kVar5.f180480a, kVar5.f180481b));
        d.c cVar = this.f255286l;
        if (cVar == d.c.ResizeXFromRight || cVar == d.c.ResizeXFromLeft || cVar == d.c.ResizeYFromBottom || cVar == d.c.ResizeYFromTop) {
            this.f255277c.t(this.f255287m, Math.max(f255274q.f180480a, this.f255288n + fH));
            this.f255289o.h(this.f255290p, this.f255277c, this.f255287m);
        } else if (cVar == d.c.ResizeXYFromTopLeft) {
            this.f255277c.s(Math.max(f255274q.F(), this.f255288n + fH));
            this.f255289o.g(this.f255290p, this.f255277c);
        }
        this.f255278d.setPosition(this.f255277c.b(this.f255281g));
        if (this.f255276b instanceof ItemWindow) {
            this.f255278d.setScale(this.f255277c.e() / this.f255285k.f180481b, 1.0f);
        } else {
            this.f255278d.setScale(this.f255277c.k() / this.f255285k.f180480a, this.f255277c.e() / this.f255285k.f180481b);
        }
        this.f255276b.setLayout(this.f255278d);
    }

    public boolean b() {
        return this.f255275a;
    }

    public Item[] c(@fj.h Item item, PointF pointF, d.c cVar, @NotNull com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        if (item == null) {
            return null;
        }
        this.f255275a = true;
        this.f255290p = bVar;
        this.f255279e.U(pointF.x, pointF.y);
        item.getLayout(this.f255278d);
        this.f255286l = cVar;
        this.f255277c.q(this.f255278d.getPosition(this.f255281g), com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c.q(item, this.f255278d, this.f255285k)).n(this.f255278d.getRotationY());
        d.c cVar2 = this.f255286l;
        d.c cVar3 = d.c.ResizeXFromRight;
        float f10 = -1.0f;
        if (cVar2 == cVar3 || cVar2 == d.c.ResizeXFromLeft) {
            this.f255287m = cVar2 == cVar3 ? c0.b.Right : c0.b.Left;
            this.f255288n = this.f255277c.k();
            com.planner5d.library.math.k kVar = this.f255280f;
            if (this.f255287m != c0.b.Right) {
                f10 = 1.0f;
            }
            kVar.U(f10, 0.0f);
        } else {
            d.c cVar4 = d.c.ResizeYFromBottom;
            if (cVar2 == cVar4 || cVar2 == d.c.ResizeYFromTop) {
                this.f255287m = cVar2 == cVar4 ? c0.b.Bottom : c0.b.Top;
                this.f255288n = this.f255277c.e();
                this.f255280f.U(0.0f, this.f255287m != c0.b.Bottom ? 1.0f : -1.0f);
            } else {
                this.f255288n = this.f255277c.d();
                this.f255280f.U(1.0f, 1.0f);
            }
        }
        this.f255280f.N(this.f255278d.getRotationY());
        item.getSize(this.f255285k, false);
        this.f255276b = item;
        return new Item[]{item};
    }

    public void d() {
        this.f255276b = null;
        this.f255275a = false;
    }
}
