package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f122003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f122004b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f122005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f122006b = null;

        b(String str) {
            this.f122005a = str;
        }

        @NonNull
        public d a() {
            return new d(this.f122005a, this.f122006b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f122006b)));
        }

        @NonNull
        public <T extends Annotation> b b(@NonNull T t10) {
            if (this.f122006b == null) {
                this.f122006b = new HashMap();
            }
            this.f122006b.put(t10.annotationType(), t10);
            return this;
        }
    }

    @NonNull
    public static b a(@NonNull String str) {
        return new b(str);
    }

    @NonNull
    public static d d(@NonNull String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    @NonNull
    public String b() {
        return this.f122003a;
    }

    @p0
    public <T extends Annotation> T c(@NonNull Class<T> cls) {
        return (T) this.f122004b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f122003a.equals(dVar.f122003a) && this.f122004b.equals(dVar.f122004b);
    }

    public int hashCode() {
        return (this.f122003a.hashCode() * 31) + this.f122004b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f122003a + ", properties=" + this.f122004b.values() + "}";
    }

    private d(String str, Map<Class<?>, Object> map) {
        this.f122003a = str;
        this.f122004b = map;
    }
}
