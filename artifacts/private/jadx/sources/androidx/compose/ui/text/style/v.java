package androidx.compose.ui.text.style;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42256b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42257c = g(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42258d = g(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42259e = g(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42260f = g(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f42261g = g(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42262a;

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
            return v.f42257c;
        }

        public final int c() {
            return v.f42258d;
        }

        public final int e() {
            return v.f42261g;
        }

        public final int g() {
            return v.f42260f;
        }

        public final int i() {
            return v.f42259e;
        }

        private a() {
        }
    }

    private /* synthetic */ v(int i10) {
        this.f42262a = i10;
    }

    public static final /* synthetic */ v f(int i10) {
        return new v(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof v) && i10 == ((v) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String k(int i10) {
        if (i(i10, f42257c)) {
            return "Clip";
        }
        if (i(i10, f42258d)) {
            return "Ellipsis";
        }
        if (i(i10, f42261g)) {
            return "MiddleEllipsis";
        }
        if (i(i10, f42259e)) {
            return "Visible";
        }
        return i(i10, f42260f) ? "StartEllipsis" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f42262a, obj);
    }

    public int hashCode() {
        return j(this.f42262a);
    }

    public final /* synthetic */ int l() {
        return this.f42262a;
    }

    @NotNull
    public String toString() {
        return k(this.f42262a);
    }
}
