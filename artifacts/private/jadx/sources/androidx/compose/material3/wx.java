package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class wx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f34310b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f34311c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f34312d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34313a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return wx.f34312d;
        }

        public final int b() {
            return wx.f34311c;
        }

        private a() {
        }
    }

    private /* synthetic */ wx(int i10) {
        this.f34313a = i10;
    }

    public static final /* synthetic */ wx c(int i10) {
        return new wx(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        if ((obj instanceof wx) && i10 == ((wx) obj).i()) {
            return true;
        }
        return false;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f34311c)) {
            return "EqualWeight";
        }
        return f(i10, f34312d) ? "Centered" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f34313a, obj);
    }

    public int hashCode() {
        return g(this.f34313a);
    }

    public final /* synthetic */ int i() {
        return this.f34313a;
    }

    @NotNull
    public String toString() {
        return h(this.f34313a);
    }
}
