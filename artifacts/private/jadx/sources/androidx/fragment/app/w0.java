package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(21)
class w0 extends x0 {

    class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f52020a;

        a(Rect rect) {
            this.f52020a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f52020a;
        }
    }

    class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f52022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f52023b;

        b(View view, ArrayList arrayList) {
            this.f52022a = view;
            this.f52023b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f52022a.setVisibility(8);
            int size = this.f52023b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f52023b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f52025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f52026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f52027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f52028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f52029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f52030f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f52025a = obj;
            this.f52026b = arrayList;
            this.f52027c = obj2;
            this.f52028d = arrayList2;
            this.f52029e = obj3;
            this.f52030f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f52025a;
            if (obj != null) {
                w0.this.s(obj, this.f52026b, null);
            }
            Object obj2 = this.f52027c;
            if (obj2 != null) {
                w0.this.s(obj2, this.f52028d, null);
            }
            Object obj3 = this.f52029e;
            if (obj3 != null) {
                w0.this.s(obj3, this.f52030f, null);
            }
        }
    }

    class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f52032a;

        d(Runnable runnable) {
            this.f52032a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f52032a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f52034a;

        e(Rect rect) {
            this.f52034a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f52034a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f52034a;
        }
    }

    w0() {
    }

    private static boolean E(Transition transition) {
        return (x0.l(transition.getTargetIds()) && x0.l(transition.getTargetNames()) && x0.l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.x0
    public void B(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        int i10 = 6 << 0;
        for (int i11 = 0; i11 < size; i11++) {
            x0.f(targets, arrayList.get(i11));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.x0
    public void C(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            s(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.x0
    public Object D(@androidx.annotation.p0 Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.x0
    public void a(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.x0
    public void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (E(transition) || !x0.l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.x0
    public void e(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.x0
    public boolean g(@NonNull Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.x0
    public Object h(@androidx.annotation.p0 Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.x0
    public boolean m() {
        FragmentManager.b1(4);
        return false;
    }

    @Override // androidx.fragment.app.x0
    public boolean n(@NonNull Object obj) {
        if (!FragmentManager.b1(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    @Override // androidx.fragment.app.x0
    public Object o(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.x0
    public Object p(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.x0
    public void r(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.x0
    public void s(@NonNull Object obj, @e.a({"UnknownNullness"}) ArrayList<View> arrayList, @e.a({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                s(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!E(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                transition.addTarget(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.x0
    public void t(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.x0
    public void u(@NonNull Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 Object obj3, @androidx.annotation.p0 ArrayList<View> arrayList2, @androidx.annotation.p0 Object obj4, @androidx.annotation.p0 ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.x0
    public void w(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.x0
    public void x(@NonNull Object obj, @androidx.annotation.p0 View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.x0
    public void y(@NonNull Fragment fragment, @NonNull Object obj, @NonNull androidx.core.os.f fVar, @NonNull Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }
}
