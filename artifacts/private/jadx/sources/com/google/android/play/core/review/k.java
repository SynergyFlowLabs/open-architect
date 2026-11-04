package com.google.android.play.core.review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f114978a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f114978a = new HashMap();
        new com.google.android.play.core.review.internal.i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        try {
            map = f114978a;
            map.put("java", 20002);
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }
}
