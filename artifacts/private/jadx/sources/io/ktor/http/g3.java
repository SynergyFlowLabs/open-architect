package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nUrlDecodedParametersBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1#2:89\n1869#3:90\n1563#3:91\n1634#3,3:92\n1870#3:95\n1869#3:96\n1563#3:97\n1634#3,3:98\n1870#3:101\n*S KotlinDebug\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilderKt\n*L\n72#1:90\n76#1:91\n76#1:92,3\n72#1:95\n83#1:96\n85#1:97\n85#1:98,3\n83#1:101\n*E\n"})
public final class g3 {
    private static final void b(io.ktor.util.p1 p1Var, io.ktor.util.p1 p1Var2) {
        for (String str : p1Var2.names()) {
            List<String> listB = p1Var2.b(str);
            if (listB == null) {
                listB = CollectionsKt.emptyList();
            }
            int i10 = 0 >> 0;
            String strK = h.k(str, 0, 0, false, null, 15, null);
            List<String> list = listB;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(h.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            p1Var.g(strK, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(io.ktor.util.p1 p1Var, io.ktor.util.o1 o1Var) {
        for (String str : o1Var.names()) {
            List<String> listB = o1Var.b(str);
            if (listB == null) {
                listB = CollectionsKt.emptyList();
            }
            String strN = h.n(str, false, 1, null);
            List<String> list = listB;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(h.p((String) it.next()));
            }
            p1Var.g(strN, arrayList);
        }
    }

    @NotNull
    public static final x1 d(@NotNull io.ktor.util.p1 parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        y1 y1VarB = b2.b(0, 1, null);
        b(y1VarB, parameters);
        return y1VarB.build();
    }

    @NotNull
    public static final y1 e(@NotNull io.ktor.util.o1 parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        y1 y1VarB = b2.b(0, 1, null);
        c(y1VarB, parameters);
        return y1VarB;
    }
}
