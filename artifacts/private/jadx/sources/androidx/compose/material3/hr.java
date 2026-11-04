package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class hr implements ca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fa0 f28234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f28235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.o<Float> f28237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.g0<Float> f28238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.a f28239f;

    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/PinnedScrollBehavior$nestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,3517:1\n69#2:3518\n70#3:3519\n22#4:3520\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/PinnedScrollBehavior$nestedScrollConnection$1\n*L\n3271#1:3518\n3271#1:3519\n3271#1:3520\n*E\n"})
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {
        a() {
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            if (androidx.compose.ui.unit.c0.n(j11) > 0.0f) {
                hr.this.getState().k(0.0f);
            }
            return super.B0(j10, j11, dVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            if (!hr.this.g().invoke().booleanValue()) {
                return n0.g.f332700b.e();
            }
            fa0 state = hr.this.getState();
            state.k(state.g() + Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
            return n0.g.f332700b.e();
        }
    }

    public hr(@NotNull fa0 fa0Var, @NotNull Function0<Boolean> function0) {
        this.f28234a = fa0Var;
        this.f28235b = function0;
        this.f28236c = true;
        this.f28239f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return true;
    }

    @Override // androidx.compose.material3.ca0
    @NotNull
    public androidx.compose.ui.input.nestedscroll.a a() {
        return this.f28239f;
    }

    @Override // androidx.compose.material3.ca0
    public boolean b() {
        return this.f28236c;
    }

    @Override // androidx.compose.material3.ca0
    @Nullable
    public androidx.compose.animation.core.o<Float> c() {
        return this.f28237d;
    }

    @Override // androidx.compose.material3.ca0
    @Nullable
    public androidx.compose.animation.core.g0<Float> d() {
        return this.f28238e;
    }

    @NotNull
    public final Function0<Boolean> g() {
        return this.f28235b;
    }

    @Override // androidx.compose.material3.ca0
    @NotNull
    public fa0 getState() {
        return this.f28234a;
    }

    public void h(@NotNull androidx.compose.ui.input.nestedscroll.a aVar) {
        this.f28239f = aVar;
    }

    public /* synthetic */ hr(fa0 fa0Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fa0Var, (i10 & 2) != 0 ? new Function0() { // from class: androidx.compose.material3.gr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(hr.f());
            }
        } : function0);
    }
}
