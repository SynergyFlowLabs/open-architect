package androidx.datastore.preferences.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,361:1\n1#2:362\n1179#3,2:363\n1253#3,4:365\n13579#4,2:369\n167#5,3:371\n*S KotlinDebug\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n*L\n158#1:363,2\n158#1:365,4\n250#1:369,2\n283#1:371,3\n*E\n"})
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<f.a<?>, Object> f49861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f49862b;

    static final class a extends l0 implements Function1<Map.Entry<f.a<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49863a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull Map.Entry<f.a<?>, Object> entry) {
            String strValueOf;
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                int i10 = 3 >> 0;
                strValueOf = ArraysKt.joinToString$default((byte[]) value, (CharSequence) ", ", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else {
                strValueOf = String.valueOf(entry.getValue());
            }
            return "  " + entry.getKey().a() + " = " + strValueOf;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.core.f
    @NotNull
    public Map<f.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry<f.a<?>, Object>> setEntrySet = this.f49861a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return androidx.datastore.preferences.core.a.b(linkedHashMap);
    }

    @Override // androidx.datastore.preferences.core.f
    public <T> boolean b(@NotNull f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49861a.containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.core.f
    @Nullable
    public <T> T c(@NotNull f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this.f49861a.get(key);
        if (!(t10 instanceof byte[])) {
            return t10;
        }
        byte[] bArr = (byte[]) t10;
        T t11 = (T) Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(t11, "copyOf(this, size)");
        return t11;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    public boolean equals(@Nullable Object obj) {
        boolean zAreEqual;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map<f.a<?>, Object> map = cVar.f49861a;
        if (map == this.f49861a) {
            return true;
        }
        if (map.size() != this.f49861a.size()) {
            return false;
        }
        Map<f.a<?>, Object> map2 = cVar.f49861a;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<f.a<?>, Object> entry : map2.entrySet()) {
            Object obj2 = this.f49861a.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zAreEqual = Intrinsics.areEqual(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    zAreEqual = true;
                } else {
                    zAreEqual = false;
                }
            } else {
                zAreEqual = false;
            }
            if (!zAreEqual) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (this.f49862b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void g() {
        f();
        this.f49861a.clear();
    }

    public final void h() {
        this.f49862b.b(true);
    }

    public int hashCode() {
        Iterator<T> it = this.f49861a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    @NotNull
    public final Map<f.a<?>, Object> i() {
        return this.f49861a;
    }

    public final void j(@NotNull f.a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f();
        n(key);
    }

    public final void k(@NotNull f.b<?> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        f();
        m(pair);
    }

    public final void l(@NotNull f prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        f();
        this.f49861a.putAll(prefs.a());
    }

    public final void m(@NotNull f.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        f();
        for (f.b<?> bVar : pairs) {
            p(bVar.a(), bVar.b());
        }
    }

    public final <T> T n(@NotNull f.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f();
        return (T) this.f49861a.remove(key);
    }

    public final <T> void o(@NotNull f.a<T> key, T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        p(key, t10);
    }

    public final void p(@NotNull f.a<?> key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        f();
        if (obj == null) {
            n(key);
            return;
        }
        if (obj instanceof Set) {
            this.f49861a.put(key, androidx.datastore.preferences.core.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f49861a.put(key, obj);
            return;
        }
        Map<f.a<?>, Object> map = this.f49861a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.f49861a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f49863a, 24, null);
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public c(@NotNull Map<f.a<?>, Object> preferencesMap, boolean z10) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f49861a = preferencesMap;
        this.f49862b = new b(z10);
    }
}
