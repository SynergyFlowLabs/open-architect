package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorEditItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorEditItem.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorEditItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1863#2,2:104\n1310#3,2:106\n1310#3,2:108\n13409#3,2:115\n13409#3,2:117\n163#4,3:110\n167#4:114\n1#5:113\n*S KotlinDebug\n*F\n+ 1 HelperEditorEditItem.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorEditItem\n*L\n29#1:104,2\n49#1:106,2\n52#1:108,2\n85#1:115,2\n94#1:117,2\n66#1:110,3\n66#1:114\n66#1:113\n*E\n"})
public final class c2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f256207f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f256208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.h f256209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f256210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.converter.json.from.x f256211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.converter.json.from.z f256212e;

    public c2(@NotNull g1 helperEditor, @NotNull com.planner5d.library.widget.editor.facade.h facade, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.model.converter.json.from.x toMaterial, @NotNull com.planner5d.library.model.converter.json.from.z toMaterials) {
        Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(toMaterial, "toMaterial");
        Intrinsics.checkNotNullParameter(toMaterials, "toMaterials");
        this.f256208a = helperEditor;
        this.f256209b = facade;
        this.f256210c = builtInDataManager;
        this.f256211d = toMaterial;
        this.f256212e = toMaterials;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<org.json.JSONObject>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    private final List<JSONObject> a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ?? EmptyList;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(com.planner5d.library.services.r.materials.f224891a)) != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                EmptyList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                    EmptyList.add(jSONObject2);
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            if (EmptyList != 0) {
                return EmptyList;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final boolean c(Item item, List<? extends JSONObject> list) {
        Item item2;
        for (JSONObject jSONObject : list) {
            int iH = h(item, com.planner5d.library.services.utility.k1.z(jSONObject, com.planner5d.library.services.r.itemMaterialName.f224891a, null, 4, null));
            if (iH < 0) {
                item2 = item;
            } else {
                try {
                    ItemMaterial itemMaterialB = this.f256211d.b(jSONObject, iH);
                    ItemMaterial itemMaterialG = g(item, iH);
                    l1 l1Var = l1.f256518a;
                    g1 g1Var = this.f256208a;
                    ItemProject item3 = this.f256209b.getItem();
                    Intrinsics.checkNotNull(itemMaterialB);
                    item2 = item;
                    if (!l1Var.m(g1Var, item3, item2, itemMaterialB, itemMaterialG, this.f256210c)) {
                        return false;
                    }
                } catch (JSONException e10) {
                    timber.log.b.f381052a.e(e10);
                    return false;
                }
            }
            item = item2;
        }
        return true;
    }

    private final boolean d(Item item, Map<String, ? extends ItemMaterial> map) {
        Item item2;
        ItemMaterial[] materials = item.getMaterials();
        if (materials == null) {
            return true;
        }
        int length = materials.length;
        int i10 = 0;
        while (i10 < length) {
            ItemMaterial itemMaterial = materials[i10];
            ItemMaterial itemMaterial2 = map.get(itemMaterial.name);
            if (itemMaterial2 == null) {
                item2 = item;
            } else {
                item2 = item;
                if (!l1.f256518a.m(this.f256208a, this.f256209b.getItem(), item2, itemMaterial2, itemMaterial, this.f256210c)) {
                    return false;
                }
            }
            i10++;
            item = item2;
        }
        return true;
    }

    private final boolean e(ItemRoom itemRoom, Map<String, ? extends ItemMaterial> map) {
        ItemWall[] children = itemRoom.getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "getChildren(...)");
        for (ItemWall itemWall : children) {
            Intrinsics.checkNotNull(itemWall);
            if (!d(itemWall, map)) {
                return false;
            }
        }
        Intrinsics.checkNotNull(itemRoom, "null cannot be cast to non-null type com.planner5d.library.model.item.Item");
        return d(itemRoom, map);
    }

    private final Item f(String str) {
        com.planner5d.library.widget.editor.a aVarB = this.f256209b.b();
        ItemProject item = this.f256209b.getItem();
        if (aVarB != null && item != null) {
            return item.getActiveFloor().getChild(str);
        }
        return null;
    }

    private final ItemMaterial g(Item item, int i10) {
        ItemMaterial[] materials;
        if (item != null && (materials = item.getMaterials()) != null) {
            for (ItemMaterial itemMaterial : materials) {
                if (itemMaterial.position == i10) {
                    return itemMaterial;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    private final int h(Item item, String str) {
        ItemMaterial[] materials;
        if (item == null || (materials = item.getMaterials()) == null) {
            return -1;
        }
        for (ItemMaterial itemMaterial : materials) {
            if (Intrinsics.areEqual(itemMaterial.name, str)) {
                if (itemMaterial != null) {
                    return itemMaterial.position;
                }
                return -1;
            }
        }
        itemMaterial = null;
        if (itemMaterial != null) {
            return itemMaterial.position;
        }
        return -1;
    }

    public final void b(@NotNull String puid, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        try {
            Item itemF = f(puid);
            if (itemF == null) {
                return;
            }
            if (itemF instanceof ItemRoom) {
                Map<String, ItemMaterial> mapB = this.f256212e.b(jSONObject);
                Intrinsics.checkNotNullExpressionValue(mapB, "convertMap(...)");
                e((ItemRoom) itemF, mapB);
            } else {
                if (itemF instanceof ItemGround) {
                    return;
                }
                if (!(itemF instanceof ItemWalls) && !(itemF instanceof ItemWall)) {
                    c(itemF, a(jSONObject));
                    return;
                }
                Map<String, ItemMaterial> mapB2 = this.f256212e.b(jSONObject);
                Intrinsics.checkNotNullExpressionValue(mapB2, "convertMap(...)");
                d(itemF, mapB2);
            }
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
        }
    }
}
