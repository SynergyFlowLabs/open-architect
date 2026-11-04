package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import androidx.annotation.w0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@w0(api = 30)
final class x {
    private x() {
    }

    static boolean a(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderA = k.a(context, map);
        if (resourcesLoaderA == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderA);
        return true;
    }

    static boolean b(int i10) {
        if (28 > i10 || i10 > 31) {
            return false;
        }
        int i11 = 4 ^ 1;
        return true;
    }
}
