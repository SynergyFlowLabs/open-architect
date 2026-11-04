package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class g2 implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.vendor.gson.stream.a f305449a;

    public g2(Reader reader) {
        this.f305449a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.y3
    @Nullable
    public TimeZone B9(ILogger iLogger) throws IOException {
        if (this.f305449a.peek() == io.sentry.vendor.gson.stream.c.NULL) {
            this.f305449a.a7();
            return null;
        }
        try {
            return TimeZone.getTimeZone(this.f305449a.jc());
        } catch (Exception e10) {
            iLogger.a(y7.ERROR, "Error when deserializing TimeZone", e10);
            return null;
        }
    }

    @Override // io.sentry.y3
    public void C1(boolean z10) {
        this.f305449a.C1(z10);
    }

    @Override // io.sentry.y3
    public void F0() throws IOException {
        this.f305449a.F0();
    }

    @Override // io.sentry.y3
    public void F1() throws IOException {
        this.f305449a.F1();
    }

    @Override // io.sentry.y3
    @Nullable
    public Float F7() throws IOException {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.f305449a.a7();
        return null;
    }

    @Override // io.sentry.y3
    @Nullable
    public Long Gc() throws IOException {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return Long.valueOf(this.f305449a.nextLong());
        }
        this.f305449a.a7();
        return null;
    }

    @Override // io.sentry.y3
    public void J0() throws IOException {
        this.f305449a.J0();
    }

    @Override // io.sentry.y3
    @Nullable
    public Boolean J3() throws IOException {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return Boolean.valueOf(this.f305449a.nextBoolean());
        }
        this.f305449a.a7();
        return null;
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> Map<String, List<T>> U5(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.c.NULL) {
            a7();
            return null;
        }
        HashMap map = new HashMap();
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
    }

    @Override // io.sentry.y3
    public void a7() throws IOException {
        this.f305449a.a7();
    }

    @Override // io.sentry.y3
    public void a9() throws IOException {
        this.f305449a.a9();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f305449a.close();
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> Map<String, T> fd(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException {
        if (this.f305449a.peek() == io.sentry.vendor.gson.stream.c.NULL) {
            this.f305449a.a7();
            return null;
        }
        this.f305449a.m1();
        HashMap map = new HashMap();
        if (this.f305449a.hasNext()) {
            while (true) {
                try {
                    map.put(this.f305449a.na(), a2Var.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.a(y7.WARNING, "Failed to deserialize object in map.", e10);
                }
                if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.BEGIN_OBJECT && this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NAME) {
                    break;
                }
            }
        }
        this.f305449a.F1();
        return map;
    }

    @Override // io.sentry.y3
    public void gd(ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, re());
        } catch (Exception e10) {
            iLogger.b(y7.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.y3
    public boolean hasNext() throws IOException {
        return this.f305449a.hasNext();
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> T i4(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws Exception {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return a2Var.a(this, iLogger);
        }
        this.f305449a.a7();
        return null;
    }

    @Override // io.sentry.y3
    @Nullable
    public Double ia() throws IOException {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return Double.valueOf(this.f305449a.nextDouble());
        }
        this.f305449a.a7();
        return null;
    }

    @Override // io.sentry.y3
    public String jc() throws IOException {
        return this.f305449a.jc();
    }

    @Override // io.sentry.y3
    public void m1() throws IOException {
        this.f305449a.m1();
    }

    @Override // io.sentry.y3
    @Nullable
    public String n6() throws IOException {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return this.f305449a.jc();
        }
        this.f305449a.a7();
        return null;
    }

    @Override // io.sentry.y3
    @NotNull
    public String na() throws IOException {
        return this.f305449a.na();
    }

    @Override // io.sentry.y3
    public boolean nextBoolean() throws IOException {
        return this.f305449a.nextBoolean();
    }

    @Override // io.sentry.y3
    public double nextDouble() throws IOException {
        return this.f305449a.nextDouble();
    }

    @Override // io.sentry.y3
    public float nextFloat() throws IOException {
        return (float) this.f305449a.nextDouble();
    }

    @Override // io.sentry.y3
    public int nextInt() throws IOException {
        return this.f305449a.nextInt();
    }

    @Override // io.sentry.y3
    public long nextLong() throws IOException {
        return this.f305449a.nextLong();
    }

    @Override // io.sentry.y3
    @Nullable
    public <T> List<T> p8(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException {
        if (this.f305449a.peek() == io.sentry.vendor.gson.stream.c.NULL) {
            this.f305449a.a7();
            return null;
        }
        this.f305449a.J0();
        ArrayList arrayList = new ArrayList();
        if (this.f305449a.hasNext()) {
            do {
                try {
                    arrayList.add(a2Var.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.a(y7.WARNING, "Failed to deserialize object in list.", e10);
                }
            } while (this.f305449a.peek() == io.sentry.vendor.gson.stream.c.BEGIN_OBJECT);
        }
        this.f305449a.F0();
        return arrayList;
    }

    @Override // io.sentry.y3
    @NotNull
    public io.sentry.vendor.gson.stream.c peek() throws IOException {
        return this.f305449a.peek();
    }

    @Override // io.sentry.y3
    @Nullable
    public Integer rc() throws IOException {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return Integer.valueOf(this.f305449a.nextInt());
        }
        this.f305449a.a7();
        return null;
    }

    @Override // io.sentry.y3
    @Nullable
    public Object re() throws IOException {
        return new f2().e(this);
    }

    @Override // io.sentry.y3
    @Nullable
    public Date z3(ILogger iLogger) throws IOException {
        if (this.f305449a.peek() != io.sentry.vendor.gson.stream.c.NULL) {
            return y3.P4(this.f305449a.jc(), iLogger);
        }
        this.f305449a.a7();
        return null;
    }
}
