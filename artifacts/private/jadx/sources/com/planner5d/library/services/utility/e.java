package com.planner5d.library.services.utility;

import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class e {
    private e() {
    }

    @NonNull
    public static <T> T[] a(@NonNull T[] tArr, @androidx.annotation.p0 T t10, @NonNull Class<? extends T[]> cls) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1, cls);
        tArr2[length] = t10;
        return tArr2;
    }

    public static int[] b(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return iArr;
    }

    public static long[] c(List<Long> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = list.get(i10).longValue();
        }
        return jArr;
    }

    public static long[] d(List<String> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = Long.valueOf(list.get(i10)).longValue();
        }
        return jArr;
    }

    public static String[] e(List<String> list) {
        return (String[]) list.toArray(new String[0]);
    }

    @androidx.annotation.m1
    public static List<String> f(String str, Cursor cursor) {
        return g(str, cursor, null);
    }

    @androidx.annotation.m1
    public static List<String> g(String str, Cursor cursor, org.apache.commons.collections4.l0<String> l0Var) {
        LinkedList linkedList = new LinkedList();
        if (cursor != null && str != null) {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                while (cursor.moveToNext()) {
                    String string = cursor.getString(columnIndex);
                    if (l0Var == null || l0Var.a(string)) {
                        linkedList.add(string);
                    }
                }
            }
            cursor.close();
        }
        return linkedList;
    }

    public static List<Long> h(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next()));
        }
        return arrayList;
    }
}
