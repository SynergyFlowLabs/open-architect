package com.devtodev.analytics.internal.platform.repository;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryDI$googleApiRepository$2 extends l0 implements Function0<GoogleApiRepository> {
    final /* synthetic */ RepositoryDI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryDI$googleApiRepository$2(RepositoryDI repositoryDI) {
        super(0);
        this.this$0 = repositoryDI;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final GoogleApiRepository invoke() {
        return new GoogleApiRepository(this.this$0.getContext());
    }
}
