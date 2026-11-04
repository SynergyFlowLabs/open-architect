package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@androidx.compose.runtime.o2
public final class tg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f25008b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f25009c = j(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f25010d = j(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f25011e = j(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f25012f = j(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f25013g = j(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f25014h = j(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f25015i = j(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f25016j = j(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25017a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return tg.f25010d;
        }

        public final int b() {
            return tg.f25011e;
        }

        public final int c() {
            return tg.f25012f;
        }

        public final int d() {
            return tg.f25013g;
        }

        public final int e() {
            return tg.f25009c;
        }

        public final int f() {
            return tg.f25015i;
        }

        public final int g() {
            return tg.f25014h;
        }

        public final int h() {
            return tg.f25016j;
        }

        private a() {
        }
    }

    private /* synthetic */ tg(int i10) {
        this.f25017a = i10;
    }

    public static final /* synthetic */ tg i(int i10) {
        return new tg(i10);
    }

    private static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        if ((obj instanceof tg) && i10 == ((tg) obj).o()) {
            return true;
        }
        return false;
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return "Strings(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return k(this.f25017a, obj);
    }

    public int hashCode() {
        return m(this.f25017a);
    }

    public final /* synthetic */ int o() {
        return this.f25017a;
    }

    public String toString() {
        return n(this.f25017a);
    }
}
