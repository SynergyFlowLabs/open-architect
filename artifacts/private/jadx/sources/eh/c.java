package eh;

import androidx.annotation.i;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDiGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n24#1:144\n24#1:145\n34#1:149\n24#1,11:150\n34#1:161\n24#1,11:162\n34#1:173\n24#1:174\n48#1,2:175\n24#1:177\n50#1:178\n34#1:182\n24#1:183\n48#1,2:184\n24#1:186\n50#1:187\n24#1:188\n48#1,2:189\n24#1:191\n50#1:192\n48#1,2:196\n24#1:198\n50#1:199\n72#2,2:146\n72#2,2:179\n72#2,2:193\n1#3:148\n1#3:181\n1#3:195\n*S KotlinDebug\n*F\n+ 1 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n*L\n34#1:144\n49#1:145\n69#1:149\n69#1:150,11\n80#1:161\n80#1:162,11\n99#1:173\n99#1:174\n99#1:175,2\n99#1:177\n99#1:178\n99#1:182\n99#1:183\n99#1:184,2\n99#1:186\n99#1:187\n111#1:188\n122#1:189,2\n122#1:191\n122#1:192\n122#1:196,2\n122#1:198\n122#1:199\n50#1:146,2\n99#1:179,2\n122#1:193,2\n50#1:148\n99#1:181\n122#1:195\n*E\n"})
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Object> f274881a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Object> f274882b = new ConcurrentHashMap<>();

    public static /* synthetic */ Object d(c cVar, String str, int i10, Object obj) {
        String name;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrNull");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        ConcurrentHashMap<String, Object> concurrentHashMapF = cVar.f();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            name = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        } else {
            name = str;
        }
        Object obj2 = concurrentHashMapF.get(name);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        if (obj2 != null) {
            return obj2;
        }
        ConcurrentHashMap<String, Object> concurrentHashMapG = cVar.g();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            str = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        Object obj3 = concurrentHashMapG.get(str);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        return obj3;
    }

    public static /* synthetic */ Object i(c cVar, String str, Function0 newInstanceCreator, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newInstance");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        ConcurrentHashMap<String, Object> concurrentHashMapF = cVar.f();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            str = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        Object objInvoke = concurrentHashMapF.get(str);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        if (objInvoke == null) {
            objInvoke = newInstanceCreator.invoke();
        }
        return objInvoke;
    }

    public static /* synthetic */ void k(c cVar, Object value, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: overrideDependency");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            str = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        cVar.f().put(str, value);
    }

    public static /* synthetic */ Object m(c cVar, String str, Function0 newInstanceCreator, int i10, Object obj) {
        Object obj2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerDependency");
        }
        int i11 = 1;
        int i12 = 4 >> i11;
        if ((i10 & i11) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        synchronized (cVar.g()) {
            if (str == null) {
                try {
                    Intrinsics.reifiedOperationMarker(4, "Dependency");
                    str = Object.class.getName();
                    Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
                } finally {
                    h0.d(i11);
                    h0.c(i11);
                }
            }
            ConcurrentHashMap<String, Object> concurrentHashMapG = cVar.g();
            obj2 = concurrentHashMapG.get(str);
            if (obj2 == null) {
                Object objInvoke = newInstanceCreator.invoke();
                Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(str, objInvoke);
                obj2 = objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
            }
            Intrinsics.reifiedOperationMarker(i11, "Dependency");
            h0.d(2);
        }
        return obj2;
    }

    public static /* synthetic */ Object p(c cVar, String str, Function0 newInstanceCreator, int i10, Object obj) {
        String name;
        Object obj2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: singleton");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        ConcurrentHashMap<String, Object> concurrentHashMapF = cVar.f();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            name = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        } else {
            name = str;
        }
        Object obj3 = concurrentHashMapF.get(name);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        if (obj3 != null) {
            return obj3;
        }
        synchronized (cVar.g()) {
            if (str == null) {
                try {
                    Intrinsics.reifiedOperationMarker(4, "Dependency");
                    str = Object.class.getName();
                    Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
                } catch (Throwable th2) {
                    h0.d(1);
                    h0.c(1);
                    throw th2;
                }
            }
            ConcurrentHashMap<String, Object> concurrentHashMapG = cVar.g();
            obj2 = concurrentHashMapG.get(str);
            if (obj2 == null) {
                Object objInvoke = newInstanceCreator.invoke();
                Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(str, objInvoke);
                obj2 = objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
            }
            Intrinsics.reifiedOperationMarker(1, "Dependency");
            h0.d(2);
        }
        h0.c(2);
        return obj2;
    }

    public final /* synthetic */ <Dependency> String a(String str) {
        if (str != null) {
            return str;
        }
        Intrinsics.reifiedOperationMarker(4, "Dependency");
        String name = Object.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final /* synthetic */ <Dependency> Dependency b(String str, Function0<? extends Dependency> newInstanceCreator) {
        Dependency dependency;
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        synchronized (g()) {
            int i10 = 1;
            if (str == null) {
                try {
                    Intrinsics.reifiedOperationMarker(4, "Dependency");
                    str = Object.class.getName();
                    Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
                } finally {
                    h0.d(i10);
                    h0.c(i10);
                }
            }
            ConcurrentHashMap<String, Object> concurrentHashMapG = g();
            dependency = (Dependency) concurrentHashMapG.get(str);
            if (dependency == null) {
                Dependency dependencyInvoke = newInstanceCreator.invoke();
                Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(str, dependencyInvoke);
                dependency = objPutIfAbsent == null ? dependencyInvoke : (Dependency) objPutIfAbsent;
            }
            Intrinsics.reifiedOperationMarker(i10, "Dependency");
            h0.d(2);
        }
        return dependency;
    }

    public final /* synthetic */ <Dependency> Dependency c(String str) {
        String name;
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            name = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        } else {
            name = str;
        }
        Dependency dependency = (Dependency) concurrentHashMapF.get(name);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        if (dependency != null) {
            return dependency;
        }
        ConcurrentHashMap<String, Object> concurrentHashMapG = g();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            str = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        Dependency dependency2 = (Dependency) concurrentHashMapG.get(str);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        return dependency2;
    }

    public final /* synthetic */ <Dependency> Dependency e(String str) {
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            str = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        Dependency dependency = (Dependency) concurrentHashMapF.get(str);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        return dependency;
    }

    @NotNull
    public final ConcurrentHashMap<String, Object> f() {
        return this.f274881a;
    }

    @NotNull
    public final ConcurrentHashMap<String, Object> g() {
        return this.f274882b;
    }

    public final /* synthetic */ <Dependency> Dependency h(String str, Function0<? extends Dependency> newInstanceCreator) {
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            str = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        Dependency dependencyInvoke = (Dependency) concurrentHashMapF.get(str);
        Intrinsics.reifiedOperationMarker(2, "Dependency");
        if (dependencyInvoke == null) {
            dependencyInvoke = newInstanceCreator.invoke();
        }
        return dependencyInvoke;
    }

    public final /* synthetic */ <Dependency> void j(Dependency value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            str = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        f().put(str, value);
    }

    public final /* synthetic */ <Dependency> Dependency l(String str, Function0<? extends Dependency> newInstanceCreator) {
        Dependency dependency;
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        synchronized (g()) {
            int i10 = 1;
            if (str == null) {
                try {
                    Intrinsics.reifiedOperationMarker(4, "Dependency");
                    str = Object.class.getName();
                    Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
                } finally {
                    h0.d(i10);
                    h0.c(i10);
                }
            }
            ConcurrentHashMap<String, Object> concurrentHashMapG = g();
            dependency = (Dependency) concurrentHashMapG.get(str);
            if (dependency == null) {
                Dependency dependencyInvoke = newInstanceCreator.invoke();
                Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(str, dependencyInvoke);
                dependency = objPutIfAbsent == null ? dependencyInvoke : (Dependency) objPutIfAbsent;
            }
            Intrinsics.reifiedOperationMarker(i10, "Dependency");
            h0.d(2);
        }
        return dependency;
    }

    @i
    @rg.a
    public void n() {
        synchronized (this.f274881a) {
            try {
                this.f274881a.clear();
                Unit unit = Unit.f312394a;
            } finally {
            }
        }
        synchronized (this.f274882b) {
            this.f274882b.clear();
        }
    }

    public final /* synthetic */ <Dependency> Dependency o(String str, Function0<? extends Dependency> newInstanceCreator) {
        String name;
        Dependency dependency;
        Intrinsics.checkNotNullParameter(newInstanceCreator, "newInstanceCreator");
        ConcurrentHashMap<String, Object> concurrentHashMapF = f();
        if (str == null) {
            Intrinsics.reifiedOperationMarker(4, "Dependency");
            name = Object.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        } else {
            name = str;
        }
        Dependency dependency2 = (Dependency) concurrentHashMapF.get(name);
        int i10 = 2;
        Intrinsics.reifiedOperationMarker(i10, "Dependency");
        if (dependency2 != null) {
            return dependency2;
        }
        synchronized (g()) {
            int i11 = 1;
            if (str == null) {
                try {
                    Intrinsics.reifiedOperationMarker(4, "Dependency");
                    str = Object.class.getName();
                    Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
                } finally {
                    h0.d(i11);
                    h0.c(i11);
                }
            }
            ConcurrentHashMap<String, Object> concurrentHashMapG = g();
            dependency = (Dependency) concurrentHashMapG.get(str);
            if (dependency == null) {
                Dependency dependencyInvoke = newInstanceCreator.invoke();
                Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(str, dependencyInvoke);
                dependency = objPutIfAbsent == null ? dependencyInvoke : (Dependency) objPutIfAbsent;
            }
            Intrinsics.reifiedOperationMarker(i11, "Dependency");
            h0.d(i10);
        }
        return dependency;
    }
}
