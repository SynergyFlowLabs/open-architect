package io.ktor.serialization.kotlinx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nio/ktor/serialization/kotlinx/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1617#2,9:45\n1869#2:54\n1870#2:56\n1626#2:57\n1#3:55\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nio/ktor/serialization/kotlinx/ExtensionsKt\n*L\n17#1:45,9\n17#1:54\n17#1:56\n17#1:57\n17#1:55\n*E\n"})
public final class b {
    @NotNull
    public static final List<e> a(@NotNull x format) {
        Intrinsics.checkNotNullParameter(format, "format");
        List<f> listA = a.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            e eVarA = ((f) it.next()).a(format);
            if (eVarA != null) {
                arrayList.add(eVarA);
            }
        }
        return arrayList;
    }
}
