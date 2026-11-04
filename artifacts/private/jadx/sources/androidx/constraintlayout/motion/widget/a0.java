package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f45099a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashSet<View> f45101c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<z.b> f45103e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<z> f45100b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45102d = "ViewTransitionController";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<z.b> f45104f = new ArrayList<>();

    class a implements androidx.constraintlayout.widget.l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f45105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f45106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f45107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45108d;

        a(z zVar, int i10, boolean z10, int i11) {
            this.f45105a = zVar;
            this.f45106b = i10;
            this.f45107c = z10;
            this.f45108d = i11;
        }

        @Override // androidx.constraintlayout.widget.l.a
        public void a(int i10, int i11, int i12) {
            int iH = this.f45105a.h();
            this.f45105a.q(i11);
            if (this.f45106b != i10 || iH == i11) {
                return;
            }
            int i13 = 0;
            if (this.f45107c) {
                if (this.f45108d == i11) {
                    int childCount = a0.this.f45099a.getChildCount();
                    while (i13 < childCount) {
                        View childAt = a0.this.f45099a.getChildAt(i13);
                        if (this.f45105a.l(childAt)) {
                            int currentState = a0.this.f45099a.getCurrentState();
                            androidx.constraintlayout.widget.f fVarP0 = a0.this.f45099a.p0(currentState);
                            z zVar = this.f45105a;
                            a0 a0Var = a0.this;
                            zVar.c(a0Var, a0Var.f45099a, currentState, fVarP0, childAt);
                        }
                        i13++;
                    }
                    return;
                }
                return;
            }
            if (this.f45108d != i11) {
                int childCount2 = a0.this.f45099a.getChildCount();
                while (i13 < childCount2) {
                    View childAt2 = a0.this.f45099a.getChildAt(i13);
                    if (this.f45105a.l(childAt2)) {
                        int currentState2 = a0.this.f45099a.getCurrentState();
                        androidx.constraintlayout.widget.f fVarP1 = a0.this.f45099a.p0(currentState2);
                        z zVar2 = this.f45105a;
                        a0 a0Var2 = a0.this;
                        zVar2.c(a0Var2, a0Var2.f45099a, currentState2, fVarP1, childAt2);
                    }
                    i13++;
                }
            }
        }
    }

    public a0(MotionLayout motionLayout) {
        this.f45099a = motionLayout;
    }

    private void i(z zVar, boolean z10) {
        ConstraintLayout.getSharedValues().a(zVar.i(), new a(zVar, zVar.i(), z10, zVar.g()));
    }

    private void n(z zVar, View... viewArr) {
        int currentState = this.f45099a.getCurrentState();
        if (zVar.f45512f == 2) {
            zVar.c(this, this.f45099a, currentState, null, viewArr);
            return;
        }
        if (currentState == -1) {
            this.f45099a.toString();
            return;
        }
        androidx.constraintlayout.widget.f fVarP0 = this.f45099a.p0(currentState);
        if (fVarP0 == null) {
            return;
        }
        zVar.c(this, this.f45099a, currentState, fVarP0, viewArr);
    }

    public void b(z zVar) {
        this.f45100b.add(zVar);
        this.f45101c = null;
        if (zVar.j() == 4) {
            i(zVar, true);
        } else {
            if (zVar.j() == 5) {
                i(zVar, false);
            }
        }
    }

    void c(z.b bVar) {
        if (this.f45103e == null) {
            this.f45103e = new ArrayList<>();
        }
        this.f45103e.add(bVar);
    }

    void d() {
        ArrayList<z.b> arrayList = this.f45103e;
        if (arrayList != null) {
            Iterator<z.b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f45103e.removeAll(this.f45104f);
            this.f45104f.clear();
            if (this.f45103e.isEmpty()) {
                this.f45103e = null;
            }
        }
    }

    boolean e(int i10, o oVar) {
        for (z zVar : this.f45100b) {
            if (zVar.e() == i10) {
                zVar.f45513g.a(oVar);
                return true;
            }
        }
        return false;
    }

    void f(int i10, boolean z10) {
        for (z zVar : this.f45100b) {
            if (zVar.e() == i10) {
                zVar.n(z10);
                return;
            }
        }
    }

    void g() {
        this.f45099a.invalidate();
    }

    boolean h(int i10) {
        for (z zVar : this.f45100b) {
            if (zVar.e() == i10) {
                return zVar.k();
            }
        }
        return false;
    }

    void j(int i10) {
        z next;
        Iterator<z> it = this.f45100b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.e() != i10);
        if (next != null) {
            this.f45101c = null;
            this.f45100b.remove(next);
        }
    }

    void k(z.b bVar) {
        this.f45104f.add(bVar);
    }

    void l(MotionEvent motionEvent) {
        a0 a0Var;
        int currentState = this.f45099a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f45101c == null) {
            this.f45101c = new HashSet<>();
            for (z zVar : this.f45100b) {
                int childCount = this.f45099a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f45099a.getChildAt(i10);
                    if (zVar.l(childAt)) {
                        childAt.getId();
                        this.f45101c.add(childAt);
                    }
                }
            }
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<z.b> arrayList = this.f45103e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<z.b> it = this.f45103e.iterator();
            while (it.hasNext()) {
                it.next().d(action, x10, y10);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.f fVarP0 = this.f45099a.p0(currentState);
            for (z zVar2 : this.f45100b) {
                if (zVar2.t(action)) {
                    for (View view : this.f45101c) {
                        if (zVar2.l(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x10, (int) y10)) {
                                View[] viewArr = {view};
                                a0Var = this;
                                zVar2.c(a0Var, this.f45099a, currentState, fVarP0, viewArr);
                            } else {
                                a0Var = this;
                            }
                            this = a0Var;
                        }
                    }
                }
                this = this;
            }
        }
    }

    void m(int i10, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        for (z zVar : this.f45100b) {
            if (zVar.e() == i10) {
                for (View view : viewArr) {
                    if (zVar.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n(zVar, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }
}
