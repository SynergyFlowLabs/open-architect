package com.planner5d.library.services.download;

import androidx.compose.runtime.internal.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMaterialInfoHashesFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialInfoHashesFilter.kt\ncom/planner5d/library/services/download/MaterialInfoHashesFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1557#2:19\n1628#2,3:20\n1#3:23\n*S KotlinDebug\n*F\n+ 1 MaterialInfoHashesFilter.kt\ncom/planner5d/library/services/download/MaterialInfoHashesFilter\n*L\n8#1:19\n8#1:20,3\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f224290d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, com.planner5d.library.model.p> f224291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f224292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f224293c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<com.planner5d.library.model.p.b> f224294a = kotlin.enums.c.c(com.planner5d.library.model.p.b.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull Map<String, ? extends com.planner5d.library.model.p> targetMaterials) {
        Intrinsics.checkNotNullParameter(targetMaterials, "targetMaterials");
        this.f224291a = targetMaterials;
        kotlin.enums.a<com.planner5d.library.model.p.b> aVar = a.f224294a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(aVar, 10));
        Iterator<com.planner5d.library.model.p.b> it = aVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().f222457a));
        }
        this.f224292b = CollectionsKt.toIntArray(arrayList);
        this.f224293c = "webp";
    }

    public final boolean a(@NotNull com.planner5d.library.model.l hashMetadata) {
        com.planner5d.library.model.p.c cVar;
        String str;
        Intrinsics.checkNotNullParameter(hashMetadata, "hashMetadata");
        Integer numB = hashMetadata.b();
        if ((numB != null ? ArraysKt.contains(this.f224292b, numB.intValue()) : false) && Intrinsics.areEqual(hashMetadata.c(), this.f224293c)) {
            com.planner5d.library.model.p pVar = this.f224291a.get(hashMetadata.d());
            String strB5 = null;
            int i10 = 3 << 0;
            if (pVar != null && (cVar = pVar.f222443e) != null && (str = cVar.f222458a) != null) {
                strB5 = StringsKt.B5(str, ".", null, 2, null);
            }
            if (Intrinsics.areEqual(strB5, hashMetadata.a())) {
                return true;
            }
        }
        return false;
    }
}
