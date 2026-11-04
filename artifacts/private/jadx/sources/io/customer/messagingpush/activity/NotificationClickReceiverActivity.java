package io.customer.messagingpush.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import eh.d;
import eh.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zg.c;

/* JADX INFO: loaded from: classes13.dex */
public final class NotificationClickReceiverActivity extends Activity implements lh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f288390c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f288391d = "CIO_NotificationPayloadExtras";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f288392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final bh.a f288393b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NotificationClickReceiverActivity() {
        d dVar = d.f274883c;
        this.f288392a = dVar;
        this.f288393b = c.i(dVar);
    }

    private final void a(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            this.f288393b.m();
        } else {
            c.j(this.f288392a).a(this, intent);
        }
        finish();
    }

    @Override // lh.a
    @Nullable
    public String getScreenName() {
        return null;
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        e.a(d.f274883c, this);
        a(getIntent());
    }

    @Override // android.app.Activity
    protected void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }
}
