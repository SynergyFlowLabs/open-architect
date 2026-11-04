package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, String> f337348b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<Character> f337349c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f337350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f337351e;

    public f(CharSequence[]... charSequenceArr) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        if (charSequenceArr != null) {
            int i12 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.f337348b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.f337349c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i10 = length < i10 ? length : i10;
                if (length > i12) {
                    i12 = length;
                }
            }
            i11 = i12;
        }
        this.f337350d = i10;
        this.f337351e = i11;
    }

    @Override // org.apache.commons.lang3.text.translate.b
    public int b(CharSequence charSequence, int i10, Writer writer) throws IOException {
        if (this.f337349c.contains(Character.valueOf(charSequence.charAt(i10)))) {
            int length = this.f337351e;
            if (i10 + length > charSequence.length()) {
                length = charSequence.length() - i10;
            }
            while (length >= this.f337350d) {
                String str = this.f337348b.get(charSequence.subSequence(i10, i10 + length).toString());
                if (str != null) {
                    writer.write(str);
                    return length;
                }
                length--;
            }
        }
        return 0;
    }
}
