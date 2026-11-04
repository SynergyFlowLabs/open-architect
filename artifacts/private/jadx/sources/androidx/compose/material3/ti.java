package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@androidx.compose.runtime.o2
public final class ti {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f33206b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f33207c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f33208d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f33209e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33210a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ti.f33209e;
        }

        public final int b() {
            return ti.f33207c;
        }

        public final int c() {
            return ti.f33208d;
        }

        private a() {
        }
    }

    static {
        int i10 = 7 >> 1;
    }

    private /* synthetic */ ti(int i10) {
        this.f33210a = i10;
    }

    public static final /* synthetic */ ti d(int i10) {
        return new ti(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        boolean z10 = false | false;
        return (obj instanceof ti) && i10 == ((ti) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f33207c)) {
            return "SingleDateInput";
        }
        if (g(i10, f33208d)) {
            return "StartDateInput";
        }
        return g(i10, f33209e) ? "EndDateInput" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return f(this.f33210a, obj);
    }

    public int hashCode() {
        return h(this.f33210a);
    }

    public final /* synthetic */ int j() {
        return this.f33210a;
    }

    @NotNull
    public String toString() {
        return i(this.f33210a);
    }
}
