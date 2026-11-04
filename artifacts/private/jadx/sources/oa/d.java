package oa;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.converter.json.from.j;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.services.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
public final class d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f333605c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f333606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.converter.json.from.a f333607b;

    @ij.a
    public d(@NotNull j toItemNs, @NotNull com.planner5d.library.model.converter.json.from.a providerModel) {
        Intrinsics.checkNotNullParameter(toItemNs, "toItemNs");
        Intrinsics.checkNotNullParameter(providerModel, "providerModel");
        this.f333606a = toItemNs;
        this.f333607b = providerModel;
    }

    private final ItemNs b(kf.a aVar, ProviderUid providerUid) {
        return this.f333606a.f(c(aVar), providerUid, this.f333607b);
    }

    private final JSONObject c(kf.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r.id.f224891a, aVar.i());
        jSONObject.put(r.className.f224891a, aVar.l() ? "Door" : "Window");
        jSONObject.put(r.sX.f224891a, 100);
        jSONObject.put(r.sY.f224891a, 100);
        jSONObject.put(r.sZ.f224891a, 100);
        return jSONObject;
    }

    @Override // oa.f
    @NotNull
    public ItemNs a(@NotNull kf.a windowDoor, @NotNull ProviderUid uidProvider) {
        Intrinsics.checkNotNullParameter(windowDoor, "windowDoor");
        Intrinsics.checkNotNullParameter(uidProvider, "uidProvider");
        ItemNs itemNsB = b(windowDoor, uidProvider);
        Intrinsics.checkNotNullExpressionValue(itemNsB, "loadItemFromCatalog(...)");
        return itemNsB;
    }
}
