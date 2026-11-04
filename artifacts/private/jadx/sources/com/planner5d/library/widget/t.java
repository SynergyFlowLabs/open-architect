package com.planner5d.library.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: loaded from: classes12.dex */
public class t extends ListView {
    private static final int H1 = 15;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f258738g3 = 15;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f258739h3 = -1;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f258740i3 = -1;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final TypeEvaluator<Rect> f258741j3 = new c();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f258742p2 = 150;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f258743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f258744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f258745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f258746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f258747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f258748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f258749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f258750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f258751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f258752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f258753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f258754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f258755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BitmapDrawable f258756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Rect f258757o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private e f258758p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final AbsListView.OnScrollListener f258759p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Rect f258760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f258761t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f258762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f258763w;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f258764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f258765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f258766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f258767d;

        a(ViewTreeObserver viewTreeObserver, long j10, int i10, int i11) {
            this.f258764a = viewTreeObserver;
            this.f258765b = j10;
            this.f258766c = i10;
            this.f258767d = i11;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f258764a.removeOnPreDrawListener(this);
            View viewV = t.this.v(this.f258765b);
            t tVar = t.this;
            View viewV2 = tVar.v(tVar.f258752j);
            t.this.f258747e += this.f258766c;
            viewV.setTranslationY(this.f258767d - viewV.getTop());
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewV, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
            t.this.C();
            if (viewV2 != null) {
                viewV2.setVisibility(4);
            }
            return true;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f258769a;

        b(View view) {
            this.f258769a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f258751i = -1L;
            t.this.f258752j = -1L;
            t.this.f258753k = -1L;
            int i10 = 7 >> 0;
            this.f258769a.setVisibility(0);
            t.this.f258756n = null;
            t.this.setEnabled(true);
            t.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            t.this.setEnabled(false);
        }
    }

    class c implements TypeEvaluator<Rect> {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect evaluate(float f10, Rect rect, Rect rect2) {
            if (rect == null) {
                return null;
            }
            return new Rect(b(rect.left, rect2.left, f10), b(rect.top, rect2.top, f10), b(rect.right, rect2.right, f10), b(rect.bottom, rect2.bottom, f10));
        }

        public int b(int i10, int i11, float f10) {
            return (int) (i10 + (f10 * (i11 - i10)));
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f258771a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f258772b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f258773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f258774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f258775e;

        d() {
        }

        private void c() {
            if (this.f258774d <= 0 || this.f258775e != 0) {
                return;
            }
            if (t.this.f258748f && t.this.f258749g) {
                t.this.x();
            } else if (t.this.f258762v) {
                t.this.F();
            }
        }

        public void a() {
            if (this.f258773c == this.f258771a || !t.this.f258748f || t.this.f258752j == -1) {
                return;
            }
            t tVar = t.this;
            tVar.G(tVar.f258752j);
            t.this.w();
        }

        public void b() {
            if (this.f258773c + this.f258774d == this.f258771a + this.f258772b || !t.this.f258748f || t.this.f258752j == -1) {
                return;
            }
            t tVar = t.this;
            tVar.G(tVar.f258752j);
            t.this.w();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            this.f258773c = i10;
            this.f258774d = i11;
            int i13 = this.f258771a;
            if (i13 != -1) {
                i10 = i13;
            }
            this.f258771a = i10;
            int i14 = this.f258772b;
            if (i14 != -1) {
                i11 = i14;
            }
            this.f258772b = i11;
            a();
            b();
            this.f258771a = this.f258773c;
            this.f258772b = this.f258774d;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            this.f258775e = i10;
            t.this.f258763w = i10;
            c();
        }
    }

    public interface e {
        void a(int i10, int i11);

        void b(Object obj, int i10, int i11);

        boolean c(Object obj);
    }

    public t(Context context) {
        super(context);
        this.f258744b = -1;
        this.f258745c = -1;
        this.f258746d = -1;
        this.f258747e = 0;
        this.f258748f = false;
        this.f258749g = false;
        this.f258750h = 0;
        this.f258751i = -1L;
        this.f258752j = -1L;
        this.f258753k = -1L;
        this.f258761t = -1;
        this.f258762v = false;
        this.f258763w = 0;
        this.f258758p0 = null;
        this.f258759p1 = new d();
        z(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(ValueAnimator valueAnimator) {
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setVisibility(0);
        }
    }

    private void E() {
        View viewV = v(this.f258752j);
        if (this.f258748f) {
            this.f258751i = -1L;
            this.f258752j = -1L;
            this.f258753k = -1L;
            if (viewV != null) {
                viewV.setVisibility(0);
            }
            this.f258756n = null;
            invalidate();
        }
        this.f258748f = false;
        this.f258749g = false;
        this.f258761t = -1;
        this.f258754l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        int i10;
        e eVar;
        View viewV = v(this.f258752j);
        if (!this.f258748f && !this.f258762v) {
            E();
            return;
        }
        this.f258748f = false;
        this.f258762v = false;
        this.f258749g = false;
        this.f258761t = -1;
        long j10 = this.f258752j;
        if (j10 != -1) {
            int iU = u(j10);
            Object obj = this.f258754l;
            if (obj != null && iU != (i10 = this.f258755m) && (eVar = this.f258758p0) != null) {
                eVar.b(obj, iU, i10);
            }
        }
        this.f258754l = null;
        if (this.f258763w != 0) {
            this.f258762v = true;
            return;
        }
        Rect rect = this.f258757o;
        if (rect == null || this.f258756n == null) {
            return;
        }
        rect.offsetTo(this.f258760s.left, viewV.getTop());
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f258756n, "bounds", f258741j3, this.f258757o);
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.widget.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f258709a.A(valueAnimator);
            }
        });
        objectAnimatorOfObject.addListener(new b(viewV));
        objectAnimatorOfObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(long j10) {
        int iU = u(j10);
        this.f258751i = getAdapter().getItemId(iU - 1);
        this.f258753k = getAdapter().getItemId(iU + 1);
    }

    private BitmapDrawable r(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        int top = view.getTop();
        int left = view.getLeft();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), t(view));
        this.f258760s = new Rect(left, top, width + left, height + top);
        Rect rect = new Rect(this.f258760s);
        this.f258757o = rect;
        bitmapDrawable.setBounds(rect);
        return bitmapDrawable;
    }

    private Bitmap s(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private Bitmap t(View view) {
        Bitmap bitmapS = s(view);
        Canvas canvas = new Canvas(bitmapS);
        Rect rect = new Rect(0, 0, bitmapS.getWidth(), bitmapS.getHeight());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15.0f);
        paint.setColor(this.f258743a);
        canvas.drawBitmap(bitmapS, 0.0f, 0.0f, (Paint) null);
        canvas.drawRect(rect, paint);
        return bitmapS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        int i10 = this.f258744b - this.f258745c;
        int i11 = this.f258760s.top + this.f258747e + i10;
        View viewV = v(this.f258753k);
        View viewV2 = v(this.f258752j);
        View viewV3 = v(this.f258751i);
        boolean z10 = false;
        boolean z11 = viewV != null && i11 > viewV.getTop();
        if (viewV3 != null && i11 < viewV3.getTop()) {
            z10 = true;
        }
        if (z11 || z10) {
            long j10 = z11 ? this.f258753k : this.f258751i;
            if (j10 == -1) {
                return;
            }
            if (!z11) {
                viewV = viewV3;
            }
            int positionForView = getPositionForView(viewV2);
            if (viewV == null) {
                G(this.f258752j);
                return;
            }
            e eVar = this.f258758p0;
            if (eVar != null) {
                eVar.a(positionForView, getPositionForView(viewV));
            }
            G(this.f258752j);
            ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            this.f258745c = this.f258744b;
            int top = viewV.getTop();
            long j11 = j10;
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new a(viewTreeObserver, j11, i10, top));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f258749g = y(this.f258757o);
    }

    public void B(View view) {
        this.f258747e = 0;
        int positionForView = getPositionForView(view);
        this.f258755m = positionForView;
        int firstVisiblePosition = positionForView - getFirstVisiblePosition();
        this.f258754l = getAdapter().getItem(this.f258755m);
        View childAt = getChildAt(firstVisiblePosition);
        this.f258752j = getAdapter().getItemId(this.f258755m);
        this.f258756n = r(childAt);
        childAt.setVisibility(4);
        this.f258748f = true;
        G(this.f258752j);
    }

    public t D(e eVar) {
        this.f258758p0 = eVar;
        return this;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        BitmapDrawable bitmapDrawable = this.f258756n;
        if (bitmapDrawable != null) {
            bitmapDrawable.draw(canvas);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1) {
            F();
        } else if (action == 2) {
            if (this.f258761t == -1) {
                this.f258746d = (int) motionEvent.getX();
                this.f258745c = (int) motionEvent.getY();
                this.f258761t = motionEvent.getPointerId(0);
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (this.f258745c >= childAt.getTop() && this.f258745c < childAt.getBottom()) {
                        if (!this.f258758p0.c(getAdapter().getItem(i10))) {
                            return false;
                        }
                        B(childAt);
                        break;
                    }
                }
            }
            int y10 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f258761t));
            this.f258744b = y10;
            int i11 = y10 - this.f258745c;
            if (this.f258748f && this.f258756n != null) {
                int iHeight = this.f258760s.height();
                int iU = u(this.f258752j);
                int i12 = (iU - (this.f258751i == -1 ? 0 : 1)) * iHeight;
                int i13 = (iU + (this.f258753k == -1 ? 0 : 1)) * iHeight;
                int iExp = this.f258760s.top + i11 + this.f258747e;
                float f10 = iHeight / 2;
                if (iExp < i12) {
                    iExp = (int) (((double) i12) - ((((double) f10) * (1.0d - Math.exp(-(Math.abs(iExp - i12) / f10)))) / 2.0d));
                }
                if (iExp > i13) {
                    iExp = (int) (((double) i13) + ((((double) f10) * (1.0d - Math.exp(-(Math.abs(iExp - i13) / f10)))) / 2.0d));
                }
                this.f258757o.offsetTo(this.f258760s.left, iExp);
                this.f258756n.setBounds(this.f258757o);
                invalidate();
                w();
                this.f258749g = false;
                x();
                return false;
            }
        } else if (action == 3) {
            E();
        } else if (action == 6 && motionEvent.getPointerId((motionEvent.getAction() & androidx.core.view.s0.f48920f) >> 8) == this.f258761t) {
            F();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBorderColor(int i10) {
        this.f258743a = i10;
    }

    public int u(long j10) {
        View viewV = v(j10);
        if (viewV == null) {
            return -1;
        }
        return getPositionForView(viewV);
    }

    public View v(long j10) {
        int firstVisiblePosition = getFirstVisiblePosition();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (getAdapter().getItemId(firstVisiblePosition + i10) == j10) {
                return childAt;
            }
        }
        return null;
    }

    public boolean y(Rect rect) {
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        int height = getHeight();
        int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
        int iComputeVerticalScrollRange = computeVerticalScrollRange();
        int i10 = rect.top;
        int iHeight = rect.height();
        if (i10 <= 0 && iComputeVerticalScrollOffset > 0) {
            smoothScrollBy(-this.f258750h, 0);
            return true;
        }
        if (i10 + iHeight < height || iComputeVerticalScrollOffset + iComputeVerticalScrollExtent >= iComputeVerticalScrollRange) {
            return false;
        }
        smoothScrollBy(this.f258750h, 0);
        return true;
    }

    public void z(Context context) {
        setOnScrollListener(this.f258759p1);
        this.f258750h = (int) (15.0f / context.getResources().getDisplayMetrics().density);
    }

    public t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f258744b = -1;
        this.f258745c = -1;
        this.f258746d = -1;
        this.f258747e = 0;
        this.f258748f = false;
        this.f258749g = false;
        this.f258750h = 0;
        this.f258751i = -1L;
        this.f258752j = -1L;
        this.f258753k = -1L;
        this.f258761t = -1;
        this.f258762v = false;
        this.f258763w = 0;
        this.f258758p0 = null;
        this.f258759p1 = new d();
        z(context);
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258744b = -1;
        this.f258745c = -1;
        this.f258746d = -1;
        this.f258747e = 0;
        this.f258748f = false;
        this.f258749g = false;
        this.f258750h = 0;
        this.f258751i = -1L;
        this.f258752j = -1L;
        this.f258753k = -1L;
        this.f258761t = -1;
        this.f258762v = false;
        this.f258763w = 0;
        this.f258758p0 = null;
        this.f258759p1 = new d();
        z(context);
    }
}
