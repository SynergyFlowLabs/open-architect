package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,923:1\n288#2,2:924\n288#2,2:926\n533#2,6:928\n1855#2,2:934\n1855#2:936\n1726#2,3:937\n1856#2:940\n1360#2:941\n1446#2,5:942\n1360#2:947\n1446#2,5:948\n1360#2:953\n1446#2,5:954\n1360#2:959\n1446#2,5:960\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n67#1:924,2\n73#1:926,2\n175#1:928,6\n311#1:934,2\n321#1:936\n324#1:937,3\n321#1:940\n326#1:941\n326#1:942,5\n428#1:947\n428#1:948,5\n456#1:953\n456#1:954,5\n472#1:959\n472#1:960,5\n*E\n"})
public abstract class f1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f51851g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f51852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<d> f51853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<d> f51854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51857f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final f1 a(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            g1 g1VarT0 = fragmentManager.T0();
            Intrinsics.checkNotNullExpressionValue(g1VarT0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, g1VarT0);
        }

        @oj.n
        @NotNull
        public final f1 b(@NotNull ViewGroup container, @NotNull g1 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(c2.a.c.f82386b);
            if (tag instanceof f1) {
                return (f1) tag;
            }
            f1 f1VarA = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(f1VarA, "factory.createController(container)");
            container.setTag(c2.a.c.f82386b, f1VarA);
            return f1VarA;
        }

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f51858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f51859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f51860c;

        public final void a(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f51860c) {
                c(container);
            }
            this.f51860c = true;
        }

        public boolean b() {
            return this.f51858a;
        }

        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void e(@NotNull androidx.activity.d backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public final void g(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.f51859b) {
                f(container);
            }
            this.f51859b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private final q0 f51861l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull d.b finalState, @NotNull d.a lifecycleImpact, @NotNull q0 fragmentStateManager) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Fragment fragmentK = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK);
            this.f51861l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.f1.d
        public void d() {
            super.d();
            h().mTransitioning = false;
            this.f51861l.m();
        }

        @Override // androidx.fragment.app.f1.d
        public void p() {
            if (n()) {
                return;
            }
            super.p();
            if (i() != d.a.ADDING) {
                if (i() == d.a.REMOVING) {
                    Fragment fragmentK = this.f51861l.k();
                    Intrinsics.checkNotNullExpressionValue(fragmentK, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentK.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.b1(2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragmentK.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f51861l.k();
            Intrinsics.checkNotNullExpressionValue(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.b1(2)) {
                    viewFindFocus.toString();
                    fragmentK2.toString();
                }
            }
            View viewRequireView2 = h().requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                if (FragmentManager.b1(2)) {
                    fragmentK2.toString();
                    viewRequireView2.toString();
                }
                this.f51861l.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (FragmentManager.b1(2)) {
                    viewRequireView2.toString();
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
            if (FragmentManager.b1(2)) {
                fragmentK2.getPostOnViewCreatedAlpha();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,923:1\n1855#2,2:924\n1855#2,2:926\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n679#1:924,2\n769#1:926,2\n*E\n"})
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private b f51862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private a f51863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Fragment f51864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<Runnable> f51865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f51866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f51867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f51868g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f51869h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f51870i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final List<b> f51871j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private final List<b> f51872k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f51877a = new a(null);

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final b a(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                @oj.n
                @NotNull
                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.f1$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0468b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f51883a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f51883a = iArr;
                }
            }

            @oj.n
            @NotNull
            public static final b n(int i10) {
                return f51877a.b(i10);
            }

            public final void l(@NotNull View view, @NotNull ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                FragmentManager.b1(2);
                int i10 = C0468b.f51883a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.b1(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.b1(2)) {
                        Objects.toString(view);
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.b1(2)) {
                            view.toString();
                            Objects.toString(container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.b1(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    if (FragmentManager.b1(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51884a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f51884a = iArr;
            }
        }

        public d(@NotNull b finalState, @NotNull a lifecycleImpact, @NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f51862a = finalState;
            this.f51863b = lifecycleImpact;
            this.f51864c = fragment;
            this.f51865d = new ArrayList();
            this.f51870i = true;
            ArrayList arrayList = new ArrayList();
            this.f51871j = arrayList;
            this.f51872k = arrayList;
        }

        public final void a(@NotNull Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f51865d.add(listener);
        }

        public final void b(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.f51871j.add(effect);
        }

        public final void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f51869h = false;
            if (this.f51866e) {
                return;
            }
            this.f51866e = true;
            if (this.f51871j.isEmpty()) {
                d();
                return;
            }
            Iterator it = CollectionsKt.toList(this.f51872k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        @androidx.annotation.i
        public void d() {
            this.f51869h = false;
            if (this.f51867f) {
                return;
            }
            if (FragmentManager.b1(2)) {
                toString();
            }
            this.f51867f = true;
            Iterator<T> it = this.f51865d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (this.f51871j.remove(effect) && this.f51871j.isEmpty()) {
                d();
            }
        }

        @NotNull
        public final List<b> f() {
            return this.f51872k;
        }

        @NotNull
        public final b g() {
            return this.f51862a;
        }

        @NotNull
        public final Fragment h() {
            return this.f51864c;
        }

        @NotNull
        public final a i() {
            return this.f51863b;
        }

        public final boolean j() {
            return this.f51870i;
        }

        public final boolean k() {
            return this.f51866e;
        }

        public final boolean l() {
            return this.f51867f;
        }

        public final boolean m() {
            return this.f51868g;
        }

        public final boolean n() {
            return this.f51869h;
        }

        public final void o(@NotNull b finalState, @NotNull a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f51884a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f51862a == b.REMOVED) {
                    if (FragmentManager.b1(2)) {
                        Objects.toString(this.f51864c);
                        Objects.toString(this.f51863b);
                    }
                    this.f51862a = b.VISIBLE;
                    this.f51863b = a.ADDING;
                    this.f51870i = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.b1(2)) {
                    Objects.toString(this.f51864c);
                    Objects.toString(this.f51862a);
                    Objects.toString(this.f51863b);
                }
                this.f51862a = b.REMOVED;
                this.f51863b = a.REMOVING;
                this.f51870i = true;
                return;
            }
            if (i10 == 3 && this.f51862a != b.REMOVED) {
                if (FragmentManager.b1(2)) {
                    Objects.toString(this.f51864c);
                    Objects.toString(this.f51862a);
                    Objects.toString(finalState);
                }
                this.f51862a = finalState;
            }
        }

        @androidx.annotation.i
        public void p() {
            this.f51869h = true;
        }

        public final void q(boolean z10) {
            this.f51870i = z10;
        }

        public final void r(@NotNull b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f51862a = bVar;
        }

        public final void s(@NotNull a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.f51863b = aVar;
        }

        public final void t(boolean z10) {
            this.f51868g = z10;
        }

        @NotNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f51862a + " lifecycleImpact = " + this.f51863b + " fragment = " + this.f51864c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51885a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f51885a = iArr;
        }
    }

    public f1(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f51852a = container;
        this.f51853b = new ArrayList();
        this.f51854c = new ArrayList();
    }

    private final void B(List<d> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).f());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) list2.get(i11)).g(this.f51852a);
        }
    }

    private final void C() {
        for (d dVar : this.f51853b) {
            if (dVar.i() == d.a.ADDING) {
                View viewRequireView = dVar.h().requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                dVar.o(d.b.f51877a.b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b bVar, d.a aVar, q0 q0Var) {
        synchronized (this.f51853b) {
            try {
                Fragment fragmentK = q0Var.k();
                Intrinsics.checkNotNullExpressionValue(fragmentK, "fragmentStateManager.fragment");
                d dVarO = o(fragmentK);
                if (dVarO == null) {
                    if (q0Var.k().mTransitioning || q0Var.k().mRemoving) {
                        Fragment fragmentK2 = q0Var.k();
                        Intrinsics.checkNotNullExpressionValue(fragmentK2, "fragmentStateManager.fragment");
                        dVarO = p(fragmentK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, q0Var);
                this.f51853b.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        f1.h(this.f51839a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        f1.i(this.f51845a, cVar);
                    }
                });
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(f1 this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f51853b.contains(operation)) {
            d.b bVarG = operation.g();
            View view = operation.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            bVarG.l(view, this$0.f51852a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(f1 this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f51853b.remove(operation);
        this$0.f51854c.remove(operation);
    }

    private final d o(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f51853b.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.areEqual(dVar.h(), fragment) && !dVar.k()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    private final d p(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f51854c.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.areEqual(dVar.h(), fragment) && !dVar.k()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    @oj.n
    @NotNull
    public static final f1 u(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return f51851g.a(viewGroup, fragmentManager);
    }

    @oj.n
    @NotNull
    public static final f1 v(@NotNull ViewGroup viewGroup, @NotNull g1 g1Var) {
        return f51851g.b(viewGroup, g1Var);
    }

    private final boolean w(List<d> list) {
        boolean z10;
        List<d> list2 = list;
        Iterator<T> it = list2.iterator();
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List<b> listF = dVar.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator<T> it2 = listF.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                        } while (((b) it2.next()).b());
                    } else {
                        break;
                    }
                }
                z10 = false;
            }
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                CollectionsKt.addAll(arrayList, ((d) it3.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List<d> list) {
        Iterator<T> it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).h().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void A(@NotNull androidx.activity.d backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (FragmentManager.b1(2)) {
            backEvent.a();
        }
        List<d> list = this.f51854c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).f());
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) list2.get(i10)).e(backEvent, this.f51852a);
        }
    }

    public final void D(boolean z10) {
        this.f51856e = z10;
    }

    public final void c(@NotNull d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.j()) {
            d.b bVarG = operation.g();
            View viewRequireView = operation.h().requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "operation.fragment.requireView()");
            bVarG.l(viewRequireView, this.f51852a);
            operation.q(false);
        }
    }

    public abstract void d(@NotNull List<d> list, boolean z10);

    public void e(@NotNull List<d> operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).f());
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) list.get(i10)).d(this.f51852a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c(operations.get(i11));
        }
        List list2 = CollectionsKt.toList(operations);
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) list2.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        FragmentManager.b1(3);
        B(this.f51854c);
        e(this.f51854c);
    }

    public final void j(@NotNull d.b finalState, @NotNull q0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.b1(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(@NotNull q0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.b1(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(@NotNull q0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.b1(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(@NotNull q0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.b1(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z10;
        if (this.f51857f) {
            return;
        }
        if (!this.f51852a.isAttachedToWindow()) {
            q();
            this.f51856e = false;
            return;
        }
        synchronized (this.f51853b) {
            try {
                List<d> mutableList = CollectionsKt.toMutableList((Collection) this.f51854c);
                this.f51854c.clear();
                Iterator it = mutableList.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.f51853b.isEmpty() || !dVar.h().mTransitioning) {
                        z10 = false;
                    }
                    dVar.t(z10);
                }
                for (d dVar2 : mutableList) {
                    if (this.f51855d) {
                        if (FragmentManager.b1(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (FragmentManager.b1(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.c(this.f51852a);
                    }
                    this.f51855d = false;
                    if (!dVar2.l()) {
                        this.f51854c.add(dVar2);
                    }
                }
                if (!this.f51853b.isEmpty()) {
                    C();
                    List<d> mutableList2 = CollectionsKt.toMutableList((Collection) this.f51853b);
                    if (mutableList2.isEmpty()) {
                        return;
                    }
                    this.f51853b.clear();
                    this.f51854c.addAll(mutableList2);
                    FragmentManager.b1(2);
                    d(mutableList2, this.f51856e);
                    boolean zW = w(mutableList2);
                    boolean zX = x(mutableList2);
                    if (!zX || zW) {
                        z10 = false;
                    }
                    this.f51855d = z10;
                    FragmentManager.b1(2);
                    if (!zX) {
                        B(mutableList2);
                        e(mutableList2);
                    } else if (zW) {
                        B(mutableList2);
                        int size = mutableList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c(mutableList2.get(i10));
                        }
                    }
                    this.f51856e = false;
                    FragmentManager.b1(2);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q() {
        FragmentManager.b1(2);
        boolean zIsAttachedToWindow = this.f51852a.isAttachedToWindow();
        synchronized (this.f51853b) {
            try {
                C();
                B(this.f51853b);
                List<d> mutableList = CollectionsKt.toMutableList((Collection) this.f51854c);
                Iterator it = mutableList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).t(false);
                }
                for (d dVar : mutableList) {
                    if (FragmentManager.b1(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f51852a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar);
                    }
                    dVar.c(this.f51852a);
                }
                List<d> mutableList2 = CollectionsKt.toMutableList((Collection) this.f51853b);
                Iterator it2 = mutableList2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).t(false);
                }
                for (d dVar2 : mutableList2) {
                    if (FragmentManager.b1(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Container ");
                            sb3.append(this.f51852a);
                            sb3.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar2);
                    }
                    dVar2.c(this.f51852a);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.f51857f) {
            FragmentManager.b1(2);
            this.f51857f = false;
            n();
        }
    }

    @Nullable
    public final d.a s(@NotNull q0 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(fragmentK, "fragmentStateManager.fragment");
        d dVarO = o(fragmentK);
        d.a aVarI = dVarO != null ? dVarO.i() : null;
        d dVarP = p(fragmentK);
        d.a aVarI2 = dVarP != null ? dVarP.i() : null;
        int i10 = aVarI == null ? -1 : e.f51885a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    @NotNull
    public final ViewGroup t() {
        return this.f51852a;
    }

    public final boolean y() {
        return !this.f51853b.isEmpty();
    }

    public final void z() {
        d dVarPrevious;
        synchronized (this.f51853b) {
            try {
                C();
                List<d> list = this.f51853b;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVarPrevious = null;
                        break;
                    }
                    dVarPrevious = listIterator.previous();
                    d dVar = dVarPrevious;
                    d.b.a aVar = d.b.f51877a;
                    View view = dVar.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    d.b bVarA = aVar.a(view);
                    d.b bVarG = dVar.g();
                    d.b bVar = d.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = dVarPrevious;
                Fragment fragmentH = dVar2 != null ? dVar2.h() : null;
                this.f51857f = fragmentH != null ? fragmentH.isPostponed() : false;
                Unit unit = Unit.f312394a;
            } finally {
            }
        }
    }
}
