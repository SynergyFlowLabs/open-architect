package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class f0 {
    private f0() {
    }

    @androidx.annotation.p0
    @g6.a
    public static String a(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, @NonNull String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !attributeValue.startsWith("@string/") || !z10) {
            return attributeValue;
        }
        String strSubstring = attributeValue.substring(8);
        String packageName = context.getPackageName();
        TypedValue typedValue = new TypedValue();
        try {
            context.getResources().getValue(packageName + ":string/" + strSubstring, typedValue, true);
        } catch (Resources.NotFoundException unused) {
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            return charSequence.toString();
        }
        typedValue.toString();
        return attributeValue;
    }
}
