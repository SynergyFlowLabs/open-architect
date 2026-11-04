package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.compose.ui.t
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b5 f40320a = new b5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AtomicReference<a5> f40321b = new AtomicReference<>(a5.f40282a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40322c = 8;

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p2 f40323a;

        a(kotlinx.coroutines.p2 p2Var) {
            this.f40323a = p2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            kotlinx.coroutines.p2.a.b(this.f40323a, null, 1, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.c5 f40325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f40326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.c5 c5Var, View view, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f40325b = c5Var;
            this.f40326c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f40325b, this.f40326c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f40324a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.runtime.c5 c5Var = this.f40325b;
                    this.f40324a = 1;
                    if (c5Var.W0(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                if (c5.f(this.f40326c) == this.f40325b) {
                    c5.j(this.f40326c, null);
                }
                return Unit.f312394a;
            } catch (Throwable th2) {
                if (c5.f(this.f40326c) == this.f40325b) {
                    c5.j(this.f40326c, null);
                }
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private b5() {
    }

    @kotlin.a1
    public final boolean a(@NotNull a5 a5Var, @NotNull a5 a5Var2) {
        return androidx.compose.animation.core.z1.a(f40321b, a5Var, a5Var2);
    }

    @NotNull
    public final androidx.compose.runtime.c5 b(@NotNull View view) {
        androidx.compose.runtime.c5 c5VarA = f40321b.get().a(view);
        c5.j(view, c5VarA);
        view.addOnAttachStateChangeListener(new a(kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, kotlinx.coroutines.android.i.i(view.getHandler(), "windowRecomposer cleanup").R0(), null, new b(c5VarA, view, null), 2, null)));
        return c5VarA;
    }

    @kotlin.a1
    @NotNull
    public final a5 c(@NotNull a5 a5Var) {
        return f40321b.getAndSet(a5Var);
    }

    public final void d(@NotNull a5 a5Var) {
        f40321b.set(a5Var);
    }

    public final <R> R e(@NotNull a5 a5Var, @NotNull Function0<? extends R> function0) {
        a5 a5VarC = c(a5Var);
        try {
            R rInvoke = function0.invoke();
            kotlin.jvm.internal.h0.d(1);
            if (!a(a5Var, a5VarC)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                if (a(a5Var, a5VarC)) {
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
                kotlin.p.a(th2, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th2;
            }
        }
    }
}
