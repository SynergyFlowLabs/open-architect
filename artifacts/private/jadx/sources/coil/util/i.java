package coil.util;

import androidx.annotation.l0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nLifecycles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n318#2,11:44\n1#3:55\n*S KotlinDebug\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n*L\n23#1:44,11\n*E\n"})
@oj.i(name = "-Lifecycles")
public final class i {

    @kotlin.coroutines.jvm.internal.f(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", i = {0, 0}, l = {44}, m = "awaitStarted", n = {"$this$awaitStarted", "observer"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f87831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f87832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f87833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f87834d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87833c = obj;
            this.f87834d |= Integer.MIN_VALUE;
            return i.a(null, this);
        }
    }

    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Unit> f87835a;

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.n<? super Unit> nVar) {
            this.f87835a = nVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(o0 o0Var) {
            kotlinx.coroutines.n<Unit> nVar = this.f87835a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.i$b, java.lang.Object] */
    @l0
    @Nullable
    public static final Object a(@NotNull androidx.lifecycle.c0 c0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        androidx.lifecycle.c0 c0Var2;
        i1.h hVar;
        Throwable th2;
        n0 n0Var;
        n0 n0Var2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f87834d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f87834d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f87833c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f87834d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (i1.h) aVar.f87832b;
            c0Var2 = (androidx.lifecycle.c0) aVar.f87831a;
            try {
                ResultKt.m(obj);
                n0Var2 = (n0) hVar.f312751a;
                if (n0Var2 != null) {
                    c0Var2.g(n0Var2);
                }
                return Unit.f312394a;
            } catch (Throwable th3) {
                th2 = th3;
                n0Var = (n0) hVar.f312751a;
                if (n0Var != null) {
                    c0Var2.g(n0Var);
                }
                throw th2;
            }
        }
        ResultKt.m(obj);
        if (c0Var.d().n(androidx.lifecycle.c0.b.STARTED)) {
            return Unit.f312394a;
        }
        i1.h hVar2 = new i1.h();
        try {
            aVar.f87831a = c0Var;
            aVar.f87832b = hVar2;
            aVar.f87834d = 1;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
            pVar.p0();
            ?? bVar = new b(pVar);
            hVar2.f312751a = bVar;
            Intrinsics.checkNotNull(bVar);
            c0Var.c((n0) bVar);
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(aVar);
            }
            if (objU == objL) {
                return objL;
            }
            c0Var2 = c0Var;
            hVar = hVar2;
            n0Var2 = (n0) hVar.f312751a;
            if (n0Var2 != null) {
                c0Var2.g(n0Var2);
            }
            return Unit.f312394a;
        } catch (Throwable th4) {
            c0Var2 = c0Var;
            hVar = hVar2;
            th2 = th4;
            n0Var = (n0) hVar.f312751a;
            if (n0Var != null) {
                c0Var2.g(n0Var);
            }
            throw th2;
        }
    }

    @l0
    public static final void b(@NotNull androidx.lifecycle.c0 c0Var, @NotNull n0 n0Var) {
        c0Var.g(n0Var);
        c0Var.c(n0Var);
    }
}
