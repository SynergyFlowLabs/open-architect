package com.planner5d.library.widget.editor.popup.itemproperties;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.manager.k5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPopupSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopupSerializer.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/PopupSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1557#2:74\n1628#2,3:75\n37#3,2:78\n11165#4:80\n11500#4,3:81\n1310#4,2:85\n1#5:84\n*S KotlinDebug\n*F\n+ 1 PopupSerializer.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/PopupSerializer\n*L\n27#1:74\n27#1:75,3\n27#1:78,2\n31#1:80\n31#1:81,3\n52#1:85,2\n*E\n"})
public final class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f257894e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.converter.json.to.w f257895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.converter.json.from.x f257896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f257897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k5 f257898d;

    @ij.a
    public y(@NotNull com.planner5d.library.model.converter.json.to.w fromMaterial, @NotNull com.planner5d.library.model.converter.json.from.x toMaterial, @NotNull com.planner5d.library.application.b application, @NotNull k5 textureManager) {
        Intrinsics.checkNotNullParameter(fromMaterial, "fromMaterial");
        Intrinsics.checkNotNullParameter(toMaterial, "toMaterial");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        this.f257895a = fromMaterial;
        this.f257896b = toMaterial;
        this.f257897c = application;
        this.f257898d = textureManager;
    }

    public final void a(@Nullable Bundle bundle, @NotNull ze.a selection) {
        com.planner5d.library.engine.rendering.util.i iVar;
        com.planner5d.library.engine.rendering.util.f fVar;
        Float f10;
        Float f11;
        Float f12;
        Float f13;
        Intrinsics.checkNotNullParameter(selection, "selection");
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.model.z zVar = null;
        String strT = jVar.t(com.planner5d.library.services.r.popupSelectedTextureGroup, null);
        String strT2 = jVar.t(com.planner5d.library.services.r.popupSelectedMaterial, null);
        if (Intrinsics.areEqual(strT2, AbstractJsonLexerKt.NULL)) {
            strT2 = null;
        }
        if (strT2 == null) {
            strT2 = "{}";
        }
        ItemMaterial itemMaterialB = this.f257896b.b(new JSONObject(strT2), 0);
        selection.b().r(itemMaterialB);
        c1<com.planner5d.library.model.z> c1VarD = selection.d();
        com.planner5d.library.model.z[] zVarArrE = this.f257898d.E(true);
        Intrinsics.checkNotNullExpressionValue(zVarArrE, "getTextureGroupsUser(...)");
        for (com.planner5d.library.model.z zVar2 : zVarArrE) {
            if (Intrinsics.areEqual(zVar2.a(this.f257897c), strT)) {
                zVar = zVar2;
                break;
            }
        }
        c1VarD.r(zVar);
        c1<ze.c> c1VarC = selection.c();
        com.planner5d.library.model.y yVar = itemMaterialB.texture;
        int colorInt = itemMaterialB.isOnlyColor ? itemMaterialB.getColorInt() : itemMaterialB.getColorTextureInt();
        com.planner5d.library.model.y yVar2 = itemMaterialB.texture;
        float fFloatValue = (yVar2 == null || (f13 = yVar2.f222852d) == null) ? 1.0f : f13.floatValue();
        com.planner5d.library.model.y yVar3 = itemMaterialB.texture;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = (yVar3 == null || (f12 = yVar3.f222853e) == null) ? 0.0f : f12.floatValue();
        com.planner5d.library.model.y yVar4 = itemMaterialB.texture;
        if (yVar4 == null || (iVar = yVar4.f222857i) == null) {
            iVar = com.planner5d.library.engine.rendering.util.i.RepeatXY;
        }
        com.planner5d.library.engine.rendering.util.i iVar2 = iVar;
        if (yVar4 == null || (fVar = yVar4.f222858j) == null) {
            fVar = com.planner5d.library.engine.rendering.util.f.Center;
        }
        com.planner5d.library.engine.rendering.util.f fVar2 = fVar;
        float fFloatValue4 = (yVar4 == null || (f11 = yVar4.f222854f) == null) ? 0.0f : f11.floatValue();
        com.planner5d.library.model.y yVar5 = itemMaterialB.texture;
        if (yVar5 != null && (f10 = yVar5.f222855g) != null) {
            fFloatValue2 = f10.floatValue();
        }
        c1VarC.r(new ze.c(yVar, colorInt, fFloatValue, fFloatValue3, iVar2, fVar2, fFloatValue4, fFloatValue2));
        jVar.e();
    }

    public final void b(@NotNull ArrayDeque<v.a> backStack, @Nullable String[] strArr) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(backStack, "backStack");
        backStack.clear();
        if (strArr != null) {
            listEmptyList = new ArrayList<>(strArr.length);
            for (String str : strArr) {
                listEmptyList.add(v.a.valueOf(str));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        backStack.addAll(listEmptyList);
    }

    @NotNull
    public final Bundle c(@Nullable ItemMaterial itemMaterial) {
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        if (itemMaterial != null) {
            iVar.j(com.planner5d.library.services.r.material, itemMaterial.name);
        }
        return iVar.a();
    }

    @NotNull
    public final Bundle d(@NotNull ze.a selection) {
        Item itemH;
        Intrinsics.checkNotNullParameter(selection, "selection");
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        try {
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.popupSelectedItemUid;
            ze.b bVarF = selection.a().f();
            iVar.j(rVar, (bVarF == null || (itemH = bVarF.h()) == null) ? null : itemH.getUid());
            iVar.j(com.planner5d.library.services.r.popupSelectedMaterial, String.valueOf(this.f257895a.convert(selection.b().f())));
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.popupSelectedTextureGroup;
            com.planner5d.library.model.z zVarF = selection.d().f();
            iVar.j(rVar2, zVarF != null ? zVarF.a(this.f257897c) : null);
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
        }
        return iVar.a();
    }

    @NotNull
    public final String[] e(@NotNull ArrayDeque<v.a> backStack) {
        Intrinsics.checkNotNullParameter(backStack, "backStack");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(backStack, 10));
        Iterator<v.a> it = backStack.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().name());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
