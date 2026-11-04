package com.planner5d.library.model.item;

import bc.b;
import bc.c;
import com.planner5d.library.engine.rendering.util.h;
import com.planner5d.library.model.y;
import org.apache.commons.lang3.s;

/* JADX INFO: loaded from: classes7.dex */
public class ItemMaterial {
    public final Integer color;
    public final Integer colorDraw;
    public final Integer colorTexture;
    public final boolean isOnlyColor;
    public final String name;
    public final int position;
    private final boolean removeTextureIfSet;
    public final y texture;

    public ItemMaterial(String str, Integer num, Integer num2, y yVar, int i10, boolean z10) {
        this.name = str;
        this.color = num;
        this.colorTexture = num2;
        this.texture = yVar;
        this.position = i10;
        boolean z11 = yVar == null || (str != null && (str.startsWith("color") || str.startsWith("chrome")));
        this.isOnlyColor = z11;
        if (z11) {
            this.colorDraw = num;
        } else {
            this.colorDraw = Integer.valueOf((num2 == null || num2.intValue() == -1) ? yVar.f222849a : num2.intValue());
        }
        this.removeTextureIfSet = z10;
    }

    public static ItemMaterial clone(ItemMaterial itemMaterial) {
        if (itemMaterial == null) {
            return null;
        }
        return new ItemMaterial(itemMaterial);
    }

    public static ItemMaterial get(ItemMaterial[] itemMaterialArr, int i10) {
        for (ItemMaterial itemMaterial : itemMaterialArr) {
            if (itemMaterial != null && itemMaterial.position == i10) {
                return itemMaterial;
            }
        }
        return null;
    }

    public b createMaterial(boolean z10, String str, h hVar, c cVar) {
        b bVarA = cVar.a(str);
        setToMaterial(z10, bVarA, hVar);
        return bVarA;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ItemMaterial)) {
            return false;
        }
        ItemMaterial itemMaterial = (ItemMaterial) obj;
        return s.s(this.color, itemMaterial.color) && s.s(this.colorTexture, itemMaterial.colorTexture) && s.s(this.texture, itemMaterial.texture);
    }

    public int getColorInt() {
        Integer num = this.color;
        if (num != null) {
            return num.intValue();
        }
        int i10 = 0 ^ (-1);
        return -1;
    }

    public int getColorMain() {
        return this.isOnlyColor ? getColorInt() : getColorTextureInt();
    }

    public int getColorTextureInt() {
        Integer num = this.colorTexture;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public boolean getIsEmpty() {
        return this.texture == null && this.color == null;
    }

    public void setToMaterial(boolean z10, b bVar, h hVar) {
        if (bVar != null && !getIsEmpty()) {
            bVar.D(null);
            y yVar = this.texture;
            if (yVar != null) {
                bVar.L0(this.name, hVar, yVar.h(z10 ? -1.0f : 1.0f));
                Integer num = this.colorTexture;
                if (num != null) {
                    bVar.D(num);
                    return;
                }
                return;
            }
            Integer num2 = this.colorDraw;
            if (num2 != null) {
                if (num2.intValue() == 0) {
                    bVar.D1(Float.valueOf(0.0f));
                    return;
                }
                bVar.D(this.colorDraw);
                if (this.removeTextureIfSet) {
                    bVar.L0(null, null, null);
                }
            }
        }
    }

    public static ItemMaterial[] clone(ItemMaterial[] itemMaterialArr) {
        if (itemMaterialArr == null) {
            return null;
        }
        ItemMaterial[] itemMaterialArr2 = new ItemMaterial[itemMaterialArr.length];
        for (int i10 = 0; i10 < itemMaterialArr.length; i10++) {
            itemMaterialArr2[i10] = clone(itemMaterialArr[i10]);
        }
        return itemMaterialArr2;
    }

    public ItemMaterial(String str, Integer num, Integer num2, y yVar, int i10) {
        this(str, num, num2, yVar, i10, false);
    }

    public ItemMaterial(String str) {
        this(str, 0, -1, null, 0);
    }

    public ItemMaterial(String str, int i10) {
        this(str, i10, (String) null);
    }

    public ItemMaterial(String str, int i10, String str2) {
        this(str, Integer.valueOf(i10), -1, str2 == null ? null : new y(str2), 0);
    }

    public ItemMaterial(String str, String str2) {
        this(str, str2 == null ? null : new y(str2));
    }

    public ItemMaterial(String str, y yVar) {
        this(str, 0, -1, yVar, 0);
    }

    public ItemMaterial(ItemMaterial itemMaterial) {
        this(itemMaterial, itemMaterial.name);
    }

    public ItemMaterial(ItemMaterial itemMaterial, String str) {
        this(itemMaterial, str, itemMaterial.color);
    }

    public ItemMaterial(ItemMaterial itemMaterial, y yVar) {
        this(itemMaterial.name, itemMaterial.color, itemMaterial.colorTexture, yVar, itemMaterial.position, itemMaterial.removeTextureIfSet);
    }

    public ItemMaterial(ItemMaterial itemMaterial, String str, Integer num) {
        this(str, num, itemMaterial.colorTexture, itemMaterial.texture, itemMaterial.position, itemMaterial.removeTextureIfSet);
    }
}
