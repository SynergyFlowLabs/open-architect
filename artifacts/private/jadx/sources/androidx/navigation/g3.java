package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g3 f71010a = new g3();

    private g3() {
    }

    public static /* synthetic */ String c(g3 g3Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return g3Var.b(str, str2);
    }

    @NotNull
    public final String a(@NotNull String s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        String strDecode = Uri.decode(s10);
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        return strDecode;
    }

    @NotNull
    public final String b(@NotNull String s10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(s10, "s");
        String strEncode = Uri.encode(s10, str);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    @NotNull
    public final Uri d(@NotNull String uriString) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }
}
