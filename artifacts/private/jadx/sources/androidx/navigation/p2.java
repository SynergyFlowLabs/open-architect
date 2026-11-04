package androidx.navigation;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 {

    public static final class a implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71194a;

        public a(kotlin.f0<n0> f0Var) {
            this.f71194a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            return p2.m(this.f71194a).getDefaultViewModelCreationExtras();
        }
    }

    public static final class b implements Function0<androidx.lifecycle.j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71195a;

        public b(kotlin.f0<n0> f0Var) {
            this.f71195a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.j2.c invoke() {
            return p2.m(this.f71195a).getDefaultViewModelProviderFactory();
        }
    }

    public static final class c implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<v2.a> f71196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71197b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<? extends v2.a> function0, kotlin.f0<n0> f0Var) {
            this.f71196a = function0;
            this.f71197b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            v2.a aVarInvoke;
            Function0<v2.a> function0 = this.f71196a;
            if (function0 != null && (aVarInvoke = function0.invoke()) != null) {
                return aVarInvoke;
            }
            return p2.n(this.f71197b).getDefaultViewModelCreationExtras();
        }
    }

    public static final class d implements Function0<androidx.lifecycle.j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71198a;

        public d(kotlin.f0<n0> f0Var) {
            this.f71198a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.j2.c invoke() {
            return p2.n(this.f71198a).getDefaultViewModelProviderFactory();
        }
    }

    public static final class e implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71199a;

        public e(kotlin.f0<n0> f0Var) {
            this.f71199a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            return p2.o(this.f71199a).getDefaultViewModelCreationExtras();
        }
    }

    public static final class f implements Function0<androidx.lifecycle.j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71200a;

        public f(kotlin.f0<n0> f0Var) {
            this.f71200a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.j2.c invoke() {
            return p2.o(this.f71200a).getDefaultViewModelProviderFactory();
        }
    }

    public static final class g implements Function0<v2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<v2.a> f71201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71202b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Function0<? extends v2.a> function0, kotlin.f0<n0> f0Var) {
            this.f71201a = function0;
            this.f71202b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v2.a invoke() {
            v2.a aVarInvoke;
            Function0<v2.a> function0 = this.f71201a;
            if (function0 != null && (aVarInvoke = function0.invoke()) != null) {
                return aVarInvoke;
            }
            return p2.p(this.f71202b).getDefaultViewModelCreationExtras();
        }
    }

    public static final class h implements Function0<androidx.lifecycle.j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71203a;

        public h(kotlin.f0<n0> f0Var) {
            this.f71203a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.j2.c invoke() {
            return p2.p(this.f71203a).getDefaultViewModelProviderFactory();
        }
    }

    public static final class i implements Function0<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f71204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f71205b;

        public i(Fragment fragment, String str) {
            this.f71204a = fragment;
            this.f71205b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return androidx.navigation.fragment.f.a(this.f71204a).D(this.f71205b);
        }
    }

    public static final class j implements Function0<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f71206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f71207b;

        public j(Fragment fragment, int i10) {
            this.f71206a = fragment;
            this.f71207b = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return androidx.navigation.fragment.f.a(this.f71206a).B(this.f71207b);
        }
    }

    public static final class k implements Function0<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f71208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f71209b;

        public k(Fragment fragment, int i10) {
            this.f71208a = fragment;
            this.f71209b = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return androidx.navigation.fragment.f.a(this.f71208a).B(this.f71209b);
        }
    }

    public static final class l implements Function0<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f71210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f71211b;

        public l(Fragment fragment, String str) {
            this.f71210a = fragment;
            this.f71211b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return androidx.navigation.fragment.f.a(this.f71210a).D(this.f71211b);
        }
    }

    public static final class m implements Function0<androidx.lifecycle.l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71212a;

        public m(kotlin.f0<n0> f0Var) {
            this.f71212a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.l2 invoke() {
            return p2.m(this.f71212a).getViewModelStore();
        }
    }

    public static final class n implements Function0<androidx.lifecycle.l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71213a;

        public n(kotlin.f0<n0> f0Var) {
            this.f71213a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.l2 invoke() {
            return p2.n(this.f71213a).getViewModelStore();
        }
    }

    public static final class o implements Function0<androidx.lifecycle.l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71214a;

        public o(kotlin.f0<n0> f0Var) {
            this.f71214a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.l2 invoke() {
            return p2.o(this.f71214a).getViewModelStore();
        }
    }

    public static final class p implements Function0<androidx.lifecycle.l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.f0<n0> f71215a;

        public p(kotlin.f0<n0> f0Var) {
            this.f71215a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.l2 invoke() {
            return p2.p(this.f71215a).getViewModelStore();
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends androidx.lifecycle.f2> kotlin.f0<VM> e(Fragment fragment, @androidx.annotation.d0 int i10, Function0<? extends androidx.lifecycle.j2.c> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        kotlin.f0 f0VarC = kotlin.g0.c(new j(fragment, i10));
        m mVar = new m(f0VarC);
        int i11 = 5 & 4;
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        a aVar = new a(f0VarC);
        if (function0 == null) {
            function0 = new b(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, mVar, aVar, function0);
    }

    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends androidx.lifecycle.f2> kotlin.f0<VM> f(Fragment fragment, @androidx.annotation.d0 int i10, Function0<? extends v2.a> function0, Function0<? extends androidx.lifecycle.j2.c> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        kotlin.f0 f0VarC = kotlin.g0.c(new k(fragment, i10));
        n nVar = new n(f0VarC);
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        c cVar = new c(function0, f0VarC);
        if (function1 == null) {
            function1 = new d(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, nVar, cVar, function1);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends androidx.lifecycle.f2> kotlin.f0<VM> g(Fragment fragment, String navGraphRoute, Function0<? extends androidx.lifecycle.j2.c> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        kotlin.f0 f0VarC = kotlin.g0.c(new l(fragment, navGraphRoute));
        o oVar = new o(f0VarC);
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        e eVar = new e(f0VarC);
        if (function0 == null) {
            function0 = new f(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, oVar, eVar, function0);
    }

    @androidx.annotation.l0
    public static final /* synthetic */ <VM extends androidx.lifecycle.f2> kotlin.f0<VM> h(Fragment fragment, String navGraphRoute, Function0<? extends v2.a> function0, Function0<? extends androidx.lifecycle.j2.c> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        kotlin.f0 f0VarC = kotlin.g0.c(new i(fragment, navGraphRoute));
        p pVar = new p(f0VarC);
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        g gVar = new g(function0, f0VarC);
        if (function1 == null) {
            function1 = new h(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, pVar, gVar, function1);
    }

    public static /* synthetic */ kotlin.f0 i(Fragment fragment, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        kotlin.f0 f0VarC = kotlin.g0.c(new j(fragment, i10));
        m mVar = new m(f0VarC);
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        a aVar = new a(f0VarC);
        if (function0 == null) {
            function0 = new b(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, mVar, aVar, function0);
    }

    public static /* synthetic */ kotlin.f0 j(Fragment fragment, int i10, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        kotlin.f0 f0VarC = kotlin.g0.c(new k(fragment, i10));
        n nVar = new n(f0VarC);
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        c cVar = new c(function0, f0VarC);
        if (function1 == null) {
            function1 = new d(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, nVar, cVar, function1);
    }

    public static /* synthetic */ kotlin.f0 k(Fragment fragment, String navGraphRoute, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        kotlin.f0 f0VarC = kotlin.g0.c(new l(fragment, navGraphRoute));
        o oVar = new o(f0VarC);
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        e eVar = new e(f0VarC);
        if (function0 == null) {
            function0 = new f(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, oVar, eVar, function0);
    }

    public static /* synthetic */ kotlin.f0 l(Fragment fragment, String navGraphRoute, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        kotlin.f0 f0VarC = kotlin.g0.c(new i(fragment, navGraphRoute));
        p pVar = new p(f0VarC);
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class);
        g gVar = new g(function0, f0VarC);
        if (function1 == null) {
            function1 = new h(f0VarC);
        }
        return androidx.fragment.app.z0.h(fragment, dVarD, pVar, gVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 m(kotlin.f0<n0> f0Var) {
        return f0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 n(kotlin.f0<n0> f0Var) {
        return f0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 o(kotlin.f0<n0> f0Var) {
        return f0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 p(kotlin.f0<n0> f0Var) {
        return f0Var.getValue();
    }
}
