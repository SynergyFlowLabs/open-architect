package com.google.gson;

import com.google.gson.internal.j0;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes5.dex */
public final class q {
    @Deprecated
    public q() {
    }

    public static l d(com.google.gson.stream.a aVar) throws v, m {
        y yVarJ = aVar.j();
        if (yVarJ == y.LEGACY_STRICT) {
            aVar.R(y.LENIENT);
        }
        try {
            try {
                l lVarA = j0.a(aVar);
                aVar.R(yVarJ);
                return lVarA;
            } catch (OutOfMemoryError | StackOverflowError e10) {
                throw new p("Failed parsing JSON source: " + aVar + " to Json", e10);
            }
        } catch (Throwable th2) {
            aVar.R(yVarJ);
            throw th2;
        }
    }

    public static l e(Reader reader) throws v, m {
        try {
            com.google.gson.stream.a aVar = new com.google.gson.stream.a(reader);
            l lVarD = d(aVar);
            if (!lVarD.G() && aVar.x() != com.google.gson.stream.c.END_DOCUMENT) {
                throw new v("Did not consume the entire document.");
            }
            return lVarD;
        } catch (com.google.gson.stream.e | NumberFormatException e10) {
            throw new v(e10);
        } catch (IOException e11) {
            throw new m(e11);
        }
    }

    public static l f(String str) throws v {
        return e(new StringReader(str));
    }

    @z7.m(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public l a(com.google.gson.stream.a aVar) throws v, m {
        return d(aVar);
    }

    @z7.m(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public l b(Reader reader) throws v, m {
        return e(reader);
    }

    @z7.m(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseString(json)")
    @Deprecated
    public l c(String str) throws v {
        return f(str);
    }
}
