package androidx.compose.ui.draw;

import androidx.compose.runtime.o2;
import androidx.compose.ui.graphics.d3;
import androidx.compose.ui.graphics.q3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@o2
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37279b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final q3 f37280c = d(d3.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final q3 f37281d = d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final q3 f37282a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final q3 a() {
            return e.f37280c;
        }

        @NotNull
        public final q3 b() {
            return e.f37281d;
        }

        private a() {
        }
    }

    private /* synthetic */ e(q3 q3Var) {
        this.f37282a = q3Var;
    }

    public static final /* synthetic */ e c(q3 q3Var) {
        return new e(q3Var);
    }

    @NotNull
    public static q3 d(@Nullable q3 q3Var) {
        return q3Var;
    }

    public static boolean e(q3 q3Var, Object obj) {
        if ((obj instanceof e) && Intrinsics.areEqual(q3Var, ((e) obj).j())) {
            return true;
        }
        return false;
    }

    public static final boolean f(q3 q3Var, q3 q3Var2) {
        return Intrinsics.areEqual(q3Var, q3Var2);
    }

    public static int h(q3 q3Var) {
        if (q3Var == null) {
            return 0;
        }
        return q3Var.hashCode();
    }

    public static String i(q3 q3Var) {
        return "BlurredEdgeTreatment(shape=" + q3Var + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f37282a, obj);
    }

    @Nullable
    public final q3 g() {
        return this.f37282a;
    }

    public int hashCode() {
        return h(this.f37282a);
    }

    public final /* synthetic */ q3 j() {
        return this.f37282a;
    }

    public String toString() {
        return i(this.f37282a);
    }
}
