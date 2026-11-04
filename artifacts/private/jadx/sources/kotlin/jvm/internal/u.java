package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1567#2:206\n1598#2,4:207\n1261#2,4:211\n1246#2,4:217\n462#3:215\n412#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class u implements kotlin.reflect.d<Object>, t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f312814b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<Class<? extends kotlin.x<?>>, Integer> f312815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, String> f312816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, String> f312817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, String> f312818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Map<String, String> f312819g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f312820a;

    @SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a(@NotNull Class<?> jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String canonicalName = (String) u.f312818f.get(jClass.getName());
                    if (canonicalName == null) {
                        canonicalName = jClass.getCanonicalName();
                    }
                    return canonicalName;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) u.f312818f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? kotlinx.serialization.internal.w.f316037a : str2;
            }
            return null;
        }

        @Nullable
        public final String b(@NotNull Class<?> jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) u.f312819g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) u.f312819g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.checkNotNull(simpleName);
                String strP5 = StringsKt.p5(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strP5 != null) {
                    return strP5;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.checkNotNull(simpleName);
                return StringsKt.o5(simpleName, '$', null, 2, null);
            }
            Intrinsics.checkNotNull(simpleName);
            return StringsKt.p5(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(@Nullable Object obj, @NotNull Class<?> jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = u.f312815c;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return r1.B(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = oj.b.g(oj.b.i(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listListOf = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, pj.n.class, pj.o.class, pj.p.class, pj.q.class, pj.r.class, pj.s.class, pj.t.class, pj.a.class, pj.b.class, pj.c.class, pj.d.class, pj.e.class, pj.f.class, pj.g.class, pj.h.class, pj.i.class, pj.j.class, pj.k.class, pj.l.class, pj.m.class});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        int i10 = 0;
        for (Object obj : listListOf) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f312815c = MapsKt.toMap(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put(io.sentry.profilemeasurements.a.f306070m, "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f312816d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f312817e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(str);
            sb2.append(StringsKt.s5(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            Pair pair = TuplesKt.to(sb2.toString(), str + ".Companion");
            map3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<Class<? extends kotlin.x<?>>, Integer> entry : f312815c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f312818f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), StringsKt.s5((String) entry2.getValue(), '.', null, 2, null));
        }
        f312819g = linkedHashMap;
    }

    public u(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f312820a = jClass;
    }

    @kotlin.e1(version = "1.3")
    public static /* synthetic */ void D() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void F() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void H() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void I() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void L() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void N() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void O() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void R() {
    }

    @kotlin.e1(version = "1.4")
    public static /* synthetic */ void S() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void U() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void V() {
    }

    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static /* synthetic */ void X() {
    }

    @kotlin.e1(version = "1.5")
    public static /* synthetic */ void Y() {
    }

    private final Void t() {
        throw new oj.r();
    }

    @Override // kotlin.reflect.d
    @NotNull
    public List<kotlin.reflect.d<? extends Object>> B() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    @Nullable
    public Object C() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean E() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean G() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    @kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public boolean K(@Nullable Object obj) {
        return f312814b.c(obj, l());
    }

    @Override // kotlin.reflect.d
    public boolean M() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean P() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    @Nullable
    public String Q() {
        return f312814b.b(l());
    }

    @Override // kotlin.reflect.d
    @NotNull
    public List<kotlin.reflect.s> T() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean W() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof u) && Intrinsics.areEqual(oj.b.g(this), oj.b.g((kotlin.reflect.d) obj));
    }

    @Override // kotlin.reflect.d, kotlin.reflect.h
    @NotNull
    public Collection<kotlin.reflect.c<?>> f() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.b
    @NotNull
    public List<Annotation> getAnnotations() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    @NotNull
    public List<kotlin.reflect.t> getTypeParameters() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    @Nullable
    public kotlin.reflect.v getVisibility() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return oj.b.g(this).hashCode();
    }

    @Override // kotlin.reflect.d
    public boolean i() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean isAbstract() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean isFinal() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.jvm.internal.t
    @NotNull
    public Class<?> l() {
        return this.f312820a;
    }

    @Override // kotlin.reflect.d
    @Nullable
    public String m() {
        return f312814b.a(l());
    }

    @NotNull
    public String toString() {
        return l().toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.d
    @NotNull
    public Collection<kotlin.reflect.d<?>> y() {
        t();
        throw new kotlin.a0();
    }

    @Override // kotlin.reflect.d
    @NotNull
    public Collection<kotlin.reflect.i<Object>> z() {
        t();
        throw new kotlin.a0();
    }
}
