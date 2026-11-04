package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface i {

    public interface a {
        boolean a();
    }

    @oj.g
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f39357b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f39358c = h(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f39359d = h(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f39360e = h(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f39361f = h(4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f39362g = h(5);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f39363h = h(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f39364a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f39362g;
            }

            public final int b() {
                return b.f39359d;
            }

            public final int c() {
                return b.f39358c;
            }

            public final int d() {
                return b.f39363h;
            }

            public final int e() {
                return b.f39360e;
            }

            public final int f() {
                return b.f39361f;
            }

            private a() {
            }
        }

        private /* synthetic */ b(int i10) {
            this.f39364a = i10;
        }

        public static final /* synthetic */ b g(int i10) {
            return new b(i10);
        }

        public static int h(int i10) {
            return i10;
        }

        public static boolean i(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).m();
        }

        public static final boolean j(int i10, int i11) {
            return i10 == i11;
        }

        public static int k(int i10) {
            return Integer.hashCode(i10);
        }

        @NotNull
        public static String l(int i10) {
            if (j(i10, f39358c)) {
                return "Before";
            }
            if (j(i10, f39359d)) {
                return "After";
            }
            if (j(i10, f39360e)) {
                return "Left";
            }
            if (j(i10, f39361f)) {
                return "Right";
            }
            if (j(i10, f39362g)) {
                return "Above";
            }
            return j(i10, f39363h) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return i(this.f39364a, obj);
        }

        public int hashCode() {
            return k(this.f39364a);
        }

        public final /* synthetic */ int m() {
            return this.f39364a;
        }

        @NotNull
        public String toString() {
            return l(this.f39364a);
        }
    }

    @Nullable
    <T> T t5(int i10, @NotNull Function1<? super a, ? extends T> function1);
}
