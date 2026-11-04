package com.planner5d.library.widget.editor.editor2d.drawable.gizmo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.math.k;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditability;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.services.c0;
import com.planner5d.library.widget.editor.editor2d.o;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes12.dex */
public class c implements com.planner5d.library.widget.editor.editor2d.drawable.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f254902n = new k();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k f254903o = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k f254904p = new k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k f254905q = new k();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f254906r = new k();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final k f254907s = new k();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final k f254908t = new k();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f254909u = new RectF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f254910v = new h();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f254911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Path f254912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final e[] f254913y;

    public c() {
        Paint paint = new Paint(1);
        this.f254911w = paint;
        this.f254912x = new Path();
        this.f254913y = new e[]{new f(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromLeft, null), new f(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromRight, null), new f(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromTop, null), new f(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromBottom, null), new f(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXYFromTopLeft, 0), new g(com.planner5d.library.widget.editor.editor2d.painter.d.c.Rotate, 1)};
        paint.setColor(-14898325);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static /* synthetic */ RectF[] h(int i10) {
        return new RectF[i10];
    }

    public static /* synthetic */ RectF i(e eVar) {
        return new RectF(eVar.f254923b);
    }

    private void j(Canvas canvas) {
        canvas.drawPath(this.f254912x, this.f254911w);
    }

    private void k(e eVar, com.planner5d.library.widget.editor.editor2d.drawable.d dVar, com.planner5d.library.widget.editor.editor2d.painter.d.c cVar) {
        eVar.a(dVar, cVar != null && cVar.equals(eVar.f254924c));
    }

    private e m(com.planner5d.library.widget.editor.editor2d.painter.d.c cVar) {
        for (e eVar : this.f254913y) {
            if (eVar.f254924c == cVar) {
                return eVar;
            }
        }
        throw new RuntimeException("GizmoHandle missing: " + cVar);
    }

    private f n(com.planner5d.library.widget.editor.editor2d.painter.d.c cVar) {
        return (f) m(cVar);
    }

    public static c0 o(c0 c0Var, float f10, k kVar, k kVar2, float f11) {
        float fMax = Math.max(10.0f, 20.0f * f10) * 2.0f;
        float f12 = f10 * 75.0f;
        c0Var.o(Math.max(f12, kVar2.f180480a + fMax), Math.max(f12, kVar2.f180481b + fMax));
        c0Var.n(f11);
        c0Var.u(kVar);
        return c0Var;
    }

    public static c0 p(c0 c0Var, float f10, k kVar, c0 c0Var2) {
        float fMax = Math.max(10.0f, 20.0f * f10) * 2.0f;
        float f11 = f10 * 75.0f;
        c0Var.o(Math.max(f11, c0Var2.k() + fMax), Math.max(f11, c0Var2.e() + fMax));
        c0Var.u(kVar);
        return c0Var;
    }

    public static k q(Item item, ItemLayout itemLayout, k kVar) {
        item.getSize(kVar, true);
        if (item instanceof ItemWindow) {
            item.getSize(kVar, false).f180481b *= itemLayout.getScaleX();
            return kVar;
        }
        if (item instanceof ItemRoom) {
            ((ItemRoom) item).getSizeForRotation(kVar);
        }
        return kVar;
    }

    private boolean r() {
        com.planner5d.library.widget.editor.editor2d.painter.d.c cVar = this.f254910v.f254968r;
        if (cVar != null) {
            return cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromLeft || cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromRight || cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXYFromTopLeft;
        }
        return false;
    }

    private boolean s() {
        com.planner5d.library.widget.editor.editor2d.painter.d.c cVar = this.f254910v.f254968r;
        if (cVar != null) {
            return cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromBottom || cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromTop || cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXYFromTopLeft;
        }
        return false;
    }

    private void w(c0.b bVar, boolean z10, Float f10) {
        if (z10) {
            this.f254910v.f254961k.h(bVar, this.f254906r);
            this.f254910v.f254961k.j(bVar, this.f254907s);
        } else {
            this.f254910v.f254961k.h(bVar, this.f254907s);
            this.f254910v.f254961k.j(bVar, this.f254906r);
        }
        if (f10 == null) {
            Path path = this.f254912x;
            k kVar = this.f254907s;
            path.lineTo(kVar.f180480a, kVar.f180481b);
            return;
        }
        this.f254903o.V(this.f254907s).c0(this.f254906r);
        float f11 = this.f254910v.f254960j;
        float f12 = 6.0f * f11;
        this.f254904p.V(this.f254903o).R(0.5f).c0(this.f254902n.V(this.f254903o).M().R(f10.floatValue() / 2.0f)).b(this.f254906r);
        this.f254905q.V(this.f254904p).b(this.f254902n.V(this.f254903o).M().R(f10.floatValue()));
        this.f254912x.lineTo(this.f254902n.V(this.f254903o).M().R(-f12).b(this.f254904p).f180480a, this.f254902n.f180481b);
        this.f254908t.V(this.f254903o).M().R((f11 * 12.0f) / 2.0f).O(1);
        this.f254912x.moveTo(this.f254902n.V(this.f254904p).c0(this.f254908t).f180480a, this.f254902n.f180481b);
        this.f254912x.lineTo(this.f254902n.V(this.f254904p).b(this.f254908t).f180480a, this.f254902n.f180481b);
        this.f254912x.moveTo(this.f254902n.V(this.f254905q).c0(this.f254908t).f180480a, this.f254902n.f180481b);
        this.f254912x.lineTo(this.f254902n.V(this.f254905q).b(this.f254908t).f180480a, this.f254902n.f180481b);
        Path path2 = this.f254912x;
        k kVar2 = this.f254904p;
        path2.moveTo(kVar2.f180480a, kVar2.f180481b);
        Path path3 = this.f254912x;
        k kVar3 = this.f254905q;
        path3.lineTo(kVar3.f180480a, kVar3.f180481b);
        this.f254912x.moveTo(this.f254902n.V(this.f254903o).M().R(f12).b(this.f254905q).f180480a, this.f254902n.f180481b);
        Path path4 = this.f254912x;
        k kVar4 = this.f254907s;
        path4.lineTo(kVar4.f180480a, kVar4.f180481b);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.f
    public void a(com.planner5d.library.widget.editor.editor2d.painter.d dVar, o oVar, @p0 Item item, boolean z10) {
        v(dVar, item);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(com.planner5d.library.widget.editor.editor2d.drawable.d dVar, boolean z10, @p0 Item item) {
        h hVar = this.f254910v;
        if (hVar.f254951a != null) {
            com.planner5d.library.widget.editor.editor2d.painter.d.c cVar = hVar.f254968r;
            if ((cVar == null || !cVar.equals(com.planner5d.library.widget.editor.editor2d.painter.d.c.Rotate)) && !this.f254910v.f254955e) {
                j(dVar.f254891a);
            }
            for (e eVar : this.f254913y) {
                if (this.f254910v.f254955e) {
                    if (eVar.f254924c.equals(com.planner5d.library.widget.editor.editor2d.painter.d.c.Rotate)) {
                        k(eVar, dVar, cVar);
                    }
                } else if (eVar.b() && (cVar == null || cVar.equals(eVar.f254924c))) {
                    k(eVar, dVar, cVar);
                }
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(ItemLayout itemLayout) {
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        rectF.set(this.f254909u);
        return rectF;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        return this.f254910v.f254951a != null && this.f254909u.contains(pointF.x, pointF.y);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return com.planner5d.library.widget.editor.editor2d.drawable.c.f254879b;
    }

    @NonNull
    public RectF[] l() {
        return (RectF[]) Arrays.stream(this.f254913y).map(new Function() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.gizmo.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.i((e) obj);
            }
        }).toArray(new IntFunction() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.gizmo.b
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return c.h(i10);
            }
        });
    }

    public com.planner5d.library.widget.editor.editor2d.painter.d.c t(PointF pointF) {
        if (e(pointF)) {
            for (e eVar : this.f254913y) {
                if (eVar.b() && eVar.f254923b.contains(pointF.x, pointF.y)) {
                    return eVar.f254924c;
                }
            }
        }
        return null;
    }

    public void u(com.planner5d.library.widget.editor.editor2d.painter.d.c cVar) {
        this.f254910v.c(cVar);
    }

    public void v(com.planner5d.library.widget.editor.editor2d.painter.d dVar, @p0 Item item) {
        if (this.f254910v.d(dVar, item)) {
            this.f254911w.setStrokeWidth(this.f254910v.f254960j * 2.0f);
            this.f254912x.reset();
            Path path = this.f254912x;
            c0 c0Var = this.f254910v.f254961k;
            c0.b bVar = c0.b.Bottom;
            path.moveTo(c0Var.h(bVar, this.f254902n).f180480a, this.f254902n.f180481b);
            boolean z10 = true;
            int i10 = 7 & 0;
            w(bVar, true, null);
            c0.b bVar2 = c0.b.Left;
            w(bVar2, false, s() ? Float.valueOf(this.f254910v.f254958h.f180481b) : null);
            c0.b bVar3 = c0.b.Top;
            w(bVar3, false, r() ? Float.valueOf(this.f254910v.f254958h.f180480a) : null);
            c0.b bVar4 = c0.b.Right;
            w(bVar4, true, null);
            w(bVar, true, null);
            this.f254912x.computeBounds(this.f254909u, true);
            ItemEditability itemEditabilityL = item != null ? dVar.l() : null;
            boolean z11 = itemEditabilityL != null;
            boolean z12 = z11 && itemEditabilityL.canRotateZ(item);
            boolean z13 = z11 && itemEditabilityL.canResize(item) && !this.f254910v.f254955e;
            if (!z11 || !itemEditabilityL.canResizeX(item) || this.f254910v.f254955e) {
                z10 = false;
            }
            f fVarN = n(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromBottom);
            h hVar = this.f254910v;
            fVarN.d(hVar, hVar.f254961k.g(bVar3, this.f254902n)).c(z13);
            f fVarN2 = n(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromTop);
            h hVar2 = this.f254910v;
            fVarN2.d(hVar2, hVar2.f254961k.g(bVar, this.f254902n)).c(z13);
            f fVarN3 = n(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromRight);
            h hVar3 = this.f254910v;
            fVarN3.d(hVar3, hVar3.f254961k.g(bVar2, this.f254902n)).c(z10);
            f fVarN4 = n(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromLeft);
            h hVar4 = this.f254910v;
            fVarN4.d(hVar4, hVar4.f254961k.g(bVar4, this.f254902n)).c(z10);
            f fVarN5 = n(com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXYFromTopLeft);
            h hVar5 = this.f254910v;
            fVarN5.d(hVar5, hVar5.f254961k.j(bVar4, this.f254902n)).c(z10);
            f fVarN6 = n(com.planner5d.library.widget.editor.editor2d.painter.d.c.Rotate);
            h hVar6 = this.f254910v;
            fVarN6.d(hVar6, hVar6.f254955e ? this.f254902n : hVar6.f254961k.h(bVar4, this.f254902n)).c(z12);
            for (e eVar : this.f254913y) {
                this.f254909u.union(eVar.f254923b);
            }
        }
    }
}
