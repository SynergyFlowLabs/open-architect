package org.apache.commons.collections4;

/* JADX INFO: loaded from: classes14.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f335490a = -1;

    b() {
    }

    static boolean a(Object[] objArr, Object obj) {
        return b(objArr, obj) != -1;
    }

    static <T> int b(T[] tArr, Object obj) {
        return c(tArr, obj, 0);
    }

    static int c(Object[] objArr, Object obj, int i10) {
        if (objArr == null) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (obj == null) {
            while (i10 < objArr.length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
        } else {
            while (i10 < objArr.length) {
                if (obj.equals(objArr[i10])) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }
}
