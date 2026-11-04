package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1611#2,9:130\n1863#2:139\n1864#2:141\n1620#2:142\n1557#2:143\n1628#2,3:144\n1#3:140\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n108#1:130,9\n108#1:139\n108#1:141\n108#1:142\n123#1:143\n123#1:144,3\n108#1:140\n*E\n"})
public final class n2 {
    @lm.n
    public static final void a() {
        m2.f36255a.a();
    }

    @kotlin.l(message = "currentCompositionErrors only reports errors that extend from Exception. This method is unsupported outside of Compose runtime tests. Internally, getCurrentCompositionErrors should be used instead.")
    @lm.n
    @NotNull
    public static final List<Pair<Exception, Boolean>> b() {
        List<Pair<Throwable, Boolean>> listD = d();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Throwable th2 = (Throwable) pair.component1();
            Boolean bool = (Boolean) pair.component2();
            bool.booleanValue();
            Exception exc = th2 instanceof Exception ? (Exception) th2 : null;
            Pair pair2 = exc != null ? TuplesKt.to(exc, bool) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        return arrayList;
    }

    @lm.n
    public static final void c() {
        c5.D.l(false);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @lm.n
    @NotNull
    public static final List<Pair<Throwable, Boolean>> d() {
        List<f5> listB = m2.f36255a.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
        for (f5 f5Var : listB) {
            arrayList.add(TuplesKt.to(f5Var.a(), Boolean.valueOf(f5Var.b())));
        }
        return arrayList;
    }

    @lm.n
    public static final void e(int i10) {
        m2.f36255a.c(i10);
    }

    @lm.n
    public static final void f(@NotNull Object obj) {
        m2.f36255a.f(obj);
    }
}
