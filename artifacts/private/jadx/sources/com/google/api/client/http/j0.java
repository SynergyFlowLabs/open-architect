package com.google.api.client.http;

import com.google.api.client.util.p0;
import com.google.api.client.util.q0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class j0 implements com.google.api.client.util.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f115638a = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f115639b = new s("application/x-www-form-urlencoded").n(com.google.api.client.util.j.f116086a).a();

    public static void e(Reader reader, Object obj) throws IOException {
        int i10;
        Class<?> cls = obj.getClass();
        com.google.api.client.util.k kVarH = com.google.api.client.util.k.h(cls);
        List listAsList = Arrays.asList(cls);
        com.google.api.client.util.s sVar = com.google.api.client.util.s.class.isAssignableFrom(cls) ? (com.google.api.client.util.s) obj : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj : null;
        com.google.api.client.util.b bVar = new com.google.api.client.util.b(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z10 = true;
            while (true) {
                i10 = reader.read();
                if (i10 == -1 || i10 == 38) {
                    break;
                }
                if (i10 != 61) {
                    if (z10) {
                        stringWriter.write(i10);
                    } else {
                        stringWriter2.write(i10);
                    }
                } else if (z10) {
                    z10 = false;
                } else {
                    stringWriter2.write(i10);
                }
            }
            String strA = com.google.api.client.util.escape.a.a(stringWriter.toString());
            if (strA.length() != 0) {
                String strA2 = com.google.api.client.util.escape.a.a(stringWriter2.toString());
                com.google.api.client.util.r rVarB = kVarH.b(strA);
                if (rVarB != null) {
                    Type typeK = com.google.api.client.util.n.k(listAsList, rVarB.e());
                    if (q0.j(typeK)) {
                        Class<?> clsF = q0.f(listAsList, q0.b(typeK));
                        bVar.b(rVarB.c(), clsF, g(clsF, listAsList, strA2));
                    } else if (q0.k(q0.f(listAsList, typeK), Iterable.class)) {
                        Collection<Object> collectionG = (Collection) rVarB.h(obj);
                        if (collectionG == null) {
                            collectionG = com.google.api.client.util.n.g(typeK);
                            rVarB.n(obj, collectionG);
                        }
                        collectionG.add(g(typeK == Object.class ? null : q0.d(typeK), listAsList, strA2));
                    } else {
                        rVarB.n(obj, g(typeK, listAsList, strA2));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(strA);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (sVar != null) {
                            sVar.j0(strA, arrayList);
                        } else {
                            map.put(strA, arrayList);
                        }
                    }
                    arrayList.add(strA2);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (i10 != -1);
        bVar.c();
    }

    public static void f(String str, Object obj) {
        if (str == null) {
            return;
        }
        try {
            e(new StringReader(str), obj);
        } catch (IOException e10) {
            throw p0.a(e10);
        }
    }

    private static Object g(Type type, List<Type> list, String str) {
        return com.google.api.client.util.n.j(com.google.api.client.util.n.k(list, type), str);
    }

    @Override // com.google.api.client.util.e0
    public <T> T a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) c(new InputStreamReader(inputStream, charset), cls);
    }

    @Override // com.google.api.client.util.e0
    public Object b(Reader reader, Type type) throws IOException {
        com.google.api.client.util.h0.b(type instanceof Class, "dataType has to be of type Class<?>");
        Object objM = q0.m((Class) type);
        e(new BufferedReader(reader), objM);
        return objM;
    }

    @Override // com.google.api.client.util.e0
    public <T> T c(Reader reader, Class<T> cls) throws IOException {
        return (T) b(reader, cls);
    }

    @Override // com.google.api.client.util.e0
    public Object d(InputStream inputStream, Charset charset, Type type) throws IOException {
        return b(new InputStreamReader(inputStream, charset), type);
    }
}
