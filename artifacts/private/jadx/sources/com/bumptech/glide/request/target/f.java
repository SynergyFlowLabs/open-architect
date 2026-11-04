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
import androidx.annotation.d0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f97374f = "CustomViewTarget";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d0
    private static final int f97375g = com.bumptech.glide.i.e.f96196l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f97376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final T f97377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private View.OnAttachStateChangeListener f97378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f97379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f97380e;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            f.this.r();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.this.o();
        }
    }

    @l1
    static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f97382e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @l1
        @p0
        static Integer f97383f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f97384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<o> f97385b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f97386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private a f97387d;

        private static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<b> f97388a;

            a(@NonNull b bVar) {
                this.f97388a = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                b bVar = this.f97388a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        b(@NonNull View view) {
            this.f97384a = view;
        }

        private static int c(@NonNull Context context) {
            if (f97383f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f97383f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f97383f.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f97386c && this.f97384a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f97384a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            return c(this.f97384a.getContext());
        }

        private int f() {
            int paddingTop = this.f97384a.getPaddingTop() + this.f97384a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f97384a.getLayoutParams();
            return e(this.f97384a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f97384a.getPaddingLeft() + this.f97384a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f97384a.getLayoutParams();
            return e(this.f97384a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f97385b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        void a() {
            if (this.f97385b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f97384a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f97387d);
            }
            this.f97387d = null;
            this.f97385b.clear();
        }

        void d(@NonNull o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f97385b.contains(oVar)) {
                this.f97385b.add(oVar);
            }
            if (this.f97387d == null) {
                ViewTreeObserver viewTreeObserver = this.f97384a.getViewTreeObserver();
                a aVar = new a(this);
                this.f97387d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@NonNull o oVar) {
            this.f97385b.remove(oVar);
        }
    }

    public f(@NonNull T t10) {
        this.f97377b = (T) com.bumptech.glide.util.k.d(t10);
        this.f97376a = new b(t10);
    }

    @p0
    private Object e() {
        return this.f97377b.getTag(f97375g);
    }

    private void g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f97378c;
        if (onAttachStateChangeListener != null && !this.f97380e) {
            this.f97377b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f97380e = true;
        }
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f97378c;
        if (onAttachStateChangeListener != null && this.f97380e) {
            this.f97377b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f97380e = false;
        }
    }

    private void t(@p0 Object obj) {
        this.f97377b.setTag(f97375g, obj);
    }

    @Override // com.bumptech.glide.manager.i
    public void a() {
    }

    @Override // com.bumptech.glide.manager.i
    public void b() {
    }

    @NonNull
    public final f<T, Z> c() {
        if (this.f97378c != null) {
            return this;
        }
        this.f97378c = new a();
        g();
        return this;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void d(@NonNull o oVar) {
        this.f97376a.k(oVar);
    }

    @NonNull
    public final T f() {
        return this.f97377b;
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public final com.bumptech.glide.request.d getRequest() {
        Object objE = e();
        if (objE == null) {
            return null;
        }
        if (objE instanceof com.bumptech.glide.request.d) {
            return (com.bumptech.glide.request.d) objE;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // com.bumptech.glide.request.target.p
    public final void h(@p0 Drawable drawable) {
        this.f97376a.b();
        k(drawable);
        if (this.f97379d) {
            return;
        }
        j();
    }

    protected abstract void k(@p0 Drawable drawable);

    protected void l(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.i
    public void m() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void n(@p0 Drawable drawable) {
        g();
        l(drawable);
    }

    final void o() {
        com.bumptech.glide.request.d request = getRequest();
        if (request != null) {
            this.f97379d = true;
            request.clear();
            this.f97379d = false;
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public final void p(@p0 com.bumptech.glide.request.d dVar) {
        t(dVar);
    }

    final void r() {
        com.bumptech.glide.request.d request = getRequest();
        if (request == null || !request.f()) {
            return;
        }
        request.s();
    }

    @Override // com.bumptech.glide.request.target.p
    public final void s(@NonNull o oVar) {
        this.f97376a.d(oVar);
    }

    public String toString() {
        return "Target for: " + this.f97377b;
    }

    @Deprecated
    public final f<T, Z> u(@d0 int i10) {
        return this;
    }

    @NonNull
    public final f<T, Z> v() {
        this.f97376a.f97386c = true;
        return this;
    }
}
