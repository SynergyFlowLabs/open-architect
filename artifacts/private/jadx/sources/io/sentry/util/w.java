package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.y3;
import io.sentry.y7;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque<Map.Entry<String, Object>> f306993a;

    public w(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f306993a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Nullable
    private <T> T a() throws IOException {
        try {
            return (T) b(null, null);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    @Nullable
    private <T> T b(@Nullable ILogger iLogger, @Nullable a2<T> a2Var) throws Exception {
        Map.Entry<String, Object> entryPeekLast = this.f306993a.peekLast();
        if (entryPeekLast == null) {
            return null;
        }
        T t10 = (T) entryPeekLast.getValue();
        if (a2Var != null && iLogger != null) {
            return a2Var.a(this, iLogger);
        }
        this.f306993a.removeLast();
        return t10;
    }

    @Override // io.sentry.y3
    @Nullable
    public TimeZone B9(@NotNull ILogger iLogger) throws IOException {
        String strN6 = n6();
        if (strN6 != null) {
            return TimeZone.getTimeZone(strN6);
        }
        return null;
    }

    @Override // io.sentry.y3
    public void C1(boolean z10) {
    }

    @Override // io.sentry.y3
    public void F0() throws IOException {
        if (this.f306993a.size() > 1) {
            this.f306993a.removeLast();
        }
    }

    @Override // io.sentry.y3
    public void F1() throws IOException {
        if (this.f306993a.size() > 1) {
            this.f306993a.removeLast();
        }
    }

    @Override // io.sentry.y3
    @Nullable
    public Float F7() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return Float.valueOf(((Number) objA).floatValue());
        }
        return null;
    }

    @Override // io.sentry.y3
    @Nullable
    public Long Gc() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return Long.valueOf(((Number) objA).longValue());
        }
        return null;
    }

    @Override // io.sentry.y3
    public void J0() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f306993a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f306993a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.c.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f306993a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.y3
    @Nullable
    public Boolean J3() throws IOException {
        return (Boolean) a();
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> Map<String, List<T>> U5(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.c.NULL) {
            a7();
            return null;
        }
        HashMap map = new HashMap();
        try {
            m1();
            if (hasNext()) {
                while (true) {
                    String strNa = na();
                    List<T> listP8 = p8(iLogger, a2Var);
                    if (listP8 != null) {
                        map.put(strNa, listP8);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.c.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.c.NAME) {
                        break;
                    }
                }
            }
            F1();
            return map;
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    @Override // io.sentry.y3
    public void a7() throws IOException {
        if (a() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.y3
    public void a9() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f306993a.clear();
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> Map<String, T> fd(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.c.NULL) {
            a7();
            return null;
        }
        try {
            m1();
            HashMap map = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(na(), a2Var.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.a(y7.WARNING, "Failed to deserialize object in map.", e10);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.c.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.c.NAME) {
                        break;
                    }
                }
            }
            F1();
            return map;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.y3
    public void gd(@NotNull ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, re());
        } catch (Exception e10) {
            iLogger.b(y7.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.y3
    public boolean hasNext() throws IOException {
        return !this.f306993a.isEmpty();
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> T i4(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws Exception {
        return (T) b(iLogger, a2Var);
    }

    @Override // io.sentry.y3
    @Nullable
    public Double ia() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return Double.valueOf(((Number) objA).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.y3
    public String jc() throws IOException {
        String str = (String) a();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.y3
    public void m1() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f306993a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        boolean z10 = true & false;
        this.f306993a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.c.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f306993a.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.y3
    @Nullable
    public String n6() throws IOException {
        return (String) a();
    }

    @Override // io.sentry.y3
    @NotNull
    public String na() throws IOException {
        Map.Entry<String, Object> entryPeekLast = this.f306993a.peekLast();
        if (entryPeekLast != null && entryPeekLast.getKey() != null) {
            return entryPeekLast.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.y3
    public boolean nextBoolean() throws IOException {
        Boolean bool = (Boolean) a();
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IOException("Expected boolean");
    }

    @Override // io.sentry.y3
    public double nextDouble() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return ((Number) objA).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.y3
    public float nextFloat() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return ((Number) objA).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.y3
    public int nextInt() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return ((Number) objA).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.y3
    public long nextLong() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return ((Number) objA).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> List<T> p8(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.c.NULL) {
            a7();
            return null;
        }
        try {
            J0();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(a2Var.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.a(y7.WARNING, "Failed to deserialize object in list.", e10);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.c.BEGIN_OBJECT);
            }
            F0();
            return arrayList;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.y3
    @NotNull
    public io.sentry.vendor.gson.stream.c peek() throws IOException {
        Map.Entry<String, Object> entryPeekLast;
        if (!this.f306993a.isEmpty() && (entryPeekLast = this.f306993a.peekLast()) != null) {
            if (entryPeekLast.getKey() != null) {
                return io.sentry.vendor.gson.stream.c.NAME;
            }
            Object value = entryPeekLast.getValue();
            if (value instanceof Map) {
                return io.sentry.vendor.gson.stream.c.BEGIN_OBJECT;
            }
            if (value instanceof List) {
                return io.sentry.vendor.gson.stream.c.BEGIN_ARRAY;
            }
            if (value instanceof String) {
                return io.sentry.vendor.gson.stream.c.STRING;
            }
            if (value instanceof Number) {
                return io.sentry.vendor.gson.stream.c.NUMBER;
            }
            if (value instanceof Boolean) {
                return io.sentry.vendor.gson.stream.c.BOOLEAN;
            }
            return value instanceof io.sentry.vendor.gson.stream.c ? (io.sentry.vendor.gson.stream.c) value : io.sentry.vendor.gson.stream.c.END_DOCUMENT;
        }
        return io.sentry.vendor.gson.stream.c.END_DOCUMENT;
    }

    @Override // io.sentry.y3
    @Nullable
    public Integer rc() throws IOException {
        Object objA = a();
        if (objA instanceof Number) {
            return Integer.valueOf(((Number) objA).intValue());
        }
        return null;
    }

    @Override // io.sentry.y3
    @Nullable
    public Object re() throws IOException {
        return a();
    }

    @Override // io.sentry.y3
    @Nullable
    public Date z3(@NotNull ILogger iLogger) throws IOException {
        return y3.P4(n6(), iLogger);
    }
}
