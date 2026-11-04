package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42324b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42325c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42326d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42327e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42328f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f42329g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f42330h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f42331i = i(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42332a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return w0.f42325c;
        }

        public final int b() {
            return w0.f42327e;
        }

        public final int c() {
            return w0.f42328f;
        }

        public final int d() {
            return w0.f42330h;
        }

        public final int e() {
            return w0.f42331i;
        }

        public final int f() {
            return w0.f42329g;
        }

        public final int g() {
            return w0.f42326d;
        }

        private a() {
        }
    }

    private /* synthetic */ w0(int i10) {
        this.f42332a = i10;
    }

    public static final /* synthetic */ w0 h(int i10) {
        return new w0(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof w0) && i10 == ((w0) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String m(int i10) {
        if (k(i10, f42325c)) {
            return "AboveBaseline";
        }
        if (k(i10, f42326d)) {
            return "Top";
        }
        if (k(i10, f42327e)) {
            return "Bottom";
        }
        if (k(i10, f42328f)) {
            return "Center";
        }
        if (k(i10, f42329g)) {
            return "TextTop";
        }
        if (k(i10, f42330h)) {
            return "TextBottom";
        }
        return k(i10, f42331i) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f42332a, obj);
    }

    public int hashCode() {
        return l(this.f42332a);
    }

    public final /* synthetic */ int n() {
        return this.f42332a;
    }

    @NotNull
    public String toString() {
        return m(this.f42332a);
    }
}
