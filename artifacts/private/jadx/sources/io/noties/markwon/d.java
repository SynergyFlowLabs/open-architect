package io.noties.markwon;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f297588a = "https";

    @NonNull
    private static Uri b(@NonNull String str) {
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        return uriBuild;
    }

    @Override // io.noties.markwon.c
    public void a(@NonNull View view, @NonNull String str) {
        Uri uriB = b(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriB);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
