package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41690b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41691c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41692d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41693a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        public static /* synthetic */ void d() {
        }

        public final int a() {
            return q0.f41692d;
        }

        public final int c() {
            return q0.f41691c;
        }

        @NotNull
        public final List<q0> e() {
            return CollectionsKt.listOf((Object[]) new q0[]{q0.c(c()), q0.c(a())});
        }

        private a() {
        }
    }

    @kotlin.l(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @kotlin.b1(expression = "FontStyle.", imports = {}))
    private /* synthetic */ q0(int i10) {
        this.f41693a = i10;
    }

    public static final /* synthetic */ q0 c(int i10) {
        return new q0(i10);
    }

    @kotlin.l(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @kotlin.b1(expression = "FontStyle.", imports = {}))
    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof q0) && i10 == ((q0) obj).j();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (f(i10, f41691c)) {
            return "Normal";
        }
        return f(i10, f41692d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f41693a, obj);
    }

    public final int g() {
        return this.f41693a;
    }

    public int hashCode() {
        return h(this.f41693a);
    }

    public final /* synthetic */ int j() {
        return this.f41693a;
    }

    @NotNull
    public String toString() {
        return i(this.f41693a);
    }
}
