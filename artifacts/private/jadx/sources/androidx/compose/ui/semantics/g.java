package androidx.compose.ui.semantics;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41102b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41103c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41104d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41105a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return g.f41104d;
        }

        public final int b() {
            return g.f41103c;
        }

        private a() {
        }
    }

    private /* synthetic */ g(int i10) {
        this.f41105a = i10;
    }

    public static final /* synthetic */ g c(int i10) {
        return new g(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f41103c)) {
            return "Polite";
        }
        return f(i10, f41104d) ? "Assertive" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f41105a, obj);
    }

    public int hashCode() {
        return g(this.f41105a);
    }

    public final /* synthetic */ int i() {
        return this.f41105a;
    }

    @NotNull
    public String toString() {
        return h(this.f41105a);
    }
}
