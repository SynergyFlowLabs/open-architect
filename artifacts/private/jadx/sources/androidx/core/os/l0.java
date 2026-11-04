package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.w0;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "Profiling")
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f48048a = "KEY_DURATION_MS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f48049b = "KEY_SAMPLING_INTERVAL_BYTES";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f48050c = "KEY_TRACK_JAVA_ALLOCATIONS";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f48051d = "KEY_FREQUENCY_HZ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f48052e = "KEY_SIZE_KB";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f48053f = "KEY_BUFFER_FILL_POLICY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f48054g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f48055h = 2;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.channels.l0<? super ProfilingResult>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f48058c;

        /* JADX INFO: renamed from: androidx.core.os.l0$a$a, reason: collision with other inner class name */
        static final class C0397a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProfilingManager f48059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Consumer<ProfilingResult> f48060b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0397a(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
                super(0);
                this.f48059a = profilingManager;
                this.f48060b = consumer;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f48059a.unregisterForAllProfilingResults(this.f48060b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f48058c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(kotlinx.coroutines.channels.l0 l0Var, ProfilingResult result) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            l0Var.p(result);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(Runnable runnable) {
            runnable.run();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f48058c, dVar);
            aVar.f48057b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f48056a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final kotlinx.coroutines.channels.l0 l0Var = (kotlinx.coroutines.channels.l0) this.f48057b;
                Consumer consumer = new Consumer() { // from class: androidx.core.os.j0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        l0.a.n(l0Var, (ProfilingResult) obj2);
                    }
                };
                ProfilingManager profilingManagerA = f0.a(this.f48058c.getSystemService(e0.a()));
                profilingManagerA.registerForAllProfilingResults(new Executor() { // from class: androidx.core.os.k0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        l0.a.s(runnable);
                    }
                }, consumer);
                C0397a c0397a = new C0397a(profilingManagerA, consumer);
                this.f48056a = 1;
                if (kotlinx.coroutines.channels.j0.b(l0Var, c0397a, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.channels.l0<? super ProfilingResult> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @w0(api = 35)
    @NotNull
    public static final kotlinx.coroutines.flow.i<ProfilingResult> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kotlinx.coroutines.flow.k.t(new a(context, null));
    }

    @w0(api = 35)
    public static final void b(@NotNull Context context, @NotNull Executor executor, @NotNull Consumer<ProfilingResult> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f0.a(context.getSystemService(e0.a())).registerForAllProfilingResults(executor, listener);
    }

    @w0(api = 35)
    public static final void c(@NotNull Context context, @NotNull m0 profilingRequest, @Nullable Executor executor, @Nullable Consumer<ProfilingResult> consumer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(profilingRequest, "profilingRequest");
        f0.a(context.getSystemService(e0.a())).requestProfiling(profilingRequest.c(), profilingRequest.b(), profilingRequest.d(), profilingRequest.a(), executor, consumer);
    }

    @w0(api = 35)
    public static final void d(@NotNull Context context, @NotNull Consumer<ProfilingResult> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        f0.a(context.getSystemService(e0.a())).unregisterForAllProfilingResults(listener);
    }
}
