package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import androidx.compose.runtime.d7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@v0
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDeferredTargetAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n85#2:91\n117#2,2:92\n1#3:94\n*S KotlinDebug\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n*L\n51#1:91\n51#1:92,2\n*E\n"})
public final class j0<T, V extends w> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13037d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z3<T, V> f13038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13039b = d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private c<T, V> f13040c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", f = "DeferredTargetAnimation.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<T, V> f13042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0<T, V> f13043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f13044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y0<T> f13045e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T, V> cVar, j0<T, V> j0Var, T t10, y0<T> y0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f13042b = cVar;
            this.f13043c = j0Var;
            this.f13044d = t10;
            this.f13045e = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f13042b, this.f13043c, this.f13044d, this.f13045e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13041a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!Intrinsics.areEqual(this.f13042b.s(), this.f13043c.d())) {
                    c<T, V> cVar = this.f13042b;
                    T t10 = this.f13044d;
                    y0<T> y0Var = this.f13045e;
                    this.f13041a = 1;
                    if (c.i(cVar, t10, y0Var, null, null, this, 12, null) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j0(@NotNull z3<T, V> z3Var) {
        this.f13038a = z3Var;
    }

    private final T c() {
        c<T, V> cVar = this.f13040c;
        if (cVar != null) {
            return cVar.s();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T d() {
        return this.f13039b.getValue();
    }

    private final void f(T t10) {
        this.f13039b.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object h(j0 j0Var, Object obj, kotlinx.coroutines.s0 s0Var, y0 y0Var, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            int i11 = 3 & 0;
            y0Var = p.r(0.0f, 0.0f, null, 7, null);
        }
        return j0Var.g(obj, s0Var, y0Var);
    }

    @Nullable
    public final T b() {
        return d();
    }

    public final boolean e() {
        c<T, V> cVar;
        return Intrinsics.areEqual(d(), c()) && ((cVar = this.f13040c) == null || !cVar.y());
    }

    public final T g(T t10, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull y0<T> y0Var) {
        T t11;
        c<T, V> cVar;
        f(t10);
        c<T, V> cVar2 = this.f13040c;
        if (cVar2 == null) {
            t11 = t10;
            c<T, V> cVar3 = new c<>(t11, this.f13038a, null, null, 12, null);
            this.f13040c = cVar3;
            cVar = cVar3;
        } else {
            t11 = t10;
            cVar = cVar2;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new a(cVar, this, t11, y0Var, null), 3, null);
        return cVar.v();
    }
}
