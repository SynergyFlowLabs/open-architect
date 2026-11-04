package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.core.util.s;
import androidx.core.view.u1;
import androidx.transition.s0;
import com.google.android.material.internal.e0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class e extends ViewGroup implements o {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f113096o3 = 5;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f113097p3 = -1;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int[] f113098q3 = {R.attr.state_checked};

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int[] f113099r3 = {-16842910};
    private int H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final s0 f113100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final View.OnClickListener f113101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s.a<c> f113102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final SparseArray<View.OnTouchListener> f113103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f113104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private c[] f113105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f113106g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f113107g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f113108h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f113109h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private ColorStateList f113110i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f113111i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @r
    private int f113112j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private p f113113j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f113114k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f113115k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final ColorStateList f113116l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private ColorStateList f113117l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @g1
    private int f113118m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private NavigationBarPresenter f113119m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @g1
    private int f113120n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f113121n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f113122o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f113123p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f113124p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f113125p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f113126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private ColorStateList f113127t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f113128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private final SparseArray<com.google.android.material.badge.a> f113129w;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j itemData = ((c) view).getItemData();
            if (e.this.f113121n3.Q(itemData, e.this.f113119m3, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public e(@NonNull Context context) {
        super(context);
        this.f113102c = new s.c(5);
        this.f113103d = new SparseArray<>(5);
        this.f113106g = 0;
        this.f113108h = 0;
        this.f113129w = new SparseArray<>(5);
        this.f113123p0 = -1;
        this.f113124p1 = -1;
        this.H1 = -1;
        this.f113115k3 = false;
        this.f113116l = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f113100a = null;
        } else {
            androidx.transition.b bVar = new androidx.transition.b();
            this.f113100a = bVar;
            bVar.g1(0);
            bVar.E0(com.google.android.material.motion.j.f(getContext(), r6.a.c.Ld, getResources().getInteger(r6.a.i.M)));
            bVar.G0(com.google.android.material.motion.j.g(getContext(), r6.a.c.Yd, com.google.android.material.animation.b.f111044b));
            bVar.S0(new e0());
        }
        this.f113101b = new a();
        u1.Y1(this, 1);
    }

    @p0
    private Drawable f() {
        if (this.f113113j3 == null || this.f113117l3 == null) {
            return null;
        }
        k kVar = new k(this.f113113j3);
        kVar.p0(this.f113117l3);
        return kVar;
    }

    private c getNewItem() {
        c cVarAcquire = this.f113102c.acquire();
        return cVarAcquire == null ? g(getContext()) : cVarAcquire;
    }

    private boolean m(int i10) {
        return i10 != -1;
    }

    private void o() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f113121n3.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f113121n3.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f113129w.size(); i11++) {
            int iKeyAt = this.f113129w.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f113129w.delete(iKeyAt);
            }
        }
    }

    private void setBadgeIfNeeded(@NonNull c cVar) {
        com.google.android.material.badge.a aVar;
        int id2 = cVar.getId();
        if (m(id2) && (aVar = this.f113129w.get(id2)) != null) {
            cVar.setBadge(aVar);
        }
    }

    private void t(int i10) {
        if (m(i10)) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(@NonNull androidx.appcompat.view.menu.g gVar) {
        this.f113121n3 = gVar;
    }

    @e.a({"ClickableViewAccessibility"})
    public void d() {
        removeAllViews();
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    this.f113102c.a(cVar);
                    cVar.j();
                }
            }
        }
        if (this.f113121n3.size() == 0) {
            this.f113106g = 0;
            this.f113108h = 0;
            int i10 = 6 & 0;
            this.f113105f = null;
            return;
        }
        o();
        this.f113105f = new c[this.f113121n3.size()];
        boolean zL = l(this.f113104e, this.f113121n3.H().size());
        for (int i11 = 0; i11 < this.f113121n3.size(); i11++) {
            this.f113119m3.k(true);
            this.f113121n3.getItem(i11).setCheckable(true);
            this.f113119m3.k(false);
            c newItem = getNewItem();
            this.f113105f[i11] = newItem;
            newItem.setIconTintList(this.f113110i);
            newItem.setIconSize(this.f113112j);
            newItem.setTextColor(this.f113116l);
            newItem.setTextAppearanceInactive(this.f113118m);
            newItem.setTextAppearanceActive(this.f113120n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f113122o);
            newItem.setTextColor(this.f113114k);
            int i12 = this.f113123p0;
            if (i12 != -1) {
                newItem.setItemPaddingTop(i12);
            }
            int i13 = this.f113124p1;
            if (i13 != -1) {
                newItem.setItemPaddingBottom(i13);
            }
            int i14 = this.H1;
            if (i14 != -1) {
                newItem.setActiveIndicatorLabelPadding(i14);
            }
            newItem.setActiveIndicatorWidth(this.f113107g3);
            newItem.setActiveIndicatorHeight(this.f113109h3);
            newItem.setActiveIndicatorMarginHorizontal(this.f113111i3);
            newItem.setActiveIndicatorDrawable(f());
            newItem.setActiveIndicatorResizeable(this.f113115k3);
            newItem.setActiveIndicatorEnabled(this.f113125p2);
            Drawable drawable = this.f113126s;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f113128v);
            }
            newItem.setItemRippleColor(this.f113127t);
            newItem.setShifting(zL);
            newItem.setLabelVisibilityMode(this.f113104e);
            j jVar = (j) this.f113121n3.getItem(i11);
            newItem.g(jVar, 0);
            newItem.setItemPosition(i11);
            int itemId = jVar.getItemId();
            newItem.setOnTouchListener(this.f113103d.get(itemId));
            newItem.setOnClickListener(this.f113101b);
            int i15 = this.f113106g;
            if (i15 != 0 && itemId == i15) {
                this.f113108h = i11;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f113121n3.size() - 1, this.f113108h);
        this.f113108h = iMin;
        this.f113121n3.getItem(iMin).setChecked(true);
    }

    @p0
    public ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = j.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(i.a.b.J0, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f113099r3;
        return new ColorStateList(new int[][]{iArr, f113098q3, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    @NonNull
    protected abstract c g(@NonNull Context context);

    @t0
    public int getActiveIndicatorLabelPadding() {
        return this.H1;
    }

    SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f113129w;
    }

    @p0
    public ColorStateList getIconTintList() {
        return this.f113110i;
    }

    @p0
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f113117l3;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f113125p2;
    }

    @t0
    public int getItemActiveIndicatorHeight() {
        return this.f113109h3;
    }

    @t0
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f113111i3;
    }

    @p0
    public p getItemActiveIndicatorShapeAppearance() {
        return this.f113113j3;
    }

    @t0
    public int getItemActiveIndicatorWidth() {
        return this.f113107g3;
    }

    @p0
    public Drawable getItemBackground() {
        c[] cVarArr = this.f113105f;
        return (cVarArr == null || cVarArr.length <= 0) ? this.f113126s : cVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f113128v;
    }

    @r
    public int getItemIconSize() {
        return this.f113112j;
    }

    @t0
    public int getItemPaddingBottom() {
        return this.f113124p1;
    }

    @t0
    public int getItemPaddingTop() {
        return this.f113123p0;
    }

    @p0
    public ColorStateList getItemRippleColor() {
        return this.f113127t;
    }

    @g1
    public int getItemTextAppearanceActive() {
        return this.f113120n;
    }

    @g1
    public int getItemTextAppearanceInactive() {
        return this.f113118m;
    }

    @p0
    public ColorStateList getItemTextColor() {
        return this.f113114k;
    }

    public int getLabelVisibilityMode() {
        return this.f113104e;
    }

    @p0
    protected androidx.appcompat.view.menu.g getMenu() {
        return this.f113121n3;
    }

    public int getSelectedItemId() {
        return this.f113106g;
    }

    protected int getSelectedItemPosition() {
        return this.f113108h;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return 0;
    }

    @p0
    public c h(int i10) {
        t(i10);
        c[] cVarArr = this.f113105f;
        if (cVarArr == null) {
            return null;
        }
        for (c cVar : cVarArr) {
            if (cVar.getId() == i10) {
                return cVar;
            }
        }
        return null;
    }

    @p0
    public com.google.android.material.badge.a i(int i10) {
        return this.f113129w.get(i10);
    }

    com.google.android.material.badge.a j(int i10) {
        t(i10);
        com.google.android.material.badge.a aVarF = this.f113129w.get(i10);
        if (aVarF == null) {
            aVarF = com.google.android.material.badge.a.f(getContext());
            this.f113129w.put(i10, aVarF);
        }
        c cVarH = h(i10);
        if (cVarH != null) {
            cVarH.setBadge(aVarF);
        }
        return aVarF;
    }

    protected boolean k() {
        return this.f113115k3;
    }

    protected boolean l(int i10, int i11) {
        if (i10 == -1) {
            return i11 > 3;
        }
        return i10 == 0;
    }

    void n(int i10) {
        t(i10);
        c cVarH = h(i10);
        if (cVarH != null) {
            cVarH.r();
        }
        this.f113129w.put(i10, null);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.j.r2(accessibilityNodeInfo).l1(androidx.core.view.accessibility.j.f.h(1, this.f113121n3.H().size(), false, 1));
    }

    void p(SparseArray<com.google.android.material.badge.a> sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.f113129w.indexOfKey(iKeyAt) < 0) {
                this.f113129w.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                com.google.android.material.badge.a aVar = this.f113129w.get(cVar.getId());
                if (aVar != null) {
                    cVar.setBadge(aVar);
                }
            }
        }
    }

    @e.a({"ClickableViewAccessibility"})
    public void q(int i10, @p0 View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f113103d.remove(i10);
        } else {
            this.f113103d.put(i10, onTouchListener);
        }
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar.getItemData().getItemId() == i10) {
                    cVar.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    void r(int i10) {
        int size = this.f113121n3.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.f113121n3.getItem(i11);
            if (i10 == item.getItemId()) {
                this.f113106g = i10;
                this.f113108h = i11;
                item.setChecked(true);
                return;
            }
        }
    }

    public void s() {
        s0 s0Var;
        androidx.appcompat.view.menu.g gVar = this.f113121n3;
        if (gVar == null || this.f113105f == null) {
            return;
        }
        int size = gVar.size();
        if (size != this.f113105f.length) {
            d();
            return;
        }
        int i10 = this.f113106g;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.f113121n3.getItem(i11);
            if (item.isChecked()) {
                this.f113106g = item.getItemId();
                this.f113108h = i11;
            }
        }
        if (i10 != this.f113106g && (s0Var = this.f113100a) != null) {
            androidx.transition.p0.b(this, s0Var);
        }
        boolean zL = l(this.f113104e, this.f113121n3.H().size());
        for (int i12 = 0; i12 < size; i12++) {
            this.f113119m3.k(true);
            this.f113105f[i12].setLabelVisibilityMode(this.f113104e);
            this.f113105f[i12].setShifting(zL);
            this.f113105f[i12].g((j) this.f113121n3.getItem(i12), 0);
            this.f113119m3.k(false);
        }
    }

    public void setActiveIndicatorLabelPadding(@t0 int i10) {
        this.H1 = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorLabelPadding(i10);
            }
        }
    }

    public void setIconTintList(@p0 ColorStateList colorStateList) {
        this.f113110i = colorStateList;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@p0 ColorStateList colorStateList) {
        this.f113117l3 = colorStateList;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f113125p2 = z10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@t0 int i10) {
        this.f113109h3 = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@t0 int i10) {
        this.f113111i3 = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.f113115k3 = z10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            boolean z11 = true | false;
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@p0 p pVar) {
        this.f113113j3 = pVar;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@t0 int i10) {
        this.f113107g3 = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(@p0 Drawable drawable) {
        this.f113126s = drawable;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f113128v = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(@r int i10) {
        this.f113112j = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(@t0 int i10) {
        this.f113124p1 = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(@t0 int i10) {
        this.f113123p0 = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(@p0 ColorStateList colorStateList) {
        this.f113127t = colorStateList;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@g1 int i10) {
        this.f113120n = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f113114k;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f113122o = z10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActiveBoldEnabled(z10);
            }
        }
    }

    public void setItemTextAppearanceInactive(@g1 int i10) {
        this.f113118m = i10;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f113114k;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@p0 ColorStateList colorStateList) {
        this.f113114k = colorStateList;
        c[] cVarArr = this.f113105f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f113104e = i10;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.f113119m3 = navigationBarPresenter;
    }
}
