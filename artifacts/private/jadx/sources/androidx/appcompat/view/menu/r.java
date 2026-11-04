package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.u0;

/* JADX INFO: loaded from: classes.dex */
final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {
    private static final int Z = i.a.j.f286262t;
    private boolean Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f10758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f10759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f10760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f10762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final u0 f10764i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f10768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f10769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n.a f10770o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ViewTreeObserver f10771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10772t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10773v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10774w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f10765j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f10766k = new b();
    private int X = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!r.this.d() || r.this.f10764i.L()) {
                return;
            }
            View view = r.this.f10769n;
            if (view == null || !view.isShown()) {
                r.this.dismiss();
            } else {
                r.this.f10764i.a();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = r.this.f10771s;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    r.this.f10771s = view.getViewTreeObserver();
                }
                r rVar = r.this;
                rVar.f10771s.removeGlobalOnLayoutListener(rVar.f10765j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f10757b = context;
        this.f10758c = gVar;
        this.f10760e = z10;
        this.f10759d = new f(gVar, LayoutInflater.from(context), z10, Z);
        this.f10762g = i10;
        this.f10763h = i11;
        Resources resources = context.getResources();
        this.f10761f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.a.e.f286122x));
        this.f10768m = view;
        this.f10764i = new u0(context, null, i10, i11);
        gVar.c(this, context);
    }

    private boolean C() {
        View view;
        if (d()) {
            return true;
        }
        if (!this.f10772t && (view = this.f10768m) != null) {
            this.f10769n = view;
            this.f10764i.e0(this);
            this.f10764i.f0(this);
            this.f10764i.d0(true);
            View view2 = this.f10769n;
            boolean z10 = this.f10771s == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f10771s = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f10765j);
            }
            view2.addOnAttachStateChangeListener(this.f10766k);
            this.f10764i.S(view2);
            this.f10764i.W(this.X);
            if (!this.f10773v) {
                this.f10774w = l.r(this.f10759d, null, this.f10757b, this.f10761f);
                this.f10773v = true;
            }
            this.f10764i.U(this.f10774w);
            this.f10764i.a0(2);
            this.f10764i.X(q());
            this.f10764i.a();
            ListView listViewK = this.f10764i.k();
            listViewK.setOnKeyListener(this);
            if (this.Y && this.f10758c.A() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f10757b).inflate(i.a.j.f286261s, (ViewGroup) listViewK, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(this.f10758c.A());
                }
                frameLayout.setEnabled(false);
                listViewK.addHeaderView(frameLayout, null, false);
            }
            this.f10764i.q(this.f10759d);
            this.f10764i.a();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z10) {
        if (gVar != this.f10758c) {
            return;
        }
        dismiss();
        n.a aVar = this.f10770o;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean d() {
        return !this.f10772t && this.f10764i.d();
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        if (d()) {
            this.f10764i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable e() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.n
    public void f(boolean z10) {
        this.f10773v = false;
        f fVar = this.f10759d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(n.a aVar) {
        this.f10770o = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView k() {
        return this.f10764i.k();
    }

    @Override // androidx.appcompat.view.menu.n
    public void l(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean m(s sVar) {
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f10757b, sVar, this.f10769n, this.f10760e, this.f10762g, this.f10763h);
            mVar.a(this.f10770o);
            mVar.i(l.A(sVar));
            mVar.k(this.f10767l);
            this.f10767l = null;
            this.f10758c.f(false);
            int iL = this.f10764i.l();
            int i10 = this.f10764i.i();
            if ((Gravity.getAbsoluteGravity(this.X, this.f10768m.getLayoutDirection()) & 7) == 5) {
                iL += this.f10768m.getWidth();
            }
            if (mVar.p(iL, i10)) {
                n.a aVar = this.f10770o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(sVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void o(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f10772t = true;
        this.f10758c.close();
        ViewTreeObserver viewTreeObserver = this.f10771s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f10771s = this.f10769n.getViewTreeObserver();
            }
            this.f10771s.removeGlobalOnLayoutListener(this.f10765j);
            this.f10771s = null;
        }
        this.f10769n.removeOnAttachStateChangeListener(this.f10766k);
        PopupWindow.OnDismissListener onDismissListener = this.f10767l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.l
    public void s(View view) {
        this.f10768m = view;
    }

    @Override // androidx.appcompat.view.menu.l
    public void u(boolean z10) {
        this.f10759d.e(z10);
    }

    @Override // androidx.appcompat.view.menu.l
    public void v(int i10) {
        this.X = i10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void w(int i10) {
        this.f10764i.m(i10);
    }

    @Override // androidx.appcompat.view.menu.l
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f10767l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void y(boolean z10) {
        this.Y = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void z(int i10) {
        this.f10764i.f(i10);
    }
}
