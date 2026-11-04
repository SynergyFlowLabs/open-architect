package com.planner5d.library.userimporteddata;

import androidx.annotation.m1;
import com.planner5d.library.database.ApplicationDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@ij.f
@SourceDebugExtension({"SMAP\nLocalUserImportedMetadataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalUserImportedMetadataSource.kt\ncom/planner5d/library/userimporteddata/LocalUserImportedMetadataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n15#1:42\n15#1:47\n1557#2:43\n1628#2,3:44\n1557#2:48\n1628#2,3:49\n*S KotlinDebug\n*F\n+ 1 LocalUserImportedMetadataSource.kt\ncom/planner5d/library/userimporteddata/LocalUserImportedMetadataSource\n*L\n20#1:42\n33#1:47\n22#1:43\n22#1:44,3\n34#1:48\n34#1:49,3\n*E\n"})
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ApplicationDatabase f231257a;

    @ij.a
    public b(@NotNull ApplicationDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f231257a = database;
    }

    private final com.planner5d.library.database.model.l b() {
        return this.f231257a.j();
    }

    @Override // com.planner5d.library.userimporteddata.k
    @m1
    @NotNull
    public List<p> a(@NotNull String modelHash) throws Exception {
        Intrinsics.checkNotNullParameter(modelHash, "modelHash");
        List<com.planner5d.library.database.model.k> listA = this.f231257a.j().a(modelHash);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        for (com.planner5d.library.database.model.k kVar : listA) {
            String strC = kVar.c();
            d dVarA = d.f231259b.a(kVar.b());
            if (dVarA == null) {
                throw new IllegalArgumentException("Unknown format code is encountered");
            }
            arrayList.add(new p(strC, dVarA, kVar.e(), kVar.a(), kVar.d()));
        }
        return arrayList;
    }

    @m1
    public final void c(@NotNull List<p> metadataEntries) {
        Intrinsics.checkNotNullParameter(metadataEntries, "metadataEntries");
        com.planner5d.library.database.model.l lVarJ = this.f231257a.j();
        List<p> list = metadataEntries;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (p pVar : list) {
            arrayList.add(new com.planner5d.library.database.model.k(pVar.c(), pVar.b().l(), pVar.e(), pVar.a(), pVar.d()));
        }
        lVarJ.b(arrayList);
    }
}
