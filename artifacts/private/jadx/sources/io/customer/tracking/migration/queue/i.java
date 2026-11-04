package io.customer.tracking.migration.queue;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final th.a f288662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ih.e f288663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.customer.tracking.migration.b f288664c;

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.tracking.migration.queue.QueueRunnerImpl", f = "QueueRunner.kt", i = {}, l = {21}, m = "runTask-gIAlu-s", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f288665a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f288667c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f288665a = obj;
            this.f288667c |= Integer.MIN_VALUE;
            Object objA = i.this.a(null, this);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Result.a(objA);
        }
    }

    public i(@NotNull th.a jsonAdapter, @NotNull ih.e logger, @NotNull io.customer.tracking.migration.b migrationProcessor) {
        Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(migrationProcessor, "migrationProcessor");
        this.f288662a = jsonAdapter;
        this.f288663b = logger;
        this.f288664c = migrationProcessor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // io.customer.tracking.migration.queue.h
    @Nullable
    public Object a(@NotNull JSONObject jSONObject, @NotNull kotlin.coroutines.d<? super Result<Unit>> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f288667c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f288667c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f288665a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f288667c;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((Result) obj).j();
            }
            ResultKt.m(obj);
            Result.a aVar2 = Result.Companion;
            ih.e.a.a(this.f288663b, "migrating task: " + jSONObject, null, 2, null);
            Object objC = this.f288662a.c(jSONObject);
            Throwable thD = Result.d(objC);
            if (thD == null) {
                io.customer.tracking.migration.b bVar = this.f288664c;
                aVar.f288667c = 1;
                Object objA = bVar.a((qh.a) objC, aVar);
                return objA == objL ? objL : objA;
            }
            String message = thD.getMessage();
            if (message == null) {
                message = "Queue task data is invalid for " + jSONObject + ". Could not run task.";
            }
            String str = message;
            ih.e.a.b(this.f288663b, str, null, null, 6, null);
            return Result.m785constructorimpl(ResultKt.createFailure(new RuntimeException(str)));
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
