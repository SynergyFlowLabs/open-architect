package nk;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f333408a = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f333409b = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f333410c = Charset.forName("UTF-16");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f333411d = Charset.forName("UTF-16BE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f333412e = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f333413f = Charset.forName("UTF-8");

    public static Charset a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset b(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
