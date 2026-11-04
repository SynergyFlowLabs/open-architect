package com.planner5d.library.model.manager.initialization;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nInitializationWorkHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationWorkHandler.kt\ncom/planner5d/library/model/manager/initialization/InitializationWorkHandler\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,63:1\n116#2,11:64\n*S KotlinDebug\n*F\n+ 1 InitializationWorkHandler.kt\ncom/planner5d/library/model/manager/initialization/InitializationWorkHandler\n*L\n34#1:64,11\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f191716d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f191717a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f191718b = kotlinx.coroutines.sync.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<b> f191719c = new ArrayList();

    @w0(parameters = 1)
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f191720a = 0;
    }

    public interface b {
        @Nullable
        Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar);
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationWorkHandler", f = "InitializationWorkHandler.kt", i = {0}, l = {42}, m = "execute", n = {"this"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191722b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191724d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191722b = obj;
            this.f191724d |= Integer.MIN_VALUE;
            return x.this.d(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationWorkHandler$execute$2", f = "InitializationWorkHandler.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.f160708m0, 45}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nInitializationWorkHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationWorkHandler.kt\ncom/planner5d/library/model/manager/initialization/InitializationWorkHandler$execute$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n116#2,8:64\n125#2,2:73\n1#3:72\n*S KotlinDebug\n*F\n+ 1 InitializationWorkHandler.kt\ncom/planner5d/library/model/manager/initialization/InitializationWorkHandler$execute$2\n*L\n43#1:64,8\n43#1:73,2\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191728d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f191730f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f191730f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new d(this.f191730f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            x xVar;
            b bVar;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            Object next;
            b bVar2;
            x xVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191728d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = x.this.f191718b;
                    x xVar3 = x.this;
                    b bVar3 = this.f191730f;
                    this.f191725a = aVar;
                    this.f191726b = xVar3;
                    this.f191727c = bVar3;
                    this.f191728d = 1;
                    if (aVar.h(null, this) != objL) {
                        xVar = xVar3;
                        bVar = bVar3;
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (b) this.f191727c;
                    xVar2 = (x) this.f191726b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f191725a;
                    try {
                        ResultKt.m(obj);
                        xVar2.f191719c.add(bVar2);
                        Unit unit = Unit.f312394a;
                        aVar2.i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(null);
                        throw th2;
                    }
                }
                bVar = (b) this.f191727c;
                xVar = (x) this.f191726b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f191725a;
                ResultKt.m(obj);
                aVar = aVar3;
                Iterator it = xVar.f191719c.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((b) next).getClass() != bVar.getClass());
                if (next == null) {
                    this.f191725a = aVar;
                    this.f191726b = xVar;
                    this.f191727c = bVar;
                    this.f191728d = 2;
                    if (bVar.a(this) != objL) {
                        aVar2 = aVar;
                        bVar2 = bVar;
                        xVar2 = xVar;
                        xVar2.f191719c.add(bVar2);
                    }
                    return objL;
                }
                aVar2 = aVar;
                Unit unit2 = Unit.f312394a;
                aVar2.i(null);
                return unit2;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar4 = aVar;
                th2 = th4;
                aVar2 = aVar4;
                aVar2.i(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationWorkHandler", f = "InitializationWorkHandler.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = MetricTracker.Object.RESET, n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191733c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191735e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191733c = obj;
            this.f191735e |= Integer.MIN_VALUE;
            return x.this.f(this);
        }
    }

    @ij.a
    public x() {
    }

    public final void a() {
        this.f191717a.set(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object d(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f191724d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f191724d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f191722b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f191724d;
        if (i11 == 0) {
            ResultKt.m(obj);
            g();
            CoroutineContext coroutineContextPlus = com.planner5d.library.services.utility.s.f229729a.h().plus(c3.f313552a);
            d dVar2 = new d(bVar, null);
            cVar.f191721a = this;
            cVar.f191724d = 1;
            if (kotlinx.coroutines.i.h(coroutineContextPlus, dVar2, cVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (x) cVar.f191721a;
            ResultKt.m(obj);
        }
        this.g();
        return Unit.f312394a;
    }

    public final boolean e() {
        return this.f191717a.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        e eVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f191735e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f191735e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f191733c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f191735e;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.f191717a.set(false);
            aVar = this.f191718b;
            eVar.f191731a = this;
            eVar.f191732b = aVar;
            eVar.f191735e = 1;
            if (aVar.h(null, eVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) eVar.f191732b;
            x xVar = (x) eVar.f191731a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = xVar;
        }
        try {
            this.f191719c.clear();
            Unit unit = Unit.f312394a;
            aVar.i(null);
            return unit;
        } catch (Throwable th2) {
            aVar.i(null);
            throw th2;
        }
    }

    public final void g() throws a {
        if (this.f191717a.get()) {
            throw new a();
        }
    }
}
