package androidx.compose.material3.carousel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f26536b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26537c = e(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f26538d = e(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f26539e = e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26540a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b.f26538d;
        }

        public final int b() {
            return b.f26539e;
        }

        public final int c() {
            return b.f26537c;
        }

        private a() {
        }
    }

    private /* synthetic */ b(int i10) {
        this.f26540a = i10;
    }

    public static final /* synthetic */ b d(int i10) {
        return new b(i10);
    }

    private static int e(int i10) {
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
        return "CarouselAlignment(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f26540a, obj);
    }

    public int hashCode() {
        return h(this.f26540a);
    }

    public final /* synthetic */ int j() {
        return this.f26540a;
    }

    public String toString() {
        return i(this.f26540a);
    }
}
