package androidx.navigation;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n2642#2:68\n1#3:69\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt__SavedStateHandleKt\n*L\n64#1:68\n64#1:69\n*E\n"})
final /* synthetic */ class a4 {
    public static final /* synthetic */ <T> T a(androidx.lifecycle.l1 l1Var, Map<kotlin.reflect.s, d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T) z3.b(l1Var, kotlin.jvm.internal.j1.d(Object.class), typeMap);
    }

    @NotNull
    public static final <T> T b(@NotNull androidx.lifecycle.l1 l1Var, @NotNull kotlin.reflect.d<T> route, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KSerializer kSerializerI = kotlinx.serialization.m0.i(route);
        for (b0 b0Var : androidx.navigation.serialization.p.l(kSerializerI, typeMap)) {
            linkedHashMap.put(b0Var.d(), b0Var.c().b());
        }
        return (T) androidx.navigation.serialization.i.b(kSerializerI, l1Var, linkedHashMap);
    }

    public static /* synthetic */ Object c(androidx.lifecycle.l1 l1Var, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return z3.b(l1Var, kotlin.jvm.internal.j1.d(Object.class), typeMap);
    }

    public static /* synthetic */ Object d(androidx.lifecycle.l1 l1Var, kotlin.reflect.d dVar, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        return z3.b(l1Var, dVar, map);
    }
}
