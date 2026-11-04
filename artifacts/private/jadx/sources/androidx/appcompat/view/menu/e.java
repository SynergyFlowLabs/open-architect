package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.b1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class e implements n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10675k = "ListMenuPresenter";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f10676l = "android:menu:list";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f10677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f10678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    g f10679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f10680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f10681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f10682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f10683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n.a f10684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f10685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10686j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10687a = -1;

        public a() {
            a();
        }

        void a() {
            j jVarY = e.this.f10679c.y();
            if (jVarY != null) {
                ArrayList<j> arrayListC = e.this.f10679c.C();
                int size = arrayListC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListC.get(i10) == jVarY) {
                        this.f10687a = i10;
                        return;
                    }
                }
            }
            this.f10687a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j getItem(int i10) {
            ArrayList<j> arrayListC = e.this.f10679c.C();
            int i11 = i10 + e.this.f10681e;
            int i12 = this.f10687a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListC.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f10679c.C().size() - e.this.f10681e;
            return this.f10687a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f10678b.inflate(eVar.f10683g, viewGroup, false);
            }
            ((o.a) view).g(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f10677a = context;
        this.f10678b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f10685i == null) {
            this.f10685i = new a();
        }
        return this.f10685i;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z10) {
        n.a aVar = this.f10684h;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean c(g gVar, j jVar) {
        return false;
    }

    int d() {
        return this.f10681e;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable e() {
        if (this.f10680d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public void f(boolean z10) {
        a aVar = this.f10685i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f10686j;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean h(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(Context context, g gVar) {
        if (this.f10682f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f10682f);
            this.f10677a = contextThemeWrapper;
            this.f10678b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f10677a != null) {
            this.f10677a = context;
            if (this.f10678b == null) {
                this.f10678b = LayoutInflater.from(context);
            }
        }
        this.f10679c = gVar;
        a aVar = this.f10685i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(n.a aVar) {
        this.f10684h = aVar;
    }

    public void k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f10676l);
        if (sparseParcelableArray != null) {
            this.f10680d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void l(Parcelable parcelable) {
        k((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean m(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new h(sVar).e(null);
        n.a aVar = this.f10684h;
        if (aVar == null) {
            return true;
        }
        aVar.c(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public o n(ViewGroup viewGroup) {
        if (this.f10680d == null) {
            this.f10680d = (ExpandedMenuView) this.f10678b.inflate(i.a.j.f286256n, viewGroup, false);
            if (this.f10685i == null) {
                this.f10685i = new a();
            }
            this.f10680d.setAdapter((ListAdapter) this.f10685i);
            this.f10680d.setOnItemClickListener(this);
        }
        return this.f10680d;
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f10680d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f10676l, sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f10679c.Q(this.f10685i.getItem(i10), this, 0);
    }

    public void p(int i10) {
        this.f10686j = i10;
    }

    public void q(int i10) {
        this.f10681e = i10;
        if (this.f10680d != null) {
            f(false);
        }
    }

    public e(int i10, int i11) {
        this.f10683g = i10;
        this.f10682f = i11;
    }
}
