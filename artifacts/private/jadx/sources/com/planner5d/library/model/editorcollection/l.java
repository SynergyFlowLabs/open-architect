package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.y;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStorageUsedInProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageUsedInProject.kt\ncom/planner5d/library/model/editorcollection/StorageUsedInProject\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n13409#2:35\n13410#2:37\n1#3:36\n1062#4:38\n1557#4:39\n1628#4,3:40\n1062#4:43\n1557#4:44\n1628#4,3:45\n*S KotlinDebug\n*F\n+ 1 StorageUsedInProject.kt\ncom/planner5d/library/model/editorcollection/StorageUsedInProject\n*L\n24#1:35\n24#1:37\n29#1:38\n29#1:39\n29#1:40,3\n30#1:43\n30#1:44\n30#1:45,3\n*E\n"})
public final class l implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f180712c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f180713d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final ItemProject f180714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.model.manager.builtin.i f180715b;

    public static final class a extends k<l, Pair<? extends ItemProject, ? extends com.planner5d.library.model.manager.builtin.i>> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.planner5d.library.model.editorcollection.k
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l a(@NotNull Pair<? extends ItemProject, ? extends com.planner5d.library.model.manager.builtin.i> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new l(data.getFirst(), data.getSecond(), null);
        }

        @Override // com.planner5d.library.model.editorcollection.k
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(@NotNull l storage, @NotNull Pair<? extends ItemProject, ? extends com.planner5d.library.model.manager.builtin.i> data) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(data, "data");
            return Intrinsics.areEqual(storage.f180714a, data.getFirst()) && Intrinsics.areEqual(storage.f180715b, data.getSecond());
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 StorageUsedInProject.kt\ncom/planner5d/library/model/editorcollection/StorageUsedInProject\n*L\n1#1,121:1\n29#2:122\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f180716a;

        public b(Map map) {
            this.f180716a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l((Integer) this.f180716a.get((String) t11), (Integer) this.f180716a.get((String) t10));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 StorageUsedInProject.kt\ncom/planner5d/library/model/editorcollection/StorageUsedInProject\n*L\n1#1,121:1\n30#2:122\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f180717a;

        public c(Map map) {
            this.f180717a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l((Integer) this.f180717a.get(Integer.valueOf(((Number) t11).intValue())), (Integer) this.f180717a.get(Integer.valueOf(((Number) t10).intValue())));
        }
    }

    public /* synthetic */ l(ItemProject itemProject, com.planner5d.library.model.manager.builtin.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemProject, iVar);
    }

    @Override // com.planner5d.library.model.editorcollection.i
    @NotNull
    public List<g.b> a(boolean z10) {
        ItemMaterial[] materialsEditable;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ItemProject itemProject = this.f180714a;
        if (itemProject != null && (materialsEditable = itemProject.getMaterialsEditable(this.f180715b)) != null) {
            for (ItemMaterial itemMaterial : materialsEditable) {
                int colorMain = itemMaterial.getColorMain();
                Integer numValueOf = Integer.valueOf(colorMain);
                Integer num = (Integer) linkedHashMap2.get(Integer.valueOf(colorMain));
                linkedHashMap2.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                y yVar = itemMaterial.texture;
                if (yVar != null && (str = yVar.f222851c) != null) {
                    Integer num2 = (Integer) linkedHashMap.get(str);
                    linkedHashMap.put(str, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        List listSortedWith = CollectionsKt.sortedWith(linkedHashMap.keySet(), new b(linkedHashMap));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList2.add(d.j(d.f180686a, (String) it.next(), null, 2, null));
        }
        arrayList.addAll(arrayList2);
        List listSortedWith2 = CollectionsKt.sortedWith(linkedHashMap2.keySet(), new c(linkedHashMap2));
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
        Iterator it2 = listSortedWith2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(com.planner5d.library.model.editorcollection.b.f180684a.d(((Number) it2.next()).intValue()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    private l(ItemProject itemProject, com.planner5d.library.model.manager.builtin.i iVar) {
        this.f180714a = itemProject;
        this.f180715b = iVar;
    }
}
