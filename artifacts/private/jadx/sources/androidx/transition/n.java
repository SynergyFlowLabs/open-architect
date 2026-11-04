package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class n extends androidx.fragment.app.x0 {

    class a extends g0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f75716a;

        a(Rect rect) {
            this.f75716a = rect;
        }

        @Override // androidx.transition.g0.f
        public Rect a(@NonNull g0 g0Var) {
            return this.f75716a;
        }
    }

    class b implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f75718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f75719b;

        b(View view, ArrayList arrayList) {
            this.f75718a = view;
            this.f75719b = arrayList;
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
            g0Var.u0(this);
            g0Var.c(this);
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            g0Var.u0(this);
            this.f75718a.setVisibility(8);
            int size = this.f75719b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f75719b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
        }
    }

    class c extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f75721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f75722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f75723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f75724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f75725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f75726f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f75721a = obj;
            this.f75722b = arrayList;
            this.f75723c = obj2;
            this.f75724d = arrayList2;
            this.f75725e = obj3;
            this.f75726f = arrayList3;
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
            Object obj = this.f75721a;
            if (obj != null) {
                n.this.s(obj, this.f75722b, null);
            }
            Object obj2 = this.f75723c;
            if (obj2 != null) {
                n.this.s(obj2, this.f75724d, null);
            }
            Object obj3 = this.f75725e;
            if (obj3 != null) {
                n.this.s(obj3, this.f75726f, null);
            }
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            g0Var.u0(this);
        }
    }

    class d implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f75728a;

        d(Runnable runnable) {
            this.f75728a = runnable;
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            this.f75728a.run();
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
        }
    }

    class e extends g0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f75730a;

        e(Rect rect) {
            this.f75730a = rect;
        }

        @Override // androidx.transition.g0.f
        public Rect a(@NonNull g0 g0Var) {
            Rect rect = this.f75730a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f75730a;
        }
    }

    public static /* synthetic */ void E(Runnable runnable, g0 g0Var, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            g0Var.cancel();
            runnable2.run();
        }
    }

    private static boolean F(g0 g0Var) {
        return (androidx.fragment.app.x0.l(g0Var.W()) && androidx.fragment.app.x0.l(g0Var.X()) && androidx.fragment.app.x0.l(g0Var.Y())) ? false : true;
    }

    @Override // androidx.fragment.app.x0
    public void B(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        s0 s0Var = (s0) obj;
        List<View> listZ = s0Var.Z();
        listZ.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.x0.f(listZ, arrayList.get(i10));
        }
        listZ.add(view);
        arrayList.add(view);
        b(s0Var, arrayList);
    }

    @Override // androidx.fragment.app.x0
    public void C(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 ArrayList<View> arrayList2) {
        s0 s0Var = (s0) obj;
        if (s0Var != null) {
            s0Var.Z().clear();
            s0Var.Z().addAll(arrayList2);
            s(s0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.x0
    @androidx.annotation.p0
    public Object D(@androidx.annotation.p0 Object obj) {
        if (obj == null) {
            return null;
        }
        s0 s0Var = new s0();
        s0Var.S0((g0) obj);
        return s0Var;
    }

    @Override // androidx.fragment.app.x0
    public void a(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((g0) obj).e(view);
        }
    }

    @Override // androidx.fragment.app.x0
    public void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        g0 g0Var = (g0) obj;
        if (g0Var == null) {
            return;
        }
        int i10 = 0;
        if (g0Var instanceof s0) {
            s0 s0Var = (s0) g0Var;
            int iW0 = s0Var.W0();
            while (i10 < iW0) {
                b(s0Var.V0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (F(g0Var) || !androidx.fragment.app.x0.l(g0Var.Z())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            g0Var.e(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.x0
    public void c(@NonNull Object obj) {
        ((r0) obj).f();
    }

    @Override // androidx.fragment.app.x0
    public void d(@NonNull Object obj, @NonNull Runnable runnable) {
        ((r0) obj).p(runnable);
    }

    @Override // androidx.fragment.app.x0
    public void e(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 Object obj) {
        p0.b(viewGroup, (g0) obj);
    }

    @Override // androidx.fragment.app.x0
    public boolean g(@NonNull Object obj) {
        return obj instanceof g0;
    }

    @Override // androidx.fragment.app.x0
    @androidx.annotation.p0
    public Object h(@androidx.annotation.p0 Object obj) {
        if (obj != null) {
            return ((g0) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.x0
    @androidx.annotation.p0
    public Object j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return p0.d(viewGroup, (g0) obj);
    }

    @Override // androidx.fragment.app.x0
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.x0
    public boolean n(@NonNull Object obj) {
        boolean zE0 = ((g0) obj).e0();
        if (!zE0) {
            Objects.toString(obj);
        }
        return zE0;
    }

    @Override // androidx.fragment.app.x0
    @androidx.annotation.p0
    public Object o(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3) {
        g0 g0VarG1 = (g0) obj;
        g0 g0Var = (g0) obj2;
        g0 g0Var2 = (g0) obj3;
        if (g0VarG1 != null && g0Var != null) {
            g0VarG1 = new s0().S0(g0VarG1).S0(g0Var).g1(1);
        } else if (g0VarG1 == null) {
            g0VarG1 = g0Var != null ? g0Var : null;
        }
        if (g0Var2 == null) {
            return g0VarG1;
        }
        s0 s0Var = new s0();
        if (g0VarG1 != null) {
            s0Var.S0(g0VarG1);
        }
        s0Var.S0(g0Var2);
        return s0Var;
    }

    @Override // androidx.fragment.app.x0
    @NonNull
    public Object p(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3) {
        s0 s0Var = new s0();
        if (obj != null) {
            s0Var.S0((g0) obj);
        }
        if (obj2 != null) {
            s0Var.S0((g0) obj2);
        }
        if (obj3 != null) {
            s0Var.S0((g0) obj3);
        }
        return s0Var;
    }

    @Override // androidx.fragment.app.x0
    public void r(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((g0) obj).w0(view);
        }
    }

    @Override // androidx.fragment.app.x0
    public void s(@NonNull Object obj, @e.a({"UnknownNullness"}) ArrayList<View> arrayList, @e.a({"UnknownNullness"}) ArrayList<View> arrayList2) {
        g0 g0Var = (g0) obj;
        int i10 = 0;
        if (g0Var instanceof s0) {
            s0 s0Var = (s0) g0Var;
            int iW0 = s0Var.W0();
            while (i10 < iW0) {
                s(s0Var.V0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (F(g0Var)) {
            return;
        }
        List<View> listZ = g0Var.Z();
        if (listZ.size() == arrayList.size() && listZ.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                g0Var.e(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                g0Var.w0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.x0
    public void t(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((g0) obj).c(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.x0
    public void u(@NonNull Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 Object obj3, @androidx.annotation.p0 ArrayList<View> arrayList2, @androidx.annotation.p0 Object obj4, @androidx.annotation.p0 ArrayList<View> arrayList3) {
        ((g0) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.x0
    public void v(@NonNull Object obj, float f10) {
        r0 r0Var = (r0) obj;
        if (r0Var.isReady()) {
            long jA = (long) (f10 * r0Var.a());
            if (jA == 0) {
                jA = 1;
            }
            if (jA == r0Var.a()) {
                jA = r0Var.a() - 1;
            }
            r0Var.l(jA);
        }
    }

    @Override // androidx.fragment.app.x0
    public void w(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((g0) obj).F0(new e(rect));
        }
    }

    @Override // androidx.fragment.app.x0
    public void x(@NonNull Object obj, @androidx.annotation.p0 View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((g0) obj).F0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.x0
    public void y(@NonNull Fragment fragment, @NonNull Object obj, @NonNull androidx.core.os.f fVar, @NonNull Runnable runnable) {
        z(fragment, obj, fVar, null, runnable);
    }

    @Override // androidx.fragment.app.x0
    public void z(@NonNull Fragment fragment, @NonNull Object obj, @NonNull androidx.core.os.f fVar, @androidx.annotation.p0 final Runnable runnable, @NonNull final Runnable runnable2) {
        final g0 g0Var = (g0) obj;
        fVar.d(new androidx.core.os.f.a() { // from class: androidx.transition.m
            @Override // androidx.core.os.f.a
            public final void onCancel() {
                n.E(runnable, g0Var, runnable2);
            }
        });
        g0Var.c(new d(runnable2));
    }
}
