package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.l0 {
    private static final String TAG = "Toolbar";
    private androidx.appcompat.view.menu.n.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private y0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    androidx.appcompat.view.menu.g.a mMenuBuilderCallback;
    final androidx.core.view.o0 mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    h mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private o1 mWrapper;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f11115d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f11114c);
            parcel.writeInt(this.f11115d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11114c = parcel.readInt();
            this.f11115d = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.mMenuHostHelper.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.mOnMenuItemClickListener;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    class c implements androidx.appcompat.view.menu.g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
            androidx.appcompat.view.menu.g.a aVar = Toolbar.this.mMenuBuilderCallback;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.mMenuView.L()) {
                Toolbar.this.mMenuHostHelper.i(gVar);
            }
            androidx.appcompat.view.menu.g.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    @androidx.annotation.w0(33)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        @androidx.annotation.p0
        static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @androidx.annotation.u
        static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.m1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @androidx.annotation.u
        static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @androidx.annotation.u
        static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.g f11120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.j f11121b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.n
        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean c(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = jVar.getActionView();
            this.f11121b = jVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f10275a = (toolbar4.mButtonGravity & com.planner5d.library.engine.input.f.b.B) | androidx.core.view.d0.f48643b;
                gVarGenerateDefaultLayoutParams.f11126b = 2;
                toolbar4.mExpandedActionView.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            jVar.t(true);
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public Parcelable e() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public void f(boolean z10) {
            if (this.f11121b != null) {
                androidx.appcompat.view.menu.g gVar = this.f11120a;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f11120a.getItem(i10) == this.f11121b) {
                            return;
                        }
                    }
                }
                h(this.f11120a, this.f11121b);
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean h(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f11121b = null;
            Toolbar.this.requestLayout();
            jVar.t(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.f11120a;
            if (gVar2 != null && (jVar = this.f11121b) != null) {
                gVar2.g(jVar);
            }
            this.f11120a = gVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public void j(androidx.appcompat.view.menu.n.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void l(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean m(androidx.appcompat.view.menu.s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public androidx.appcompat.view.menu.o n(ViewGroup viewGroup) {
            return null;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private void a(List<View> list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iD = androidx.core.view.d0.d(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f11126b == 0 && v(childAt) && h(gVar.f10275a) == iD) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f11126b == 0 && v(childAt2) && h(gVar2.f10275a) == iD) {
                list.add(childAt2);
            }
        }
    }

    private void b(View view, boolean z10) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f11126b = 1;
        if (!z10 || this.mExpandedActionView == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    private void c() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new y0();
        }
    }

    private void d() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void e() {
        f();
        if (this.mMenuView.P() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            gVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void f() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.Q(this.mActionMenuPresenterCallback, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f10275a = (this.mButtonGravity & com.planner5d.library.engine.input.f.b.B) | androidx.core.view.d0.f48644c;
            this.mMenuView.setLayoutParams(gVarGenerateDefaultLayoutParams);
            b(this.mMenuView, false);
        }
    }

    private void g() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new t(getContext(), null, i.a.b.T3);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f10275a = (this.mButtonGravity & com.planner5d.library.engine.input.f.b.B) | androidx.core.view.d0.f48643b;
            this.mNavButtonView.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private int h(int i10) {
        int layoutDirection = getLayoutDirection();
        int iD = androidx.core.view.d0.d(i10, layoutDirection) & 7;
        if (iD == 1 || iD == 3 || iD == 5) {
            return iD;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int i(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iJ = j(gVar.f10275a);
        if (iJ == 48) {
            return getPaddingTop() - i11;
        }
        if (iJ == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int j(int i10) {
        int i11 = i10 & com.planner5d.library.engine.input.f.b.B;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.mGravity & com.planner5d.library.engine.input.f.b.B;
    }

    private int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int m(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean n(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int o(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i13, iMax + measuredWidth, view.getMeasuredHeight() + i13);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int p(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i13, iMax, view.getMeasuredHeight() + i13);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int q(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void r(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void s() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void t() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean u() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (v(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    void addChildrenForExpandedActionView() {
        int size = this.mHiddenViews.size();
        while (true) {
            size--;
            if (size < 0) {
                this.mHiddenViews.clear();
                return;
            }
            addView(this.mHiddenViews.get(size));
        }
    }

    @Override // androidx.core.view.l0
    @androidx.annotation.l0
    public void addMenuProvider(@NonNull androidx.core.view.r0 r0Var) {
        this.mMenuHostHelper.c(r0Var);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.M();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public void collapseActionView() {
        f fVar = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.j jVar = fVar == null ? null : fVar.f11121b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.D();
        }
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            t tVar = new t(getContext(), null, i.a.b.T3);
            this.mCollapseButtonView = tVar;
            tVar.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f10275a = (this.mButtonGravity & com.planner5d.library.engine.input.f.b.B) | androidx.core.view.d0.f48643b;
            gVarGenerateDefaultLayoutParams.f11126b = 2;
            this.mCollapseButtonView.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    @androidx.annotation.p0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.p0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        y0 y0Var = this.mContentInsets;
        if (y0Var != null) {
            return y0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.mContentInsetEndWithActions;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        y0 y0Var = this.mContentInsets;
        if (y0Var != null) {
            return y0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        y0 y0Var = this.mContentInsets;
        if (y0Var != null) {
            return y0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        y0 y0Var = this.mContentInsets;
        if (y0Var != null) {
            return y0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.mContentInsetStartWithNavigation;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarP;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (gVarP = actionMenuView.P()) == null || !gVarP.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.mMenuView.getMenu();
    }

    @androidx.annotation.l1
    @androidx.annotation.p0
    View getNavButtonView() {
        return this.mNavButtonView;
    }

    @androidx.annotation.p0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.p0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @androidx.annotation.p0
    public Drawable getOverflowIcon() {
        e();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    @androidx.annotation.g1
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @androidx.annotation.l1
    @androidx.annotation.p0
    final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @androidx.annotation.l1
    @androidx.annotation.p0
    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public l0 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new o1(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        return (fVar == null || fVar.f11121b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.J();
    }

    public void inflateMenu(@androidx.annotation.m0 int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    @Override // androidx.core.view.l0
    @androidx.annotation.l0
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        s();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.K();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.L();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (layout.getEllipsisCount(i10) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028a  */
    /* JADX WARN: Code duplicated, block: B:102:0x028d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a2 A[LOOP:0: B:104:0x02a0->B:105:0x02a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02c0 A[LOOP:1: B:107:0x02be->B:108:0x02c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f9 A[LOOP:2: B:116:0x02f7->B:117:0x02f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x0103  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x0185  */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x021b  */
    /* JADX WARN: Code duplicated, block: B:88:0x021e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0228 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x022a  */
    /* JADX WARN: Code duplicated, block: B:93:0x022e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0242  */
    /* JADX WARN: Code duplicated, block: B:97:0x0265  */
    /* JADX WARN: Code duplicated, block: B:99:0x0268  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zV;
        boolean zV2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMax2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int size;
        int iO2;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int iH0 = androidx.core.view.u1.h0(this);
        int iMin2 = iH0 >= 0 ? Math.min(iH0, i13 - i11) : 0;
        if (v(this.mNavButtonView)) {
            if (z12) {
                iP = p(this.mNavButtonView, i33, iArr, iMin2);
                iO = paddingLeft;
            } else {
                iO = o(this.mNavButtonView, paddingLeft, iArr, iMin2);
            }
            if (v(this.mCollapseButtonView)) {
                if (z12) {
                    iP = p(this.mCollapseButtonView, iP, iArr, iMin2);
                } else {
                    iO = o(this.mCollapseButtonView, iO, iArr, iMin2);
                }
            }
            if (v(this.mMenuView)) {
                if (z12) {
                    iO = o(this.mMenuView, iO, iArr, iMin2);
                } else {
                    iP = p(this.mMenuView, iP, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i33 - currentContentInsetRight);
            if (v(this.mExpandedActionView)) {
                if (z12) {
                    iMin = p(this.mExpandedActionView, iMin, iArr, iMin2);
                } else {
                    iMax = o(this.mExpandedActionView, iMax, iArr, iMin2);
                }
            }
            if (v(this.mLogoView)) {
                if (z12) {
                    iMin = p(this.mLogoView, iMin, iArr, iMin2);
                } else {
                    iMax = o(this.mLogoView, iMax, iArr, iMin2);
                }
            }
            zV = v(this.mTitleTextView);
            zV2 = v(this.mSubtitleTextView);
            if (zV) {
                g gVar3 = (g) this.mTitleTextView.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.mTitleTextView.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zV2) {
                g gVar4 = (g) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zV || zV2) {
                if (zV) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zV2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zV && this.mTitleTextView.getMeasuredWidth() > 0) || (zV2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i15 = this.mGravity & com.planner5d.library.engine.input.f.b.B;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i25 = this.mTitleMarginTop;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i28 = this.mTitleMarginBottom;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - i14;
                }
                if (z12) {
                    if (z11) {
                        i21 = this.mTitleMarginStart;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zV) {
                        g gVar5 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zV2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i35, iMin, this.mSubtitleTextView.getMeasuredHeight() + i35);
                        i23 = iMin - this.mTitleMarginEnd;
                    } else {
                        i23 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i22, i23);
                    }
                    iMax = i16;
                    i18 = 0;
                } else {
                    if (z11) {
                        i17 = this.mTitleMarginStart;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zV) {
                        g gVar6 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zV2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                        this.mSubtitleTextView.layout(iMax, i37, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.mTitleMarginEnd;
                    } else {
                        i20 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i19, i20);
                    }
                }
            } else {
                i18 = 0;
            }
            a(this.mTempViews, 3);
            size = this.mTempViews.size();
            iO2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iO2 = o(this.mTempViews.get(i29), iO2, iArr, iMin2);
            }
            a(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = p(this.mTempViews.get(i30), iMin, iArr, iMin2);
            }
            a(this.mTempViews, 1);
            int iM = m(this.mTempViews, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iM / 2);
            i32 = iM + i31;
            if (i31 >= iO2) {
                if (i32 > iMin) {
                    iO2 = i31 - (i32 - iMin);
                } else {
                    iO2 = i31;
                }
            }
            size3 = this.mTempViews.size();
            while (i18 < size3) {
                iO2 = o(this.mTempViews.get(i18), iO2, iArr, iMin2);
                i18++;
            }
            this.mTempViews.clear();
        }
        iO = paddingLeft;
        iP = i33;
        if (v(this.mCollapseButtonView)) {
            if (z12) {
                iP = p(this.mCollapseButtonView, iP, iArr, iMin2);
            } else {
                iO = o(this.mCollapseButtonView, iO, iArr, iMin2);
            }
        }
        if (v(this.mMenuView)) {
            if (z12) {
                iO = o(this.mMenuView, iO, iArr, iMin2);
            } else {
                iP = p(this.mMenuView, iP, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i33 - currentContentInsetRight2);
        if (v(this.mExpandedActionView)) {
            if (z12) {
                iMin = p(this.mExpandedActionView, iMin, iArr, iMin2);
            } else {
                iMax = o(this.mExpandedActionView, iMax, iArr, iMin2);
            }
        }
        if (v(this.mLogoView)) {
            if (z12) {
                iMin = p(this.mLogoView, iMin, iArr, iMin2);
            } else {
                iMax = o(this.mLogoView, iMax, iArr, iMin2);
            }
        }
        zV = v(this.mTitleTextView);
        zV2 = v(this.mSubtitleTextView);
        if (zV) {
            g gVar7 = (g) this.mTitleTextView.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.mTitleTextView.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zV2) {
            g gVar8 = (g) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zV) {
            if (zV) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zV2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zV) {
            }
            i15 = this.mGravity & com.planner5d.library.engine.input.f.b.B;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.mTitleMarginTop;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.mTitleMarginBottom;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.mTitleMarginStart;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zV) {
                    g gVar9 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zV2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i39, iMin, this.mSubtitleTextView.getMeasuredHeight() + i39);
                    i23 = iMin - this.mTitleMarginEnd;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.mTitleMarginStart;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zV) {
                    g gVar10 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zV2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i311, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.mTitleMarginEnd;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zV) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zV2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zV) {
            }
            i15 = this.mGravity & com.planner5d.library.engine.input.f.b.B;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.mTitleMarginTop;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.mTitleMarginBottom;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.mTitleMarginStart;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zV) {
                    g gVar11 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zV2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i313, iMin, this.mSubtitleTextView.getMeasuredHeight() + i313);
                    i23 = iMin - this.mTitleMarginEnd;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.mTitleMarginStart;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zV) {
                    g gVar12 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zV2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i315, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.mTitleMarginEnd;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        }
        a(this.mTempViews, 3);
        size = this.mTempViews.size();
        iO2 = iMax;
        while (i29 < size) {
            iO2 = o(this.mTempViews.get(i29), iO2, iArr, iMin2);
        }
        a(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i30 < size2) {
            iMin = p(this.mTempViews.get(i30), iMin, iArr, iMin2);
        }
        a(this.mTempViews, 1);
        int iM2 = m(this.mTempViews, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iM2 / 2);
        i32 = iM2 + i31;
        if (i31 >= iO2) {
            if (i32 > iMin) {
                iO2 = i31 - (i32 - iMin);
            } else {
                iO2 = i31;
            }
        }
        size3 = this.mTempViews.size();
        while (i18 < size3) {
            iO2 = o(this.mTempViews.get(i18), iO2, iArr, iMin2);
            i18++;
        }
        this.mTempViews.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.mTempMargins;
        boolean zB = v1.b(this);
        int i12 = !zB ? 1 : 0;
        if (v(this.mNavButtonView)) {
            r(this.mNavButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + k(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + l(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (v(this.mCollapseButtonView)) {
            r(this.mCollapseButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + k(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + l(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (v(this.mMenuView)) {
            r(this.mMenuView, i10, iMax3, i11, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + k(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + l(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (v(this.mExpandedActionView)) {
            iArr = iArr2;
            iMax4 += q(this.mExpandedActionView, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + l(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (v(this.mLogoView)) {
            iMax4 += q(this.mLogoView, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + l(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f11126b == 0 && v(childAt)) {
                iMax4 += q(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + l(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i16 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (v(this.mTitleTextView)) {
            q(this.mTitleTextView, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + k(this.mTitleTextView);
            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + l(this.mTitleTextView);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (v(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, q(this.mSubtitleTextView, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + l(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), u() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.g gVarP = actionMenuView != null ? actionMenuView.P() : null;
        int i10 = savedState.f11114c;
        if (i10 != 0 && this.mExpandedMenuPresenter != null && gVarP != null && (menuItemFindItem = gVarP.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f11115d) {
            t();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        c();
        y0 y0Var = this.mContentInsets;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        y0Var.f(z10);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (jVar = fVar.f11121b) != null) {
            savedState.f11114c = jVar.getItemId();
        }
        savedState.f11115d = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f11126b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.l0
    @androidx.annotation.l0
    public void removeMenuProvider(@NonNull androidx.core.view.r0 r0Var) {
        this.mMenuHostHelper.j(r0Var);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.mBackInvokedCallbackEnabled != z10) {
            this.mBackInvokedCallbackEnabled = z10;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(@androidx.annotation.f1 int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(@androidx.annotation.v int i10) {
        setCollapseIcon(j.a.b(getContext(), i10));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z10) {
        this.mCollapsible = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        c();
        this.mContentInsets.e(i10, i11);
    }

    public void setContentInsetsRelative(int i10, int i11) {
        c();
        this.mContentInsets.g(i10, i11);
    }

    public void setLogo(@androidx.annotation.v int i10) {
        setLogo(j.a.b(getContext(), i10));
    }

    public void setLogoDescription(@androidx.annotation.f1 int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void setMenu(androidx.appcompat.view.menu.g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar == null && this.mMenuView == null) {
            return;
        }
        f();
        androidx.appcompat.view.menu.g gVarP = this.mMenuView.P();
        if (gVarP == gVar) {
            return;
        }
        if (gVarP != null) {
            gVarP.T(this.mOuterActionMenuPresenter);
            gVarP.T(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        actionMenuPresenter.K(true);
        if (gVar != null) {
            gVar.c(actionMenuPresenter, this.mPopupContext);
            gVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.i(this.mPopupContext, null);
            this.mExpandedMenuPresenter.i(this.mPopupContext, null);
            actionMenuPresenter.f(true);
            this.mExpandedMenuPresenter.f(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(androidx.appcompat.view.menu.n.a aVar, androidx.appcompat.view.menu.g.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.Q(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(@androidx.annotation.f1 int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(@androidx.annotation.v int i10) {
        setNavigationIcon(j.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(@androidx.annotation.p0 Drawable drawable) {
        e();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@androidx.annotation.g1 int i10) {
        if (this.mPopupTheme != i10) {
            this.mPopupTheme = i10;
            if (i10 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(@androidx.annotation.f1 int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextAppearance(Context context, @androidx.annotation.g1 int i10) {
        this.mSubtitleTextAppearance = i10;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(@androidx.annotation.l int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(@androidx.annotation.f1 int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.mTitleMarginStart = i10;
        this.mTitleMarginTop = i11;
        this.mTitleMarginEnd = i12;
        this.mTitleMarginBottom = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.mTitleMarginBottom = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.mTitleMarginEnd = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.mTitleMarginStart = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.mTitleMarginTop = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @androidx.annotation.g1 int i10) {
        this.mTitleTextAppearance = i10;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(@androidx.annotation.l int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.R();
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = hasExpandedActionView() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z10 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new Runnable() { // from class: androidx.appcompat.widget.k1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11382a.collapseActionView();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public static class g extends androidx.appcompat.app.a.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f11123c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f11124d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f11125e = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11126b;

        public g(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11126b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f11126b = 0;
            this.f10275a = 8388627;
        }

        public g(int i10, int i11, int i12) {
            super(i10, i11);
            this.f11126b = 0;
            this.f10275a = i12;
        }

        public g(int i10) {
            this(-2, -1, i10);
        }

        public g(g gVar) {
            super((androidx.appcompat.app.a.b) gVar);
            this.f11126b = 0;
            this.f11126b = gVar.f11126b;
        }

        public g(androidx.appcompat.app.a.b bVar) {
            super(bVar);
            this.f11126b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11126b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11126b = 0;
        }
    }

    public Toolbar(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.U3);
    }

    @Override // androidx.core.view.l0
    @androidx.annotation.l0
    public void addMenuProvider(@NonNull androidx.core.view.r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var) {
        this.mMenuHostHelper.d(r0Var, o0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public void setCollapseContentDescription(@androidx.annotation.p0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@androidx.annotation.p0 Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            d();
            if (!n(this.mLogoView)) {
                b(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && n(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@androidx.annotation.p0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            p1.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(@androidx.annotation.p0 Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.mNavButtonView)) {
                b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && n(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.mSubtitleTextAppearance;
                if (i10 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mSubtitleTextView)) {
                b(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.mTitleTextAppearance;
                if (i10 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mTitleTextView)) {
                b(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new androidx.core.view.o0(new Runnable() { // from class: androidx.appcompat.widget.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f11389a.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        j1 j1VarG = j1.G(getContext(), attributeSet, i.a.m.f286632r6, i10, 0);
        androidx.core.view.u1.E1(this, context, i.a.m.f286632r6, attributeSet, j1VarG.B(), i10, 0);
        this.mTitleTextAppearance = j1VarG.u(i.a.m.U6, 0);
        this.mSubtitleTextAppearance = j1VarG.u(i.a.m.L6, 0);
        this.mGravity = j1VarG.p(i.a.m.f286640s6, this.mGravity);
        this.mButtonGravity = j1VarG.p(i.a.m.f286656u6, 48);
        int iF = j1VarG.f(i.a.m.O6, 0);
        iF = j1VarG.C(i.a.m.T6) ? j1VarG.f(i.a.m.T6, iF) : iF;
        this.mTitleMarginBottom = iF;
        this.mTitleMarginTop = iF;
        this.mTitleMarginEnd = iF;
        this.mTitleMarginStart = iF;
        int iF2 = j1VarG.f(i.a.m.R6, -1);
        if (iF2 >= 0) {
            this.mTitleMarginStart = iF2;
        }
        int iF3 = j1VarG.f(i.a.m.Q6, -1);
        if (iF3 >= 0) {
            this.mTitleMarginEnd = iF3;
        }
        int iF4 = j1VarG.f(i.a.m.S6, -1);
        if (iF4 >= 0) {
            this.mTitleMarginTop = iF4;
        }
        int iF5 = j1VarG.f(i.a.m.P6, -1);
        if (iF5 >= 0) {
            this.mTitleMarginBottom = iF5;
        }
        this.mMaxButtonHeight = j1VarG.g(i.a.m.F6, -1);
        int iF6 = j1VarG.f(i.a.m.B6, Integer.MIN_VALUE);
        int iF7 = j1VarG.f(i.a.m.f286680x6, Integer.MIN_VALUE);
        int iG = j1VarG.g(i.a.m.f286696z6, 0);
        int iG2 = j1VarG.g(i.a.m.A6, 0);
        c();
        this.mContentInsets.e(iG, iG2);
        if (iF6 != Integer.MIN_VALUE || iF7 != Integer.MIN_VALUE) {
            this.mContentInsets.g(iF6, iF7);
        }
        this.mContentInsetStartWithNavigation = j1VarG.f(i.a.m.C6, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = j1VarG.f(i.a.m.f286688y6, Integer.MIN_VALUE);
        this.mCollapseIcon = j1VarG.h(i.a.m.f286672w6);
        this.mCollapseDescription = j1VarG.x(i.a.m.f286664v6);
        CharSequence charSequenceX = j1VarG.x(i.a.m.N6);
        if (!TextUtils.isEmpty(charSequenceX)) {
            setTitle(charSequenceX);
        }
        CharSequence charSequenceX2 = j1VarG.x(i.a.m.K6);
        if (!TextUtils.isEmpty(charSequenceX2)) {
            setSubtitle(charSequenceX2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(j1VarG.u(i.a.m.J6, 0));
        Drawable drawableH = j1VarG.h(i.a.m.I6);
        if (drawableH != null) {
            setNavigationIcon(drawableH);
        }
        CharSequence charSequenceX3 = j1VarG.x(i.a.m.H6);
        if (!TextUtils.isEmpty(charSequenceX3)) {
            setNavigationContentDescription(charSequenceX3);
        }
        Drawable drawableH2 = j1VarG.h(i.a.m.D6);
        if (drawableH2 != null) {
            setLogo(drawableH2);
        }
        CharSequence charSequenceX4 = j1VarG.x(i.a.m.E6);
        if (!TextUtils.isEmpty(charSequenceX4)) {
            setLogoDescription(charSequenceX4);
        }
        if (j1VarG.C(i.a.m.V6)) {
            setTitleTextColor(j1VarG.d(i.a.m.V6));
        }
        if (j1VarG.C(i.a.m.M6)) {
            setSubtitleTextColor(j1VarG.d(i.a.m.M6));
        }
        if (j1VarG.C(i.a.m.G6)) {
            inflateMenu(j1VarG.u(i.a.m.G6, 0));
        }
        j1VarG.I();
    }

    @Override // androidx.core.view.l0
    @e.a({"LambdaLast"})
    @androidx.annotation.l0
    public void addMenuProvider(@NonNull androidx.core.view.r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var, @NonNull androidx.lifecycle.c0.b bVar) {
        this.mMenuHostHelper.e(r0Var, o0Var, bVar);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.b) {
            return new g((androidx.appcompat.app.a.b) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }
}
