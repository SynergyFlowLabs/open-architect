package com.planner5d.library.activity.fragment.startup;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.v2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f136541h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f136542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f136543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c2 f136544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f136545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.b f136546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f136547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final v2 f136548g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupSpacesProvider", f = "StartupSpacesProvider.kt", i = {0, 1}, l = {24, 24, 25}, m = "askAddress", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f136550b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f136552d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136550b = obj;
            this.f136552d |= Integer.MIN_VALUE;
            return v.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupSpacesProvider", f = "StartupSpacesProvider.kt", i = {0}, l = {30}, m = "setOnboardingClosed", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f136554b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f136556d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136554b = obj;
            this.f136556d |= Integer.MIN_VALUE;
            return v.this.e(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupSpacesProvider", f = "StartupSpacesProvider.kt", i = {}, l = {44}, m = "shouldShowSpacesSearchDialog", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f136557a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f136559c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136557a = obj;
            this.f136559c |= Integer.MIN_VALUE;
            return v.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupSpacesProvider", f = "StartupSpacesProvider.kt", i = {0, 0, 1}, l = {35, 35, 38}, m = "waitAddressSearchFinish", n = {"this", "isAborted", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f136562c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136564e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136562c = obj;
            this.f136564e |= Integer.MIN_VALUE;
            return v.this.g(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.model.manager.spaces.b spacesManager, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> searchAddress) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(spacesManager, "spacesManager");
        Intrinsics.checkNotNullParameter(searchAddress, "searchAddress");
        this.f136542a = application;
        this.f136543b = featureConfigManager;
        this.f136544c = networkStateUtility;
        this.f136545d = preferences;
        this.f136546e = spacesManager;
        this.f136547f = searchAddress;
        this.f136548g = new v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(kotlin.coroutines.d<? super Boolean> dVar) {
        return this.f136545d.G(com.planner5d.library.services.r.spacesOnboardingDisplayed, false, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object f(kotlin.coroutines.d<? super Boolean> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f136559c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f136559c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA = cVar.f136557a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f136559c;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.m(objA);
            if (this.f136544c.d(this.f136542a) && this.f136543b.a(com.planner5d.library.model.manager.config.f.Spaces)) {
                com.planner5d.library.model.manager.spaces.b bVar = this.f136546e;
                cVar.f136559c = 1;
                objA = bVar.A(cVar);
                if (objA == objL) {
                    return objL;
                }
            } else {
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objA);
        if (objA != null) {
            z10 = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r7.invoke(r0) == r1) goto L32;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            r6 = 7
            boolean r0 = r8 instanceof com.planner5d.library.activity.fragment.startup.v.a
            if (r0 == 0) goto L17
            r0 = r8
            r6 = 0
            com.planner5d.library.activity.fragment.startup.v$a r0 = (com.planner5d.library.activity.fragment.startup.v.a) r0
            int r1 = r0.f136552d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r6 = 4
            int r1 = r1 - r2
            r0.f136552d = r1
            r6 = 4
            goto L1d
        L17:
            com.planner5d.library.activity.fragment.startup.v$a r0 = new com.planner5d.library.activity.fragment.startup.v$a
            r6 = 2
            r0.<init>(r8)
        L1d:
            java.lang.Object r8 = r0.f136550b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 0
            int r2 = r0.f136552d
            r3 = 3
            r6 = r6 | r3
            r4 = 2
            r5 = 1
            r6 = r5
            if (r2 == 0) goto L57
            r6 = 7
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L43
            r6 = 2
            if (r2 != r3) goto L39
            kotlin.ResultKt.m(r8)
            goto L98
        L39:
            r6 = 0
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 1
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f136549a
            com.planner5d.library.activity.fragment.startup.v r7 = (com.planner5d.library.activity.fragment.startup.v) r7
            kotlin.ResultKt.m(r8)
            r6 = 6
            goto L7f
        L4c:
            r6 = 1
            java.lang.Object r7 = r0.f136549a
            r6 = 6
            com.planner5d.library.activity.fragment.startup.v r7 = (com.planner5d.library.activity.fragment.startup.v) r7
            r6 = 7
            kotlin.ResultKt.m(r8)
            goto L66
        L57:
            r6 = 3
            kotlin.ResultKt.m(r8)
            r0.f136549a = r7
            r0.f136552d = r5
            java.lang.Object r8 = r7.f(r0)
            if (r8 != r1) goto L66
            goto L97
        L66:
            r6 = 6
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r6 = 1
            boolean r8 = r8.booleanValue()
            r6 = 2
            if (r8 == 0) goto L9c
            r0.f136549a = r7
            r6 = 7
            r0.f136552d = r4
            r6 = 7
            java.lang.Object r8 = r7.d(r0)
            r6 = 0
            if (r8 != r1) goto L7f
            goto L97
        L7f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L9c
            r6 = 3
            kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r7 = r7.f136547f
            r6 = 6
            r8 = 0
            r0.f136549a = r8
            r0.f136552d = r3
            java.lang.Object r7 = r7.invoke(r0)
            r6 = 6
            if (r7 != r1) goto L98
        L97:
            return r1
        L98:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 5
            return r7
        L9c:
            r6 = 5
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.v.c(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f136556d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f136556d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f136554b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f136556d;
        if (i11 == 0) {
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = this.f136545d;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.spacesOnboardingDisplayed;
            bVar.f136553a = this;
            bVar.f136556d = 1;
            if (pVar.L(rVar, true, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (v) bVar.f136553a;
            ResultKt.m(obj);
        }
        this.f136548g.b();
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r8.a(r0) == r1) goto L33;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            r7 = 5
            boolean r0 = r10 instanceof com.planner5d.library.activity.fragment.startup.v.d
            r7 = 5
            if (r0 == 0) goto L17
            r0 = r10
            r0 = r10
            com.planner5d.library.activity.fragment.startup.v$d r0 = (com.planner5d.library.activity.fragment.startup.v.d) r0
            int r1 = r0.f136564e
            r7 = 6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f136564e = r1
            goto L1c
        L17:
            com.planner5d.library.activity.fragment.startup.v$d r0 = new com.planner5d.library.activity.fragment.startup.v$d
            r0.<init>(r10)
        L1c:
            r7 = 5
            java.lang.Object r10 = r0.f136562c
            r7 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f136564e
            r7 = 7
            r3 = 0
            r4 = 3
            r7 = 3
            r5 = 2
            r7 = 2
            r6 = 1
            if (r2 == 0) goto L5a
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L42
            if (r2 != r4) goto L39
            kotlin.ResultKt.m(r10)
            goto Lab
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            r7 = 5
            throw r8
        L42:
            java.lang.Object r8 = r0.f136560a
            r7 = 3
            com.planner5d.library.activity.fragment.startup.v r8 = (com.planner5d.library.activity.fragment.startup.v) r8
            kotlin.ResultKt.m(r10)
            goto L92
        L4b:
            r7 = 1
            java.lang.Object r8 = r0.f136561b
            r9 = r8
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            java.lang.Object r8 = r0.f136560a
            com.planner5d.library.activity.fragment.startup.v r8 = (com.planner5d.library.activity.fragment.startup.v) r8
            r7 = 1
            kotlin.ResultKt.m(r10)
            goto L6d
        L5a:
            kotlin.ResultKt.m(r10)
            r0.f136560a = r8
            r7 = 2
            r0.f136561b = r9
            r7 = 5
            r0.f136564e = r6
            java.lang.Object r10 = r8.f(r0)
            r7 = 6
            if (r10 != r1) goto L6d
            goto La9
        L6d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Laf
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r7 = 7
            if (r9 != 0) goto Laf
            r7 = 0
            r0.f136560a = r8
            r0.f136561b = r3
            r7 = 2
            r0.f136564e = r5
            java.lang.Object r10 = r8.d(r0)
            if (r10 != r1) goto L92
            r7 = 6
            goto La9
        L92:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L9b
            goto Laf
        L9b:
            com.planner5d.library.services.utility.v2 r8 = r8.f136548g
            r7 = 7
            r0.f136560a = r3
            r0.f136564e = r4
            java.lang.Object r8 = r8.a(r0)
            r7 = 1
            if (r8 != r1) goto Lab
        La9:
            r7 = 4
            return r1
        Lab:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            r7 = 2
            return r8
        Laf:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.v.g(kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }
}
