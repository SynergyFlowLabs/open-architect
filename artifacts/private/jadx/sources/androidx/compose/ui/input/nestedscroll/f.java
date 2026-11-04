package androidx.compose.ui.input.nestedscroll;

import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.l;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@g
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38949b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f38954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f38955h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38956a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @l(message = "This has been replaced by UserInput.", replaceWith = @b1(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        public static /* synthetic */ void b() {
        }

        @l(message = "This has been replaced by SideEffect.", replaceWith = @b1(expression = "NestedScrollSource.SideEffect", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.SideEffect"}))
        public static /* synthetic */ void d() {
        }

        @l(message = "Do not use. Will be removed in the future.")
        public static /* synthetic */ void f() {
        }

        @l(message = "This has been replaced by UserInput.", replaceWith = @b1(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        public static /* synthetic */ void j() {
        }

        public final int a() {
            return f.f38952e;
        }

        public final int c() {
            return f.f38953f;
        }

        public final int e() {
            return f.f38954g;
        }

        public final int g() {
            return f.f38951d;
        }

        public final int h() {
            return f.f38950c;
        }

        public final int i() {
            return f.f38955h;
        }

        private a() {
        }
    }

    static {
        int iH = h(1);
        f38950c = iH;
        int iH2 = h(2);
        f38951d = iH2;
        f38952e = iH;
        f38953f = iH2;
        f38954g = h(3);
        f38955h = iH;
    }

    private /* synthetic */ f(int i10) {
        this.f38956a = i10;
    }

    public static final /* synthetic */ f g(int i10) {
        return new f(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String l(int i10) {
        if (j(i10, f38950c)) {
            return "UserInput";
        }
        if (j(i10, f38951d)) {
            return "SideEffect";
        }
        return j(i10, f38954g) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f38956a, obj);
    }

    public int hashCode() {
        return k(this.f38956a);
    }

    public final /* synthetic */ int m() {
        return this.f38956a;
    }

    @NotNull
    public String toString() {
        return l(this.f38956a);
    }
}
