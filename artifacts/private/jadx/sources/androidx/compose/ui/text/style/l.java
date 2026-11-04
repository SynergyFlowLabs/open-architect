package androidx.compose.ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42221b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42222c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42223d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42224e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42225f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f42226g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f42227h = h(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42228a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l.f42224e;
        }

        public final int b() {
            return l.f42225f;
        }

        public final int c() {
            return l.f42226g;
        }

        public final int d() {
            return l.f42222c;
        }

        public final int e() {
            return l.f42223d;
        }

        public final int f() {
            return l.f42227h;
        }

        private a() {
        }
    }

    private /* synthetic */ l(int i10) {
        this.f42228a = i10;
    }

    public static final /* synthetic */ l g(int i10) {
        return new l(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof l) && i10 == ((l) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String l(int i10) {
        if (j(i10, f42222c)) {
            return "Ltr";
        }
        if (j(i10, f42223d)) {
            return "Rtl";
        }
        if (j(i10, f42224e)) {
            return "Content";
        }
        if (j(i10, f42225f)) {
            return "ContentOrLtr";
        }
        if (j(i10, f42226g)) {
            return "ContentOrRtl";
        }
        return j(i10, f42227h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f42228a, obj);
    }

    public int hashCode() {
        return k(this.f42228a);
    }

    public final /* synthetic */ int m() {
        return this.f42228a;
    }

    @NotNull
    public String toString() {
        return l(this.f42228a);
    }
}
