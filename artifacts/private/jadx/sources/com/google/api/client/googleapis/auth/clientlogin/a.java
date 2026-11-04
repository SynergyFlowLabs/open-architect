package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.x;
import com.google.api.client.util.e0;
import com.google.api.client.util.f;
import com.google.api.client.util.k;
import com.google.api.client.util.q0;
import com.google.api.client.util.r;
import com.google.api.client.util.s;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@f
final class a implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115276a = new a();

    private a() {
    }

    @Override // com.google.api.client.util.e0
    public <T> T a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) c(new InputStreamReader(inputStream, charset), cls);
    }

    @Override // com.google.api.client.util.e0
    public Object b(Reader reader, Type type) {
        throw new UnsupportedOperationException("Type-based parsing is not yet supported -- use Class<T> instead");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.client.util.e0
    public <T> T c(Reader reader, Class<T> cls) throws IOException {
        Object objValueOf;
        try {
            k kVarH = k.h(cls);
            T t10 = (T) q0.m(cls);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    reader.close();
                    return t10;
                }
                int iIndexOf = line.indexOf(61);
                String strSubstring = line.substring(0, iIndexOf);
                String strSubstring2 = line.substring(iIndexOf + 1);
                Field fieldA = kVarH.a(strSubstring);
                if (fieldA != null) {
                    Class<?> type = fieldA.getType();
                    if (type == Boolean.TYPE) {
                        objValueOf = Boolean.valueOf(strSubstring2);
                    } else if (type == Boolean.class) {
                        objValueOf = strSubstring2;
                        objValueOf = Boolean.valueOf(strSubstring2);
                    }
                    objValueOf = strSubstring2;
                    r.m(fieldA, t10, objValueOf);
                } else if (s.class.isAssignableFrom(cls)) {
                    ((s) t10).p(strSubstring, strSubstring2);
                } else if (Map.class.isAssignableFrom(cls)) {
                    ((Map) t10).put(strSubstring, strSubstring2);
                }
            }
        } catch (Throwable th2) {
            reader.close();
            throw th2;
        }
    }

    @Override // com.google.api.client.util.e0
    public Object d(InputStream inputStream, Charset charset, Type type) {
        throw new UnsupportedOperationException("Type-based parsing is not yet supported -- use Class<T> instead");
    }

    public String e() {
        return "text/plain";
    }

    public <T> T f(x xVar, Class<T> cls) throws IOException {
        xVar.u(0);
        InputStream inputStreamC = xVar.c();
        try {
            T t10 = (T) g(inputStreamC, cls);
            inputStreamC.close();
            return t10;
        } catch (Throwable th2) {
            inputStreamC.close();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(InputStream inputStream, Class<T> cls) throws IOException {
        Object objValueOf;
        k kVarH = k.h(cls);
        T t10 = (T) q0.m(cls);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return t10;
            }
            int iIndexOf = line.indexOf(61);
            String strSubstring = line.substring(0, iIndexOf);
            String strSubstring2 = line.substring(iIndexOf + 1);
            Field fieldA = kVarH.a(strSubstring);
            if (fieldA != null) {
                Class<?> type = fieldA.getType();
                if (type == Boolean.TYPE || type == Boolean.class) {
                    objValueOf = strSubstring2;
                    objValueOf = Boolean.valueOf(strSubstring2);
                }
                objValueOf = strSubstring2;
                r.m(fieldA, t10, objValueOf);
            } else if (s.class.isAssignableFrom(cls)) {
                ((s) t10).p(strSubstring, strSubstring2);
            } else if (Map.class.isAssignableFrom(cls)) {
                ((Map) t10).put(strSubstring, strSubstring2);
            }
        }
    }
}
