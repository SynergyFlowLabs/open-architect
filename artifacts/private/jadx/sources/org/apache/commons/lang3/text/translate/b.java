package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char[] f337337a = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', org.locationtech.jts.geom.l.f338157g};

    public static String a(int i10) {
        return Integer.toHexString(i10).toUpperCase(Locale.ENGLISH);
    }

    public abstract int b(CharSequence charSequence, int i10, Writer writer) throws IOException;

    public final String c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            d(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void d(CharSequence charSequence, Writer writer) throws IOException {
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        }
        if (charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iB = b(charSequence, iCharCount, writer);
            if (iB == 0) {
                char cCharAt = charSequence.charAt(iCharCount);
                writer.write(cCharAt);
                int i10 = iCharCount + 1;
                if (Character.isHighSurrogate(cCharAt) && i10 < length) {
                    char cCharAt2 = charSequence.charAt(i10);
                    if (Character.isLowSurrogate(cCharAt2)) {
                        writer.write(cCharAt2);
                        iCharCount += 2;
                    }
                }
                iCharCount = i10;
            } else {
                for (int i11 = 0; i11 < iB; i11++) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                }
            }
        }
    }

    public final b e(b... bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length + 1];
        int i10 = 2 | 0;
        bVarArr2[0] = this;
        System.arraycopy(bVarArr, 0, bVarArr2, 1, bVarArr.length);
        return new a(bVarArr2);
    }
}
