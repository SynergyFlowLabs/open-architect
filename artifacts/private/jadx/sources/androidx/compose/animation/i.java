package androidx.compose.animation;

import androidx.compose.animation.core.j5;
import androidx.compose.animation.core.l3;
import androidx.compose.runtime.o2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface i<S> extends l3.b<S> {

    @oj.g
    @o2
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0065a f13518b = new C0065a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f13519c = h(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f13520d = h(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f13521e = h(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f13522f = h(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f13523g = h(4);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f13524h = h(5);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13525a;

        /* JADX INFO: renamed from: androidx.compose.animation.i$a$a, reason: collision with other inner class name */
        public static final class C0065a {
            public /* synthetic */ C0065a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.f13522f;
            }

            public final int b() {
                return a.f13524h;
            }

            public final int c() {
                return a.f13519c;
            }

            public final int d() {
                return a.f13520d;
            }

            public final int e() {
                return a.f13523g;
            }

            public final int f() {
                return a.f13521e;
            }

            private C0065a() {
            }
        }

        private /* synthetic */ a(int i10) {
            this.f13525a = i10;
        }

        public static final /* synthetic */ a g(int i10) {
            return new a(i10);
        }

        public static int h(int i10) {
            return i10;
        }

        public static boolean i(int i10, Object obj) {
            return (obj instanceof a) && i10 == ((a) obj).m();
        }

        public static final boolean j(int i10, int i11) {
            return i10 == i11;
        }

        public static int k(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String l(int i10) {
            if (j(i10, f13519c)) {
                return "Left";
            }
            if (j(i10, f13520d)) {
                return "Right";
            }
            if (j(i10, f13521e)) {
                return "Up";
            }
            if (j(i10, f13522f)) {
                return "Down";
            }
            if (j(i10, f13523g)) {
                return "Start";
            }
            return j(i10, f13524h) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return i(this.f13525a, obj);
        }

        public int hashCode() {
            return k(this.f13525a);
        }

        public final /* synthetic */ int m() {
            return this.f13525a;
        }

        @NotNull
        public String toString() {
            return l(this.f13525a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13526a = new b();

        b() {
            super(1);
        }

        public final Integer c(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class c extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f13527a = new c();

        c() {
            super(1);
        }

        public final Integer c(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    static /* synthetic */ void a(f0.a aVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ f0 b(i iVar, int i10, androidx.compose.animation.core.y0 y0Var, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 0.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 3, null);
        }
        if ((i11 & 4) != 0) {
            function1 = c.f13527a;
        }
        return iVar.c(i10, y0Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ d0 d(i iVar, int i10, androidx.compose.animation.core.y0 y0Var, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 0.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 3, null);
        }
        if ((i11 & 4) != 0) {
            function1 = b.f13526a;
        }
        return iVar.h(i10, y0Var, function1);
    }

    @NotNull
    f0 c(int i10, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1);

    @NotNull
    androidx.compose.ui.e g();

    @NotNull
    d0 h(int i10, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1);

    @NotNull
    default f0 i(@NotNull f0.a aVar) {
        return aVar.a();
    }

    @NotNull
    x k(@NotNull x xVar, @Nullable g1 g1Var);
}
