package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.annotation.b1;
import androidx.core.content.d;
import androidx.media.e;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52970a = "MediaButtonReceiver";

    /* JADX INFO: renamed from: androidx.media.session.a$a, reason: collision with other inner class name */
    private static class C0496a extends MediaBrowserCompat.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f52971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Intent f52972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f52973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MediaBrowserCompat f52974f;

        C0496a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f52971c = context;
            this.f52972d = intent;
            this.f52973e = pendingResult;
        }

        private void e() {
            this.f52974f.b();
            this.f52973e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            new MediaControllerCompat(this.f52971c, this.f52974f.h()).d((KeyEvent) this.f52972d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            e();
        }

        void f(MediaBrowserCompat mediaBrowser) {
            this.f52974f = mediaBrowser;
        }
    }

    public static PendingIntent a(Context context, long action) {
        ComponentName componentNameC = c(context);
        if (componentNameC == null) {
            return null;
        }
        return b(context, componentNameC, action);
    }

    @e.a({"WrongConstant"})
    public static PendingIntent b(Context context, ComponentName mbrComponent, long action) {
        int iP;
        if (mbrComponent != null && (iP = PlaybackStateCompat.p(action)) != 0) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(mbrComponent);
            intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, iP));
            intent.addFlags(268435456);
            return PendingIntent.getBroadcast(context, iP, intent, MediaSessionCompat.f9530e);
        }
        return null;
    }

    @b1({b1.a.LIBRARY})
    public static ComponentName c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        listQueryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName d(Context context, String action) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(action);
        intent.setPackage(context.getPackageName());
        int i10 = 6 >> 0;
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + action + ", found " + listQueryIntentServices.size());
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.e().d(keyEvent);
        return keyEvent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName componentNameD = d(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameD != null) {
            intent.setComponent(componentNameD);
            d.B(context, intent);
            return;
        }
        ComponentName componentNameD2 = d(context, e.f52772k);
        if (componentNameD2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0496a c0496a = new C0496a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameD2, c0496a, null);
        c0496a.f(mediaBrowserCompat);
        mediaBrowserCompat.a();
    }
}
