package com.devtodev.analytics.internal.platform.repository;

import com.devtodev.analytics.internal.platform.repository.android.AndroidApplication;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RepositoryDI$applicationRepository$2 extends l0 implements Function0<ApplicationRepository> {
    final /* synthetic */ RepositoryDI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryDI$applicationRepository$2(RepositoryDI repositoryDI) {
        super(0);
        this.this$0 = repositoryDI;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ApplicationRepository invoke() {
        return new ApplicationRepository(new AndroidApplication(this.this$0.getContext()));
    }
}
