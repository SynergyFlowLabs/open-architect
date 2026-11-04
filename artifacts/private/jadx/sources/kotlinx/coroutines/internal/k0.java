package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1971#2,14:131\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n34#1:131,14\n*E\n"})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k0 f315084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f315085b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a3 f315086c;

    static {
        k0 k0Var = new k0();
        f315084a = k0Var;
        c1.f("kotlinx.coroutines.fast.service.loader", true);
        f315086c = k0Var.a();
    }

    private k0() {
    }

    private final a3 a() {
        Object next;
        a3 a3VarF;
        try {
            List listC3 = kotlin.sequences.o.c3(kotlin.sequences.o.e(ServiceLoader.load(j0.class, j0.class.getClassLoader()).iterator()));
            Iterator it = listC3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iA = ((j0) next).a();
                    do {
                        Object next2 = it.next();
                        int iA2 = ((j0) next2).a();
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            j0 j0Var = (j0) next;
            if (j0Var != null && (a3VarF = l0.f(j0Var, listC3)) != null) {
                return a3VarF;
            }
            return l0.b(null, null, 3, null);
        } catch (Throwable th2) {
            return l0.b(th2, null, 2, null);
        }
    }
}
