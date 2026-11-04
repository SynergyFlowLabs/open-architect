package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f11620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f11621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.appcompat.view.menu.m f11622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    e f11623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f11624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnTouchListener f11625g;

    class a implements androidx.appcompat.view.menu.g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
            e eVar = v0.this.f11623e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar) {
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            v0 v0Var = v0.this;
            d dVar = v0Var.f11624f;
            if (dVar != null) {
                dVar.a(v0Var);
            }
        }
    }

    class c extends q0 {
        c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.q0
        public androidx.appcompat.view.menu.q b() {
            return v0.this.f11622d.e();
        }

        @Override // androidx.appcompat.widget.q0
        protected boolean c() {
            v0.this.l();
            return true;
        }

        @Override // androidx.appcompat.widget.q0
        protected boolean d() {
            v0.this.a();
            return true;
        }
    }

    public interface d {
        void a(v0 v0Var);
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public v0(@NonNull Context context, @NonNull View view) {
        this(context, view, 0);
    }

    public void a() {
        this.f11622d.dismiss();
    }

    @NonNull
    public View.OnTouchListener b() {
        if (this.f11625g == null) {
            this.f11625g = new c(this.f11621c);
        }
        return this.f11625g;
    }

    public int c() {
        return this.f11622d.c();
    }

    @NonNull
    public Menu d() {
        return this.f11620b;
    }

    @NonNull
    public MenuInflater e() {
        return new androidx.appcompat.view.g(this.f11619a);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    ListView f() {
        if (this.f11622d.f()) {
            return this.f11622d.d();
        }
        return null;
    }

    public void g(@androidx.annotation.m0 int i10) {
        e().inflate(i10, this.f11620b);
    }

    public void h(boolean z10) {
        this.f11622d.i(z10);
    }

    public void i(int i10) {
        this.f11622d.j(i10);
    }

    public void j(@androidx.annotation.p0 d dVar) {
        this.f11624f = dVar;
    }

    public void k(@androidx.annotation.p0 e eVar) {
        this.f11623e = eVar;
    }

    public void l() {
        this.f11622d.l();
    }

    public v0(@NonNull Context context, @NonNull View view, int i10) {
        this(context, view, i10, i.a.b.f286020z2, 0);
    }

    public v0(@NonNull Context context, @NonNull View view, int i10, @androidx.annotation.f int i11, @androidx.annotation.g1 int i12) {
        this.f11619a = context;
        this.f11621c = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f11620b = gVar;
        gVar.Y(new a());
        androidx.appcompat.view.menu.m mVar = new androidx.appcompat.view.menu.m(context, gVar, view, false, i11, i12);
        this.f11622d = mVar;
        mVar.j(i10);
        mVar.k(new b());
    }
}
