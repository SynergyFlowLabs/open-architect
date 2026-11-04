package com.planner5d.library.activity.fragment.smartwizard.decorator;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.smartwizard.s;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.activity.helper.r;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.n3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDecoratorViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecoratorViewModel.kt\ncom/planner5d/library/activity/fragment/smartwizard/decorator/DecoratorViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public final class l extends s implements StatisticsEventAiDesigner {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f135444o3 = 8;

    @NotNull
    private final c1<JSONObject> H1;

    @NotNull
    private final c1<com.planner5d.library.activity.fragment.smartwizard.d> X;

    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.smartwizard.d> Y;

    @NotNull
    private final c1<List<com.planner5d.library.smartwizard.data.a>> Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private List<com.planner5d.library.smartwizard.data.a> f135445g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f135446h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private List<String> f135447i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f135448j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private p2 f135449k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final c1<Exception> f135450l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Exception> f135451m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ StatisticsEventAiDesigner f135452n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private StatisticsEventAiDesigner.EventData f135453n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final ma.a f135454o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<com.planner5d.library.smartwizard.data.a>> f135455p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final j2 f135456p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<JSONObject> f135457p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final pa.c f135458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final ce.a f135459t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final c2 f135460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final r f135461w;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135462a;

        static {
            int[] iArr = new int[com.planner5d.library.activity.fragment.smartwizard.b.values().length];
            try {
                iArr[com.planner5d.library.activity.fragment.smartwizard.b.Finished.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.smartwizard.b.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f135462a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.decorator.DecoratorViewModel$decorate$1", f = "DecoratorViewModel.kt", i = {}, l = {151, 152}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135463a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f135465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.smartwizard.data.b f135466d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f135467a;

            /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.decorator.l$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1489a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f135468a;

                static {
                    int[] iArr = new int[com.planner5d.library.activity.fragment.smartwizard.b.values().length];
                    try {
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.UploadingDataToGetQueueName.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.ConnectingToQueue.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.ConnectedWaitingForData.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.Error.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.LoadedData.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.Finished.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f135468a = iArr;
                }
            }

            a(l lVar) {
                this.f135467a = lVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends JSONObject> pair, kotlin.coroutines.d<? super Unit> dVar) {
                com.planner5d.library.activity.fragment.smartwizard.d dVar2;
                com.planner5d.library.activity.fragment.smartwizard.b bVarComponent1 = pair.component1();
                JSONObject jSONObjectComponent2 = pair.component2();
                c1 c1Var = this.f135467a.X;
                switch (C1489a.f135468a[bVarComponent1.ordinal()]) {
                    case 1:
                        dVar2 = com.planner5d.library.activity.fragment.smartwizard.d.Designing;
                        break;
                    case 2:
                        dVar2 = com.planner5d.library.activity.fragment.smartwizard.d.Furnishing;
                        break;
                    case 3:
                        dVar2 = com.planner5d.library.activity.fragment.smartwizard.d.Finalising;
                        break;
                    case 4:
                        dVar2 = com.planner5d.library.activity.fragment.smartwizard.d.Error;
                        break;
                    case 5:
                    case 6:
                        dVar2 = com.planner5d.library.activity.fragment.smartwizard.d.Idle;
                        break;
                    default:
                        throw new k0();
                }
                c1Var.o(dVar2);
                this.f135467a.N0(bVarComponent1);
                c1 c1Var2 = this.f135467a.H1;
                if (jSONObjectComponent2 == null) {
                    return Unit.f312394a;
                }
                c1Var2.o(jSONObjectComponent2);
                if (!this.f135467a.S0()) {
                    this.f135467a.d1(true);
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, com.planner5d.library.smartwizard.data.b bVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f135465c = str;
            this.f135466d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new b(this.f135465c, this.f135466d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f135463a
                r2 = 2
                r3 = 2
                r3 = 1
                if (r1 == 0) goto L26
                r6 = 7
                if (r1 == r3) goto L20
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r8)
                r6 = 7
                goto L6c
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "e se/i /r ot iibewl krloet ccnu//u/srone//feohvt/ao"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 3
                throw r7
            L20:
                r6 = 5
                kotlin.ResultKt.m(r8)
                r6 = 2
                goto L55
            L26:
                kotlin.ResultKt.m(r8)
                com.planner5d.library.activity.fragment.smartwizard.decorator.l r8 = com.planner5d.library.activity.fragment.smartwizard.decorator.l.this
                r6 = 6
                com.planner5d.library.activity.helper.r r8 = com.planner5d.library.activity.fragment.smartwizard.decorator.l.E0(r8)
                r6 = 7
                java.lang.String r1 = r7.f135465c
                java.lang.String r8 = r8.F(r1)
                if (r8 != 0) goto L3b
                java.lang.String r8 = ""
            L3b:
                com.planner5d.library.activity.fragment.smartwizard.decorator.l r1 = com.planner5d.library.activity.fragment.smartwizard.decorator.l.this
                ma.a r1 = com.planner5d.library.activity.fragment.smartwizard.decorator.l.C0(r1)
                com.planner5d.library.smartwizard.data.b r4 = r7.f135466d
                com.planner5d.library.activity.fragment.smartwizard.decorator.l r5 = com.planner5d.library.activity.fragment.smartwizard.decorator.l.this
                com.planner5d.library.model.manager.statistics.events.a4$e r5 = com.planner5d.library.activity.fragment.smartwizard.decorator.l.L0(r5)
                r6 = 2
                r7.f135463a = r3
                java.lang.Object r8 = r1.a(r8, r4, r5, r7)
                r6 = 2
                if (r8 != r0) goto L55
                r6 = 2
                goto L6b
            L55:
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.u(r8)
                r6 = 2
                com.planner5d.library.activity.fragment.smartwizard.decorator.l$b$a r1 = new com.planner5d.library.activity.fragment.smartwizard.decorator.l$b$a
                com.planner5d.library.activity.fragment.smartwizard.decorator.l r3 = com.planner5d.library.activity.fragment.smartwizard.decorator.l.this
                r1.<init>(r3)
                r7.f135463a = r2
                java.lang.Object r7 = r8.collect(r1, r7)
                if (r7 != r0) goto L6c
            L6b:
                return r0
            L6c:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.smartwizard.decorator.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.decorator.DecoratorViewModel$save$1", f = "DecoratorViewModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f135471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f135474f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Project, Bundle, Unit> f135476h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Project f135477i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Project, ? super Bundle, Unit> function2, Project project, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f135476h = function2;
            this.f135477i = project;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new c(this.f135476h, this.f135477i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Function2<Project, Bundle, Unit> function2;
            Project project;
            l lVar;
            com.planner5d.library.services.utility.i iVar;
            com.planner5d.library.services.r rVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135474f;
            if (i10 == 0) {
                ResultKt.m(obj);
                JSONObject jSONObjectF = l.this.W0().f();
                if (jSONObjectF != null) {
                    Function2<Project, Bundle, Unit> function3 = this.f135476h;
                    Project project2 = this.f135477i;
                    l lVar2 = l.this;
                    com.planner5d.library.services.utility.i iVar2 = new com.planner5d.library.services.utility.i();
                    com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.projectDataForEditor;
                    pa.c cVar = lVar2.f135458s;
                    this.f135469a = lVar2;
                    this.f135470b = rVar2;
                    this.f135471c = iVar2;
                    this.f135472d = project2;
                    this.f135473e = function3;
                    this.f135474f = 1;
                    obj = cVar.b(jSONObjectF, this);
                    if (obj == objL) {
                        return objL;
                    }
                    function2 = function3;
                    project = project2;
                    lVar = lVar2;
                    iVar = iVar2;
                    rVar = rVar2;
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function2) this.f135473e;
            project = (Project) this.f135472d;
            iVar = (com.planner5d.library.services.utility.i) this.f135471c;
            rVar = (com.planner5d.library.services.r) this.f135470b;
            lVar = (l) this.f135469a;
            ResultKt.m(obj);
            function2.invoke(project, iVar.n(rVar, (byte[]) obj).i(com.planner5d.library.services.r.aiDesignerStatistics, lVar.Y0()).a());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.decorator.DecoratorViewModel$startLoadingData$2", f = "DecoratorViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f135479b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g1.j f135481d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g1.j jVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f135481d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new d(this.f135481d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l lVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135479b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    l lVar2 = l.this;
                    ce.a aVar = lVar2.f135459t;
                    this.f135478a = lVar2;
                    this.f135479b = 1;
                    Object objA = aVar.a(this);
                    if (objA == objL) {
                        return objL;
                    }
                    lVar = lVar2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (l) this.f135478a;
                    ResultKt.m(obj);
                }
                lVar.f135445g3 = (List) obj;
                c1 c1Var = l.this.Z;
                List list = l.this.f135445g3;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("elements");
                    list = null;
                }
                c1Var.o(list);
                String string = l.this.Y().getString(com.planner5d.library.services.r.smartWizardRoomDataReference.f224891a, null);
                r rVar = l.this.f135461w;
                Intrinsics.checkNotNull(string);
                String strF = rVar.F(string);
                if (strF == null) {
                    strF = "";
                }
                l.this.f135456p1.i(new JSONObject(strF), this.f135481d);
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                l.this.X.o(com.planner5d.library.activity.fragment.smartwizard.d.Error);
                l.this.f135450l3.o(e10);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public l(@NotNull ma.a decorateRoomUseCase, @NotNull pa.c prepareProjectDataUseCase, @NotNull ce.a decorElementsGetter, @NotNull c2 networkStateUtility, @NotNull r fileHelper, @NotNull x navigator, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull b2 messageManager, @NotNull n3 helperProjectPersistence, @NotNull sd.e firebaseInAppMessageTrigger, @NotNull StatisticsEventAiDesigner statisticsEventAiDesigner, @NotNull com.planner5d.library.application.b application) {
        super(messageManager, navigator, networkStateUtility, application);
        Intrinsics.checkNotNullParameter(decorateRoomUseCase, "decorateRoomUseCase");
        Intrinsics.checkNotNullParameter(prepareProjectDataUseCase, "prepareProjectDataUseCase");
        Intrinsics.checkNotNullParameter(decorElementsGetter, "decorElementsGetter");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f135452n = statisticsEventAiDesigner;
        this.f135454o = decorateRoomUseCase;
        this.f135458s = prepareProjectDataUseCase;
        this.f135459t = decorElementsGetter;
        this.f135460v = networkStateUtility;
        this.f135461w = fileHelper;
        c1<com.planner5d.library.activity.fragment.smartwizard.d> c1Var = new c1<>(com.planner5d.library.activity.fragment.smartwizard.d.Idle);
        this.X = c1Var;
        this.Y = c1Var;
        c1<List<com.planner5d.library.smartwizard.data.a>> c1Var2 = new c1<>(CollectionsKt.emptyList());
        this.Z = c1Var2;
        this.f135455p0 = c1Var2;
        this.f135456p1 = new j2(this, dialogLauncher, helperProjectPersistence, null, this, firebaseInAppMessageTrigger);
        c1<JSONObject> c1Var3 = new c1<>();
        this.H1 = c1Var3;
        this.f135457p2 = c1Var3;
        this.f135447i3 = new ArrayList();
        c1<Exception> c1Var4 = new c1<>();
        this.f135450l3 = c1Var4;
        this.f135451m3 = c1Var4;
        this.f135453n3 = new StatisticsEventAiDesigner.EventData(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(com.planner5d.library.activity.fragment.smartwizard.b bVar) {
        int i10 = a.f135462a[bVar.ordinal()];
        if (i10 == 1) {
            i(StatisticsEventAiDesigner.a.variant_updated, StatisticsEventAiDesigner.EventData.j(this.f135453n3, null, null, null, null, null, null, this.f135447i3.isEmpty() ? null : CollectionsKt.joinToString$default(this.f135447i3, ";", null, null, 0, null, null, 62, null), 63, null));
        } else {
            if (i10 != 2) {
                return;
            }
            i(StatisticsEventAiDesigner.a.error, StatisticsEventAiDesigner.EventData.j(this.f135453n3, null, null, null, null, null, StatisticsEventAiDesigner.e.unexpected, null, 95, null));
        }
    }

    private final void P0() {
        if (!this.f135460v.d(com.planner5d.library.application.b.f142455c.a().S0())) {
            this.f135450l3.o(ErrorMessageException.createNoInternetException());
            return;
        }
        p2 p2Var = this.f135449k3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.X.o(com.planner5d.library.activity.fragment.smartwizard.d.Designing);
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(Y());
        String strT = jVar.t(com.planner5d.library.services.r.smartWizardRoomDataReference, null);
        if (strT == null) {
            strT = "";
        }
        String strT2 = jVar.t(com.planner5d.library.services.r.aiDesignerRoomId, null);
        this.f135449k3 = kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new b(strT, new com.planner5d.library.smartwizard.data.b(strT2 != null ? strT2 : "", this.f135447i3), null), 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void F0(@NotNull StatisticsEventAiDesigner.a action, @Nullable StatisticsEventAiDesigner.d dVar, @Nullable StatisticsEventAiDesigner.g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable StatisticsEventAiDesigner.e eVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f135452n.F0(action, dVar, gVar, num, num2, num3, eVar, str);
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void H(@NotNull android.util.Pair<Project, ItemProject> project, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(listener, "listener");
        p0((Project) project.first, (ItemProject) project.second, listener);
    }

    public final void O0(@NotNull StatisticsEventAiDesigner.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        i(action, this.f135453n3);
    }

    public final void Q0() {
        O0(StatisticsEventAiDesigner.a.decorate);
        P0();
    }

    @NotNull
    public final androidx.lifecycle.w0<List<com.planner5d.library.smartwizard.data.a>> R0() {
        return this.f135455p0;
    }

    public final boolean S0() {
        return this.f135448j3;
    }

    @NotNull
    public final androidx.lifecycle.w0<Exception> U0() {
        return this.f135451m3;
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.smartwizard.d> V0() {
        return this.Y;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.s
    public void W() {
        super.W();
        p2 p2Var = this.f135449k3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
    }

    @NotNull
    public final androidx.lifecycle.w0<JSONObject> W0() {
        return this.f135457p2;
    }

    public final int X0() {
        return this.f135447i3.size();
    }

    @NotNull
    public final StatisticsEventAiDesigner.EventData Y0() {
        return this.f135453n3;
    }

    public final void Z0(@Nullable JSONObject jSONObject, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (jSONObject == null) {
            return;
        }
        d0().o(Boolean.TRUE);
        this.f135456p1.i(jSONObject, listener);
    }

    public final void a1() {
        O0(StatisticsEventAiDesigner.a.refresh);
        P0();
    }

    public final void b1(@Nullable Project project, @NotNull Function2<? super Project, ? super Bundle, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        O0(StatisticsEventAiDesigner.a.save);
        if (project == null) {
            return;
        }
        p2 p2Var = this.f135449k3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(onFinished, project, null), 3, null);
    }

    public final void c1(@NotNull String categoryKey, boolean z10) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        if (z10) {
            this.f135447i3.add(categoryKey);
        } else {
            this.f135447i3.remove(categoryKey);
        }
    }

    public final void d1(boolean z10) {
        this.f135448j3 = z10;
    }

    public final void e1(@NotNull StatisticsEventAiDesigner.EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "<set-?>");
        this.f135453n3 = eventData;
    }

    public final void f1(@Nullable Bundle bundle, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f135453n3 = g3.f216952a.a(bundle);
        if (bundle != null) {
            Y().putAll(bundle);
        }
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new d(listener, null), 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void i(@NotNull StatisticsEventAiDesigner.a action, @NotNull StatisticsEventAiDesigner.EventData parameters) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f135452n.i(action, parameters);
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.s
    public void n0(@NotNull g1.j listener, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d0().o(Boolean.FALSE);
        this.f135446h3 = true;
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void u(@NotNull Map<String, ? extends android.util.Pair<Project, ItemProject>> projects, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
