package com.planner5d.library.model.manager.appupdate;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.runtime.internal.w0;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.install.InstallState;
import com.planner5d.library.activity.Main;
import com.planner5d.library.model.manager.config.j;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nInAppUpdateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppUpdateManager.kt\ncom/planner5d/library/model/manager/appupdate/InAppUpdateManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class h implements x1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final a f180817k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f180818l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f180819m = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j f180820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p f180821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f1 f180822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.play.core.appupdate.b f180823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private WeakReference<androidx.activity.result.h<IntentSenderRequest>> f180824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private WeakReference<Main> f180825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.google.android.play.core.install.b f180826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f180827j;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.appupdate.InAppUpdateManager$launchUpdatePromptIfNeeded$1", f = "InAppUpdateManager.kt", i = {}, l = {me.relex.circleindicator.a.f332619e, 119}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180828a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.android.play.core.appupdate.a f180830c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.google.android.play.core.appupdate.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f180830c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new b(this.f180830c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            if (r7.r(r1, r3, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 2
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 1
                int r1 = r6.f180828a
                r2 = 2
                r5 = 6
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r7)
                goto L66
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 0
                r6.<init>(r7)
                throw r6
            L1e:
                kotlin.ResultKt.m(r7)
                goto L33
            L22:
                kotlin.ResultKt.m(r7)
                r5 = 2
                com.planner5d.library.model.manager.appupdate.h r7 = com.planner5d.library.model.manager.appupdate.h.this
                com.google.android.play.core.appupdate.a r1 = r6.f180830c
                r6.f180828a = r3
                java.lang.Object r7 = com.planner5d.library.model.manager.appupdate.h.q(r7, r1, r6)
                if (r7 != r0) goto L33
                goto L65
            L33:
                r5 = 0
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                r5 = 5
                if (r7 == 0) goto Lb1
                timber.log.b$b r7 = timber.log.b.f381052a
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r5 = 6
                java.lang.String r3 = "Update available!"
                r5 = 1
                r7.a(r3, r1)
                com.planner5d.library.model.manager.appupdate.h r7 = com.planner5d.library.model.manager.appupdate.h.this
                com.planner5d.library.model.manager.config.p r7 = com.planner5d.library.model.manager.appupdate.h.o(r7)
                r5 = 7
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.lastUpdatePromptTime
                java.util.Date r3 = new java.util.Date
                r3.<init>()
                long r3 = r3.getTime()
                r5 = 7
                r6.f180828a = r2
                r5 = 3
                java.lang.Object r7 = r7.r(r1, r3, r6)
                if (r7 != r0) goto L66
            L65:
                return r0
            L66:
                com.planner5d.library.model.manager.appupdate.h r7 = com.planner5d.library.model.manager.appupdate.h.this
                r5 = 3
                org.json.JSONObject r0 = com.planner5d.library.model.manager.appupdate.h.l(r7)
                r5 = 4
                int r7 = com.planner5d.library.model.manager.appupdate.h.p(r7, r0)
                com.google.android.play.core.appupdate.d$a r7 = com.google.android.play.core.appupdate.d.d(r7)
                r5 = 6
                com.google.android.play.core.appupdate.d r7 = r7.a()
                java.lang.String r0 = "dbsi.)(u.l"
                java.lang.String r0 = "build(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
                com.planner5d.library.model.manager.appupdate.h r0 = com.planner5d.library.model.manager.appupdate.h.this
                r5 = 5
                com.google.android.play.core.appupdate.b r0 = com.planner5d.library.model.manager.appupdate.h.k(r0)
                if (r0 != 0) goto L93
                java.lang.String r0 = "prameUptpa"
                java.lang.String r0 = "appUpdater"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
            L93:
                r5 = 2
                com.google.android.play.core.appupdate.a r1 = r6.f180830c
                com.planner5d.library.model.manager.appupdate.h r6 = com.planner5d.library.model.manager.appupdate.h.this
                java.lang.ref.WeakReference r6 = com.planner5d.library.model.manager.appupdate.h.j(r6)
                if (r6 == 0) goto Lae
                r5 = 7
                java.lang.Object r6 = r6.get()
                r5 = 7
                androidx.activity.result.h r6 = (androidx.activity.result.h) r6
                if (r6 != 0) goto La9
                goto Lae
            La9:
                r0.a(r1, r6, r7)
                r5 = 0
                goto Lb1
            Lae:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            Lb1:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.appupdate.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.appupdate.InAppUpdateManager$onResume$1", f = "InAppUpdateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180831a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180831a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            timber.log.b.f381052a.a("onResume inProgress=" + h.this.f180827j, new Object[0]);
            if (h.this.f180820c.a(com.planner5d.library.model.manager.config.f.TriggerAppUpdate) && !h.this.f180827j) {
                com.google.android.play.core.appupdate.b bVar = h.this.f180823f;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appUpdater");
                    bVar = null;
                }
                bVar.h(h.this.z());
                h.this.r();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.appupdate.InAppUpdateManager", f = "InAppUpdateManager.kt", i = {0, 0, 0, 0, 0}, l = {130}, m = "updateAvailable", n = {"this", "appUpdateInfo", "featureConfig", "daysToRepeatPrompt", "availability"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f180835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180838f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f180840h;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180838f = obj;
            this.f180840h |= Integer.MIN_VALUE;
            return h.this.J(null, this);
        }
    }

    @ij.a
    public h(@NotNull j featureConfigManager, @NotNull p sharedPreferencesManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f180820c = featureConfigManager;
        this.f180821d = sharedPreferencesManager;
        this.f180822e = coroutineScope;
        this.f180826i = new com.google.android.play.core.install.b() { // from class: com.planner5d.library.model.manager.appupdate.b
            @Override // f7.a
            public final void a(InstallState installState) {
                h.C(this.f180811a, installState);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        boolean z10 = false | true;
        return jSONObject.optBoolean(r.immediate.f224891a, false) ? 1 : 0;
    }

    private final void B(com.google.android.play.core.appupdate.a aVar) {
        k.f(this.f180822e, s.f229729a.a(), null, new b(aVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(h hVar, InstallState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.c() == 2) {
            hVar.f180827j = true;
        }
        if (state.c() == 11) {
            hVar.H();
            hVar.f180827j = true;
        }
        if (state.c() == 3) {
            timber.log.b.f381052a.a("Update INSTALLING", new Object[0]);
            hVar.f180827j = true;
        }
        if (state.c() == 4) {
            timber.log.b.f381052a.a("Update INSTALLED", new Object[0]);
            hVar.f180827j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(h hVar, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.b() == -1) {
            timber.log.b.f381052a.a("Update flow OK! Result code: " + result.b(), new Object[0]);
            return;
        }
        timber.log.b.f381052a.a("Update flow failed! Result code: " + result.b(), new Object[0]);
        com.google.android.play.core.appupdate.b bVar = hVar.f180823f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appUpdater");
            bVar = null;
        }
        bVar.j(hVar.f180826i);
    }

    private final void H() {
        Main main;
        WeakReference<Main> weakReference = this.f180825h;
        if (weakReference == null || (main = weakReference.get()) == null) {
            return;
        }
        Snackbar snackbarD0 = Snackbar.D0(main.I().getRoot(), main.getString(com.planner5d.library.f.s.Pd), -2);
        String string = main.getString(com.planner5d.library.f.s.Od);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        snackbarD0.G0(upperCase, new View.OnClickListener() { // from class: com.planner5d.library.model.manager.appupdate.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.I(this.f180810a, view);
            }
        });
        snackbarD0.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(h hVar, View view) {
        com.google.android.play.core.appupdate.b bVar = hVar.f180823f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appUpdater");
            bVar = null;
        }
        bVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J(com.google.android.play.core.appupdate.a aVar, kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        int iX;
        int iJ;
        JSONObject jSONObject;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f180840h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f180840h = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f180838f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f180840h;
        if (i11 == 0) {
            ResultKt.m(obj);
            JSONObject jSONObjectY = y();
            iX = x(jSONObjectY);
            iJ = aVar.j();
            p pVar = this.f180821d;
            r rVar = r.lastUpdatePromptTime;
            dVar2.f180833a = this;
            dVar2.f180834b = aVar;
            dVar2.f180835c = jSONObjectY;
            dVar2.f180836d = iX;
            dVar2.f180837e = iJ;
            dVar2.f180840h = 1;
            Object objO = pVar.o(rVar, 0L, dVar2);
            if (objO == objL) {
                return objL;
            }
            jSONObject = jSONObjectY;
            obj = objO;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = dVar2.f180837e;
            int i13 = dVar2.f180836d;
            jSONObject = (JSONObject) dVar2.f180835c;
            com.google.android.play.core.appupdate.a aVar2 = (com.google.android.play.core.appupdate.a) dVar2.f180834b;
            h hVar = (h) dVar2.f180833a;
            ResultKt.m(obj);
            iX = i13;
            aVar = aVar2;
            iJ = i12;
            this = hVar;
        }
        int time = (int) ((new Date().getTime() - ((Number) obj).longValue()) / 86400000);
        boolean zF = aVar.f(this.A(jSONObject));
        timber.log.b.f381052a.a("Update info: availability=" + iJ + ", daysPassed=" + time + ", daysToRepeatPrompt=" + iX, new Object[0]);
        return kotlin.coroutines.jvm.internal.b.a(iJ == 2 && time >= iX && zF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(h hVar, com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNull(aVar);
        hVar.B(aVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(h hVar, Exception appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        timber.log.b.f381052a.a("Update failure info " + appUpdateInfo.getMessage(), new Object[0]);
        com.google.android.play.core.appupdate.b bVar = hVar.f180823f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appUpdater");
            bVar = null;
        }
        bVar.j(hVar.f180826i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(h hVar) {
        timber.log.b.f381052a.a("Update canceled", new Object[0]);
        com.google.android.play.core.appupdate.b bVar = hVar.f180823f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appUpdater");
            bVar = null;
        }
        bVar.j(hVar.f180826i);
    }

    private final int x(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject.optInt(r.daysToRepeat.f224891a, 2) : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject y() {
        com.planner5d.library.model.manager.config.g gVarB = this.f180820c.b(com.planner5d.library.model.manager.config.f.TriggerAppUpdate);
        if (gVarB != null) {
            return gVarB.d();
        }
        return null;
    }

    public final void D(@NotNull Main activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f180825h = new WeakReference<>(activity);
        this.f180823f = com.google.android.play.core.appupdate.c.a(activity.getApplicationContext());
        this.f180824g = new WeakReference<>(activity.registerForActivityResult(new g.b.n(), new androidx.activity.result.a() { // from class: com.planner5d.library.model.manager.appupdate.c
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                h.E(this.f180812a, (ActivityResult) obj);
            }
        }));
    }

    public final void F() {
        k.f(this.f180822e, s.f229729a.a(), null, new c(null), 2, null);
    }

    public final void G() {
        com.google.android.play.core.appupdate.b bVar = this.f180823f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appUpdater");
            bVar = null;
        }
        bVar.j(this.f180826i);
    }

    @e.a({"BinaryOperationInTimber"})
    public final void r() {
        timber.log.b.f381052a.a("Checking update availability", new Object[0]);
        com.google.android.play.core.appupdate.b bVar = this.f180823f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appUpdater");
            bVar = null;
        }
        Task<com.google.android.play.core.appupdate.a> taskC = bVar.c();
        Intrinsics.checkNotNullExpressionValue(taskC, "getAppUpdateInfo(...)");
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.model.manager.appupdate.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.t(this.f180813a, (com.google.android.play.core.appupdate.a) obj);
            }
        };
        taskC.j(new com.google.android.gms.tasks.g() { // from class: com.planner5d.library.model.manager.appupdate.e
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                h.u(function1, obj);
            }
        });
        taskC.g(new com.google.android.gms.tasks.f() { // from class: com.planner5d.library.model.manager.appupdate.f
            @Override // com.google.android.gms.tasks.f
            public final void d(Exception exc) {
                h.v(this.f180815a, exc);
            }
        });
        taskC.b(new com.google.android.gms.tasks.e() { // from class: com.planner5d.library.model.manager.appupdate.g
            @Override // com.google.android.gms.tasks.e
            public final void a() {
                h.w(this.f180816a);
            }
        });
    }

    @NotNull
    public final com.google.android.play.core.install.b z() {
        return this.f180826i;
    }
}
