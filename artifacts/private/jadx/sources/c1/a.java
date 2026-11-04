package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@g
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0800a f82371b = new C0800a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f82372c = d("Enter");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f82373d = d("Exit");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f82374a;

    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    public static final class C0800a {
        public /* synthetic */ C0800a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return a.f82372c;
        }

        @NotNull
        public final String b() {
            return a.f82373d;
        }

        private C0800a() {
        }
    }

    private /* synthetic */ a(String str) {
        this.f82374a = str;
    }

    public static final /* synthetic */ a c(String str) {
        return new a(str);
    }

    private static String d(String str) {
        return str;
    }

    public static boolean e(String str, Object obj) {
        return (obj instanceof a) && Intrinsics.areEqual(str, ((a) obj).j());
    }

    public static final boolean f(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    public static int h(String str) {
        return str.hashCode();
    }

    @NotNull
    public static String i(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return e(this.f82374a, obj);
    }

    @NotNull
    public final String g() {
        return this.f82374a;
    }

    public int hashCode() {
        return h(this.f82374a);
    }

    public final /* synthetic */ String j() {
        return this.f82374a;
    }

    @NotNull
    public String toString() {
        return i(this.f82374a);
    }
}
