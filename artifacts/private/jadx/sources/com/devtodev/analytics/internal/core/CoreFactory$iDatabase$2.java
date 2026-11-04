package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.storage.SQLiteProvider;
import com.devtodev.analytics.internal.storage.sqlite.SQLiteBase;
import com.devtodev.analytics.internal.storage.sqlite.SQLiteContracts;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CoreFactory$iDatabase$2 extends l0 implements Function0<SQLiteProvider> {
    final /* synthetic */ CoreFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFactory$iDatabase$2(CoreFactory coreFactory) {
        super(0);
        this.this$0 = coreFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SQLiteProvider invoke() {
        return new SQLiteProvider(new SQLiteBase(this.this$0.context, SQLiteContracts.INSTANCE));
    }
}
