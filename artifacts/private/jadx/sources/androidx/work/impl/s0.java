package androidx.work.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements pj.q<Context, androidx.work.c, androidx.work.impl.utils.taskexecutor.b, WorkDatabase, androidx.work.impl.constraints.trackers.o, u, List<? extends w>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f77130a = new a();

        a() {
            super(6, s0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // pj.q
        @NotNull
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final List<w> H(@NotNull Context p10, @NotNull androidx.work.c p11, @NotNull androidx.work.impl.utils.taskexecutor.b p12, @NotNull WorkDatabase p13, @NotNull androidx.work.impl.constraints.trackers.o p14, @NotNull u p15) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            Intrinsics.checkNotNullParameter(p11, "p1");
            Intrinsics.checkNotNullParameter(p12, "p2");
            Intrinsics.checkNotNullParameter(p13, "p3");
            Intrinsics.checkNotNullParameter(p14, "p4");
            Intrinsics.checkNotNullParameter(p15, "p5");
            return s0.b(p10, p11, p12, p13, p14, p15);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements pj.q<Context, androidx.work.c, androidx.work.impl.utils.taskexecutor.b, WorkDatabase, androidx.work.impl.constraints.trackers.o, u, List<? extends w>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w[] f77131a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w[] wVarArr) {
            super(6);
            this.f77131a = wVarArr;
        }

        @Override // pj.q
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<w> H(@NotNull Context context, @NotNull androidx.work.c cVar, @NotNull androidx.work.impl.utils.taskexecutor.b bVar, @NotNull WorkDatabase workDatabase, @NotNull androidx.work.impl.constraints.trackers.o oVar, @NotNull u uVar) {
            Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(cVar, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(bVar, "<anonymous parameter 2>");
            Intrinsics.checkNotNullParameter(workDatabase, "<anonymous parameter 3>");
            Intrinsics.checkNotNullParameter(oVar, "<anonymous parameter 4>");
            Intrinsics.checkNotNullParameter(uVar, "<anonymous parameter 5>");
            return ArraysKt.toList(this.f77131a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<w> b(Context context, androidx.work.c cVar, androidx.work.impl.utils.taskexecutor.b bVar, WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.o oVar, u uVar) {
        w wVarC = z.c(context, workDatabase, cVar);
        Intrinsics.checkNotNullExpressionValue(wVarC, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt.listOf((Object[]) new w[]{wVarC, new androidx.work.impl.background.greedy.b(context, cVar, oVar, uVar, new q0(uVar, bVar), bVar)});
    }

    @oj.i(name = "createTestWorkManager")
    @NotNull
    public static final r0 c(@NotNull Context context, @NotNull androidx.work.c configuration, @NotNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.a aVar = WorkDatabase.f76566a;
        androidx.work.impl.utils.taskexecutor.a aVarD = workTaskExecutor.d();
        Intrinsics.checkNotNullExpressionValue(aVarD, "workTaskExecutor.serialTaskExecutor");
        return j(context, configuration, workTaskExecutor, aVar.b(context, aVarD, configuration.a(), true), null, null, null, com.planner5d.library.engine.input.f.b.B, null);
    }

    @oj.j
    @oj.i(name = "createWorkManager")
    @NotNull
    public static final r0 d(@NotNull Context context, @NotNull androidx.work.c configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return j(context, configuration, null, null, null, null, null, 124, null);
    }

    @oj.j
    @oj.i(name = "createWorkManager")
    @NotNull
    public static final r0 e(@NotNull Context context, @NotNull androidx.work.c configuration, @NotNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        int i10 = 3 >> 0;
        return j(context, configuration, workTaskExecutor, null, null, null, null, 120, null);
    }

    @oj.j
    @oj.i(name = "createWorkManager")
    @NotNull
    public static final r0 f(@NotNull Context context, @NotNull androidx.work.c configuration, @NotNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        return j(context, configuration, workTaskExecutor, workDatabase, null, null, null, com.planner5d.library.engine.input.f.b.B, null);
    }

    @oj.j
    @oj.i(name = "createWorkManager")
    @NotNull
    public static final r0 g(@NotNull Context context, @NotNull androidx.work.c configuration, @NotNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull androidx.work.impl.constraints.trackers.o trackers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        return j(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    @oj.j
    @oj.i(name = "createWorkManager")
    @NotNull
    public static final r0 h(@NotNull Context context, @NotNull androidx.work.c configuration, @NotNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull androidx.work.impl.constraints.trackers.o trackers, @NotNull u processor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        return j(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    @oj.j
    @oj.i(name = "createWorkManager")
    @NotNull
    public static final r0 i(@NotNull Context context, @NotNull androidx.work.c configuration, @NotNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull androidx.work.impl.constraints.trackers.o trackers, @NotNull u processor, @NotNull pj.q<? super Context, ? super androidx.work.c, ? super androidx.work.impl.utils.taskexecutor.b, ? super WorkDatabase, ? super androidx.work.impl.constraints.trackers.o, ? super u, ? extends List<? extends w>> schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new r0(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.H(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ r0 j(Context context, androidx.work.c cVar, androidx.work.impl.utils.taskexecutor.b bVar, WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.o oVar, u uVar, pj.q qVar, int i10, Object obj) {
        androidx.work.impl.constraints.trackers.o oVar2;
        if ((i10 & 4) != 0) {
            bVar = new androidx.work.impl.utils.taskexecutor.c(cVar.m());
        }
        androidx.work.impl.utils.taskexecutor.b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.a aVar = WorkDatabase.f76566a;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            androidx.work.impl.utils.taskexecutor.a aVarD = bVar2.d();
            Intrinsics.checkNotNullExpressionValue(aVarD, "workTaskExecutor.serialTaskExecutor");
            workDatabase = aVar.b(applicationContext, aVarD, cVar.a(), context.getResources().getBoolean(androidx.work.g0.a.f76560d));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            oVar2 = new androidx.work.impl.constraints.trackers.o(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            oVar2 = oVar;
        }
        return i(context, cVar, bVar2, workDatabase, oVar2, (i10 & 32) != 0 ? new u(context.getApplicationContext(), cVar, bVar2, workDatabase) : uVar, (i10 & 64) != 0 ? a.f77130a : qVar);
    }

    @NotNull
    public static final pj.q<Context, androidx.work.c, androidx.work.impl.utils.taskexecutor.b, WorkDatabase, androidx.work.impl.constraints.trackers.o, u, List<w>> k(@NotNull w... schedulers) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        return new b(schedulers);
    }
}
