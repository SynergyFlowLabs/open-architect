package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nUrlDecodedParametersBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1563#2:89\n1634#2,3:90\n1563#2:93\n1634#2,3:94\n1563#2:97\n1634#2,3:98\n1563#2:101\n1634#2,3:102\n*S KotlinDebug\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilder\n*L\n18#1:89\n18#1:90,3\n26#1:93\n26#1:94,3\n44#1:97\n44#1:98,3\n50#1:101\n50#1:102,3\n*E\n"})
public final class f3 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y1 f295847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f295848b;

    public f3(@NotNull y1 encodedParametersBuilder) {
        Intrinsics.checkNotNullParameter(encodedParametersBuilder, "encodedParametersBuilder");
        this.f295847a = encodedParametersBuilder;
        this.f295848b = encodedParametersBuilder.c();
    }

    @Override // io.ktor.util.p1
    public void a(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 6 ^ 1;
        this.f295847a.a(h.n(name, false, 1, null), h.p(value));
    }

    @Override // io.ktor.util.p1
    @Nullable
    public List<String> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> listB = this.f295847a.b(h.n(name, false, 1, null));
        if (listB == null) {
            return null;
        }
        List<String> list = listB;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h.k((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // io.ktor.util.p1
    public boolean c() {
        return this.f295848b;
    }

    @Override // io.ktor.util.p1
    public void clear() {
        this.f295847a.clear();
    }

    @Override // io.ktor.util.p1
    public boolean contains(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f295847a.contains(h.n(name, false, 1, null));
    }

    @Override // io.ktor.util.p1
    public boolean d(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f295847a.d(h.n(name, false, 1, null), h.p(value));
    }

    @Override // io.ktor.util.p1
    public void e(@NotNull io.ktor.util.o1 stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        this.f295847a.e(g3.e(stringValues).build());
    }

    @Override // io.ktor.util.p1
    public boolean f(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f295847a.f(h.n(name, false, 1, null), h.p(value));
    }

    @Override // io.ktor.util.p1
    public void g(@NotNull String name, @NotNull Iterable<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        y1 y1Var = this.f295847a;
        String strN = h.n(name, false, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(h.p(it.next()));
        }
        y1Var.g(strN, arrayList);
    }

    @Override // io.ktor.util.p1
    @Nullable
    public String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = this.f295847a.get(h.n(name, false, 1, null));
        if (str != null) {
            return h.k(str, 0, 0, true, null, 11, null);
        }
        return null;
    }

    @Override // io.ktor.util.p1
    public void h() {
        this.f295847a.h();
    }

    @Override // io.ktor.util.p1
    public void i(@NotNull String name, @NotNull Iterable<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        y1 y1Var = this.f295847a;
        String strN = h.n(name, false, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(h.p(it.next()));
        }
        y1Var.i(strN, arrayList);
    }

    @Override // io.ktor.util.p1
    public boolean isEmpty() {
        return this.f295847a.isEmpty();
    }

    @Override // io.ktor.util.p1
    public void j(@NotNull io.ktor.util.o1 stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        g3.c(this.f295847a, stringValues);
    }

    @Override // io.ktor.util.p1
    @NotNull
    public Set<Map.Entry<String, List<String>>> k() {
        return g3.d(this.f295847a).k();
    }

    @Override // io.ktor.util.p1
    public void l(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f295847a.l(h.n(name, false, 1, null), h.p(value));
    }

    @Override // io.ktor.util.p1
    @NotNull
    public Set<String> names() {
        Set<String> setNames = this.f295847a.names();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setNames, 10));
        Iterator<T> it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(h.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Override // io.ktor.util.p1
    public void remove(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f295847a.remove(h.n(name, false, 1, null));
    }

    @Override // io.ktor.util.p1
    @NotNull
    public x1 build() {
        return g3.d(this.f295847a);
    }
}
