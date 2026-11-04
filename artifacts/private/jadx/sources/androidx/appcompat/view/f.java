package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.b1;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import androidx.collection.h3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f10520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f10521b;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f10522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f10523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f10524c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final h3<Menu, Menu> f10525d = new h3<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f10523b = context;
            this.f10522a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f10525d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p pVar = new p(this.f10523b, (l1.a) menu);
            this.f10525d.put(menu, pVar);
            return pVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f10522a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.f10522a.onActionItemClicked(e(bVar), new k(this.f10523b, (l1.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f10522a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public void d(b bVar) {
            this.f10522a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f10524c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f10524c.get(i10);
                if (fVar != null && fVar.f10521b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f10523b, bVar);
            this.f10524c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f10520a = context;
        this.f10521b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f10521b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f10521b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p(this.f10520a, (l1.a) this.f10521b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f10521b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f10521b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f10521b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f10521b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f10521b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f10521b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f10521b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f10521b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f10521b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f10521b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f10521b.s(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f10521b.t(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f10521b.o(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f10521b.r(i10);
    }
}
