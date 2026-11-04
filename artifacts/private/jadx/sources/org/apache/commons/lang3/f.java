package org.apache.commons.lang3;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f337162a = "ISO-8859-1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f337163b = "US-ASCII";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f337164c = "UTF-16";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f337165d = "UTF-16BE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f337166e = "UTF-16LE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f337167f = "UTF-8";

    @Deprecated
    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return Charset.isSupported(str);
        } catch (IllegalCharsetNameException unused) {
            return false;
        }
    }
}
