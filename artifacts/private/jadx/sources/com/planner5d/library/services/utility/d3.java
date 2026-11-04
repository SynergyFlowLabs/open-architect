package com.planner5d.library.services.utility;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSuspendLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendLazy.kt\ncom/planner5d/library/services/utility/SuspendLazy\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n116#2,7:23\n124#2,2:31\n116#2,10:33\n1#3:30\n*S KotlinDebug\n*F\n+ 1 SuspendLazy.kt\ncom/planner5d/library/services/utility/SuspendLazy\n*L\n12#1:23,7\n12#1:31,2\n19#1:33,10\n*E\n"})
public final class d3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> f225180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private T f225181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f225182c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.SuspendLazy", f = "SuspendLazy.kt", i = {0, 0, 1, 1}, l = {27, 15}, m = "get", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f225185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d3<T> f225186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225187e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d3<? extends T> d3Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f225186d = d3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225185c = obj;
            this.f225187e |= Integer.MIN_VALUE;
            return this.f225186d.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.SuspendLazy", f = "SuspendLazy.kt", i = {0, 0}, l = {27}, m = "isInitialized", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f225190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d3<T> f225191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225192e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d3<? extends T> d3Var, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f225191d = d3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225190c = obj;
            this.f225192e |= Integer.MIN_VALUE;
            return this.f225191d.b(this);
        }
    }

    public d3(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f225180a = initializer;
        this.f225182c = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        d3<T> d3Var;
        kotlinx.coroutines.sync.a aVar3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f225187e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f225187e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        T t10 = (T) aVar.f225185c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f225187e;
        try {
            if (i11 == 0) {
                ResultKt.m(t10);
                aVar2 = this.f225182c;
                aVar.f225183a = this;
                aVar.f225184b = aVar2;
                aVar.f225187e = 1;
                if (aVar2.h(null, aVar) == objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (kotlinx.coroutines.sync.a) aVar.f225184b;
                d3Var = (d3) aVar.f225183a;
                try {
                    ResultKt.m(t10);
                    d3Var.f225181b = t10;
                    d3Var.f225180a = null;
                    if (t10 == null) {
                        aVar2 = aVar3;
                        this = d3Var;
                        kotlinx.coroutines.sync.a aVar4 = aVar2;
                        t10 = this.f225181b;
                        aVar3 = aVar4;
                    }
                    aVar3.i(null);
                    return t10;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.i(null);
                    throw th;
                }
            }
            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) aVar.f225184b;
            d3<T> d3Var2 = (d3) aVar.f225183a;
            ResultKt.m(t10);
            aVar2 = aVar5;
            this = d3Var2;
            Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1 = this.f225180a;
            if (function1 != null) {
                aVar.f225183a = this;
                aVar.f225184b = aVar2;
                aVar.f225187e = 2;
                Object objInvoke = function1.invoke(aVar);
                if (objInvoke != objL) {
                    d3Var = this;
                    aVar3 = aVar2;
                    t10 = (T) objInvoke;
                    d3Var.f225181b = t10;
                    d3Var.f225180a = null;
                    if (t10 == null) {
                        aVar2 = aVar3;
                        this = d3Var;
                        kotlinx.coroutines.sync.a aVar6 = aVar2;
                        t10 = this.f225181b;
                        aVar3 = aVar6;
                    }
                }
                return objL;
            }
            kotlinx.coroutines.sync.a aVar7 = aVar2;
            t10 = this.f225181b;
            aVar3 = aVar7;
            aVar3.i(null);
            return t10;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar8 = aVar2;
            th = th3;
            aVar3 = aVar8;
            aVar3.i(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object b(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f225192e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f225192e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f225190c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f225192e;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f225182c;
            bVar.f225188a = this;
            bVar.f225189b = aVar;
            bVar.f225192e = 1;
            if (aVar.h(null, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) bVar.f225189b;
            d3<T> d3Var = (d3) bVar.f225188a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = d3Var;
        }
        try {
            if (this.f225180a != null) {
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        } finally {
            aVar.i(null);
        }
    }
}
