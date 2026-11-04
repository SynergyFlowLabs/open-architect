package io.ktor.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,472:1\n216#2:473\n217#2:475\n1#3:474\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesImpl\n*L\n185#1:473\n185#1:475\n*E\n"})
public class t1 implements o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f296810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f296811e;

    /* JADX WARN: Multi-variable type inference failed */
    public t1() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final List<String> f(String str) {
        return this.f296811e.get(str);
    }

    @NotNull
    protected final Map<String, List<String>> a() {
        return this.f296811e;
    }

    @Override // io.ktor.util.o1
    @Nullable
    public List<String> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f(name);
    }

    @Override // io.ktor.util.o1
    public final boolean c() {
        return this.f296810d;
    }

    @Override // io.ktor.util.o1
    public boolean contains(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f(name) != null;
    }

    @Override // io.ktor.util.o1
    public boolean d(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        List<String> listF = f(name);
        if (listF != null) {
            return listF.contains(value);
        }
        return false;
    }

    @Override // io.ktor.util.o1
    public void e(@NotNull Function2<? super String, ? super List<String>, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        for (Map.Entry<String, List<String>> entry : this.f296811e.entrySet()) {
            body.invoke(entry.getKey(), entry.getValue());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f296810d != o1Var.c()) {
            return false;
        }
        return w1.k(k(), o1Var.k());
    }

    @Override // io.ktor.util.o1
    @Nullable
    public String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> listF = f(name);
        if (listF != null) {
            return (String) CollectionsKt.firstOrNull((List) listF);
        }
        return null;
    }

    public int hashCode() {
        return w1.l(k(), Boolean.hashCode(this.f296810d) * 31);
    }

    @Override // io.ktor.util.o1
    public boolean isEmpty() {
        return this.f296811e.isEmpty();
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<Map.Entry<String, List<String>>> k() {
        return w.a(this.f296811e.entrySet());
    }

    @Override // io.ktor.util.o1
    @NotNull
    public Set<String> names() {
        return w.a(this.f296811e.keySet());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StringValues(case=");
        sb2.append(!this.f296810d);
        sb2.append(") ");
        sb2.append(k());
        return sb2.toString();
    }

    public t1(boolean z10, @NotNull Map<String, ? extends List<String>> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f296810d = z10;
        Map mapA = z10 ? x.a() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(value.get(i10));
            }
            mapA.put(key, arrayList);
        }
        this.f296811e = mapA;
    }

    public /* synthetic */ t1(boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
