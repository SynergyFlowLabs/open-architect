package com.planner5d.library.smartwizard.interactor;

import com.planner5d.library.model.manager.w;
import com.planner5d.library.services.utility.k1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nGetDecorElementsInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDecorElementsInteractor.kt\ncom/planner5d/library/smartwizard/interactor/GetDecorElementsInteractor\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n158#2:33\n1#3:34\n*S KotlinDebug\n*F\n+ 1 GetDecorElementsInteractor.kt\ncom/planner5d/library/smartwizard/interactor/GetDecorElementsInteractor\n*L\n20#1:33\n20#1:34\n*E\n"})
public final class a implements ce.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f229924a;

    @ij.a
    public a(@NotNull w featureConfigManager) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f229924a = featureConfigManager;
    }

    @Override // ce.a
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super List<com.planner5d.library.smartwizard.data.a>> dVar) {
        JSONObject jSONObjectD;
        com.planner5d.library.model.manager.config.g gVarB = this.f229924a.b(com.planner5d.library.model.manager.config.f.AiDesignerDecoratorConfig);
        if (gVarB == null || (jSONObjectD = gVarB.d()) == null) {
            return CollectionsKt.emptyList();
        }
        try {
            JSONArray jSONArray = jSONObjectD.getJSONArray("items");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                int i11 = 3 & 0;
                String strZ = k1.z((JSONObject) obj, "name", null, 4, null);
                String str = "";
                if (strZ == null) {
                    strZ = "";
                }
                String strZ2 = k1.z((JSONObject) obj, "category", null, 4, null);
                if (strZ2 == null) {
                    strZ2 = "";
                }
                String strZ3 = k1.z((JSONObject) obj, "localization_key", null, 4, null);
                if (strZ3 != null) {
                    str = strZ3;
                }
                arrayList.add(new com.planner5d.library.smartwizard.data.a(strZ, strZ2, str));
            }
            return arrayList;
        } catch (JSONException unused) {
            return CollectionsKt.emptyList();
        }
    }
}
