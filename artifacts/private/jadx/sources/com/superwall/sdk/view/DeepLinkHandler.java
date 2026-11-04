package com.superwall.sdk.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.d;
import com.superwall.sdk.Superwall;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class DeepLinkHandler extends d {
    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        String queryParameter = Uri.parse(data != null ? data.toString() : null).getQueryParameter("code");
        if (queryParameter != null) {
            Superwall.Companion.getInstance().redeem$superwall_release(queryParameter);
        }
        finish();
    }
}
