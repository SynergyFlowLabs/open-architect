package com.planner5d.library.model.item.builder;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemLight;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemOpenClose;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.y;
import ij.c;
import ij.f;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@f
public class ItemBuilder {
    private static final String DEFAULT_MATERIAL_PR = "wood_1";

    @ij.a
    protected i builtInDataManager;

    @ij.a
    protected t1 logRecordManager;

    @ij.a
    public ItemBuilder() {
    }

    public static /* synthetic */ LogRecord a(String str) {
        return new LogRecord("create_model_catalog", str, new Exception("Item null: " + str));
    }

    public static /* synthetic */ LogRecord b(String str) {
        return new LogRecord("create_model_2d", str, new Exception("Model 2D null: " + str));
    }

    public static Uri createItemUri(CatalogItem catalogItem) {
        return Uri.parse("p5d://" + catalogItem.f180761id);
    }

    @m1
    private ItemNs createModel(final String str, String str2) {
        ItemNs itemWindow;
        CatalogItem catalogItemW = this.builtInDataManager.w(str);
        if (catalogItemW == null) {
            this.logRecordManager.v(new c() { // from class: com.planner5d.library.model.item.builder.a
                @Override // ij.c
                public final Object get() {
                    return ItemBuilder.a(str);
                }
            });
            return null;
        }
        Model2D model2DZ = this.builtInDataManager.Z(catalogItemW);
        if (model2DZ == null) {
            this.logRecordManager.v(new c() { // from class: com.planner5d.library.model.item.builder.b
                @Override // ij.c
                public final Object get() {
                    return ItemBuilder.b(str);
                }
            });
            return null;
        }
        String strX = this.builtInDataManager.X(catalogItemW);
        if (strX == null) {
            strX = "Ns";
        }
        switch (strX) {
            case "Window":
                itemWindow = new ItemWindow(str2, str, model2DZ);
                break;
            case "OpenClose":
                itemWindow = new ItemOpenClose(str2, str, model2DZ);
                break;
            case "Ns":
                itemWindow = new ItemNs(str2, str, model2DZ);
                break;
            case "Door":
                itemWindow = new ItemDoor(str2, str, model2DZ);
                break;
            case "Light":
                itemWindow = new ItemLight(str2, str, model2DZ);
                break;
            default:
                return null;
        }
        itemWindow.setLayout(itemWindow.getLayout(new ItemLayout()).setPositionZ(model2DZ.overTheFloor));
        return itemWindow;
    }

    private ItemPr createPr(String str) {
        ItemPr itemPr = new ItemPr(str);
        ItemMaterial[] itemMaterialArr = new ItemMaterial[7];
        y yVarQ = k5.B().q(DEFAULT_MATERIAL_PR);
        String[] strArr = {"top", VerticalAlignment.BOTTOM, "left", "right", "front", "back", "all"};
        for (int i10 = 0; i10 < 7; i10++) {
            itemMaterialArr[i10] = new ItemMaterial(strArr[i10], yVarQ);
        }
        itemPr.setMaterials(itemMaterialArr);
        return itemPr;
    }

    public static String getItemId(Uri uri) {
        if (!"p5d".equalsIgnoreCase(uri.getScheme())) {
            return null;
        }
        int i10 = 7 | 6;
        return uri.toString().substring(6);
    }

    @m1
    public Item createItemFromUri(Uri uri, ItemFloor itemFloor, @NonNull ProviderUid providerUid) {
        String host = uri.getHost();
        host.getClass();
        switch (host) {
            case "ground":
            case "room":
                return this.builtInDataManager.m(getItemId(uri), itemFloor, providerUid);
            case "pr":
                return createPr(providerUid.createUid());
            default:
                return createModel(uri.toString().substring(6), providerUid.createUid());
        }
    }

    @m1
    public List<Item> createItemsFromByteArray(byte[] bArr, ItemFloor itemFloor, @NonNull ProviderUid providerUid) {
        return this.builtInDataManager.n(bArr, itemFloor, providerUid);
    }
}
