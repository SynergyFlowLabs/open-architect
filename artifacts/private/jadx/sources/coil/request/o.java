package coil.request;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Collections.kt\ncoil/util/-Collections\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,138:1\n462#2:139\n412#2:140\n1246#3,4:141\n72#4,8:145\n126#5:153\n153#5,3:154\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n*L\n44#1:139\n44#1:140\n44#1:141,4\n53#1:145,8\n59#1:153\n59#1:154,3\n*E\n"})
public final class o implements Iterable<Pair<? extends String, ? extends c>>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f87734b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f87735c = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, c> f87736a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Object f87738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f87739b;

        public c(@Nullable Object obj, @Nullable String str) {
            this.f87738a = obj;
            this.f87739b = str;
        }

        @Nullable
        public final String a() {
            return this.f87739b;
        }

        @Nullable
        public final Object b() {
            return this.f87738a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (Intrinsics.areEqual(this.f87738a, cVar.f87738a) && Intrinsics.areEqual(this.f87739b, cVar.f87739b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f87738a;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f87739b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Entry(value=" + this.f87738a + ", memoryCacheKey=" + this.f87739b + ')';
        }
    }

    public /* synthetic */ o(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @Nullable
    public final c d(@NotNull String str) {
        return this.f87736a.get(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.areEqual(this.f87736a, ((o) obj).f87736a);
    }

    public int hashCode() {
        return this.f87736a.hashCode();
    }

    @Nullable
    public final String i(@NotNull String str) {
        c cVar = this.f87736a.get(str);
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    public final boolean isEmpty() {
        return this.f87736a.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends c>> iterator() {
        Map<String, c> map = this.f87736a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public final Map<String, String> k() {
        if (isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<String, c> map = this.f87736a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, c> entry : map.entrySet()) {
            String strA = entry.getValue().a();
            if (strA != null) {
                linkedHashMap.put(entry.getKey(), strA);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final a l() {
        return new a(this);
    }

    @Nullable
    public final <T> T m(@NotNull String str) {
        c cVar = this.f87736a.get(str);
        if (cVar != null) {
            return (T) cVar.b();
        }
        return null;
    }

    @NotNull
    public final Map<String, Object> n() {
        if (isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<String, c> map = this.f87736a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((c) entry.getValue()).b());
        }
        return linkedHashMap;
    }

    @oj.i(name = "size")
    public final int size() {
        return this.f87736a.size();
    }

    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.f87736a + ')';
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, c> f87737a;

        public a() {
            this.f87737a = new LinkedHashMap();
        }

        public static /* synthetic */ a e(a aVar, String str, Object obj, String str2, int i10, Object obj2) {
            if ((i10 & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return aVar.d(str, obj, str2);
        }

        @NotNull
        public final o a() {
            return new o(coil.util.c.h(this.f87737a), null);
        }

        @NotNull
        public final a b(@NotNull String str) {
            this.f87737a.remove(str);
            return this;
        }

        @oj.j
        @NotNull
        public final a c(@NotNull String str, @Nullable Object obj) {
            return e(this, str, obj, null, 4, null);
        }

        @oj.j
        @NotNull
        public final a d(@NotNull String str, @Nullable Object obj, @Nullable String str2) {
            this.f87737a.put(str, new c(obj, str2));
            return this;
        }

        public a(@NotNull o oVar) {
            this.f87737a = MapsKt.toMutableMap(oVar.f87736a);
        }
    }

    private o(Map<String, c> map) {
        this.f87736a = map;
    }

    public o() {
        this(MapsKt.emptyMap());
    }
}
