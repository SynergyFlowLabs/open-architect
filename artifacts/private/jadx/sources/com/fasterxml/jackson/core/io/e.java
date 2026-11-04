package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f102423a = 1;

    public DataInput a(d dVar, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream b(d dVar, InputStream inputStream) throws IOException;

    public abstract InputStream c(d dVar, byte[] bArr, int i10, int i11) throws IOException;

    public abstract Reader d(d dVar, Reader reader) throws IOException;
}
