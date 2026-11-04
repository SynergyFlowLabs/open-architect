package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j2 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.p2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a f15738v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f15739w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.layout.g0, Unit> f15740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final Object f15741t = f15738v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j2(@NotNull Function1<? super androidx.compose.ui.layout.g0, Unit> function1) {
        this.f15740s = function1;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return this.f15741t;
    }

    @NotNull
    public final Function1<androidx.compose.ui.layout.g0, Unit> v9() {
        return this.f15740s;
    }

    public final void w9(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f15740s.invoke(g0Var);
        j2 j2Var = (j2) androidx.compose.ui.node.q2.b(this);
        if (j2Var != null) {
            j2Var.w9(g0Var);
        }
    }

    public final void x9(@NotNull Function1<? super androidx.compose.ui.layout.g0, Unit> function1) {
        this.f15740s = function1;
    }
}
