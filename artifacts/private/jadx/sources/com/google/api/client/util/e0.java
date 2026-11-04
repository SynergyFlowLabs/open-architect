package com.google.api.client.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public interface e0 {
    <T> T a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException;

    Object b(Reader reader, Type type) throws IOException;

    <T> T c(Reader reader, Class<T> cls) throws IOException;

    Object d(InputStream inputStream, Charset charset, Type type) throws IOException;
}
