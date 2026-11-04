package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "CharsetsKt")
public final class d {
    @kotlin.internal.f
    private static final Charset a(String charsetName) {
        Intrinsics.checkNotNullParameter(charsetName, "charsetName");
        Charset charsetForName = Charset.forName(charsetName);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return charsetForName;
    }
}
