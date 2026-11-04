package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42661b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42662c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f42663d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f42664e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42665a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b0.f42664e;
        }

        public final long b() {
            return b0.f42663d;
        }

        public final long c() {
            return b0.f42662c;
        }

        private a() {
        }
    }

    private /* synthetic */ b0(long j10) {
        this.f42665a = j10;
    }

    public static final /* synthetic */ b0 d(long j10) {
        return new b0(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof b0) && j10 == ((b0) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String i(long j10) {
        if (g(j10, f42662c)) {
            return "Unspecified";
        }
        if (g(j10, f42663d)) {
            return "Sp";
        }
        return g(j10, f42664e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f42665a, obj);
    }

    public int hashCode() {
        return h(this.f42665a);
    }

    public final /* synthetic */ long j() {
        return this.f42665a;
    }

    @NotNull
    public String toString() {
        return i(this.f42665a);
    }
}
