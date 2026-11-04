package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20556b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f20557c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f20558d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f20559e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f20560f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20561a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f20560f;
        }

        public final long b() {
            return b.f20558d;
        }

        public final long c() {
            return b.f20559e;
        }

        public final long d() {
            return b.f20557c;
        }

        private a() {
        }
    }

    private /* synthetic */ b(long j10) {
        this.f20561a = j10;
    }

    public static final /* synthetic */ b e(long j10) {
        return new b(j10);
    }

    private static long f(long j10) {
        return j10;
    }

    public static boolean g(long j10, Object obj) {
        if ((obj instanceof b) && j10 == ((b) obj).l()) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static String k(long j10) {
        return "LayoutCacheOperation(flag=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f20561a, obj);
    }

    public int hashCode() {
        return j(this.f20561a);
    }

    public final long i() {
        return this.f20561a;
    }

    public final /* synthetic */ long l() {
        return this.f20561a;
    }

    public String toString() {
        return k(this.f20561a);
    }
}
