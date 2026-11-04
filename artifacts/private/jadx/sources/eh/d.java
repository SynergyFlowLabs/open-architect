package eh;

import ih.f;
import ih.g;
import ih.h;
import ih.i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSDKComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SDKComponent.kt\nio/customer/sdk/core/di/SDKComponent\n+ 2 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n95#2,5:66\n34#2:71\n24#2:72\n48#2,2:73\n24#2:75\n50#2:76\n79#2,2:80\n34#2:82\n24#2:83\n66#2,4:84\n34#2:88\n24#2:89\n95#2,5:90\n34#2:95\n24#2:96\n48#2,2:97\n24#2:99\n50#2:100\n95#2,5:104\n34#2:109\n24#2:110\n48#2,2:111\n24#2:113\n50#2:114\n66#2,4:118\n34#2:122\n24#2:123\n66#2,4:124\n34#2:128\n24#2:129\n72#3,2:77\n72#3,2:101\n72#3,2:115\n1#4:79\n1#4:103\n1#4:117\n*S KotlinDebug\n*F\n+ 1 SDKComponent.kt\nio/customer/sdk/core/di/SDKComponent\n*L\n30#1:66,5\n30#1:71\n30#1:72\n30#1:73,2\n30#1:75\n30#1:76\n32#1:80,2\n32#1:82\n32#1:83\n45#1:84,4\n45#1:88\n45#1:89\n47#1:90,5\n47#1:95\n47#1:96\n47#1:97,2\n47#1:99\n47#1:100\n51#1:104,5\n51#1:109\n51#1:110\n51#1:111,2\n51#1:113\n51#1:114\n53#1:118,4\n53#1:122\n53#1:123\n55#1:124,4\n55#1:128\n55#1:129\n30#1:77,2\n47#1:101,2\n51#1:115,2\n30#1:79\n47#1:103\n51#1:117\n*E\n"})
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final d f274883c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Map<String, hh.a<? extends hh.b>> f274884d = new LinkedHashMap();

    private d() {
    }

    @Override // eh.c
    public void n() {
        a aVarS = s();
        if (aVarS != null) {
            aVarS.n();
        }
        f274884d.clear();
        v().b();
        super.n();
    }

    @NotNull
    public final a q() {
        a aVarS = s();
        if (aVarS != null) {
            return aVarS;
        }
        throw new IllegalStateException("AndroidSDKComponent is not initialized. Make sure to initialize SDK components with context before accessing it.");
    }

    @NotNull
    public final io.customer.sdk.lifecycle.a r() {
        io.customer.sdk.lifecycle.a aVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = io.customer.sdk.lifecycle.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.sdk.lifecycle.a)) {
            obj = null;
        }
        io.customer.sdk.lifecycle.a aVar2 = (io.customer.sdk.lifecycle.a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (g()) {
            try {
                String name2 = io.customer.sdk.lifecycle.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object aVar3 = concurrentHashMapG.get(name2);
                if (aVar3 == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (aVar3 = new io.customer.sdk.lifecycle.a()))) != null) {
                    aVar3 = objPutIfAbsent;
                }
                aVar = (io.customer.sdk.lifecycle.a) aVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Nullable
    public final a s() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof a)) {
            obj = null;
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        ConcurrentHashMap<String, Object> concurrentHashMapG = g();
        String name2 = a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        Object obj2 = concurrentHashMapG.get(name2);
        return (a) (obj2 instanceof a ? obj2 : null);
    }

    @NotNull
    public final fh.a t() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = fh.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof fh.a)) {
            obj = null;
        }
        fh.a aVar = (fh.a) obj;
        return aVar == null ? new fh.b() : aVar;
    }

    @NotNull
    public final ih.b u() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = ih.b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof ih.b)) {
            obj = null;
        }
        ih.b bVar = (ih.b) obj;
        return bVar == null ? new h() : bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final io.customer.sdk.communication.b v() {
        io.customer.sdk.communication.b bVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = io.customer.sdk.communication.b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        j0 j0Var = null;
        Object[] objArr = 0;
        if (!(obj instanceof io.customer.sdk.communication.b)) {
            obj = null;
        }
        io.customer.sdk.communication.b bVar2 = (io.customer.sdk.communication.b) obj;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (g()) {
            try {
                String name2 = io.customer.sdk.communication.b.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object cVar = concurrentHashMapG.get(name2);
                if (cVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (cVar = new io.customer.sdk.communication.c(j0Var, 1, objArr == true ? 1 : 0)))) != null) {
                    cVar = objPutIfAbsent;
                }
                bVar = (io.customer.sdk.communication.b) cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ih.e w() {
        ih.e eVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = ih.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        ih.d dVar = null;
        Object[] objArr = 0;
        if (!(obj instanceof ih.e)) {
            obj = null;
        }
        ih.e eVar2 = (ih.e) obj;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (g()) {
            try {
                String name2 = ih.e.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object fVar = concurrentHashMapG.get(name2);
                if (fVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (fVar = new f(f274883c.t(), dVar, 2, objArr == true ? 1 : 0)))) != null) {
                    fVar = objPutIfAbsent;
                }
                eVar = (ih.e) fVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @NotNull
    public final Map<String, hh.a<? extends hh.b>> x() {
        return f274884d;
    }

    @NotNull
    public final g y() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof g)) {
            obj = null;
        }
        g gVar = (g) obj;
        return gVar == null ? new i(f274883c.u()) : gVar;
    }
}
