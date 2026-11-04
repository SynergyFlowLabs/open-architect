package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    public interface a {
        void a(Context context, String[] abis, String mappedLibraryName, File destination, f logger);
    }

    public interface b {
        String a(String mappedLibraryName);

        String[] b();

        void c(String libraryPath);

        void d(String libraryName);

        String e(String libraryName);
    }

    public interface c {
        void a(Throwable t10);

        void b();
    }

    public interface d {
        void a(String message);
    }

    private e() {
    }

    public static f a() {
        return new f().c();
    }

    public static void b(final Context context, final String library) {
        e(context, library, null, null);
    }

    public static void c(final Context context, final String library, final c listener) {
        e(context, library, null, listener);
    }

    public static void d(final Context context, final String library, final String version) {
        e(context, library, version, null);
    }

    public static void e(final Context context, final String library, final String version, final c listener) {
        new f().i(context, library, version, listener);
    }

    public static f f(final d logger) {
        return new f().k(logger);
    }

    public static f g() {
        return new f().n();
    }
}
