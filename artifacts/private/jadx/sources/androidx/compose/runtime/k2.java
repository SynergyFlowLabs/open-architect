package androidx.compose.runtime;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
final class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f36180b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f36181c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f36182d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f36183e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36184a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k2.f36181c;
        }

        public final int b() {
            return k2.f36182d;
        }

        public final int c() {
            return k2.f36183e;
        }

        private a() {
        }
    }

    private /* synthetic */ k2(int i10) {
        this.f36184a = i10;
    }

    public static final /* synthetic */ k2 d(int i10) {
        return new k2(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof k2) && i10 == ((k2) obj).m();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean j(int i10) {
        return i10 != f36180b.a();
    }

    public static final boolean k(int i10) {
        return i10 != f36180b.b();
    }

    public static String l(int i10) {
        return "GroupKind(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f36184a, obj);
    }

    public final int h() {
        return this.f36184a;
    }

    public int hashCode() {
        return i(this.f36184a);
    }

    public final /* synthetic */ int m() {
        return this.f36184a;
    }

    public String toString() {
        return l(this.f36184a);
    }
}
