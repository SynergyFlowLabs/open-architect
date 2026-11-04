package com.google.android.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static n f104745a;

    private static class a extends n {
        @Override // com.google.android.filament.n
        long b(Object obj) {
            return 0L;
        }

        @Override // com.google.android.filament.n
        void g(String str) {
            System.out.println(str);
        }

        @Override // com.google.android.filament.n
        boolean h(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.n
        boolean i(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.n
        boolean j(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.n
        void k(String str) {
            System.out.println(str);
        }

        private a() {
        }
    }

    n() {
    }

    @NonNull
    static n a() {
        if (f104745a == null) {
            try {
                if (c()) {
                    f104745a = (n) Class.forName("com.google.android.filament.b").newInstance();
                } else {
                    f104745a = (n) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
                }
            } catch (Exception unused) {
            }
            if (f104745a == null) {
                f104745a = new a();
            }
        }
        return f104745a;
    }

    static boolean c() {
        return "The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"));
    }

    static boolean d() {
        return System.getProperty("os.name").contains("Linux") && !c();
    }

    static boolean e() {
        return System.getProperty("os.name").contains("Mac OS X");
    }

    static boolean f() {
        return System.getProperty("os.name").contains("Windows");
    }

    abstract long b(Object obj);

    abstract void g(String str);

    abstract boolean h(Object obj);

    abstract boolean i(Object obj);

    abstract boolean j(Object obj);

    abstract void k(String str);
}
