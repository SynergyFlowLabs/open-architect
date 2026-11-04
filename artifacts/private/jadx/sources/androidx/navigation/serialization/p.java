package androidx.navigation.serialization;

import androidx.annotation.b1;
import androidx.navigation.b0;
import androidx.navigation.c0;
import androidx.navigation.d3;
import androidx.navigation.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRouteSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSerializer.kt\nandroidx/navigation/serialization/RouteSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class p {
    private static final <T> void f(KSerializer<T> kSerializer, Function0<Unit> function0) {
        if (kSerializer instanceof kotlinx.serialization.p) {
            function0.invoke();
        }
    }

    private static final d3<Object> g(SerialDescriptor serialDescriptor, Map<kotlin.reflect.s, ? extends d3<?>> map) {
        Object next;
        Iterator<T> it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!e.b(serialDescriptor, (kotlin.reflect.s) next));
        kotlin.reflect.s sVar = (kotlin.reflect.s) next;
        d3<?> d3VarA = sVar != null ? map.get(sVar) : null;
        if (d3VarA == null) {
            d3VarA = null;
        }
        if (d3VarA == null) {
            d3VarA = e.a(serialDescriptor);
        }
        if (Intrinsics.areEqual(d3VarA, s.f71305a)) {
            return null;
        }
        Intrinsics.checkNotNull(d3VarA, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return d3VarA;
    }

    @oj.i(name = "forEachIndexedKType")
    private static final <T> void h(KSerializer<T> kSerializer, Map<kotlin.reflect.s, ? extends d3<?>> map, pj.n<? super Integer, ? super String, ? super d3<Object>, Unit> nVar) {
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            String elementName = kSerializer.getDescriptor().getElementName(i10);
            d3<Object> d3VarG = g(kSerializer.getDescriptor().getElementDescriptor(i10), map);
            if (d3VarG == null) {
                throw new IllegalArgumentException(w(elementName, kSerializer.getDescriptor().getElementDescriptor(i10).getSerialName(), kSerializer.getDescriptor().getSerialName(), map.toString()));
            }
            nVar.invoke(Integer.valueOf(i10), elementName, d3VarG);
        }
    }

    static /* synthetic */ void i(KSerializer kSerializer, Map map, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        h(kSerializer, map, nVar);
    }

    @oj.i(name = "forEachIndexedName")
    private static final <T> void j(KSerializer<T> kSerializer, Map<String, ? extends d3<Object>> map, pj.n<? super Integer, ? super String, ? super d3<Object>, Unit> nVar) {
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            String elementName = kSerializer.getDescriptor().getElementName(i10);
            d3<Object> d3Var = map.get(elementName);
            if (d3Var == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + elementName + AbstractJsonLexerKt.END_LIST).toString());
            }
            nVar.invoke(Integer.valueOf(i10), elementName, d3Var);
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public static final <T> int k(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        int iHashCode = kSerializer.getDescriptor().getSerialName().hashCode();
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            iHashCode = (iHashCode * 31) + kSerializer.getDescriptor().getElementName(i10).hashCode();
        }
        return iHashCode;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public static final <T> List<b0> l(@NotNull final KSerializer<T> kSerializer, @NotNull final Map<kotlin.reflect.s, ? extends d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        f(kSerializer, new Function0() { // from class: androidx.navigation.serialization.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.n(kSerializer);
            }
        });
        int elementsCount = kSerializer.getDescriptor().getElementsCount();
        ArrayList arrayList = new ArrayList(elementsCount);
        for (final int i10 = 0; i10 < elementsCount; i10++) {
            final String elementName = kSerializer.getDescriptor().getElementName(i10);
            arrayList.add(c0.a(elementName, new Function1() { // from class: androidx.navigation.serialization.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p.o(kSerializer, i10, typeMap, elementName, (k0) obj);
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ List m(KSerializer kSerializer, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return l(kSerializer, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(KSerializer kSerializer) {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + kSerializer + ". Arguments can only be generated from concrete classes or objects.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(KSerializer kSerializer, int i10, Map map, String str, k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        SerialDescriptor elementDescriptor = kSerializer.getDescriptor().getElementDescriptor(i10);
        boolean zIsNullable = elementDescriptor.isNullable();
        d3<?> d3VarG = g(elementDescriptor, map);
        if (d3VarG == null) {
            throw new IllegalArgumentException(w(str, elementDescriptor.getSerialName(), kSerializer.getDescriptor().getSerialName(), map.toString()));
        }
        navArgument.h(d3VarG);
        navArgument.g(zIsNullable);
        if (kSerializer.getDescriptor().isElementOptional(i10)) {
            navArgument.i(true);
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final <T> String p(@NotNull final KSerializer<T> kSerializer, @NotNull Map<kotlin.reflect.s, ? extends d3<?>> typeMap, @Nullable String str) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        f(kSerializer, new Function0() { // from class: androidx.navigation.serialization.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.r(kSerializer);
            }
        });
        final g gVar = str != null ? new g(str, kSerializer) : new g(kSerializer);
        h(kSerializer, typeMap, new pj.n() { // from class: androidx.navigation.serialization.l
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return p.s(gVar, ((Integer) obj).intValue(), (String) obj2, (d3) obj3);
            }
        });
        return gVar.e();
    }

    public static /* synthetic */ String q(KSerializer kSerializer, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return p(kSerializer, map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(KSerializer kSerializer) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot generate route pattern from polymorphic class ");
        kotlin.reflect.d<?> dVarA = kotlinx.serialization.descriptors.b.a(kSerializer.getDescriptor());
        sb2.append(dVarA != null ? dVarA.Q() : null);
        sb2.append(". Routes can only be generated from concrete classes or objects.");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(g gVar, int i10, String argName, d3 navType) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        Intrinsics.checkNotNullParameter(navType, "navType");
        gVar.d(i10, argName, navType);
        return Unit.f312394a;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public static final <T> String t(@NotNull T route, @NotNull Map<String, ? extends d3<Object>> typeMap) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        KSerializer kSerializerI = m0.i(j1.d(route.getClass()));
        final Map<String, List<String>> mapH = new j(kSerializerI, typeMap).h(route);
        final g gVar = new g(kSerializerI);
        j(kSerializerI, typeMap, new pj.n() { // from class: androidx.navigation.serialization.m
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return p.u(mapH, gVar, ((Integer) obj).intValue(), (String) obj2, (d3) obj3);
            }
        });
        return gVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Map map, g gVar, int i10, String argName, d3 navType) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        Intrinsics.checkNotNullParameter(navType, "navType");
        Object obj = map.get(argName);
        Intrinsics.checkNotNull(obj);
        gVar.c(i10, argName, navType, (List) obj);
        return Unit.f312394a;
    }

    public static final boolean v(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.m.a.f315861a) && serialDescriptor.isInline() && serialDescriptor.getElementsCount() == 1;
    }

    private static final String w(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}
