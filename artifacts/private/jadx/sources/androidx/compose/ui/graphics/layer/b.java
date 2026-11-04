package androidx.compose.ui.graphics.layer;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37875b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37876c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37877d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37878e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37879a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b.f37876c;
        }

        public final int b() {
            return b.f37878e;
        }

        public final int c() {
            return b.f37877d;
        }

        private a() {
        }
    }

    static {
        int i10 = 3 << 2;
    }

    private /* synthetic */ b(int i10) {
        this.f37879a = i10;
    }

    public static final /* synthetic */ b d(int i10) {
        return new b(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).j();
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
        return f(this.f37879a, obj);
    }

    public int hashCode() {
        return h(this.f37879a);
    }

    public final /* synthetic */ int j() {
        return this.f37879a;
    }

    public String toString() {
        return i(this.f37879a);
    }
}
