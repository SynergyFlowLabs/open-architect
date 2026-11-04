package com.planner5d.library.model.item;

import android.graphics.PointF;
import android.util.Range;
import androidx.annotation.NonNull;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import com.planner5d.library.model.converter.json.to.a;
import com.planner5d.library.model.v;
import com.planner5d.library.model.y;
import com.planner5d.library.widget.editor.editor2d.drawable.i;
import com.planner5d.library.widget.editor.editor2d.drawable.n;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import com.planner5d.library.widget.editor.helper.x2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class ItemRoom extends ItemGround {
    public static final int DEFAULT_ROOM_TYPE = 13;
    public static final Range<BigDecimal> HEIGHT_RANGE = Range.create(BigDecimal.ZERO, BigDecimal.valueOf(9999L));
    private boolean calculatedCenter;
    private boolean calculatedIntersection;
    private boolean ceilingHidden;
    private final k centerLocal;
    private boolean floorHidden;
    private float flooringHeight;
    private boolean inRotation;
    private final ItemLayout layoutTemp;
    private final Object lock;
    private ItemMaterial materialCeiling;
    private ItemNs[] relatedItemsForRotation;
    private float savedRotation;
    private boolean selfIntersecting;
    private final k temp;
    private final k temp2;
    private String title;
    private final PointF titlePosition;
    private int type;
    private String typeTitle;

    public ItemRoom(String str, ItemWall[] itemWallArr, ItemFloor itemFloor, ProviderUid providerUid) {
        super(str, itemWallArr, itemFloor, providerUid);
        this.title = null;
        this.type = 13;
        this.typeTitle = null;
        this.titlePosition = new PointF();
        this.materialCeiling = new ItemMaterial("ceil");
        this.floorHidden = false;
        this.ceilingHidden = false;
        this.flooringHeight = 0.0f;
        this.selfIntersecting = false;
        this.temp = new k();
        this.temp2 = new k();
        this.layoutTemp = new ItemLayout();
        this.inRotation = false;
        this.relatedItemsForRotation = null;
        this.centerLocal = new k();
        this.calculatedCenter = false;
        this.calculatedIntersection = false;
        this.savedRotation = 0.0f;
        this.lock = new Object();
        resetWalls();
    }

    private k calculateCenter() {
        k kVar;
        synchronized (this.lock) {
            try {
                if (!this.calculatedCenter) {
                    k kVarG = x2.g(getWallsInfo());
                    if (kVarG == null) {
                        kVarG = centerBasedOnBoundingBox();
                    }
                    this.centerLocal.V(kVarG);
                    this.calculatedCenter = true;
                }
                kVar = this.centerLocal;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    private boolean calculateIntersection() {
        ItemWall[] itemWallArr = this.walls;
        if (itemWallArr != null && itemWallArr.length != 0) {
            k kVar = new k();
            int i10 = 0;
            while (true) {
                ItemWall[] itemWallArr2 = this.walls;
                if (i10 >= itemWallArr2.length - 1) {
                    break;
                }
                if (itemWallArr2[i10].getLength() != 0.0f) {
                    int i11 = i10 + 1;
                    while (true) {
                        ItemWall[] itemWallArr3 = this.walls;
                        if (i11 >= itemWallArr3.length) {
                            break;
                        }
                        if (itemWallArr3[i11].intersects(itemWallArr3[i10], this.temp, kVar)) {
                            return true;
                        }
                        i11++;
                    }
                }
                i10++;
            }
        }
        return false;
    }

    private k centerBasedOnBoundingBox() {
        k kVar = new k(Float.MAX_VALUE, Float.MAX_VALUE);
        k kVar2 = new k(Float.MIN_VALUE, Float.MIN_VALUE);
        for (ItemWall itemWall : this.walls) {
            itemWall.getPoint(this.temp, false, true);
            kVar.U(Math.min(kVar.f180480a, this.temp.f180480a), Math.min(kVar.f180481b, this.temp.f180481b));
            kVar2.U(Math.max(kVar2.f180480a, this.temp.f180480a), Math.max(kVar2.f180481b, this.temp.f180481b));
        }
        return new k((kVar2.f180480a + kVar.f180480a) / 2.0f, (kVar2.f180481b + kVar.f180481b) / 2.0f);
    }

    private String getTitleForUser() {
        String str = this.title;
        if (str == null) {
            str = this.typeTitle;
        }
        return str == null ? "" : str;
    }

    private k getTopOrBottomCenterPosition(k kVar, boolean z10) {
        k kVar2 = new k();
        k kVar3 = new k();
        for (ItemWall itemWall : getChildren()) {
            itemWall.getCenterPosition(kVar2, kVar3);
            if (z10) {
                float f10 = kVar.f180481b;
                if (f10 == 0.0f || kVar2.f180481b < f10) {
                    kVar.V(kVar2);
                }
            }
            if (!z10 && kVar2.f180481b > kVar.f180481b) {
                kVar.V(kVar2);
            }
        }
        return kVar;
    }

    private float longestDistanceFromCenter() {
        float fMax;
        synchronized (this.lock) {
            try {
                if (!this.calculatedCenter) {
                    calculateCenter();
                }
                fMax = 0.0f;
                for (ItemWall itemWall : this.walls) {
                    fMax = Math.max(fMax, this.centerLocal.m(itemWall.getPoint(this.temp, false, true)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fMax;
    }

    private void rotateFlooring(float f10) {
        y yVar;
        ItemMaterial itemMaterial = this.materialFloor;
        if (itemMaterial == null || (yVar = itemMaterial.texture) == null || itemMaterial.isOnlyColor) {
            return;
        }
        setMaterialFloor(new ItemMaterial(itemMaterial, new y(yVar, Float.valueOf(yVar.e()), Float.valueOf(this.materialFloor.texture.d() - f10))));
    }

    private void rotateItems(k kVar, float f10) {
        for (ItemNs itemNs : getItemsMovedTogether()) {
            ItemLayout itemLayout = this.layoutTemp;
            itemLayout.setPosition(itemNs.getLayout(itemLayout).getPosition(this.temp).c0(kVar).N(f10).b(kVar));
            ItemLayout itemLayout2 = this.layoutTemp;
            itemLayout2.setRotationY(itemLayout2.getRotationY() + f10);
            itemNs.setLayout(this.layoutTemp);
        }
    }

    private void rotateWalls(ItemLayout itemLayout, k kVar, float f10) {
        k kVarC0 = new k(kVar).c0(itemLayout.getPosition(new k()));
        for (ItemWall itemWall : this.walls) {
            for (ItemPoint itemPoint : itemWall.getPoints()) {
                itemPoint.setPoint(itemPoint.getPoint().c0(kVarC0).N(f10).b(kVarC0));
            }
        }
    }

    @Override // com.planner5d.library.model.item.ItemGround, com.planner5d.library.model.item.Item
    protected w createDrawables() {
        ItemWall[] itemWallArr = this.walls;
        if (itemWallArr == null || itemWallArr.length < 1) {
            return null;
        }
        n nVar = new n(this);
        ItemMaterial itemMaterial = this.materialFloor;
        if (itemMaterial != null) {
            nVar.t(itemMaterial);
        }
        nVar.s(this.floorHidden);
        nVar.w(getTitleForUser(), this.titlePosition);
        return w.g(nVar);
    }

    public void endRotation() {
        synchronized (this.lock) {
            try {
                if (this.inRotation) {
                    this.savedRotation = getLayout(this.layoutTemp).getRotationY();
                    setLayout(this.layoutTemp.setRotationY(0.0f));
                    this.inRotation = false;
                    this.calculatedCenter = false;
                    this.relatedItemsForRotation = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k getBottomCenterPosition(k kVar) {
        return getTopOrBottomCenterPosition(kVar, false);
    }

    public boolean getCeilingHidden() {
        return this.ceilingHidden;
    }

    public boolean getFloorHidden() {
        return this.floorHidden;
    }

    public float getFlooringHeight() {
        return this.flooringHeight;
    }

    public Range<BigDecimal> getFlooringHeightRange() {
        return Range.create(BigDecimal.ZERO, BigDecimal.valueOf(Math.max(0.0f, a.f(this.height, 270.0f))));
    }

    public ItemNs[] getItemsMovedTogether() {
        ItemNs itemNs;
        String attachedTo;
        ItemNs[] itemNsArr;
        synchronized (this.lock) {
            try {
                if (this.inRotation && (itemNsArr = this.relatedItemsForRotation) != null) {
                    return itemNsArr;
                }
                Item[] children = getParentItem().getChildren();
                ArrayList arrayList = new ArrayList();
                for (Item item : children) {
                    if ((item instanceof ItemNs) && (attachedTo = (itemNs = (ItemNs) item).getAttachedTo()) != null) {
                        if (itemNs instanceof ItemWindow) {
                            for (ItemWall itemWall : getChildren()) {
                                if (attachedTo.equals(itemWall.getUid())) {
                                    arrayList.add(itemNs);
                                    break;
                                }
                            }
                        } else if (attachedTo.equals(getUid())) {
                            arrayList.add(itemNs);
                        }
                    }
                }
                synchronized (this.lock) {
                    try {
                        if (!this.inRotation) {
                            return (ItemNs[]) arrayList.toArray(new ItemNs[0]);
                        }
                        ItemNs[] itemNsArr2 = (ItemNs[]) arrayList.toArray(new ItemNs[0]);
                        this.relatedItemsForRotation = itemNsArr2;
                        return itemNsArr2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public ItemLayout getLayoutForRotation(ItemLayout itemLayout) {
        return getLayout(itemLayout).setPosition(getLayoutPosition(this.temp2).b(calculateCenter()));
    }

    @Override // com.planner5d.library.model.item.ItemGround
    public Map<String, ItemMaterial> getMaterialMap() {
        Map<String, ItemMaterial> materialMap = super.getMaterialMap();
        ItemMaterial[] materials = getMaterials();
        materialMap.put("ceil", materials[1]);
        materialMap.put(ItemWall.FIELD_MATERIAL_INDOOR, materials[2]);
        materialMap.put(ItemWall.FIELD_MATERIAL_OUTDOOR, materials[3]);
        return materialMap;
    }

    @Override // com.planner5d.library.model.item.ItemGround, com.planner5d.library.model.item.Item
    @NonNull
    public ItemMaterial[] getMaterials() {
        return new ItemMaterial[]{getMaterialFloor(), new ItemMaterial(this.materialCeiling), getMaterialWall(true), getMaterialWall(false)};
    }

    public float getRotation() {
        float f10;
        synchronized (this.lock) {
            try {
                f10 = this.savedRotation;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10;
    }

    public k getSizeForRotation(k kVar) {
        return kVar.U(1.0f, 1.0f).R((longestDistanceFromCenter() * 2.0f) / ((float) Math.sqrt(2.0d)));
    }

    public String getTitle() {
        return this.title;
    }

    public PointF getTitlePosition(PointF pointF) {
        pointF.set(this.titlePosition);
        return pointF;
    }

    public k getTopCenterPosition(k kVar) {
        return getTopOrBottomCenterPosition(kVar, true);
    }

    public int getType() {
        return this.type;
    }

    public boolean isCollapsed() {
        for (ItemWall itemWall : this.walls) {
            if (itemWall.getLength() != 0.0f) {
                return false;
            }
        }
        return true;
    }

    public boolean isInRotation() {
        boolean z10;
        synchronized (this.lock) {
            try {
                z10 = this.inRotation;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean isSelfIntersecting() {
        synchronized (this.lock) {
            try {
                if (this.calculatedIntersection) {
                    return this.selfIntersecting;
                }
                boolean zCalculateIntersection = calculateIntersection();
                this.selfIntersecting = zCalculateIntersection;
                this.calculatedIntersection = true;
                return zCalculateIntersection;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void resetTitle() {
        w drawables = getDrawables();
        if (drawables != null) {
            ((n) drawables.f255098a[0]).w(getTitleForUser(), this.titlePosition);
        }
    }

    @Override // com.planner5d.library.model.item.ItemWalls
    public void resetWalls() {
        super.resetWalls();
        synchronized (this.lock) {
            try {
                this.calculatedIntersection = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void rotate(@NotNull m mVar, @NotNull k kVar) {
        ItemLayout layout = getLayout(new ItemLayout());
        float f10 = mVar.f180483b;
        float rotationY = f10 - layout.getRotationY();
        rotateWalls(layout, kVar, rotationY);
        rotateItems(kVar, rotationY);
        rotateFlooring(rotationY);
        resetWalls();
        setLayout(layout.setRotationY(f10));
    }

    public void setCeilingHidden(boolean z10) {
        this.ceilingHidden = z10;
    }

    public void setFloorHidden(boolean z10) {
        this.floorHidden = z10;
        w drawables = getDrawables();
        if (drawables != null) {
            boolean z11 = false;
            ((i) drawables.f255098a[0]).s(z10);
        }
    }

    public void setFlooringHeight(float f10) {
        float f11 = this.height;
        if (f10 > f11) {
            f10 = f11;
        }
        this.flooringHeight = f10;
    }

    @Override // com.planner5d.library.model.item.ItemWalls
    public void setMaterials(Map<String, ItemMaterial> map) {
        setMaterials(map.get("floor"), map.get("ceil"), map.get(ItemWall.FIELD_MATERIAL_INDOOR), map.get(ItemWall.FIELD_MATERIAL_OUTDOOR));
    }

    public void setTitle(String str) {
        if (str == null || str.trim().isEmpty()) {
            str = null;
        }
        this.title = str;
        resetTitle();
    }

    public void setTitlePosition(k kVar) {
        this.titlePosition.set(kVar.f180480a, kVar.f180481b);
        resetTitle();
    }

    public void setType(int i10, v vVar) {
        this.type = i10;
        this.typeTitle = vVar == null ? null : vVar.b();
        resetTitle();
    }

    public void startRotation() {
        synchronized (this.lock) {
            try {
                if (!this.inRotation) {
                    this.inRotation = true;
                    setLayout(getLayout(this.layoutTemp).setRotationY(this.savedRotation));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setMaterials(ItemMaterial itemMaterial, ItemMaterial itemMaterial2, ItemMaterial itemMaterial3, ItemMaterial itemMaterial4) {
        setMaterials(itemMaterial3, itemMaterial4);
        setMaterialFloor(itemMaterial);
        this.materialCeiling = new ItemMaterial(itemMaterial2, this.materialCeiling.name);
    }

    public void setTitlePosition(PointF pointF) {
        this.titlePosition.set(pointF);
        resetTitle();
    }

    public ItemRoom(ItemRoom itemRoom, ItemFloor itemFloor, ProviderUid providerUid) {
        super(itemRoom, providerUid);
        this.title = null;
        this.type = 13;
        this.typeTitle = null;
        PointF pointF = new PointF();
        this.titlePosition = pointF;
        this.materialCeiling = new ItemMaterial("ceil");
        this.floorHidden = false;
        this.ceilingHidden = false;
        this.flooringHeight = 0.0f;
        this.selfIntersecting = false;
        this.temp = new k();
        this.temp2 = new k();
        this.layoutTemp = new ItemLayout();
        this.inRotation = false;
        this.relatedItemsForRotation = null;
        this.centerLocal = new k();
        this.calculatedCenter = false;
        this.calculatedIntersection = false;
        this.savedRotation = 0.0f;
        this.lock = new Object();
        this.height = a.f(itemRoom.height, 270.0f);
        this.title = itemRoom.title;
        this.type = itemRoom.type;
        this.typeTitle = itemRoom.typeTitle;
        this.floorHidden = itemRoom.floorHidden;
        this.flooringHeight = itemRoom.flooringHeight;
        this.ceilingHidden = itemRoom.ceilingHidden;
        pointF.set(itemRoom.titlePosition);
        setMaterials(itemRoom.getMaterialFloor(), itemRoom.materialCeiling, itemRoom.materialWallInside, itemRoom.materialWallOutside);
        setParentItem(itemFloor);
    }
}
