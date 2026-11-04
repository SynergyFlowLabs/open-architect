package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.q3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super c0.a>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f52445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52445c = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(kotlinx.coroutines.channels.l0 l0Var, o0 o0Var, c0.a aVar) {
            l0Var.p(aVar);
            if (aVar == c0.a.ON_DESTROY) {
                int i10 = 5 & 0;
                kotlinx.coroutines.channels.o0.a.a(l0Var, null, 1, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(c0 c0Var, j0 j0Var) {
            c0Var.g(j0Var);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f52445c, dVar);
            aVar.f52444b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52443a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f52444b;
                final j0 j0Var = new j0() { // from class: androidx.lifecycle.k0
                    @Override // androidx.lifecycle.j0
                    public final void e(o0 o0Var, c0.a aVar) {
                        m0.a.n(l0Var, o0Var, aVar);
                    }
                };
                this.f52445c.c(j0Var);
                final c0 c0Var = this.f52445c;
                Function0 function0 = new Function0() { // from class: androidx.lifecycle.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m0.a.s(c0Var, j0Var);
                    }
                };
                this.f52443a = 1;
                if (kotlinx.coroutines.channels.j0.b(l0Var, function0, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.channels.l0<? super c0.a> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final f0 a(@NotNull c0 c0Var) {
        g0 g0Var;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        do {
            g0 g0Var2 = (g0) c0Var.f().b();
            if (g0Var2 != null) {
                return g0Var2;
            }
            g0Var = new g0(c0Var, q3.c(null, 1, null).plus(kotlinx.coroutines.l1.e().R0()));
        } while (!c0Var.f().a(null, g0Var));
        g0Var.k();
        return g0Var;
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<c0.a> b(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.t(new a(c0Var, null)), kotlinx.coroutines.l1.e().R0());
    }
}
