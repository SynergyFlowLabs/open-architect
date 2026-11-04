package androidx.datastore.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n495#1:539,10\n*E\n"})
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f49526a = kotlinx.coroutines.sync.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.x<Unit> f49527b = kotlinx.coroutines.z.c(null, 1, null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", i = {0, 0, 1, 1}, l = {544, 497}, m = "runIfNeeded", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49530c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49532e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49530c = obj;
            this.f49532e |= Integer.MIN_VALUE;
            return k0.this.c(this);
        }
    }

    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objQ = this.f49527b.q(dVar);
        return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
    }

    @Nullable
    protected abstract Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar3;
        k0 k0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f49532e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f49532e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f49530c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f49532e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (this.f49527b.x()) {
                    return Unit.f312394a;
                }
                aVar2 = this.f49526a;
                aVar.f49528a = this;
                aVar.f49529b = aVar2;
                aVar.f49532e = 1;
                if (aVar2.h(null, aVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (kotlinx.coroutines.sync.a) aVar.f49529b;
                k0Var = (k0) aVar.f49528a;
                try {
                    ResultKt.m(obj);
                    kotlinx.coroutines.x<Unit> xVar = k0Var.f49527b;
                    Unit unit = Unit.f312394a;
                    xVar.R(unit);
                    aVar3.i(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.i(null);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) aVar.f49529b;
            k0 k0Var2 = (k0) aVar.f49528a;
            ResultKt.m(obj);
            aVar2 = aVar4;
            this = k0Var2;
            if (this.f49527b.x()) {
                Unit unit2 = Unit.f312394a;
                aVar2.i(null);
                return unit2;
            }
            aVar.f49528a = this;
            aVar.f49529b = aVar2;
            aVar.f49532e = 2;
            if (this.b(aVar) != objL) {
                k0Var = this;
                aVar3 = aVar2;
                kotlinx.coroutines.x<Unit> xVar2 = k0Var.f49527b;
                Unit unit3 = Unit.f312394a;
                xVar2.R(unit3);
                aVar3.i(null);
                return unit3;
            }
            return objL;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar5 = aVar2;
            th2 = th4;
            aVar3 = aVar5;
            aVar3.i(null);
            throw th2;
        }
    }
}
