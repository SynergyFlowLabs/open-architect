package com.google.api.client.util.store;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private f() {
    }

    public static String a(d<?> dVar) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            boolean z10 = true;
            for (String str : dVar.keySet()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append('=');
                sb2.append(dVar.get(str));
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
