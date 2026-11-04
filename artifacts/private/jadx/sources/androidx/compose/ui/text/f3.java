package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class f3 implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41547a;

    private /* synthetic */ f3(String str) {
        this.f41547a = str;
    }

    public static final /* synthetic */ f3 a(String str) {
        return new f3(str);
    }

    @NotNull
    public static String b(@NotNull String str) {
        return str;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof f3) && Intrinsics.areEqual(str, ((f3) obj).h());
    }

    public static final boolean d(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    public static int f(String str) {
        return str.hashCode();
    }

    public static String g(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    @NotNull
    public final String e() {
        return this.f41547a;
    }

    public boolean equals(Object obj) {
        return c(this.f41547a, obj);
    }

    public final /* synthetic */ String h() {
        return this.f41547a;
    }

    public int hashCode() {
        return f(this.f41547a);
    }

    public String toString() {
        return g(this.f41547a);
    }
}
