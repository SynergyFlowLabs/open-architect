package com.google.android.material.color;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface l {
    @p0
    static l k() {
        int i10 = Build.VERSION.SDK_INT;
        if ((30 > i10 || i10 > 33) && i10 < 34) {
            return null;
        }
        return v.k();
    }

    @NonNull
    Context a(@NonNull Context context, @NonNull Map<Integer, Integer> map);

    boolean b(@NonNull Context context, @NonNull Map<Integer, Integer> map);
}
