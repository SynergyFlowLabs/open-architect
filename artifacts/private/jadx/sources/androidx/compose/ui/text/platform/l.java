package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.z0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class l implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f42091a = 0;

    @Override // androidx.compose.ui.text.z0
    @NotNull
    public String a(@NotNull String str, @NotNull Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.z0
    @NotNull
    public String b(@NotNull String str, @NotNull Locale locale) {
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // androidx.compose.ui.text.z0
    @NotNull
    public String c(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) CharsKt.s(str.charAt(0), locale));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // androidx.compose.ui.text.z0
    @NotNull
    public String d(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.u(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }
}
