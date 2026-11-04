package com.planner5d.library.model.converter.json.from;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemMaterialSets;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.model.item.model2d.Model2DPart;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class c0 implements ib.a<Pair<JSONObject, CatalogItem>, Model2D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected p0 f180577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected z f180578b;

    @ij.a
    public c0() {
    }

    private Model2DPart c(JSONObject jSONObject, ItemMaterial[] itemMaterialArr) throws JSONException {
        int[] iArrE;
        int[][] iArr;
        int iF = f(jSONObject.getString(com.planner5d.library.services.r.type.f224891a));
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.paths;
        if (jSONObject.has(rVar.f224891a) && iF == 0) {
            JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
            int[][] iArr2 = new int[jSONArray.length()][];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                iArr2[i10] = e(jSONArray.getJSONArray(i10));
            }
            iArr = iArr2;
            iArrE = null;
        } else {
            iArrE = e(jSONObject.getJSONArray(com.planner5d.library.services.r.points.f224891a));
            iArr = null;
        }
        Integer numP = k1.p(jSONObject, com.planner5d.library.services.r.material);
        return new Model2DPart(iF, iArrE, iArr, jSONObject.getBoolean(com.planner5d.library.services.r.closed.f224891a), (numP == null || numP.intValue() < 0 || numP.intValue() >= itemMaterialArr.length) ? null : itemMaterialArr[numP.intValue()], this.f180577a.c(jSONObject.getString(com.planner5d.library.services.r.stroke.f224891a), k1.f(jSONObject, com.planner5d.library.services.r.strokeOpacity, 1.0d)), k1.m(jSONObject, com.planner5d.library.services.r.strokeWidth, 1), this.f180577a.c(k1.w(jSONObject, com.planner5d.library.services.r.fill, null), k1.f(jSONObject, com.planner5d.library.services.r.fillOpacity, 1.0d)));
    }

    private Model2DPart[] d(JSONArray jSONArray, ItemMaterial[] itemMaterialArr) throws JSONException {
        Model2DPart[] model2DPartArr = new Model2DPart[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            model2DPartArr[i10] = c(jSONArray.getJSONObject(i10), itemMaterialArr);
        }
        return model2DPartArr;
    }

    @NonNull
    private int[] e(@NonNull JSONArray jSONArray) throws JSONException {
        int[] iArr = new int[jSONArray.length() * 2];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            int i11 = i10 * 2;
            iArr[i11] = jSONArray2.getInt(0);
            iArr[i11 + 1] = jSONArray2.getInt(1);
        }
        return iArr;
    }

    private int f(String str) throws JSONException {
        str.getClass();
        switch (str) {
            case "ellipse":
                return 4;
            case "circle":
                return 3;
            case "square":
                return 1;
            case "line":
                return 0;
            case "curve":
                return 2;
            default:
                throw new JSONException("Unsupported part type");
        }
    }

    @Override // ib.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Model2D convert(Pair<JSONObject, CatalogItem> pair) throws JSONException {
        JSONObject jSONObject = (JSONObject) pair.first;
        Object obj = pair.second;
        return b(jSONObject, ((CatalogItem) obj).metadata == null ? null : ((CatalogItem) obj).metadata.materialSets);
    }

    @NonNull
    public Model2D b(@NonNull JSONObject jSONObject, @androidx.annotation.p0 ItemMaterialSets itemMaterialSets) throws JSONException {
        ItemMaterial[] itemMaterialArrConvert = this.f180578b.convert(jSONObject);
        Model2DPart[] model2DPartArrD = d(jSONObject.getJSONArray(com.planner5d.library.services.r.items.f224891a), itemMaterialArrConvert);
        boolean z10 = false;
        int iM = k1.m(jSONObject, com.planner5d.library.services.r.level, 0);
        float fH = k1.h(jSONObject, com.planner5d.library.services.r.otf, 0.0f);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.ds;
        if (jSONObject.has(rVar.f224891a) && "1".equals(jSONObject.getString(rVar.f224891a))) {
            z10 = true;
        }
        return new Model2D(model2DPartArrD, iM, itemMaterialArrConvert, itemMaterialSets, fH, z10, k1.o(jSONObject, com.planner5d.library.services.r.bounds), k1.o(jSONObject, com.planner5d.library.services.r.boundsClosed), k1.o(jSONObject, com.planner5d.library.services.r.size2D));
    }
}
