package com.planner5d.library.model.item.builder;

import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.t1;
import dagger.internal.e;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;
import ij.c;

/* JADX INFO: loaded from: classes7.dex */
@r
@e
public final class ItemBuilder_MembersInjector implements g<ItemBuilder> {
    private final c<i> builtInDataManagerProvider;
    private final c<t1> logRecordManagerProvider;

    public ItemBuilder_MembersInjector(c<i> cVar, c<t1> cVar2) {
        this.builtInDataManagerProvider = cVar;
        this.logRecordManagerProvider = cVar2;
    }

    public static g<ItemBuilder> create(c<i> cVar, c<t1> cVar2) {
        return new ItemBuilder_MembersInjector(cVar, cVar2);
    }

    @j("com.planner5d.library.model.item.builder.ItemBuilder.builtInDataManager")
    public static void injectBuiltInDataManager(ItemBuilder itemBuilder, i iVar) {
        itemBuilder.builtInDataManager = iVar;
    }

    @j("com.planner5d.library.model.item.builder.ItemBuilder.logRecordManager")
    public static void injectLogRecordManager(ItemBuilder itemBuilder, t1 t1Var) {
        itemBuilder.logRecordManager = t1Var;
    }

    @Override // fg.g
    public void injectMembers(ItemBuilder itemBuilder) {
        injectBuiltInDataManager(itemBuilder, this.builtInDataManagerProvider.get());
        injectLogRecordManager(itemBuilder, this.logRecordManagerProvider.get());
    }
}
