package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38718b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38719c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38720d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38721e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38722a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return z2.f38720d;
        }

        public final int b() {
            return z2.f38719c;
        }

        public final int c() {
            return z2.f38721e;
        }

        private a() {
        }
    }

    private /* synthetic */ z2(int i10) {
        this.f38722a = i10;
    }

    public static final /* synthetic */ z2 d(int i10) {
        return new z2(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        if ((obj instanceof z2) && i10 == ((z2) obj).j()) {
            return true;
        }
        return false;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f38719c)) {
            return "Points";
        }
        if (g(i10, f38720d)) {
            return "Lines";
        }
        return g(i10, f38721e) ? org.locationtech.jts.io.gml2.a.f338495m : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return f(this.f38722a, obj);
    }

    public int hashCode() {
        return h(this.f38722a);
    }

    public final /* synthetic */ int j() {
        return this.f38722a;
    }

    @NotNull
    public String toString() {
        return i(this.f38722a);
    }
}
