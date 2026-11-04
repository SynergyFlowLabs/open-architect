package io.intercom.android.sdk.utilities;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes13.dex */
public class NullSafety {
    public static boolean valueOrDefault(@p0 Boolean bool, boolean z10) {
        return bool == null ? z10 : bool.booleanValue();
    }

    public static String valueOrEmpty(@p0 String str) {
        return str == null ? "" : str;
    }
}
