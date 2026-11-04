package androidx.compose.ui.semantics;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41124b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41125c = k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41126d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41127e = k(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41128f = k(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41129g = k(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f41130h = k(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f41131i = k(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f41132j = k(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41133k = k(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41134a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f41125c;
        }

        public final int b() {
            return j.f41133k;
        }

        public final int c() {
            return j.f41126d;
        }

        public final int d() {
            return j.f41131i;
        }

        public final int e() {
            return j.f41130h;
        }

        public final int f() {
            return j.f41128f;
        }

        public final int g() {
            return j.f41127e;
        }

        public final int h() {
            return j.f41129g;
        }

        public final int i() {
            return j.f41132j;
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i10) {
        this.f41134a = i10;
    }

    public static final /* synthetic */ j j(int i10) {
        return new j(i10);
    }

    private static int k(int i10) {
        return i10;
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof j) && i10 == ((j) obj).p();
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String o(int i10) {
        if (m(i10, f41125c)) {
            return "Button";
        }
        if (m(i10, f41126d)) {
            return "Checkbox";
        }
        if (m(i10, f41127e)) {
            return "Switch";
        }
        if (m(i10, f41128f)) {
            return "RadioButton";
        }
        if (m(i10, f41129g)) {
            return "Tab";
        }
        if (m(i10, f41130h)) {
            return "Image";
        }
        if (m(i10, f41131i)) {
            return "DropdownList";
        }
        if (m(i10, f41132j)) {
            return "Picker";
        }
        return m(i10, f41133k) ? "Carousel" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return l(this.f41134a, obj);
    }

    public int hashCode() {
        return n(this.f41134a);
    }

    public final /* synthetic */ int p() {
        return this.f41134a;
    }

    @NotNull
    public String toString() {
        return o(this.f41134a);
    }
}
