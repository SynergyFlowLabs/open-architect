package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f39127b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39128c = i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f39129d = i(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f39130e = i(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f39131f = i(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f39132g = i(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f39133h = i(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f39134i = i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39135a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u.f39132g;
        }

        public final int b() {
            return u.f39133h;
        }

        public final int c() {
            return u.f39131f;
        }

        public final int d() {
            return u.f39129d;
        }

        public final int e() {
            return u.f39130e;
        }

        public final int f() {
            return u.f39134i;
        }

        public final int g() {
            return u.f39128c;
        }

        private a() {
        }
    }

    static {
        int i10 = 5 | 4;
    }

    private /* synthetic */ u(int i10) {
        this.f39135a = i10;
    }

    public static final /* synthetic */ u h(int i10) {
        return new u(i10);
    }

    private static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof u) && i10 == ((u) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String m(int i10) {
        if (k(i10, f39129d)) {
            return "Press";
        }
        if (k(i10, f39130e)) {
            return "Release";
        }
        if (k(i10, f39131f)) {
            return "Move";
        }
        if (k(i10, f39132g)) {
            return "Enter";
        }
        if (k(i10, f39133h)) {
            return "Exit";
        }
        return k(i10, f39134i) ? "Scroll" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return j(this.f39135a, obj);
    }

    public int hashCode() {
        return l(this.f39135a);
    }

    public final /* synthetic */ int n() {
        return this.f39135a;
    }

    @NotNull
    public String toString() {
        return m(this.f39135a);
    }
}
