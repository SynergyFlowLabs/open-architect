package io.grpc.okhttp.internal;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f290662a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f290663b = Charset.forName("UTF-8");

    private l() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> List<T> b(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    private static <T> List<T> c(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            for (T t11 : tArr2) {
                if (t10.equals(t11)) {
                    arrayList.add(t11);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] d(Class<T> cls, T[] tArr, T[] tArr2) {
        List listC = c(tArr, tArr2);
        return (T[]) listC.toArray((Object[]) Array.newInstance((Class<?>) cls, listC.size()));
    }
}
