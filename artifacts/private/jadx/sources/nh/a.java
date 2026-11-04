package nh;

import android.content.Context;
import eh.c;
import eh.d;
import ih.e;
import io.customer.tracking.migration.b;
import io.customer.tracking.migration.queue.f;
import io.customer.tracking.migration.queue.g;
import io.customer.tracking.migration.queue.h;
import io.customer.tracking.migration.queue.i;
import io.customer.tracking.migration.queue.j;
import io.customer.tracking.migration.queue.l;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMigrationSDKComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MigrationSDKComponent.kt\nio/customer/tracking/migration/di/MigrationSDKComponent\n+ 2 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n95#2,5:94\n34#2:99\n24#2:100\n48#2,2:101\n24#2:103\n50#2:104\n95#2,5:108\n34#2:113\n24#2:114\n48#2,2:115\n24#2:117\n50#2:118\n95#2,5:122\n34#2:127\n24#2:128\n48#2,2:129\n24#2:131\n50#2:132\n95#2,5:136\n34#2:141\n24#2:142\n48#2,2:143\n24#2:145\n50#2:146\n95#2,5:150\n34#2:155\n24#2:156\n48#2,2:157\n24#2:159\n50#2:160\n95#2,5:164\n34#2:169\n24#2:170\n48#2,2:171\n24#2:173\n50#2:174\n95#2,5:178\n34#2:183\n24#2:184\n48#2,2:185\n24#2:187\n50#2:188\n95#2,5:192\n34#2:197\n24#2:198\n48#2,2:199\n24#2:201\n50#2:202\n95#2,5:206\n34#2:211\n24#2:212\n48#2,2:213\n24#2:215\n50#2:216\n72#3,2:105\n72#3,2:119\n72#3,2:133\n72#3,2:147\n72#3,2:161\n72#3,2:175\n72#3,2:189\n72#3,2:203\n72#3,2:217\n1#4:107\n1#4:121\n1#4:135\n1#4:149\n1#4:163\n1#4:177\n1#4:191\n1#4:205\n1#4:219\n*S KotlinDebug\n*F\n+ 1 MigrationSDKComponent.kt\nio/customer/tracking/migration/di/MigrationSDKComponent\n*L\n39#1:94,5\n39#1:99\n39#1:100\n39#1:101,2\n39#1:103\n39#1:104\n43#1:108,5\n43#1:113\n43#1:114\n43#1:115,2\n43#1:117\n43#1:118\n47#1:122,5\n47#1:127\n47#1:128\n47#1:129,2\n47#1:131\n47#1:132\n49#1:136,5\n49#1:141\n49#1:142\n49#1:143,2\n49#1:145\n49#1:146\n57#1:150,5\n57#1:155\n57#1:156\n57#1:157,2\n57#1:159\n57#1:160\n61#1:164,5\n61#1:169\n61#1:170\n61#1:171,2\n61#1:173\n61#1:174\n69#1:178,5\n69#1:183\n69#1:184\n69#1:185,2\n69#1:187\n69#1:188\n78#1:192,5\n78#1:197\n78#1:198\n78#1:199,2\n78#1:201\n78#1:202\n86#1:206,5\n86#1:211\n86#1:212\n86#1:213,2\n86#1:215\n86#1:216\n39#1:105,2\n43#1:119,2\n47#1:133,2\n49#1:147,2\n57#1:161,2\n61#1:175,2\n69#1:189,2\n78#1:203,2\n86#1:217,2\n39#1:107\n43#1:121\n47#1:135\n49#1:149\n57#1:163\n61#1:177\n69#1:191\n78#1:205\n86#1:219\n*E\n"})
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f333354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f333355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Context f333356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final e f333357f;

    public /* synthetic */ a(eh.a aVar, b bVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? d.f274883c.q() : aVar, bVar, str);
    }

    @NotNull
    public final h A() {
        h hVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = h.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof h)) {
            obj = null;
        }
        h hVar2 = (h) obj;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (g()) {
            try {
                String name2 = h.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object iVar = concurrentHashMapG.get(name2);
                if (iVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (iVar = new i(s(), this.f333357f, this.f333354c)))) != null) {
                    iVar = objPutIfAbsent;
                }
                hVar = (h) iVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @NotNull
    public final j B() {
        j jVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = j.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof j)) {
            obj = null;
        }
        j jVar2 = (j) obj;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (g()) {
            try {
                String name2 = j.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object lVar = concurrentHashMapG.get(name2);
                if (lVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (lVar = new l(r(), s(), this.f333357f)))) != null) {
                    lVar = objPutIfAbsent;
                }
                jVar = (j) lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    @NotNull
    public final ph.a C() {
        ph.a aVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = ph.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof ph.a)) {
            obj = null;
        }
        ph.a aVar2 = (ph.a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (g()) {
            try {
                String name2 = ph.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object cVar = concurrentHashMapG.get(name2);
                if (cVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (cVar = new ph.c(this.f333356e, this.f333355d)))) != null) {
                    cVar = objPutIfAbsent;
                }
                aVar = (ph.a) cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @NotNull
    public final Context q() {
        return this.f333356e;
    }

    @NotNull
    public final rh.a r() {
        rh.a aVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = rh.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof rh.a)) {
            obj = null;
        }
        rh.a aVar2 = (rh.a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (g()) {
            try {
                String name2 = rh.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object aVar3 = concurrentHashMapG.get(name2);
                if (aVar3 == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (aVar3 = new rh.a(this.f333355d, this.f333356e, this.f333357f)))) != null) {
                    aVar3 = objPutIfAbsent;
                }
                aVar = (rh.a) aVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @NotNull
    public final th.a s() {
        th.a aVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = th.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof th.a)) {
            obj = null;
        }
        th.a aVar2 = (th.a) obj;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (g()) {
            try {
                String name2 = th.a.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object aVar3 = concurrentHashMapG.get(name2);
                if (aVar3 == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (aVar3 = new th.a()))) != null) {
                    aVar3 = objPutIfAbsent;
                }
                aVar = (th.a) aVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @NotNull
    public final e t() {
        return this.f333357f;
    }

    @NotNull
    public final b u() {
        return this.f333354c;
    }

    @NotNull
    public final s0 v() {
        s0 s0Var;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = s0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof s0)) {
            obj = null;
        }
        s0 s0Var2 = (s0) obj;
        if (s0Var2 != null) {
            return s0Var2;
        }
        synchronized (g()) {
            try {
                String name2 = s0.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object objA = concurrentHashMapG.get(name2);
                if (objA == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (objA = t0.a(d.f274883c.u().c())))) != null) {
                    objA = objPutIfAbsent;
                }
                if (objA == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
                }
                s0Var = (s0) objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0Var;
    }

    @NotNull
    public final String w() {
        return this.f333355d;
    }

    @NotNull
    public final io.customer.tracking.migration.queue.b x() {
        io.customer.tracking.migration.queue.b bVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = io.customer.tracking.migration.queue.b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.tracking.migration.queue.b)) {
            obj = null;
            int i10 = 4 >> 0;
        }
        io.customer.tracking.migration.queue.b bVar2 = (io.customer.tracking.migration.queue.b) obj;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (g()) {
            try {
                String name2 = io.customer.tracking.migration.queue.b.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object cVar = concurrentHashMapG.get(name2);
                if (cVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (cVar = new io.customer.tracking.migration.queue.c(this.f333357f, z())))) != null) {
                    cVar = objPutIfAbsent;
                }
                bVar = (io.customer.tracking.migration.queue.b) cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @NotNull
    public final io.customer.tracking.migration.queue.d y() {
        io.customer.tracking.migration.queue.d dVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = io.customer.tracking.migration.queue.d.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.tracking.migration.queue.d)) {
            obj = null;
        }
        io.customer.tracking.migration.queue.d dVar2 = (io.customer.tracking.migration.queue.d) obj;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (g()) {
            try {
                String name2 = io.customer.tracking.migration.queue.d.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object eVar = concurrentHashMapG.get(name2);
                if (eVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (eVar = new io.customer.tracking.migration.queue.e(this.f333357f)))) != null) {
                    eVar = objPutIfAbsent;
                }
                dVar = (io.customer.tracking.migration.queue.d) eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @NotNull
    public final f z() {
        f fVar;
        Object objPutIfAbsent;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = f.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof f)) {
            obj = null;
        }
        f fVar2 = (f) obj;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (g()) {
            try {
                String name2 = f.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object gVar = concurrentHashMapG.get(name2);
                if (gVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (gVar = new g(A(), B(), this.f333357f, y())))) != null) {
                    gVar = objPutIfAbsent;
                }
                fVar = (f) gVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public a(@NotNull eh.a androidSDKComponent, @NotNull b migrationProcessor, @NotNull String migrationSiteId) {
        Intrinsics.checkNotNullParameter(androidSDKComponent, "androidSDKComponent");
        Intrinsics.checkNotNullParameter(migrationProcessor, "migrationProcessor");
        Intrinsics.checkNotNullParameter(migrationSiteId, "migrationSiteId");
        this.f333354c = migrationProcessor;
        this.f333355d = migrationSiteId;
        this.f333356e = androidSDKComponent.r();
        this.f333357f = d.f274883c.w();
    }
}
