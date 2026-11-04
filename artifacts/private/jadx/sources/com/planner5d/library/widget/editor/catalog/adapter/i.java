package com.planner5d.library.widget.editor.catalog.adapter;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.catalog.CatalogItemMetadata;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
class i extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Drawable f254404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.a f254405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.widget.editor.catalog.adapter.a.C1723a f254406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GestureDetector f254407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f254408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.catalog.f f254409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.DragShadowBuilder f254410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f254411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f254412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f254413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.catalog.adapter.a f254414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Point f254415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f254416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<String> f254417n;

    class a extends View.DragShadowBuilder {
        a() {
        }

        @Override // android.view.View.DragShadowBuilder
        public void onDrawShadow(@NonNull Canvas canvas) {
            Rect rect = new Rect(i.this.f254404a.getBounds());
            i.this.f254404a.setBounds(canvas.getClipBounds());
            i.this.f254404a.draw(canvas);
            i.this.f254404a.setBounds(rect);
        }

        @Override // android.view.View.DragShadowBuilder
        public void onProvideShadowMetrics(@NonNull Point point, @NonNull Point point2) {
            point.set(i.this.f254415l.x, i.this.f254415l.y);
            point2.set(point.x / 2, point.y / 2);
        }
    }

    class b implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a2 f254419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.catalog.adapter.a f254420b;

        b(a2 a2Var, com.planner5d.library.widget.editor.catalog.adapter.a aVar) {
            this.f254419a = a2Var;
            this.f254420b = aVar;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            i.this.x(this.f254419a, this.f254420b.f254375m);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return f10 != 0.0f && i.this.x(this.f254419a, this.f254420b.f254375m);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            i.this.v(motionEvent);
            return true;
        }
    }

    class c extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.catalog.adapter.a.C1723a f254422h;

        c(com.planner5d.library.widget.editor.catalog.adapter.a.C1723a c1723a) {
            this.f254422h = c1723a;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void h(Bitmap bitmap) {
            i.this.f254412i.b();
            i.this.f254412i.setVisibility(8);
            if (this.f254422h.equals(i.this.f254406c)) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(i.this.f254409f.getResources(), bitmap);
                i.this.w(bitmapDrawable);
                i.this.f254409f.setImageDrawable(bitmapDrawable);
            }
        }
    }

    i(View view, com.planner5d.library.widget.editor.catalog.adapter.a aVar, a2 a2Var, Drawable drawable, Point point, boolean z10, List<String> list) {
        super(new FrameLayout(view.getContext()));
        this.f254408e = false;
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        com.planner5d.library.widget.editor.catalog.f fVar = new com.planner5d.library.widget.editor.catalog.f(frameLayout.getContext());
        this.f254409f = fVar;
        p(frameLayout, fVar);
        d dVar = new d(view.getContext(), point);
        this.f254412i = dVar;
        p(frameLayout, dVar);
        dVar.setVisibility(8);
        this.f254416m = z10;
        this.f254417n = list;
        this.f254411h = drawable;
        this.f254414k = aVar;
        this.f254415l = point;
        this.f254410g = new a();
        this.f254407d = new GestureDetector(fVar.getContext(), new b(a2Var, aVar));
        frameLayout.setLayoutParams(new RecyclerView.q(point.x, point.y));
        fVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.planner5d.library.widget.editor.catalog.adapter.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f254402a.t(view2, motionEvent);
            }
        });
        fVar.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.adapter.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f254403a.u(view2);
            }
        });
    }

    private void p(FrameLayout frameLayout, View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
    }

    private boolean r() {
        return this.f254409f.getLocked();
    }

    private boolean s(com.planner5d.library.widget.editor.catalog.adapter.a.C1723a c1723a) {
        return (!this.f254416m || c1723a.f254380b.isFree() || this.f254417n.contains(c1723a.f254380b.f180761id)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean t(View view, MotionEvent motionEvent) {
        if (!r()) {
            return this.f254407d.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f254408e = true;
            return true;
        }
        if (this.f254408e) {
            if (motionEvent.getAction() == 3) {
                return true;
            }
            if (motionEvent.getAction() == 1) {
                this.f254408e = false;
                v(motionEvent);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        v(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(MotionEvent motionEvent) {
        this.f254414k.k(this.f254406c, r() ? this.f254413j : null, this.f254409f.d(motionEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Drawable drawable) {
        if (drawable != null) {
            int i10 = this.f254415l.x;
            drawable.setBounds(0, 0, i10, i10);
        }
        this.f254404a = drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x(a2 a2Var, boolean z10) {
        if (a2Var.e(this.f254409f)) {
            return true;
        }
        if (s(this.f254406c) || this.f254409f.getWindowToken() == null) {
            return false;
        }
        a2Var.j(this.f254409f, this.f254406c.f254380b, this.f254410g, z10);
        return true;
    }

    public void q(com.planner5d.library.services.bitmaploader.target.h hVar, Function2<CatalogItem, com.planner5d.library.services.bitmaploader.target.a, Unit> function2, @NonNull com.planner5d.library.widget.editor.catalog.adapter.a.C1723a c1723a, Drawable drawable) {
        if (this.f254406c == c1723a) {
            return;
        }
        this.f254413j = drawable;
        this.f254406c = c1723a;
        hVar.d(this.f254405b);
        this.f254409f.g(s(c1723a), drawable);
        Drawable drawable2 = this.f254411h;
        if (drawable2 instanceof ShimmerDrawable) {
            this.f254412i.a();
            this.f254412i.setVisibility(0);
        } else {
            com.planner5d.library.widget.editor.catalog.f fVar = this.f254409f;
            this.f254404a = drawable2;
            fVar.setImageDrawable(drawable2);
        }
        com.planner5d.library.widget.editor.catalog.f fVar2 = this.f254409f;
        CatalogItemMetadata catalogItemMetadata = c1723a.f254380b.metadata;
        fVar2.setTitle(catalogItemMetadata == null ? null : catalogItemMetadata.title);
        w(this.f254404a);
        CatalogItem catalogItem = c1723a.f254380b;
        c cVar = new c(c1723a);
        this.f254405b = cVar;
        function2.invoke(catalogItem, hVar.c(cVar));
    }
}
