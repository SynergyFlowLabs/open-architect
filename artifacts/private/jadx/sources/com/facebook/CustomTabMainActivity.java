package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f98463c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98464d = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98465e = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98466f = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98467g = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98468h = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98469i = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f98470j = Intrinsics.stringPlus(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f98471a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private BroadcastReceiver f98472b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri uri = Uri.parse(str);
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            Bundle bundleL0 = com.facebook.internal.e1.l0(uri.getQuery());
            bundleL0.putAll(com.facebook.internal.e1.l0(uri.getFragment()));
            return bundleL0;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98473a;

        static {
            int[] iArr = new int[com.facebook.login.d0.valuesCustom().length];
            iArr[com.facebook.login.d0.INSTAGRAM.ordinal()] = 1;
            f98473a = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f98469i);
            String str = CustomTabMainActivity.f98467g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    private final void a(int i10, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.f98472b;
        if (broadcastReceiver != null) {
            androidx.localbroadcastmanager.content.a.b(this).f(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f98467g);
            Bundle bundleB = stringExtra != null ? f98463c.b(stringExtra) : new Bundle();
            com.facebook.internal.w0 w0Var = com.facebook.internal.w0.f100148a;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Intent intentN = com.facebook.internal.w0.n(intent2, bundleB, null);
            if (intentN != null) {
                intent = intentN;
            }
            setResult(i10, intent);
        } else {
            com.facebook.internal.w0 w0Var2 = com.facebook.internal.w0.f100148a;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            setResult(i10, com.facebook.internal.w0.n(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.f98459d;
        if (Intrinsics.areEqual(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra(f98464d)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f98465e);
        boolean zC = (b.f98473a[com.facebook.login.d0.f100461b.a(getIntent().getStringExtra(f98468h)).ordinal()] == 1 ? new com.facebook.internal.o0(stringExtra, bundleExtra) : new com.facebook.internal.g(stringExtra, bundleExtra)).c(this, getIntent().getStringExtra(f98466f));
        this.f98471a = false;
        if (!zC) {
            setResult(0, getIntent().putExtra(f98470j, true));
            finish();
        } else {
            c cVar = new c();
            this.f98472b = cVar;
            androidx.localbroadcastmanager.content.a.b(this).c(cVar, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.areEqual(f98469i, intent.getAction())) {
            androidx.localbroadcastmanager.content.a.b(this).d(new Intent(CustomTabActivity.f98460e));
            a(-1, intent);
        } else if (Intrinsics.areEqual(CustomTabActivity.f98459d, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f98471a) {
            a(0, null);
        }
        this.f98471a = true;
    }
}
