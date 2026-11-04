package com.devtodev.analytics.internal.platform.repository;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryDI$huaweiApiRepository$2 extends l0 implements Function0<HuaweiApiRepository> {
    final /* synthetic */ RepositoryDI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryDI$huaweiApiRepository$2(RepositoryDI repositoryDI) {
        super(0);
        this.this$0 = repositoryDI;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final HuaweiApiRepository invoke() {
        return new HuaweiApiRepository(this.this$0.getContext());
    }
}
