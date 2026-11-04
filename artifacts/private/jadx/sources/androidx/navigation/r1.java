package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavDeepLinkBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkBuilder.android.kt\nandroidx/navigation/NavDeepLinkBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,394:1\n1#2:395\n90#3:396\n90#3:397\n*S KotlinDebug\n*F\n+ 1 NavDeepLinkBuilder.android.kt\nandroidx/navigation/NavDeepLinkBuilder\n*L\n338#1:396\n342#1:397\n*E\n"})
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f71222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.h f71223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Activity f71224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Intent f71225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private e2 f71226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<a> f71227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Bundle f71228g;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f71229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Bundle f71230b;

        public a(int i10, @Nullable Bundle bundle) {
            this.f71229a = i10;
            this.f71230b = bundle;
        }

        @Nullable
        public final Bundle a() {
            return this.f71230b;
        }

        public final int b() {
            return this.f71229a;
        }
    }

    private static final class b extends r3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final q3<y1> f71231d = new a();

        public static final class a extends q3<y1> {
            a() {
            }

            @Override // androidx.navigation.q3
            public y1 c() {
                return new y1("permissive");
            }

            @Override // androidx.navigation.q3
            public y1 g(y1 destination, Bundle bundle, w2 w2Var, q3.a aVar) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.q3
            public boolean p() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public b() {
            b(new o2(this));
        }

        @Override // androidx.navigation.r3
        @NotNull
        public <T extends q3<? extends y1>> T f(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                return (T) super.f(name);
            } catch (IllegalStateException unused) {
                q3<y1> q3Var = this.f71231d;
                Intrinsics.checkNotNull(q3Var, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return q3Var;
            }
        }
    }

    public r1(@NotNull Context context) {
        Intent launchIntentForPackage;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f71222a = context;
        this.f71223b = new androidx.navigation.internal.h(context);
        Activity activity = (Activity) kotlin.sequences.o.F0(kotlin.sequences.o.p1(kotlin.sequences.o.l(context, new Function1() { // from class: androidx.navigation.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r1.c((Context) obj);
            }
        }), new Function1() { // from class: androidx.navigation.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r1.d((Context) obj);
            }
        }));
        this.f71224c = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f71225d = launchIntentForPackage;
        this.f71227f = new ArrayList();
    }

    private final void A() {
        Iterator<a> it = this.f71227f.iterator();
        while (it.hasNext()) {
            int iB = it.next().b();
            if (n(iB) == null) {
                throw new IllegalArgumentException("Navigation destination " + y1.f71443f.d(this.f71223b, iB) + " cannot be found in the navigation graph " + this.f71226e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context c(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity d(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof Activity) {
            return (Activity) it;
        }
        return null;
    }

    public static /* synthetic */ r1 i(r1 r1Var, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return r1Var.f(i10, bundle);
    }

    public static /* synthetic */ r1 j(r1 r1Var, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return r1Var.h(str, bundle);
    }

    private final void m() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        y1 y1Var = null;
        for (a aVar : this.f71227f) {
            int iB = aVar.b();
            Bundle bundleA = aVar.a();
            y1 y1VarN = n(iB);
            if (y1VarN == null) {
                throw new IllegalArgumentException("Navigation destination " + y1.f71443f.d(this.f71223b, iB) + " cannot be found in the navigation graph " + this.f71226e);
            }
            for (int i10 : y1VarN.n(y1Var)) {
                arrayList.add(Integer.valueOf(i10));
                arrayList2.add(bundleA);
            }
            y1Var = y1VarN;
        }
        this.f71225d.putExtra(w0.f71386l, CollectionsKt.toIntArray(arrayList));
        this.f71225d.putParcelableArrayListExtra(w0.f71387m, arrayList2);
    }

    private final y1 n(@androidx.annotation.d0 int i10) {
        ArrayDeque arrayDeque = new ArrayDeque();
        e2 e2Var = this.f71226e;
        Intrinsics.checkNotNull(e2Var);
        arrayDeque.add(e2Var);
        while (!arrayDeque.isEmpty()) {
            y1 y1Var = (y1) arrayDeque.removeFirst();
            if (y1Var.D() == i10) {
                return y1Var;
            }
            if (y1Var instanceof e2) {
                Iterator<y1> it = ((e2) y1Var).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ r1 w(r1 r1Var, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return r1Var.t(i10, bundle);
    }

    public static /* synthetic */ r1 x(r1 r1Var, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return r1Var.v(str, bundle);
    }

    @oj.j
    @NotNull
    public final r1 e(@androidx.annotation.d0 int i10) {
        return i(this, i10, null, 2, null);
    }

    @oj.j
    @NotNull
    public final r1 f(@androidx.annotation.d0 int i10, @Nullable Bundle bundle) {
        this.f71227f.add(new a(i10, bundle));
        if (this.f71226e != null) {
            A();
        }
        return this;
    }

    @oj.j
    @NotNull
    public final r1 g(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return j(this, route, null, 2, null);
    }

    @oj.j
    @NotNull
    public final r1 h(@NotNull String route, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f71227f.add(new a(y1.f71443f.c(route).hashCode(), bundle));
        if (this.f71226e != null) {
            A();
        }
        return this;
    }

    @NotNull
    public final PendingIntent k() {
        Bundle bundle = this.f71228g;
        int iE = bundle != null ? androidx.savedstate.f.e(androidx.savedstate.f.b(bundle)) : 0;
        for (a aVar : this.f71227f) {
            iE = (iE * 31) + aVar.b();
            Bundle bundleA = aVar.a();
            Integer numValueOf = bundleA != null ? Integer.valueOf(androidx.savedstate.f.e(androidx.savedstate.f.b(bundleA))) : null;
            if (numValueOf != null) {
                iE = (iE * 31) + numValueOf.intValue();
            }
        }
        PendingIntent pendingIntentU = l().u(iE, 201326592);
        Intrinsics.checkNotNull(pendingIntentU);
        return pendingIntentU;
    }

    @NotNull
    public final androidx.core.app.p0 l() {
        if (this.f71226e == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.f71227f.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        m();
        androidx.core.app.p0 p0VarD = androidx.core.app.p0.m(this.f71222a).d(new Intent(this.f71225d));
        Intrinsics.checkNotNullExpressionValue(p0VarD, "addNextIntentWithParentStack(...)");
        int iS = p0VarD.s();
        for (int i10 = 0; i10 < iS; i10++) {
            Intent intentN = p0VarD.n(i10);
            if (intentN != null) {
                intentN.putExtra(w0.f71390p, this.f71225d);
            }
        }
        return p0VarD;
    }

    @NotNull
    public final androidx.navigation.internal.h o() {
        return this.f71223b;
    }

    @NotNull
    public final r1 p(@Nullable Bundle bundle) {
        this.f71228g = bundle;
        this.f71225d.putExtra(w0.f71388n, bundle);
        return this;
    }

    @NotNull
    public final r1 q(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.f71225d.setComponent(componentName);
        return this;
    }

    @NotNull
    public final r1 r(@NotNull Class<? extends Activity> activityClass) {
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        return q(new ComponentName(this.f71222a, activityClass));
    }

    @oj.j
    @NotNull
    public final r1 s(@androidx.annotation.d0 int i10) {
        return w(this, i10, null, 2, null);
    }

    @oj.j
    @NotNull
    public final r1 t(@androidx.annotation.d0 int i10, @Nullable Bundle bundle) {
        this.f71227f.clear();
        this.f71227f.add(new a(i10, bundle));
        if (this.f71226e != null) {
            A();
        }
        return this;
    }

    @oj.j
    @NotNull
    public final r1 u(@NotNull String destRoute) {
        Intrinsics.checkNotNullParameter(destRoute, "destRoute");
        int i10 = 1 >> 2;
        return x(this, destRoute, null, 2, null);
    }

    @oj.j
    @NotNull
    public final r1 v(@NotNull String destRoute, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(destRoute, "destRoute");
        this.f71227f.clear();
        this.f71227f.add(new a(y1.f71443f.c(destRoute).hashCode(), bundle));
        if (this.f71226e != null) {
            A();
        }
        return this;
    }

    @NotNull
    public final r1 y(@androidx.annotation.n0 int i10) {
        return z(new v2(this.f71222a, new b()).b(i10));
    }

    @NotNull
    public final r1 z(@NotNull e2 navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        this.f71226e = navGraph;
        A();
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r1(@NotNull w0 navController) {
        this(navController.F());
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.f71226e = navController.M();
    }
}
