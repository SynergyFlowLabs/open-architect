package androidx.compose.foundation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f15511b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15512c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15513d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15514a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return h3.f15512c;
        }

        public final int b() {
            return h3.f15513d;
        }

        private a() {
        }
    }

    private /* synthetic */ h3(int i10) {
        this.f15514a = i10;
    }

    public static final /* synthetic */ h3 c(int i10) {
        return new h3(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof h3) && i10 == ((h3) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f15512c)) {
            return "Immediately";
        }
        if (f(i10, f15513d)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i10).toString());
    }

    public boolean equals(Object obj) {
        return e(this.f15514a, obj);
    }

    public int hashCode() {
        return g(this.f15514a);
    }

    public final /* synthetic */ int i() {
        return this.f15514a;
    }

    @NotNull
    public String toString() {
        return h(this.f15514a);
    }
}
