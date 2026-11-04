package com.google.common.base;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public final class d0 extends n {
    private d0() {
    }

    public static boolean a(@fj.a Object a10, @fj.a Object b10) {
        if (a10 != b10 && (a10 == null || !a10.equals(b10))) {
            return false;
        }
        return true;
    }

    public static int b(@fj.a Object... objects) {
        return Arrays.hashCode(objects);
    }
}
