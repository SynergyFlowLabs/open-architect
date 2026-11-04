package com.planner5d.library.uploadplan.view;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.uploadplan.view.dialog.RecognitionInProgressDialog;
import java.util.Arrays;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends com.planner5d.library.activity.fragment.projects.e0 {

    @NotNull
    private final androidx.lifecycle.w0<c> H1;

    @NotNull
    private final com.planner5d.library.uploadplan.view.dialog.a X;

    @NotNull
    private final com.planner5d.library.model.manager.config.j Y;

    @NotNull
    private final kotlin.f0 Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<com.planner5d.library.uploadplan.view.c>> f231054g3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final v1.a<b> f231055p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b> f231056p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final c1<List<com.planner5d.library.uploadplan.view.c>> f231057p2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f231058t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f231059v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final e4 f231060w;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanCreateViewModel$1", f = "UploadPlanCreateViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f231061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f231062b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f231062b;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1 c1Var2 = l.this.f231057p2;
                l lVar = l.this;
                this.f231061a = c1Var2;
                this.f231062b = 1;
                Object objD0 = lVar.D0(this);
                if (objD0 == objL) {
                    return objL;
                }
                obj = objD0;
                c1Var = c1Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (c1) this.f231061a;
                ResultKt.m(obj);
            }
            c1Var.r(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public enum b {
        Back,
        Create,
        Upload,
        SmartWizard;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f231069f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f231069f;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f231070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.activity.fragment.list.b0.a[] f231071b;

        public c(boolean z10, @NotNull com.planner5d.library.activity.fragment.list.b0.a[] actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f231070a = z10;
            this.f231071b = actions;
        }

        public static /* synthetic */ c d(c cVar, boolean z10, com.planner5d.library.activity.fragment.list.b0.a[] aVarArr, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = cVar.f231070a;
            }
            if ((i10 & 2) != 0) {
                aVarArr = cVar.f231071b;
            }
            return cVar.c(z10, aVarArr);
        }

        public final boolean a() {
            return this.f231070a;
        }

        @NotNull
        public final com.planner5d.library.activity.fragment.list.b0.a[] b() {
            return this.f231071b;
        }

        @NotNull
        public final c c(boolean z10, @NotNull com.planner5d.library.activity.fragment.list.b0.a[] actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new c(z10, actions);
        }

        @NotNull
        public final com.planner5d.library.activity.fragment.list.b0.a[] e() {
            return this.f231071b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f231070a == cVar.f231070a && Intrinsics.areEqual(this.f231071b, cVar.f231071b);
        }

        public final boolean f() {
            return this.f231070a;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f231070a) * 31) + Arrays.hashCode(this.f231071b);
        }

        @NotNull
        public String toString() {
            return "State(inProgress=" + this.f231070a + ", actions=" + Arrays.toString(this.f231071b) + ")";
        }

        public /* synthetic */ c(boolean z10, com.planner5d.library.activity.fragment.list.b0.a[] aVarArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, (i10 & 2) != 0 ? new com.planner5d.library.activity.fragment.list.b0.a[0] : aVarArr);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231072a;

        static {
            int[] iArr = new int[com.planner5d.library.uploadplan.view.c.a.values().length];
            try {
                iArr[com.planner5d.library.uploadplan.view.c.a.FromScratch.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.uploadplan.view.c.a.UploadPlan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 2 & 3;
                iArr[com.planner5d.library.uploadplan.view.c.a.SmartWizard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f231072a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanCreateViewModel$checkRecognitionQueue$1", f = "UploadPlanCreateViewModel.kt", i = {}, l = {121, 125}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f231073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f231074b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l lVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f231074b;
            if (i10 == 0) {
                ResultKt.m(obj);
                l.this.K0(true);
                com.planner5d.library.uploadplan.view.dialog.a aVar = l.this.X;
                this.f231074b = 1;
                obj = aVar.a(this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (l) this.f231073a;
                ResultKt.m(obj);
            }
            lVar.f231055p0.o(b.Upload);
            l.this.K0(false);
            return Unit.f312394a;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                l lVar2 = l.this;
                if (!bool.booleanValue()) {
                    com.planner5d.library.model.manager.config.p pVar = lVar2.f231059v;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.uploadPlanNew;
                    this.f231073a = lVar2;
                    this.f231074b = 2;
                    if (pVar.L(rVar, false, this) != objL) {
                        lVar = lVar2;
                        lVar.f231055p0.o(b.Upload);
                    }
                    return objL;
                }
                lVar2.f231058t.c(RecognitionInProgressDialog.class).g();
            }
            l.this.K0(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanCreateViewModel$createItemsList$2", f = "UploadPlanCreateViewModel.kt", i = {0}, l = {101, com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240"}, s = {"L$2"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.uploadplan.view.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f231076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f231077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f231078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f231083h;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.uploadplan.view.c>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<com.planner5d.library.uploadplan.view.c>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:23:0x00f4  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l lVar;
            List listCreateListBuilder;
            List list;
            List list2;
            Object objG;
            int i10;
            int i11;
            l lVar2;
            int i12;
            int i13;
            int i14;
            int i15;
            Object objG2;
            List list3;
            int i16;
            int i17;
            int i18;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i19 = this.f231083h;
            if (i19 != 0) {
                if (i19 == 1) {
                    int i20 = this.f231082g;
                    int i21 = this.f231081f;
                    int i22 = this.f231080e;
                    listCreateListBuilder = (List) this.f231079d;
                    List list4 = (List) this.f231078c;
                    List list5 = (List) this.f231077b;
                    l lVar3 = (l) this.f231076a;
                    ResultKt.m(obj);
                    i10 = i21;
                    i11 = i22;
                    list2 = list5;
                    lVar2 = lVar3;
                    i12 = i20;
                    list = list4;
                    objG = obj;
                } else {
                    if (i19 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i23 = this.f231082g;
                    int i24 = this.f231081f;
                    int i25 = this.f231080e;
                    list3 = (List) this.f231077b;
                    List list6 = (List) this.f231076a;
                    ResultKt.m(obj);
                    list2 = list6;
                    i18 = i23;
                    i17 = i24;
                    i16 = i25;
                    objG2 = obj;
                }
                list3.add(new com.planner5d.library.uploadplan.view.c(i18, i17, i16, ((Boolean) objG2).booleanValue(), com.planner5d.library.uploadplan.view.c.a.SmartWizard));
                return CollectionsKt.build(list2);
            }
            ResultKt.m(obj);
            lVar = l.this;
            listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(new com.planner5d.library.uploadplan.view.c(he.b.s.P0, he.b.s.C1, he.b.h.f282751v9, false, com.planner5d.library.uploadplan.view.c.a.FromScratch));
            if (!lVar.Y.a(com.planner5d.library.model.manager.config.f.UploadPlan)) {
                list = listCreateListBuilder;
                list2 = list;
                if (lVar.Y.a(com.planner5d.library.model.manager.config.f.SmartWizard)) {
                    i13 = he.b.s.lw;
                    i14 = he.b.s.kw;
                    i15 = he.b.h.Zb;
                    com.planner5d.library.model.manager.config.p pVar = lVar.f231059v;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.smartWizardNew;
                    this.f231076a = list2;
                    this.f231077b = list;
                    this.f231078c = null;
                    this.f231079d = null;
                    this.f231080e = i15;
                    this.f231081f = i14;
                    this.f231082g = i13;
                    this.f231083h = 2;
                    objG2 = pVar.G(rVar, true, this);
                    if (objG2 != objL) {
                        list3 = list;
                        i16 = i15;
                        i17 = i14;
                        i18 = i13;
                        list3.add(new com.planner5d.library.uploadplan.view.c(i18, i17, i16, ((Boolean) objG2).booleanValue(), com.planner5d.library.uploadplan.view.c.a.SmartWizard));
                    }
                }
                return CollectionsKt.build(list2);
            }
            int i26 = he.b.s.f284047g1;
            int i27 = he.b.s.f284335s0;
            int i28 = he.b.h.f282714tc;
            com.planner5d.library.model.manager.config.p pVar2 = lVar.f231059v;
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.uploadPlanNew;
            this.f231076a = lVar;
            this.f231077b = listCreateListBuilder;
            this.f231078c = listCreateListBuilder;
            this.f231079d = listCreateListBuilder;
            this.f231080e = i28;
            this.f231081f = i27;
            this.f231082g = i26;
            this.f231083h = 1;
            objG = pVar2.G(rVar2, true, this);
            if (objG != objL) {
                i10 = i27;
                i11 = i28;
                list2 = listCreateListBuilder;
                lVar2 = lVar;
                i12 = i26;
                list = list2;
            }
            return objL;
            listCreateListBuilder.add(new com.planner5d.library.uploadplan.view.c(i12, i10, i11, ((Boolean) objG).booleanValue(), com.planner5d.library.uploadplan.view.c.a.UploadPlan));
            lVar = lVar2;
            if (lVar.Y.a(com.planner5d.library.model.manager.config.f.SmartWizard)) {
                i13 = he.b.s.lw;
                i14 = he.b.s.kw;
                i15 = he.b.h.Zb;
                com.planner5d.library.model.manager.config.p pVar3 = lVar.f231059v;
                com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.smartWizardNew;
                this.f231076a = list2;
                this.f231077b = list;
                this.f231078c = null;
                this.f231079d = null;
                this.f231080e = i15;
                this.f231081f = i14;
                this.f231082g = i13;
                this.f231083h = 2;
                objG2 = pVar3.G(rVar3, true, this);
                if (objG2 != objL) {
                    list3 = list;
                    i16 = i15;
                    i17 = i14;
                    i18 = i13;
                    list3.add(new com.planner5d.library.uploadplan.view.c(i18, i17, i16, ((Boolean) objG2).booleanValue(), com.planner5d.library.uploadplan.view.c.a.SmartWizard));
                }
                return objL;
            }
            return CollectionsKt.build(list2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<com.planner5d.library.uploadplan.view.c>> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.UploadPlanCreateViewModel$navigate$1", f = "UploadPlanCreateViewModel.kt", i = {}, l = {androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f231085a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f231085a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = l.this.f231059v;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.smartWizardNew;
                this.f231085a = 1;
                if (pVar.L(rVar, false, this) == objL) {
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
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public l(@NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager, @NotNull e4 events, @NotNull com.planner5d.library.uploadplan.view.dialog.a checkUploadQueueHelper, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull y1 menuManager, @NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull b2 messageManager, @Nullable com.planner5d.library.activity.fragment.projects.z0 z0Var, @NotNull com.planner5d.library.activity.fragment.projects.h importProjectUseCase, @NotNull le.e handleNewIntentUseCase, @NotNull com.planner5d.library.model.manager.c0 folderManager, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull com.planner5d.library.application.d configuration, @NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider) {
        super(application, projectManager, userAuthorization, userPurchases, messageManager, configuration, navigator, folderManager, menuManager, z0Var, handleNewIntentUseCase, importProjectUseCase, defaultFragmentProvider, featureConfigManager, sharedPreferencesManager);
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(checkUploadQueueHelper, "checkUploadQueueHelper");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(importProjectUseCase, "importProjectUseCase");
        Intrinsics.checkNotNullParameter(handleNewIntentUseCase, "handleNewIntentUseCase");
        Intrinsics.checkNotNullParameter(folderManager, "folderManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        this.f231058t = dialogLauncher;
        this.f231059v = sharedPreferencesManager;
        this.f231060w = events;
        this.X = checkUploadQueueHelper;
        this.Y = featureConfigManager;
        this.Z = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.uploadplan.view.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.A0(this.f231052a);
            }
        });
        v1.a<b> aVarJ = v1.f229769a.j(null);
        this.f231055p0 = aVarJ;
        this.f231056p1 = aVarJ;
        this.H1 = new c1(new c(false, null, 2, 0 == true ? 1 : 0));
        c1<List<com.planner5d.library.uploadplan.view.c>> c1Var = new c1<>();
        this.f231057p2 = c1Var;
        this.f231054g3 = c1Var;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.activity.fragment.list.b0 A0(final l lVar) {
        return new com.planner5d.library.activity.fragment.list.b0(g2.a(lVar), new Function1() { // from class: com.planner5d.library.uploadplan.view.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.B0(this.f231051a, (com.planner5d.library.activity.fragment.list.b0.a[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit B0(l lVar, com.planner5d.library.activity.fragment.list.b0.a[] it) {
        Unit unit;
        Intrinsics.checkNotNullParameter(it, "it");
        synchronized (lVar.H1) {
            androidx.lifecycle.w0<c> w0Var = lVar.H1;
            Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.uploadplan.view.UploadPlanCreateViewModel.State>");
            T tF = ((c1) lVar.H1).f();
            Intrinsics.checkNotNull(tF);
            ((c1) w0Var).r(c.d((c) tF, false, it, 1, null));
            unit = Unit.f312394a;
        }
        return unit;
    }

    private final p2 C0() {
        return kotlinx.coroutines.k.f(g2.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D0(kotlin.coroutines.d<? super List<com.planner5d.library.uploadplan.view.c>> dVar) {
        int i10 = 2 >> 0;
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new f(null), dVar);
    }

    public static /* synthetic */ void M0(l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        lVar.L0(z10);
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.list.b0 E0() {
        return (com.planner5d.library.activity.fragment.list.b0) this.Z.getValue();
    }

    @NotNull
    public final androidx.lifecycle.w0<List<com.planner5d.library.uploadplan.view.c>> G0() {
        return this.f231054g3;
    }

    @NotNull
    public final androidx.lifecycle.w0<b> H0() {
        return this.f231056p1;
    }

    @NotNull
    public final androidx.lifecycle.w0<c> I0() {
        return this.H1;
    }

    public final void J0(@NotNull com.planner5d.library.uploadplan.view.c.a tile) {
        b bVar;
        Intrinsics.checkNotNullParameter(tile, "tile");
        v1.a<b> aVar = this.f231055p0;
        int i10 = d.f231072a[tile.ordinal()];
        if (i10 != 1) {
            bVar = null;
            if (i10 == 2) {
                C0();
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                kotlinx.coroutines.k.f(g2.a(this), null, null, new g(null), 3, null);
                bVar = b.SmartWizard;
            }
        } else {
            bVar = b.Create;
        }
        aVar.r(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(boolean z10) {
        androidx.lifecycle.w0<c> w0Var = this.H1;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.uploadplan.view.UploadPlanCreateViewModel.State>");
        ((c1) w0Var).o(new c(z10, null, 2, 0 == true ? 1 : 0));
    }

    public final void L0(boolean z10) {
        this.f231060w.S(z10);
    }

    @Override // com.planner5d.library.activity.fragment.projects.e0
    @NotNull
    public com.planner5d.library.activity.helper.event.content.c j0(@NotNull Bundle state, @NotNull com.planner5d.library.activity.helper.event.content.e animation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(animation, "animation");
        throw new RuntimeException("Not Implemented");
    }
}
