package androidx.work.impl;

import com.google.common.util.concurrent.t1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWorkerUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n*L\n55#1:172,2\n*E\n"})
@oj.i(name = "WorkerUpdater")
public final class y0 {

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.o0 f77328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f77331d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.work.o0 o0Var, r0 r0Var, String str, q qVar) {
            super(0);
            this.f77328a = o0Var;
            this.f77329b = r0Var;
            this.f77330c = str;
            this.f77331d = qVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            new androidx.work.impl.utils.d(new c0(this.f77329b, this.f77330c, androidx.work.m.KEEP, CollectionsKt.listOf(this.f77328a)), this.f77331d).run();
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.work.impl.model.v, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f77332a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull androidx.work.impl.model.v spec) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            return spec.J() ? "Periodic" : "OneTime";
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final androidx.work.a0 d(@NotNull final r0 r0Var, @NotNull final String name, @NotNull final androidx.work.o0 workRequest) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final q qVar = new q();
        final a aVar = new a(workRequest, r0Var, name, qVar);
        r0Var.U().d().execute(new Runnable() { // from class: androidx.work.impl.x0
            @Override // java.lang.Runnable
            public final void run() {
                y0.e(r0Var, name, qVar, aVar, workRequest);
            }
        });
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(r0 this_enqueueUniquelyNamedPeriodic, String name, q operation, Function0 enqueueNew, androidx.work.o0 workRequest) {
        Intrinsics.checkNotNullParameter(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(enqueueNew, "$enqueueNew");
        Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        androidx.work.impl.model.w wVarK = this_enqueueUniquelyNamedPeriodic.S().k();
        List<androidx.work.impl.model.v.b> listL = wVarK.L(name);
        if (listL.size() > 1) {
            f(operation, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        androidx.work.impl.model.v.b bVar = (androidx.work.impl.model.v.b) CollectionsKt.firstOrNull((List) listL);
        if (bVar == null) {
            enqueueNew.invoke();
            return;
        }
        androidx.work.impl.model.v vVarH = wVarK.H(bVar.f77006a);
        if (vVarH == null) {
            operation.a(new androidx.work.a0.b.a(new IllegalStateException("WorkSpec with " + bVar.f77006a + ", that matches a name \"" + name + "\", wasn't found")));
            return;
        }
        if (!vVarH.J()) {
            f(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (bVar.f77007b == androidx.work.l0.c.CANCELLED) {
            wVarK.a(bVar.f77006a);
            enqueueNew.invoke();
            return;
        }
        androidx.work.impl.model.v vVarB = androidx.work.impl.model.v.B(workRequest.d(), bVar.f77006a, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388606, null);
        try {
            u processor = this_enqueueUniquelyNamedPeriodic.O();
            Intrinsics.checkNotNullExpressionValue(processor, "processor");
            WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.S();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
            androidx.work.c configuration = this_enqueueUniquelyNamedPeriodic.o();
            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            List<w> schedulers = this_enqueueUniquelyNamedPeriodic.Q();
            Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
            g(processor, workDatabase, configuration, schedulers, vVarB, workRequest.c());
            operation.a(androidx.work.a0.f76489a);
        } catch (Throwable th2) {
            operation.a(new androidx.work.a0.b.a(th2));
        }
    }

    private static final void f(q qVar, String str) {
        qVar.a(new androidx.work.a0.b.a(new UnsupportedOperationException(str)));
    }

    private static final androidx.work.m0.a g(u uVar, final WorkDatabase workDatabase, androidx.work.c cVar, final List<? extends w> list, final androidx.work.impl.model.v vVar, final Set<String> set) {
        final String str = vVar.f76983a;
        final androidx.work.impl.model.v vVarH = workDatabase.k().H(str);
        if (vVarH == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (vVarH.f76984b.l()) {
            return androidx.work.m0.a.NOT_APPLIED;
        }
        if (vVarH.J() ^ vVar.J()) {
            b bVar = b.f77332a;
            throw new UnsupportedOperationException("Can't update " + bVar.invoke(vVarH) + " Worker to " + bVar.invoke(vVar) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zL = uVar.l(str);
        if (!zL) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((w) it.next()).b(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.v0
            @Override // java.lang.Runnable
            public final void run() {
                y0.i(workDatabase, vVarH, vVar, list, str, set, zL);
            }
        });
        if (!zL) {
            z.f(cVar, workDatabase, list);
        }
        return zL ? androidx.work.m0.a.APPLIED_FOR_NEXT_RUN : androidx.work.m0.a.APPLIED_IMMEDIATELY;
    }

    @NotNull
    public static final t1<androidx.work.m0.a> h(@NotNull final r0 r0Var, @NotNull final androidx.work.o0 workRequest) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final androidx.work.impl.utils.futures.c future = androidx.work.impl.utils.futures.c.u();
        r0Var.U().d().execute(new Runnable() { // from class: androidx.work.impl.w0
            @Override // java.lang.Runnable
            public final void run() {
                y0.j(future, r0Var, workRequest);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WorkDatabase workDatabase, androidx.work.impl.model.v oldWorkSpec, androidx.work.impl.model.v newWorkSpec, List schedulers, String workSpecId, Set tags, boolean z10) {
        Intrinsics.checkNotNullParameter(workDatabase, "$workDatabase");
        Intrinsics.checkNotNullParameter(oldWorkSpec, "$oldWorkSpec");
        Intrinsics.checkNotNullParameter(newWorkSpec, "$newWorkSpec");
        Intrinsics.checkNotNullParameter(schedulers, "$schedulers");
        Intrinsics.checkNotNullParameter(workSpecId, "$workSpecId");
        Intrinsics.checkNotNullParameter(tags, "$tags");
        androidx.work.impl.model.w wVarK = workDatabase.k();
        androidx.work.impl.model.b0 b0VarL = workDatabase.l();
        androidx.work.impl.model.v vVarB = androidx.work.impl.model.v.B(newWorkSpec, null, oldWorkSpec.f76984b, null, null, null, null, 0L, 0L, 0L, null, oldWorkSpec.f76993k, null, 0L, oldWorkSpec.f76996n, 0L, 0L, false, null, oldWorkSpec.F(), oldWorkSpec.C() + 1, oldWorkSpec.D(), oldWorkSpec.E(), 0, 4447229, null);
        if (newWorkSpec.E() == 1) {
            vVarB.L(newWorkSpec.D());
            vVarB.M(vVarB.E() + 1);
        }
        wVarK.c(androidx.work.impl.utils.e.d(schedulers, vVarB));
        b0VarL.a(workSpecId);
        b0VarL.c(workSpecId, tags);
        if (z10) {
            return;
        }
        wVarK.K(workSpecId, -1L);
        workDatabase.j().a(workSpecId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(androidx.work.impl.utils.futures.c cVar, r0 this_updateWorkImpl, androidx.work.o0 workRequest) {
        Intrinsics.checkNotNullParameter(this_updateWorkImpl, "$this_updateWorkImpl");
        Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        if (cVar.isCancelled()) {
            return;
        }
        try {
            u processor = this_updateWorkImpl.O();
            Intrinsics.checkNotNullExpressionValue(processor, "processor");
            WorkDatabase workDatabase = this_updateWorkImpl.S();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
            androidx.work.c configuration = this_updateWorkImpl.o();
            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            List<w> schedulers = this_updateWorkImpl.Q();
            Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
            cVar.p(g(processor, workDatabase, configuration, schedulers, workRequest.d(), workRequest.c()));
        } catch (Throwable th2) {
            cVar.q(th2);
        }
    }
}
