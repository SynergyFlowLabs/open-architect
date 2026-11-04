package com.google.api.client.http;

import com.google.api.client.util.q0;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class i0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f115630c;

    public i0(Object obj) {
        super(j0.f115639b);
        k(obj);
    }

    private static boolean h(boolean z10, Writer writer, String str, Object obj) throws IOException {
        if (obj != null && !com.google.api.client.util.n.c(obj)) {
            if (z10) {
                z10 = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String strB = com.google.api.client.util.escape.a.b(obj instanceof Enum ? com.google.api.client.util.r.k((Enum) obj).f() : obj.toString());
            if (strB.length() != 0) {
                writer.write("=");
                writer.write(strB);
            }
        }
        return z10;
    }

    public static i0 i(u uVar) {
        m mVarF = uVar.f();
        if (mVarF != null) {
            return (i0) mVarF;
        }
        i0 i0Var = new i0(new HashMap());
        uVar.E(i0Var);
        return i0Var;
    }

    public final Object j() {
        return this.f115630c;
    }

    public i0 k(Object obj) {
        this.f115630c = com.google.api.client.util.h0.d(obj);
        return this;
    }

    @Override // com.google.api.client.http.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i0 g(s sVar) {
        super.g(sVar);
        return this;
    }

    @Override // com.google.api.client.http.m, com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, e()));
        boolean zH = true;
        for (Map.Entry<String, Object> entry : com.google.api.client.util.n.f(this.f115630c).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String strB = com.google.api.client.util.escape.a.b(entry.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    Iterator it = q0.l(value).iterator();
                    while (it.hasNext()) {
                        zH = h(zH, bufferedWriter, strB, it.next());
                    }
                } else {
                    zH = h(zH, bufferedWriter, strB, value);
                }
            }
        }
        bufferedWriter.flush();
    }
}
