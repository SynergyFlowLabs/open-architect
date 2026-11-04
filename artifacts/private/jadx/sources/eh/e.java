package eh;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSDKComponentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SDKComponentExt.kt\nio/customer/sdk/core/di/SDKComponentExtKt\n+ 2 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n119#2,4:21\n48#2,2:25\n24#2:27\n50#2:28\n125#2:32\n72#3,2:29\n1#4:31\n*S KotlinDebug\n*F\n+ 1 SDKComponentExt.kt\nio/customer/sdk/core/di/SDKComponentExtKt\n*L\n17#1:21,4\n17#1:25,2\n17#1:27\n17#1:28\n17#1:32\n17#1:29,2\n17#1:31\n*E\n"})
public final class e {
    @NotNull
    public static final a a(@NotNull d dVar, @NotNull Context context) {
        a aVar;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (dVar.g()) {
            try {
                String name = a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object bVar = concurrentHashMapG.get(name);
                if (bVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name, (bVar = new b(context)))) != null) {
                    bVar = objPutIfAbsent;
                }
                aVar = (a) bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
