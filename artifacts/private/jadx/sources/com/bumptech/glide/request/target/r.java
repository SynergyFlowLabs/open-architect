package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class r<T extends View, Z> extends com.bumptech.glide.request.target.b<Z> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f97410g = "ViewTarget";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f97411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f97412i = com.bumptech.glide.i.e.f96196l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final T f97413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f97414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private View.OnAttachStateChangeListener f97415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f97416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f97417f;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.o();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.l();
        }
    }

    @l1
    static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f97419e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @l1
        @p0
        static Integer f97420f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f97421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<o> f97422b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f97423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private a f97424d;

        private static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<b> f97425a;

            a(@NonNull b bVar) {
                this.f97425a = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                b bVar = this.f97425a.get();
                if (bVar != null) {
                    bVar.a();
                }
                return true;
            }
        }

        b(@NonNull View view) {
            this.f97421a = view;
        }

        private static int c(@NonNull Context context) {
            if (f97420f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f97420f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f97420f.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f97423c && this.f97421a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f97421a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            return c(this.f97421a.getContext());
        }

        private int f() {
            int paddingTop = this.f97421a.getPaddingTop() + this.f97421a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f97421a.getLayoutParams();
            return e(this.f97421a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f97421a.getPaddingLeft() + this.f97421a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f97421a.getLayoutParams();
            return e(this.f97421a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f97422b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        void a() {
            if (!this.f97422b.isEmpty()) {
                int iG = g();
                int iF = f();
                if (i(iG, iF)) {
                    j(iG, iF);
                    b();
                }
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f97421a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f97424d);
            }
            this.f97424d = null;
            this.f97422b.clear();
        }

        void d(@NonNull o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f97422b.contains(oVar)) {
                this.f97422b.add(oVar);
            }
            if (this.f97424d == null) {
                ViewTreeObserver viewTreeObserver = this.f97421a.getViewTreeObserver();
                a aVar = new a(this);
                this.f97424d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@NonNull o oVar) {
            this.f97422b.remove(oVar);
        }
    }

    public r(@NonNull T t10) {
        this.f97413b = (T) com.bumptech.glide.util.k.d(t10);
        this.f97414c = new b(t10);
    }

    @p0
    private Object g() {
        return this.f97413b.getTag(f97412i);
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f97415d;
        if (onAttachStateChangeListener == null || this.f97417f) {
            return;
        }
        this.f97413b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f97417f = true;
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f97415d;
        if (onAttachStateChangeListener == null || !this.f97417f) {
            return;
        }
        this.f97413b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f97417f = false;
    }

    private void r(@p0 Object obj) {
        f97411h = true;
        this.f97413b.setTag(f97412i, obj);
    }

    @Deprecated
    public static void t(int i10) {
        if (f97411h) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f97412i = i10;
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void d(@NonNull o oVar) {
        this.f97414c.k(oVar);
    }

    @NonNull
    public final r<T, Z> f() {
        if (this.f97415d != null) {
            return this;
        }
        this.f97415d = new a();
        j();
        return this;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @p0
    public com.bumptech.glide.request.d getRequest() {
        Object objG = g();
        if (objG == null) {
            return null;
        }
        if (objG instanceof com.bumptech.glide.request.d) {
            return (com.bumptech.glide.request.d) objG;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @NonNull
    public T getView() {
        return this.f97413b;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void h(@p0 Drawable drawable) {
        super.h(drawable);
        this.f97414c.b();
        if (this.f97416e) {
            return;
        }
        k();
    }

    void l() {
        com.bumptech.glide.request.d request = getRequest();
        if (request != null) {
            this.f97416e = true;
            request.clear();
            this.f97416e = false;
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void n(@p0 Drawable drawable) {
        super.n(drawable);
        j();
    }

    void o() {
        com.bumptech.glide.request.d request = getRequest();
        if (request != null && request.f()) {
            request.s();
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void p(@p0 com.bumptech.glide.request.d dVar) {
        r(dVar);
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void s(@NonNull o oVar) {
        this.f97414c.d(oVar);
    }

    public String toString() {
        return "Target for: " + this.f97413b;
    }

    @NonNull
    public final r<T, Z> u() {
        this.f97414c.f97423c = true;
        return this;
    }

    @Deprecated
    public r(@NonNull T t10, boolean z10) {
        this(t10);
        if (z10) {
            u();
        }
    }
}
