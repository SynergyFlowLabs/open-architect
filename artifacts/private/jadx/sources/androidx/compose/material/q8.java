package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class q8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f24378b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f24379c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f24380d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f24381e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24382a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return q8.f24380d;
        }

        public final int b() {
            return q8.f24381e;
        }

        public final int c() {
            return q8.f24379c;
        }

        private a() {
        }
    }

    private /* synthetic */ q8(int i10) {
        this.f24382a = i10;
    }

    public static final /* synthetic */ q8 d(int i10) {
        return new q8(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof q8) && i10 == ((q8) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f24379c)) {
            return "FabPosition.Start";
        }
        return g(i10, f24380d) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return f(this.f24382a, obj);
    }

    public int hashCode() {
        return h(this.f24382a);
    }

    public final /* synthetic */ int j() {
        return this.f24382a;
    }

    @NotNull
    public String toString() {
        return i(this.f24382a);
    }
}
