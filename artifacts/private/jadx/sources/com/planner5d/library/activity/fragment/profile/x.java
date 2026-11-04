package com.planner5d.library.activity.fragment.profile;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.s4;
import com.planner5d.library.model.manager.statistics.events.n2;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.modules.user.user.z;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class x extends f2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f134862l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s4 f134863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.menu.a f134864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f134865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final z f134866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t0 f134867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f134868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f134869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Integer f134870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final id.a f134871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<c> f134872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<c> f134873k;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.ProfileViewModel$1", f = "ProfileViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0, 66}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134874a;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.profile.x$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.ProfileViewModel$1$1", f = "ProfileViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
        static final class C1481a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f134876a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f134877b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1481a(x xVar, kotlin.coroutines.d<? super C1481a> dVar) {
                super(2, dVar);
                this.f134877b = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1481a(this.f134877b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f134876a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    t0 t0Var = this.f134877b.f134867e;
                    id.a aVar = this.f134877b.f134871i;
                    this.f134876a = 1;
                    if (t0Var.b0(aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1481a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new a(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            if (r13 == r0) goto L18;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f134874a
                r11 = 4
                r2 = 1
                r3 = 0
                r11 = 5
                r4 = 2
                r11 = 3
                if (r1 == 0) goto L25
                if (r1 == r2) goto L20
                r11 = 0
                if (r1 != r4) goto L18
                kotlin.ResultKt.m(r13)
                r11 = 4
                goto L63
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L20:
                r11 = 4
                kotlin.ResultKt.m(r13)
                goto L4a
            L25:
                r11 = 1
                kotlin.ResultKt.m(r13)
                com.planner5d.library.activity.fragment.profile.x r13 = com.planner5d.library.activity.fragment.profile.x.this
                id.a r13 = com.planner5d.library.activity.fragment.profile.x.V(r13)
                r11 = 7
                if (r13 == 0) goto L4a
                r11 = 1
                com.planner5d.library.services.utility.s r13 = com.planner5d.library.services.utility.s.f229729a
                kotlinx.coroutines.z1 r13 = r13.d()
                r11 = 5
                com.planner5d.library.activity.fragment.profile.x$a$a r1 = new com.planner5d.library.activity.fragment.profile.x$a$a
                com.planner5d.library.activity.fragment.profile.x r5 = com.planner5d.library.activity.fragment.profile.x.this
                r1.<init>(r5, r3)
                r12.f134874a = r2
                java.lang.Object r13 = kotlinx.coroutines.i.h(r13, r1, r12)
                if (r13 != r0) goto L4a
                goto L61
            L4a:
                r11 = 3
                com.planner5d.library.activity.fragment.profile.x r13 = com.planner5d.library.activity.fragment.profile.x.this
                com.planner5d.library.modules.user.user.t r13 = com.planner5d.library.activity.fragment.profile.x.W(r13)
                com.planner5d.library.activity.fragment.profile.x r1 = com.planner5d.library.activity.fragment.profile.x.this
                r11 = 3
                id.a r1 = com.planner5d.library.activity.fragment.profile.x.V(r1)
                r12.f134874a = r4
                r11 = 3
                java.lang.Object r13 = r13.a0(r1, r12)
                if (r13 != r0) goto L63
            L61:
                r11 = 3
                return r0
            L63:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                r11 = 7
                boolean r7 = r13.booleanValue()
                com.planner5d.library.activity.fragment.profile.x r13 = com.planner5d.library.activity.fragment.profile.x.this
                androidx.lifecycle.c1 r13 = com.planner5d.library.activity.fragment.profile.x.U(r13)
                com.planner5d.library.activity.fragment.profile.x r12 = com.planner5d.library.activity.fragment.profile.x.this
                r11 = 2
                androidx.lifecycle.c1 r12 = com.planner5d.library.activity.fragment.profile.x.U(r12)
                java.lang.Object r12 = r12.f()
                r5 = r12
                r5 = r12
                r11 = 5
                com.planner5d.library.activity.fragment.profile.x$c r5 = (com.planner5d.library.activity.fragment.profile.x.c) r5
                if (r5 == 0) goto L94
                com.planner5d.library.activity.fragment.profile.x$b r12 = r5.h()
                r11 = 6
                r0 = 0
                r11 = 7
                com.planner5d.library.activity.fragment.profile.x$b r6 = com.planner5d.library.activity.fragment.profile.x.b.d(r12, r0, r0, r4, r3)
                r9 = 4
                r10 = 0
                r8 = 0
                com.planner5d.library.activity.fragment.profile.x$c r3 = com.planner5d.library.activity.fragment.profile.x.c.e(r5, r6, r7, r8, r9, r10)
            L94:
                r11 = 7
                r13.r(r3)
                r11 = 0
                kotlin.Unit r12 = kotlin.Unit.f312394a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.profile.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @w0(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f134878d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f134879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f134880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f134881c;

        public b(boolean z10, boolean z11) {
            this.f134879a = z10;
            this.f134880b = z11;
            this.f134881c = z10 || z11;
        }

        public static /* synthetic */ b d(b bVar, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = bVar.f134879a;
            }
            if ((i10 & 2) != 0) {
                z11 = bVar.f134880b;
            }
            return bVar.c(z10, z11);
        }

        public final boolean a() {
            return this.f134879a;
        }

        public final boolean b() {
            return this.f134880b;
        }

        @NotNull
        public final b c(boolean z10, boolean z11) {
            return new b(z10, z11);
        }

        public final boolean e() {
            return this.f134881c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f134879a == bVar.f134879a && this.f134880b == bVar.f134880b;
        }

        public final boolean f() {
            return this.f134880b;
        }

        public final boolean g() {
            return this.f134879a;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f134879a) * 31) + Boolean.hashCode(this.f134880b);
        }

        @NotNull
        public String toString() {
            return "RefreshingUiState(refreshingProfile=" + this.f134879a + ", refreshingList=" + this.f134880b + ")";
        }
    }

    @w0(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f134882d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f134883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f134884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<ed.c> f134885c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull b refreshing, boolean z10, @NotNull List<? extends ed.c> menuItems) {
            Intrinsics.checkNotNullParameter(refreshing, "refreshing");
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            this.f134883a = refreshing;
            this.f134884b = z10;
            this.f134885c = menuItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c e(c cVar, b bVar, boolean z10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = cVar.f134883a;
            }
            if ((i10 & 2) != 0) {
                z10 = cVar.f134884b;
            }
            if ((i10 & 4) != 0) {
                list = cVar.f134885c;
            }
            return cVar.d(bVar, z10, list);
        }

        @NotNull
        public final b a() {
            return this.f134883a;
        }

        public final boolean b() {
            return this.f134884b;
        }

        @NotNull
        public final List<ed.c> c() {
            return this.f134885c;
        }

        @NotNull
        public final c d(@NotNull b refreshing, boolean z10, @NotNull List<? extends ed.c> menuItems) {
            Intrinsics.checkNotNullParameter(refreshing, "refreshing");
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            return new c(refreshing, z10, menuItems);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f134883a, cVar.f134883a) && this.f134884b == cVar.f134884b && Intrinsics.areEqual(this.f134885c, cVar.f134885c);
        }

        public final boolean f() {
            return this.f134884b;
        }

        @NotNull
        public final List<ed.c> g() {
            return this.f134885c;
        }

        @NotNull
        public final b h() {
            return this.f134883a;
        }

        public int hashCode() {
            return (((this.f134883a.hashCode() * 31) + Boolean.hashCode(this.f134884b)) * 31) + this.f134885c.hashCode();
        }

        @NotNull
        public String toString() {
            return "UiState(refreshing=" + this.f134883a + ", canEditProfile=" + this.f134884b + ", menuItems=" + this.f134885c + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.ProfileViewModel", f = "ProfileViewModel.kt", i = {0}, l = {110}, m = "refreshList", n = {"this"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f134887b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f134889d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f134887b = obj;
            this.f134889d |= Integer.MIN_VALUE;
            return x.this.r0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.ProfileViewModel$requestToRefreshList$1", f = "ProfileViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134890a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134890a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x xVar = x.this;
                this.f134890a = 1;
                if (xVar.r0(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public x(@NotNull s4 supportManager, @NotNull com.planner5d.library.model.manager.menu.a profileMenuManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull z userAvatar, @NotNull t0 userPurchases, @NotNull com.planner5d.library.application.d configuration, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager) {
        Intrinsics.checkNotNullParameter(supportManager, "supportManager");
        Intrinsics.checkNotNullParameter(profileMenuManager, "profileMenuManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f134863a = supportManager;
        this.f134864b = profileMenuManager;
        this.f134865c = userAuthorization;
        this.f134866d = userAvatar;
        this.f134867e = userPurchases;
        this.f134868f = configuration;
        this.f134869g = featureConfigManager;
        this.f134871i = userAuthorization.a();
        c1<c> c1Var = new c1<>(new c(new b(true, false), false, CollectionsKt.emptyList()));
        this.f134872j = c1Var;
        this.f134873k = c1Var;
        s0();
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    private final boolean Z() {
        return this.f134868f.b() != com.planner5d.library.model.payments.paymentmethod.e.a.None;
    }

    private final boolean a0() {
        if (!o0() || l0() || !Z()) {
            return false;
        }
        boolean z10 = !true;
        return true;
    }

    private final boolean m0() {
        return this.f134867e.c() && !l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r0(kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f134889d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f134889d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objB = dVar2.f134887b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f134889d;
        int i12 = 0 >> 1;
        if (i11 == 0) {
            ResultKt.m(objB);
            c1<c> c1Var = this.f134872j;
            c cVarF = c1Var.f();
            c1Var.r(cVarF != null ? c.e(cVarF, b.d(cVarF.h(), false, true, 1, null), false, null, 6, null) : null);
            com.planner5d.library.model.manager.menu.a aVar = this.f134864b;
            id.a aVar2 = this.f134871i;
            dVar2.f134886a = this;
            dVar2.f134889d = 1;
            objB = aVar.B(aVar2, dVar2);
            if (objB == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (x) dVar2.f134886a;
            ResultKt.m(objB);
        }
        List list = (List) objB;
        c1<c> c1Var2 = this.f134872j;
        c cVarF2 = c1Var2.f();
        c1Var2.r(cVarF2 != null ? c.e(cVarF2, b.d(cVarF2.h(), false, false, 1, null), false, list, 2, null) : null);
        return Unit.f312394a;
    }

    @Nullable
    public final Integer b0() {
        return this.f134870h;
    }

    @NotNull
    public final androidx.lifecycle.w0<c> c0() {
        return this.f134873k;
    }

    @Nullable
    public final id.a d0() {
        return this.f134865c.a();
    }

    @NotNull
    public final String f0() {
        String str;
        id.a aVar = this.f134871i;
        if (aVar != null && (str = aVar.f287079e) != null) {
            return str;
        }
        return "";
    }

    @NotNull
    public final o0<id.a> g0() {
        return this.f134865c.d();
    }

    public final void h0(int i10, @NotNull com.planner5d.library.services.bitmaploader.target.a target, @Nullable id.a aVar) {
        Intrinsics.checkNotNullParameter(target, "target");
        z zVar = this.f134866d;
        if (aVar == null) {
            aVar = this.f134871i;
        }
        zVar.a(aVar, i10, target);
    }

    @NotNull
    public final String i0() {
        String str;
        id.a aVar = this.f134871i;
        return (aVar == null || (str = aVar.f287076b) == null) ? "" : str;
    }

    public final boolean j0() {
        return (m0() || l0()) ? false : true;
    }

    public final boolean k0() {
        return m0() && a0();
    }

    public final boolean l0() {
        return this.f134867e.r();
    }

    public final boolean n0() {
        return this.f134868f.t();
    }

    public final boolean o0() {
        return this.f134869g.get().a(com.planner5d.library.model.manager.config.f.ProAndroid);
    }

    public final boolean p0() {
        return this.f134869g.get().a(com.planner5d.library.model.manager.config.f.SignInWithCode);
    }

    public final void q0(@NotNull androidx.fragment.app.s fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        n2.f217166b.J();
        this.f134863a.a(fragmentActivity);
    }

    public final void s0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(null), 3, null);
    }

    public final void t0(@Nullable Integer num) {
        this.f134870h = num;
    }
}
