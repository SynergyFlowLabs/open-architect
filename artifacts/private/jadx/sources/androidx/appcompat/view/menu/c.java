package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.h3;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Context f10636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h3<l1.b, MenuItem> f10637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h3<l1.c, SubMenu> f10638n;

    c(Context context) {
        this.f10636l = context;
    }

    final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof l1.b)) {
            return menuItem;
        }
        l1.b bVar = (l1.b) menuItem;
        if (this.f10637m == null) {
            this.f10637m = new h3<>();
        }
        MenuItem menuItem2 = this.f10637m.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k kVar = new k(this.f10636l, bVar);
        this.f10637m.put(bVar, kVar);
        return kVar;
    }

    final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof l1.c)) {
            return subMenu;
        }
        l1.c cVar = (l1.c) subMenu;
        if (this.f10638n == null) {
            this.f10638n = new h3<>();
        }
        SubMenu subMenu2 = this.f10638n.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        t tVar = new t(this.f10636l, cVar);
        this.f10638n.put(cVar, tVar);
        return tVar;
    }

    final void g() {
        h3<l1.b, MenuItem> h3Var = this.f10637m;
        if (h3Var != null) {
            h3Var.clear();
        }
        h3<l1.c, SubMenu> h3Var2 = this.f10638n;
        if (h3Var2 != null) {
            h3Var2.clear();
        }
    }

    final void h(int i10) {
        if (this.f10637m != null) {
            int i11 = 0;
            while (i11 < this.f10637m.size()) {
                if (this.f10637m.g(i11).getGroupId() == i10) {
                    this.f10637m.i(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    final void i(int i10) {
        if (this.f10637m != null) {
            for (int i11 = 0; i11 < this.f10637m.size(); i11++) {
                if (this.f10637m.g(i11).getItemId() == i10) {
                    this.f10637m.i(i11);
                    return;
                }
            }
        }
    }
}
