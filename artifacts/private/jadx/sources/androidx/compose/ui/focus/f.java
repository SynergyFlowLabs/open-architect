package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37408b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37409c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37410d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37411e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f37412f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f37413g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f37414h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f37415i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f37416j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37417a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return f.f37414h;
        }

        public final int b() {
            return f.f37415i;
        }

        public final int c() {
            return f.f37416j;
        }

        public final int d() {
            return f.f37411e;
        }

        public final int e() {
            return f.f37409c;
        }

        public final int f() {
            return f.f37410d;
        }

        public final int g() {
            return f.f37412f;
        }

        public final int h() {
            return f.f37413g;
        }

        private a() {
        }
    }

    private /* synthetic */ f(int i10) {
        this.f37417a = i10;
    }

    public static final /* synthetic */ f i(int i10) {
        return new f(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String n(int i10) {
        if (l(i10, f37409c)) {
            return "Next";
        }
        if (l(i10, f37410d)) {
            return "Previous";
        }
        if (l(i10, f37411e)) {
            return "Left";
        }
        if (l(i10, f37412f)) {
            return "Right";
        }
        if (l(i10, f37413g)) {
            return "Up";
        }
        if (l(i10, f37414h)) {
            return "Down";
        }
        if (l(i10, f37415i)) {
            return "Enter";
        }
        return l(i10, f37416j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f37417a, obj);
    }

    public int hashCode() {
        return m(this.f37417a);
    }

    public final /* synthetic */ int o() {
        return this.f37417a;
    }

    @NotNull
    public String toString() {
        return n(this.f37417a);
    }
}
