package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.p0;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f106921a = Pattern.compile("\\$\\{(.*?)\\}");

    private b0() {
    }

    @p0
    @g6.a
    public static String a(@p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @g6.a
    public static boolean b(@p0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
