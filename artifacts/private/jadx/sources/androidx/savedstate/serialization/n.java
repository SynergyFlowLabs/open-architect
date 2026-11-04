package androidx.savedstate.serialization;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.d0;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoderKt\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,281:1\n27#2:282\n46#2:283\n32#2,4:284\n31#2,7:294\n126#3:288\n153#3,3:289\n37#4,2:292\n1#5:301\n106#6:302\n46#7:303\n*S KotlinDebug\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoderKt\n*L\n67#1:282\n67#1:283\n67#1:284,4\n67#1:294,7\n67#1:288\n67#1:289,3\n67#1:292,2\n67#1:301\n67#1:302\n67#1:303\n*E\n"})
public final class n {
    public static final /* synthetic */ <T> Bundle a(T value, h configuration) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        int i10 = 4 >> 0;
        return c(m0.o(fVarC, null), value, configuration);
    }

    @oj.j
    @NotNull
    public static final <T> Bundle b(@NotNull d0<? super T> serializer, @NotNull T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(value, "value");
        return e(serializer, value, null, 4, null);
    }

    @oj.j
    @NotNull
    public static final <T> Bundle c(@NotNull d0<? super T> serializer, @NotNull T value, @NotNull h configuration) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        new m(bundleB, configuration).encodeSerializableValue(serializer, value);
        return bundleB;
    }

    public static /* synthetic */ Bundle d(Object value, h configuration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            configuration = h.f75194e;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return c(m0.o(fVarC, null), value, configuration);
    }

    public static /* synthetic */ Bundle e(d0 d0Var, Object obj, h hVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            hVar = h.f75194e;
        }
        return c(d0Var, obj, hVar);
    }
}
