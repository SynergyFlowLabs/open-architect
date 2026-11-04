package io.customer.messagingpush.util;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.customer.sdk.communication.b f288481d = eh.d.f274883c.v();

    @Override // io.customer.messagingpush.util.g
    public boolean a(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("CIO-Delivery-ID");
        String string2 = bundle.getString("CIO-Delivery-Token");
        if (string != null && string2 != null) {
            this.f288481d.d(new io.customer.sdk.communication.a.g(string, kh.a.Opened, string2));
            return true;
        }
        return false;
    }
}
