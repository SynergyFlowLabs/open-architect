package com.planner5d.library.activity.fragment.smartwizard.roomstyle;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.n3;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@SourceDebugExtension({"SMAP\nChooseRoomStyleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseRoomStyleViewModel.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomstyle/ChooseRoomStyleViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
public final class n extends com.planner5d.library.activity.fragment.smartwizard.s implements StatisticsEventAiDesigner {

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f135782n3 = 8;

    @NotNull
    private final androidx.lifecycle.w0<Integer> H1;

    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.smartwizard.d> X;

    @NotNull
    private final androidx.lifecycle.w0<List<com.planner5d.library.smartwizard.data.e>> Y;

    @NotNull
    private final j2 Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f135783g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.smartwizard.data.e f135784h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f135785i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private p2 f135786j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Exception> f135787k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private pa.a f135788l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private StatisticsEventAiDesigner.EventData f135789m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ StatisticsEventAiDesigner f135790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final pa.e f135791o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<JSONObject> f135792p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final Queue<JSONObject> f135793p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private List<com.planner5d.library.smartwizard.data.e> f135794p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final pa.c f135795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final ce.b f135796t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final c2 f135797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.r f135798w;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f135800b;

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
            f135799a = iArr;
            int[] iArr2 = new int[StatisticsEventAiDesigner.g.values().length];
            try {
                iArr2[StatisticsEventAiDesigner.g.furnisher.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StatisticsEventAiDesigner.g.styler.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f135800b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.ChooseRoomStyleViewModel$onNextPressed$1", f = "ChooseRoomStyleViewModel.kt", i = {}, l = {222, 228}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f135803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f135806f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Project f135808h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Project, Bundle, Unit> f135809i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Project project, Function2<? super Project, ? super Bundle, Unit> function2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f135808h = project;
            this.f135809i = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new b(this.f135808h, this.f135809i, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
        
            if (r10 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.ChooseRoomStyleViewModel$requestNewRoom$1", f = "ChooseRoomStyleViewModel.kt", i = {}, l = {164, 165}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135810a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f135812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f135813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f135814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f135815f;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f135816a;

            /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.roomstyle.n$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1495a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f135817a;

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
                        int i10 = 2 ^ 5;
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.LoadedData.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[com.planner5d.library.activity.fragment.smartwizard.b.Finished.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f135817a = iArr;
                }
            }

            a(n nVar) {
                this.f135816a = nVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends JSONObject> pair, kotlin.coroutines.d<? super Unit> dVar) {
                com.planner5d.library.activity.fragment.smartwizard.d dVar2;
                com.planner5d.library.activity.fragment.smartwizard.b bVarComponent1 = pair.component1();
                JSONObject jSONObjectComponent2 = pair.component2();
                c1 c1Var = (c1) this.f135816a.R0();
                switch (C1495a.f135817a[bVarComponent1.ordinal()]) {
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
                this.f135816a.O0(bVarComponent1);
                if (jSONObjectComponent2 == null) {
                    return Unit.f312394a;
                }
                if (this.f135816a.f135785i3) {
                    this.f135816a.f135793p1.add(jSONObjectComponent2);
                    this.f135816a.Z0();
                } else {
                    this.f135816a.f135785i3 = true;
                    androidx.lifecycle.w0<JSONObject> w0VarU0 = this.f135816a.U0();
                    Intrinsics.checkNotNull(w0VarU0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<org.json.JSONObject>");
                    ((c1) w0VarU0).o(jSONObjectComponent2);
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, int i11, String str2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f135812c = str;
            this.f135813d = i10;
            this.f135814e = i11;
            this.f135815f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new c(this.f135812c, this.f135813d, this.f135814e, this.f135815f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r13.collect(r14, r11) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.f135810a
                r2 = 2
                r3 = 1
                r12 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r14)
                r12 = 2
                goto L7c
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L1c:
                kotlin.ResultKt.m(r14)
                r11 = r13
                r12 = 6
                goto L62
            L22:
                r12 = 7
                kotlin.ResultKt.m(r14)
                r12 = 4
                com.planner5d.library.activity.fragment.smartwizard.roomstyle.n r14 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.this
                r12 = 0
                com.planner5d.library.activity.helper.r r14 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.A0(r14)
                java.lang.String r1 = r13.f135812c
                java.lang.String r14 = r14.F(r1)
                if (r14 != 0) goto L3a
                java.lang.String r14 = ""
                java.lang.String r14 = ""
            L3a:
                r9 = r14
                r9 = r14
                com.planner5d.library.activity.fragment.smartwizard.roomstyle.n r14 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.this
                pa.e r4 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.D0(r14)
                r12 = 4
                com.planner5d.library.activity.fragment.smartwizard.roomstyle.n r14 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.this
                pa.a r5 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.G0(r14)
                r12 = 1
                int r6 = r13.f135813d
                int r7 = r13.f135814e
                r12 = 0
                java.lang.String r8 = r13.f135815f
                com.planner5d.library.activity.fragment.smartwizard.roomstyle.n r14 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.this
                com.planner5d.library.model.manager.statistics.events.a4$e r10 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.I0(r14)
                r13.f135810a = r3
                r11 = r13
                java.lang.Object r14 = r4.a(r5, r6, r7, r8, r9, r10, r11)
                r12 = 2
                if (r14 != r0) goto L62
                goto L7b
            L62:
                r12 = 4
                kotlinx.coroutines.flow.i r14 = (kotlinx.coroutines.flow.i) r14
                kotlinx.coroutines.flow.i r13 = kotlinx.coroutines.flow.k.u(r14)
                com.planner5d.library.activity.fragment.smartwizard.roomstyle.n$c$a r14 = new com.planner5d.library.activity.fragment.smartwizard.roomstyle.n$c$a
                r12 = 7
                com.planner5d.library.activity.fragment.smartwizard.roomstyle.n r1 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.this
                r12 = 3
                r14.<init>(r1)
                r11.f135810a = r2
                r12 = 6
                java.lang.Object r13 = r13.collect(r14, r11)
                if (r13 != r0) goto L7c
            L7b:
                return r0
            L7c:
                kotlin.Unit r13 = kotlin.Unit.f312394a
                r12 = 5
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.roomstyle.ChooseRoomStyleViewModel$startLoadingData$2", f = "ChooseRoomStyleViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f135819b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n nVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135819b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    n nVar2 = n.this;
                    ce.b bVar = nVar2.f135796t;
                    this.f135818a = nVar2;
                    this.f135819b = 1;
                    Object objA = bVar.a(this);
                    if (objA == objL) {
                        return objL;
                    }
                    nVar = nVar2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = (n) this.f135818a;
                    ResultKt.m(obj);
                }
                nVar.f135794p2 = (List) obj;
                androidx.lifecycle.w0<List<com.planner5d.library.smartwizard.data.e>> w0VarX0 = n.this.X0();
                Intrinsics.checkNotNull(w0VarX0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.List<com.planner5d.library.smartwizard.data.SmartWizardRoomStyle>>");
                c1 c1Var = (c1) w0VarX0;
                List list = n.this.f135794p2;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("styles");
                    list = null;
                }
                c1Var.o(list);
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                androidx.lifecycle.w0<com.planner5d.library.activity.fragment.smartwizard.d> w0VarR0 = n.this.R0();
                Intrinsics.checkNotNull(w0VarR0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.smartwizard.RoomLoadingState>");
                ((c1) w0VarR0).o(com.planner5d.library.activity.fragment.smartwizard.d.Error);
                androidx.lifecycle.w0<Exception> w0VarQ0 = n.this.Q0();
                Intrinsics.checkNotNull(w0VarQ0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<java.lang.Exception>");
                ((c1) w0VarQ0).o(e10);
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
    public n(@NotNull pa.e newRoomUseCase, @NotNull pa.c prepareProjectDataUseCase, @NotNull ce.b roomStylesGetter, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.activity.helper.r fileHelper, @NotNull x navigator, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull b2 messageManager, @NotNull n3 helperProjectPersistence, @NotNull sd.e firebaseInAppMessageTrigger, @NotNull StatisticsEventAiDesigner statisticsEventAiDesigner, @NotNull com.planner5d.library.application.b application) {
        super(messageManager, navigator, networkStateUtility, application);
        Intrinsics.checkNotNullParameter(newRoomUseCase, "newRoomUseCase");
        Intrinsics.checkNotNullParameter(prepareProjectDataUseCase, "prepareProjectDataUseCase");
        Intrinsics.checkNotNullParameter(roomStylesGetter, "roomStylesGetter");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f135790n = statisticsEventAiDesigner;
        this.f135791o = newRoomUseCase;
        this.f135795s = prepareProjectDataUseCase;
        this.f135796t = roomStylesGetter;
        this.f135797v = networkStateUtility;
        this.f135798w = fileHelper;
        this.X = new c1(com.planner5d.library.activity.fragment.smartwizard.d.Idle);
        this.Y = new c1(CollectionsKt.emptyList());
        this.Z = new j2(this, dialogLauncher, helperProjectPersistence, null, this, firebaseInAppMessageTrigger);
        this.f135792p0 = new c1();
        LinkedList linkedList = new LinkedList();
        this.f135793p1 = linkedList;
        this.H1 = new c1(Integer.valueOf(linkedList.size()));
        this.f135787k3 = new c1();
        this.f135788l3 = pa.a.SmartWizard;
        this.f135789m3 = new StatisticsEventAiDesigner.EventData(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(com.planner5d.library.activity.fragment.smartwizard.b bVar) {
        int i10 = a.f135799a[bVar.ordinal()];
        if (i10 == 1) {
            P0(StatisticsEventAiDesigner.a.variant_ready);
        } else {
            if (i10 != 2) {
                return;
            }
            int i11 = 1 << 0;
            i(StatisticsEventAiDesigner.a.error, StatisticsEventAiDesigner.EventData.j(W0(), null, null, null, null, null, StatisticsEventAiDesigner.e.unexpected, null, 95, null));
        }
    }

    private final pa.a V0() {
        StatisticsEventAiDesigner.g gVarQ = this.f135789m3.q();
        int i10 = gVarQ == null ? -1 : a.f135800b[gVarQ.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? pa.a.SmartWizard : pa.a.Styler;
        }
        return pa.a.Furnisher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0() {
        androidx.lifecycle.w0<Integer> w0Var = this.H1;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>");
        ((c1) w0Var).o(Integer.valueOf(this.f135793p1.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(Long l10) {
        com.planner5d.library.model.manager.statistics.events.b2.f216725b.B(x3.c.room_wizard, l10);
    }

    private final void e1(com.planner5d.library.smartwizard.data.e eVar) {
        String strN;
        if (!this.f135797v.d(com.planner5d.library.application.b.f142455c.a().S0())) {
            androidx.lifecycle.w0<Exception> w0Var = this.f135787k3;
            Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<java.lang.Exception>");
            ((c1) w0Var).o(ErrorMessageException.createNoInternetException());
            return;
        }
        p2 p2Var = this.f135786j3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f135793p1.clear();
        Z0();
        androidx.lifecycle.w0<com.planner5d.library.activity.fragment.smartwizard.d> w0Var2 = this.X;
        Intrinsics.checkNotNull(w0Var2, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.activity.fragment.smartwizard.RoomLoadingState>");
        ((c1) w0Var2).o(com.planner5d.library.activity.fragment.smartwizard.d.Designing);
        this.f135785i3 = false;
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(Y());
        int iC = jVar.c(com.planner5d.library.services.r.smartWizardRoomType, -1);
        int iC2 = (int) eVar.c();
        com.planner5d.library.activity.fragment.smartwizard.roomshape.i iVar = (com.planner5d.library.activity.fragment.smartwizard.roomshape.i) jVar.s(com.planner5d.library.services.r.roomShape, null);
        String str = (iVar == null || (strN = iVar.n()) == null) ? "" : strN;
        String strT = jVar.t(com.planner5d.library.services.r.smartWizardRoomDataReference, null);
        this.f135786j3 = kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new c(strT == null ? "" : strT, iC, iC2, str, null), 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void F0(@NotNull StatisticsEventAiDesigner.a action, @Nullable StatisticsEventAiDesigner.d dVar, @Nullable StatisticsEventAiDesigner.g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable StatisticsEventAiDesigner.e eVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f135790n.F0(action, dVar, gVar, num, num2, num3, eVar, str);
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void H(@NotNull android.util.Pair<Project, ItemProject> project, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(listener, "listener");
        p0((Project) project.first, (ItemProject) project.second, listener);
    }

    public final void P0(@NotNull StatisticsEventAiDesigner.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (i0()) {
            i(action, W0());
        }
    }

    @NotNull
    public final androidx.lifecycle.w0<Exception> Q0() {
        return this.f135787k3;
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.smartwizard.d> R0() {
        return this.X;
    }

    @NotNull
    public final androidx.lifecycle.w0<Integer> S0() {
        return this.H1;
    }

    @NotNull
    public final androidx.lifecycle.w0<JSONObject> U0() {
        return this.f135792p0;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.s
    public void W() {
        super.W();
        p2 p2Var = this.f135786j3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
    }

    @NotNull
    public final StatisticsEventAiDesigner.EventData W0() {
        StatisticsEventAiDesigner.EventData eventData = this.f135789m3;
        Integer numValueOf = Integer.valueOf(new com.planner5d.library.services.utility.j(Y()).c(com.planner5d.library.services.r.smartWizardRoomType, -1));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        com.planner5d.library.smartwizard.data.e eVar = this.f135784h3;
        boolean z10 = true;
        return StatisticsEventAiDesigner.EventData.j(eventData, null, null, numValueOf, eVar != null ? Integer.valueOf((int) eVar.c()) : null, null, null, null, 115, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<List<com.planner5d.library.smartwizard.data.e>> X0() {
        return this.Y;
    }

    public final void Y0(@Nullable JSONObject jSONObject, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (jSONObject == null) {
            return;
        }
        if (!i0()) {
            com.planner5d.library.model.manager.statistics.events.p2.f217307b.o(f0());
        }
        d0().o(Boolean.TRUE);
        this.Z.i(jSONObject, listener);
    }

    public final void a1(@Nullable Project project, @NotNull Function2<? super Project, ? super Bundle, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        if (!i0()) {
            x0();
        }
        if (project == null) {
            return;
        }
        p2 p2Var = this.f135786j3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        int i10 = 2 ^ 3;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(project, onFinished, null), 3, null);
    }

    public final void c1(@NotNull com.planner5d.library.smartwizard.data.e style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (!Intrinsics.areEqual(this.f135784h3, style)) {
            this.f135784h3 = style;
            Y().putString(com.planner5d.library.services.r.smartWizardStatisticsRoomStyle.f224891a, style.b());
            if (this.f135783g3) {
                e1(style);
            }
        }
    }

    public final void d1() {
        if (!i0()) {
            com.planner5d.library.model.manager.statistics.events.p2.f217307b.b0(f0());
        }
        P0(StatisticsEventAiDesigner.a.variant_updated);
        JSONObject jSONObjectPoll = this.f135793p1.poll();
        if (jSONObjectPoll != null) {
            androidx.lifecycle.w0<JSONObject> w0Var = this.f135792p0;
            Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<org.json.JSONObject>");
            ((c1) w0Var).o(jSONObjectPoll);
        } else {
            com.planner5d.library.smartwizard.data.e eVar = this.f135784h3;
            if (eVar != null) {
                e1(eVar);
            }
        }
    }

    public final void f1(@Nullable Bundle bundle) {
        this.f135789m3 = g3.f216952a.a(bundle);
        if (bundle != null) {
            Y().putAll(bundle);
        }
        this.f135788l3 = V0();
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new d(null), 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void i(@NotNull StatisticsEventAiDesigner.a action, @NotNull StatisticsEventAiDesigner.EventData parameters) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f135790n.i(action, parameters);
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.s
    public void n0(@NotNull g1.j listener, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d0().o(Boolean.FALSE);
        this.f135783g3 = true;
        com.planner5d.library.smartwizard.data.e eVar = this.f135784h3;
        if (eVar != null) {
            e1(eVar);
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void u(@NotNull Map<String, ? extends android.util.Pair<Project, ItemProject>> projects, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
