package com.planner5d.library.widget.editor.helper;

import android.view.View;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorCustomerSatisfactionIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorCustomerSatisfactionIndex.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorCustomerSatisfactionIndex\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,80:1\n257#2,2:81\n*S KotlinDebug\n*F\n+ 1 HelperEditorCustomerSatisfactionIndex.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorCustomerSatisfactionIndex\n*L\n42#1:81,2\n*E\n"})
public final class w1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f256813g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f256814h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f256815i = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final le.a f256816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f256817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.activity.fragment.projects.z0 f256818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.t1 f256819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final StatisticsEventAiDesigner f256820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private View f256821f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f256822a;

        static {
            int[] iArr = new int[StatisticsEventAiDesigner.g.values().length];
            try {
                iArr[StatisticsEventAiDesigner.g.furnisher.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatisticsEventAiDesigner.g.styler.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatisticsEventAiDesigner.g.decorator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f256822a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorCustomerSatisfactionIndex$onProjectLoaded$1$2", f = "HelperEditorCustomerSatisfactionIndex.kt", i = {}, l = {55, com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHelperEditorCustomerSatisfactionIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorCustomerSatisfactionIndex.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorCustomerSatisfactionIndex$onProjectLoaded$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,80:1\n257#2,2:81\n*S KotlinDebug\n*F\n+ 1 HelperEditorCustomerSatisfactionIndex.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorCustomerSatisfactionIndex$onProjectLoaded$1$2\n*L\n57#1:81,2\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256823a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f256825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f256826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f256827e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, boolean z10, long j11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f256825c = j10;
            this.f256826d = z10;
            this.f256827e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w1.this.new c(this.f256825c, this.f256826d, this.f256827e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r13 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            if (kotlinx.coroutines.d1.b(r5, r12) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r11 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r11 = 3
                int r1 = r12.f256823a
                r11 = 4
                r2 = 2
                r11 = 1
                r3 = 1
                r4 = 5
                r4 = 0
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.ResultKt.m(r13)
                goto L64
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L20:
                kotlin.ResultKt.m(r13)
                goto L3b
            L24:
                kotlin.ResultKt.m(r13)
                com.planner5d.library.widget.editor.helper.w1 r13 = com.planner5d.library.widget.editor.helper.w1.this
                le.a r13 = com.planner5d.library.widget.editor.helper.w1.d(r13)
                if (r13 == 0) goto L44
                long r5 = r12.f256825c
                r11 = 5
                r12.f256823a = r3
                java.lang.Object r13 = r13.b(r5, r12)
                if (r13 != r0) goto L3b
                goto L63
            L3b:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r4)
                boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r1)
                goto L46
            L44:
                r13 = r4
                r13 = r4
            L46:
                if (r13 != 0) goto L4d
                boolean r13 = r12.f256826d
                r11 = 4
                if (r13 == 0) goto L71
            L4d:
                r13 = 3000(0xbb8, float:4.204E-42)
                long r5 = (long) r13
                long r7 = java.lang.System.currentTimeMillis()
                r11 = 2
                long r9 = r12.f256827e
                r11 = 1
                long r7 = r7 - r9
                long r5 = r5 - r7
                r12.f256823a = r2
                java.lang.Object r13 = kotlinx.coroutines.d1.b(r5, r12)
                r11 = 3
                if (r13 != r0) goto L64
            L63:
                return r0
            L64:
                com.planner5d.library.widget.editor.helper.w1 r12 = com.planner5d.library.widget.editor.helper.w1.this
                r11 = 7
                android.view.View r12 = com.planner5d.library.widget.editor.helper.w1.c(r12)
                if (r12 == 0) goto L71
                r11 = 3
                r12.setVisibility(r4)
            L71:
                kotlin.Unit r12 = kotlin.Unit.f312394a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.helper.w1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public w1(@Nullable le.a aVar, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @Nullable com.planner5d.library.activity.fragment.projects.z0 z0Var, @NotNull com.planner5d.library.model.manager.t1 logRecordManager, @NotNull StatisticsEventAiDesigner statisticsEventAiDesigner) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        this.f256816a = aVar;
        this.f256817b = dialogLauncher;
        this.f256818c = z0Var;
        this.f256819d = logRecordManager;
        this.f256820e = statisticsEventAiDesigner;
    }

    private final le.a.EnumC2326a e(Project project, com.planner5d.library.services.utility.j jVar) {
        le.a.EnumC2326a enumC2326a;
        StatisticsEventAiDesigner.g gVarQ = com.planner5d.library.model.manager.statistics.events.g3.f216952a.b(jVar).q();
        if (gVarQ != null) {
            int i10 = b.f256822a[gVarQ.ordinal()];
            if (i10 == 1) {
                enumC2326a = le.a.EnumC2326a.furnisher;
            } else if (i10 == 2) {
                enumC2326a = le.a.EnumC2326a.styler;
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                enumC2326a = le.a.EnumC2326a.decorator;
            }
            if (enumC2326a != null) {
                return enumC2326a;
            }
        }
        if (Intrinsics.areEqual(project.aiRecognized, Boolean.TRUE)) {
            return le.a.EnumC2326a.plan_recognition;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(w1 w1Var, StatisticsEventAiDesigner.EventData eventData, Project project, com.planner5d.library.services.utility.j jVar, View view) {
        View view2 = w1Var.f256821f;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        w1Var.f256820e.i(StatisticsEventAiDesigner.a.rate_us_open, eventData);
        com.planner5d.library.activity.fragment.projects.z0 z0Var = w1Var.f256818c;
        if (z0Var != null) {
            w1Var.f256817b.c(z0Var.e()).k(project).h(new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.source, w1Var.e(project, jVar)).i(com.planner5d.library.services.r.aiDesignerStatistics, eventData).a()).g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(w1 w1Var, Project project) {
        w1Var.f256819d.b("customer_satisfaction_load", project.uid, null);
        return Unit.f312394a;
    }

    public final void f(@NotNull final Project project, @NotNull final com.planner5d.library.services.utility.j arguments) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        boolean z10 = arguments.t(com.planner5d.library.services.r.aiDesignerRoomId, null) != null;
        final StatisticsEventAiDesigner.EventData eventDataA = com.planner5d.library.model.manager.statistics.events.g3.f216952a.a(arguments.e());
        if (Intrinsics.areEqual(project.aiRecognized, Boolean.TRUE) || z10) {
            Long l10 = project.projectId;
            if (l10 != null) {
                long jLongValue = l10.longValue();
                View view = this.f256821f;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.helper.u1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            w1.g(this.f256777a, eventDataA, project, arguments, view2);
                        }
                    });
                }
                if (kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, com.planner5d.library.services.utility.s.f229729a.a(), null, new c(jLongValue, z10, System.currentTimeMillis(), null), 2, null) != null) {
                    return;
                }
            }
            new Function0() { // from class: com.planner5d.library.widget.editor.helper.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w1.h(this.f256806a, project);
                }
            };
        }
    }

    public final void i(@NotNull View button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f256821f = button;
    }
}
