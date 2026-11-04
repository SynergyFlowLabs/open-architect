package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class i extends b {
    private boolean f(char c10) {
        return c10 >= '0' && c10 <= '7';
    }

    private boolean g(char c10) {
        return c10 >= '0' && c10 <= '3';
    }

    @Override // org.apache.commons.lang3.text.translate.b
    public int b(CharSequence charSequence, int i10, Writer writer) throws IOException {
        int length = (charSequence.length() - i10) - 1;
        StringBuilder sb2 = new StringBuilder();
        if (charSequence.charAt(i10) == '\\' && length > 0) {
            int i11 = i10 + 1;
            if (f(charSequence.charAt(i11))) {
                int i12 = i10 + 2;
                int i13 = i10 + 3;
                sb2.append(charSequence.charAt(i11));
                if (length > 1 && f(charSequence.charAt(i12))) {
                    sb2.append(charSequence.charAt(i12));
                    if (length > 2 && g(charSequence.charAt(i11)) && f(charSequence.charAt(i13))) {
                        sb2.append(charSequence.charAt(i13));
                    }
                }
                writer.write(Integer.parseInt(sb2.toString(), 8));
                return sb2.length() + 1;
            }
        }
        return 0;
    }
}
