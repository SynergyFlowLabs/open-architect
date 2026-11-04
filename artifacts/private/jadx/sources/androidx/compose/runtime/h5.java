package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n*L\n1#1,1903:1\n30#2:1904\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n84#1:1904\n*E\n"})
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f35812a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f35813b = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1, 100}, m = "invokeSuspend", n = {"recomposer"}, s = {"L$0"})
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.s0, c5, kotlin.coroutines.d<? super R>, Object> f35816c;

        /* JADX INFO: renamed from: androidx.compose.runtime.h5$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160715o1}, m = "invokeSuspend", n = {}, s = {})
        static final class C0272a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35817a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c5 f35818b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0272a(c5 c5Var, kotlin.coroutines.d<? super C0272a> dVar) {
                super(2, dVar);
                this.f35818b = c5Var;
                int i10 = 2 ^ 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0272a(this.f35818b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f35817a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c5 c5Var = this.f35818b;
                    this.f35817a = 1;
                    if (c5Var.v1(this) == objL) {
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
                return ((C0272a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super kotlinx.coroutines.s0, ? super c5, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f35816c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f35816c, dVar);
            aVar.f35815b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c5 c5Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35814a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f35815b;
                c5Var = new c5(s0Var.getCoroutineContext());
                kotlinx.coroutines.k.f(s0Var, null, null, new C0272a(c5Var, null), 3, null);
                pj.n<kotlinx.coroutines.s0, c5, kotlin.coroutines.d<? super R>, Object> nVar = this.f35816c;
                this.f35815b = c5Var;
                this.f35814a = 1;
                obj = nVar.invoke(s0Var, c5Var, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f35815b;
                ResultKt.m(obj);
                return obj2;
            }
            c5Var = (c5) this.f35815b;
            ResultKt.m(obj);
            c5Var.D0();
            this.f35815b = obj;
            this.f35814a = 2;
            if (c5Var.W0(this) != objL) {
                return obj;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private static final long c() {
        return 1000;
    }

    @Nullable
    public static final <R> Object d(@NotNull pj.n<? super kotlinx.coroutines.s0, ? super c5, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.t0.g(new a(nVar, null), dVar);
    }
}
