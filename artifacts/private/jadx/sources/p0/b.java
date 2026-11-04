package p0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@g
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f340720b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f340721a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f340724a.a();
        }

        public final int b() {
            return d.f340724a.b();
        }

        public final int c() {
            return d.f340724a.c();
        }

        public final int d() {
            return d.f340724a.d();
        }

        public final int e() {
            return d.f340724a.e();
        }

        public final int f() {
            return d.f340724a.f();
        }

        public final int g() {
            return d.f340724a.g();
        }

        public final int h() {
            return d.f340724a.h();
        }

        public final int i() {
            return d.f340724a.i();
        }

        public final int j() {
            return d.f340724a.j();
        }

        public final int k() {
            return d.f340724a.k();
        }

        public final int l() {
            return d.f340724a.l();
        }

        public final int m() {
            return d.f340724a.m();
        }

        @NotNull
        public final List<b> n() {
            return CollectionsKt.listOf((Object[]) new b[]{b.a(a()), b.a(b()), b.a(c()), b.a(d()), b.a(e()), b.a(f()), b.a(g()), b.a(h()), b.a(i()), b.a(j()), b.a(k()), b.a(l()), b.a(m())});
        }

        private a() {
        }
    }

    private /* synthetic */ b(int i10) {
        this.f340721a = i10;
    }

    public static final /* synthetic */ b a(int i10) {
        return new b(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        if ((obj instanceof b) && i10 == ((b) obj).g()) {
            return true;
        }
        return false;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String f(int i10) {
        a aVar = f340720b;
        if (d(i10, aVar.a())) {
            return "Confirm";
        }
        if (d(i10, aVar.b())) {
            return "ContextClick";
        }
        if (d(i10, aVar.c())) {
            return "GestureEnd";
        }
        if (d(i10, aVar.d())) {
            return "GestureThresholdActivate";
        }
        if (d(i10, aVar.e())) {
            return "KeyboardTap";
        }
        if (d(i10, aVar.f())) {
            return "LongPress";
        }
        if (d(i10, aVar.g())) {
            return "Reject";
        }
        if (d(i10, aVar.h())) {
            return "SegmentFrequentTick";
        }
        if (d(i10, aVar.i())) {
            return "SegmentTick";
        }
        if (d(i10, aVar.j())) {
            return "TextHandleMove";
        }
        if (d(i10, aVar.k())) {
            return "ToggleOff";
        }
        if (d(i10, aVar.l())) {
            return "ToggleOn";
        }
        return d(i10, aVar.m()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return c(this.f340721a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f340721a;
    }

    public int hashCode() {
        return e(this.f340721a);
    }

    @NotNull
    public String toString() {
        return f(this.f340721a);
    }
}
