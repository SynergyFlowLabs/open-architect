package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.y;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import com.planner5d.library.widget.editor.editor2d.painter.a0;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class i implements e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f254977v = "wallp_0";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f254978w = "wallp_0_1";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected ItemGround f254981p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ItemMaterial f254985t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f254979n = new Paint(7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f254980o = new Paint();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Path f254982q = new Path();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Matrix f254983r = new Matrix();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f254984s = Boolean.FALSE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a0.c f254986u = null;

    class a extends com.planner5d.library.services.rx.e<a0.c> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f254987d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Subscriber f254988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y f254989f;

        a(Subscriber subscriber, y yVar) {
            this.f254988e = subscriber;
            this.f254989f = yVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(a0.c cVar) {
            if (this.f254988e.isUnsubscribed()) {
                return;
            }
            this.f254987d = true;
            i.this.f254986u = new a0.c(cVar, this.f254989f);
            i.this.f254979n.setColor(-1);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            if (this.f254988e.isUnsubscribed()) {
                return;
            }
            if (!this.f254987d) {
                i.this.f254979n.setShader(null);
                i.this.f254986u = null;
            }
            i.this.f254985t = null;
            this.f254988e.onCompleted();
        }
    }

    public i(ItemGround itemGround) {
        int i10 = 5 | 0;
        this.f254981p = itemGround;
        Paint paint = this.f254979n;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f254980o.setDither(false);
        this.f254980o.setAntiAlias(false);
        this.f254980o.setStyle(style);
        v(null);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(y yVar, com.planner5d.library.model.p.b bVar, Subscriber subscriber) {
        a0.f255148d.g(yVar, bVar).subscribe((Subscriber<? super a0.c>) new a(subscriber, yVar));
    }

    private void v(Integer num) {
        this.f254980o.setColor((num == null ? 11184810 : num.intValue()) & (-1426063361));
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        m(dVar, false);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(ItemLayout itemLayout) {
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
        synchronized (this.f254983r) {
            try {
                this.f254983r.setTranslate(itemLayout.getPosition(kVar).f180480a, kVar.f180481b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        synchronized (this.f254982q) {
            try {
                this.f254982q.computeBounds(rectF, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f254983r.mapRect(rectF);
        return rectF;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        boolean z10;
        synchronized (this.f254982q) {
            try {
                z10 = x.h(this, pointF) && x.a(this.f254982q, this.f254983r, pointF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.e
    public Observable<Void> f(final com.planner5d.library.model.p.b bVar) {
        ItemMaterial itemMaterial = this.f254985t;
        if (itemMaterial == null) {
            return Observable.empty();
        }
        final y yVar = itemMaterial.texture;
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.h
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f254974a.q(yVar, bVar, (Subscriber) obj);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return -7;
    }

    public boolean l(RectF rectF) {
        boolean zC;
        synchronized (this.f254982q) {
            zC = x.c(this.f254982q, this.f254983r, rectF);
        }
        return zC;
    }

    public void m(d dVar, boolean z10) {
        a0.c cVar = this.f254986u;
        if (cVar != null) {
            cVar.a(this.f254979n);
        } else {
            this.f254979n.setShader(null);
        }
        Canvas canvas = dVar.f254891a;
        canvas.save();
        synchronized (this.f254983r) {
            try {
                canvas.concat(this.f254983r);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f254984s.booleanValue()) {
            synchronized (this.f254982q) {
                try {
                    canvas.drawPath(this.f254982q, (z10 || dVar.f254895e) ? this.f254980o : this.f254979n);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        n(canvas, dVar.f254893c);
        canvas.restore();
    }

    protected void n(Canvas canvas, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
    }

    public com.planner5d.library.math.k o(com.planner5d.library.math.k kVar) {
        kVar.U(0.0f, 0.0f);
        WallsInfo wallsInfo = this.f254981p.getWallsInfo();
        if (wallsInfo != null) {
            WallsInfoWall[] wallsInfoWallArr = wallsInfo.get();
            for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
                kVar.b(wallsInfoWall.getBottom().e());
                kVar.b(wallsInfoWall.getBottom().c());
            }
            float length = wallsInfoWallArr.length * 2;
            kVar.f180480a /= length;
            kVar.f180481b /= length;
        }
        return kVar;
    }

    public int p(RectF rectF) {
        int iK;
        synchronized (this.f254982q) {
            try {
                iK = x.k(this.f254982q, this.f254983r, rectF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iK;
    }

    public void r() {
        WallsInfo wallsInfo = this.f254981p.getWallsInfo();
        synchronized (this.f254982q) {
            try {
                this.f254982q.reset();
                com.planner5d.library.math.k[] path = wallsInfo.getPath(WallsInfoWall.Side.Bottom);
                if (path.length > 0) {
                    Path path2 = this.f254982q;
                    com.planner5d.library.math.k kVar = path[0];
                    path2.moveTo(kVar.f180480a, kVar.f180481b);
                    for (com.planner5d.library.math.k kVar2 : path) {
                        this.f254982q.lineTo(kVar2.f180480a, kVar2.f180481b);
                    }
                }
                this.f254982q.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(boolean z10) {
        this.f254984s = Boolean.valueOf(z10);
    }

    public void t(ItemMaterial itemMaterial) {
        this.f254986u = null;
        this.f254979n.setColor(0);
        v(itemMaterial.colorDraw);
        y yVar = itemMaterial.texture;
        if (yVar == null || "wallp_0".equals(yVar.f222851c) || f254978w.equals(yVar.f222851c)) {
            this.f254979n.setColor((yVar == null || !f254978w.equals(yVar.f222851c)) ? itemMaterial.colorDraw.intValue() : -16777216);
            this.f254979n.setShader(null);
        } else {
            Integer num = itemMaterial.colorDraw;
            if (num != null) {
                this.f254979n.setColor(num.intValue());
            }
            this.f254985t = itemMaterial;
        }
    }

    public void u(boolean z10) {
        this.f254979n.setAntiAlias(z10);
    }
}
