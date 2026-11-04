package gh;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDiGraphExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiGraphExt.kt\nio/customer/sdk/core/extensions/DiGraphExtKt\n+ 2 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n80#2:25\n34#2:26\n24#2:27\n122#2:28\n48#2,2:29\n24#2:31\n50#2:32\n125#2:36\n72#3,2:33\n1#4:35\n*S KotlinDebug\n*F\n+ 1 DiGraphExt.kt\nio/customer/sdk/core/extensions/DiGraphExtKt\n*L\n10#1:25\n10#1:26\n10#1:27\n20#1:28\n20#1:29,2\n20#1:31\n20#1:32\n20#1:36\n20#1:33,2\n20#1:35\n*E\n"})
public final class d {
    public static final /* synthetic */ <Dependency, Key extends Enum<Key>> Dependency a(eh.c cVar, Key identifier) {
        String name;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        String strName = identifier.name();
        ConcurrentHashMap<String, Object> concurrentHashMapF = cVar.f();
        if (strName == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            name = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        } else {
            name = strName;
        }
        Dependency dependency = (Dependency) concurrentHashMapF.get(name);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        if (dependency != null) {
            return dependency;
        }
        ConcurrentHashMap<String, Object> concurrentHashMapG = cVar.g();
        if (strName == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            strName = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(strName, "getName(...)");
        }
        Dependency dependency2 = (Dependency) concurrentHashMapG.get(strName);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        return dependency2;
    }

    public static final /* synthetic */ <Dependency, Key extends Enum<Key>> Dependency b(eh.c cVar, Key identifier, Function0<? extends Dependency> newInstanceCreator) {
        Dependency dependency;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        String strName = identifier.name();
        synchronized (cVar.g()) {
            if (strName == null) {
                try {
                    Intrinsics.reifiedOperationMarker(4, "Dependency");
                    strName = Object.class.getName();
                    Intrinsics.checkNotNullExpressionValue(strName, "getName(...)");
                } catch (Throwable th2) {
                    h0.d(1);
                    h0.c(1);
                    throw th2;
                }
            }
            ConcurrentHashMap<String, Object> concurrentHashMapG = cVar.g();
            dependency = (Dependency) concurrentHashMapG.get(strName);
            if (dependency == null) {
                Dependency dependencyInvoke = newInstanceCreator.invoke();
                Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(strName, dependencyInvoke);
                dependency = objPutIfAbsent == null ? dependencyInvoke : (Dependency) objPutIfAbsent;
            }
            Intrinsics.reifiedOperationMarker(1, "Dependency");
            h0.d(2);
        }
        h0.c(2);
        return dependency;
    }
}
