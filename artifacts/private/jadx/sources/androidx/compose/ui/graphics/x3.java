package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38688b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38689c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38690d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38691e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38692f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38693a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return x3.f38689c;
        }

        public final int b() {
            return x3.f38692f;
        }

        public final int c() {
            return x3.f38691e;
        }

        public final int d() {
            return x3.f38690d;
        }

        private a() {
        }
    }

    private /* synthetic */ x3(int i10) {
        this.f38693a = i10;
    }

    public static final /* synthetic */ x3 e(int i10) {
        return new x3(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof x3) && i10 == ((x3) obj).k();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String j(int i10) {
        if (h(i10, f38689c)) {
            return "Clamp";
        }
        if (h(i10, f38690d)) {
            return "Repeated";
        }
        if (h(i10, f38691e)) {
            return "Mirror";
        }
        return h(i10, f38692f) ? "Decal" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return g(this.f38693a, obj);
    }

    public int hashCode() {
        return i(this.f38693a);
    }

    public final /* synthetic */ int k() {
        return this.f38693a;
    }

    @NotNull
    public String toString() {
        return j(this.f38693a);
    }
}
