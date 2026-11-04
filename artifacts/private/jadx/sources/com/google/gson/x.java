package com.google.gson;

import com.google.gson.internal.i0;

/* JADX INFO: loaded from: classes5.dex */
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f125640a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f125641b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f125642c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f125643d = new d();

    class a implements x {
        a() {
        }

        @Override // com.google.gson.x
        public e a(Class<?> cls) {
            return i0.f(cls) ? e.BLOCK_INACCESSIBLE : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_INACCESSIBLE_JAVA";
        }
    }

    class b implements x {
        b() {
        }

        @Override // com.google.gson.x
        public e a(Class<?> cls) {
            return i0.f(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_JAVA";
        }
    }

    class c implements x {
        c() {
        }

        @Override // com.google.gson.x
        public e a(Class<?> cls) {
            return i0.c(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_ANDROID";
        }
    }

    class d implements x {
        d() {
        }

        @Override // com.google.gson.x
        public e a(Class<?> cls) {
            return i0.e(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_PLATFORM";
        }
    }

    public enum e {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    e a(Class<?> cls);
}
