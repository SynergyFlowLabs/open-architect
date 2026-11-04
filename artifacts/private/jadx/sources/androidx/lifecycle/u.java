package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f52521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.b f52522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f52523e;

        /* JADX INFO: renamed from: androidx.lifecycle.u$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        static final class C0481a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f52524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T> f52525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l0<T> f52526c;

            /* JADX INFO: renamed from: androidx.lifecycle.u$a$a$a, reason: collision with other inner class name */
            static final class C0482a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l0<T> f52527a;

                /* JADX WARN: Multi-variable type inference failed */
                C0482a(kotlinx.coroutines.channels.l0<? super T> l0Var) {
                    this.f52527a = l0Var;
                }

                @Override // kotlinx.coroutines.flow.j
                public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                    Object objG = this.f52527a.G(t10, dVar);
                    return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0481a(kotlinx.coroutines.flow.i<? extends T> iVar, kotlinx.coroutines.channels.l0<? super T> l0Var, kotlin.coroutines.d<? super C0481a> dVar) {
                super(2, dVar);
                this.f52525b = iVar;
                this.f52526c = l0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0481a(this.f52525b, this.f52526c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f52524a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.i<T> iVar = this.f52525b;
                    C0482a c0482a = new C0482a(this.f52526c);
                    this.f52524a = 1;
                    if (iVar.collect(c0482a, this) == objL) {
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
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0481a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c0 c0Var, c0.b bVar, kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52521c = c0Var;
            this.f52522d = bVar;
            this.f52523e = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f52521c, this.f52522d, this.f52523e, dVar);
            aVar.f52520b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.l0 l0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52519a;
            int i11 = 5 & 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.channels.l0 l0Var2 = (kotlinx.coroutines.channels.l0) this.f52520b;
                c0 c0Var = this.f52521c;
                c0.b bVar = this.f52522d;
                C0481a c0481a = new C0481a(this.f52523e, l0Var2, null);
                this.f52520b = l0Var2;
                this.f52519a = 1;
                if (j1.a(c0Var, bVar, c0481a, this) == objL) {
                    return objL;
                }
                l0Var = l0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l0Var = (kotlinx.coroutines.channels.l0) this.f52520b;
                ResultKt.m(obj);
            }
            kotlinx.coroutines.channels.o0.a.a(l0Var, null, 1, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.channels.l0<? super T> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull c0 lifecycle, @NotNull c0.b minActiveState) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        return kotlinx.coroutines.flow.k.t(new a(lifecycle, minActiveState, iVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i b(kotlinx.coroutines.flow.i iVar, c0 c0Var, c0.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = c0.b.STARTED;
        }
        return a(iVar, c0Var, bVar);
    }
}
