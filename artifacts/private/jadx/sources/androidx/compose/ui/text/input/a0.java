package androidx.compose.ui.text.input;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41798b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41799c = g(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41800d = g(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41801e = g(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41802f = g(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41803g = g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41804a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @k7
        public static /* synthetic */ void f() {
        }

        @k7
        public static /* synthetic */ void h() {
        }

        @k7
        public static /* synthetic */ void j() {
        }

        public final int a() {
            return a0.f41801e;
        }

        public final int c() {
            return a0.f41800d;
        }

        public final int e() {
            return a0.f41803g;
        }

        public final int g() {
            return a0.f41799c;
        }

        public final int i() {
            return a0.f41802f;
        }

        private a() {
        }
    }

    private /* synthetic */ a0(int i10) {
        this.f41804a = i10;
    }

    public static final /* synthetic */ a0 f(int i10) {
        return new a0(i10);
    }

    private static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof a0) && i10 == ((a0) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String k(int i10) {
        if (i(i10, f41799c)) {
            return "Unspecified";
        }
        if (i(i10, f41800d)) {
            return "None";
        }
        if (i(i10, f41801e)) {
            return "Characters";
        }
        if (i(i10, f41802f)) {
            return "Words";
        }
        return i(i10, f41803g) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f41804a, obj);
    }

    public int hashCode() {
        return j(this.f41804a);
    }

    public final /* synthetic */ int l() {
        return this.f41804a;
    }

    @NotNull
    public String toString() {
        return k(this.f41804a);
    }
}
