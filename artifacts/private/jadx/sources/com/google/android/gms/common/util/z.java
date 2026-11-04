package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class z {
    private z() {
    }

    @NonNull
    @g6.a
    public static String[] a(@NonNull Set<Scope> set) {
        com.google.android.gms.common.internal.w.s(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        com.google.android.gms.common.internal.w.s(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i10 = 0; i10 < scopeArr.length; i10++) {
            strArr[i10] = scopeArr[i10].O1();
        }
        return strArr;
    }
}
