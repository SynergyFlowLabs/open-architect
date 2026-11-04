package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class s1 implements y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f39996b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39997c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Function1<s1, Unit> f39998d = a.f40000a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q1 f39999a;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<s1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40000a = new a();

        a() {
            super(1);
        }

        public final void c(s1 s1Var) {
            if (s1Var.H2()) {
                s1Var.b().Y5();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(s1 s1Var) {
            c(s1Var);
            return Unit.f312394a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<s1, Unit> a() {
            return s1.f39998d;
        }

        private b() {
        }
    }

    public s1(@NotNull q1 q1Var) {
        this.f39999a = q1Var;
    }

    @Override // androidx.compose.ui.node.y1
    public boolean H2() {
        return this.f39999a.w().a9();
    }

    @NotNull
    public final q1 b() {
        return this.f39999a;
    }
}
