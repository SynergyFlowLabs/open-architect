package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.k0;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1557#3:232\n1628#3,3:233\n1557#3:236\n1628#3,3:237\n1557#3:240\n1628#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class a0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312975a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f312975a = iArr;
        }
    }

    /* synthetic */ class b extends g0 implements Function1<Class<?>, Class<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f312976a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Class, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.reflect.a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @kotlin.s
    public static final Type c(s sVar, boolean z10) {
        g gVarJ = sVar.J();
        if (gVarJ instanceof t) {
            return new z((t) gVarJ);
        }
        if (!(gVarJ instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + sVar);
        }
        d dVar = (d) gVarJ;
        ?? G = z10 ? oj.b.g(dVar) : oj.b.e(dVar);
        List<KTypeProjection> listD = sVar.d();
        if (listD.isEmpty()) {
            return G;
        }
        if (!G.isArray()) {
            return e(G, listD);
        }
        if (!G.getComponentType().isPrimitive()) {
            KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.singleOrNull((List) listD);
            if (kTypeProjection == null) {
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + sVar);
            }
            u uVarA = kTypeProjection.a();
            s sVarB = kTypeProjection.b();
            int i10 = uVarA == null ? -1 : a.f312975a[uVarA.ordinal()];
            if (i10 != -1 && i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new k0();
                }
                Intrinsics.checkNotNull(sVarB);
                Type typeD = d(sVarB, false, 1, null);
                if (!(typeD instanceof Class)) {
                    G = new kotlin.reflect.a(typeD);
                }
            }
        }
        return G;
    }

    static /* synthetic */ Type d(s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(sVar, z10);
    }

    @kotlin.s
    private static final Type e(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((KTypeProjection) it.next()));
            }
            return new w(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((KTypeProjection) it2.next()));
            }
            return new w(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((KTypeProjection) it3.next()));
        }
        return new w(cls, typeE, arrayList3);
    }

    @NotNull
    public static final Type f(@NotNull s sVar) {
        Type typeK;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return (!(sVar instanceof kotlin.jvm.internal.k0) || (typeK = ((kotlin.jvm.internal.k0) sVar).k()) == null) ? d(sVar, false, 1, null) : typeK;
    }

    private static final Type g(KTypeProjection kTypeProjection) {
        u uVarH = kTypeProjection.h();
        if (uVarH == null) {
            return b0.f312977c.a();
        }
        s sVarG = kTypeProjection.g();
        Intrinsics.checkNotNull(sVarG);
        int i10 = a.f312975a[uVarH.ordinal()];
        if (i10 == 1) {
            return new b0(null, c(sVarG, true));
        }
        if (i10 == 2) {
            return c(sVarG, true);
        }
        if (i10 == 3) {
            return new b0(c(sVarG, true), null);
        }
        throw new k0();
    }

    @kotlin.internal.h
    @kotlin.s
    @e1(version = "1.4")
    public static /* synthetic */ void h(s sVar) {
    }

    @kotlin.s
    private static /* synthetic */ void i(KTypeProjection kTypeProjection) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Sequence sequenceL = kotlin.sequences.o.l(type, b.f312976a);
            name = ((Class) kotlin.sequences.o.f1(sequenceL)).getName() + StringsKt.g2(okhttp3.v.f334777p, kotlin.sequences.o.g0(sequenceL));
        } else {
            name = cls.getName();
        }
        Intrinsics.checkNotNull(name);
        return name;
    }
}
