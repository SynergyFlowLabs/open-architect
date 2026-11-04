package com.planner5d.library.model.converter.json.to;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemLight;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemOpenClose;
import com.planner5d.library.model.item.ItemPartition;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemUnknown;
import com.planner5d.library.model.item.ItemWindow;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Class<? extends Item>, a> f180642a;

    @ij.a
    public b(m mVar, h hVar, d dVar, r rVar, k kVar, t tVar) {
        HashMap<Class<? extends Item>, a> map = new HashMap<>();
        this.f180642a = map;
        map.put(ItemPr.class, mVar);
        this.f180642a.put(ItemDoor.class, hVar);
        this.f180642a.put(ItemWindow.class, hVar);
        this.f180642a.put(ItemOpenClose.class, hVar);
        this.f180642a.put(ItemLight.class, hVar);
        this.f180642a.put(ItemNs.class, hVar);
        this.f180642a.put(ItemGround.class, dVar);
        this.f180642a.put(ItemRoom.class, rVar);
        this.f180642a.put(ItemPartition.class, kVar);
        this.f180642a.put(ItemUnknown.class, tVar);
    }

    @Override // com.planner5d.library.model.converter.json.to.a
    /* JADX INFO: renamed from: c */
    public JSONObject convert(Item item) throws JSONException {
        throw new RuntimeException("You should not call this method");
    }

    public JSONObject g(Item item, boolean z10) throws JSONException {
        a aVar = this.f180642a.get(item.getClass());
        if (aVar == null) {
            aVar = this.f180642a.get(ItemUnknown.class);
        }
        return aVar instanceof h ? ((h) aVar).h((ItemNs) item, z10) : aVar.convert(item);
    }
}
