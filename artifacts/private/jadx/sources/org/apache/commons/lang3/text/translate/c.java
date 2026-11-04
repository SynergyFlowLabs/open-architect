package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public abstract class c extends b {
    @Override // org.apache.commons.lang3.text.translate.b
    public final int b(CharSequence charSequence, int i10, Writer writer) throws IOException {
        return f(Character.codePointAt(charSequence, i10), writer) ? 1 : 0;
    }

    public abstract boolean f(int i10, Writer writer) throws IOException;
}
