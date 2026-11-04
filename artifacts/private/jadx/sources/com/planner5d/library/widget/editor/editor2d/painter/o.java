package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.planner5d.library.model.item.Item;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator<a> f255263g = new Comparator() { // from class: com.planner5d.library.widget.editor.editor2d.painter.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return o.a((o.a) obj, (o.a) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f255264a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Item> f255265b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Item f255266c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<a> f255267d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f255268e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f255269f;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.widget.editor.editor2d.drawable.c f255270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.planner5d.library.widget.editor.editor2d.drawable.i f255271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f255272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f255273d;

        private a(com.planner5d.library.widget.editor.editor2d.drawable.c cVar, boolean z10) {
            this.f255270a = cVar;
            boolean z11 = cVar instanceof com.planner5d.library.widget.editor.editor2d.drawable.i;
            this.f255273d = z11;
            this.f255271b = z11 ? (com.planner5d.library.widget.editor.editor2d.drawable.i) cVar : null;
            this.f255272c = z10;
        }
    }

    public o(u uVar) {
        this.f255269f = uVar;
    }

    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.f255270a.g() - aVar2.f255270a.g();
    }

    void b(Bitmap bitmap, d.b bVar, d dVar) {
        Canvas canvasLock;
        if (this.f255265b == null || (canvasLock = bVar.lock()) == null) {
            return;
        }
        canvasLock.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvasLock.save();
        com.planner5d.library.widget.editor.editor2d.drawable.d dVarT = dVar.T(canvasLock, null, false);
        d.C1727d c1727dN = dVar.n();
        if (c1727dN != null && (c1727dN.d() || c1727dN.e())) {
            this.f255269f.c(dVarT, dVar, true);
        }
        for (a aVar : this.f255267d) {
            if (aVar.f255273d) {
                aVar.f255271b.m(dVarT, true);
            } else {
                aVar.f255270a.b(dVarT, aVar.f255272c && (c1727dN == null || !c1727dN.f()), this.f255266c);
            }
        }
        this.f255269f.b(dVarT, dVar, true);
        canvasLock.restore();
        bVar.d(canvasLock);
    }

    void c(@fj.h Item item, Canvas canvas, d dVar, Item[] itemArr) {
        if (this.f255264a || item == null || itemArr == null) {
            return;
        }
        List<Item> listI = dVar.f255186s.i();
        ArrayList arrayList = new ArrayList();
        this.f255265b = item.getTreeList();
        for (Item item2 : itemArr) {
            arrayList.addAll(item2.getTreeList());
        }
        this.f255268e.set(dVar.f255186s.c());
        canvas.save();
        com.planner5d.library.widget.editor.editor2d.drawable.d dVarT = dVar.T(canvas, null, false);
        for (Item item3 : listI) {
            com.planner5d.library.widget.editor.editor2d.drawable.w drawableInstances = item3.getDrawableInstances();
            if (drawableInstances != null) {
                for (com.planner5d.library.widget.editor.editor2d.drawable.c cVar : drawableInstances.f255098a) {
                    if (arrayList.contains(item3)) {
                        this.f255267d.add(new a(cVar, this.f255265b.contains(item3)));
                    } else {
                        cVar.b(dVarT, false, null);
                    }
                }
            }
        }
        Collections.sort(this.f255267d, f255263g);
        canvas.restore();
        this.f255266c = item;
        this.f255264a = true;
    }

    void d() {
        if (this.f255265b != null) {
            this.f255265b = null;
        }
        this.f255267d.clear();
        this.f255264a = false;
    }
}
