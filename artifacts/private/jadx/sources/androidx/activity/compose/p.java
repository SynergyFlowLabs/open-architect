package androidx.activity.compose;

import androidx.activity.e0;
import androidx.compose.runtime.snapshots.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnComposition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
final class p implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e0 f9858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f9859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q0 f9860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Function0<Boolean>, Unit> f9861d;

    /* synthetic */ class a extends g0 implements Function1<Function0<? extends Boolean>, Unit> {
        a(Object obj) {
            super(1, obj, p.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        public final void X(Function0<Boolean> function0) {
            ((p) this.receiver).f(function0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Boolean> function0) {
            X(function0);
            return Unit.f312394a;
        }
    }

    static final class b extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f9862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f9863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i1.a aVar, Function0<Boolean> function0) {
            super(0);
            this.f9862a = aVar;
            this.f9863b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f9862a.f312744a = this.f9863b.invoke().booleanValue();
        }
    }

    static final class c extends l0 implements Function1<Function0<? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f9864a = new c();

        c() {
            super(1);
        }

        public final void c(Function0<Unit> function0) {
            function0.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            c(function0);
            return Unit.f312394a;
        }
    }

    public p(@NotNull e0 e0Var, @NotNull Function0<Boolean> function0) {
        this.f9858a = e0Var;
        this.f9859b = function0;
        q0 q0Var = new q0(c.f9864a);
        q0Var.t();
        this.f9860c = q0Var;
        this.f9861d = new a(this);
        e0Var.b(this);
        if (!e0Var.e()) {
            e0Var.c();
            f(function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Function0<Boolean> function0) {
        i1.a aVar = new i1.a();
        this.f9860c.m(function0, this.f9861d, new b(aVar, function0));
        if (aVar.f312744a) {
            i();
        }
    }

    public void d() {
        this.f9860c.f();
        this.f9860c.u();
    }

    public final void i() {
        this.f9860c.g(this.f9859b);
        if (!this.f9858a.e()) {
            this.f9858a.h();
        }
        d();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        d();
        return Unit.f312394a;
    }
}
