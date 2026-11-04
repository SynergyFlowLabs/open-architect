package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p2 f72303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> f72304d;

        /* JADX INFO: renamed from: androidx.paging.k$a$a, reason: collision with other inner class name */
        static final class C0673a extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a3<T> f72305a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0673a(a3<T> a3Var) {
                super(1);
                this.f72305a = a3Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                kotlinx.coroutines.channels.o0.a.a(this.f72305a, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.p2 p2Var, Function2<? super a3<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f72303c = p2Var;
            this.f72304d = function2;
            int i10 = 5 | 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f72303c, this.f72304d, dVar);
            aVar.f72302b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72301a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a3<T> a3Var = (a3) this.f72302b;
                this.f72303c.E(new C0673a(a3Var));
                Function2<a3<T>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f72304d;
                this.f72301a = 1;
                if (function2.invoke(a3Var, this) == objL) {
                    return objL;
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
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull a3<T> a3Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(a3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@NotNull kotlinx.coroutines.p2 controller, @NotNull Function2<? super a3<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(block, "block");
        return z2.a(new a(controller, block, null));
    }
}
