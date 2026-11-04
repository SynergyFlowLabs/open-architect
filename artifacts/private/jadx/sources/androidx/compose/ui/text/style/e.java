package androidx.compose.ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42149b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42150c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42151d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42152e = e(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42153a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f42151d;
        }

        public final int b() {
            return e.f42150c;
        }

        public final int c() {
            return e.f42152e;
        }

        private a() {
        }
    }

    private /* synthetic */ e(int i10) {
        this.f42153a = i10;
    }

    public static final /* synthetic */ e d(int i10) {
        return new e(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f42150c)) {
            return "Hyphens.None";
        }
        if (g(i10, f42151d)) {
            return "Hyphens.Auto";
        }
        return g(i10, f42152e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f42153a, obj);
    }

    public int hashCode() {
        return h(this.f42153a);
    }

    public final /* synthetic */ int j() {
        return this.f42153a;
    }

    @NotNull
    public String toString() {
        return i(this.f42153a);
    }
}
