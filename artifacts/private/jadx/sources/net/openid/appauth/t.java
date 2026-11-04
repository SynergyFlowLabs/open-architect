package net.openid.appauth;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private t() {
        throw new IllegalStateException("This type is not intended to be instantiated");
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, @p0 Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z10, @NonNull String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    public static <T extends Collection<?>> T d(T t10, @p0 Object obj) {
        g(t10, obj);
        b(!t10.isEmpty(), obj);
        return t10;
    }

    @NonNull
    public static String e(String str, @p0 Object obj) {
        g(str, obj);
        b(!TextUtils.isEmpty(str), obj);
        return str;
    }

    public static <T> T f(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T g(T t10, @p0 Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNull
    public static String h(String str, @p0 Object obj) {
        if (str != null) {
            e(str, obj);
        }
        return str;
    }
}
