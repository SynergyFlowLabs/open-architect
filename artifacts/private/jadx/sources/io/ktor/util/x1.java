package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class x1 implements o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f296823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f296824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<String> f296825f;

    public static final class a implements Map.Entry<String, List<? extends String>>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f296826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f296827b;

        a(x1 x1Var) {
            this.f296826a = x1Var.a();
            this.f296827b = x1Var.f();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return this.f296826a;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getValue() {
            return this.f296827b;
        }

        public List<String> c(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getValue().hashCode() ^ getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return getKey() + '=' + getValue();
        }
    }

    public x1(boolean z10, @NotNull String name, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f296823d = z10;
        this.f296824e = name;
        this.f296825f = values;
    }

    @NotNull
    public final String a() {
        return this.f296824e;
    }

    @Override // io.ktor.util.o1
    @Nullable
    public List<String> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt.N1(this.f296824e, name, c())) {
            return this.f296825f;
        }
        return null;
    }

    @Override // io.ktor.util.o1
    public boolean c() {
        return this.f296823d;
    }

    @Override // io.ktor.util.o1
    public boolean contains(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.N1(name, this.f296824e, c());
    }

    @Override // io.ktor.util.o1
    public boolean d(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return StringsKt.N1(name, this.f296824e, c()) && this.f296825f.contains(value);
    }

    @Override // io.ktor.util.o1
    public void e(@NotNull Function2<? super String, ? super List<String>, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        body.invoke(this.f296824e, this.f296825f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (c() != o1Var.c()) {
            return false;
        }
        return w1.k(k(), o1Var.k());
    }

    @NotNull
    public final List<String> f() {
        return this.f296825f;
    }

    @Override // io.ktor.util.o1
    @Nullable
    public String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt.N1(name, this.f296824e, c())) {
            return (String) CollectionsKt.firstOrNull((List) this.f296825f);
        }
        return null;
    }

    public int hashCode() {
        return w1.l(k(), Boolean.hashCode(c()) * 31);
    }

    @Override // io.ktor.util.o1
    public boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<Map.Entry<String, List<String>>> k() {
        return SetsKt.setOf(new a(this));
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<String> names() {
        return SetsKt.setOf(this.f296824e);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StringValues(case=");
        sb2.append(!c());
        sb2.append(") ");
        sb2.append(k());
        return sb2.toString();
    }
}
