package androidx.compose.ui.platform;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f40668b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f40668b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f40668b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f40667a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<Long, R> function1 = this.f40668b;
            this.f40667a = 1;
            Object objF = androidx.compose.runtime.d3.f(function1, this);
            return objF == objL ? objL : objF;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super R> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <R> Object a(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        m2 m2Var = (m2) dVar.getContext().get(m2.L);
        return m2Var == null ? androidx.compose.runtime.d3.f(function1, dVar) : m2Var.X(new a(function1, null), dVar);
    }
}
