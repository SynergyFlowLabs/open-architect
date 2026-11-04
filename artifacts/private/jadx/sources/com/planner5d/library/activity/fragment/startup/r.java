package com.planner5d.library.activity.fragment.startup;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.v2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136511e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f136512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f136513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f136514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v2 f136515d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupOnboardingProvider", f = "StartupOnboardingProvider.kt", i = {0, 1}, l = {18, 18, 19}, m = "requireOnboarding", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f136517b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f136519d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136517b = obj;
            this.f136519d |= Integer.MIN_VALUE;
            return r.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupOnboardingProvider", f = "StartupOnboardingProvider.kt", i = {0}, l = {35}, m = "shouldShowOnboarding", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f136521b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f136523d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136521b = obj;
            this.f136523d |= Integer.MIN_VALUE;
            return r.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupOnboardingProvider", f = "StartupOnboardingProvider.kt", i = {0, 0, 1}, l = {28, 28, 31}, m = "waitOnboardingFinish", n = {"this", "isAborted", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f136526c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136528e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136526c = obj;
            this.f136528e |= Integer.MIN_VALUE;
            return r.this.g(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> showOnboarding) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(showOnboarding, "showOnboarding");
        this.f136512a = preferences;
        this.f136513b = featureConfigManager;
        this.f136514c = showOnboarding;
        this.f136515d = new v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(kotlin.coroutines.d<? super Boolean> dVar) {
        return this.f136512a.G(com.planner5d.library.services.r.onboardingClosed, false, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[PHI: r6
      0x0067: PHI (r6v2 'this' com.planner5d.library.activity.fragment.startup.r) = 
      (r6v0 'this' com.planner5d.library.activity.fragment.startup.r A[IMMUTABLE_TYPE, THIS])
      (r6v5 'this' com.planner5d.library.activity.fragment.startup.r)
     binds: [B:15:0x004c, B:20:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object f(kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f136523d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f136523d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objG = bVar.f136521b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f136523d;
        boolean z10 = false;
        if (i11 == 0) {
            ResultKt.m(objG);
            if (this.f136513b.a(com.planner5d.library.model.manager.config.f.Onboarding)) {
                com.planner5d.library.model.manager.config.p pVar = this.f136512a;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.spacesProjectWasFound;
                bVar.f136520a = this;
                bVar.f136523d = 1;
                objG = pVar.G(rVar, false, bVar);
                if (objG == objL) {
                    return objL;
                }
            } else if (this.f136513b.a(com.planner5d.library.model.manager.config.f.Spaces) && !this.f136513b.a(com.planner5d.library.model.manager.config.f.OnboardingNew)) {
                z10 = true;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (r) bVar.f136520a;
        ResultKt.m(objG);
        if (!((Boolean) objG).booleanValue()) {
            z10 = true;
        } else if (this.f136513b.a(com.planner5d.library.model.manager.config.f.Spaces)) {
            z10 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r7.invoke(r0) == r1) goto L30;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.planner5d.library.activity.fragment.startup.r.a
            if (r0 == 0) goto L15
            r0 = r8
            com.planner5d.library.activity.fragment.startup.r$a r0 = (com.planner5d.library.activity.fragment.startup.r.a) r0
            r6 = 7
            int r1 = r0.f136519d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f136519d = r1
            r6 = 7
            goto L1a
        L15:
            com.planner5d.library.activity.fragment.startup.r$a r0 = new com.planner5d.library.activity.fragment.startup.r$a
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f136517b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f136519d
            r3 = 3
            r6 = 6
            r4 = 2
            r6 = 1
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            r6 = 4
            kotlin.ResultKt.m(r8)
            goto L90
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.f136516a
            r6 = 4
            com.planner5d.library.activity.fragment.startup.r r7 = (com.planner5d.library.activity.fragment.startup.r) r7
            kotlin.ResultKt.m(r8)
            goto L77
        L46:
            java.lang.Object r7 = r0.f136516a
            com.planner5d.library.activity.fragment.startup.r r7 = (com.planner5d.library.activity.fragment.startup.r) r7
            kotlin.ResultKt.m(r8)
            goto L61
        L4e:
            r6 = 2
            kotlin.ResultKt.m(r8)
            r6 = 3
            r0.f136516a = r7
            r0.f136519d = r5
            r6 = 5
            java.lang.Object r8 = r7.f(r0)
            r6 = 4
            if (r8 != r1) goto L61
            r6 = 2
            goto L8f
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r6 = 3
            if (r8 == 0) goto L94
            r0.f136516a = r7
            r6 = 5
            r0.f136519d = r4
            java.lang.Object r8 = r7.c(r0)
            r6 = 1
            if (r8 != r1) goto L77
            goto L8f
        L77:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r6 = 0
            if (r8 != 0) goto L94
            kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r7 = r7.f136514c
            r8 = 0
            r0.f136516a = r8
            r0.f136519d = r3
            r6 = 2
            java.lang.Object r7 = r7.invoke(r0)
            r6 = 2
            if (r7 != r1) goto L90
        L8f:
            return r1
        L90:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 2
            return r7
        L94:
            r6 = 1
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.r.d(kotlin.coroutines.d):java.lang.Object");
    }

    public final void e() {
        this.f136515d.b();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        if (r8.a(r0) == r1) goto L35;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.planner5d.library.activity.fragment.startup.r.c
            if (r0 == 0) goto L13
            r0 = r10
            com.planner5d.library.activity.fragment.startup.r$c r0 = (com.planner5d.library.activity.fragment.startup.r.c) r0
            int r1 = r0.f136528e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136528e = r1
            goto L1a
        L13:
            r7 = 4
            com.planner5d.library.activity.fragment.startup.r$c r0 = new com.planner5d.library.activity.fragment.startup.r$c
            r7 = 3
            r0.<init>(r10)
        L1a:
            r7 = 4
            java.lang.Object r10 = r0.f136526c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f136528e
            r7 = 2
            r3 = 0
            r7 = 5
            r4 = 3
            r5 = 7
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5f
            r7 = 4
            if (r2 == r6) goto L4f
            r7 = 2
            if (r2 == r5) goto L44
            if (r2 != r4) goto L39
            r7 = 2
            kotlin.ResultKt.m(r10)
            goto Lb2
        L39:
            r7 = 7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 2
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            r7 = 1
            throw r8
        L44:
            r7 = 7
            java.lang.Object r8 = r0.f136524a
            com.planner5d.library.activity.fragment.startup.r r8 = (com.planner5d.library.activity.fragment.startup.r) r8
            r7 = 6
            kotlin.ResultKt.m(r10)
            r7 = 0
            goto L98
        L4f:
            java.lang.Object r8 = r0.f136525b
            r9 = r8
            r9 = r8
            r7 = 1
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7 = 4
            java.lang.Object r8 = r0.f136524a
            com.planner5d.library.activity.fragment.startup.r r8 = (com.planner5d.library.activity.fragment.startup.r) r8
            kotlin.ResultKt.m(r10)
            goto L71
        L5f:
            kotlin.ResultKt.m(r10)
            r7 = 0
            r0.f136524a = r8
            r0.f136525b = r9
            r0.f136528e = r6
            java.lang.Object r10 = r8.f(r0)
            if (r10 != r1) goto L71
            r7 = 6
            goto Lb0
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r7 = 2
            if (r10 == 0) goto Lb7
            r7 = 7
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r7 = 4
            if (r9 != 0) goto Lb7
            r0.f136524a = r8
            r7 = 5
            r0.f136525b = r3
            r7 = 3
            r0.f136528e = r5
            java.lang.Object r10 = r8.c(r0)
            r7 = 4
            if (r10 != r1) goto L98
            goto Lb0
        L98:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            r7 = 3
            if (r9 == 0) goto La2
            goto Lb7
        La2:
            r7 = 1
            com.planner5d.library.services.utility.v2 r8 = r8.f136515d
            r7 = 2
            r0.f136524a = r3
            r0.f136528e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto Lb2
        Lb0:
            r7 = 7
            return r1
        Lb2:
            r7 = 1
            kotlin.Unit r8 = kotlin.Unit.f312394a
            r7 = 4
            return r8
        Lb7:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.r.g(kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }
}
