package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42278b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42279c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42280d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42281e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42282a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u.f42281e;
        }

        public final int b() {
            return u.f42279c;
        }

        public final int c() {
            return u.f42280d;
        }

        private a() {
        }
    }

    private /* synthetic */ u(int i10) {
        this.f42282a = i10;
    }

    public static final /* synthetic */ u d(int i10) {
        return new u(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof u) && i10 == ((u) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (i10 == f42279c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f42280d) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == f42281e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f42282a, obj);
    }

    public int hashCode() {
        return h(this.f42282a);
    }

    public final /* synthetic */ int j() {
        return this.f42282a;
    }

    @NotNull
    public String toString() {
        return i(this.f42282a);
    }
}
