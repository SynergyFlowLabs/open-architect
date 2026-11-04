package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.core.view.d0;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class m implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f10742m = 48;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f10744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f10748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n.a f10751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l f10752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f10754l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m.this.g();
        }
    }

    public m(@NonNull Context context, @NonNull g gVar) {
        this(context, gVar, null, false, i.a.b.f286020z2, 0);
    }

    @NonNull
    private l b() {
        Display defaultDisplay = ((WindowManager) this.f10743a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        l dVar = Math.min(point.x, point.y) >= this.f10743a.getResources().getDimensionPixelSize(i.a.e.f286120w) ? new d(this.f10743a, this.f10748f, this.f10746d, this.f10747e, this.f10745c) : new r(this.f10743a, this.f10744b, this.f10748f, this.f10746d, this.f10747e, this.f10745c);
        dVar.o(this.f10744b);
        dVar.x(this.f10754l);
        dVar.s(this.f10748f);
        dVar.j(this.f10751i);
        dVar.u(this.f10750h);
        dVar.v(this.f10749g);
        return dVar;
    }

    private void n(int i10, int i11, boolean z10, boolean z11) {
        l lVarE = e();
        lVarE.y(z11);
        if (z10) {
            if ((d0.d(this.f10749g, this.f10748f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f10748f.getWidth();
            }
            lVarE.w(i10);
            lVarE.z(i11);
            int i12 = (int) ((this.f10743a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarE.t(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        lVarE.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(@p0 n.a aVar) {
        this.f10751i = aVar;
        l lVar = this.f10752j;
        if (lVar != null) {
            lVar.j(aVar);
        }
    }

    public int c() {
        return this.f10749g;
    }

    public ListView d() {
        return e().k();
    }

    @Override // androidx.appcompat.view.menu.i
    public void dismiss() {
        if (f()) {
            this.f10752j.dismiss();
        }
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public l e() {
        if (this.f10752j == null) {
            this.f10752j = b();
        }
        return this.f10752j;
    }

    public boolean f() {
        l lVar = this.f10752j;
        return lVar != null && lVar.d();
    }

    protected void g() {
        this.f10752j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f10753k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@NonNull View view) {
        this.f10748f = view;
    }

    public void i(boolean z10) {
        this.f10750h = z10;
        l lVar = this.f10752j;
        if (lVar != null) {
            lVar.u(z10);
        }
    }

    public void j(int i10) {
        this.f10749g = i10;
    }

    public void k(@p0 PopupWindow.OnDismissListener onDismissListener) {
        this.f10753k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i10, int i11) {
        if (!p(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f10748f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i10, int i11) {
        if (f()) {
            return true;
        }
        if (this.f10748f == null) {
            return false;
        }
        n(i10, i11, true, true);
        return true;
    }

    public m(@NonNull Context context, @NonNull g gVar, @NonNull View view) {
        this(context, gVar, view, false, i.a.b.f286020z2, 0);
    }

    public m(@NonNull Context context, @NonNull g gVar, @NonNull View view, boolean z10, @androidx.annotation.f int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    public m(@NonNull Context context, @NonNull g gVar, @NonNull View view, boolean z10, @androidx.annotation.f int i10, @g1 int i11) {
        this.f10749g = d0.f48643b;
        this.f10754l = new a();
        this.f10743a = context;
        this.f10744b = gVar;
        this.f10748f = view;
        this.f10745c = z10;
        this.f10746d = i10;
        this.f10747e = i11;
    }
}
