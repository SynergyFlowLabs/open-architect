package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f98458c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private BroadcastReceiver f98461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f98457b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98459d = Intrinsics.stringPlus(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98460e = Intrinsics.stringPlus(CustomTabActivity.class.getSimpleName(), ".action_destroy");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f98459d);
            intent2.putExtra(CustomTabMainActivity.f98467g, getIntent().getDataString());
            androidx.localbroadcastmanager.content.a.b(this).d(intent2);
            b bVar = new b();
            androidx.localbroadcastmanager.content.a.b(this).c(bVar, new IntentFilter(f98460e));
            this.f98461a = bVar;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f98459d);
        intent.putExtra(CustomTabMainActivity.f98467g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f98461a;
        if (broadcastReceiver != null) {
            androidx.localbroadcastmanager.content.a.b(this).f(broadcastReceiver);
        }
        super.onDestroy();
    }
}
