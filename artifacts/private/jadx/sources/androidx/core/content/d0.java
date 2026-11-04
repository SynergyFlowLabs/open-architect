package androidx.core.content;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    private d0() {
    }

    @androidx.annotation.p0
    public static String a(@androidx.annotation.p0 String str, @NonNull String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(strArrSplit, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public static String b(@androidx.annotation.p0 String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@androidx.annotation.p0 String str, @NonNull String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split("/"), str2.split("/"));
    }

    @NonNull
    public static String[] d(@androidx.annotation.p0 String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean e(@NonNull String[] strArr, @NonNull String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }
}
