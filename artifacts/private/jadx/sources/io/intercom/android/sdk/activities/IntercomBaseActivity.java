package io.intercom.android.sdk.activities;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.p0;
import androidx.appcompat.app.d;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IntercomBaseActivity extends d {
    private Context localizedContext(Context context) {
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(appConfig.getLocale()));
        return context.createConfigurationContext(configuration);
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(localizedContext(context));
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        Injector.get().getActivityFinisher().register(this);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Injector.get().getActivityFinisher().unregister(this);
    }
}
