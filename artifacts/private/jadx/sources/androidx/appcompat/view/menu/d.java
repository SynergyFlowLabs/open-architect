package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.u0;
import androidx.core.view.d0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f10639h3 = i.a.j.f286254l;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    static final int f10640i3 = 0;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    static final int f10641j3 = 1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    static final int f10642k3 = 200;
    ViewTreeObserver H1;
    private int X;
    private int Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f10647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f10648g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    boolean f10649g3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f10657o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f10658p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private n.a f10659p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10660p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    View f10661s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10664w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<g> f10650h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List<C0033d> f10651i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f10652j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f10653k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t0 f10654l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10655m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10656n = 0;
    private boolean Z = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10662t = G();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.d() || d.this.f10651i.size() <= 0 || d.this.f10651i.get(0).f10672a.L()) {
                return;
            }
            View view = d.this.f10661s;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0033d> it = d.this.f10651i.iterator();
            while (it.hasNext()) {
                it.next().f10672a.a();
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
            ViewTreeObserver viewTreeObserver = d.this.H1;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.H1 = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.H1.removeGlobalOnLayoutListener(dVar.f10652j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements t0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0033d f10668a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f10669b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f10670c;

            a(C0033d c0033d, MenuItem menuItem, g gVar) {
                this.f10668a = c0033d;
                this.f10669b = menuItem;
                this.f10670c = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0033d c0033d = this.f10668a;
                if (c0033d != null) {
                    d.this.f10649g3 = true;
                    c0033d.f10673b.f(false);
                    d.this.f10649g3 = false;
                }
                if (this.f10669b.isEnabled() && this.f10669b.hasSubMenu()) {
                    this.f10670c.P(this.f10669b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.t0
        public void e(@NonNull g gVar, @NonNull MenuItem menuItem) {
            d.this.f10648g.removeCallbacksAndMessages(null);
            int size = d.this.f10651i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (gVar == d.this.f10651i.get(i10).f10673b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            d.this.f10648g.postAtTime(new a(i11 < d.this.f10651i.size() ? d.this.f10651i.get(i11) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.t0
        public void j(@NonNull g gVar, @NonNull MenuItem menuItem) {
            d.this.f10648g.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0033d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f10672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f10673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10674c;

        public C0033d(@NonNull u0 u0Var, @NonNull g gVar, int i10) {
            this.f10672a = u0Var;
            this.f10673b = gVar;
            this.f10674c = i10;
        }

        public ListView a() {
            return this.f10672a.k();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public d(@NonNull Context context, @NonNull View view, @androidx.annotation.f int i10, @g1 int i11, boolean z10) {
        this.f10643b = context;
        this.f10657o = view;
        this.f10645d = i10;
        this.f10646e = i11;
        this.f10647f = z10;
        Resources resources = context.getResources();
        this.f10644c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.a.e.f286122x));
        this.f10648g = new Handler();
    }

    private u0 C() {
        u0 u0Var = new u0(this.f10643b, null, this.f10645d, this.f10646e);
        u0Var.r0(this.f10654l);
        u0Var.f0(this);
        u0Var.e0(this);
        u0Var.S(this.f10657o);
        u0Var.W(this.f10656n);
        int i10 = 5 ^ 1;
        u0Var.d0(true);
        u0Var.a0(2);
        return u0Var;
    }

    private int D(@NonNull g gVar) {
        int size = this.f10651i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == this.f10651i.get(i10).f10673b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem E(@NonNull g gVar, @NonNull g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @p0
    private View F(@NonNull C0033d c0033d, @NonNull g gVar) {
        f fVar;
        int headersCount;
        MenuItem menuItemE = E(c0033d.f10673b, gVar);
        if (menuItemE == null) {
            return null;
        }
        ListView listViewA = c0033d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemE == fVar.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return null;
        }
        int firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition();
        if (firstVisiblePosition >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int G() {
        return this.f10657o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int H(int i10) {
        List<C0033d> list = this.f10651i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f10661s.getWindowVisibleDisplayFrame(rect);
        if (this.f10662t == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void I(@NonNull g gVar) {
        C0033d c0033d;
        View viewF;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f10643b);
        f fVar = new f(gVar, layoutInflaterFrom, this.f10647f, f10639h3);
        if (!d() && this.Z) {
            fVar.e(true);
        } else if (d()) {
            fVar.e(l.A(gVar));
        }
        int iR = l.r(fVar, null, this.f10643b, this.f10644c);
        u0 u0VarC = C();
        u0VarC.q(fVar);
        u0VarC.U(iR);
        u0VarC.W(this.f10656n);
        if (this.f10651i.size() > 0) {
            List<C0033d> list = this.f10651i;
            c0033d = list.get(list.size() - 1);
            viewF = F(c0033d, gVar);
        } else {
            c0033d = null;
            viewF = null;
        }
        if (viewF != null) {
            u0VarC.s0(false);
            u0VarC.p0(null);
            int iH = H(iR);
            boolean z10 = iH == 1;
            this.f10662t = iH;
            u0VarC.S(viewF);
            if ((this.f10656n & 5) != 5) {
                iR = z10 ? viewF.getWidth() : 0 - iR;
            } else if (!z10) {
                iR = 0 - viewF.getWidth();
            }
            u0VarC.m(iR);
            u0VarC.h0(true);
            u0VarC.f(0);
        } else {
            if (this.f10663v) {
                u0VarC.m(this.X);
            }
            if (this.f10664w) {
                u0VarC.f(this.Y);
            }
            u0VarC.X(q());
        }
        this.f10651i.add(new C0033d(u0VarC, gVar, this.f10662t));
        u0VarC.a();
        ListView listViewK = u0VarC.k();
        listViewK.setOnKeyListener(this);
        if (c0033d == null && this.f10658p0 && gVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(i.a.j.f286261s, (ViewGroup) listViewK, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.A());
            listViewK.addHeaderView(frameLayout, null, false);
            u0VarC.a();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        if (d()) {
            return;
        }
        Iterator<g> it = this.f10650h.iterator();
        while (it.hasNext()) {
            I(it.next());
        }
        this.f10650h.clear();
        View view = this.f10657o;
        this.f10661s = view;
        if (view != null) {
            boolean z10 = this.H1 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.H1 = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f10652j);
            }
            this.f10661s.addOnAttachStateChangeListener(this.f10653k);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z10) {
        int iD = D(gVar);
        if (iD < 0) {
            return;
        }
        int i10 = iD + 1;
        if (i10 < this.f10651i.size()) {
            this.f10651i.get(i10).f10673b.f(false);
        }
        C0033d c0033dRemove = this.f10651i.remove(iD);
        c0033dRemove.f10673b.T(this);
        if (this.f10649g3) {
            c0033dRemove.f10672a.q0(null);
            c0033dRemove.f10672a.T(0);
        }
        c0033dRemove.f10672a.dismiss();
        int size = this.f10651i.size();
        if (size > 0) {
            this.f10662t = this.f10651i.get(size - 1).f10674c;
        } else {
            this.f10662t = G();
        }
        if (size != 0) {
            if (z10) {
                this.f10651i.get(0).f10673b.f(false);
                return;
            }
            return;
        }
        dismiss();
        n.a aVar = this.f10659p1;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.H1;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.H1.removeGlobalOnLayoutListener(this.f10652j);
            }
            this.H1 = null;
        }
        this.f10661s.removeOnAttachStateChangeListener(this.f10653k);
        this.f10660p2.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean d() {
        return this.f10651i.size() > 0 && this.f10651i.get(0).f10672a.d();
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.f10651i.size();
        if (size > 0) {
            C0033d[] c0033dArr = (C0033d[]) this.f10651i.toArray(new C0033d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0033d c0033d = c0033dArr[i10];
                if (c0033d.f10672a.d()) {
                    c0033d.f10672a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable e() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.n
    public void f(boolean z10) {
        Iterator<C0033d> it = this.f10651i.iterator();
        while (it.hasNext()) {
            l.B(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(n.a aVar) {
        this.f10659p1 = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView k() {
        if (this.f10651i.isEmpty()) {
            return null;
        }
        List<C0033d> list = this.f10651i;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.n
    public void l(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean m(s sVar) {
        for (C0033d c0033d : this.f10651i) {
            if (sVar == c0033d.f10673b) {
                c0033d.a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        o(sVar);
        n.a aVar = this.f10659p1;
        if (aVar != null) {
            aVar.c(sVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.l
    public void o(g gVar) {
        gVar.c(this, this.f10643b);
        if (d()) {
            I(gVar);
        } else {
            this.f10650h.add(gVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0033d c0033d;
        int size = this.f10651i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0033d = null;
                break;
            }
            c0033d = this.f10651i.get(i10);
            if (!c0033d.f10672a.d()) {
                break;
            } else {
                i10++;
            }
        }
        if (c0033d != null) {
            c0033d.f10673b.f(false);
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
    protected boolean p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void s(@NonNull View view) {
        if (this.f10657o != view) {
            this.f10657o = view;
            this.f10656n = d0.d(this.f10655m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void u(boolean z10) {
        this.Z = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void v(int i10) {
        if (this.f10655m != i10) {
            this.f10655m = i10;
            this.f10656n = d0.d(i10, this.f10657o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void w(int i10) {
        this.f10663v = true;
        this.X = i10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f10660p2 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void y(boolean z10) {
        this.f10658p0 = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void z(int i10) {
        this.f10664w = true;
        this.Y = i10;
    }
}
