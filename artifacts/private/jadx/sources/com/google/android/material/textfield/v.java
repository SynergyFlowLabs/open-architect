package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.appcompat.widget.s0;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class v extends androidx.appcompat.widget.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f114242m = 15;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f114243n = "SwitchAccess";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final s0 f114244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final AccessibilityManager f114245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final Rect f114246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @j0
    private final int f114247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f114248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private ColorStateList f114249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f114250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ColorStateList f114251l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            v vVar = v.this;
            v.this.l(i10 < 0 ? vVar.f114244e.C() : vVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = v.this.f114244e.F();
                    i10 = v.this.f114244e.E();
                    j10 = v.this.f114244e.D();
                }
                onItemClickListener.onItemClick(v.this.f114244e.k(), view, i10, j10);
            }
            v.this.f114244e.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private ColorStateList f114253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private ColorStateList f114254b;

        b(Context context, @NonNull int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        @p0
        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{com.google.android.material.color.u.s(v.this.f114250k, v.this.f114251l.getColorForState(iArr2, 0)), com.google.android.material.color.u.s(v.this.f114250k, v.this.f114251l.getColorForState(iArr, 0)), v.this.f114250k});
        }

        @p0
        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.f114250k);
            if (this.f114254b == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.c.o(colorDrawable, this.f114253a);
            return new RippleDrawable(this.f114254b, colorDrawable, null);
        }

        private boolean c() {
            return v.this.f114250k != 0;
        }

        private boolean d() {
            return v.this.f114251l != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.f114251l.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f114254b = e();
            this.f114253a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, @p0 View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                u1.O1(textView, v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(@NonNull Context context) {
        this(context, null);
    }

    @p0
    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f114245f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f114245f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains(f114243n)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f114245f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter != null && textInputLayoutF != null) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
            int iMin = Math.min(adapter.getCount(), Math.max(0, this.f114244e.E()) + 15);
            View view = null;
            int iMax = 0;
            for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                int itemViewType = adapter.getItemViewType(iMax2);
                if (itemViewType != i10) {
                    view = null;
                    i10 = itemViewType;
                }
                view = adapter.getView(iMax2, view, textInputLayoutF);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            Drawable drawableC = this.f114244e.c();
            if (drawableC != null) {
                drawableC.getPadding(this.f114246g);
                Rect rect = this.f114246g;
                iMax += rect.left + rect.right;
            }
            return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
        }
        return 0;
    }

    private void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.J0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f114244e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @p0
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f114249j;
    }

    @Override // android.widget.TextView
    @p0
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.c0()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f114248i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f114250k;
    }

    @p0
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f114251l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.c0() && super.getHint() == null && com.google.android.material.internal.n.d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f114244e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@p0 T t10) {
        super.setAdapter(t10);
        this.f114244e.q(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        s0 s0Var = this.f114244e;
        if (s0Var != null) {
            s0Var.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(@androidx.annotation.l int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(@p0 ColorStateList colorStateList) {
        this.f114249j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof com.google.android.material.shape.k) {
            ((com.google.android.material.shape.k) dropDownBackground).p0(this.f114249j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f114244e.g0(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f114250k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@p0 ColorStateList colorStateList) {
        this.f114251l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(@androidx.annotation.e int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f114244e.a();
        } else {
            super.showDropDown();
        }
    }

    public v(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359233f0);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f114247h, strArr));
    }

    public v(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(a7.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f114246g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.Yl, i10, r6.a.n.f361567yd, new int[0]);
        if (typedArrayK.hasValue(r6.a.o.Zl) && typedArrayK.getInt(r6.a.o.Zl, 0) == 0) {
            setKeyListener(null);
        }
        this.f114247h = typedArrayK.getResourceId(r6.a.o.f361670cm, r6.a.k.f360925t0);
        this.f114248i = typedArrayK.getDimensionPixelOffset(r6.a.o.f361620am, r6.a.f.Zb);
        if (typedArrayK.hasValue(r6.a.o.f361645bm)) {
            this.f114249j = ColorStateList.valueOf(typedArrayK.getColor(r6.a.o.f361645bm, 0));
        }
        this.f114250k = typedArrayK.getColor(r6.a.o.f361695dm, 0);
        this.f114251l = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.f361719em);
        this.f114245f = (AccessibilityManager) context2.getSystemService("accessibility");
        s0 s0Var = new s0(context2);
        this.f114244e = s0Var;
        s0Var.d0(true);
        s0Var.S(this);
        s0Var.a0(2);
        s0Var.q(getAdapter());
        s0Var.f0(new a());
        if (typedArrayK.hasValue(r6.a.o.f361743fm)) {
            setSimpleItems(typedArrayK.getResourceId(r6.a.o.f361743fm, 0));
        }
        typedArrayK.recycle();
    }
}
