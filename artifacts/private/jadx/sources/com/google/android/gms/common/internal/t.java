package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
@Deprecated
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f106637b = new m("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t f106638c = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f106639a = new ConcurrentHashMap();

    @androidx.annotation.l1
    protected t() {
    }

    @NonNull
    @g6.a
    public static t a() {
        return f106638c;
    }

    @NonNull
    @g6.a
    @Deprecated
    public String b(@NonNull String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        w.m(str, "Please provide a valid libraryName");
        if (this.f106639a.containsKey(str)) {
            return (String) this.f106639a.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = t.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        f106637b.l("LibraryVersion", str + " version is " + property);
                    } else {
                        f106637b.n("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                } catch (IOException e10) {
                    e = e10;
                    str2 = property;
                    inputStream = resourceAsStream;
                    f106637b.f("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    String str3 = str2;
                    resourceAsStream = inputStream;
                    property = str3;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        com.google.android.gms.common.util.q.b(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                str2 = null;
            }
            if (resourceAsStream != null) {
                com.google.android.gms.common.util.q.b(resourceAsStream);
            }
            if (property == null) {
                f106637b.c("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.f106639a.put(str, property);
            return property;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
