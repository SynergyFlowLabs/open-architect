package com.planner5d.library.widget.editor.propertiesbar;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.services.rx.i;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes8.dex */
public class PropertiesBarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Item f258116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ij.c<com.planner5d.library.widget.editor.helper.g> f258117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.f f258118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f258119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f258120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f258121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f258122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View[] f258123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f258124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f258125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PointF f258126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PointF f258127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f258128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Subscription f258129n;

    @Deprecated(since = "Currently needed only to position item actions, remove in future when possible")
    public interface a {
        void a();
    }

    public PropertiesBarView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ com.planner5d.library.widget.editor.helper.g b() {
        return null;
    }

    public static /* synthetic */ Object c(WeakReference weakReference, Boolean bool) {
        View view = (View) weakReference.get();
        if (view != null) {
            view.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return null;
    }

    public static /* synthetic */ void d() {
    }

    private void g() {
        for (View view : this.f258123h) {
            view.setVisibility(8);
        }
    }

    private boolean i() {
        return this.f258122g && (this.f258116a instanceof ItemPr);
    }

    private void k() {
        Item item = this.f258116a;
        boolean z10 = ((item instanceof ItemNs) && !(item instanceof ItemWindow)) || (item instanceof ItemPr) || (item instanceof ItemUnknown);
        if (this.f258122g && z10 && this.f258117b.get() != null) {
            r(this.f258116a, this.f258117b.get());
        } else {
            this.f258121f.setVisibility(8);
        }
        this.f258119d.setVisibility(z10 ? 0 : 8);
        this.f258120e.setVisibility(i() ? 0 : 8);
        requestLayout();
    }

    private View p(int i10, int i11) {
        PropertiesButtonView propertiesButtonView = (PropertiesButtonView) findViewById(i10);
        if (i11 > 0) {
            propertiesButtonView.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), i11, null));
        }
        return propertiesButtonView;
    }

    private void r(@fj.g final Item item, @fj.g final com.planner5d.library.widget.editor.helper.g gVar) {
        final WeakReference weakReference = new WeakReference(this.f258121f);
        Subscription subscription = this.f258129n;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f258129n = i.f(new Callable() { // from class: com.planner5d.library.widget.editor.propertiesbar.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(gVar.c(item));
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d).map(new Func1() { // from class: com.planner5d.library.widget.editor.propertiesbar.d
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return PropertiesBarView.c(weakReference, (Boolean) obj);
            }
        }).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
    }

    PointF e(PointF pointF) {
        pointF.set(this.f258124i);
        return pointF;
    }

    public void f() {
        if (this.f258116a != null) {
            setVisibility(8);
            this.f258116a = null;
        }
    }

    public RectF getBoundingBox() {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        this.f258120e.getGlobalVisibleRect(rect2);
        rect.set(rect2);
        this.f258119d.getGlobalVisibleRect(rect2);
        rect.union(rect2);
        this.f258121f.getGlobalVisibleRect(rect2);
        rect.union(rect2);
        return new RectF(rect);
    }

    public boolean h() {
        if (getVisibility() == 0) {
            return false;
        }
        int i10 = 3 | 1;
        return true;
    }

    void j(float f10) {
        if (this.f258117b.get() != null) {
            this.f258117b.get().a(f10);
        }
    }

    void l(float f10, boolean z10) {
        if (this.f258117b.get() != null) {
            this.f258117b.get().e(f10, z10);
        }
    }

    void m(float f10, float f11) {
        this.f258124i.set(f10, f11);
        this.f258119d.setX(this.f258125j.x + f10);
        this.f258119d.setY(this.f258125j.y + f11);
        this.f258120e.setX(this.f258126k.x + f10);
        this.f258120e.setY(this.f258126k.y + f11);
        this.f258121f.setX(this.f258127l.x + f10);
        this.f258121f.setY(this.f258127l.y + f11);
    }

    public void n(ij.c<com.planner5d.library.widget.editor.helper.g> cVar, com.planner5d.library.widget.editor.facade.f fVar) {
        this.f258117b = cVar;
        this.f258118c = fVar;
    }

    public void o(float f10, float f11) {
        k();
        PointF pointF = this.f258127l;
        m(f10 - pointF.x, f11 - pointF.y);
        setVisibility(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = (int) Math.max(-this.f258127l.x, Math.min(this.f258124i.x, (View.MeasureSpec.getSize(i10) - this.f258119d.getMeasuredWidth()) - this.f258125j.x));
        float dimension = getResources().getDimension(com.planner5d.library.f.g.Jh) / 2.0f;
        int iMax2 = (int) Math.max(-this.f258125j.y, Math.min(this.f258124i.y, (View.MeasureSpec.getSize(i11) - dimension) - (i() ? dimension * 2.0f : 0.0f)));
        PointF pointF = this.f258124i;
        if (iMax == ((int) pointF.x) && iMax2 == ((int) pointF.y)) {
            return;
        }
        m(iMax, iMax2);
        this.f258128m.a();
    }

    public void q(Item item, PointF pointF) {
        com.planner5d.library.widget.editor.facade.f fVar = this.f258118c;
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = fVar == null ? null : fVar.G1();
        if (bVarG1 != null && this.f258122g && (item == null || (!(item instanceof ItemPoint) && ((!(item instanceof ItemWall) || (item.getParentItem() instanceof ItemRoom)) && (!bVarG1.g() || !(item instanceof ItemPr)))))) {
            this.f258116a = item;
            k();
            m(pointF.x, pointF.y);
            setVisibility(0);
            return;
        }
        f();
    }

    public void setFor3D(boolean z10) {
        this.f258122g = z10;
    }

    void setMovingUpDown(boolean z10) {
        g();
        if (this.f258117b.get() != null) {
            if (!z10) {
                this.f258117b.get().i();
            } else {
                this.f258117b.get().d(false);
                this.f258121f.setVisibility(0);
            }
        }
    }

    @Deprecated(since = "Currently needed only to position item actions, remove in future when possible")
    public void setOnBarRepositionListener(@fj.g a aVar) {
        this.f258128m = aVar;
    }

    void setRotating(Boolean bool) {
        g();
        if (bool != null) {
            (bool.booleanValue() ? this.f258119d : this.f258120e).setVisibility(0);
            if (this.f258117b.get() != null) {
                this.f258117b.get().f(bool.booleanValue());
                return;
            }
            return;
        }
        if (this.f258117b.get() != null) {
            this.f258117b.get().h();
        }
        PointF pointF = this.f258124i;
        m(pointF.x, pointF.y);
        k();
    }

    public PropertiesBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PropertiesBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f258116a = null;
        this.f258117b = new ij.c() { // from class: com.planner5d.library.widget.editor.propertiesbar.e
            @Override // ij.c
            public final Object get() {
                return PropertiesBarView.b();
            }
        };
        this.f258118c = null;
        this.f258122g = false;
        this.f258124i = new PointF();
        this.f258125j = new PointF();
        this.f258126k = new PointF();
        this.f258127l = new PointF();
        this.f258128m = new a() { // from class: com.planner5d.library.widget.editor.propertiesbar.f
            @Override // com.planner5d.library.widget.editor.propertiesbar.PropertiesBarView.a
            public final void a() {
                PropertiesBarView.d();
            }
        };
        View.inflate(context, com.planner5d.library.f.m.R8, this);
        View viewP = p(com.planner5d.library.f.j.B5, com.planner5d.library.f.h.Pa);
        this.f258119d = viewP;
        View viewP2 = p(com.planner5d.library.f.j.A5, com.planner5d.library.f.h.Oa);
        this.f258120e = viewP2;
        View viewP3 = p(com.planner5d.library.f.j.f168394t5, com.planner5d.library.f.h.Cb);
        this.f258121f = viewP3;
        View[] viewArr = {viewP, viewP2, viewP3};
        this.f258123h = viewArr;
        for (View view : viewArr) {
            view.setBackground(new com.planner5d.library.widget.drawable.b(-6774613, (int) getResources().getDimension(com.planner5d.library.f.g.Mg)));
        }
        this.f258120e.setOnClickListener(null);
        this.f258119d.setOnClickListener(null);
        this.f258121f.setOnClickListener(null);
        new h(this.f258119d, this, true);
        new h(this.f258120e, this, false);
        new b(this.f258121f, this);
        float dimension = getResources().getDimension(com.planner5d.library.f.g.Jh) / 2.0f;
        float f10 = -dimension;
        this.f258125j.set(3.0f * dimension, f10);
        this.f258126k.set(2.0f * dimension, dimension);
        this.f258127l.set(5.0f * f10, f10);
        setVisibility(4);
    }
}
