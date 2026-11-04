package ug;

import eh.d;
import io.customer.sdk.m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSDKComponentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SDKComponentExt.kt\nio/customer/datapipelines/di/SDKComponentExtKt\n+ 2 DiGraphExt.kt\nio/customer/sdk/core/extensions/DiGraphExtKt\n+ 3 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n10#2:16\n80#3:17\n34#3:18\n24#3:19\n95#3,5:20\n34#3:25\n24#3:26\n48#3,2:27\n24#3:29\n50#3:30\n72#4,2:31\n1#5:33\n*S KotlinDebug\n*F\n+ 1 SDKComponentExt.kt\nio/customer/datapipelines/di/SDKComponentExtKt\n*L\n11#1:16\n11#1:17\n11#1:18\n11#1:19\n14#1:20,5\n14#1:25\n14#1:26\n14#1:27,2\n14#1:29\n14#1:30\n14#1:31,2\n14#1:33\n*E\n"})
public final class a {
    @Nullable
    public static final Function1<tg.a, com.segment.analytics.kotlin.core.a> a(@NotNull d dVar) {
        String name;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String strName = b.AnalyticsFactory.name();
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        if (strName == null) {
            name = Function1.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        } else {
            name = strName;
        }
        Object obj = concurrentHashMapF.get(name);
        if (!r1.B(obj, 1)) {
            obj = null;
        }
        Function1<tg.a, com.segment.analytics.kotlin.core.a> function1 = (Function1) obj;
        if (function1 != null) {
            return function1;
        }
        ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
        if (strName == null) {
            strName = Function1.class.getName();
            Intrinsics.checkNotNullExpressionValue(strName, "getName(...)");
        }
        Object obj2 = concurrentHashMapG.get(strName);
        return (Function1) (r1.B(obj2, 1) ? obj2 : null);
    }

    @NotNull
    public static final m b(@NotNull d dVar) {
        m mVar;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = m.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof m)) {
            obj = null;
        }
        m mVar2 = (m) obj;
        if (mVar2 != null) {
            return mVar2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = m.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object mVar3 = concurrentHashMapG.get(name2);
                if (mVar3 == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (mVar3 = new m(dVar.w())))) != null) {
                    mVar3 = objPutIfAbsent;
                }
                mVar = (m) mVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }
}
