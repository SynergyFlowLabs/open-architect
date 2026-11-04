package com.google.android.material.search;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.h0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, com.google.android.material.motion.b {

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final long f113364m3 = 100;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f113365n3 = r6.a.n.Dh;
    private boolean H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final View f113366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ClippableRoundedCornerLayout f113367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f113368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f113369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout f113370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final FrameLayout f113371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MaterialToolbar f113372g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f113373g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Toolbar f113374h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @androidx.annotation.l
    private final int f113375h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final TextView f113376i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f113377i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final EditText f113378j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f113379j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ImageButton f113380k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NonNull
    private c f113381k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final View f113382l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private Map<View, Integer> f113383l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final TouchObserverFrameLayout f113384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f113385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f0 f113386o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private SearchBar f113387p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f113388p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f113389p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.motion.c f113390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f113391t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final w6.a f113392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Set<b> f113393w;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (!searchView.D() && (view instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view);
            }
            return false;
        }

        public Behavior(@NonNull Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f113394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f113395d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
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
            parcel.writeString(this.f113394c);
            parcel.writeInt(this.f113395d);
        }

        public SavedState(Parcel parcel, @p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f113394c = parcel.readString();
            this.f113395d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.f113380k.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }
    }

    public interface b {
        void a(@NonNull SearchView searchView, @NonNull c cVar, @NonNull c cVar2);
    }

    public enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN;

        static {
            int i10 = 2 & 2;
        }
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private boolean A() {
        return this.f113381k3.equals(c.HIDDEN) || this.f113381k3.equals(c.HIDING);
    }

    private boolean C(@NonNull Toolbar toolbar) {
        return androidx.core.graphics.drawable.c.q(toolbar.getNavigationIcon()) instanceof androidx.appcompat.graphics.drawable.d;
    }

    private void L(@NonNull c cVar, boolean z10) {
        if (this.f113381k3.equals(cVar)) {
            return;
        }
        if (z10) {
            if (cVar == c.SHOWN) {
                setModalForAccessibility(true);
            } else if (cVar == c.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        c cVar2 = this.f113381k3;
        this.f113381k3 = cVar;
        Iterator it = new LinkedHashSet(this.f113393w).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, cVar2, cVar);
        }
        Y(cVar);
    }

    private void M(boolean z10, boolean z11) {
        if (z11) {
            this.f113372g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f113372g.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113477a.v();
            }
        });
        if (z10) {
            androidx.appcompat.graphics.drawable.d dVar = new androidx.appcompat.graphics.drawable.d(getContext());
            dVar.p(com.google.android.material.color.u.d(this, r6.a.c.I3));
            this.f113372g.setNavigationIcon(dVar);
        }
    }

    private void N() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void O() {
        this.f113380k.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m(this.f113479a, view);
            }
        });
        this.f113378j.addTextChangedListener(new a());
    }

    @e.a({"ClickableViewAccessibility"})
    private void P() {
        this.f113384m.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.x
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.j(this.f113488a, view, motionEvent);
            }
        });
    }

    private void Q() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f113382l.getLayoutParams();
        final int i10 = marginLayoutParams.leftMargin;
        final int i11 = marginLayoutParams.rightMargin;
        u1.j2(this.f113382l, new b1() { // from class: com.google.android.material.search.q
            @Override // androidx.core.view.b1
            public final g3 b(View view, g3 g3Var) {
                return SearchView.i(marginLayoutParams, i10, i11, view, g3Var);
            }
        });
    }

    private void R(@g1 int i10, String str, String str2) {
        if (i10 != -1) {
            androidx.core.widget.r.D(this.f113378j, i10);
        }
        this.f113378j.setText(str);
        this.f113378j.setHint(str2);
    }

    private void S() {
        V();
        Q();
        U();
    }

    @e.a({"ClickableViewAccessibility"})
    private void T() {
        this.f113367b.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.p(view, motionEvent);
            }
        });
    }

    private void U() {
        setUpStatusBarSpacer(getStatusBarHeight());
        u1.j2(this.f113369d, new b1() { // from class: com.google.android.material.search.t
            @Override // androidx.core.view.b1
            public final g3 b(View view, g3 g3Var) {
                return SearchView.o(this.f113485a, view, g3Var);
            }
        });
    }

    private void V() {
        com.google.android.material.internal.p0.h(this.f113372g, new com.google.android.material.internal.p0.d() { // from class: com.google.android.material.search.s
            @Override // com.google.android.material.internal.p0.d
            public final g3 a(View view, g3 g3Var, com.google.android.material.internal.p0.e eVar) {
                return SearchView.n(this.f113484a, view, g3Var, eVar);
            }
        });
    }

    @e.a({"InlinedApi"})
    private void X(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f113367b.getId()) != null) {
                    X((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.f113383l3.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    u1.Y1(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f113383l3;
                    if (map != null && map.containsKey(childAt)) {
                        u1.Y1(childAt, this.f113383l3.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void Y(@NonNull c cVar) {
        if (this.f113387p0 == null || !this.f113391t) {
            return;
        }
        if (cVar.equals(c.SHOWN)) {
            this.f113390s.c();
        } else if (cVar.equals(c.HIDDEN)) {
            this.f113390s.f();
        }
    }

    private void Z() {
        MaterialToolbar materialToolbar = this.f113372g;
        if (materialToolbar == null || C(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.f113387p0 == null) {
            this.f113372g.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableR = androidx.core.graphics.drawable.c.r(j.a.b(getContext(), defaultNavigationIconResource).mutate());
        if (this.f113372g.getNavigationIconTint() != null) {
            androidx.core.graphics.drawable.c.n(drawableR, this.f113372g.getNavigationIconTint().intValue());
        }
        this.f113372g.setNavigationIcon(new com.google.android.material.internal.i(this.f113387p0.getNavigationIcon(), drawableR));
        a0();
    }

    private void a0() {
        ImageButton imageButtonE = h0.e(this.f113372g);
        if (imageButtonE == null) {
            return;
        }
        int i10 = this.f113367b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = androidx.core.graphics.drawable.c.q(imageButtonE.getDrawable());
        if (drawableQ instanceof androidx.appcompat.graphics.drawable.d) {
            ((androidx.appcompat.graphics.drawable.d) drawableQ).setProgress(i10);
        }
        if (drawableQ instanceof com.google.android.material.internal.i) {
            ((com.google.android.material.internal.i) drawableQ).a(i10);
        }
    }

    @p0
    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.c.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f113387p0;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(r6.a.f.f360347p8);
    }

    @t0
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ g3 i(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, View view, g3 g3Var) {
        marginLayoutParams.leftMargin = i10 + g3Var.p();
        marginLayoutParams.rightMargin = i11 + g3Var.q();
        return g3Var;
    }

    public static /* synthetic */ boolean j(SearchView searchView, View view, MotionEvent motionEvent) {
        if (searchView.x()) {
            searchView.t();
        }
        return false;
    }

    public static /* synthetic */ void k(SearchView searchView) {
        searchView.f113378j.clearFocus();
        SearchBar searchBar = searchView.f113387p0;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        com.google.android.material.internal.p0.r(searchView.f113378j, searchView.f113377i3);
    }

    public static /* synthetic */ void l(SearchView searchView) {
        if (searchView.f113378j.requestFocus()) {
            searchView.f113378j.sendAccessibilityEvent(8);
        }
        com.google.android.material.internal.p0.B(searchView.f113378j, searchView.f113377i3);
    }

    public static /* synthetic */ void m(SearchView searchView, View view) {
        searchView.u();
        searchView.K();
    }

    public static /* synthetic */ g3 n(SearchView searchView, View view, g3 g3Var, com.google.android.material.internal.p0.e eVar) {
        boolean zS = com.google.android.material.internal.p0.s(searchView.f113372g);
        searchView.f113372g.setPadding((zS ? eVar.f112901c : eVar.f112899a) + g3Var.p(), eVar.f112900b, (zS ? eVar.f112899a : eVar.f112901c) + g3Var.q(), eVar.f112902d);
        return g3Var;
    }

    public static /* synthetic */ g3 o(SearchView searchView, View view, g3 g3Var) {
        searchView.getClass();
        int iR = g3Var.r();
        searchView.setUpStatusBarSpacer(iR);
        if (!searchView.f113379j3) {
            searchView.setStatusBarSpacerEnabledInternal(iR > 0);
        }
        return g3Var;
    }

    public static /* synthetic */ boolean p(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f113369d.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        w6.a aVar = this.f113392v;
        if (aVar == null || this.f113368c == null) {
            return;
        }
        this.f113368c.setBackgroundColor(aVar.e(this.f113375h3, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            r(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f113370e, false));
        }
    }

    private void setUpStatusBarSpacer(@t0 int i10) {
        if (this.f113369d.getLayoutParams().height != i10) {
            this.f113369d.getLayoutParams().height = i10;
            this.f113369d.requestLayout();
        }
    }

    public boolean B() {
        return this.f113389p2;
    }

    public boolean D() {
        return this.f113387p0 != null;
    }

    public boolean E() {
        if (!this.f113381k3.equals(c.SHOWN) && !this.f113381k3.equals(c.SHOWING)) {
            return false;
        }
        return true;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public boolean F() {
        return this.f113377i3;
    }

    public void G() {
        this.f113370e.removeAllViews();
        this.f113370e.setVisibility(8);
    }

    public void H(@NonNull View view) {
        this.f113370e.removeView(view);
        if (this.f113370e.getChildCount() == 0) {
            this.f113370e.setVisibility(8);
        }
    }

    public void I(@NonNull b bVar) {
        this.f113393w.remove(bVar);
    }

    public void J() {
        this.f113378j.postDelayed(new Runnable() { // from class: com.google.android.material.search.r
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.l(this.f113483a);
            }
        }, f113364m3);
    }

    void K() {
        if (this.f113373g3) {
            J();
        }
    }

    public void W() {
        if (!this.f113381k3.equals(c.SHOWN) && !this.f113381k3.equals(c.SHOWING)) {
            this.f113386o.U();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f113385n) {
            this.f113384m.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.b
    public void b(@NonNull androidx.activity.d dVar) {
        if (A() || this.f113387p0 == null) {
            return;
        }
        this.f113386o.V(dVar);
    }

    public void b0() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f113388p1 = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // com.google.android.material.motion.b
    public void c(@NonNull androidx.activity.d dVar) {
        if (!A() && this.f113387p0 != null && Build.VERSION.SDK_INT >= 34) {
            this.f113386o.a0(dVar);
        }
    }

    @Override // com.google.android.material.motion.b
    public void d() {
        if (A()) {
            return;
        }
        androidx.activity.d dVarN = this.f113386o.N();
        if (Build.VERSION.SDK_INT < 34 || this.f113387p0 == null || dVarN == null) {
            v();
        } else {
            this.f113386o.p();
        }
    }

    @Override // com.google.android.material.motion.b
    public void f() {
        if (A() || this.f113387p0 == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f113386o.o();
    }

    @l1
    com.google.android.material.motion.h getBackHelper() {
        return this.f113386o.r();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public c getCurrentTransitionState() {
        return this.f113381k3;
    }

    @androidx.annotation.v
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    protected int getDefaultNavigationIconResource() {
        return r6.a.g.Q0;
    }

    @NonNull
    public EditText getEditText() {
        return this.f113378j;
    }

    @p0
    public CharSequence getHint() {
        return this.f113378j.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f113376i;
    }

    @p0
    public CharSequence getSearchPrefixText() {
        return this.f113376i.getText();
    }

    @e.a({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f113388p1;
    }

    @NonNull
    @e.a({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f113378j.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f113372g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setText(savedState.f113394c);
        setVisible(savedState.f113395d == 0);
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f113394c = text == null ? null : text.toString();
        savedState.f113395d = this.f113367b.getVisibility();
        return savedState;
    }

    public void r(@NonNull View view) {
        this.f113370e.addView(view);
        this.f113370e.setVisibility(0);
    }

    public void s(@NonNull b bVar) {
        this.f113393w.add(bVar);
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.H1 = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f113373g3 = z10;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(@p0 CharSequence charSequence) {
        this.f113378j.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f113389p2 = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f113383l3 = new HashMap(viewGroup.getChildCount());
        }
        X(viewGroup, z10);
        if (!z10) {
            this.f113383l3 = null;
        }
    }

    public void setOnMenuItemClickListener(@p0 Toolbar.h hVar) {
        this.f113372g.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(@p0 CharSequence charSequence) {
        this.f113376i.setText(charSequence);
        this.f113376i.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f113379j3 = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @e.a({"KotlinPropertyAccess"})
    public void setText(@p0 CharSequence charSequence) {
        this.f113378j.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f113372g.setTouchscreenBlocksFocus(z10);
    }

    void setTransitionState(@NonNull c cVar) {
        L(cVar, true);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z10) {
        this.f113377i3 = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f113367b.getVisibility() == 0;
        this.f113367b.setVisibility(z10 ? 0 : 8);
        a0();
        L(z10 ? c.SHOWN : c.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(@p0 SearchBar searchBar) {
        this.f113387p0 = searchBar;
        this.f113386o.S(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113486a.W();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f113487a.W();
                        }
                    });
                    this.f113378j.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        Z();
        N();
        Y(getCurrentTransitionState());
    }

    public void t() {
        this.f113378j.post(new Runnable() { // from class: com.google.android.material.search.o
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.k(this.f113478a);
            }
        });
    }

    public void u() {
        this.f113378j.setText("");
    }

    public void v() {
        if (!this.f113381k3.equals(c.HIDDEN) && !this.f113381k3.equals(c.HIDING)) {
            this.f113386o.M();
        }
    }

    public void w(@m0 int i10) {
        this.f113372g.inflateMenu(i10);
    }

    boolean x() {
        return this.f113388p1 == 48;
    }

    public boolean y() {
        return this.H1;
    }

    public boolean z() {
        return this.f113373g3;
    }

    public SearchView(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Sc);
    }

    public void setHint(@f1 int i10) {
        this.f113378j.setHint(i10);
    }

    public void setText(@f1 int i10) {
        this.f113378j.setText(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f113365n3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f113390s = new com.google.android.material.motion.c(this);
        this.f113393w = new LinkedHashSet();
        this.f113388p1 = 16;
        this.f113381k3 = c.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayK = com.google.android.material.internal.g0.k(context2, attributeSet, r6.a.o.Gs, i10, i11, new int[0]);
        this.f113375h3 = typedArrayK.getColor(r6.a.o.Ss, 0);
        int resourceId = typedArrayK.getResourceId(r6.a.o.Xs, -1);
        int resourceId2 = typedArrayK.getResourceId(r6.a.o.Hs, -1);
        String string = typedArrayK.getString(r6.a.o.Ks);
        String string2 = typedArrayK.getString(r6.a.o.Ls);
        String string3 = typedArrayK.getString(r6.a.o.ft);
        boolean z10 = typedArrayK.getBoolean(r6.a.o.jt, false);
        this.H1 = typedArrayK.getBoolean(r6.a.o.Ps, true);
        this.f113389p2 = typedArrayK.getBoolean(r6.a.o.Os, true);
        boolean z11 = typedArrayK.getBoolean(r6.a.o.Ys, false);
        this.f113373g3 = typedArrayK.getBoolean(r6.a.o.Qs, true);
        this.f113391t = typedArrayK.getBoolean(r6.a.o.Rs, true);
        typedArrayK.recycle();
        LayoutInflater.from(context2).inflate(r6.a.k.S0, this);
        this.f113385n = true;
        this.f113366a = findViewById(r6.a.h.f360628b4);
        this.f113367b = (ClippableRoundedCornerLayout) findViewById(r6.a.h.f360620a4);
        this.f113368c = findViewById(r6.a.h.T3);
        this.f113369d = findViewById(r6.a.h.f360644d4);
        this.f113370e = (FrameLayout) findViewById(r6.a.h.Z3);
        this.f113371f = (FrameLayout) findViewById(r6.a.h.f360660f4);
        this.f113372g = (MaterialToolbar) findViewById(r6.a.h.f360652e4);
        this.f113374h = (Toolbar) findViewById(r6.a.h.X3);
        this.f113376i = (TextView) findViewById(r6.a.h.f360636c4);
        this.f113378j = (EditText) findViewById(r6.a.h.Y3);
        this.f113380k = (ImageButton) findViewById(r6.a.h.U3);
        this.f113382l = findViewById(r6.a.h.W3);
        this.f113384m = (TouchObserverFrameLayout) findViewById(r6.a.h.V3);
        this.f113386o = new f0(this);
        this.f113392v = new w6.a(context2);
        T();
        N();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        R(resourceId2, string, string2);
        M(z10, z11);
        O();
        P();
        S();
    }
}
