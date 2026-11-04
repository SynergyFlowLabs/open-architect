package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.k2;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
public final class x implements z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    final Map<String, Object> f306994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    final ArrayDeque<Object> f306995b;

    public x(@NotNull Map<String, Object> map) {
        this.f306994a = map;
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        this.f306995b = arrayDeque;
        arrayDeque.addLast(map);
    }

    @NotNull
    private Map<String, Object> s() {
        Object objPeekLast = this.f306995b.peekLast();
        if (objPeekLast == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        if (objPeekLast instanceof Map) {
            return (Map) objPeekLast;
        }
        throw new IllegalStateException("Stack element is not a Map.");
    }

    private void t(@Nullable Object obj) {
        Object objPeekLast = this.f306995b.peekLast();
        if (objPeekLast instanceof List) {
            ((List) objPeekLast).add(obj);
        } else {
            if (!(objPeekLast instanceof String)) {
                throw new IllegalStateException("Invalid stack state, expected array or string on top");
            }
            s().put((String) this.f306995b.removeLast(), obj);
        }
    }

    private void u(@NotNull ILogger iLogger, @NotNull Collection<?> collection) throws IOException {
        J0();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            j(iLogger, it.next());
        }
        F0();
    }

    private void v(@NotNull ILogger iLogger, @NotNull Date date) throws IOException {
        try {
            b(io.sentry.p.h(date));
        } catch (Exception e10) {
            iLogger.a(y7.ERROR, "Error when serializing Date", e10);
            l();
        }
    }

    private void w(@NotNull ILogger iLogger, @NotNull Map<?, ?> map) throws IOException {
        m1();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                f((String) obj);
                j(iLogger, map.get(obj));
            }
        }
        F1();
    }

    private void x(@NotNull ILogger iLogger, @NotNull TimeZone timeZone) throws IOException {
        try {
            b(timeZone.getID());
        } catch (Exception e10) {
            iLogger.a(y7.ERROR, "Error when serializing TimeZone", e10);
            l();
        }
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public x j(@NotNull ILogger iLogger, @Nullable Object obj) throws IOException {
        if (obj == null) {
            l();
            return this;
        }
        if (obj instanceof Character) {
            b(Character.toString(((Character) obj).charValue()));
            return this;
        }
        if (obj instanceof String) {
            b((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            e(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Number) {
            i((Number) obj);
            return this;
        }
        if (obj instanceof Date) {
            v(iLogger, (Date) obj);
            return this;
        }
        if (obj instanceof TimeZone) {
            x(iLogger, (TimeZone) obj);
            return this;
        }
        if (obj instanceof k2) {
            ((k2) obj).serialize(this, iLogger);
            return this;
        }
        if (obj instanceof Collection) {
            u(iLogger, (Collection) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            u(iLogger, Arrays.asList((Object[]) obj));
            return this;
        }
        if (obj instanceof Map) {
            w(iLogger, (Map) obj);
            return this;
        }
        if (obj instanceof Locale) {
            b(obj.toString());
            return this;
        }
        if (obj instanceof AtomicIntegerArray) {
            u(iLogger, r.a((AtomicIntegerArray) obj));
            return this;
        }
        if (obj instanceof AtomicBoolean) {
            e(((AtomicBoolean) obj).get());
            return this;
        }
        if (obj instanceof URI) {
            b(obj.toString());
            return this;
        }
        if (obj instanceof InetAddress) {
            b(obj.toString());
            return this;
        }
        if (obj instanceof UUID) {
            b(obj.toString());
            return this;
        }
        if (obj instanceof Currency) {
            b(obj.toString());
            return this;
        }
        if (obj instanceof Calendar) {
            w(iLogger, r.c((Calendar) obj));
            return this;
        }
        if (obj.getClass().isEnum()) {
            b(obj.toString());
            return this;
        }
        iLogger.c(y7.WARNING, "Failed serializing unknown object.", obj);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public x k(@Nullable Boolean bool) throws IOException {
        t(bool);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public x i(@Nullable Number number) throws IOException {
        t(number);
        return this;
    }

    @Override // io.sentry.z3
    public void C1(boolean z10) {
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public x b(@Nullable String str) throws IOException {
        t(str);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public x e(boolean z10) throws IOException {
        t(Boolean.valueOf(z10));
        return this;
    }

    @Override // io.sentry.z3
    @Nullable
    public String a() {
        return null;
    }

    @Override // io.sentry.z3
    public z3 g(@Nullable String str) throws IOException {
        return this;
    }

    @Override // io.sentry.z3
    public void h(@Nullable String str) {
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public x J0() throws IOException {
        this.f306995b.add(new ArrayList());
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public x m1() throws IOException {
        this.f306995b.addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public x F0() throws IOException {
        F1();
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public x F1() throws IOException {
        t(this.f306995b.removeLast());
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public x f(@NotNull String str) throws IOException {
        this.f306995b.add(str);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public x l() throws IOException {
        t(null);
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public x d(double d10) throws IOException {
        t(Double.valueOf(d10));
        return this;
    }

    @Override // io.sentry.z3
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public x c(long j10) throws IOException {
        t(Long.valueOf(j10));
        return this;
    }
}
