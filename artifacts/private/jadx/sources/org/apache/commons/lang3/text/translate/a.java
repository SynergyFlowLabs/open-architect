package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b[] f337336b;

    public a(b... bVarArr) {
        this.f337336b = (b[]) org.apache.commons.lang3.c.I(bVarArr);
    }

    @Override // org.apache.commons.lang3.text.translate.b
    public int b(CharSequence charSequence, int i10, Writer writer) throws IOException {
        for (b bVar : this.f337336b) {
            int iB = bVar.b(charSequence, i10, writer);
            if (iB != 0) {
                return iB;
            }
        }
        return 0;
    }
}
