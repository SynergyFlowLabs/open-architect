package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,611:1\n26#2:612\n33#2:617\n33#2:618\n44#3,4:613\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n*L\n461#1:612\n499#1:617\n528#1:618\n481#1:613,4\n*E\n"})
public final class o5 implements kotlinx.coroutines.s0, m5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f36287e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36288f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final CoroutineContext f36289g = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f36290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f36291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f36292c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile CoroutineContext f36293d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n*L\n1#1,106:1\n482#2,7:107\n*E\n"})
    public static final class b extends kotlin.coroutines.a implements kotlinx.coroutines.o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.tooling.j f36294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o5 f36295b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.o0.b bVar, androidx.compose.runtime.tooling.j jVar, o5 o5Var) {
            super(bVar);
            this.f36294a = jVar;
            this.f36295b = o5Var;
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) throws Throwable {
            this.f36294a.a(th2, this.f36295b);
            CoroutineContext coroutineContext2 = this.f36295b.f36291b;
            kotlinx.coroutines.o0.b bVar = kotlinx.coroutines.o0.L2;
            kotlinx.coroutines.o0 o0Var = (kotlinx.coroutines.o0) coroutineContext2.get(bVar);
            if (o0Var != null) {
                o0Var.handleException(coroutineContext, th2);
                return;
            }
            kotlinx.coroutines.o0 o0Var2 = (kotlinx.coroutines.o0) this.f36295b.f36290a.get(bVar);
            if (o0Var2 == null) {
                throw th2;
            }
            o0Var2.handleException(coroutineContext, th2);
        }
    }

    public o5(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        this.f36290a = coroutineContext;
        this.f36291b = coroutineContext2;
    }

    public final void f() {
        synchronized (this.f36292c) {
            try {
                CoroutineContext coroutineContext = this.f36293d;
                if (coroutineContext == null) {
                    this.f36293d = f36289g;
                } else {
                    kotlinx.coroutines.s2.f(coroutineContext, new h2());
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this.f36293d;
        if (coroutineContext == null || coroutineContext == f36289g) {
            androidx.compose.runtime.tooling.j jVar = (androidx.compose.runtime.tooling.j) this.f36290a.get(androidx.compose.runtime.tooling.j.f36691b);
            CoroutineContext bVar = jVar != null ? new b(kotlinx.coroutines.o0.L2, jVar, this) : kotlin.coroutines.h.f312451a;
            synchronized (this.f36292c) {
                try {
                    coroutineContextPlus = this.f36293d;
                    if (coroutineContextPlus == null) {
                        CoroutineContext coroutineContext2 = this.f36290a;
                        coroutineContextPlus = coroutineContext2.plus(kotlinx.coroutines.s2.a((kotlinx.coroutines.p2) coroutineContext2.get(kotlinx.coroutines.p2.M2))).plus(this.f36291b).plus(bVar);
                    } else if (coroutineContextPlus == f36289g) {
                        CoroutineContext coroutineContext3 = this.f36290a;
                        kotlinx.coroutines.a0 a0VarA = kotlinx.coroutines.s2.a((kotlinx.coroutines.p2) coroutineContext3.get(kotlinx.coroutines.p2.M2));
                        a0VarA.e(new h2());
                        coroutineContextPlus = coroutineContext3.plus(a0VarA).plus(this.f36291b).plus(bVar);
                    }
                    this.f36293d = coroutineContextPlus;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            coroutineContext = coroutineContextPlus;
        }
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        f();
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        f();
    }
}
