package io.sentry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Object> f305648a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f305649b;

    j2(int i10) {
        this.f305649b = i10;
    }

    @NotNull
    private List<Object> a(@NotNull Collection<?> collection, @NotNull ILogger iLogger) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), iLogger));
        }
        return arrayList;
    }

    @NotNull
    private List<Object> b(@NotNull Object[] objArr, @NotNull ILogger iLogger) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(d(obj, iLogger));
        }
        return arrayList;
    }

    @NotNull
    private Map<String, Object> c(@NotNull Map<?, ?> map, @NotNull ILogger iLogger) throws Exception {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), d(obj2, iLogger));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    @Nullable
    public Object d(@Nullable Object obj, @NotNull ILogger iLogger) throws Exception {
        Object string;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.r.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return io.sentry.util.r.c((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (this.f305648a.contains(obj)) {
                iLogger.c(y7.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            this.f305648a.add(obj);
            try {
                if (this.f305648a.size() > this.f305649b) {
                    this.f305648a.remove(obj);
                    iLogger.c(y7.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        string = b((Object[]) obj, iLogger);
                    } else if (obj instanceof Collection) {
                        string = a((Collection) obj, iLogger);
                    } else if (obj instanceof Map) {
                        string = c((Map) obj, iLogger);
                    } else {
                        Map<String, Object> mapE = e(obj, iLogger);
                        string = mapE.isEmpty() ? obj.toString() : mapE;
                    }
                    this.f305648a.remove(obj);
                    return string;
                } catch (Exception e10) {
                    iLogger.a(y7.INFO, "Not serializing object due to throwing sub-path.", e10);
                    this.f305648a.remove(obj);
                    return null;
                }
            } catch (Throwable th2) {
                this.f305648a.remove(obj);
                throw th2;
            }
        }
        return obj.toString();
    }

    @NotNull
    public Map<String, Object> e(@NotNull Object obj, @NotNull ILogger iLogger) throws Exception {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, d(field.get(obj), iLogger));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.c(y7.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return map;
    }
}
