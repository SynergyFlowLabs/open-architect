package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.d0;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public class b implements DrawerLayout.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0030b f10286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DrawerLayout f10287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.appcompat.graphics.drawable.d f10288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f10290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f10291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f10294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    View.OnClickListener f10295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10296k;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f10291f) {
                bVar.v();
                return;
            }
            View.OnClickListener onClickListener = bVar.f10295j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0030b {
        Drawable a();

        void b(Drawable drawable, @f1 int i10);

        void c(@f1 int i10);

        Context d();

        boolean e();
    }

    public interface c {
        @p0
        InterfaceC0030b getDrawerToggleDelegate();
    }

    private static class d implements InterfaceC0030b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f10298a;

        d(Activity activity) {
            this.f10298a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public Drawable a() {
            TypedArray typedArrayObtainStyledAttributes = d().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public void b(Drawable drawable, int i10) {
            ActionBar actionBar = this.f10298a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public void c(int i10) {
            ActionBar actionBar = this.f10298a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public Context d() {
            ActionBar actionBar = this.f10298a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f10298a;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public boolean e() {
            ActionBar actionBar = this.f10298a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    static class e implements InterfaceC0030b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Toolbar f10299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Drawable f10300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f10301c;

        e(Toolbar toolbar) {
            this.f10299a = toolbar;
            this.f10300b = toolbar.getNavigationIcon();
            this.f10301c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public Drawable a() {
            return this.f10300b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public void b(Drawable drawable, @f1 int i10) {
            this.f10299a.setNavigationIcon(drawable);
            c(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public void c(@f1 int i10) {
            if (i10 == 0) {
                this.f10299a.setNavigationContentDescription(this.f10301c);
            } else {
                this.f10299a.setNavigationContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public Context d() {
            return this.f10299a.getContext();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public boolean e() {
            return true;
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, @f1 int i10, @f1 int i11) {
        this(activity, null, drawerLayout, null, i10, i11);
    }

    private void s(float f10) {
        if (f10 == 1.0f) {
            this.f10288c.t(true);
        } else if (f10 == 0.0f) {
            this.f10288c.t(false);
        }
        this.f10288c.setProgress(f10);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        s(1.0f);
        if (this.f10291f) {
            l(this.f10294i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        s(0.0f);
        if (this.f10291f) {
            l(this.f10293h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i10) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f10) {
        if (this.f10289d) {
            s(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            s(0.0f);
        }
    }

    @NonNull
    public androidx.appcompat.graphics.drawable.d e() {
        return this.f10288c;
    }

    Drawable f() {
        return this.f10286a.a();
    }

    public View.OnClickListener g() {
        return this.f10295j;
    }

    public boolean h() {
        return this.f10291f;
    }

    public boolean i() {
        return this.f10289d;
    }

    public void j(Configuration configuration) {
        if (!this.f10292g) {
            this.f10290e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f10291f) {
            return false;
        }
        v();
        return true;
    }

    void l(int i10) {
        this.f10286a.c(i10);
    }

    void m(Drawable drawable, int i10) {
        if (!this.f10296k && !this.f10286a.e()) {
            this.f10296k = true;
        }
        this.f10286a.b(drawable, i10);
    }

    public void n(@NonNull androidx.appcompat.graphics.drawable.d dVar) {
        this.f10288c = dVar;
        u();
    }

    public void o(boolean z10) {
        if (z10 != this.f10291f) {
            if (z10) {
                m(this.f10288c, this.f10287b.C(d0.f48643b) ? this.f10294i : this.f10293h);
            } else {
                m(this.f10290e, 0);
            }
            this.f10291f = z10;
        }
    }

    public void p(boolean z10) {
        this.f10289d = z10;
        if (!z10) {
            s(0.0f);
        }
    }

    public void q(int i10) {
        r(i10 != 0 ? this.f10287b.getResources().getDrawable(i10) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f10290e = f();
            this.f10292g = false;
        } else {
            this.f10290e = drawable;
            this.f10292g = true;
        }
        if (this.f10291f) {
            return;
        }
        m(this.f10290e, 0);
    }

    public void t(View.OnClickListener onClickListener) {
        this.f10295j = onClickListener;
    }

    public void u() {
        if (this.f10287b.C(d0.f48643b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f10291f) {
            m(this.f10288c, this.f10287b.C(d0.f48643b) ? this.f10294i : this.f10293h);
        }
    }

    void v() {
        int iQ = this.f10287b.q(d0.f48643b);
        if (this.f10287b.F(d0.f48643b) && iQ != 2) {
            this.f10287b.d(d0.f48643b);
        } else {
            if (iQ != 1) {
                this.f10287b.K(d0.f48643b);
            }
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @f1 int i10, @f1 int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, androidx.appcompat.graphics.drawable.d dVar, @f1 int i10, @f1 int i11) {
        this.f10289d = true;
        this.f10291f = true;
        this.f10296k = false;
        if (toolbar != null) {
            this.f10286a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f10286a = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.f10286a = new d(activity);
        }
        this.f10287b = drawerLayout;
        this.f10293h = i10;
        this.f10294i = i11;
        if (dVar == null) {
            this.f10288c = new androidx.appcompat.graphics.drawable.d(this.f10286a.d());
        } else {
            this.f10288c = dVar;
        }
        this.f10290e = f();
    }
}
