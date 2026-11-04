package androidx.navigation.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.navigation.e2;
import androidx.navigation.w0;
import androidx.navigation.w2;
import androidx.navigation.y1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,715:1\n1251#2,2:716\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n*L\n713#1:716,2\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f71344a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f71345b = "NavigationUI";

    @SourceDebugExtension({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$12\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,715:1\n56#2,4:716\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$12\n*L\n696#1:716,4\n*E\n"})
    public static final class a implements w0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationBarView> f71346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f71347b;

        a(WeakReference<NavigationBarView> weakReference, w0 w0Var) {
            this.f71346a = weakReference;
            this.f71347b = w0Var;
        }

        @Override // androidx.navigation.w0.c
        public void a(w0 controller, y1 destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(destination, "destination");
            NavigationBarView navigationBarView = this.f71346a.get();
            if (navigationBarView == null) {
                this.f71347b.R0(this);
                return;
            }
            if (destination instanceof androidx.navigation.u) {
                return;
            }
            Menu menu = navigationBarView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                if (q.h(destination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$4\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,715:1\n56#2,4:716\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$4\n*L\n500#1:716,4\n*E\n"})
    public static final class b implements w0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationView> f71348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f71349b;

        b(WeakReference<NavigationView> weakReference, w0 w0Var) {
            this.f71348a = weakReference;
            this.f71349b = w0Var;
        }

        @Override // androidx.navigation.w0.c
        public void a(w0 controller, y1 destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(destination, "destination");
            NavigationView navigationView = this.f71348a.get();
            if (navigationView == null) {
                this.f71349b.R0(this);
                return;
            }
            if (!(destination instanceof androidx.navigation.u)) {
                Menu menu = navigationView.getMenu();
                Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    item.setChecked(q.h(destination, item.getItemId()));
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$7\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,715:1\n56#2,4:716\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$7\n*L\n574#1:716,4\n*E\n"})
    public static final class c implements w0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationView> f71350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f71351b;

        c(WeakReference<NavigationView> weakReference, w0 w0Var) {
            this.f71350a = weakReference;
            this.f71351b = w0Var;
        }

        @Override // androidx.navigation.w0.c
        public void a(w0 controller, y1 destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(destination, "destination");
            NavigationView navigationView = this.f71350a.get();
            if (navigationView == null) {
                this.f71351b.R0(this);
                return;
            }
            if (destination instanceof androidx.navigation.u) {
                return;
            }
            Menu menu = navigationView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                item.setChecked(q.h(destination, item.getItemId()));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$9\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,715:1\n56#2,4:716\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$9\n*L\n639#1:716,4\n*E\n"})
    public static final class d implements w0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationBarView> f71352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f71353b;

        d(WeakReference<NavigationBarView> weakReference, w0 w0Var) {
            this.f71352a = weakReference;
            this.f71353b = w0Var;
        }

        @Override // androidx.navigation.w0.c
        public void a(w0 controller, y1 destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(destination, "destination");
            NavigationBarView navigationBarView = this.f71352a.get();
            if (navigationBarView == null) {
                this.f71353b.R0(this);
                return;
            }
            if (destination instanceof androidx.navigation.u) {
                return;
            }
            Menu menu = navigationBarView.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                if (q.h(destination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    private q() {
    }

    public static /* synthetic */ void A(Toolbar toolbar, w0 w0Var, androidx.navigation.ui.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = new androidx.navigation.ui.d.a(w0Var.M()).a();
        }
        s(toolbar, w0Var, dVar);
    }

    public static /* synthetic */ void B(com.google.android.material.appbar.c cVar, Toolbar toolbar, w0 w0Var, androidx.navigation.ui.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            dVar = new androidx.navigation.ui.d.a(w0Var.M()).a();
        }
        v(cVar, toolbar, w0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(w0 w0Var, androidx.navigation.ui.d dVar, View view) {
        j(w0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(w0 w0Var, androidx.navigation.ui.d dVar, View view) {
        j(w0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(w0 w0Var, NavigationView navigationView, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean zK = k(item, w0Var);
        if (zK) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
                return zK;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorG = g(navigationView);
            if (bottomSheetBehaviorG != null) {
                bottomSheetBehaviorG.g(5);
            }
        }
        return zK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(w0 w0Var, boolean z10, NavigationView navigationView, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean zL = l(item, w0Var, z10);
        if (zL) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
                return zL;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorG = g(navigationView);
            if (bottomSheetBehaviorG != null) {
                bottomSheetBehaviorG.g(5);
            }
        }
        return zL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(w0 w0Var, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return k(item, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(w0 w0Var, boolean z10, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return l(item, w0Var, z10);
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public static final BottomSheetBehavior<?> g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
            if (cVarF instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVarF;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return g((View) parent);
        }
        return null;
    }

    @oj.n
    public static final boolean h(@NotNull y1 y1Var, @d0 int i10) {
        Intrinsics.checkNotNullParameter(y1Var, "<this>");
        Iterator<y1> it = y1.f71443f.e(y1Var).iterator();
        while (it.hasNext()) {
            if (it.next().D() == i10) {
                return true;
            }
        }
        return false;
    }

    @oj.n
    public static final boolean i(@NotNull w0 navController, @Nullable androidx.customview.widget.c cVar) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        return j(navController, new androidx.navigation.ui.d.a(navController.M()).d(cVar).a());
    }

    @oj.n
    public static final boolean j(@NotNull w0 navController, @NotNull androidx.navigation.ui.d configuration) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        androidx.customview.widget.c cVarC = configuration.c();
        y1 y1VarJ = navController.J();
        if (cVarC != null && y1VarJ != null && configuration.e(y1VarJ)) {
            cVarC.open();
            return true;
        }
        if (navController.z0()) {
            return true;
        }
        androidx.navigation.ui.d.b bVarB = configuration.b();
        if (bVarB != null) {
            return bVarB.a();
        }
        return false;
    }

    @oj.n
    public static final boolean k(@NotNull MenuItem item, @NotNull w0 navController) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        w2.a aVarV = new w2.a().d(true).v(true);
        y1 y1VarJ = navController.J();
        Intrinsics.checkNotNull(y1VarJ);
        e2 e2VarL = y1VarJ.L();
        Intrinsics.checkNotNull(e2VarL);
        if (e2VarL.F0(item.getItemId()) instanceof androidx.navigation.g.b) {
            aVarV.b(t.a.f71354a).c(t.a.f71355b).e(t.a.f71356c).f(t.a.f71357d);
        } else {
            aVarV.b(t.b.f71358a).c(t.b.f71359b).e(t.b.f71360c).f(t.b.f71361d);
        }
        if ((item.getOrder() & androidx.profileinstaller.n.c.f73814m) == 0) {
            aVarV.h(e2.f70908i.d(navController.M()).D(), false, true);
        }
        try {
            navController.d0(item.getItemId(), null, aVarV.a());
            y1 y1VarJ2 = navController.J();
            return y1VarJ2 != null && h(y1VarJ2, item.getItemId());
        } catch (IllegalArgumentException unused) {
            y1.f71443f.d(new androidx.navigation.internal.h(navController.F()), item.getItemId());
            Objects.toString(navController.J());
            return false;
        }
    }

    @oj.n
    @r
    public static final boolean l(@NotNull MenuItem item, @NotNull w0 navController, boolean z10) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (z10) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        w2.a aVarD = new w2.a().d(true);
        y1 y1VarJ = navController.J();
        Intrinsics.checkNotNull(y1VarJ);
        e2 e2VarL = y1VarJ.L();
        Intrinsics.checkNotNull(e2VarL);
        if (e2VarL.F0(item.getItemId()) instanceof androidx.navigation.g.b) {
            aVarD.b(t.a.f71354a).c(t.a.f71355b).e(t.a.f71356c).f(t.a.f71357d);
        } else {
            aVarD.b(t.b.f71358a).c(t.b.f71359b).e(t.b.f71360c).f(t.b.f71361d);
        }
        if ((item.getOrder() & androidx.profileinstaller.n.c.f73814m) == 0) {
            w2.a.q(aVarD, e2.f70908i.d(navController.M()).D(), false, false, 4, null);
        }
        try {
            navController.d0(item.getItemId(), null, aVarD.a());
            y1 y1VarJ2 = navController.J();
            return y1VarJ2 != null && h(y1VarJ2, item.getItemId());
        } catch (IllegalArgumentException unused) {
            y1.f71443f.d(new androidx.navigation.internal.h(navController.F()), item.getItemId());
            Objects.toString(navController.J());
            return false;
        }
    }

    @oj.j
    @oj.n
    public static final void m(@NotNull androidx.appcompat.app.d activity, @NotNull w0 navController) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        p(activity, navController, null, 4, null);
    }

    @oj.n
    public static final void n(@NotNull androidx.appcompat.app.d activity, @NotNull w0 navController, @Nullable androidx.customview.widget.c cVar) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        o(activity, navController, new androidx.navigation.ui.d.a(navController.M()).d(cVar).a());
    }

    @oj.j
    @oj.n
    public static final void o(@NotNull androidx.appcompat.app.d activity, @NotNull w0 navController, @NotNull androidx.navigation.ui.d configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.j(new androidx.navigation.ui.b(activity, configuration));
    }

    public static /* synthetic */ void p(androidx.appcompat.app.d dVar, w0 w0Var, androidx.navigation.ui.d dVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar2 = new androidx.navigation.ui.d.a(w0Var.M()).a();
        }
        o(dVar, w0Var, dVar2);
    }

    @oj.j
    @oj.n
    public static final void q(@NotNull Toolbar toolbar, @NotNull w0 navController) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        A(toolbar, navController, null, 4, null);
    }

    @oj.n
    public static final void r(@NotNull Toolbar toolbar, @NotNull w0 navController, @Nullable androidx.customview.widget.c cVar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        s(toolbar, navController, new androidx.navigation.ui.d.a(navController.M()).d(cVar).a());
    }

    @oj.j
    @oj.n
    public static final void s(@NotNull Toolbar toolbar, @NotNull final w0 navController, @NotNull final androidx.navigation.ui.d configuration) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.j(new v(toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.C(navController, configuration, view);
            }
        });
    }

    @oj.j
    @oj.n
    public static final void t(@NotNull com.google.android.material.appbar.c collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull w0 navController) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        B(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    @oj.n
    public static final void u(@NotNull com.google.android.material.appbar.c collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull w0 navController, @Nullable androidx.customview.widget.c cVar) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        v(collapsingToolbarLayout, toolbar, navController, new androidx.navigation.ui.d.a(navController.M()).d(cVar).a());
    }

    @oj.j
    @oj.n
    public static final void v(@NotNull com.google.android.material.appbar.c collapsingToolbarLayout, @NotNull Toolbar toolbar, @NotNull final w0 navController, @NotNull final androidx.navigation.ui.d configuration) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.j(new h(collapsingToolbarLayout, toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.D(navController, configuration, view);
            }
        });
    }

    @oj.n
    public static final void w(@NotNull NavigationBarView navigationBarView, @NotNull final w0 navController) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.d() { // from class: androidx.navigation.ui.o
            @Override // com.google.android.material.navigation.NavigationBarView.d
            public final boolean a(MenuItem menuItem) {
                return q.G(navController, menuItem);
            }
        });
        navController.j(new d(new WeakReference(navigationBarView), navController));
    }

    @oj.n
    @r
    public static final void x(@NotNull NavigationBarView navigationBarView, @NotNull final w0 navController, final boolean z10) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (z10) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.d() { // from class: androidx.navigation.ui.k
            @Override // com.google.android.material.navigation.NavigationBarView.d
            public final boolean a(MenuItem menuItem) {
                return q.H(navController, z10, menuItem);
            }
        });
        navController.j(new a(new WeakReference(navigationBarView), navController));
    }

    @oj.n
    public static final void y(@NotNull final NavigationView navigationView, @NotNull final w0 navController) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.d() { // from class: androidx.navigation.ui.p
            @Override // com.google.android.material.navigation.NavigationView.d
            public final boolean a(MenuItem menuItem) {
                return q.E(navController, navigationView, menuItem);
            }
        });
        navController.j(new b(new WeakReference(navigationView), navController));
    }

    @oj.n
    @r
    public static final void z(@NotNull final NavigationView navigationView, @NotNull final w0 navController, final boolean z10) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (z10) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.d() { // from class: androidx.navigation.ui.m
            @Override // com.google.android.material.navigation.NavigationView.d
            public final boolean a(MenuItem menuItem) {
                return q.F(navController, z10, navigationView, menuItem);
            }
        });
        navController.j(new c(new WeakReference(navigationView), navController));
    }
}
