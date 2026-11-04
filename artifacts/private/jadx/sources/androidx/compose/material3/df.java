package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class df {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f27099b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f27100c = e("PrimaryNotEditable");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f27101d = e("PrimaryEditable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f27102e = e("SecondaryEditable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27103a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return df.f27101d;
        }

        @NotNull
        public final String b() {
            return df.f27100c;
        }

        @NotNull
        public final String c() {
            return df.f27102e;
        }

        private a() {
        }
    }

    private /* synthetic */ df(String str) {
        this.f27103a = str;
    }

    public static final /* synthetic */ df d(String str) {
        return new df(str);
    }

    private static String e(String str) {
        return str;
    }

    public static boolean f(String str, Object obj) {
        if ((obj instanceof df) && Intrinsics.areEqual(str, ((df) obj).j())) {
            return true;
        }
        return false;
    }

    public static final boolean g(String str, String str2) {
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
        return f(this.f27103a, obj);
    }

    public int hashCode() {
        return h(this.f27103a);
    }

    public final /* synthetic */ String j() {
        return this.f27103a;
    }

    @NotNull
    public String toString() {
        return i(this.f27103a);
    }
}
