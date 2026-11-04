package eh;

import android.app.Application;
import android.content.Context;
import io.customer.sdk.data.store.f;
import io.customer.sdk.data.store.g;
import io.customer.sdk.data.store.h;
import io.customer.sdk.data.store.i;
import io.customer.sdk.data.store.j;
import io.customer.sdk.data.store.l;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAndroidSDKComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSDKComponent.kt\nio/customer/sdk/core/di/AndroidSDKComponentImpl\n+ 2 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n66#2,4:68\n34#2:72\n24#2:73\n95#2,5:74\n34#2:79\n24#2:80\n48#2,2:81\n24#2:83\n50#2:84\n66#2,4:88\n34#2:92\n24#2:93\n66#2,4:94\n34#2:98\n24#2:99\n66#2,4:100\n34#2:104\n24#2:105\n66#2,4:106\n34#2:110\n24#2:111\n95#2,5:112\n34#2:117\n24#2:118\n48#2,2:119\n24#2:121\n50#2:122\n72#3,2:85\n72#3,2:123\n1#4:87\n1#4:125\n*S KotlinDebug\n*F\n+ 1 AndroidSDKComponent.kt\nio/customer/sdk/core/di/AndroidSDKComponentImpl\n*L\n35#1:68,4\n35#1:72\n35#1:73\n38#1:74,5\n38#1:79\n38#1:80\n38#1:81,2\n38#1:83\n38#1:84\n45#1:88,4\n45#1:92\n45#1:93\n47#1:94,4\n47#1:98\n47#1:99\n49#1:100,4\n49#1:104\n49#1:105\n51#1:106,4\n51#1:110\n51#1:111\n59#1:112,5\n59#1:117\n59#1:118\n59#1:119,2\n59#1:121\n59#1:122\n38#1:85,2\n59#1:123,2\n38#1:87\n59#1:125\n*E\n"})
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f274880c;

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f274880c = context;
        d.f274883c.r().b(q());
    }

    @Override // eh.c
    public void n() {
        super.n();
        d.f274883c.r().f(q());
    }

    @Override // eh.a
    @NotNull
    public Application q() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = Application.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof Application)) {
            obj = null;
        }
        Application application = (Application) obj;
        if (application != null) {
            return application;
        }
        Context applicationContext = this.f274880c.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    @Override // eh.a
    @NotNull
    public Context r() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = Context.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof Context)) {
            obj = null;
        }
        Context context = (Context) obj;
        if (context != null) {
            return context;
        }
        Context applicationContext = this.f274880c.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @Override // eh.a
    @NotNull
    public io.customer.sdk.data.store.a s() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = io.customer.sdk.data.store.a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.sdk.data.store.a)) {
            obj = null;
        }
        io.customer.sdk.data.store.a dVar = (io.customer.sdk.data.store.a) obj;
        if (dVar == null) {
            dVar = new io.customer.sdk.data.store.d(r());
        }
        return dVar;
    }

    @Override // eh.a
    @NotNull
    public io.customer.sdk.data.store.e t() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = io.customer.sdk.data.store.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof io.customer.sdk.data.store.e)) {
            obj = null;
        }
        io.customer.sdk.data.store.e eVar = (io.customer.sdk.data.store.e) obj;
        return eVar == null ? new f() : eVar;
    }

    @Override // eh.a
    @NotNull
    public g u() {
        g gVar;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof g)) {
            obj = null;
            int i10 = 5 | 0;
        }
        g gVar2 = (g) obj;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (g()) {
            try {
                String name2 = g.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = g();
                Object obj2 = concurrentHashMapG.get(name2);
                if (obj2 == null) {
                    g gVarA = g.f288525c.a(gh.c.a(this.f274880c));
                    Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, gVarA);
                    obj2 = objPutIfAbsent == null ? gVarA : objPutIfAbsent;
                }
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.customer.sdk.data.store.Client");
                }
                gVar = (g) obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // eh.a
    @NotNull
    public h v() {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        String name = h.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof h)) {
            obj = null;
        }
        h hVar = (h) obj;
        if (hVar != null) {
            return hVar;
        }
        int i10 = 1 >> 0;
        return new i(t(), s(), u(), null, 8, null);
    }

    @Override // eh.a
    @NotNull
    public j w() {
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
                if (lVar == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (lVar = new l(r())))) != null) {
                    lVar = objPutIfAbsent;
                }
                jVar = (j) lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
