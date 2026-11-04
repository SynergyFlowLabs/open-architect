package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@af
public final class s80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f32838b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f32839c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f32840d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f32841e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f32842f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f32843g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f32844h = h(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32845a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s80.f32839c;
        }

        public final int b() {
            return s80.f32840d;
        }

        public final int c() {
            return s80.f32844h;
        }

        public final int d() {
            return s80.f32841e;
        }

        public final int e() {
            return s80.f32842f;
        }

        public final int f() {
            return s80.f32843g;
        }

        private a() {
        }
    }

    private /* synthetic */ s80(int i10) {
        this.f32845a = i10;
    }

    public static final /* synthetic */ s80 g(int i10) {
        return new s80(i10);
    }

    private static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof s80) && i10 == ((s80) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String l(int i10) {
        if (j(i10, f32839c)) {
            return "Above";
        }
        if (j(i10, f32840d)) {
            return "Below";
        }
        if (j(i10, f32841e)) {
            return "Left";
        }
        if (j(i10, f32842f)) {
            return "Right";
        }
        if (j(i10, f32843g)) {
            return "Start";
        }
        return j(i10, f32844h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f32845a, obj);
    }

    public int hashCode() {
        return k(this.f32845a);
    }

    public final /* synthetic */ int m() {
        return this.f32845a;
    }

    @NotNull
    public String toString() {
        return l(this.f32845a);
    }
}
