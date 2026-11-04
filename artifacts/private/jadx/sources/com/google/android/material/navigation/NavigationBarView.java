package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.j1;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.g0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f113012g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f113013h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f113014i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f113015j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f113016k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.navigation.d f113017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final e f113018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final NavigationBarPresenter f113019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MenuInflater f113020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f113021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f113022f;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        Bundle f113023c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.f113023c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f113023c);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    class a implements androidx.appcompat.view.menu.g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
            if (NavigationBarView.this.f113022f == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                return (NavigationBarView.this.f113021e == null || NavigationBarView.this.f113021e.a(menuItem)) ? false : true;
            }
            NavigationBarView.this.f113022f.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface b {
    }

    public interface c {
        void a(@NonNull MenuItem menuItem);
    }

    public interface d {
        boolean a(@NonNull MenuItem menuItem);
    }

    public NavigationBarView(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f113019c = navigationBarPresenter;
        Context context2 = getContext();
        j1 j1VarL = g0.l(context2, attributeSet, r6.a.o.Zp, i10, i11, r6.a.o.mq, r6.a.o.kq);
        com.google.android.material.navigation.d dVar = new com.google.android.material.navigation.d(context2, getClass(), getMaxItemCount());
        this.f113017a = dVar;
        e eVarC = c(context2);
        this.f113018b = eVarC;
        navigationBarPresenter.d(eVarC);
        navigationBarPresenter.a(1);
        eVarC.setPresenter(navigationBarPresenter);
        dVar.b(navigationBarPresenter);
        navigationBarPresenter.i(getContext(), dVar);
        if (j1VarL.C(r6.a.o.gq)) {
            eVarC.setIconTintList(j1VarL.d(r6.a.o.gq));
        } else {
            eVarC.setIconTintList(eVarC.e(R.attr.textColorSecondary));
        }
        setItemIconSize(j1VarL.g(r6.a.o.fq, getResources().getDimensionPixelSize(r6.a.f.Fc)));
        if (j1VarL.C(r6.a.o.mq)) {
            setItemTextAppearanceInactive(j1VarL.u(r6.a.o.mq, 0));
        }
        if (j1VarL.C(r6.a.o.kq)) {
            setItemTextAppearanceActive(j1VarL.u(r6.a.o.kq, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(j1VarL.a(r6.a.o.lq, true));
        if (j1VarL.C(r6.a.o.nq)) {
            setItemTextColor(j1VarL.d(r6.a.o.nq));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListG = com.google.android.material.drawable.a.g(background);
        if (background == null || colorStateListG != null) {
            k kVar = new k(p.e(context2, attributeSet, i10, i11).m());
            if (colorStateListG != null) {
                kVar.p0(colorStateListG);
            }
            kVar.a0(context2);
            u1.O1(this, kVar);
        }
        if (j1VarL.C(r6.a.o.iq)) {
            setItemPaddingTop(j1VarL.g(r6.a.o.iq, 0));
        }
        if (j1VarL.C(r6.a.o.hq)) {
            setItemPaddingBottom(j1VarL.g(r6.a.o.hq, 0));
        }
        if (j1VarL.C(r6.a.o.aq)) {
            setActiveIndicatorLabelPadding(j1VarL.g(r6.a.o.aq, 0));
        }
        if (j1VarL.C(r6.a.o.cq)) {
            setElevation(j1VarL.g(r6.a.o.cq, 0));
        }
        androidx.core.graphics.drawable.c.o(getBackground().mutate(), com.google.android.material.resources.c.b(context2, j1VarL, r6.a.o.bq));
        setLabelVisibilityMode(j1VarL.p(r6.a.o.oq, -1));
        int iU = j1VarL.u(r6.a.o.eq, 0);
        if (iU != 0) {
            eVarC.setItemBackgroundRes(iU);
        } else {
            setItemRippleColor(com.google.android.material.resources.c.b(context2, j1VarL, r6.a.o.jq));
        }
        int iU2 = j1VarL.u(r6.a.o.dq, 0);
        if (iU2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iU2, r6.a.o.Tp);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Vp, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Up, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(r6.a.o.Xp, 0));
            setItemActiveIndicatorColor(com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes, r6.a.o.Wp));
            setItemActiveIndicatorShapeAppearance(p.b(context2, typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Yp, 0), 0).m());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (j1VarL.C(r6.a.o.pq)) {
            f(j1VarL.u(r6.a.o.pq, 0));
        }
        j1VarL.I();
        addView(eVarC);
        dVar.Y(new a());
    }

    private MenuInflater getMenuInflater() {
        if (this.f113020d == null) {
            this.f113020d = new androidx.appcompat.view.g(getContext());
        }
        return this.f113020d;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    protected abstract e c(@NonNull Context context);

    @p0
    public com.google.android.material.badge.a d(int i10) {
        return this.f113018b.i(i10);
    }

    @NonNull
    public com.google.android.material.badge.a e(int i10) {
        return this.f113018b.j(i10);
    }

    public void f(int i10) {
        this.f113019c.k(true);
        getMenuInflater().inflate(i10, this.f113017a);
        this.f113019c.k(false);
        this.f113019c.f(true);
    }

    public boolean g() {
        return this.f113018b.getItemActiveIndicatorEnabled();
    }

    @t0
    public int getActiveIndicatorLabelPadding() {
        return this.f113018b.getActiveIndicatorLabelPadding();
    }

    @p0
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f113018b.getItemActiveIndicatorColor();
    }

    @t0
    public int getItemActiveIndicatorHeight() {
        return this.f113018b.getItemActiveIndicatorHeight();
    }

    @t0
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f113018b.getItemActiveIndicatorMarginHorizontal();
    }

    @p0
    public p getItemActiveIndicatorShapeAppearance() {
        return this.f113018b.getItemActiveIndicatorShapeAppearance();
    }

    @t0
    public int getItemActiveIndicatorWidth() {
        return this.f113018b.getItemActiveIndicatorWidth();
    }

    @p0
    public Drawable getItemBackground() {
        return this.f113018b.getItemBackground();
    }

    @v
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f113018b.getItemBackgroundRes();
    }

    @r
    public int getItemIconSize() {
        return this.f113018b.getItemIconSize();
    }

    @p0
    public ColorStateList getItemIconTintList() {
        return this.f113018b.getIconTintList();
    }

    @t0
    public int getItemPaddingBottom() {
        return this.f113018b.getItemPaddingBottom();
    }

    @t0
    public int getItemPaddingTop() {
        return this.f113018b.getItemPaddingTop();
    }

    @p0
    public ColorStateList getItemRippleColor() {
        return this.f113018b.getItemRippleColor();
    }

    @g1
    public int getItemTextAppearanceActive() {
        return this.f113018b.getItemTextAppearanceActive();
    }

    @g1
    public int getItemTextAppearanceInactive() {
        return this.f113018b.getItemTextAppearanceInactive();
    }

    @p0
    public ColorStateList getItemTextColor() {
        return this.f113018b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f113018b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f113017a;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public o getMenuView() {
        return this.f113018b;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f113019c;
    }

    @d0
    public int getSelectedItemId() {
        return this.f113018b.getSelectedItemId();
    }

    public void h(int i10) {
        this.f113018b.n(i10);
    }

    public void i(int i10, @p0 View.OnTouchListener onTouchListener) {
        this.f113018b.q(i10, onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f113017a.V(savedState.f113023c);
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f113023c = bundle;
        this.f113017a.X(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(@t0 int i10) {
        this.f113018b.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        l.d(this, f10);
    }

    public void setItemActiveIndicatorColor(@p0 ColorStateList colorStateList) {
        this.f113018b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f113018b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(@t0 int i10) {
        this.f113018b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(@t0 int i10) {
        this.f113018b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(@p0 p pVar) {
        this.f113018b.setItemActiveIndicatorShapeAppearance(pVar);
    }

    public void setItemActiveIndicatorWidth(@t0 int i10) {
        this.f113018b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(@p0 Drawable drawable) {
        this.f113018b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@v int i10) {
        this.f113018b.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(@r int i10) {
        this.f113018b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(@q int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(@p0 ColorStateList colorStateList) {
        this.f113018b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@t0 int i10) {
        this.f113018b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(@t0 int i10) {
        this.f113018b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(@p0 ColorStateList colorStateList) {
        this.f113018b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@g1 int i10) {
        this.f113018b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f113018b.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(@g1 int i10) {
        this.f113018b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(@p0 ColorStateList colorStateList) {
        this.f113018b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f113018b.getLabelVisibilityMode() != i10) {
            this.f113018b.setLabelVisibilityMode(i10);
            this.f113019c.f(false);
        }
    }

    public void setOnItemReselectedListener(@p0 c cVar) {
        this.f113022f = cVar;
    }

    public void setOnItemSelectedListener(@p0 d dVar) {
        this.f113021e = dVar;
    }

    public void setSelectedItemId(@d0 int i10) {
        MenuItem menuItemFindItem = this.f113017a.findItem(i10);
        if (menuItemFindItem == null || this.f113017a.Q(menuItemFindItem, this.f113019c, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
