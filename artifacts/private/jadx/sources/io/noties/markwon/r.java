package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f297682a;

    r(@NonNull String str) {
        this.f297682a = str;
    }

    @NonNull
    public static <T> r<T> e(@NonNull Class<T> cls, @NonNull String str) {
        return new r<>(str);
    }

    @NonNull
    public static <T> r<T> f(@NonNull String str) {
        return new r<>(str);
    }

    public void a(@NonNull u uVar) {
        uVar.d(this);
    }

    @p0
    public T b(@NonNull u uVar) {
        return (T) uVar.c(this);
    }

    @NonNull
    public T c(@NonNull u uVar, @NonNull T t10) {
        return (T) uVar.a(this, t10);
    }

    @NonNull
    public String d() {
        return this.f297682a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f297682a.equals(((r) obj).f297682a);
        }
        return false;
    }

    @NonNull
    public T g(@NonNull u uVar) {
        T tB = b(uVar);
        if (tB != null) {
            return tB;
        }
        throw new NullPointerException(this.f297682a);
    }

    public void h(@NonNull u uVar, @p0 T t10) {
        uVar.b(this, t10);
    }

    public int hashCode() {
        return this.f297682a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f297682a + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
