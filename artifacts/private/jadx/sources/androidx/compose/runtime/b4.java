package androidx.compose.runtime;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/PausedCompositionImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,567:1\n338#1:569\n339#1:572\n341#1:574\n338#1:575\n339#1:578\n341#1:580\n338#1:581\n339#1:584\n341#1:586\n338#1:587\n339#1:590\n341#1:592\n338#1:593\n339#1:596\n341#1:598\n338#1:599\n339#1:602\n341#1:604\n338#1:605\n339#1:608\n341#1:610\n1#2:568\n49#3,2:570\n52#3:573\n49#3,2:576\n52#3:579\n49#3,2:582\n52#3:585\n49#3,2:588\n52#3:591\n49#3,2:594\n52#3:597\n49#3,2:600\n52#3:603\n49#3,2:606\n52#3:609\n49#3,4:612\n33#4:611\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/PausedCompositionImpl\n*L\n240#1:569\n240#1:572\n240#1:574\n247#1:575\n247#1:578\n247#1:580\n255#1:581\n255#1:584\n255#1:586\n255#1:587\n255#1:590\n255#1:592\n289#1:593\n289#1:596\n289#1:598\n315#1:599\n315#1:602\n315#1:604\n319#1:605\n319#1:608\n319#1:610\n240#1:570,2\n240#1:573\n247#1:576,2\n247#1:579\n255#1:582,2\n255#1:585\n255#1:588,2\n255#1:591\n289#1:594,2\n289#1:597\n315#1:600,2\n315#1:603\n319#1:606,2\n319#1:609\n338#1:612,4\n323#1:611\n*E\n"})
public final class b4 implements a4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f35311l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s0 f35312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f35313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i0 f35314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<c0, Integer, Unit> f35315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f35316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i<?> f35317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f35318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private AtomicReference<c4> f35319h = new AtomicReference<>(c4.InitialPending);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private androidx.collection.c3<s4> f35320i = androidx.collection.d3.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.internal.t0 f35321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final i5<Object> f35322k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35323a;

        static {
            int[] iArr = new int[c4.values().length];
            try {
                iArr[c4.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c4.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c4.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c4.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c4.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c4.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c4.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f35323a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b4(@NotNull s0 s0Var, @NotNull p0 p0Var, @NotNull i0 i0Var, @NotNull Set<m5> set, @NotNull Function2<? super c0, ? super Integer, Unit> function2, boolean z10, @NotNull i<?> iVar, @NotNull Object obj) {
        this.f35312a = s0Var;
        this.f35313b = p0Var;
        this.f35314c = i0Var;
        this.f35315d = function2;
        this.f35316e = z10;
        this.f35317f = iVar;
        this.f35318g = obj;
        androidx.compose.runtime.internal.t0 t0Var = new androidx.compose.runtime.internal.t0();
        t0Var.r(set, i0Var.p1());
        this.f35321j = t0Var;
        this.f35322k = new i5<>(iVar.a());
    }

    private final void c() {
        synchronized (this.f35318g) {
            try {
                try {
                    i5<Object> i5Var = this.f35322k;
                    i<?> iVar = this.f35317f;
                    Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                    i5Var.p(iVar, this.f35321j);
                    this.f35321j.m();
                    this.f35321j.n();
                    this.f35321j.j();
                    this.f35312a.o0(null);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    this.f35321j.j();
                    this.f35312a.o0(null);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final void n() {
        c4 c4Var = c4.RecomposePending;
        c4 c4Var2 = c4.ApplyPending;
        if (!androidx.compose.animation.core.z1.a(this.f35319h, c4Var, c4Var2)) {
            f4.e("Unexpected state change from: " + c4Var + " to: " + c4Var2 + '.');
        }
    }

    private final void p(c4 c4Var, c4 c4Var2) {
        if (!androidx.compose.animation.core.z1.a(this.f35319h, c4Var, c4Var2)) {
            f4.e("Unexpected state change from: " + c4Var + " to: " + c4Var2 + '.');
        }
    }

    @Override // androidx.compose.runtime.a4
    public boolean a(@NotNull t5 t5Var) throws Exception {
        try {
            switch (a.f35323a[this.f35319h.get().ordinal()]) {
                case 1:
                    if (this.f35316e) {
                        this.f35314c.o2();
                    }
                    try {
                        this.f35320i = this.f35313b.b(this.f35312a, t5Var, this.f35315d);
                        if (this.f35316e) {
                            this.f35314c.a1();
                        }
                        c4 c4Var = c4.InitialPending;
                        c4 c4Var2 = c4.RecomposePending;
                        if (!androidx.compose.animation.core.z1.a(this.f35319h, c4Var, c4Var2)) {
                            f4.e("Unexpected state change from: " + c4Var + " to: " + c4Var2 + '.');
                        }
                        if (this.f35320i.r()) {
                            n();
                        }
                        return isComplete();
                    } catch (Throwable th2) {
                        if (this.f35316e) {
                            this.f35314c.a1();
                        }
                        throw th2;
                    }
                case 2:
                    c4 c4Var3 = c4.RecomposePending;
                    c4 c4Var4 = c4.Recomposing;
                    if (!androidx.compose.animation.core.z1.a(this.f35319h, c4Var3, c4Var4)) {
                        f4.e("Unexpected state change from: " + c4Var3 + " to: " + c4Var4 + '.');
                    }
                    try {
                        this.f35320i = this.f35313b.s(this.f35312a, t5Var, this.f35320i);
                        if (!androidx.compose.animation.core.z1.a(this.f35319h, c4Var4, c4Var3)) {
                            f4.e("Unexpected state change from: " + c4Var4 + " to: " + c4Var3 + '.');
                        }
                        if (this.f35320i.r()) {
                            n();
                        }
                        return isComplete();
                    } catch (Throwable th3) {
                        c4 c4Var5 = c4.Recomposing;
                        c4 c4Var6 = c4.RecomposePending;
                        if (!androidx.compose.animation.core.z1.a(this.f35319h, c4Var5, c4Var6)) {
                            f4.e("Unexpected state change from: " + c4Var5 + " to: " + c4Var6 + '.');
                        }
                        throw th3;
                    }
                case 3:
                    m0.z("Recursive call to resume()");
                    throw new kotlin.a0();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new kotlin.k0();
            }
        } catch (Exception e10) {
            this.f35319h.set(c4.Invalid);
            throw e10;
        }
    }

    @Override // androidx.compose.runtime.a4
    public void apply() throws Exception {
        try {
            switch (a.f35323a[this.f35319h.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    c();
                    c4 c4Var = c4.ApplyPending;
                    c4 c4Var2 = c4.Applied;
                    if (androidx.compose.animation.core.z1.a(this.f35319h, c4Var, c4Var2)) {
                        return;
                    }
                    f4.e("Unexpected state change from: " + c4Var + " to: " + c4Var2 + '.');
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new kotlin.k0();
            }
        } catch (Exception e10) {
            this.f35319h.set(c4.Invalid);
            throw e10;
        }
    }

    @Override // androidx.compose.runtime.a4
    public boolean b() {
        return this.f35319h.get() == c4.Applied;
    }

    @Override // androidx.compose.runtime.a4
    public void cancel() {
        this.f35319h.set(c4.Cancelled);
        androidx.collection.c3<n5> c3VarO = this.f35321j.o();
        this.f35321j.j();
        this.f35312a.o0(c3VarO);
    }

    @NotNull
    public final i<?> d() {
        return this.f35317f;
    }

    @NotNull
    public final i0 e() {
        return this.f35314c;
    }

    @NotNull
    public final s0 f() {
        return this.f35312a;
    }

    @NotNull
    public final Function2<c0, Integer, Unit> g() {
        return this.f35315d;
    }

    @NotNull
    public final p0 h() {
        return this.f35313b;
    }

    @NotNull
    public final Object i() {
        return this.f35318g;
    }

    @Override // androidx.compose.runtime.a4
    public boolean isCancelled() {
        return this.f35319h.get() == c4.Cancelled;
    }

    @Override // androidx.compose.runtime.a4
    public boolean isComplete() {
        if (this.f35319h.get().compareTo(c4.ApplyPending) < 0) {
            return false;
        }
        int i10 = 2 >> 1;
        return true;
    }

    @NotNull
    public final i5<Object> j() {
        return this.f35322k;
    }

    @NotNull
    public final androidx.compose.runtime.internal.t0 k() {
        return this.f35321j;
    }

    public final boolean l() {
        return this.f35316e;
    }

    public final boolean m() {
        return this.f35319h.get() == c4.Recomposing;
    }

    public final void o() {
        c4 c4Var = this.f35319h.get();
        c4 c4Var2 = c4.RecomposePending;
        if (c4Var == c4Var2) {
            return;
        }
        c4 c4Var3 = c4.ApplyPending;
        if (androidx.compose.animation.core.z1.a(this.f35319h, c4Var3, c4Var2)) {
            return;
        }
        f4.e("Unexpected state change from: " + c4Var3 + " to: " + c4Var2 + '.');
    }
}
