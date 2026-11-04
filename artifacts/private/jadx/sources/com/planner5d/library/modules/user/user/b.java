package com.planner5d.library.modules.user.user;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public class b implements com.planner5d.library.modules.user.user.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f222956j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<q0> f222957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.activity.fragment.dialog.k> f222958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.initialization.r f222959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.activity.fragment.x> f222960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f222961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<t> f222962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<t0> f222963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.n f222964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f222965i;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.ActionAfterLogInStandard", f = "ActionAfterLogInStandard.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "doFinalAction$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222967b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222969d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222967b = obj;
            this.f222969d |= Integer.MIN_VALUE;
            return b.c(b.this, false, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.modules.user.user.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.ActionAfterLogInStandard", f = "ActionAfterLogInStandard.kt", i = {0, 0, 1, 1, 2, 3}, l = {30, 35, 41, 41, 41}, m = "run", n = {"this", "forceHome", "this", "forceHome", "this", "this"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "L$0"})
    static final class C1646b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f222971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222972c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222974e;

        C1646b(kotlin.coroutines.d<? super C1646b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222972c = obj;
            this.f222974e |= Integer.MIN_VALUE;
            return b.this.e(false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.ActionAfterLogInStandard$runInBackground$1", f = "ActionAfterLogInStandard.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222975a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222975a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b bVar = b.this;
                this.f222975a = 1;
                if (b.f(bVar, false, this, 1, null) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b(@NotNull fg.e<q0> userProperties, @NotNull fg.e<com.planner5d.library.activity.fragment.dialog.k> dialogLauncher, @NotNull com.planner5d.library.model.manager.initialization.r initializationManager, @NotNull fg.e<com.planner5d.library.activity.fragment.x> navigator, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull fg.e<t> userAuthorization, @NotNull fg.e<t0> userPurchases, @NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider, @NotNull com.planner5d.library.services.utility.f1 globalCoroutineScope) {
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(initializationManager, "initializationManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        this.f222957a = userProperties;
        this.f222958b = dialogLauncher;
        this.f222959c = initializationManager;
        this.f222960d = navigator;
        this.f222961e = preferences;
        this.f222962f = userAuthorization;
        this.f222963g = userPurchases;
        this.f222964h = defaultFragmentProvider;
        this.f222965i = globalCoroutineScope;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[PHI: r5
      0x0073: PHI (r5v1 com.planner5d.library.modules.user.user.b) = 
      (r5v0 com.planner5d.library.modules.user.user.b)
      (r5v3 com.planner5d.library.modules.user.user.b)
      (r5v3 com.planner5d.library.modules.user.user.b)
     binds: [B:15:0x0044, B:21:0x0061, B:23:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    static /* synthetic */ Object c(b bVar, boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f222969d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f222969d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = bVar.new a(dVar);
            }
        } else {
            aVar = bVar.new a(dVar);
        }
        Object objG = aVar.f222967b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f222969d;
        if (i11 == 0) {
            ResultKt.m(objG);
            if (z10) {
                bVar.d();
            } else {
                com.planner5d.library.model.manager.config.p pVar = bVar.f222961e;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.onboardingPaywallClosed;
                aVar.f222966a = bVar;
                aVar.f222969d = 1;
                objG = pVar.G(rVar, false, aVar);
                if (objG == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = (b) aVar.f222966a;
        ResultKt.m(objG);
        if (((Boolean) objG).booleanValue() || bVar.f222963g.get().c()) {
            bVar.d();
        }
        return Unit.f312394a;
    }

    public static /* synthetic */ Object f(b bVar, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return bVar.e(z10, dVar);
    }

    @Override // com.planner5d.library.modules.user.user.a
    @kotlin.l(message = "Use suspendable run instead")
    public void a() {
        int i10 = 4 ^ 0;
        kotlinx.coroutines.k.f(this.f222965i, com.planner5d.library.services.utility.s.f229729a.h(), null, new c(null), 2, null);
    }

    @Nullable
    public Object b(boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return c(this, z10, dVar);
    }

    public void d() {
        com.planner5d.library.activity.fragment.x.g(this.f222960d.get(), new com.planner5d.library.activity.helper.event.content.d(this.f222964h.a(), new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).m(com.planner5d.library.services.r.forceSynchronize, true).a()), false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d2 A[Catch: all -> 0x0065, Exception -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:22:0x0061, B:44:0x00d2), top: B:63:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        if (r11.b(r10, r0) == r1) goto L58;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.b.e(boolean, kotlin.coroutines.d):java.lang.Object");
    }
}
