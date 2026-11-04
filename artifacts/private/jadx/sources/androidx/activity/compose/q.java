package androidx.activity.compose;

import androidx.activity.e0;
import androidx.activity.g0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,153:1\n1225#2,6:154\n1225#2,6:160\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n*L\n119#1:154,6\n151#1:160,6\n*E\n"})
public final class q {

    static final class a extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9865a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class b extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(2);
            this.f9866a = i10;
        }

        public final void c(c0 c0Var, int i10) {
            q.a(c0Var, t4.a(this.f9866a | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", i = {0}, l = {159}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,153:1\n168#2,10:154\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n*L\n151#1:154,10\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f9869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f9870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e0 e0Var, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f9869c = e0Var;
            this.f9870d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f9869c, this.f9870d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            e0 e0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f9868b;
            if (i10 == 0) {
                ResultKt.m(obj);
                e0 e0Var2 = this.f9869c;
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f9870d;
                e0Var2.c();
                if (!e0Var2.e()) {
                    try {
                        this.f9867a = e0Var2;
                        this.f9868b = 1;
                        if (function1.invoke(this) == objL) {
                            return objL;
                        }
                        e0Var = e0Var2;
                        e0Var.h();
                    } catch (Throwable th3) {
                        th2 = th3;
                        e0Var = e0Var2;
                        e0Var.h();
                        throw th2;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0Var = (e0) this.f9867a;
                try {
                    ResultKt.m(obj);
                    e0Var.h();
                } catch (Throwable th4) {
                    th2 = th4;
                    e0Var.h();
                    throw th2;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f9871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9872b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, int i10) {
            super(2);
            this.f9871a = function1;
            this.f9872b = i10;
        }

        public final void c(c0 c0Var, int i10) {
            q.b(this.f9871a, c0Var, t4.a(this.f9872b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class e extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f9873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, int i10) {
            super(2);
            this.f9873a = function1;
            this.f9874b = i10;
        }

        public final void c(c0 c0Var, int i10) {
            q.b(this.f9873a, c0Var, t4.a(this.f9874b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,153:1\n64#2,5:154\n64#2,5:159\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n*L\n121#1:154,5\n124#1:159,5\n*E\n"})
    static final class f extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f9875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f9876b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n*L\n1#1,490:1\n121#2:491\n*E\n"})
        public static final class a implements u1 {
            @Override // androidx.compose.runtime.u1
            public void dispose() {
            }
        }

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n*L\n1#1,490:1\n124#2:491\n*E\n"})
        public static final class b implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f9877a;

            public b(p pVar) {
                this.f9877a = pVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f9877a.i();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(e0 e0Var, Function0<Boolean> function0) {
            super(1);
            this.f9875a = e0Var;
            this.f9876b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            return this.f9875a.e() ? new a() : new b(new p(this.f9875a, this.f9876b));
        }
    }

    static final class g extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f9878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9879b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Boolean> function0, int i10) {
            super(2);
            this.f9878a = function0;
            this.f9879b = i10;
        }

        public final void c(c0 c0Var, int i10) {
            q.c(this.f9878a, c0Var, t4.a(this.f9879b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class h extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f9880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function0<Boolean> function0, int i10) {
            super(2);
            this.f9880a = function0;
            this.f9881b = i10;
        }

        public final void c(c0 c0Var, int i10) {
            q.c(this.f9880a, c0Var, t4.a(this.f9881b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.o
    public static final void a(@Nullable c0 c0Var, int i10) {
        c0 c0VarR = c0Var.R(-1357012904);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-1357012904, i10, -1, "androidx.activity.compose.ReportDrawn (ReportDrawn.kt:135)");
            }
            c(a.f9865a, c0VarR, 6);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(i10));
        }
    }

    @androidx.compose.runtime.o
    public static final void b(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @Nullable c0 c0Var, int i10) {
        int i11;
        e0 fullyDrawnReporter;
        c0 c0VarR = c0Var.R(945311272);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(945311272, i11, -1, "androidx.activity.compose.ReportDrawnAfter (ReportDrawn.kt:148)");
            }
            g0 g0VarA = i.f9822a.a(c0VarR, 6);
            if (g0VarA == null || (fullyDrawnReporter = g0VarA.getFullyDrawnReporter()) == null) {
                if (m0.l0()) {
                    m0.z0();
                }
                s5 s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new e(function1, i10));
                    return;
                }
                return;
            }
            boolean zK0 = c0VarR.k0(fullyDrawnReporter) | c0VarR.k0(function1);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == c0.f35327a.a()) {
                objI0 = new c(fullyDrawnReporter, function1, null);
                c0VarR.Y(objI0);
            }
            b2.h(function1, fullyDrawnReporter, (Function2) objI0, c0VarR, i11 & 14);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT2 = c0VarR.T();
        if (s5VarT2 != null) {
            s5VarT2.a(new d(function1, i10));
        }
    }

    @androidx.compose.runtime.o
    public static final void c(@NotNull Function0<Boolean> function0, @Nullable c0 c0Var, int i10) {
        int i11;
        e0 fullyDrawnReporter;
        c0 c0VarR = c0Var.R(-2047119994);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(-2047119994, i11, -1, "androidx.activity.compose.ReportDrawnWhen (ReportDrawn.kt:116)");
            }
            g0 g0VarA = i.f9822a.a(c0VarR, 6);
            if (g0VarA == null || (fullyDrawnReporter = g0VarA.getFullyDrawnReporter()) == null) {
                if (m0.l0()) {
                    m0.z0();
                }
                s5 s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new h(function0, i10));
                    return;
                }
                return;
            }
            boolean zK0 = c0VarR.k0(fullyDrawnReporter) | ((i11 & 14) == 4);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == c0.f35327a.a()) {
                objI0 = new f(fullyDrawnReporter, function0);
                c0VarR.Y(objI0);
            }
            b2.c(fullyDrawnReporter, function0, (Function1) objI0, c0VarR, (i11 << 3) & com.planner5d.library.engine.input.f.b.B);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT2 = c0VarR.T();
        if (s5VarT2 != null) {
            s5VarT2.a(new g(function0, i10));
        }
    }
}
