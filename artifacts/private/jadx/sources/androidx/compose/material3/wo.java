package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class wo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f34270b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f34271c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f34272d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34273a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return wo.f34272d;
        }

        public final int b() {
            return wo.f34271c;
        }

        private a() {
        }
    }

    private /* synthetic */ wo(int i10) {
        this.f34273a = i10;
    }

    public static final /* synthetic */ wo c(int i10) {
        return new wo(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof wo) && i10 == ((wo) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f34271c)) {
            return "Top";
        }
        return f(i10, f34272d) ? "Start" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f34273a, obj);
    }

    public int hashCode() {
        return g(this.f34273a);
    }

    public final /* synthetic */ int i() {
        return this.f34273a;
    }

    @NotNull
    public String toString() {
        return h(this.f34273a);
    }
}
