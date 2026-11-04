package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f289216a = Logger.getLogger(g1.class.getName());

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f289217a;

        static {
            int[] iArr = new int[com.google.gson.stream.c.values().length];
            f289217a = iArr;
            try {
                iArr[com.google.gson.stream.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f289217a[com.google.gson.stream.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f289217a[com.google.gson.stream.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f289217a[com.google.gson.stream.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f289217a[com.google.gson.stream.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f289217a[com.google.gson.stream.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private g1() {
    }

    public static Object a(String str) throws IOException {
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(new StringReader(str));
        try {
            Object objE = e(aVar);
            try {
                aVar.close();
                return objE;
            } catch (IOException e10) {
                Logger logger = f289216a;
                Level level = Level.WARNING;
                return objE;
            }
        } finally {
            try {
                aVar.close();
            } catch (IOException e11) {
                f289216a.log(Level.WARNING, "Failed to close", (Throwable) e11);
            }
        }
    }

    private static List<?> b(com.google.gson.stream.a aVar) throws IOException {
        aVar.J0();
        ArrayList arrayList = new ArrayList();
        while (aVar.hasNext()) {
            arrayList.add(e(aVar));
        }
        com.google.common.base.j0.h0(aVar.x() == com.google.gson.stream.c.END_ARRAY, "Bad token: " + aVar.S());
        aVar.F0();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void c(com.google.gson.stream.a aVar) throws IOException {
        aVar.a7();
        return null;
    }

    private static Map<String, ?> d(com.google.gson.stream.a aVar) throws IOException {
        aVar.m1();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.hasNext()) {
            linkedHashMap.put(aVar.na(), e(aVar));
        }
        com.google.common.base.j0.h0(aVar.x() == com.google.gson.stream.c.END_OBJECT, "Bad token: " + aVar.S());
        aVar.F1();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(com.google.gson.stream.a aVar) throws IOException {
        com.google.common.base.j0.h0(aVar.hasNext(), "unexpected end of JSON");
        switch (a.f289217a[aVar.x().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.jc();
            case 4:
                return Double.valueOf(aVar.nextDouble());
            case 5:
                return Boolean.valueOf(aVar.nextBoolean());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.S());
        }
    }
}
