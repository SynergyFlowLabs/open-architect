package io.ktor.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesBuilderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,472:1\n1869#2,2:473\n774#2:475\n865#2,2:476\n538#3:478\n523#3,6:479\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesBuilderImpl\n*L\n270#1:473,2\n278#1:475\n278#1:476,2\n286#1:478\n286#1:479,6\n*E\n"})
public class s1 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f296807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f296808b;

    /* JADX WARN: Multi-variable type inference failed */
    public s1() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(s1 s1Var, String name, List values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        s1Var.g(name, values);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(s1 s1Var, String name, List values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        s1Var.i(name, values);
        return Unit.f312394a;
    }

    private final List<String> q(String str) {
        List<String> list = this.f296808b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        s(str);
        this.f296808b.put(str, arrayList);
        return arrayList;
    }

    @Override // io.ktor.util.p1
    public void a(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        t(value);
        List<String> listQ = q(name);
        listQ.clear();
        listQ.add(value);
    }

    @Override // io.ktor.util.p1
    @Nullable
    public List<String> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f296808b.get(name);
    }

    @Override // io.ktor.util.p1
    @NotNull
    public o1 build() {
        return new t1(this.f296807a, this.f296808b);
    }

    @Override // io.ktor.util.p1
    public final boolean c() {
        return this.f296807a;
    }

    @Override // io.ktor.util.p1
    public void clear() {
        this.f296808b.clear();
    }

    @Override // io.ktor.util.p1
    public boolean contains(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f296808b.containsKey(name);
    }

    @Override // io.ktor.util.p1
    public boolean d(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        List<String> list = this.f296808b.get(name);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @Override // io.ktor.util.p1
    public void e(@NotNull o1 stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.e(new Function2() { // from class: io.ktor.util.q1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s1.p(this.f296797a, (String) obj, (List) obj2);
            }
        });
    }

    @Override // io.ktor.util.p1
    public boolean f(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        List<String> list = this.f296808b.get(name);
        if (list != null) {
            return list.remove(value);
        }
        return false;
    }

    @Override // io.ktor.util.p1
    public void g(@NotNull String name, @NotNull Iterable<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List<String> listQ = q(name);
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        CollectionsKt.addAll(listQ, values);
    }

    @Override // io.ktor.util.p1
    @Nullable
    public String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> listB = b(name);
        if (listB != null) {
            return (String) CollectionsKt.firstOrNull((List) listB);
        }
        return null;
    }

    @Override // io.ktor.util.p1
    public void h() {
        Map<String, List<String>> map = this.f296808b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            remove((String) ((Map.Entry) it.next()).getKey());
        }
    }

    @Override // io.ktor.util.p1
    public void i(@NotNull String name, @NotNull Iterable<String> values) {
        Set setEmptySet;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List<String> list = this.f296808b.get(name);
        if (list == null || (setEmptySet = CollectionsKt.toSet(list)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : values) {
            if (!setEmptySet.contains(str)) {
                arrayList.add(str);
            }
        }
        g(name, arrayList);
    }

    @Override // io.ktor.util.p1
    public boolean isEmpty() {
        return this.f296808b.isEmpty();
    }

    @Override // io.ktor.util.p1
    public void j(@NotNull o1 stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.e(new Function2() { // from class: io.ktor.util.r1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s1.o(this.f296804a, (String) obj, (List) obj2);
            }
        });
    }

    @Override // io.ktor.util.p1
    @NotNull
    public Set<Map.Entry<String, List<String>>> k() {
        return w.a(this.f296808b.entrySet());
    }

    @Override // io.ktor.util.p1
    public void l(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        t(value);
        q(name).add(value);
    }

    @Override // io.ktor.util.p1
    @NotNull
    public Set<String> names() {
        return this.f296808b.keySet();
    }

    @NotNull
    protected final Map<String, List<String>> r() {
        return this.f296808b;
    }

    @Override // io.ktor.util.p1
    public void remove(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f296808b.remove(name);
    }

    protected void s(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    protected void t(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public s1(boolean z10, int i10) {
        this.f296807a = z10;
        this.f296808b = z10 ? x.a() : new LinkedHashMap<>(i10);
    }

    public /* synthetic */ s1(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 8 : i10);
    }
}
