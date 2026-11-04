package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class Charsets {

    @oj.f
    @NotNull
    public static final Charset UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Charsets f313184a = new Charsets();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Charset f313185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Charset f313186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Charset f313187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Charset f313188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Charset f313189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private static volatile Charset f313190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private static volatile Charset f313191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private static volatile Charset f313192i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        UTF_8 = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        f313185b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(charsetForName3, "forName(...)");
        f313186c = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName4, "forName(...)");
        f313187d = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(charsetForName5, "forName(...)");
        f313188e = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(charsetForName6, "forName(...)");
        f313189f = charsetForName6;
    }

    private Charsets() {
    }

    @oj.i(name = "UTF32")
    @NotNull
    public final Charset a() {
        Charset charset = f313190g;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f313190g = charsetForName;
        return charsetForName;
    }

    @oj.i(name = "UTF32_BE")
    @NotNull
    public final Charset b() {
        Charset charset = f313192i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f313192i = charsetForName;
        return charsetForName;
    }

    @oj.i(name = "UTF32_LE")
    @NotNull
    public final Charset c() {
        Charset charset = f313191h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f313191h = charsetForName;
        return charsetForName;
    }
}
