package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class s {
    @g6.a
    public static void a(@NonNull StringBuilder sb2, @NonNull HashMap<String, String> map) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : map.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z10 = false;
        }
        sb2.append("}");
    }
}
