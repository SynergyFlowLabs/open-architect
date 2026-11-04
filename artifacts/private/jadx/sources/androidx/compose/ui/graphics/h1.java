package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37790b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37791c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37792d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37793e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37794a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return h1.f37791c;
        }

        public final int b() {
            return h1.f37793e;
        }

        public final int c() {
            return h1.f37792d;
        }

        private a() {
        }
    }

    private /* synthetic */ h1(int i10) {
        this.f37794a = i10;
    }

    public static final /* synthetic */ h1 d(int i10) {
        return new h1(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof h1) && i10 == ((h1) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f37794a, obj);
    }

    public int hashCode() {
        return h(this.f37794a);
    }

    public final /* synthetic */ int j() {
        return this.f37794a;
    }

    public String toString() {
        return i(this.f37794a);
    }
}
