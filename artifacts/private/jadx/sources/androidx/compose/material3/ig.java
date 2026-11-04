package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class ig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f28587b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f28588c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f28589d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f28590e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f28591f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28592a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ig.f28589d;
        }

        public final int b() {
            return ig.f28590e;
        }

        public final int c() {
            return ig.f28591f;
        }

        public final int d() {
            return ig.f28588c;
        }

        private a() {
        }
    }

    static {
        int i10 = 6 & 3;
    }

    private /* synthetic */ ig(int i10) {
        this.f28592a = i10;
    }

    public static final /* synthetic */ ig e(int i10) {
        return new ig(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof ig) && i10 == ((ig) obj).k();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String j(int i10) {
        if (h(i10, f28588c)) {
            return "FabPosition.Start";
        }
        if (h(i10, f28589d)) {
            return "FabPosition.Center";
        }
        return h(i10, f28590e) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }

    public boolean equals(Object obj) {
        return g(this.f28592a, obj);
    }

    public int hashCode() {
        return i(this.f28592a);
    }

    public final /* synthetic */ int k() {
        return this.f28592a;
    }

    @NotNull
    public String toString() {
        return j(this.f28592a);
    }
}
