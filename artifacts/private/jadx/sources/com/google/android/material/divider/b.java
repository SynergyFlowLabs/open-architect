package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.core.content.d;
import androidx.core.graphics.drawable.c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.p0;

/* JADX INFO: loaded from: classes4.dex */
public class b extends RecyclerView.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f112525i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f112526j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f112527k = r6.a.n.Mj;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private Drawable f112528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f112529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private int f112530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f112531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f112532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f112533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f112534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f112535h;

    public b(@NonNull Context context, int i10) {
        this(context, null, i10);
    }

    private void f(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i10;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i12 = paddingTop + this.f112532e;
        int i13 = height - this.f112533f;
        boolean zS = p0.s(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = recyclerView.getChildAt(i14);
            if (y(recyclerView, childAt)) {
                recyclerView.getLayoutManager().c0(childAt, this.f112535h);
                int iRound = Math.round(childAt.getTranslationX());
                if (zS) {
                    i11 = this.f112535h.left + iRound;
                    i10 = this.f112529b + i11;
                } else {
                    i10 = iRound + this.f112535h.right;
                    i11 = i10 - this.f112529b;
                }
                this.f112528a.setBounds(i11, i12, i10, i13);
                this.f112528a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f112528a.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        int i10 = 7 & 0;
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zS = p0.s(recyclerView);
        int i11 = paddingLeft + (zS ? this.f112533f : this.f112532e);
        int i12 = width - (zS ? this.f112532e : this.f112533f);
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            if (y(recyclerView, childAt)) {
                recyclerView.getLayoutManager().c0(childAt, this.f112535h);
                int iRound = this.f112535h.bottom + Math.round(childAt.getTranslationY());
                this.f112528a.setBounds(i11, iRound - this.f112529b, i12, iRound);
                this.f112528a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f112528a.draw(canvas);
            }
        }
        canvas.restore();
    }

    private boolean y(@NonNull RecyclerView recyclerView, @NonNull View view) {
        int iS0 = recyclerView.s0(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        return iS0 != -1 && (!(adapter != null && iS0 == adapter.getItemCount() - 1) || this.f112534g) && x(iS0, adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
        rect.set(0, 0, 0, 0);
        if (y(recyclerView, view)) {
            if (this.f112531d == 1) {
                rect.bottom = this.f112529b;
            } else if (p0.s(recyclerView)) {
                rect.left = this.f112529b;
            } else {
                rect.right = this.f112529b;
            }
        }
    }

    @l
    public int h() {
        return this.f112530c;
    }

    @t0
    public int i() {
        return this.f112533f;
    }

    @t0
    public int j() {
        return this.f112532e;
    }

    @t0
    public int k() {
        return this.f112529b;
    }

    public int l() {
        return this.f112531d;
    }

    public boolean m() {
        return this.f112534g;
    }

    public void n(@l int i10) {
        this.f112530c = i10;
        Drawable drawableR = c.r(this.f112528a);
        this.f112528a = drawableR;
        c.n(drawableR, i10);
    }

    public void o(@NonNull Context context, @n int i10) {
        n(d.g(context, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f112531d == 1) {
            g(canvas, recyclerView);
        } else {
            f(canvas, recyclerView);
        }
    }

    public void p(@t0 int i10) {
        this.f112533f = i10;
    }

    public void q(@NonNull Context context, @q int i10) {
        p(context.getResources().getDimensionPixelOffset(i10));
    }

    public void r(@t0 int i10) {
        this.f112532e = i10;
    }

    public void s(@NonNull Context context, @q int i10) {
        r(context.getResources().getDimensionPixelOffset(i10));
    }

    public void t(@t0 int i10) {
        this.f112529b = i10;
    }

    public void u(@NonNull Context context, @q int i10) {
        t(context.getResources().getDimensionPixelSize(i10));
    }

    public void v(boolean z10) {
        this.f112534g = z10;
    }

    public void w(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f112531d = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i10 + ". It should be either HORIZONTAL or VERTICAL");
    }

    protected boolean x(int i10, @androidx.annotation.p0 RecyclerView.h<?> hVar) {
        return true;
    }

    public b(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, r6.a.c.Lc, i10);
    }

    public b(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        this.f112535h = new Rect();
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.In, i10, f112527k, new int[0]);
        this.f112530c = com.google.android.material.resources.c.a(context, typedArrayK, r6.a.o.Jn).getDefaultColor();
        this.f112529b = typedArrayK.getDimensionPixelSize(r6.a.o.Mn, context.getResources().getDimensionPixelSize(r6.a.f.Q9));
        this.f112532e = typedArrayK.getDimensionPixelOffset(r6.a.o.Ln, 0);
        this.f112533f = typedArrayK.getDimensionPixelOffset(r6.a.o.Kn, 0);
        this.f112534g = typedArrayK.getBoolean(r6.a.o.Nn, true);
        typedArrayK.recycle();
        this.f112528a = new ShapeDrawable();
        n(this.f112530c);
        w(i11);
    }
}
