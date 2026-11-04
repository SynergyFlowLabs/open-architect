package androidx.compose.animation.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class a<R> implements Function1<Long, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f12948a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Long, ? extends R> function1) {
            this.f12948a = function1;
        }

        public final R c(long j10) {
            return this.f12948a.invoke(Long.valueOf(j10 / 1000000));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return c(l10.longValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    static final class b<R> extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f12950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f12950b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new b(this.f12950b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f12949a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<Long, R> function1 = this.f12950b;
            this.f12949a = 1;
            Object objF = androidx.compose.runtime.d3.f(function1, this);
            return objF == objL ? objL : objF;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super R> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <R> Object a(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return c(new a(function1), dVar);
    }

    private static final <R> Object b(Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super R> dVar) {
        a aVar = new a(function1);
        kotlin.jvm.internal.h0.e(0);
        Object objC = c(aVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return objC;
    }

    @Nullable
    public static final <R> Object c(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        androidx.compose.ui.platform.m2 m2Var = (androidx.compose.ui.platform.m2) dVar.getContext().get(androidx.compose.ui.platform.m2.L);
        return m2Var == null ? androidx.compose.runtime.d3.f(function1, dVar) : m2Var.X(new b(function1, null), dVar);
    }
}
