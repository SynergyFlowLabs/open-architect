package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    private o() {
    }

    public static boolean a(@p0 Object obj, @p0 Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(@p0 Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int c(@p0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @NonNull
    public static <T> T d(@p0 T t10) {
        t10.getClass();
        return t10;
    }

    @NonNull
    public static <T> T e(@p0 T t10, @NonNull String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    @p0
    public static String f(@p0 Object obj, @p0 String str) {
        return obj != null ? obj.toString() : str;
    }
}
