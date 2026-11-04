package androidx.compose.foundation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f15701b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15702c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15703d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f15704e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15705a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f15702c;
        }

        public final int b() {
            return j.f15703d;
        }

        public final int c() {
            return j.f15704e;
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i10) {
        this.f15705a = i10;
    }

    public static final /* synthetic */ j d(int i10) {
        return new j(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        if ((obj instanceof j) && i10 == ((j) obj).k()) {
            return true;
        }
        return false;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static String j(int i10) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f15705a, obj);
    }

    public final int h() {
        return this.f15705a;
    }

    public int hashCode() {
        return i(this.f15705a);
    }

    public final /* synthetic */ int k() {
        return this.f15705a;
    }

    public String toString() {
        return j(this.f15705a);
    }
}
