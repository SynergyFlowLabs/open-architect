package io.customer.tracking.migration.queue;

import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nQueueRunRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueueRunRequest.kt\nio/customer/tracking/migration/queue/QueueRunRequestImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f288648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f288649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih.e f288650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f288651d;

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.tracking.migration.queue.QueueRunRequestImpl", f = "QueueRunRequest.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "executeOrThrows-0E7RQCE", n = {"$this$executeOrThrows_0E7RQCE_u24lambda_u244", "taskStorageId"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f288652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f288653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f288654c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f288656e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f288654c = obj;
            this.f288656e |= Integer.MIN_VALUE;
            Object objC = g.this.c(null, null, this);
            return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Result.a(objC);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.tracking.migration.queue.QueueRunRequestImpl", f = "QueueRunRequest.kt", i = {0, 0}, l = {28}, m = "run", n = {"$this$run_u24lambda_u240", "tasksToRun"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f288657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f288658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f288659c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f288661e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f288659c = obj;
            this.f288661e |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    public g(@NotNull h runner, @NotNull j queueStorage, @NotNull ih.e logger, @NotNull d queryRunner) {
        Intrinsics.checkNotNullParameter(runner, "runner");
        Intrinsics.checkNotNullParameter(queueStorage, "queueStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(queryRunner, "queryRunner");
        this.f288648a = runner;
        this.f288649b = queueStorage;
        this.f288650c = logger;
        this.f288651d = queryRunner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(List<JSONObject> list, JSONObject jSONObject, kotlin.coroutines.d<? super Result<Unit>> dVar) {
        a aVar;
        String strA;
        Object objA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f288656e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f288656e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f288654c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f288656e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                Result.a aVar2 = Result.Companion;
                list.remove(jSONObject);
                strA = io.customer.tracking.migration.queue.a.a(jSONObject);
                JSONObject jSONObject2 = strA != null ? this.f288649b.get(strA) : null;
                if (jSONObject2 == null) {
                    ih.e.a.b(this.f288650c, "Tried to get queue task with storage id: " + strA + " but storage couldn't find it.", null, null, 6, null);
                    if (strA != null) {
                        kotlin.coroutines.jvm.internal.b.a(this.f288649b.a(strA));
                    }
                } else {
                    ih.e.a.a(this.f288650c, "queue tasks left to run: " + list.size(), null, 2, null);
                    ih.e.a.a(this.f288650c, "queue next task to run: " + strA + ", " + jSONObject2, null, 2, null);
                    h hVar = this.f288648a;
                    aVar.f288652a = this;
                    aVar.f288653b = strA;
                    aVar.f288656e = 1;
                    objA = hVar.a(jSONObject2, aVar);
                    if (objA == objL) {
                        return objL;
                    }
                }
                return Result.m785constructorimpl(Unit.f312394a);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) aVar.f288653b;
            g gVar = (g) aVar.f288652a;
            ResultKt.m(obj);
            Object objJ = ((Result) obj).j();
            strA = str;
            this = gVar;
            objA = objJ;
            if (Result.h(objA)) {
                ih.e.a.a(this.f288650c, "queue task " + strA + " ran successfully", null, 2, null);
                ih.e.a.a(this.f288650c, "queue deleting task " + strA, null, 2, null);
            } else if (Result.m786isFailureimpl(objA)) {
                Throwable thD = Result.d(objA);
                ih.e.a.a(this.f288650c, "queue task " + strA + " run failed " + thD, null, 2, null);
            }
            this.f288649b.a(strA);
            return Result.m785constructorimpl(Unit.f312394a);
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.customer.tracking.migration.queue.f
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        Object objM785constructorimpl;
        g gVar;
        List<JSONObject> mutableList;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f288661e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f288661e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f288659c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f288661e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                Result.a aVar = Result.Companion;
                ih.e.a.a(this.f288650c, "queue starting to run tasks...", null, 2, null);
                gVar = this;
                mutableList = CollectionsKt.toMutableList((Collection) this.f288649b.b());
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableList = (List) bVar.f288658b;
                gVar = (g) bVar.f288657a;
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            while (!mutableList.isEmpty()) {
                JSONObject jSONObjectA = gVar.f288651d.a(mutableList);
                if (jSONObjectA == null) {
                    ih.e.a.a(gVar.f288650c, "all queue tasks have been migrated or failed to run. Exiting queue run.", null, 2, null);
                    break;
                }
                bVar.f288657a = gVar;
                bVar.f288658b = mutableList;
                bVar.f288661e = 1;
                if (gVar.c(mutableList, jSONObjectA, bVar) == objL) {
                    return objL;
                }
            }
            ih.e.a.a(gVar.f288650c, "queue done running tasks", null, 2, null);
            objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thD = Result.d(objM785constructorimpl);
        if (thD != null) {
            int i12 = 7 | 0;
            ih.e.a.b(this.f288650c, "queue run failed with exception: " + thD, null, null, 6, null);
        }
        return Unit.f312394a;
    }
}
