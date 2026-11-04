package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f75737c = "TransitionManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static g0 f75738d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<g0>>>> f75739e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList<ViewGroup> f75740f = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.collection.a<c0, g0> f75741a = new androidx.collection.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.collection.a<c0, androidx.collection.a<c0, g0>> f75742b = new androidx.collection.a<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g0 f75743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f75744b;

        /* JADX INFO: renamed from: androidx.transition.p0$a$a, reason: collision with other inner class name */
        class C0762a extends o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f75745a;

            C0762a(androidx.collection.a aVar) {
                this.f75745a = aVar;
            }

            @Override // androidx.transition.o0, androidx.transition.g0.j
            public void o(@NonNull g0 g0Var) {
                ((ArrayList) this.f75745a.get(a.this.f75744b)).remove(g0Var);
                g0Var.u0(this);
            }
        }

        a(g0 g0Var, ViewGroup viewGroup) {
            this.f75743a = g0Var;
            this.f75744b = viewGroup;
        }

        private void a() {
            this.f75744b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f75744b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!p0.f75740f.remove(this.f75744b)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<g0>> aVarG = p0.g();
            ArrayList<g0> arrayList = aVarG.get(this.f75744b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarG.put(this.f75744b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f75743a);
            this.f75743a.c(new C0762a(aVarG));
            this.f75743a.q(this.f75744b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((g0) it.next()).z0(this.f75744b);
                }
            }
            this.f75743a.s0(this.f75744b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            p0.f75740f.remove(this.f75744b);
            ArrayList<g0> arrayList = p0.g().get(this.f75744b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<g0> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().z0(this.f75744b);
                }
            }
            this.f75743a.r(true);
        }
    }

    public static void a(@NonNull ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 g0 g0Var) {
        if (f75740f.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f75740f.add(viewGroup);
        if (g0Var == null) {
            g0Var = f75738d;
        }
        g0 g0VarClone = g0Var.clone();
        l(viewGroup, g0VarClone);
        c0.g(viewGroup, null);
        k(viewGroup, g0VarClone);
    }

    private static void c(c0 c0Var, g0 g0Var) {
        ViewGroup viewGroupE = c0Var.e();
        if (!f75740f.contains(viewGroupE)) {
            c0 c0VarC = c0.c(viewGroupE);
            if (g0Var == null) {
                if (c0VarC != null) {
                    c0VarC.b();
                }
                c0Var.a();
                return;
            }
            f75740f.add(viewGroupE);
            g0 g0VarClone = g0Var.clone();
            if (c0VarC != null && c0VarC.f()) {
                g0VarClone.C0(true);
            }
            l(viewGroupE, g0VarClone);
            c0Var.a();
            k(viewGroupE, g0VarClone);
        }
    }

    @androidx.annotation.p0
    public static r0 d(@NonNull ViewGroup viewGroup, @NonNull g0 g0Var) {
        if (f75740f.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!g0Var.e0()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f75740f.add(viewGroup);
        g0 g0VarClone = g0Var.clone();
        s0 s0Var = new s0();
        s0Var.S0(g0VarClone);
        l(viewGroup, s0Var);
        c0.g(viewGroup, null);
        k(viewGroup, s0Var);
        viewGroup.invalidate();
        return s0Var.v();
    }

    @androidx.annotation.p0
    public static r0 e(@NonNull c0 c0Var, @NonNull g0 g0Var) {
        ViewGroup viewGroupE = c0Var.e();
        if (!g0Var.e0()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        if (f75740f.contains(viewGroupE)) {
            return null;
        }
        c0 c0VarC = c0.c(viewGroupE);
        if (!viewGroupE.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            if (c0VarC != null) {
                c0VarC.b();
            }
            c0Var.a();
            return null;
        }
        f75740f.add(viewGroupE);
        g0 g0VarClone = g0Var.clone();
        s0 s0Var = new s0();
        s0Var.S0(g0VarClone);
        if (c0VarC != null && c0VarC.f()) {
            s0Var.C0(true);
        }
        l(viewGroupE, s0Var);
        c0Var.a();
        k(viewGroupE, s0Var);
        return s0Var.v();
    }

    public static void f(@androidx.annotation.p0 ViewGroup viewGroup) {
        f75740f.remove(viewGroup);
        ArrayList<g0> arrayList = g().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((g0) arrayList2.get(size)).J(viewGroup);
        }
    }

    @l1
    static androidx.collection.a<ViewGroup, ArrayList<g0>> g() {
        androidx.collection.a<ViewGroup, ArrayList<g0>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<g0>>> weakReference = f75739e.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<g0>> aVar2 = new androidx.collection.a<>();
        f75739e.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private g0 h(c0 c0Var) {
        androidx.collection.a<c0, g0> aVar;
        g0 g0Var;
        c0 c0VarC = c0.c(c0Var.e());
        if (c0VarC != null && (aVar = this.f75742b.get(c0Var)) != null && (g0Var = aVar.get(c0VarC)) != null) {
            return g0Var;
        }
        g0 g0Var2 = this.f75741a.get(c0Var);
        return g0Var2 != null ? g0Var2 : f75738d;
    }

    public static void i(@NonNull c0 c0Var) {
        c(c0Var, f75738d);
    }

    public static void j(@NonNull c0 c0Var, @androidx.annotation.p0 g0 g0Var) {
        c(c0Var, g0Var);
    }

    private static void k(ViewGroup viewGroup, g0 g0Var) {
        if (g0Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(g0Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void l(ViewGroup viewGroup, g0 g0Var) {
        ArrayList<g0> arrayList = g().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<g0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().r0(viewGroup);
            }
        }
        if (g0Var != null) {
            g0Var.q(viewGroup, true);
        }
        c0 c0VarC = c0.c(viewGroup);
        if (c0VarC != null) {
            c0VarC.b();
        }
    }

    public void m(@NonNull c0 c0Var, @NonNull c0 c0Var2, @androidx.annotation.p0 g0 g0Var) {
        androidx.collection.a<c0, g0> aVar = this.f75742b.get(c0Var2);
        if (aVar == null) {
            aVar = new androidx.collection.a<>();
            this.f75742b.put(c0Var2, aVar);
        }
        aVar.put(c0Var, g0Var);
    }

    public void n(@NonNull c0 c0Var, @androidx.annotation.p0 g0 g0Var) {
        this.f75741a.put(c0Var, g0Var);
    }

    public void o(@NonNull c0 c0Var) {
        c(c0Var, h(c0Var));
    }
}
