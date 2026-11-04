package androidx.compose.ui.text.input;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41944b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41945c = k(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41946d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41947e = k(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41948f = k(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41949g = k(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f41950h = k(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f41951i = k(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41952j = k(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41953k = k(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41954a;

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

        @k7
        public static /* synthetic */ void l() {
        }

        @k7
        public static /* synthetic */ void n() {
        }

        @k7
        public static /* synthetic */ void p() {
        }

        @k7
        public static /* synthetic */ void r() {
        }

        public final int a() {
            return t.f41946d;
        }

        public final int c() {
            return t.f41953k;
        }

        public final int e() {
            return t.f41948f;
        }

        public final int g() {
            return t.f41952j;
        }

        public final int i() {
            return t.f41947e;
        }

        public final int k() {
            return t.f41951i;
        }

        public final int m() {
            return t.f41949g;
        }

        public final int o() {
            return t.f41950h;
        }

        public final int q() {
            return t.f41945c;
        }

        private a() {
        }
    }

    private /* synthetic */ t(int i10) {
        this.f41954a = i10;
    }

    public static final /* synthetic */ t j(int i10) {
        return new t(i10);
    }

    private static int k(int i10) {
        return i10;
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof t) && i10 == ((t) obj).p();
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String o(int i10) {
        if (m(i10, f41945c)) {
            return "Unspecified";
        }
        if (m(i10, f41947e)) {
            return "None";
        }
        if (m(i10, f41946d)) {
            return "Default";
        }
        if (m(i10, f41948f)) {
            return "Go";
        }
        if (m(i10, f41949g)) {
            return "Search";
        }
        if (m(i10, f41950h)) {
            return "Send";
        }
        if (m(i10, f41951i)) {
            return "Previous";
        }
        if (m(i10, f41952j)) {
            return "Next";
        }
        return m(i10, f41953k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.f41954a, obj);
    }

    public int hashCode() {
        return n(this.f41954a);
    }

    public final /* synthetic */ int p() {
        return this.f41954a;
    }

    @NotNull
    public String toString() {
        return o(this.f41954a);
    }
}
