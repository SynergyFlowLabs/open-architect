package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n25#2,5:87\n33#2:92\n33#2:93\n33#2:94\n33#2:104\n318#3,9:95\n327#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n36#1:87,5\n42#1:92\n54#1:93\n58#1:94\n80#1:104\n79#1:95,9\n79#1:105,2\n*E\n"})
public final class x2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36778e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f36779a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<kotlin.coroutines.d<Unit>> f36780b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<kotlin.coroutines.d<Unit>> f36781c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36782d = true;

    @SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,86:1\n33#2:87\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n82#1:87\n*E\n"})
    static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Unit> f36784b;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.n<? super Unit> nVar) {
            this.f36784b = nVar;
        }

        public final void c(Throwable th2) {
            Object obj = x2.this.f36779a;
            x2 x2Var = x2.this;
            kotlinx.coroutines.n<Unit> nVar = this.f36784b;
            synchronized (obj) {
                try {
                    x2Var.f36780b.remove(nVar);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (e()) {
            return Unit.f312394a;
        }
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        synchronized (this.f36779a) {
            try {
                this.f36780b.add(pVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        pVar.e0(new a(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    public final void d() {
        synchronized (this.f36779a) {
            try {
                this.f36782d = false;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f36779a) {
            z10 = this.f36782d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f36779a) {
            try {
                if (e()) {
                    return;
                }
                List<kotlin.coroutines.d<Unit>> list = this.f36780b;
                this.f36780b = this.f36781c;
                this.f36781c = list;
                this.f36782d = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    kotlin.coroutines.d<Unit> dVar = list.get(i10);
                    Result.a aVar = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                }
                list.clear();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <R> R g(@NotNull Function0<? extends R> function0) {
        d();
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.h0.d(1);
            f();
            kotlin.jvm.internal.h0.c(1);
        }
    }
}
