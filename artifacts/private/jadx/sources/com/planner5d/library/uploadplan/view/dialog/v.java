package com.planner5d.library.uploadplan.view.dialog;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.services.utility.v1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f231004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final le.a f231005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final StatisticsEventAiDesigner f231006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f231007d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.dialog.RecognitionTellUsViewModel$rate$1", f = "RecognitionTellUsViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f231008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f231009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ le.a.EnumC2326a f231010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f231011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StatisticsEventAiDesigner.EventData f231012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f231013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Project f231014g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, le.a.EnumC2326a enumC2326a, v vVar, StatisticsEventAiDesigner.EventData eventData, int i10, Project project, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f231009b = str;
            this.f231010c = enumC2326a;
            this.f231011d = vVar;
            this.f231012e = eventData;
            this.f231013f = i10;
            this.f231014g = project;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f231009b, this.f231010c, this.f231011d, this.f231012e, this.f231013f, this.f231014g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Long l10;
            a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f231008a;
            if (i10 == 0) {
                ResultKt.m(obj);
                String str = this.f231009b;
                if (str != null && (!StringsKt.w3(str)) && this.f231010c != le.a.EnumC2326a.plan_recognition) {
                    this.f231011d.f231006c.i(StatisticsEventAiDesigner.a.form_submitted, this.f231012e);
                }
                le.a aVar2 = this.f231011d.f231005b;
                int i11 = this.f231013f;
                Project project = this.f231014g;
                String str2 = project.uid;
                if (str2 != null && (l10 = project.projectId) != null) {
                    long jLongValue = l10.longValue();
                    String str3 = this.f231009b;
                    id.a aVarA = ((com.planner5d.library.modules.user.user.t) this.f231011d.f231004a.get()).a();
                    le.a.EnumC2326a enumC2326a = this.f231010c;
                    this.f231008a = 1;
                    aVar = this;
                    if (aVar2.a(i11, str2, jLongValue, str3, aVarA, enumC2326a, aVar) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            aVar = this;
            aVar.f231011d.X().r(kotlin.coroutines.jvm.internal.b.a(true));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public v(@NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull le.a customerSatisfactionIndexUseCase, @NotNull StatisticsEventAiDesigner statisticsEventAiDesigner) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(customerSatisfactionIndexUseCase, "customerSatisfactionIndexUseCase");
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        this.f231004a = userAuthorization;
        this.f231005b = customerSatisfactionIndexUseCase;
        this.f231006c = statisticsEventAiDesigner;
        this.f231007d = v1.f229769a.j(null);
    }

    @NotNull
    public final v1.a<Boolean> X() {
        return this.f231007d;
    }

    @NotNull
    public final p2 Y(int i10, @NotNull Project project, @Nullable String str, @Nullable le.a.EnumC2326a enumC2326a, @NotNull StatisticsEventAiDesigner.EventData statistics) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        return kotlinx.coroutines.k.f(g2.a(this), null, null, new a(str, enumC2326a, this, statistics, i10, project, null), 3, null);
    }
}
