package io.sentry;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f305523b = "[OBJECT]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f305524a;

    public h2(int i10) {
        this.f305524a = new j2(i10);
    }

    private void b(@NotNull z3 z3Var, @NotNull ILogger iLogger, @NotNull Collection<?> collection) throws IOException {
        z3Var.J0();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            a(z3Var, iLogger, it.next());
        }
        z3Var.F0();
    }

    private void c(@NotNull z3 z3Var, @NotNull ILogger iLogger, @NotNull Date date) throws IOException {
        try {
            z3Var.b(p.h(date));
        } catch (Exception e10) {
            iLogger.a(y7.ERROR, "Error when serializing Date", e10);
            z3Var.l();
        }
    }

    private void d(@NotNull z3 z3Var, @NotNull ILogger iLogger, @NotNull Map<?, ?> map) throws IOException {
        z3Var.m1();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                z3Var.f((String) obj);
                a(z3Var, iLogger, map.get(obj));
            }
        }
        z3Var.F1();
    }

    private void e(@NotNull z3 z3Var, @NotNull ILogger iLogger, @NotNull TimeZone timeZone) throws IOException {
        try {
            z3Var.b(timeZone.getID());
        } catch (Exception e10) {
            iLogger.a(y7.ERROR, "Error when serializing TimeZone", e10);
            z3Var.l();
        }
    }

    public void a(@NotNull z3 z3Var, @NotNull ILogger iLogger, @Nullable Object obj) throws IOException {
        if (obj == null) {
            z3Var.l();
            return;
        }
        if (obj instanceof Character) {
            z3Var.b(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            z3Var.b((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            z3Var.e(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            z3Var.i((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(z3Var, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(z3Var, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof k2) {
            ((k2) obj).serialize(z3Var, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(z3Var, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            b(z3Var, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(z3Var, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            z3Var.b(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(z3Var, iLogger, io.sentry.util.r.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            z3Var.e(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            z3Var.b(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            z3Var.b(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            z3Var.b(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            z3Var.b(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(z3Var, iLogger, io.sentry.util.r.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            z3Var.b(obj.toString());
            return;
        }
        try {
            a(z3Var, iLogger, this.f305524a.d(obj, iLogger));
        } catch (Exception e10) {
            iLogger.a(y7.ERROR, "Failed serializing unknown object.", e10);
            z3Var.b(f305523b);
        }
    }
}
