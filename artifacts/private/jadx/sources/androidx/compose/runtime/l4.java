package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,207:1\n318#2,11:208\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n49#1:208,11\n*E\n"})
final class l4<T> implements k4<T>, n3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n3<T> f36212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f36213b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {208}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l4<T> f36216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36217d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l4<T> l4Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f36216c = l4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36215b = obj;
            this.f36217d |= Integer.MIN_VALUE;
            return this.f36216c.j1(null, this);
        }
    }

    public l4(@NotNull n3<T> n3Var, @NotNull CoroutineContext coroutineContext) {
        this.f36212a = n3Var;
        this.f36213b = coroutineContext;
    }

    @Override // androidx.compose.runtime.n3
    public T component1() {
        return this.f36212a.component1();
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    public Function1<T, Unit> component2() {
        return this.f36212a.component2();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36213b;
    }

    @Override // androidx.compose.runtime.n3, androidx.compose.runtime.n7
    public T getValue() {
        return this.f36212a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.compose.runtime.k4
    @Nullable
    public Object j1(@NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f36217d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36217d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f36215b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f36217d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar.f36214a = function0;
                aVar.f36217d = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
                pVar.p0();
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar);
                }
                if (objU == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) aVar.f36214a;
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.n3
    public void setValue(T t10) {
        this.f36212a.setValue(t10);
    }
}
