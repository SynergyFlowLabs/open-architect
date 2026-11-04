package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class l extends RecyclerView.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f74392d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f74393e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f74394f = "DividerItem";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f74395g = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f74396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f74397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f74398c = new Rect();

    @e.a({"UnknownNullness"})
    public l(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f74395g);
        this.f74396a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        j(i10);
    }

    private void f(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getLayoutManager().c0(childAt, this.f74398c);
            int iRound = this.f74398c.right + Math.round(childAt.getTranslationX());
            this.f74396a.setBounds(iRound - this.f74396a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f74396a.draw(canvas);
        }
        canvas.restore();
    }

    private void g(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.y0(childAt, this.f74398c);
            int iRound = this.f74398c.bottom + Math.round(childAt.getTranslationY());
            this.f74396a.setBounds(paddingLeft, iRound - this.f74396a.getIntrinsicHeight(), width, iRound);
            this.f74396a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @e.a({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        Drawable drawable = this.f74396a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f74397b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @p0
    public Drawable h() {
        return this.f74396a;
    }

    public void i(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f74396a = drawable;
    }

    public void j(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f74397b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @e.a({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null || this.f74396a == null) {
            return;
        }
        if (this.f74397b == 1) {
            g(canvas, recyclerView);
        } else {
            f(canvas, recyclerView);
        }
    }
}
