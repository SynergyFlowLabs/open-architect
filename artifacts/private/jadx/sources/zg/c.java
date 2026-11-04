package zg;

import com.google.android.gms.common.f;
import com.google.firebase.messaging.FirebaseMessaging;
import eh.d;
import io.customer.messagingpush.h;
import io.customer.messagingpush.util.e;
import io.customer.messagingpush.util.g;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDiGraphMessagingPush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiGraphMessagingPush.kt\nio/customer/messagingpush/di/DiGraphMessagingPushKt\n+ 2 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n66#2,4:72\n34#2:76\n24#2:77\n66#2,4:78\n34#2:82\n24#2:83\n66#2,4:84\n34#2:88\n24#2:89\n66#2,4:90\n34#2:94\n24#2:95\n95#2,5:96\n34#2:101\n24#2:102\n48#2,2:103\n24#2:105\n50#2:106\n95#2,5:110\n34#2:115\n24#2:116\n48#2,2:117\n24#2:119\n50#2:120\n95#2,5:124\n34#2:129\n24#2:130\n48#2,2:131\n24#2:133\n50#2:134\n95#2,5:138\n34#2:143\n24#2:144\n48#2,2:145\n24#2:147\n50#2:148\n72#3,2:107\n72#3,2:121\n72#3,2:135\n72#3,2:149\n1#4:109\n1#4:123\n1#4:137\n1#4:151\n*S KotlinDebug\n*F\n+ 1 DiGraphMessagingPush.kt\nio/customer/messagingpush/di/DiGraphMessagingPushKt\n*L\n33#1:72,4\n33#1:76\n33#1:77\n43#1:78,4\n43#1:82\n43#1:83\n48#1:84,4\n48#1:88\n48#1:89\n52#1:90,4\n52#1:94\n52#1:95\n55#1:96,5\n55#1:101\n55#1:102\n55#1:103,2\n55#1:105\n55#1:106\n64#1:110,5\n64#1:115\n64#1:116\n64#1:117,2\n64#1:119\n64#1:120\n67#1:124,5\n67#1:129\n67#1:130\n67#1:131,2\n67#1:133\n67#1:134\n70#1:138,5\n70#1:143\n70#1:144\n70#1:145,2\n70#1:147\n70#1:148\n55#1:107,2\n64#1:121,2\n67#1:135,2\n70#1:149,2\n55#1:109\n64#1:123\n67#1:137\n70#1:151\n*E\n"})
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final f c() {
        return f.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseMessaging d() {
        return FirebaseMessaging.y();
    }

    @NotNull
    public static final io.customer.messagingpush.util.b e(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = io.customer.messagingpush.util.b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.messagingpush.util.b)) {
            obj = null;
            boolean z10 = true & false;
        }
        io.customer.messagingpush.util.b eVar = (io.customer.messagingpush.util.b) obj;
        if (eVar == null) {
            eVar = new e(dVar.w(), k(dVar));
        }
        return eVar;
    }

    @NotNull
    public static final ch.a f(@NotNull eh.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = aVar.f();
        String name = ch.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof ch.a)) {
            obj = null;
        }
        ch.a aVar2 = (ch.a) obj;
        return aVar2 == null ? new ch.c(aVar.r(), new ij.c() { // from class: zg.a
            @Override // ij.c
            public final Object get() {
                return c.c();
            }
        }, new ij.c() { // from class: zg.b
            @Override // ij.c
            public final Object get() {
                return c.d();
            }
        }, i(d.f274883c)) : aVar2;
    }

    @NotNull
    public static final io.customer.messagingpush.network.a g(@NotNull d dVar) {
        io.customer.messagingpush.network.a aVar;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = io.customer.messagingpush.network.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.messagingpush.network.a)) {
            obj = null;
        }
        io.customer.messagingpush.network.a aVar2 = (io.customer.messagingpush.network.a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = io.customer.messagingpush.network.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object bVar = concurrentHashMapG.get(name2);
                if (bVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (bVar = new io.customer.messagingpush.network.b()))) != null) {
                    bVar = objPutIfAbsent;
                }
                aVar = (io.customer.messagingpush.network.a) bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @NotNull
    public static final io.customer.messagingpush.f h(@NotNull d dVar) {
        io.customer.messagingpush.f fVar;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = io.customer.messagingpush.f.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.messagingpush.f)) {
            obj = null;
        }
        io.customer.messagingpush.f fVar2 = (io.customer.messagingpush.f) obj;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = io.customer.messagingpush.f.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object hVar = concurrentHashMapG.get(name2);
                if (hVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (hVar = new h()))) != null) {
                    hVar = objPutIfAbsent;
                }
                fVar = (io.customer.messagingpush.f) hVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @NotNull
    public static final bh.a i(@NotNull d dVar) {
        bh.a aVar;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = bh.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof bh.a)) {
            obj = null;
        }
        bh.a aVar2 = (bh.a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = bh.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object aVar3 = concurrentHashMapG.get(name2);
                if (aVar3 == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (aVar3 = new bh.a(dVar.w())))) != null) {
                    aVar3 = objPutIfAbsent;
                }
                aVar = (bh.a) aVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @NotNull
    public static final io.customer.messagingpush.processor.a j(@NotNull d dVar) {
        io.customer.messagingpush.processor.a aVar;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = io.customer.messagingpush.processor.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.messagingpush.processor.a)) {
            obj = null;
        }
        io.customer.messagingpush.processor.a aVar2 = (io.customer.messagingpush.processor.a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = io.customer.messagingpush.processor.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object bVar = concurrentHashMapG.get(name2);
                if (bVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (bVar = new io.customer.messagingpush.processor.b(i(dVar), k(dVar), e(dVar))))) != null) {
                    bVar = objPutIfAbsent;
                }
                aVar = (io.customer.messagingpush.processor.a) bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @NotNull
    public static final io.customer.messagingpush.c k(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = io.customer.messagingpush.c.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        int i10 = 3 << 0;
        if (!(obj instanceof io.customer.messagingpush.c)) {
            obj = null;
        }
        io.customer.messagingpush.c cVar = (io.customer.messagingpush.c) obj;
        if (cVar != null) {
            return cVar;
        }
        hh.a<? extends hh.b> aVar = dVar.x().get(io.customer.messagingpush.e.f288430e);
        hh.b moduleConfig = aVar != null ? aVar.getModuleConfig() : null;
        io.customer.messagingpush.c cVar2 = moduleConfig instanceof io.customer.messagingpush.c ? (io.customer.messagingpush.c) moduleConfig : null;
        return cVar2 == null ? io.customer.messagingpush.c.f288416d.a() : cVar2;
    }

    @NotNull
    public static final g l(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof g)) {
            obj = null;
        }
        g gVar = (g) obj;
        return gVar == null ? new io.customer.messagingpush.util.h() : gVar;
    }

    @rg.a
    public static /* synthetic */ void m(d dVar) {
    }
}
