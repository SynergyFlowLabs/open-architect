package androidx.compose.ui.text.font;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@SourceDebugExtension({"SMAP\nDeviceFontFamilyNameFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,134:1\n118#2,4:135\n*S KotlinDebug\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n*L\n78#1:135,4\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41716a;

    private /* synthetic */ t(String str) {
        this.f41716a = str;
    }

    public static final /* synthetic */ t a(String str) {
        return new t(str);
    }

    @NotNull
    public static String b(@NotNull String str) {
        if (!(str.length() > 0)) {
            x0.a.e("name may not be empty");
        }
        return str;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof t) && Intrinsics.areEqual(str, ((t) obj).h());
    }

    public static final boolean d(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    public static int f(String str) {
        return str.hashCode();
    }

    public static String g(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    @NotNull
    public final String e() {
        return this.f41716a;
    }

    public boolean equals(Object obj) {
        return c(this.f41716a, obj);
    }

    public final /* synthetic */ String h() {
        return this.f41716a;
    }

    public int hashCode() {
        return f(this.f41716a);
    }

    public String toString() {
        return g(this.f41716a);
    }
}
