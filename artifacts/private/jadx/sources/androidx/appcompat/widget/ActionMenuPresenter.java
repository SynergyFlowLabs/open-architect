package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.b implements androidx.core.view.b.a {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final String f10841k3 = "ActionMenuPresenter";
    e H1;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    c f10842g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private b f10843h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    final f f10844i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    int f10845j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f10846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f10847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10850o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f10851p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final SparseBooleanArray f10852p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    a f10853p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10855t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10857w;

    @e.a({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10858a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f10858a);
        }

        SavedState(Parcel parcel) {
            this.f10858a = parcel.readInt();
        }
    }

    private class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.s sVar, View view) {
            super(context, sVar, view, false, i.a.b.G);
            if (!((androidx.appcompat.view.menu.j) sVar.getItem()).o()) {
                View view2 = ActionMenuPresenter.this.f10846k;
                h(view2 == null ? (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f10634i : view2);
            }
            a(ActionMenuPresenter.this.f10844i3);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void g() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f10853p2 = null;
            actionMenuPresenter.f10845j3 = 0;
            super.g();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.q a() {
            a aVar = ActionMenuPresenter.this.f10853p2;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f10861a;

        public c(e eVar) {
            this.f10861a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f10628c != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f10628c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f10634i;
            if (view != null && view.getWindowToken() != null && this.f10861a.o()) {
                ActionMenuPresenter.this.H1 = this.f10861a;
            }
            ActionMenuPresenter.this.f10842g3 = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends q0 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f10864j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f10864j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.q0
            public androidx.appcompat.view.menu.q b() {
                e eVar = ActionMenuPresenter.this.H1;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override // androidx.appcompat.widget.q0
            public boolean c() {
                ActionMenuPresenter.this.Q();
                return true;
            }

            @Override // androidx.appcompat.widget.q0
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f10842g3 != null) {
                    return false;
                }
                actionMenuPresenter.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, i.a.b.F);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            p1.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.Q();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.c.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, i.a.b.G);
            j(androidx.core.view.d0.f48644c);
            a(ActionMenuPresenter.this.f10844i3);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void g() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f10628c != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f10628c.close();
            }
            ActionMenuPresenter.this.H1 = null;
            super.g();
        }
    }

    private class f implements androidx.appcompat.view.menu.n.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (gVar instanceof androidx.appcompat.view.menu.s) {
                gVar.G().f(false);
            }
            androidx.appcompat.view.menu.n.a aVarQ = ActionMenuPresenter.this.q();
            if (aVarQ != null) {
                aVarQ.b(gVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f10628c) {
                return false;
            }
            ActionMenuPresenter.this.f10845j3 = ((androidx.appcompat.view.menu.s) gVar).getItem().getItemId();
            androidx.appcompat.view.menu.n.a aVarQ = ActionMenuPresenter.this.q();
            if (aVarQ != null) {
                return aVarQ.c(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, i.a.j.f286246d, i.a.j.f286245c);
        this.f10852p1 = new SparseBooleanArray();
        this.f10844i3 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f10634i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof androidx.appcompat.view.menu.o.a) && ((androidx.appcompat.view.menu.o.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return F() | E();
    }

    public Drawable D() {
        d dVar = this.f10846k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f10848m) {
            return this.f10847l;
        }
        return null;
    }

    public boolean E() {
        Object obj;
        c cVar = this.f10842g3;
        if (cVar != null && (obj = this.f10634i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f10842g3 = null;
            return true;
        }
        e eVar = this.H1;
        if (eVar == null) {
            return false;
        }
        eVar.dismiss();
        return true;
    }

    public boolean F() {
        a aVar = this.f10853p2;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    public boolean G() {
        return this.f10842g3 != null || H();
    }

    public boolean H() {
        e eVar = this.H1;
        return eVar != null && eVar.f();
    }

    public boolean I() {
        return this.f10849n;
    }

    public void J(Configuration configuration) {
        if (!this.f10857w) {
            this.f10856v = androidx.appcompat.view.a.b(this.f10627b).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f10628c;
        if (gVar != null) {
            gVar.O(true);
        }
    }

    public void K(boolean z10) {
        this.Z = z10;
    }

    public void L(int i10) {
        this.f10856v = i10;
        this.f10857w = true;
    }

    public void M(ActionMenuView actionMenuView) {
        this.f10634i = actionMenuView;
        actionMenuView.a(this.f10628c);
    }

    public void N(Drawable drawable) {
        d dVar = this.f10846k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f10848m = true;
            this.f10847l = drawable;
        }
    }

    public void O(boolean z10) {
        this.f10849n = z10;
        this.f10850o = true;
    }

    public void P(int i10, boolean z10) {
        this.f10854s = i10;
        this.X = z10;
        this.Y = true;
    }

    public boolean Q() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f10849n || H() || (gVar = this.f10628c) == null || this.f10634i == null || this.f10842g3 != null || gVar.C().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f10627b, this.f10628c, this.f10846k, true));
        this.f10842g3 = cVar;
        ((View) this.f10634i).post(cVar);
        return true;
    }

    @Override // androidx.core.view.b.a
    public void a(boolean z10) {
        if (z10) {
            super.m(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f10628c;
        if (gVar != null) {
            gVar.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        B();
        super.b(gVar, z10);
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable e() {
        SavedState savedState = new SavedState();
        savedState.f10858a = this.f10845j3;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f10634i).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f10628c;
        boolean z11 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> arrayListV = gVar.v();
            int size = arrayListV.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b bVarA = arrayListV.get(i10).a();
                if (bVarA != null) {
                    bVarA.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f10628c;
        ArrayList<androidx.appcompat.view.menu.j> arrayListC = gVar2 != null ? gVar2.C() : null;
        if (this.f10849n && arrayListC != null) {
            int size2 = arrayListC.size();
            if (size2 == 1) {
                z11 = !arrayListC.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f10846k == null) {
                this.f10846k = new d(this.f10626a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f10846k.getParent();
            if (viewGroup != this.f10634i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f10846k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f10634i;
                actionMenuView.addView(this.f10846k, actionMenuView.H());
            }
        } else {
            d dVar = this.f10846k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f10634i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f10846k);
                }
            }
        }
        ((ActionMenuView) this.f10634i).setOverflowReserved(this.f10849n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.j] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean g() {
        ArrayList<androidx.appcompat.view.menu.j> arrayListH;
        int size;
        int i10;
        int iN;
        ?? r10;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.g gVar = actionMenuPresenter.f10628c;
        View view = null;
        ?? r11 = 0;
        if (gVar != null) {
            arrayListH = gVar.H();
            size = arrayListH.size();
        } else {
            arrayListH = null;
            size = 0;
        }
        int i11 = actionMenuPresenter.f10856v;
        int i12 = actionMenuPresenter.f10855t;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f10634i;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.appcompat.view.menu.j jVar = arrayListH.get(i15);
            if (jVar.b()) {
                i13++;
            } else if (jVar.q()) {
                i14++;
            } else {
                z10 = true;
            }
            if (actionMenuPresenter.Z && jVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (actionMenuPresenter.f10849n && (z10 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f10852p1;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.X) {
            int i17 = actionMenuPresenter.f10851p0;
            iN = i12 / i17;
            i10 = i17 + ((i12 % i17) / iN);
        } else {
            i10 = 0;
            iN = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r12 = actionMenuPresenter;
        while (i18 < size) {
            androidx.appcompat.view.menu.j jVar2 = arrayListH.get(i18);
            if (jVar2.b()) {
                View viewR = r12.r(jVar2, view, viewGroup);
                if (r12.X) {
                    iN -= ActionMenuView.N(viewR, i10, iN, iMakeMeasureSpec, r11);
                } else {
                    viewR.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewR.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.x(true);
                r10 = r11;
            } else if (jVar2.q()) {
                int groupId2 = jVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i16 > 0 || z11) && i12 > 0 && (!r12.X || iN > 0);
                boolean z13 = z12;
                if (z12) {
                    View viewR2 = r12.r(jVar2, null, viewGroup);
                    if (r12.X) {
                        int iN2 = ActionMenuView.N(viewR2, i10, iN, iMakeMeasureSpec, 0);
                        iN -= iN2;
                        if (iN2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewR2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewR2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z12 = z14 & (!r12.X ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.j jVar3 = arrayListH.get(i20);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.o()) {
                                i16++;
                            }
                            jVar3.x(false);
                        }
                    }
                }
                if (z12) {
                    i16--;
                }
                jVar2.x(z12);
                r10 = 0;
            } else {
                r10 = r11;
                jVar2.x(r10);
            }
            i18++;
            r11 = r10;
            size = size;
            view = null;
            r12 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void i(@NonNull Context context, @androidx.annotation.p0 androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f10850o) {
            this.f10849n = aVarB.h();
        }
        if (!this.Y) {
            this.f10854s = aVarB.c();
        }
        if (!this.f10857w) {
            this.f10856v = aVarB.d();
        }
        int measuredWidth = this.f10854s;
        if (this.f10849n) {
            if (this.f10846k == null) {
                d dVar = new d(this.f10626a);
                this.f10846k = dVar;
                if (this.f10848m) {
                    dVar.setImageDrawable(this.f10847l);
                    this.f10847l = null;
                    this.f10848m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10846k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f10846k.getMeasuredWidth();
        } else {
            this.f10846k = null;
        }
        this.f10855t = measuredWidth;
        this.f10851p0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b
    public void k(androidx.appcompat.view.menu.j jVar, androidx.appcompat.view.menu.o.a aVar) {
        aVar.g(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f10634i);
        if (this.f10843h3 == null) {
            this.f10843h3 = new b();
        }
        actionMenuItemView.setPopupCallback(this.f10843h3);
    }

    @Override // androidx.appcompat.view.menu.n
    public void l(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f10858a) > 0 && (menuItemFindItem = this.f10628c.findItem(i10)) != null) {
            m((androidx.appcompat.view.menu.s) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean m(androidx.appcompat.view.menu.s sVar) {
        boolean z10 = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.s sVar2 = sVar;
        while (sVar2.o0() != this.f10628c) {
            sVar2 = (androidx.appcompat.view.menu.s) sVar2.o0();
        }
        View viewC = C(sVar2.getItem());
        if (viewC == null) {
            return false;
        }
        this.f10845j3 = sVar.getItem().getItemId();
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = sVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        a aVar = new a(this.f10627b, sVar, viewC);
        this.f10853p2 = aVar;
        aVar.i(z10);
        this.f10853p2.l();
        super.m(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o n(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.o oVar = this.f10634i;
        androidx.appcompat.view.menu.o oVarN = super.n(viewGroup);
        if (oVar != oVarN) {
            ((ActionMenuView) oVarN).setPresenter(this);
        }
        return oVarN;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean p(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f10846k) {
            return false;
        }
        return super.p(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.b
    public View r(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.m()) {
            actionView = super.r(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean t(int i10, androidx.appcompat.view.menu.j jVar) {
        return jVar.o();
    }
}
