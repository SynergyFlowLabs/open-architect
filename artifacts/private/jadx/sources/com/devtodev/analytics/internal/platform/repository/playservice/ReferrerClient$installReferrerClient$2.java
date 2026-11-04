package com.devtodev.analytics.internal.platform.repository.playservice;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class ReferrerClient$installReferrerClient$2 extends l0 implements Function0<InstallReferrerClient> {
    final /* synthetic */ ReferrerClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferrerClient$installReferrerClient$2(ReferrerClient referrerClient) {
        super(0);
        this.this$0 = referrerClient;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InstallReferrerClient invoke() {
        return InstallReferrerClient.newBuilder(this.this$0.context).build();
    }
}
