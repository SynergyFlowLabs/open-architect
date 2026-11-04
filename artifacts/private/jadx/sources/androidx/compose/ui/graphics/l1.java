package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37840b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37841c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37842d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37843e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f37844f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37845a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l1.f37844f;
        }

        public final int b() {
            return l1.f37842d;
        }

        public final int c() {
            return l1.f37843e;
        }

        public final int d() {
            return l1.f37841c;
        }

        private a() {
        }
    }

    private /* synthetic */ l1(int i10) {
        this.f37845a = i10;
    }

    public static final /* synthetic */ l1 e(int i10) {
        return new l1(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof l1) && i10 == ((l1) obj).l();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String k(int i10) {
        if (h(i10, f37841c)) {
            return "None";
        }
        if (h(i10, f37842d)) {
            return "Low";
        }
        if (h(i10, f37843e)) {
            return "Medium";
        }
        return h(i10, f37844f) ? "High" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return g(this.f37845a, obj);
    }

    public int hashCode() {
        return j(this.f37845a);
    }

    public final int i() {
        return this.f37845a;
    }

    public final /* synthetic */ int l() {
        return this.f37845a;
    }

    @NotNull
    public String toString() {
        return k(this.f37845a);
    }
}
