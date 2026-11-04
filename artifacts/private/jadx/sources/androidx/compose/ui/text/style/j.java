package androidx.compose.ui.text.style;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42206b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42207c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42208d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42209e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42210f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f42211g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f42212h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f42213i = i(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42214a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f42209e;
        }

        public final int b() {
            return j.f42212h;
        }

        public final int c() {
            return j.f42210f;
        }

        public final int d() {
            return j.f42207c;
        }

        public final int e() {
            return j.f42208d;
        }

        public final int f() {
            return j.f42211g;
        }

        public final int g() {
            return j.f42213i;
        }

        @NotNull
        public final List<j> h() {
            return CollectionsKt.listOf((Object[]) new j[]{j.h(d()), j.h(e()), j.h(a()), j.h(c()), j.h(f()), j.h(b())});
        }

        private a() {
        }
    }

    static {
        int i10 = 6 >> 1;
    }

    private /* synthetic */ j(int i10) {
        this.f42214a = i10;
    }

    public static final /* synthetic */ j h(int i10) {
        return new j(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        if ((obj instanceof j) && i10 == ((j) obj).n()) {
            return true;
        }
        return false;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String m(int i10) {
        if (k(i10, f42207c)) {
            return "Left";
        }
        if (k(i10, f42208d)) {
            return "Right";
        }
        if (k(i10, f42209e)) {
            return "Center";
        }
        if (k(i10, f42210f)) {
            return "Justify";
        }
        if (k(i10, f42211g)) {
            return "Start";
        }
        if (k(i10, f42212h)) {
            return "End";
        }
        return k(i10, f42213i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f42214a, obj);
    }

    public int hashCode() {
        return l(this.f42214a);
    }

    public final /* synthetic */ int n() {
        return this.f42214a;
    }

    @NotNull
    public String toString() {
        return m(this.f42214a);
    }
}
