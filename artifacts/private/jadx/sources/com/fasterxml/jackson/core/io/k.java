package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements Serializable {
    public abstract OutputStream a(d dVar, OutputStream outputStream) throws IOException;

    public abstract Writer b(d dVar, Writer writer) throws IOException;
}
