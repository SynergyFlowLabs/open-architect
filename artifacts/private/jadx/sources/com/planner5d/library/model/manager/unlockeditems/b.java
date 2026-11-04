package com.planner5d.library.model.manager.unlockeditems;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.catalog_unlock.CatalogUnlockDialog;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.model.manager.config.j;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.m5;
import com.planner5d.library.model.manager.statistics.events.l2;
import com.planner5d.library.model.manager.statistics.events.n1;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
public final class b implements m5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f222262d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f222263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f222264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f1 f222265c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.TrialUnlockManager", f = "TrialUnlockManager.kt", i = {0, 0, 0, 1, 1}, l = {28, 29}, m = "canUnlockTrial", n = {"this", "user", "purchases", "user", "purchases"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f222269d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f222271f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222269d = obj;
            this.f222271f |= Integer.MIN_VALUE;
            return b.this.e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.unlockeditems.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.TrialUnlockManager$finishTrial$1", f = "TrialUnlockManager.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class C1630b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222272a;

        C1630b(kotlin.coroutines.d<? super C1630b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C1630b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222272a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b bVar = b.this;
                this.f222272a = 1;
                if (bVar.g(this) == objL) {
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
            return ((C1630b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.TrialUnlockManager$showDialog$2", f = "TrialUnlockManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222274a;

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
            int i10 = this.f222274a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = b.this.f222263a;
                r rVar = r.trialUnlockDialogShown;
                this.f222274a = 1;
                if (pVar.L(rVar, true, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.TrialUnlockManager", f = "TrialUnlockManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "timeLeftSeconds", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f222276a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f222278c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222276a = obj;
            this.f222278c |= Integer.MIN_VALUE;
            return b.this.j(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.TrialUnlockManager$unlockCatalogTrial$1", f = "TrialUnlockManager.kt", i = {}, l = {90, com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222279a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new e(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r7.r(r1, r3, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 7
                int r1 = r6.f222279a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r7)
                goto L50
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1b:
                kotlin.ResultKt.m(r7)
                goto L37
            L1f:
                kotlin.ResultKt.m(r7)
                com.planner5d.library.model.manager.unlockeditems.b r7 = com.planner5d.library.model.manager.unlockeditems.b.this
                r5 = 2
                com.planner5d.library.model.manager.config.p r7 = com.planner5d.library.model.manager.unlockeditems.b.d(r7)
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.usedTrialUnlock
                r5 = 4
                r6.f222279a = r3
                r5 = 0
                java.lang.Object r7 = r7.L(r1, r3, r6)
                r5 = 7
                if (r7 != r0) goto L37
                goto L4e
            L37:
                com.planner5d.library.model.manager.unlockeditems.b r7 = com.planner5d.library.model.manager.unlockeditems.b.this
                r5 = 2
                com.planner5d.library.model.manager.config.p r7 = com.planner5d.library.model.manager.unlockeditems.b.d(r7)
                r5 = 4
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.trialUnlockedTime
                r5 = 2
                long r3 = java.lang.System.currentTimeMillis()
                r6.f222279a = r2
                java.lang.Object r6 = r7.r(r1, r3, r6)
                if (r6 != r0) goto L50
            L4e:
                r5 = 3
                return r0
            L50:
                r5 = 6
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.unlockeditems.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.TrialUnlockManager$updateTrialStatus$1", f = "TrialUnlockManager.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222281a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f222283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0 f222284d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(id.a aVar, t0 t0Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f222283c = aVar;
            this.f222284d = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new f(this.f222283c, this.f222284d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222281a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b bVar = b.this;
                id.a aVar = this.f222283c;
                t0 t0Var = this.f222284d;
                this.f222281a = 1;
                if (bVar.m(aVar, t0Var, this) == objL) {
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b(@NotNull p preferences, @NotNull j featureConfigManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f222263a = preferences;
        this.f222264b = featureConfigManager;
        this.f222265c = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(kotlin.coroutines.d<? super Unit> dVar) {
        Object objL = this.f222263a.L(r.trialUnlockFinished, true, dVar);
        return objL == kotlin.coroutines.intrinsics.b.l() ? objL : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(t3.c cVar, b bVar, Function0 function0, Boolean bool) {
        n1.f217163b.C0(t3.a.closed, cVar, bool);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            bVar.k();
            l2.f217094b.j();
            function0.invoke();
        }
    }

    private final void k() {
        k.f(this.f222265c, null, null, new e(null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.m5
    public boolean a() {
        return this.f222264b.a(com.planner5d.library.model.manager.config.f.UnlockCatalogTrial) && !this.f222263a.m(r.trialUnlockFinished, false) && this.f222263a.k(r.trialUnlockedTime, 0L) > System.currentTimeMillis() - 86400000;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@Nullable id.a aVar, @NotNull t0 t0Var, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        a aVar2;
        t0 t0Var2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i10 = aVar2.f222271f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f222271f = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object objG = aVar2.f222269d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f222271f;
        boolean z10 = false;
        int i12 = 6 ^ 0;
        if (i11 == 0) {
            ResultKt.m(objG);
            if (this.f222264b.a(com.planner5d.library.model.manager.config.f.UnlockCatalogTrial)) {
                p pVar = this.f222263a;
                r rVar = r.usedTrialUnlock;
                aVar2.f222266a = this;
                aVar2.f222267b = aVar;
                aVar2.f222268c = t0Var;
                aVar2.f222271f = 1;
                objG = pVar.G(rVar, false, aVar2);
                if (objG != objL) {
                }
                return objL;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 == 1) {
            t0Var = (t0) aVar2.f222268c;
            aVar = (id.a) aVar2.f222267b;
            this = (b) aVar2.f222266a;
            ResultKt.m(objG);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0Var2 = (t0) aVar2.f222267b;
            aVar = (id.a) aVar2.f222266a;
            ResultKt.m(objG);
        }
        if (!((Boolean) objG).booleanValue() && !t0Var2.b(aVar)) {
            z10 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
        if (!((Boolean) objG).booleanValue()) {
            p pVar2 = this.f222263a;
            r rVar2 = r.trialUnlockDialogShown;
            aVar2.f222266a = aVar;
            aVar2.f222267b = t0Var;
            aVar2.f222268c = null;
            aVar2.f222271f = 2;
            objG = pVar2.G(rVar2, false, aVar2);
            if (objG != objL) {
                t0Var2 = t0Var;
                if (!((Boolean) objG).booleanValue()) {
                    z10 = true;
                }
            }
            return objL;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    public final void f() {
        k.f(this.f222265c, null, null, new C1630b(null), 3, null);
    }

    public final void h(@NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull final t3.c source, @NotNull final Function0<Unit> onCatalogUnlocked) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onCatalogUnlocked, "onCatalogUnlocked");
        dialogLauncher.c(CatalogUnlockDialog.class).m(new u() { // from class: com.planner5d.library.model.manager.unlockeditems.a
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                b.i(source, this, onCatalogUnlocked, (Boolean) obj);
            }
        }).g();
        n1.f217163b.C0(t3.a.shown, source, null);
        k.f(this.f222265c, null, null, new c(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object j(@NotNull kotlin.coroutines.d<? super Integer> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f222278c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f222278c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objO = dVar2.f222276a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f222278c;
        if (i11 == 0) {
            ResultKt.m(objO);
            p pVar = this.f222263a;
            r rVar = r.trialUnlockedTime;
            dVar2.f222278c = 1;
            objO = pVar.o(rVar, 0L, dVar2);
            if (objO == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objO);
        }
        long jCurrentTimeMillis = (86400000 - (System.currentTimeMillis() - ((Number) objO).longValue())) / ((long) 1000);
        return kotlin.coroutines.jvm.internal.b.f(jCurrentTimeMillis <= 0 ? 0 : (int) jCurrentTimeMillis);
    }

    public final void l(@Nullable id.a aVar, @NotNull t0 userPurchases) {
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        int i10 = 6 & 0;
        k.f(this.f222265c, null, null, new f(aVar, userPurchases, null), 3, null);
    }

    @Nullable
    public final Object m(@Nullable id.a aVar, @NotNull t0 t0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!a() || !t0Var.b(aVar)) {
            return Unit.f312394a;
        }
        Object objG = g(dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }
}
