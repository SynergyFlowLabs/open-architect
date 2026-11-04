package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.g.b, androidx.appcompat.view.menu.o {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final String f10868w3 = "ActionMenuView";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    static final int f10869x3 = 56;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    static final int f10870y3 = 4;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f10871k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private Context f10872l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f10873m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f10874n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private ActionMenuPresenter f10875o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private androidx.appcompat.view.menu.n.a f10876p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    androidx.appcompat.view.menu.g.a f10877q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f10878r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f10879s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private int f10880t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private int f10881u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    e f10882v3;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean b();

        boolean c();
    }

    private static class b implements androidx.appcompat.view.menu.n.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f10883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f10884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f10885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f10886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f10887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f10888f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f10883a = cVar.f10883a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f10883a = false;
        }

        c(int i10, int i11, boolean z10) {
            super(i10, i11);
            this.f10883a = z10;
        }
    }

    private class d implements androidx.appcompat.view.menu.g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
            e eVar = ActionMenuView.this.f10882v3;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.g.a aVar = ActionMenuView.this.f10877q3;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    static int N(View view, int i10, int i11, int i12, int i13) {
        int i14;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.i();
        if (i11 > 0) {
            i14 = 2;
            if (!z11 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z11 || i15 >= 2) {
                    i14 = i15;
                }
            } else {
                i14 = 0;
            }
        } else {
            i14 = 0;
        }
        if (!cVar.f10883a && z11) {
            z10 = true;
        }
        cVar.f10886d = z10;
        cVar.f10884b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), iMakeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    private void O(int i10, int i11) {
        long j10;
        int i12;
        boolean z10;
        ?? r10;
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f10880t3;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z11 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j11 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() == 8) {
                i13 = i18;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i20++;
                if (z12) {
                    int i23 = this.f10881u3;
                    r10 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    r10 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f10888f = r10;
                cVar.f10885c = r10;
                cVar.f10884b = r10;
                cVar.f10886d = r10;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r10;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r10;
                cVar.f10887e = z12 && ((ActionMenuItemView) childAt).i();
                int iN = N(childAt, i18, cVar.f10883a ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iN);
                i13 = i18;
                if (cVar.f10886d) {
                    i21++;
                }
                if (cVar.f10883a) {
                    z11 = true;
                }
                i16 -= iN;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iN == 1) {
                    j11 |= (long) (1 << i19);
                }
            }
            i19++;
            size2 = i22;
            i18 = i13;
        }
        int i24 = size2;
        int i25 = i18;
        char c10 = 2;
        boolean z13 = z11 && i20 == 2;
        boolean z14 = false;
        while (true) {
            if (i21 <= 0 || i16 <= 0) {
                j10 = 1;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            long j12 = 0;
            char c11 = c10;
            int i27 = 0;
            int i28 = 0;
            j10 = 1;
            while (i28 < childCount) {
                c cVar2 = (c) getChildAt(i28).getLayoutParams();
                boolean z15 = z13;
                if (cVar2.f10886d) {
                    int i29 = cVar2.f10884b;
                    if (i29 < i26) {
                        j12 = 1 << i28;
                        i26 = i29;
                        i27 = 1;
                    } else if (i29 == i26) {
                        j12 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z13 = z15;
            }
            boolean z16 = z13;
            j11 |= j12;
            if (i27 > i16) {
                break;
            }
            int i30 = i26 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                View childAt2 = getChildAt(i31);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j13 = 1 << i31;
                if ((j12 & j13) == 0) {
                    if (cVar3.f10884b == i30) {
                        j11 |= j13;
                    }
                    i31 = i31;
                } else {
                    if (!z16 || !cVar3.f10887e) {
                        z10 = true;
                    } else if (i16 == 1) {
                        int i32 = this.f10881u3;
                        z10 = true;
                        childAt2.setPadding(i32 + i25, 0, i32, 0);
                    } else {
                        z10 = true;
                    }
                    cVar3.f10884b++;
                    cVar3.f10888f = z10;
                    i16--;
                }
                i31++;
            }
            c10 = c11;
            z13 = z16;
            z14 = true;
        }
        boolean z17 = !z11 && i20 == 1;
        if (i16 <= 0 || j11 == 0 || (i16 >= i20 - 1 && !z17 && iMax2 <= 1)) {
            i12 = 0;
        } else {
            float fBitCount = Long.bitCount(j11);
            if (z17) {
                i12 = 0;
            } else {
                if ((j11 & j10) != 0) {
                    i12 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f10887e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i12 = 0;
                }
                int i33 = childCount - 1;
                if ((j11 & ((long) (1 << i33))) != 0 && !((c) getChildAt(i33).getLayoutParams()).f10887e) {
                    fBitCount -= 0.5f;
                }
            }
            int i34 = fBitCount > 0.0f ? (int) ((i16 * i25) / fBitCount) : i12;
            boolean z18 = z14;
            for (int i35 = i12; i35 < childCount; i35++) {
                if ((j11 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f10885c = i34;
                        cVar4.f10888f = true;
                        if (i35 == 0 && !cVar4.f10887e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i34) / 2;
                        }
                        z18 = true;
                    } else if (cVar4.f10883a) {
                        cVar4.f10885c = i34;
                        cVar4.f10888f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i34) / 2;
                        z18 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z14 = z18;
        }
        if (z14) {
            for (int i36 = i12; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f10888f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f10884b * i25) + cVar5.f10885c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? iMax : i24);
    }

    public void D() {
        ActionMenuPresenter actionMenuPresenter = this.f10875o3;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c m() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public c H() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f10883a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected boolean I(int i10) {
        boolean zB = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zB = ((a) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zB : ((a) childAt2).c() | zB;
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.f10875o3;
        return actionMenuPresenter != null && actionMenuPresenter.E();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean K() {
        ActionMenuPresenter actionMenuPresenter = this.f10875o3;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean L() {
        ActionMenuPresenter actionMenuPresenter = this.f10875o3;
        return actionMenuPresenter != null && actionMenuPresenter.H();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean M() {
        return this.f10874n3;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.g P() {
        return this.f10871k3;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void Q(androidx.appcompat.view.menu.n.a aVar, androidx.appcompat.view.menu.g.a aVar2) {
        this.f10876p3 = aVar;
        this.f10877q3 = aVar2;
    }

    public boolean R() {
        ActionMenuPresenter actionMenuPresenter = this.f10875o3;
        return actionMenuPresenter != null && actionMenuPresenter.Q();
    }

    @Override // androidx.appcompat.view.menu.o
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void a(androidx.appcompat.view.menu.g gVar) {
        this.f10871k3 = gVar;
    }

    @Override // androidx.appcompat.view.menu.g.b
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean b(androidx.appcompat.view.menu.j jVar) {
        return this.f10871k3.P(jVar, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f10871k3 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f10871k3 = gVar;
            gVar.Y(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f10875o3 = actionMenuPresenter;
            actionMenuPresenter.O(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f10875o3;
            androidx.appcompat.view.menu.n.a bVar = this.f10876p3;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter2.j(bVar);
            this.f10871k3.c(this.f10875o3, this.f10872l3);
            this.f10875o3.M(this);
        }
        return this.f10871k3;
    }

    @androidx.annotation.p0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f10875o3.D();
    }

    public int getPopupTheme() {
        return this.f10873m3;
    }

    @Override // androidx.appcompat.view.menu.o
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f10875o3;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f(false);
            if (this.f10875o3.H()) {
                this.f10875o3.E();
                this.f10875o3.Q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f10878r3) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = v1.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f10883a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (I(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    I(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f10883a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f10883a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean z10 = this.f10878r3;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f10878r3 = z11;
        if (z10 != z11) {
            this.f10879s3 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f10878r3 && (gVar = this.f10871k3) != null && size != this.f10879s3) {
            this.f10879s3 = size;
            gVar.O(true);
        }
        int childCount = getChildCount();
        if (this.f10878r3 && childCount > 0) {
            O(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f10875o3.K(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f10882v3 = eVar;
    }

    public void setOverflowIcon(@androidx.annotation.p0 Drawable drawable) {
        getMenu();
        this.f10875o3.N(drawable);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z10) {
        this.f10874n3 = z10;
    }

    public void setPopupTheme(@androidx.annotation.g1 int i10) {
        if (this.f10873m3 != i10) {
            this.f10873m3 = i10;
            if (i10 == 0) {
                this.f10872l3 = getContext();
            } else {
                this.f10872l3 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f10875o3 = actionMenuPresenter;
        actionMenuPresenter.M(this);
    }

    public ActionMenuView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f10880t3 = (int) (56.0f * f10);
        this.f10881u3 = (int) (f10 * 4.0f);
        this.f10872l3 = context;
        this.f10873m3 = 0;
    }
}
