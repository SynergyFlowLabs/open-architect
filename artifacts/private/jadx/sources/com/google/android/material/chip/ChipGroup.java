package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.h;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.core.view.accessibility.j;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.l;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ChipGroup extends l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f111866k = r6.a.n.Vi;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @r
    private int f111867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @r
    private int f111868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private e f111869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.material.internal.a<Chip> f111870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f111871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final f f111872j;

    class a implements com.google.android.material.internal.a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set<Integer> set) {
            if (ChipGroup.this.f111869g != null) {
                e eVar = ChipGroup.this.f111869g;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f111870h.j(ChipGroup.this));
            }
        }
    }

    class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f111874a;

        b(d dVar) {
            this.f111874a = dVar;
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list) {
            if (ChipGroup.this.f111870h.m()) {
                this.f111874a.a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    public interface d {
        void a(@NonNull ChipGroup chipGroup, @d0 int i10);
    }

    public interface e {
        void a(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f111876a;

        private f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(u1.D());
                }
                ChipGroup.this.f111870h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f111876a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f111870h.o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f111876a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() == 0;
    }

    @Override // com.google.android.material.internal.l
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public void g(@d0 int i10) {
        this.f111870h.f(i10);
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @d0
    public int getCheckedChipId() {
        return this.f111870h.k();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f111870h.j(this);
    }

    @r
    public int getChipSpacingHorizontal() {
        return this.f111867e;
    }

    @r
    public int getChipSpacingVertical() {
        return this.f111868f;
    }

    public void h() {
        this.f111870h.h();
    }

    int i(@p0 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && j(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public boolean k() {
        return this.f111870h.l();
    }

    public boolean l() {
        return this.f111870h.m();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f111871i;
        if (i10 != -1) {
            this.f111870h.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j.r2(accessibilityNodeInfo).l1(j.f.h(getRowCount(), c() ? getVisibleChipCount() : -1, false, l() ? 1 : 2));
    }

    public void setChipSpacing(@r int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(@r int i10) {
        if (this.f111867e != i10) {
            this.f111867e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@q int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(@q int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(@r int i10) {
        if (this.f111868f != i10) {
            this.f111868f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@q int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@p0 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@p0 d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(@p0 e eVar) {
        this.f111869g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f111872j.f111876a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f111870h.q(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.l
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f111870h.r(z10);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359554t2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(@h int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(@h int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f111866k;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.internal.a<Chip> aVar = new com.google.android.material.internal.a<>();
        this.f111870h = aVar;
        f fVar = new f(this, null);
        this.f111872j = fVar;
        TypedArray typedArrayK = g0.k(getContext(), attributeSet, r6.a.o.f361824j7, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayK.getDimensionPixelOffset(r6.a.o.f361872l7, 0);
        setChipSpacingHorizontal(typedArrayK.getDimensionPixelOffset(r6.a.o.f361896m7, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayK.getDimensionPixelOffset(r6.a.o.f361920n7, dimensionPixelOffset));
        setSingleLine(typedArrayK.getBoolean(r6.a.o.f361968p7, false));
        setSingleSelection(typedArrayK.getBoolean(r6.a.o.f361992q7, false));
        setSelectionRequired(typedArrayK.getBoolean(r6.a.o.f361944o7, false));
        this.f111871i = typedArrayK.getResourceId(r6.a.o.f361848k7, -1);
        typedArrayK.recycle();
        aVar.p(new a());
        super.setOnHierarchyChangeListener(fVar);
        u1.Y1(this, 1);
    }
}
