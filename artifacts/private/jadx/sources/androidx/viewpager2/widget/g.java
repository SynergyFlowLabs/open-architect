package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class g extends RecyclerView.u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f76236n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f76237o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f76238p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f76239q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f76240r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f76241s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewPager2.j f76242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final ViewPager2 f76243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final RecyclerView f76244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final LinearLayoutManager f76245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f76246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f76247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f76248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f76249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f76250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f76251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f76252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f76253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f76254m;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f76255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f76256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f76257c;

        a() {
        }

        void a() {
            this.f76255a = -1;
            this.f76256b = 0.0f;
            this.f76257c = 0;
        }
    }

    g(@NonNull ViewPager2 viewPager2) {
        this.f76243b = viewPager2;
        RecyclerView recyclerView = viewPager2.f76190j;
        this.f76244c = recyclerView;
        this.f76245d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f76248g = new a();
        q();
    }

    private void c(int i10, float f10, int i11) {
        ViewPager2.j jVar = this.f76242a;
        if (jVar != null) {
            jVar.b(i10, f10, i11);
        }
    }

    private void d(int i10) {
        ViewPager2.j jVar = this.f76242a;
        if (jVar != null) {
            jVar.c(i10);
        }
    }

    private void e(int i10) {
        int i11 = 1 | 3;
        if ((this.f76246e == 3 && this.f76247f == 0) || this.f76247f == i10) {
            return;
        }
        this.f76247f = i10;
        ViewPager2.j jVar = this.f76242a;
        if (jVar != null) {
            jVar.a(i10);
        }
    }

    private int f() {
        return this.f76245d.B2();
    }

    private boolean l() {
        int i10 = this.f76246e;
        return i10 == 1 || i10 == 4;
    }

    private void q() {
        this.f76246e = 0;
        this.f76247f = 0;
        this.f76248g.a();
        this.f76249h = -1;
        this.f76250i = -1;
        this.f76251j = false;
        this.f76252k = false;
        this.f76254m = false;
        this.f76253l = false;
    }

    private void s(boolean z10) {
        this.f76254m = z10;
        this.f76246e = z10 ? 4 : 1;
        int i10 = this.f76250i;
        if (i10 != -1) {
            this.f76249h = i10;
            this.f76250i = -1;
        } else if (this.f76249h == -1) {
            this.f76249h = f();
        }
        e(1);
    }

    private void t() {
        int top;
        a aVar = this.f76248g;
        int iB2 = this.f76245d.B2();
        aVar.f76255a = iB2;
        if (iB2 == -1) {
            aVar.a();
            return;
        }
        View viewO = this.f76245d.O(iB2);
        if (viewO == null) {
            aVar.a();
            return;
        }
        int iN0 = this.f76245d.n0(viewO);
        int iY0 = this.f76245d.y0(viewO);
        int iB0 = this.f76245d.B0(viewO);
        int iT = this.f76245d.T(viewO);
        ViewGroup.LayoutParams layoutParams = viewO.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iN0 += marginLayoutParams.leftMargin;
            iY0 += marginLayoutParams.rightMargin;
            iB0 += marginLayoutParams.topMargin;
            iT += marginLayoutParams.bottomMargin;
        }
        int height = viewO.getHeight() + iB0 + iT;
        int width = viewO.getWidth() + iN0 + iY0;
        if (this.f76245d.Q2() == 0) {
            top = (viewO.getLeft() - iN0) - this.f76244c.getPaddingLeft();
            if (this.f76243b.l()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewO.getTop() - iB0) - this.f76244c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f76257c = i10;
        if (i10 >= 0) {
            aVar.f76256b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f76245d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f76257c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(@NonNull RecyclerView recyclerView, int i10) {
        if (!(this.f76246e == 1 && this.f76247f == 1) && i10 == 1) {
            s(false);
            return;
        }
        if (l() && i10 == 2) {
            if (this.f76252k) {
                e(2);
                this.f76251j = true;
                return;
            }
            return;
        }
        if (l() && i10 == 0) {
            t();
            if (this.f76252k) {
                a aVar = this.f76248g;
                if (aVar.f76257c == 0) {
                    int i11 = this.f76249h;
                    int i12 = aVar.f76255a;
                    if (i11 != i12) {
                        d(i12);
                    }
                }
            } else {
                int i13 = this.f76248g.f76255a;
                if (i13 != -1) {
                    boolean z10 = true;
                    c(i13, 0.0f, 0);
                }
            }
            e(0);
            q();
        }
        if (this.f76246e == 2 && i10 == 0 && this.f76253l) {
            t();
            a aVar2 = this.f76248g;
            if (aVar2.f76257c == 0) {
                int i14 = this.f76250i;
                int i15 = aVar2.f76255a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    d(i15);
                }
                e(0);
                q();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
        a aVar;
        int i12;
        this.f76252k = true;
        t();
        if (this.f76251j) {
            this.f76251j = false;
            if (i11 > 0) {
                aVar = this.f76248g;
                if (aVar.f76257c != 0) {
                    i12 = aVar.f76255a + 1;
                } else {
                    i12 = this.f76248g.f76255a;
                }
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.f76243b.l()) {
                        aVar = this.f76248g;
                        if (aVar.f76257c != 0) {
                            i12 = aVar.f76255a + 1;
                        }
                    }
                }
                i12 = this.f76248g.f76255a;
            }
            this.f76250i = i12;
            if (this.f76249h != i12) {
                d(i12);
            }
        } else if (this.f76246e == 0) {
            int i13 = this.f76248g.f76255a;
            if (i13 == -1) {
                i13 = 0;
            }
            d(i13);
        }
        a aVar2 = this.f76248g;
        int i14 = aVar2.f76255a;
        if (i14 == -1) {
            i14 = 0;
        }
        c(i14, aVar2.f76256b, aVar2.f76257c);
        a aVar3 = this.f76248g;
        int i15 = aVar3.f76255a;
        int i16 = this.f76250i;
        if ((i15 == i16 || i16 == -1) && aVar3.f76257c == 0 && this.f76247f != 1) {
            e(0);
            q();
        }
    }

    double g() {
        t();
        a aVar = this.f76248g;
        return ((double) aVar.f76255a) + ((double) aVar.f76256b);
    }

    int h() {
        return this.f76247f;
    }

    boolean i() {
        return this.f76247f == 1;
    }

    boolean j() {
        return this.f76254m;
    }

    boolean k() {
        return this.f76247f == 0;
    }

    void m() {
        this.f76246e = 4;
        s(true);
    }

    void n() {
        this.f76253l = true;
    }

    void o() {
        if (!i() || this.f76254m) {
            this.f76254m = false;
            t();
            a aVar = this.f76248g;
            if (aVar.f76257c != 0) {
                e(2);
                return;
            }
            int i10 = aVar.f76255a;
            if (i10 != this.f76249h) {
                d(i10);
            }
            e(0);
            q();
        }
    }

    void p(int i10, boolean z10) {
        this.f76246e = z10 ? 2 : 3;
        this.f76254m = false;
        boolean z11 = this.f76250i != i10;
        this.f76250i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    void r(ViewPager2.j jVar) {
        this.f76242a = jVar;
    }
}
