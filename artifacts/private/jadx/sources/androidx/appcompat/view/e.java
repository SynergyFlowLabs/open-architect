package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class e extends b implements androidx.appcompat.view.menu.g.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f10514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f10515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<View> f10516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f10519i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f10513c = context;
        this.f10514d = actionBarContextView;
        this.f10515e = aVar;
        int i10 = 5 << 1;
        androidx.appcompat.view.menu.g gVarA0 = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).a0(1);
        this.f10519i = gVarA0;
        gVarA0.Y(this);
        this.f10518h = z10;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
        return this.f10515e.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@NonNull androidx.appcompat.view.menu.g gVar) {
        k();
        this.f10514d.o();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f10517g) {
            return;
        }
        this.f10517g = true;
        this.f10515e.d(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f10516f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f10519i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f10514d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f10514d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f10514d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f10515e.c(this, this.f10519i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f10514d.s();
    }

    @Override // androidx.appcompat.view.b
    public boolean m() {
        return this.f10518h;
    }

    @Override // androidx.appcompat.view.b
    public void n(View view) {
        this.f10514d.setCustomView(view);
        this.f10516f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void o(int i10) {
        p(this.f10513c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void p(CharSequence charSequence) {
        this.f10514d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void r(int i10) {
        s(this.f10513c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void s(CharSequence charSequence) {
        this.f10514d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void t(boolean z10) {
        super.t(z10);
        this.f10514d.setTitleOptional(z10);
    }

    public void u(androidx.appcompat.view.menu.g gVar, boolean z10) {
    }

    public void v(s sVar) {
    }

    public boolean w(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return true;
        }
        new m(this.f10514d.getContext(), sVar).l();
        return true;
    }
}
