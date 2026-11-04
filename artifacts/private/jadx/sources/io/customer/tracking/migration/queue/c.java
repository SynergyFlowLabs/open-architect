package io.customer.tracking.migration.queue;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ih.e f288641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f288642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f288643c;

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.tracking.migration.queue.QueueImpl", f = "Queue.kt", i = {}, l = {26}, m = "run", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f288644a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f288646c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f288644a = obj;
            this.f288646c |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(@NotNull ih.e logger, @NotNull f runRequest) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(runRequest, "runRequest");
        this.f288641a = logger;
        this.f288642b = runRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.customer.tracking.migration.queue.b
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        Unit unit;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f288646c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f288646c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f288644a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f288646c;
        if (i11 == 0) {
            ResultKt.m(obj);
            synchronized (this) {
                try {
                    if (this.f288643c) {
                        return Unit.f312394a;
                    }
                    this.f288643c = true;
                    Unit unit2 = Unit.f312394a;
                    ih.e.a.a(this.f288641a, "Running migration queue...", null, 2, null);
                    f fVar = this.f288642b;
                    aVar.f288646c = 1;
                    if (fVar.a(aVar) == objL) {
                        return objL;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        synchronized (this) {
            try {
                this.f288643c = false;
                unit = Unit.f312394a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return unit;
    }

    public final boolean b() {
        return this.f288643c;
    }

    public final void c(boolean z10) {
        this.f288643c = z10;
    }
}
