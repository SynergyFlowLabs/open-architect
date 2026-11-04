package androidx.compose.ui.text.font;

import com.segment.analytics.kotlin.core.BaseEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41699b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41700c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41701d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41702e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41703f = f(65535);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41704a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r0.f41703f;
        }

        public final int b() {
            return r0.f41700c;
        }

        public final int c() {
            return r0.f41702e;
        }

        public final int d() {
            return r0.f41701d;
        }

        private a() {
        }
    }

    private /* synthetic */ r0(int i10) {
        this.f41704a = i10;
    }

    public static final /* synthetic */ r0 e(int i10) {
        return new r0(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        if ((obj instanceof r0) && i10 == ((r0) obj).m()) {
            return true;
        }
        return false;
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean j(int i10) {
        return (i10 & 2) != 0;
    }

    public static final boolean k(int i10) {
        return (i10 & 1) != 0;
    }

    @NotNull
    public static String l(int i10) {
        if (h(i10, f41700c)) {
            return "None";
        }
        if (h(i10, f41701d)) {
            return "Weight";
        }
        if (h(i10, f41702e)) {
            return "Style";
        }
        return h(i10, f41703f) ? BaseEvent.f266644b : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f41704a, obj);
    }

    public int hashCode() {
        return i(this.f41704a);
    }

    public final /* synthetic */ int m() {
        return this.f41704a;
    }

    @NotNull
    public String toString() {
        return l(this.f41704a);
    }
}
