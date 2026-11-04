package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.core.view.u1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f112873a;

    @e.a({"ViewConstructor", "PrivateApi"})
    static class a extends ViewGroup {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static Method f112874f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ViewGroup f112875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f112876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ArrayList<Drawable> f112877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        l0 f112878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f112879e;

        static {
            try {
                Class cls = Integer.TYPE;
                f112874f = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, l0 l0Var) {
            super(context);
            this.f112877c = null;
            this.f112875a = viewGroup;
            this.f112876b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f112878d = l0Var;
        }

        private void c() {
            if (this.f112879e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f112877c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f112879e = true;
                    this.f112875a.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f112875a.getLocationOnScreen(iArr2);
            this.f112876b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f112877c == null) {
                this.f112877c = new ArrayList<>();
            }
            if (this.f112877c.contains(drawable)) {
                return;
            }
            this.f112877c.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f112875a && viewGroup.getParent() != null && u1.R0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f112875a.getLocationOnScreen(iArr2);
                    int i10 = 3 ^ 0;
                    u1.h1(view, iArr[0] - iArr2[0]);
                    u1.i1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f112875a.getLocationOnScreen(iArr);
            this.f112876b.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f112876b.getWidth(), this.f112876b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f112877c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f112877c.get(i10).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i10, int i11, Rect rect) {
            if (this.f112875a != null && f112874f != null) {
                try {
                    e(new int[2]);
                    f112874f.invoke(this.f112875a, Integer.valueOf(i10), Integer.valueOf(i11), rect);
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                } catch (InvocationTargetException e11) {
                    e11.printStackTrace();
                }
            }
            return null;
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f112877c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f112875a != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f112875a != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@NonNull Drawable drawable) {
            ArrayList<Drawable> arrayList;
            if (!super.verifyDrawable(drawable) && ((arrayList = this.f112877c) == null || !arrayList.contains(drawable))) {
                return false;
            }
            return true;
        }
    }

    l0(Context context, ViewGroup viewGroup, View view) {
        this.f112873a = new a(context, viewGroup, view, this);
    }

    static l0 e(View view) {
        ViewGroup viewGroupL = p0.l(view);
        if (viewGroupL == null) {
            return null;
        }
        int childCount = viewGroupL.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroupL.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).f112878d;
            }
        }
        return new i0(viewGroupL.getContext(), viewGroupL, view);
    }

    @Override // com.google.android.material.internal.n0
    public void a(@NonNull Drawable drawable) {
        this.f112873a.g(drawable);
    }

    @Override // com.google.android.material.internal.n0
    public void b(@NonNull Drawable drawable) {
        this.f112873a.a(drawable);
    }
}
