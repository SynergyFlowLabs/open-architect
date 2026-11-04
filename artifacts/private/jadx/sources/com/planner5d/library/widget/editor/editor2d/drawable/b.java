package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.y;
import com.planner5d.library.widget.editor.editor2d.painter.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class b implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ItemMaterial f254872p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f254870n = new Paint();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PointF f254871o = new PointF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a0.c f254873q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<c> f254874r = new ArrayList();

    class a extends com.planner5d.library.services.rx.e<a0.c> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f254875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y f254876e;

        a(Subscriber subscriber, y yVar) {
            this.f254875d = subscriber;
            this.f254876e = yVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(a0.c cVar) {
            if (this.f254875d.isUnsubscribed()) {
                return;
            }
            b.this.f254873q = new a0.c(cVar, this.f254876e);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            if (this.f254875d.isUnsubscribed()) {
                return;
            }
            b.this.f254872p = null;
            this.f254875d.onCompleted();
        }
    }

    public b(ItemMaterial itemMaterial, PointF pointF) {
        this.f254870n.setDither(true);
        this.f254870n.setAntiAlias(true);
        this.f254870n.setFilterBitmap(true);
        this.f254870n.setStyle(Paint.Style.FILL);
        this.f254871o.set(pointF);
        m(itemMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(y yVar, Subscriber subscriber) {
        a0.f255148d.g(yVar, com.planner5d.library.model.p.b.normal).subscribe((Subscriber<? super a0.c>) new a(subscriber, yVar));
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        a0.c cVar = this.f254873q;
        if (cVar != null && !dVar.f254895e) {
            cVar.a(this.f254870n);
        }
        Canvas canvas = dVar.f254891a;
        PointF pointF = this.f254871o;
        canvas.drawRect(0.0f, 0.0f, pointF.x, pointF.y, this.f254870n);
        synchronized (this.f254874r) {
            try {
                Iterator<c> it = this.f254874r.iterator();
                while (it.hasNext()) {
                    it.next().b(dVar, false, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(ItemLayout itemLayout) {
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        PointF pointF = this.f254871o;
        rectF.set(0.0f, 0.0f, pointF.x, pointF.y);
        return rectF;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        return x.h(this, pointF);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.e
    public Observable<Void> f(com.planner5d.library.model.p.b bVar) {
        ItemMaterial itemMaterial = this.f254872p;
        if (itemMaterial == null) {
            return Observable.empty();
        }
        final y yVar = itemMaterial.texture;
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.a
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f254868a.k(yVar, (Subscriber) obj);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return -9;
    }

    public void l(ItemFloor itemFloor) {
        Item[] children;
        ItemRoom itemRoom;
        ItemWall[] children2;
        synchronized (this.f254874r) {
            try {
                this.f254874r.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (itemFloor == null || (children = itemFloor.getChildren()) == null) {
            return;
        }
        ItemLayout itemLayout = new ItemLayout();
        for (Item item : children) {
            if ((item instanceof ItemRoom) && (children2 = (itemRoom = (ItemRoom) item).getChildren()) != null) {
                for (ItemWall itemWall : children2) {
                    s sVar = new s(itemRoom.getWallInfo(itemWall));
                    sVar.c(itemWall.getLayout(itemLayout));
                    synchronized (this.f254874r) {
                        try {
                            this.f254874r.add(sVar);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        }
    }

    public void m(ItemMaterial itemMaterial) {
        this.f254873q = null;
        this.f254870n.setShader(null);
        Integer num = itemMaterial.color;
        if (num != null) {
            this.f254870n.setColor(num.intValue());
        }
        if (itemMaterial.texture == null) {
            return;
        }
        this.f254872p = itemMaterial;
    }
}
