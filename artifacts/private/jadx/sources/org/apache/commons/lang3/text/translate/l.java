package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class l extends c {
    @Override // org.apache.commons.lang3.text.translate.c
    public boolean f(int i10, Writer writer) throws IOException {
        return i10 >= 55296 && i10 <= 57343;
    }
}
