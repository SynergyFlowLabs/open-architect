package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f10505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10506b;

    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, MenuItem menuItem);

        boolean c(b bVar, Menu menu);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f10505a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f10506b;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int i10);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.f10505a = obj;
    }

    public abstract void r(int i10);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z10) {
        this.f10506b = z10;
    }
}
