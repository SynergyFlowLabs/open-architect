package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface y3 extends Closeable {
    @Nullable
    static Date P4(@Nullable String str, @NotNull ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return p.f(str);
            } catch (Exception unused) {
                return p.g(str);
            }
        } catch (Exception e10) {
            iLogger.a(y7.ERROR, "Error when deserializing millis timestamp format.", e10);
            return null;
        }
    }

    @Nullable
    TimeZone B9(ILogger iLogger) throws IOException;

    void C1(boolean z10);

    void F0() throws IOException;

    void F1() throws IOException;

    @Nullable
    Float F7() throws IOException;

    @Nullable
    Long Gc() throws IOException;

    void J0() throws IOException;

    @Nullable
    Boolean J3() throws IOException;

    @Nullable
    <T> Map<String, List<T>> U5(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException;

    void a7() throws IOException;

    void a9() throws IOException;

    @Nullable
    <T> Map<String, T> fd(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException;

    void gd(ILogger iLogger, Map<String, Object> map, String str);

    boolean hasNext() throws IOException;

    @Nullable
    <T> T i4(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws Exception;

    @Nullable
    Double ia() throws IOException;

    String jc() throws IOException;

    void m1() throws IOException;

    @Nullable
    String n6() throws IOException;

    @NotNull
    String na() throws IOException;

    boolean nextBoolean() throws IOException;

    double nextDouble() throws IOException;

    float nextFloat() throws IOException;

    int nextInt() throws IOException;

    long nextLong() throws IOException;

    @Nullable
    <T> List<T> p8(@NotNull ILogger iLogger, @NotNull a2<T> a2Var) throws IOException;

    @NotNull
    io.sentry.vendor.gson.stream.c peek() throws IOException;

    @Nullable
    Integer rc() throws IOException;

    @Nullable
    Object re() throws IOException;

    @Nullable
    Date z3(ILogger iLogger) throws IOException;
}
