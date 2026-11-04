package androidx.compose.ui.platform;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,89:1\n75#2:90\n1282#3,6:91\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n*L\n59#1:90\n61#1:91,6\n*E\n"})
public final class y4 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w4 f40977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n7<Function1<Boolean, Unit>> f40978c;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.y4$a$a, reason: collision with other inner class name */
        static final class C0328a extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w4 f40979a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0328a(w4 w4Var) {
                super(0);
                this.f40979a = w4Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f40979a.c());
            }
        }

        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n7<Function1<Boolean, Unit>> f40980a;

            /* JADX WARN: Multi-variable type inference failed */
            b(n7<? extends Function1<? super Boolean, Unit>> n7Var) {
                this.f40980a = n7Var;
            }

            public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
                this.f40980a.getValue().invoke(kotlin.coroutines.jvm.internal.b.a(z10));
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(w4 w4Var, n7<? extends Function1<? super Boolean, Unit>> n7Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f40977b = w4Var;
            this.f40978c = n7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f40977b, this.f40978c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f40976a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarY = w6.y(new C0328a(this.f40977b));
                b bVar = new b(this.f40978c);
                this.f40976a = 1;
                if (iVarY.collect(bVar, this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f40981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40982b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Boolean, Unit> function1, int i10) {
            super(2);
            this.f40981a = function1;
            this.f40982b = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            y4.a(this.f40981a, c0Var, androidx.compose.runtime.t4.a(this.f40982b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.o
    public static final void a(@NotNull Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(127829799);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(127829799, i11, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:57)");
            }
            w4 w4Var = (w4) c0VarR.W(q1.E());
            n7 n7VarW = w6.w(function1, c0VarR, i11 & 14);
            boolean zD = c0VarR.D(w4Var) | c0VarR.D(n7VarW);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(w4Var, n7VarW, null);
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.i(w4Var, (Function2) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(function1, i10));
        }
    }
}
