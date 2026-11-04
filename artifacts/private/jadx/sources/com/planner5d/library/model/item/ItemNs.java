package com.planner5d.library.model.item;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.services.r;
import com.planner5d.library.widget.editor.editor2d.drawable.j;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ItemNs extends Item {
    private static final Pattern MATERIAL_EDITABLE = Pattern.compile("^([0-9]+_{1,2}|)(color|chrome).*$");
    private String attachedTo;
    private boolean closed;
    private final ItemMaterial[] materials;
    protected Model2D model;
    private final String modelId;
    private JSONObject stored;

    public ItemNs(String str, String str2, @NonNull Model2D model2D) {
        super(str);
        this.closed = false;
        this.attachedTo = null;
        this.stored = null;
        this.model = model2D;
        this.modelId = str2;
        this.materials = ItemMaterial.clone(model2D.materials);
        ItemMaterialSets itemMaterialSets = model2D.materialSets;
        if (itemMaterialSets == null || itemMaterialSets.get() == null) {
            return;
        }
        setMaterialSet(model2D.materialSets.getDefault());
        this.stored = null;
    }

    @m1
    private boolean isMaterialEditable(ItemMaterial itemMaterial, i iVar) {
        String str;
        if (!iVar.U(itemMaterial.texture) && ((str = itemMaterial.name) == null || !MATERIAL_EDITABLE.matcher(str.toLowerCase(Locale.ENGLISH)).matches())) {
            return false;
        }
        return true;
    }

    protected j createDrawableModel(Model2D model2D, ItemMaterial[] itemMaterialArr) {
        return new j(model2D, itemMaterialArr, false);
    }

    @Override // com.planner5d.library.model.item.Item
    protected w createDrawables() {
        Model2D model2D = this.model;
        if (model2D == null) {
            return null;
        }
        return w.g(createDrawableModel(model2D, this.materials));
    }

    public String getAttachedTo() {
        return this.attachedTo;
    }

    public int[] getBounds(boolean z10) {
        return (z10 && hasClosedModel()) ? this.model.boundsClosed : this.model.bounds;
    }

    public boolean getClosed() {
        return this.closed;
    }

    public ItemMaterialSet getMaterialSet() {
        if (this.model.materialSets == null) {
            return null;
        }
        JSONObject jSONObject = this.stored;
        if (jSONObject != null) {
            r rVar = r.art;
            if (jSONObject.has(rVar.f224891a)) {
                try {
                    ItemMaterialSet itemMaterialSet = this.model.materialSets.get(this.stored.getString(rVar.f224891a));
                    if (itemMaterialSet != null) {
                        return itemMaterialSet;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return this.model.materialSets.getDefault();
    }

    public ItemMaterialSets getMaterialSets() {
        return this.model.materialSets;
    }

    @Override // com.planner5d.library.model.item.Item
    public ItemMaterial[] getMaterials() {
        return this.materials;
    }

    @m1
    public ItemMaterial[] getMaterialsEditable(i iVar) {
        ArrayList arrayList = new ArrayList();
        for (ItemMaterial itemMaterial : this.materials) {
            if (isMaterialEditable(itemMaterial, iVar)) {
                arrayList.add(itemMaterial);
            }
        }
        return (ItemMaterial[]) arrayList.toArray(new ItemMaterial[0]);
    }

    public Model2D getModel() {
        return this.model;
    }

    public boolean getModelDoubleSided() {
        return this.model.doubleSided;
    }

    public String getModelId() {
        return this.modelId;
    }

    public m getSize(m mVar) {
        int[] iArr = this.model.bounds;
        return mVar.y0(iArr[0], iArr[1], iArr[2]);
    }

    public JSONObject getStored() {
        return this.stored;
    }

    public boolean hasClosedModel() {
        return this.model.boundsClosed != null;
    }

    public void setAttachedTo(String str) {
        this.attachedTo = str;
    }

    public void setClosed(boolean z10) {
        this.closed = z10;
    }

    public void setMaterialSet(ItemMaterialSet itemMaterialSet) {
        ItemMaterial[] itemMaterialArr;
        if (itemMaterialSet == null || (itemMaterialArr = itemMaterialSet.materials) == null) {
            return;
        }
        for (ItemMaterial itemMaterial : itemMaterialArr) {
            if (itemMaterial != null) {
                int i10 = itemMaterial.position;
                ItemMaterial[] itemMaterialArr2 = this.materials;
                if (i10 < itemMaterialArr2.length) {
                    itemMaterialArr2[i10] = itemMaterial;
                }
            }
        }
        if (this.stored == null) {
            this.stored = new JSONObject();
        }
        try {
            this.stored.put(r.art.f224891a, itemMaterialSet.sku);
        } catch (JSONException unused) {
        }
    }

    @m1
    public void setMaterials(ItemMaterial[] itemMaterialArr, i iVar) {
        for (ItemMaterial itemMaterial : itemMaterialArr) {
            if (itemMaterial != null) {
                int i10 = itemMaterial.position;
                ItemMaterial[] itemMaterialArr2 = this.materials;
                if (i10 < itemMaterialArr2.length && isMaterialEditable(itemMaterialArr2[i10], iVar)) {
                    this.materials[itemMaterial.position] = itemMaterial;
                }
            }
        }
    }

    public void setStored(JSONObject jSONObject) {
        this.stored = jSONObject;
        if (jSONObject != null) {
            setMaterialSet(getMaterialSet());
        }
    }

    @Override // com.planner5d.library.model.item.Item
    public k getSize(k kVar, boolean z10) {
        k size = super.getSize(kVar, z10);
        int[] iArr = this.model.size2DHalf;
        return size.S(iArr[0] * 2, iArr[1] * 2);
    }

    public ItemNs(ItemNs itemNs, ProviderUid providerUid) {
        super(itemNs, providerUid);
        this.closed = false;
        this.attachedTo = null;
        this.stored = null;
        this.model = itemNs.model;
        this.modelId = itemNs.modelId;
        this.closed = itemNs.closed;
        this.attachedTo = itemNs.attachedTo;
        this.materials = ItemMaterial.clone(itemNs.materials);
        if (itemNs.stored != null) {
            try {
                this.stored = new JSONObject(itemNs.stored.toString());
            } catch (JSONException unused) {
            }
        }
    }
}
