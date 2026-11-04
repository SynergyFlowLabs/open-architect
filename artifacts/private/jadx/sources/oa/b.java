package oa;

import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ProviderUid;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements ProviderUid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ItemProject f333599a;

    public /* synthetic */ b(ItemProject itemProject) {
        this.f333599a = itemProject;
    }

    @Override // com.planner5d.library.model.item.ProviderUid
    public final String createUid() {
        return this.f333599a.getNextFreeUid();
    }
}
