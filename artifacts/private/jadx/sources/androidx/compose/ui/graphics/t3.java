package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class t3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38242b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38243c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38244d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38245e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38246a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return t3.f38245e;
        }

        public final int b() {
            return t3.f38244d;
        }

        public final int c() {
            return t3.f38243c;
        }

        private a() {
        }
    }

    private /* synthetic */ t3(int i10) {
        this.f38246a = i10;
    }

    public static final /* synthetic */ t3 d(int i10) {
        return new t3(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof t3) && i10 == ((t3) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f38243c)) {
            return "Translate";
        }
        if (g(i10, f38244d)) {
            return "Rotate";
        }
        return g(i10, f38245e) ? "Morph" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return f(this.f38246a, obj);
    }

    public int hashCode() {
        return h(this.f38246a);
    }

    public final /* synthetic */ int j() {
        return this.f38246a;
    }

    @NotNull
    public String toString() {
        return i(this.f38246a);
    }
}
