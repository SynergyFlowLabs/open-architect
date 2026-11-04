package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.p1;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class NavigationMenuItemView extends m implements androidx.appcompat.view.menu.o.a {
    private static final int[] B3 = {R.attr.state_checked};
    private final androidx.core.view.a A3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f112727q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f112728r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    boolean f112729s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    boolean f112730t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private final CheckedTextView f112731u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private FrameLayout f112732v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private androidx.appcompat.view.menu.j f112733w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private ColorStateList f112734x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private boolean f112735y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private Drawable f112736z3;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.h1(NavigationMenuItemView.this.f112729s3);
        }
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void D() {
        if (H()) {
            this.f112731u3.setVisibility(8);
            FrameLayout frameLayout = this.f112732v3;
            if (frameLayout != null) {
                LinearLayoutCompat.b bVar = (LinearLayoutCompat.b) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) bVar).width = -1;
                this.f112732v3.setLayoutParams(bVar);
                return;
            }
            return;
        }
        this.f112731u3.setVisibility(0);
        FrameLayout frameLayout2 = this.f112732v3;
        if (frameLayout2 != null) {
            LinearLayoutCompat.b bVar2 = (LinearLayoutCompat.b) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) bVar2).width = -2;
            this.f112732v3.setLayoutParams(bVar2);
        }
    }

    @androidx.annotation.p0
    private StateListDrawable E() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i.a.b.G0, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(B3, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean H() {
        return this.f112733w3.getTitle() == null && this.f112733w3.getIcon() == null && this.f112733w3.getActionView() != null;
    }

    private void setActionView(@androidx.annotation.p0 View view) {
        if (view != null) {
            if (this.f112732v3 == null) {
                this.f112732v3 = (FrameLayout) ((ViewStub) findViewById(r6.a.h.f360665g1)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f112732v3.removeAllViews();
            this.f112732v3.addView(view);
        }
    }

    public void F(@NonNull androidx.appcompat.view.menu.j jVar, boolean z10) {
        this.f112730t3 = z10;
        g(jVar, 0);
    }

    public void G() {
        FrameLayout frameLayout = this.f112732v3;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f112731u3.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void e(boolean z10, char c10) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(@NonNull androidx.appcompat.view.menu.j jVar, int i10) {
        this.f112733w3 = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            u1.O1(this, E());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        p1.a(this, jVar.getTooltipText());
        D();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.f112733w3;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean h() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.j jVar = this.f112733w3;
        if (jVar != null && jVar.isCheckable() && this.f112733w3.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B3);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f112729s3 != z10) {
            this.f112729s3 = z10;
            this.A3.sendAccessibilityEvent(this.f112731u3, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f112731u3.setChecked(z10);
        CheckedTextView checkedTextView = this.f112731u3;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f112730t3) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@androidx.annotation.p0 Drawable drawable) {
        if (drawable != null) {
            if (this.f112735y3) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.c.r(drawable).mutate();
                androidx.core.graphics.drawable.c.o(drawable, this.f112734x3);
            }
            int i10 = this.f112727q3;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f112728r3) {
            if (this.f112736z3 == null) {
                Drawable drawableG = androidx.core.content.res.i.g(getResources(), r6.a.g.f360574p2, getContext().getTheme());
                this.f112736z3 = drawableG;
                if (drawableG != null) {
                    int i11 = this.f112727q3;
                    drawableG.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f112736z3;
        }
        androidx.core.widget.r.u(this.f112731u3, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f112731u3.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(@androidx.annotation.r int i10) {
        this.f112727q3 = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f112734x3 = colorStateList;
        this.f112735y3 = colorStateList != null;
        androidx.appcompat.view.menu.j jVar = this.f112733w3;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f112731u3.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f112728r3 = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.r.D(this.f112731u3, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f112731u3.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.f112731u3.setText(charSequence);
    }

    public NavigationMenuItemView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11 = 7 >> 1;
        this.f112730t3 = true;
        a aVar = new a();
        this.A3 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(r6.a.k.P, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(r6.a.f.f360340p1));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(r6.a.h.f360673h1);
        this.f112731u3 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        u1.G1(checkedTextView, aVar);
    }
}
