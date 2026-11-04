package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class j extends d0 {
    private static TimeInterpolator A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final boolean f74274z = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<RecyclerView.g0> f74275o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList<RecyclerView.g0> f74276p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<C0731j> f74277q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<i> f74278r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.g0>> f74279s = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ArrayList<ArrayList<C0731j>> f74280t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ArrayList<ArrayList<i>> f74281u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ArrayList<RecyclerView.g0> f74282v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ArrayList<RecyclerView.g0> f74283w = new ArrayList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList<RecyclerView.g0> f74284x = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ArrayList<RecyclerView.g0> f74285y = new ArrayList<>();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f74286a;

        a(ArrayList arrayList) {
            this.f74286a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C0731j c0731j : this.f74286a) {
                j.this.b0(c0731j.f74320a, c0731j.f74321b, c0731j.f74322c, c0731j.f74323d, c0731j.f74324e);
            }
            this.f74286a.clear();
            j.this.f74280t.remove(this.f74286a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f74288a;

        b(ArrayList arrayList) {
            this.f74288a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f74288a.iterator();
            while (it.hasNext()) {
                j.this.a0((i) it.next());
            }
            this.f74288a.clear();
            j.this.f74281u.remove(this.f74288a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f74290a;

        c(ArrayList arrayList) {
            this.f74290a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f74290a.iterator();
            while (it.hasNext()) {
                j.this.Z((RecyclerView.g0) it.next());
            }
            this.f74290a.clear();
            j.this.f74279s.remove(this.f74290a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f74292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f74293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f74294c;

        d(RecyclerView.g0 g0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f74292a = g0Var;
            this.f74293b = viewPropertyAnimator;
            this.f74294c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f74293b.setListener(null);
            this.f74294c.setAlpha(1.0f);
            j.this.N(this.f74292a);
            j.this.f74284x.remove(this.f74292a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.O(this.f74292a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f74296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f74297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f74298c;

        e(RecyclerView.g0 g0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f74296a = g0Var;
            this.f74297b = view;
            this.f74298c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f74297b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f74298c.setListener(null);
            j.this.H(this.f74296a);
            j.this.f74282v.remove(this.f74296a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.I(this.f74296a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f74300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f74301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f74302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f74303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f74304e;

        f(RecyclerView.g0 g0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f74300a = g0Var;
            this.f74301b = i10;
            this.f74302c = view;
            this.f74303d = i11;
            this.f74304e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f74301b != 0) {
                this.f74302c.setTranslationX(0.0f);
            }
            if (this.f74303d != 0) {
                this.f74302c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f74304e.setListener(null);
            j.this.L(this.f74300a);
            j.this.f74283w.remove(this.f74300a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.M(this.f74300a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f74306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f74307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f74308c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f74306a = iVar;
            this.f74307b = viewPropertyAnimator;
            this.f74308c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f74307b.setListener(null);
            this.f74308c.setAlpha(1.0f);
            this.f74308c.setTranslationX(0.0f);
            this.f74308c.setTranslationY(0.0f);
            j.this.J(this.f74306a.f74314a, true);
            j.this.f74285y.remove(this.f74306a.f74314a);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.K(this.f74306a.f74314a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f74310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f74311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f74312c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f74310a = iVar;
            this.f74311b = viewPropertyAnimator;
            this.f74312c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f74311b.setListener(null);
            this.f74312c.setAlpha(1.0f);
            this.f74312c.setTranslationX(0.0f);
            this.f74312c.setTranslationY(0.0f);
            j.this.J(this.f74310a.f74315b, false);
            j.this.f74285y.remove(this.f74310a.f74315b);
            j.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.K(this.f74310a.f74315b, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$j, reason: collision with other inner class name */
    private static class C0731j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f74320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74324e;

        C0731j(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
            this.f74320a = g0Var;
            this.f74321b = i10;
            this.f74322c = i11;
            this.f74323d = i12;
            this.f74324e = i13;
        }
    }

    private void c0(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f74284x.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(p()).alpha(0.0f).setListener(new d(g0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void f0(List<i> list, RecyclerView.g0 g0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, g0Var) && iVar.f74314a == null && iVar.f74315b == null) {
                list.remove(iVar);
            }
        }
    }

    private void g0(i iVar) {
        RecyclerView.g0 g0Var = iVar.f74314a;
        if (g0Var != null) {
            h0(iVar, g0Var);
        }
        RecyclerView.g0 g0Var2 = iVar.f74315b;
        if (g0Var2 != null) {
            h0(iVar, g0Var2);
        }
    }

    private boolean h0(i iVar, RecyclerView.g0 g0Var) {
        boolean z10 = false;
        if (iVar.f74315b == g0Var) {
            iVar.f74315b = null;
        } else {
            if (iVar.f74314a != g0Var) {
                return false;
            }
            iVar.f74314a = null;
            z10 = true;
        }
        g0Var.itemView.setAlpha(1.0f);
        g0Var.itemView.setTranslationX(0.0f);
        g0Var.itemView.setTranslationY(0.0f);
        J(g0Var, z10);
        return true;
    }

    private void i0(RecyclerView.g0 g0Var) {
        if (A == null) {
            A = new ValueAnimator().getInterpolator();
        }
        g0Var.itemView.animate().setInterpolator(A);
        k(g0Var);
    }

    @Override // androidx.recyclerview.widget.d0
    @e.a({"UnknownNullness"})
    public boolean D(RecyclerView.g0 g0Var) {
        i0(g0Var);
        g0Var.itemView.setAlpha(0.0f);
        this.f74276p.add(g0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    @e.a({"UnknownNullness"})
    public boolean E(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13) {
        if (g0Var == g0Var2) {
            return F(g0Var, i10, i11, i12, i13);
        }
        float translationX = g0Var.itemView.getTranslationX();
        float translationY = g0Var.itemView.getTranslationY();
        float alpha = g0Var.itemView.getAlpha();
        i0(g0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        g0Var.itemView.setTranslationX(translationX);
        g0Var.itemView.setTranslationY(translationY);
        g0Var.itemView.setAlpha(alpha);
        if (g0Var2 != null) {
            i0(g0Var2);
            g0Var2.itemView.setTranslationX(-i14);
            g0Var2.itemView.setTranslationY(-i15);
            g0Var2.itemView.setAlpha(0.0f);
        }
        this.f74278r.add(new i(g0Var, g0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    @e.a({"UnknownNullness"})
    public boolean F(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
        View view = g0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) g0Var.itemView.getTranslationY());
        i0(g0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            L(g0Var);
            int i16 = 6 ^ 0;
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f74277q.add(new C0731j(g0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    @e.a({"UnknownNullness"})
    public boolean G(RecyclerView.g0 g0Var) {
        i0(g0Var);
        this.f74275o.add(g0Var);
        return true;
    }

    void Z(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f74282v.add(g0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m()).setListener(new e(g0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void a0(i iVar) {
        RecyclerView.g0 g0Var = iVar.f74314a;
        View view = g0Var == null ? null : g0Var.itemView;
        RecyclerView.g0 g0Var2 = iVar.f74315b;
        View view2 = g0Var2 != null ? g0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.f74285y.add(iVar.f74314a);
            duration.translationX(iVar.f74318e - iVar.f74316c);
            duration.translationY(iVar.f74319f - iVar.f74317d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f74285y.add(iVar.f74315b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void b0(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
        View view = g0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f74283w.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).setListener(new f(g0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void d0(List<RecyclerView.g0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void e0() {
        if (q()) {
            return;
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(@NonNull RecyclerView.g0 g0Var, @NonNull List<Object> list) {
        if (list.isEmpty() && !super.g(g0Var, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @e.a({"UnknownNullness"})
    public void k(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        view.animate().cancel();
        int size = this.f74277q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f74277q.get(size).f74320a == g0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(g0Var);
                this.f74277q.remove(size);
            }
        }
        f0(this.f74278r, g0Var);
        if (this.f74275o.remove(g0Var)) {
            view.setAlpha(1.0f);
            N(g0Var);
        }
        if (this.f74276p.remove(g0Var)) {
            view.setAlpha(1.0f);
            H(g0Var);
        }
        for (int size2 = this.f74281u.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f74281u.get(size2);
            f0(arrayList, g0Var);
            if (arrayList.isEmpty()) {
                this.f74281u.remove(size2);
            }
        }
        for (int size3 = this.f74280t.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0731j> arrayList2 = this.f74280t.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f74320a == g0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(g0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f74280t.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f74279s.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.g0> arrayList3 = this.f74279s.get(size5);
            if (arrayList3.remove(g0Var)) {
                view.setAlpha(1.0f);
                H(g0Var);
                if (arrayList3.isEmpty()) {
                    this.f74279s.remove(size5);
                }
            }
        }
        this.f74284x.remove(g0Var);
        this.f74282v.remove(g0Var);
        this.f74285y.remove(g0Var);
        this.f74283w.remove(g0Var);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l() {
        for (int size = this.f74277q.size() - 1; size >= 0; size--) {
            C0731j c0731j = this.f74277q.get(size);
            View view = c0731j.f74320a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(c0731j.f74320a);
            this.f74277q.remove(size);
        }
        int size2 = this.f74275o.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            N(this.f74275o.get(size2));
            this.f74275o.remove(size2);
        }
        int size3 = this.f74276p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.g0 g0Var = this.f74276p.get(size3);
            g0Var.itemView.setAlpha(1.0f);
            H(g0Var);
            this.f74276p.remove(size3);
        }
        for (int size4 = this.f74278r.size() - 1; size4 >= 0; size4--) {
            g0(this.f74278r.get(size4));
        }
        this.f74278r.clear();
        if (!q()) {
            return;
        }
        for (int size5 = this.f74280t.size() - 1; size5 >= 0; size5--) {
            ArrayList<C0731j> arrayList = this.f74280t.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                C0731j c0731j2 = arrayList.get(size6);
                View view2 = c0731j2.f74320a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                L(c0731j2.f74320a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f74280t.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f74279s.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.g0> arrayList2 = this.f74279s.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.g0 g0Var2 = arrayList2.get(size8);
                g0Var2.itemView.setAlpha(1.0f);
                H(g0Var2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f74279s.remove(arrayList2);
                }
            }
        }
        int size9 = this.f74281u.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                d0(this.f74284x);
                d0(this.f74283w);
                d0(this.f74282v);
                d0(this.f74285y);
                j();
                return;
            }
            ArrayList<i> arrayList3 = this.f74281u.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    g0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f74281u.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean q() {
        return (this.f74276p.isEmpty() && this.f74278r.isEmpty() && this.f74277q.isEmpty() && this.f74275o.isEmpty() && this.f74283w.isEmpty() && this.f74284x.isEmpty() && this.f74282v.isEmpty() && this.f74285y.isEmpty() && this.f74280t.isEmpty() && this.f74279s.isEmpty() && this.f74281u.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void x() {
        boolean zIsEmpty = this.f74275o.isEmpty();
        boolean zIsEmpty2 = this.f74277q.isEmpty();
        boolean zIsEmpty3 = this.f74278r.isEmpty();
        boolean zIsEmpty4 = this.f74276p.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.g0> it = this.f74275o.iterator();
        while (it.hasNext()) {
            c0(it.next());
        }
        this.f74275o.clear();
        if (!zIsEmpty2) {
            ArrayList<C0731j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f74277q);
            this.f74280t.add(arrayList);
            this.f74277q.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                u1.v1(arrayList.get(0).f74320a.itemView, aVar, p());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f74278r);
            this.f74281u.add(arrayList2);
            this.f74278r.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                u1.v1(arrayList2.get(0).f74314a.itemView, bVar, p());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.g0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f74276p);
        this.f74279s.add(arrayList3);
        this.f74276p.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
            return;
        }
        u1.v1(arrayList3.get(0).itemView, cVar, (!zIsEmpty ? p() : 0L) + Math.max(!zIsEmpty2 ? o() : 0L, zIsEmpty3 ? 0L : n()));
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f74314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.g0 f74315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f74319f;

        private i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2) {
            this.f74314a = g0Var;
            this.f74315b = g0Var2;
        }

        @e.a({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f74314a + ", newHolder=" + this.f74315b + ", fromX=" + this.f74316c + ", fromY=" + this.f74317d + ", toX=" + this.f74318e + ", toY=" + this.f74319f + AbstractJsonLexerKt.END_OBJ;
        }

        i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13) {
            this(g0Var, g0Var2);
            this.f74316c = i10;
            this.f74317d = i11;
            this.f74318e = i12;
            this.f74319f = i13;
        }
    }
}
