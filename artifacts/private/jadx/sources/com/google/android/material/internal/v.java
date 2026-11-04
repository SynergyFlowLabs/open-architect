package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.t0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class v implements androidx.appcompat.view.menu.n {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f112907k3 = 0;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final String f112908l3 = "android:menu:list";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final String f112909m3 = "android:menu:adapter";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final String f112910n3 = "android:menu:header";

    @t0
    int X;

    @t0
    int Y;

    @t0
    int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NavigationMenuView f112911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LinearLayout f112912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.appcompat.view.menu.n.a f112913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.appcompat.view.menu.g f112914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f112915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c f112916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LayoutInflater f112917g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f112918g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    int f112920h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    ColorStateList f112921i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ColorStateList f112926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f112927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Drawable f112928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    RippleDrawable f112929o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @t0
    int f112930p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    boolean f112931p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f112932p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f112933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @t0
    int f112934t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f112935v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f112936w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f112919h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f112923j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f112925k = true;
    boolean H1 = true;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f112922i3 = -1;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    final View.OnClickListener f112924j3 = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            v.this.b0(true);
            androidx.appcompat.view.menu.j itemData = ((NavigationMenuItemView) view).getItemData();
            v vVar = v.this;
            int i10 = 3 | 0;
            boolean zQ = vVar.f112914d.Q(itemData, vVar, 0);
            if (itemData != null && itemData.isCheckable() && zQ) {
                v.this.f112916f.t(itemData);
            } else {
                z10 = false;
            }
            v.this.b0(false);
            if (z10) {
                v.this.f(false);
            }
        }
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    private class c extends RecyclerView.h<l> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f112938e = "android:menu:checked";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f112939f = "android:menu:action_views";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f112940g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f112941h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f112942i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f112943j = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<e> f112944a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.view.menu.j f112945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f112946c;

        class a extends androidx.core.view.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f112948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f112949b;

            a(int i10, boolean z10) {
                this.f112948a = i10;
                this.f112949b = z10;
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull androidx.core.view.accessibility.j jVar) {
                super.onInitializeAccessibilityNodeInfo(view, jVar);
                jVar.m1(androidx.core.view.accessibility.j.g.j(c.this.i(this.f112948a), 1, 1, 1, this.f112949b, view.isSelected()));
            }
        }

        c() {
            q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int i(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = 0 | 2;
                if (v.this.f112916f.getItemViewType(i12) == 2 || v.this.f112916f.getItemViewType(i12) == 3) {
                    i11--;
                }
            }
            return i11;
        }

        private void j(int i10, int i11) {
            while (i10 < i11) {
                int i12 = 4 >> 1;
                ((g) this.f112944a.get(i10)).f112954b = true;
                i10++;
            }
        }

        private void q() {
            if (this.f112946c) {
                return;
            }
            boolean z10 = true;
            this.f112946c = true;
            this.f112944a.clear();
            this.f112944a.add(new d());
            int size = v.this.f112914d.H().size();
            int i10 = -1;
            int i11 = 0;
            boolean z11 = false;
            int size2 = 0;
            while (i11 < size) {
                androidx.appcompat.view.menu.j jVar = v.this.f112914d.H().get(i11);
                if (jVar.isChecked()) {
                    t(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.w(false);
                }
                if (jVar.hasSubMenu()) {
                    SubMenu subMenu = jVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.f112944a.add(new f(v.this.f112920h3, 0));
                        }
                        this.f112944a.add(new g(jVar));
                        int size3 = this.f112944a.size();
                        int size4 = subMenu.size();
                        int i12 = 0;
                        boolean z12 = false;
                        while (i12 < size4) {
                            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(i12);
                            if (jVar2.isVisible()) {
                                if (!z12 && jVar2.getIcon() != null) {
                                    z12 = z10;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.w(false);
                                }
                                if (jVar.isChecked()) {
                                    t(jVar);
                                }
                                this.f112944a.add(new g(jVar2));
                            }
                            i12++;
                            z10 = true;
                        }
                        if (z12) {
                            j(size3, this.f112944a.size());
                        }
                    }
                } else {
                    int groupId = jVar.getGroupId();
                    if (groupId != i10) {
                        size2 = this.f112944a.size();
                        z11 = jVar.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            ArrayList<e> arrayList = this.f112944a;
                            int i13 = v.this.f112920h3;
                            arrayList.add(new f(i13, i13));
                        }
                    } else if (!z11 && jVar.getIcon() != null) {
                        j(size2, this.f112944a.size());
                        z11 = true;
                    }
                    g gVar = new g(jVar);
                    gVar.f112954b = z11;
                    this.f112944a.add(gVar);
                    i10 = groupId;
                }
                i11++;
                z10 = true;
            }
            this.f112946c = false;
        }

        private void s(View view, int i10, boolean z10) {
            u1.G1(view, new a(i10, z10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f112944a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i10) {
            e eVar = this.f112944a.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @NonNull
        public Bundle k() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar = this.f112945b;
            if (jVar != null) {
                bundle.putInt(f112938e, jVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f112944a.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f112944a.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.j jVarA = ((g) eVar).a();
                    View actionView = jVarA != null ? jVarA.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(jVarA.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f112939f, sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.j l() {
            return this.f112945b;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001c  */
        int m() {
            int i10 = 0;
            for (int i11 = 0; i11 < v.this.f112916f.getItemCount(); i11++) {
                int itemViewType = v.this.f112916f.getItemViewType(i11);
                if (itemViewType != 0) {
                    int i12 = 1 >> 1;
                    if (itemViewType == 1) {
                        i10++;
                    }
                } else {
                    i10++;
                }
            }
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull l lVar, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.f112944a.get(i10);
                    lVar.itemView.setPadding(v.this.X, fVar.b(), v.this.Y, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f112944a.get(i10)).a().getTitle());
                androidx.core.widget.r.D(textView, v.this.f112919h);
                textView.setPadding(v.this.Z, textView.getPaddingTop(), v.this.f112930p0, textView.getPaddingBottom());
                ColorStateList colorStateList = v.this.f112921i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                s(textView, i10, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(v.this.f112927m);
            navigationMenuItemView.setTextAppearance(v.this.f112923j);
            ColorStateList colorStateList2 = v.this.f112926l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = v.this.f112928n;
            u1.O1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = v.this.f112929o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f112944a.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f112954b);
            v vVar = v.this;
            int i11 = vVar.f112933s;
            int i12 = vVar.f112934t;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(v.this.f112935v);
            v vVar2 = v.this;
            if (vVar2.f112931p1) {
                navigationMenuItemView.setIconSize(vVar2.f112936w);
            }
            navigationMenuItemView.setMaxLines(v.this.f112932p2);
            navigationMenuItemView.F(gVar.a(), v.this.f112925k);
            s(navigationMenuItemView, i10, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        @androidx.annotation.p0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                v vVar = v.this;
                return new i(vVar.f112917g, viewGroup, vVar.f112924j3);
            }
            if (i10 == 1) {
                return new k(v.this.f112917g, viewGroup);
            }
            if (i10 == 2) {
                return new j(v.this.f112917g, viewGroup);
            }
            if (i10 != 3) {
                return null;
            }
            return new b(v.this.f112912b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).G();
            }
        }

        public void r(@NonNull Bundle bundle) {
            androidx.appcompat.view.menu.j jVarA;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.j jVarA2;
            int i10 = bundle.getInt(f112938e, 0);
            if (i10 != 0) {
                int i11 = 3 >> 1;
                this.f112946c = true;
                int size = this.f112944a.size();
                for (int i12 = 0; i12 < size; i12++) {
                    e eVar = this.f112944a.get(i12);
                    if ((eVar instanceof g) && (jVarA2 = ((g) eVar).a()) != null && jVarA2.getItemId() == i10) {
                        t(jVarA2);
                        break;
                    }
                }
                this.f112946c = false;
                q();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f112939f);
            if (sparseParcelableArray != null) {
                int size2 = this.f112944a.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    e eVar2 = this.f112944a.get(i13);
                    if ((eVar2 instanceof g) && (jVarA = ((g) eVar2).a()) != null && (actionView = jVarA.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(jVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void t(@NonNull androidx.appcompat.view.menu.j jVar) {
            if (this.f112945b != jVar && jVar.isCheckable()) {
                androidx.appcompat.view.menu.j jVar2 = this.f112945b;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f112945b = jVar;
                jVar.setChecked(true);
            }
        }

        public void u(boolean z10) {
            this.f112946c = z10;
        }

        public void v() {
            q();
            notifyDataSetChanged();
        }
    }

    private static class d implements e {
        d() {
        }
    }

    private interface e {
    }

    private static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f112951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f112952b;

        public f(int i10, int i11) {
            this.f112951a = i10;
            this.f112952b = i11;
        }

        public int a() {
            return this.f112952b;
        }

        public int b() {
            return this.f112951a;
        }
    }

    private static class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.j f112953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f112954b;

        g(androidx.appcompat.view.menu.j jVar) {
            this.f112953a = jVar;
        }

        public androidx.appcompat.view.menu.j a() {
            return this.f112953a;
        }
    }

    private class h extends androidx.recyclerview.widget.b0 {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.b0, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.l1(androidx.core.view.accessibility.j.f.g(v.this.f112916f.m(), 1, false));
        }
    }

    private static class i extends l {
        public i(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(r6.a.k.K, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(r6.a.k.M, viewGroup, false));
        }
    }

    private static class k extends l {
        public k(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(r6.a.k.N, viewGroup, false));
        }
    }

    private static abstract class l extends RecyclerView.g0 {
        public l(View view) {
            super(view);
        }
    }

    private boolean C() {
        return r() > 0;
    }

    private void c0() {
        int i10 = (C() || !this.H1) ? 0 : this.f112918g3;
        NavigationMenuView navigationMenuView = this.f112911a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    @t0
    public int A() {
        return this.f112930p0;
    }

    @t0
    public int B() {
        return this.Z;
    }

    public View D(@androidx.annotation.j0 int i10) {
        View viewInflate = this.f112917g.inflate(i10, (ViewGroup) this.f112912b, false);
        d(viewInflate);
        return viewInflate;
    }

    public boolean E() {
        return this.H1;
    }

    public void F(@NonNull View view) {
        this.f112912b.removeView(view);
        if (C()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.f112911a;
        navigationMenuView.setPadding(0, this.f112918g3, 0, navigationMenuView.getPaddingBottom());
    }

    public void G(boolean z10) {
        if (this.H1 != z10) {
            this.H1 = z10;
            c0();
        }
    }

    public void H(@NonNull androidx.appcompat.view.menu.j jVar) {
        this.f112916f.t(jVar);
    }

    public void I(@t0 int i10) {
        this.Y = i10;
        f(false);
    }

    public void J(@t0 int i10) {
        this.X = i10;
        f(false);
    }

    public void K(int i10) {
        this.f112915e = i10;
    }

    public void L(@androidx.annotation.p0 Drawable drawable) {
        this.f112928n = drawable;
        f(false);
    }

    public void M(@androidx.annotation.p0 RippleDrawable rippleDrawable) {
        this.f112929o = rippleDrawable;
        f(false);
    }

    public void N(int i10) {
        this.f112933s = i10;
        f(false);
    }

    public void O(int i10) {
        this.f112935v = i10;
        f(false);
    }

    public void P(@androidx.annotation.r int i10) {
        if (this.f112936w != i10) {
            this.f112936w = i10;
            this.f112931p1 = true;
            f(false);
        }
    }

    public void Q(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f112927m = colorStateList;
        f(false);
    }

    public void R(int i10) {
        this.f112932p2 = i10;
        f(false);
    }

    public void S(@g1 int i10) {
        this.f112923j = i10;
        f(false);
    }

    public void T(boolean z10) {
        this.f112925k = z10;
        f(false);
    }

    public void U(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f112926l = colorStateList;
        f(false);
    }

    public void V(@t0 int i10) {
        this.f112934t = i10;
        f(false);
    }

    public void W(int i10) {
        this.f112922i3 = i10;
        NavigationMenuView navigationMenuView = this.f112911a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void X(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f112921i = colorStateList;
        f(false);
    }

    public void Y(@t0 int i10) {
        this.f112930p0 = i10;
        f(false);
    }

    public void Z(@t0 int i10) {
        this.Z = i10;
        f(false);
    }

    public void a0(@g1 int i10) {
        this.f112919h = i10;
        f(false);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        androidx.appcompat.view.menu.n.a aVar = this.f112913c;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    public void b0(boolean z10) {
        c cVar = this.f112916f;
        if (cVar != null) {
            cVar.u(z10);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean c(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    public void d(@NonNull View view) {
        this.f112912b.addView(view);
        NavigationMenuView navigationMenuView = this.f112911a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.n
    @NonNull
    public Parcelable e() {
        Bundle bundle = new Bundle();
        if (this.f112911a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f112911a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f112916f;
        if (cVar != null) {
            bundle.putBundle(f112909m3, cVar.k());
        }
        if (this.f112912b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f112912b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(f112910n3, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public void f(boolean z10) {
        c cVar = this.f112916f;
        if (cVar != null) {
            cVar.v();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f112915e;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean h(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(@NonNull Context context, @NonNull androidx.appcompat.view.menu.g gVar) {
        this.f112917g = LayoutInflater.from(context);
        this.f112914d = gVar;
        this.f112920h3 = context.getResources().getDimensionPixelOffset(r6.a.f.f360436v1);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(androidx.appcompat.view.menu.n.a aVar) {
        this.f112913c = aVar;
    }

    public void k(@NonNull g3 g3Var) {
        int iR = g3Var.r();
        if (this.f112918g3 != iR) {
            this.f112918g3 = iR;
            c0();
        }
        NavigationMenuView navigationMenuView = this.f112911a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, g3Var.o());
        u1.p(this.f112912b, g3Var);
    }

    @Override // androidx.appcompat.view.menu.n
    public void l(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f112911a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(f112909m3);
            if (bundle2 != null) {
                this.f112916f.r(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(f112910n3);
            if (sparseParcelableArray2 != null) {
                this.f112912b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean m(androidx.appcompat.view.menu.s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o n(ViewGroup viewGroup) {
        if (this.f112911a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f112917g.inflate(r6.a.k.O, viewGroup, false);
            this.f112911a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f112911a));
            if (this.f112916f == null) {
                c cVar = new c();
                this.f112916f = cVar;
                int i10 = 3 << 1;
                cVar.setHasStableIds(true);
            }
            int i11 = this.f112922i3;
            if (i11 != -1) {
                this.f112911a.setOverScrollMode(i11);
            }
            LinearLayout linearLayout = (LinearLayout) this.f112917g.inflate(r6.a.k.L, (ViewGroup) this.f112911a, false);
            this.f112912b = linearLayout;
            int i12 = 7 << 2;
            u1.Y1(linearLayout, 2);
            this.f112911a.setAdapter(this.f112916f);
        }
        return this.f112911a;
    }

    @androidx.annotation.p0
    public androidx.appcompat.view.menu.j o() {
        return this.f112916f.l();
    }

    @t0
    public int p() {
        return this.Y;
    }

    @t0
    public int q() {
        return this.X;
    }

    public int r() {
        return this.f112912b.getChildCount();
    }

    public View s(int i10) {
        return this.f112912b.getChildAt(i10);
    }

    @androidx.annotation.p0
    public Drawable t() {
        return this.f112928n;
    }

    public int u() {
        return this.f112933s;
    }

    public int v() {
        return this.f112935v;
    }

    public int w() {
        return this.f112932p2;
    }

    @androidx.annotation.p0
    public ColorStateList x() {
        return this.f112926l;
    }

    @androidx.annotation.p0
    public ColorStateList y() {
        return this.f112927m;
    }

    @t0
    public int z() {
        return this.f112934t;
    }
}
