package com.planner5d.library.services.utility;

import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nCollectionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionUtils.kt\ncom/planner5d/library/services/utility/CollectionUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n188#2,2:55\n190#2:58\n1#3:57\n*S KotlinDebug\n*F\n+ 1 CollectionUtils.kt\ncom/planner5d/library/services/utility/CollectionUtils\n*L\n22#1:55,2\n22#1:58\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f225326a = new m();

    private m() {
    }

    public final /* synthetic */ <E extends Enum<E>> EnumSet<E> a(Function1<? super EnumSet<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.T4);
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(Enum.class);
        builderAction.invoke(enumSetNoneOf);
        Intrinsics.checkNotNullExpressionValue(enumSetNoneOf, "apply(...)");
        return enumSetNoneOf;
    }

    @NotNull
    public final <E> Set<E> b(int i10, @NotNull Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set<E> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i10));
        builderAction.invoke(setNewSetFromMap);
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "apply(...)");
        return setNewSetFromMap;
    }

    public final boolean c(@NotNull Map<?, ?> map, @NotNull Class<?> type) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            if (value != null ? type.isAssignableFrom(value.getClass()) : false) {
                return true;
            }
        }
        return false;
    }

    public final <K, V> void d(@NotNull Map<K, V> map, K k10, @NotNull Function0<? extends V> provider, @NotNull Function1<? super V, Unit> updater) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(updater, "updater");
        V v10 = map.get(k10);
        if (v10 == null) {
            map.put(k10, provider.invoke());
        } else {
            updater.invoke(v10);
        }
    }

    public final void e(@NotNull Map<?, ?> map, @NotNull Class<?> type) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            if (value != null && type.isAssignableFrom(value.getClass())) {
                it.remove();
            }
        }
    }
}
