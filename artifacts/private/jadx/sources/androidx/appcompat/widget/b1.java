package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b1 extends androidx.core.view.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f11159k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11160l = "share_history.xml";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f11162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Context f11163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f11164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f11165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.appcompat.widget.c.f f11166j;

    public interface a {
        boolean a(b1 b1Var, Intent intent);
    }

    private class b implements androidx.appcompat.widget.c.f {
        b() {
        }

        @Override // androidx.appcompat.widget.c.f
        public boolean a(androidx.appcompat.widget.c cVar, Intent intent) {
            b1 b1Var = b1.this;
            a aVar = b1Var.f11165i;
            if (aVar != null) {
                aVar.a(b1Var, intent);
            }
            return false;
        }
    }

    private class c implements MenuItem.OnMenuItemClickListener {
        c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            b1 b1Var = b1.this;
            Intent intentB = androidx.appcompat.widget.c.d(b1Var.f11163g, b1Var.f11164h).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                b1.this.r(intentB);
            }
            b1.this.f11163g.startActivity(intentB);
            return true;
        }
    }

    public b1(Context context) {
        super(context);
        this.f11161e = 4;
        this.f11162f = new c();
        this.f11164h = f11160l;
        this.f11163g = context;
    }

    private void n() {
        if (this.f11165i == null) {
            return;
        }
        if (this.f11166j == null) {
            this.f11166j = new b();
        }
        androidx.appcompat.widget.c.d(this.f11163g, this.f11164h).u(this.f11166j);
    }

    @Override // androidx.core.view.b
    public boolean b() {
        return true;
    }

    @Override // androidx.core.view.b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f11163g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.c.d(this.f11163g, this.f11164h));
        }
        TypedValue typedValue = new TypedValue();
        this.f11163g.getTheme().resolveAttribute(i.a.b.A, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(j.a.b(this.f11163g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(i.a.k.f286294z);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(i.a.k.f286293y);
        return activityChooserView;
    }

    @Override // androidx.core.view.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.c cVarD = androidx.appcompat.widget.c.d(this.f11163g, this.f11164h);
        PackageManager packageManager = this.f11163g.getPackageManager();
        int iF = cVarD.f();
        int iMin = Math.min(iF, this.f11161e);
        for (int i10 = 0; i10 < iMin; i10++) {
            ResolveInfo resolveInfoE = cVarD.e(i10);
            subMenu.add(0, i10, i10, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.f11162f);
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f11163g.getString(i.a.k.f286273e));
            for (int i11 = 0; i11 < iF; i11++) {
                ResolveInfo resolveInfoE2 = cVarD.e(i11);
                subMenuAddSubMenu.add(0, i11, i11, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f11162f);
            }
        }
    }

    public void o(a aVar) {
        this.f11165i = aVar;
        n();
    }

    public void p(String str) {
        this.f11164h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        androidx.appcompat.widget.c.d(this.f11163g, this.f11164h).t(intent);
    }

    void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
