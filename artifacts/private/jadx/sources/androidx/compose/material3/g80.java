package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@af
public final class g80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f27919b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27920c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f27921d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27922a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return g80.f27920c;
        }

        public final int b() {
            return g80.f27921d;
        }

        private a() {
        }
    }

    private /* synthetic */ g80(int i10) {
        this.f27922a = i10;
    }

    public static final /* synthetic */ g80 c(int i10) {
        return new g80(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof g80) && i10 == ((g80) obj).j();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (f(i10, f27920c)) {
            return "Hour";
        }
        return f(i10, f27921d) ? "Minute" : "";
    }

    public boolean equals(Object obj) {
        return e(this.f27922a, obj);
    }

    public final int g() {
        return this.f27922a;
    }

    public int hashCode() {
        return h(this.f27922a);
    }

    public final /* synthetic */ int j() {
        return this.f27922a;
    }

    @NotNull
    public String toString() {
        return i(this.f27922a);
    }
}
