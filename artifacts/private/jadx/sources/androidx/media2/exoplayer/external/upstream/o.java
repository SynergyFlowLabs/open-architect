package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f57363j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f57364k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f57365l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f57366m = 16;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57367n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57368o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57369p = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f57370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final byte[] f57372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f57373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f57374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f57375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f57376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f57377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f57378i;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public o(Uri uri) {
        this(uri, 0);
    }

    public static String b(int httpMethod) {
        if (httpMethod == 1) {
            return "GET";
        }
        if (httpMethod == 2) {
            return "POST";
        }
        if (httpMethod == 3) {
            return "HEAD";
        }
        throw new AssertionError(httpMethod);
    }

    public final String a() {
        return b(this.f57371b);
    }

    public boolean c(int flag) {
        return (this.f57378i & flag) == flag;
    }

    public o d(long offset) {
        long j10 = this.f57376g;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - offset;
        }
        return e(offset, j11);
    }

    public o e(long offset, long length) {
        return (offset == 0 && this.f57376g == length) ? this : new o(this.f57370a, this.f57371b, this.f57372c, this.f57374e + offset, this.f57375f + offset, length, this.f57377h, this.f57378i, this.f57373d);
    }

    public o f(Uri uri) {
        return new o(uri, this.f57371b, this.f57372c, this.f57374e, this.f57375f, this.f57376g, this.f57377h, this.f57378i, this.f57373d);
    }

    public String toString() {
        String strA = a();
        String strValueOf = String.valueOf(this.f57370a);
        String string = Arrays.toString(this.f57372c);
        long j10 = this.f57374e;
        long j11 = this.f57375f;
        long j12 = this.f57376g;
        String str = this.f57377h;
        int i10 = this.f57378i;
        StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + 94 + strValueOf.length() + String.valueOf(string).length() + String.valueOf(str).length());
        sb2.append("DataSpec[");
        sb2.append(strA);
        sb2.append(" ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(string);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(j12);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    public o(Uri uri, int flags) {
        this(uri, 0L, -1L, null, flags);
    }

    public o(Uri uri, long absoluteStreamPosition, long length, @androidx.annotation.p0 String key) {
        this(uri, absoluteStreamPosition, absoluteStreamPosition, length, key, 0);
    }

    public o(Uri uri, long absoluteStreamPosition, long length, @androidx.annotation.p0 String key, int flags) {
        this(uri, absoluteStreamPosition, absoluteStreamPosition, length, key, flags);
    }

    public o(Uri uri, long absoluteStreamPosition, long position, long length, @androidx.annotation.p0 String key, int flags) {
        this(uri, null, absoluteStreamPosition, position, length, key, flags);
    }

    public o(Uri uri, @androidx.annotation.p0 byte[] postBody, long absoluteStreamPosition, long position, long length, @androidx.annotation.p0 String key, int flags) {
        this(uri, postBody != null ? 2 : 1, postBody, absoluteStreamPosition, position, length, key, flags);
    }

    public o(Uri uri, int httpMethod, @androidx.annotation.p0 byte[] httpBody, long absoluteStreamPosition, long position, long length, @androidx.annotation.p0 String key, int flags) {
        this(uri, httpMethod, httpBody, absoluteStreamPosition, position, length, key, flags, Collections.EMPTY_MAP);
    }

    public o(Uri uri, int httpMethod, @androidx.annotation.p0 byte[] httpBody, long absoluteStreamPosition, long position, long length, @androidx.annotation.p0 String key, int flags, Map<String, String> httpRequestHeaders) {
        androidx.media2.exoplayer.external.util.a.a(absoluteStreamPosition >= 0);
        androidx.media2.exoplayer.external.util.a.a(position >= 0);
        androidx.media2.exoplayer.external.util.a.a(length > 0 || length == -1);
        this.f57370a = uri;
        this.f57371b = httpMethod;
        this.f57372c = (httpBody == null || httpBody.length == 0) ? null : httpBody;
        this.f57374e = absoluteStreamPosition;
        this.f57375f = position;
        this.f57376g = length;
        this.f57377h = key;
        this.f57378i = flags;
        this.f57373d = Collections.unmodifiableMap(new HashMap(httpRequestHeaders));
    }
}
