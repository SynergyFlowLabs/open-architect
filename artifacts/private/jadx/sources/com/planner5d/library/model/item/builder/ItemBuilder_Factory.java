package com.planner5d.library.model.item.builder;

import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.t1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes7.dex */
@r
@e
@s("javax.inject.Singleton")
public final class ItemBuilder_Factory implements h<ItemBuilder> {
    private final c<i> builtInDataManagerProvider;
    private final c<t1> logRecordManagerProvider;

    public ItemBuilder_Factory(c<i> cVar, c<t1> cVar2) {
        this.builtInDataManagerProvider = cVar;
        this.logRecordManagerProvider = cVar2;
    }

    public static ItemBuilder_Factory create(c<i> cVar, c<t1> cVar2) {
        return new ItemBuilder_Factory(cVar, cVar2);
    }

    public static ItemBuilder newInstance() {
        return new ItemBuilder();
    }

    @Override // ij.c
    public ItemBuilder get() {
        ItemBuilder itemBuilderNewInstance = newInstance();
        ItemBuilder_MembersInjector.injectBuiltInDataManager(itemBuilderNewInstance, this.builtInDataManagerProvider.get());
        ItemBuilder_MembersInjector.injectLogRecordManager(itemBuilderNewInstance, this.logRecordManagerProvider.get());
        return itemBuilderNewInstance;
    }
}
