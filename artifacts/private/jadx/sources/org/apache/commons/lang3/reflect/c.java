package org.apache.commons.lang3.reflect;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static int a(Class<?> cls, Class<?> cls2) {
        if (cls != null && cls2 != null) {
            if (cls.equals(cls2)) {
                return 0;
            }
            Class<? super Object> superclass = cls.getSuperclass();
            int iY = org.apache.commons.lang3.e.y(cls2.equals(superclass));
            int i10 = 1 << 1;
            if (iY == 1) {
                return iY;
            }
            int iA = iY + a(superclass, cls2);
            if (iA > 0) {
                return iA + 1;
            }
        }
        return -1;
    }
}
