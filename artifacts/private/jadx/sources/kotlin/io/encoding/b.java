package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    @f
    @e1(version = "1.8")
    @kotlin.internal.f
    private static final byte[] a(a aVar, CharSequence source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source instanceof String)) {
            return aVar.e(source, i10, i11);
        }
        aVar.h(source.length(), i10, i11);
        String strSubstring = ((String) source).substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Charset charset = Charsets.f313189f;
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @f
    @e1(version = "1.8")
    @kotlin.internal.f
    private static final int b(a aVar, byte[] source, byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return aVar.w(source, destination, i10, i11, i12);
    }

    @f
    @e1(version = "1.8")
    @kotlin.internal.f
    private static final byte[] c(a aVar, byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return aVar.C(source, i10, i11);
    }

    @f
    @e1(version = "1.8")
    @kotlin.internal.f
    private static final String d(a aVar, byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(aVar.C(source, i10, i11), Charsets.f313189f);
    }
}
