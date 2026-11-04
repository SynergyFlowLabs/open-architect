package androidx.compose.foundation.gestures.snapping;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f15039b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15040c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15041d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f15042e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15043a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f15040c;
        }

        public final int b() {
            return d.f15041d;
        }

        public final int c() {
            return d.f15042e;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i10) {
        this.f15043a = i10;
    }

    public static final /* synthetic */ d d(int i10) {
        return new d(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return "FinalSnappingItem(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f15043a, obj);
    }

    public int hashCode() {
        return h(this.f15043a);
    }

    public final /* synthetic */ int j() {
        return this.f15043a;
    }

    public String toString() {
        return i(this.f15043a);
    }
}
