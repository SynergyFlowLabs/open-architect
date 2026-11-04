package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n85#2:124\n90#2:125\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n53#1:124\n56#1:125\n*E\n"})
public final class w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42333b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42334c = x3.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42335a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return w3.f42334c;
        }

        private a() {
        }
    }

    private /* synthetic */ w3(long j10) {
        this.f42335a = j10;
    }

    public static final /* synthetic */ w3 b(long j10) {
        return new w3(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final boolean d(long j10, long j11) {
        return (l(j10) <= l(j11)) & (k(j11) <= k(j10));
    }

    public static final boolean e(long j10, int i10) {
        return i10 < k(j10) && l(j10) <= i10;
    }

    public static boolean f(long j10, Object obj) {
        if ((obj instanceof w3) && j10 == ((w3) obj).r()) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean h(long j10) {
        return n(j10) == i(j10);
    }

    public static final int i(long j10) {
        return (int) (j10 & com.rabbitmq.client.k0.f265952a);
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        return Math.max(n(j10), i(j10));
    }

    public static final int l(long j10) {
        return Math.min(n(j10), i(j10));
    }

    public static final boolean m(long j10) {
        if (n(j10) <= i(j10)) {
            return false;
        }
        boolean z10 = true | true;
        return true;
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10, long j11) {
        return (l(j10) < k(j11)) & (l(j11) < k(j10));
    }

    @NotNull
    public static String q(long j10) {
        return "TextRange(" + n(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f42335a, obj);
    }

    public int hashCode() {
        return o(this.f42335a);
    }

    public final /* synthetic */ long r() {
        return this.f42335a;
    }

    @NotNull
    public String toString() {
        return q(this.f42335a);
    }
}
