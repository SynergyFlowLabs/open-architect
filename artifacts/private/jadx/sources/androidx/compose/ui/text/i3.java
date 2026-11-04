package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class i3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41793b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41794c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41795d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41796a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i3.f41794c;
        }

        public final int b() {
            return i3.f41795d;
        }

        private a() {
        }
    }

    private /* synthetic */ i3(int i10) {
        this.f41796a = i10;
    }

    public static final /* synthetic */ i3 c(int i10) {
        return new i3(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof i3) && i10 == ((i3) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return "TextGranularity(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f41796a, obj);
    }

    public int hashCode() {
        return g(this.f41796a);
    }

    public final /* synthetic */ int i() {
        return this.f41796a;
    }

    public String toString() {
        return h(this.f41796a);
    }
}
