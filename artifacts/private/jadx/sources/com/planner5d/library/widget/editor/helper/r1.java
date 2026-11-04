package com.planner5d.library.widget.editor.helper;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.fragment.dialog.ChooseRoomDialog;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorAiDesigner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorAiDesigner.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorAiDesigner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class r1 implements com.planner5d.library.widget.editor.facade.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f256683k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f256684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.a f256685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f256686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f256687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.t1 f256688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f256689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final StatisticsEventAiDesigner f256690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.b0 f256691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f256692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.r f256693j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAiDesigner", f = "HelperEditorAiDesigner.kt", i = {0}, l = {43}, m = "navigateAiDesigner", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f256695b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f256697d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256695b = obj;
            this.f256697d |= Integer.MIN_VALUE;
            return r1.this.g(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAiDesigner$onAiDesignerClicked$1", f = "HelperEditorAiDesigner.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160700j1, com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256698a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.facade.e f256700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.facade.k0 f256701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ItemRoom f256702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StatisticsEventAiDesigner.d f256703f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.widget.editor.facade.e eVar, com.planner5d.library.widget.editor.facade.k0 k0Var, ItemRoom itemRoom, StatisticsEventAiDesigner.d dVar, kotlin.coroutines.d<? super b> dVar2) {
            super(2, dVar2);
            this.f256700c = eVar;
            this.f256701d = k0Var;
            this.f256702e = itemRoom;
            this.f256703f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r1.this.new b(this.f256700c, this.f256701d, this.f256702e, this.f256703f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (r3.g(r4, r5, r6, r7, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r9 = 7
                int r1 = r10.f256698a
                r2 = 2
                r3 = 6
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L16
                r9 = 3
                kotlin.ResultKt.m(r11)
                r9 = 5
                goto L56
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r9 = 5
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L1f:
                kotlin.ResultKt.m(r11)
                goto L3b
            L23:
                r9 = 0
                kotlin.ResultKt.m(r11)
                r9 = 1
                com.planner5d.library.widget.editor.helper.r1 r11 = com.planner5d.library.widget.editor.helper.r1.this
                com.planner5d.library.model.manager.config.p r11 = com.planner5d.library.widget.editor.helper.r1.d(r11)
                r9 = 2
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.aiDesignerShown
                r10.f256698a = r3
                java.lang.Object r11 = r11.L(r1, r3, r10)
                if (r11 != r0) goto L3b
                r9 = 0
                goto L55
            L3b:
                com.planner5d.library.widget.editor.helper.r1 r3 = com.planner5d.library.widget.editor.helper.r1.this
                com.planner5d.library.widget.editor.facade.e r4 = r10.f256700c
                com.planner5d.library.widget.editor.facade.k0 r11 = r10.f256701d
                r9 = 7
                com.planner5d.library.model.item.ItemProject r5 = r11.getItem()
                com.planner5d.library.model.item.ItemRoom r6 = r10.f256702e
                com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner$d r7 = r10.f256703f
                r10.f256698a = r2
                r8 = r10
                r8 = r10
                java.lang.Object r10 = com.planner5d.library.widget.editor.helper.r1.e(r3, r4, r5, r6, r7, r8)
                r9 = 1
                if (r10 != r0) goto L56
            L55:
                return r0
            L56:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.helper.r1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorAiDesigner", f = "HelperEditorAiDesigner.kt", i = {0, 0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "prepareAndNavigate", n = {"this", "contextProvider", "roomId", "entryPoint"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f256706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f256707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f256708e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f256710g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256708e = obj;
            this.f256710g |= Integer.MIN_VALUE;
            return r1.this.i(null, null, null, null, this);
        }
    }

    @ij.a
    public r1(@NotNull com.planner5d.library.model.manager.config.p sharedPreferences, @NotNull com.planner5d.library.model.a aiDesignerProvider, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.model.manager.t1 logRecordManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull StatisticsEventAiDesigner statisticsEventAiDesigner, @NotNull com.planner5d.library.model.manager.payments.b0 superwallUseCase, @NotNull com.planner5d.library.services.utility.f1 coroutineScope, @NotNull com.planner5d.library.activity.helper.r fileHelper) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(aiDesignerProvider, "aiDesignerProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        Intrinsics.checkNotNullParameter(superwallUseCase, "superwallUseCase");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        this.f256684a = sharedPreferences;
        this.f256685b = aiDesignerProvider;
        this.f256686c = navigator;
        this.f256687d = projectManager;
        this.f256688e = logRecordManager;
        this.f256689f = dialogLauncher;
        this.f256690g = statisticsEventAiDesigner;
        this.f256691h = superwallUseCase;
        this.f256692i = coroutineScope;
        this.f256693j = fileHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object g(com.planner5d.library.widget.editor.facade.e eVar, ItemProject itemProject, Item item, StatisticsEventAiDesigner.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
        a aVar;
        if (dVar2 instanceof a) {
            aVar = (a) dVar2;
            int i10 = aVar.f256697d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f256697d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar2);
            }
        } else {
            aVar = new a(dVar2);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f256695b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f256697d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (itemProject == null) {
                return Unit.f312394a;
            }
            ItemRoom itemRoom = null;
            ItemRoom itemRoom2 = item instanceof ItemRoom ? (ItemRoom) item : null;
            if (itemRoom2 == null) {
                List<ItemRoom> listB = c3.f256213a.b(itemProject);
                if (listB.size() != 1) {
                    listB = null;
                }
                if (listB != null) {
                    itemRoom = (ItemRoom) CollectionsKt.firstOrNull((List) listB);
                }
            } else {
                itemRoom = itemRoom2;
            }
            if (itemRoom != null) {
                ItemProject itemProjectF = c3.f256213a.f(itemRoom);
                String uid = itemRoom.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                aVar2.f256694a = this;
                aVar2.f256697d = 1;
                if (i(eVar, itemProjectF, uid, dVar, aVar2) == objL) {
                    return objL;
                }
            } else {
                n();
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    private final void h(String str, String str2, StatisticsEventAiDesigner.d dVar) {
        this.f256686c.f(new oe.a(this.f256685b.a(), new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.smartWizardRoomDataReference, str).m(com.planner5d.library.services.r.smartWizardForEditor, true).j(com.planner5d.library.services.r.aiDesignerRoomId, str2).i(com.planner5d.library.services.r.aiDesignerStatistics, new StatisticsEventAiDesigner.EventData(dVar, null, null, null, null, null, null, okhttp3.internal.ws.g.f334652s, null)).a()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object i(com.planner5d.library.widget.editor.facade.e eVar, ItemProject itemProject, final String str, final StatisticsEventAiDesigner.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
        c cVar;
        Fragment fragmentI;
        if (dVar2 instanceof c) {
            cVar = (c) dVar2;
            int i10 = cVar.f256710g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f256710g = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar2);
            }
        } else {
            cVar = new c(dVar2);
        }
        Object objL = cVar.f256708e;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f256710g;
        try {
            if (i11 == 0) {
                ResultKt.m(objL);
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                Observable<byte[]> observableL0 = this.f256687d.l0(itemProject);
                final Function1 function1 = new Function1() { // from class: com.planner5d.library.widget.editor.helper.o1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r1.j(this.f256640a, (byte[]) obj);
                    }
                };
                Object map = observableL0.map(new Func1() { // from class: com.planner5d.library.widget.editor.helper.p1
                    @Override // rx.functions.Func1
                    public final Object call(Object obj) {
                        return r1.l(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                cVar.f256704a = this;
                cVar.f256705b = eVar;
                cVar.f256706c = str;
                cVar.f256707d = dVar;
                cVar.f256710g = 1;
                objL = c0Var.l(map, cVar);
                if (objL == objL2) {
                    return objL2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (StatisticsEventAiDesigner.d) cVar.f256707d;
                str = (String) cVar.f256706c;
                eVar = (com.planner5d.library.widget.editor.facade.e) cVar.f256705b;
                this = (r1) cVar.f256704a;
                ResultKt.m(objL);
            }
            final String str2 = (String) objL;
            if (str2 == null) {
                throw new IllegalArgumentException("projectData must not be null");
            }
            androidx.fragment.app.s sVarA = eVar.a();
            if (sVarA != null && (fragmentI = eVar.i()) != null) {
                com.planner5d.library.model.manager.payments.b0 b0Var = this.f256691h;
                FragmentManager childFragmentManager = fragmentI.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                int i12 = 2 | 0;
                com.planner5d.library.model.manager.payments.b0.a.a(b0Var, sVarA, childFragmentManager, com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_designer, null, new Function0() { // from class: com.planner5d.library.widget.editor.helper.q1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r1.m(this.f256673a, str2, str, dVar);
                    }
                }, 8, null);
                return Unit.f312394a;
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            this.f256688e.b("ai-designer", null, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(r1 r1Var, byte[] bArr) {
        com.planner5d.library.activity.helper.r rVar = r1Var.f256693j;
        Intrinsics.checkNotNull(bArr);
        return rVar.K(null, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(r1 r1Var, String str, String str2, StatisticsEventAiDesigner.d dVar) {
        r1Var.h(str, str2, dVar);
        return Unit.f312394a;
    }

    private final void n() {
        StatisticsEventAiDesigner.c.a(this.f256690g, StatisticsEventAiDesigner.a.popup_view, StatisticsEventAiDesigner.d.toolbar, null, null, null, null, null, null, com.planner5d.library.engine.input.f.b.V1, null);
        this.f256689f.c(ChooseRoomDialog.class).g();
    }

    @Override // com.planner5d.library.widget.editor.facade.b
    public void k(@NotNull com.planner5d.library.widget.editor.facade.k0 stateReader, @NotNull com.planner5d.library.widget.editor.facade.e contextProvider, @Nullable ItemRoom itemRoom, @NotNull StatisticsEventAiDesigner.d entryPoint) {
        Intrinsics.checkNotNullParameter(stateReader, "stateReader");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        StatisticsEventAiDesigner.c.a(this.f256690g, StatisticsEventAiDesigner.a.button_click, entryPoint, null, null, null, null, null, null, com.planner5d.library.engine.input.f.b.V1, null);
        kotlinx.coroutines.k.f(this.f256692i, null, null, new b(contextProvider, stateReader, itemRoom, entryPoint, null), 3, null);
    }
}
