package androidx.media2.session;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionToken implements androidx.versionedparcelable.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f58685r = "SessionToken";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f58686s = 300;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f58687t = 1000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f58688u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f58689v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f58690w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f58691x = 100;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f58692y = 101;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    SessionTokenImpl f58693q;

    interface SessionTokenImpl extends androidx.versionedparcelable.h {
        int a();

        int c();

        @p0
        String d5();

        Object e5();

        @p0
        ComponentName f5();

        boolean g5();

        @p0
        Bundle getExtras();

        @NonNull
        String getPackageName();
    }

    class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f58694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaControllerCompat f58695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaSessionCompat.Token f58696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f58697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f58698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ HandlerThread f58699f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Looper looper, c cVar, MediaControllerCompat mediaControllerCompat, MediaSessionCompat.Token token, String str, int i10, HandlerThread handlerThread) {
            super(looper);
            this.f58694a = cVar;
            this.f58695b = mediaControllerCompat;
            this.f58696c = token;
            this.f58697d = str;
            this.f58698e = i10;
            this.f58699f = handlerThread;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (this.f58694a) {
                try {
                    if (message.what != 1000) {
                        return;
                    }
                    this.f58695b.F((MediaControllerCompat.a) message.obj);
                    SessionToken sessionToken = new SessionToken(new SessionTokenImplLegacy(this.f58696c, this.f58697d, this.f58698e, this.f58695b.s()));
                    this.f58696c.i(sessionToken);
                    this.f58694a.a(this.f58696c, sessionToken);
                    SessionToken.i(this.f58699f);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b extends MediaControllerCompat.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f58700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Handler f58701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ MediaControllerCompat f58702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ MediaSessionCompat.Token f58703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f58704h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f58705i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ HandlerThread f58706j;

        b(c cVar, Handler handler, MediaControllerCompat mediaControllerCompat, MediaSessionCompat.Token token, String str, int i10, HandlerThread handlerThread) {
            this.f58700d = cVar;
            this.f58701e = handler;
            this.f58702f = mediaControllerCompat;
            this.f58703g = token;
            this.f58704h = str;
            this.f58705i = i10;
            this.f58706j = handlerThread;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void l() {
            SessionToken sessionToken;
            synchronized (this.f58700d) {
                try {
                    this.f58701e.removeMessages(1000);
                    this.f58702f.F(this);
                    if (this.f58703g.f() instanceof SessionToken) {
                        sessionToken = (SessionToken) this.f58703g.f();
                    } else {
                        sessionToken = new SessionToken(new SessionTokenImplLegacy(this.f58703g, this.f58704h, this.f58705i, this.f58702f.s()));
                        this.f58703g.i(sessionToken);
                    }
                    this.f58700d.a(this.f58703g, sessionToken);
                    SessionToken.i(this.f58706j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @b1({b1.a.LIBRARY})
    public interface c {
        void a(MediaSessionCompat.Token token, SessionToken sessionToken);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface d {
    }

    public SessionToken(@NonNull Context context, @NonNull ComponentName componentName) {
        int i10;
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (componentName == null) {
            throw new NullPointerException("serviceComponent shouldn't be null");
        }
        PackageManager packageManager = context.getPackageManager();
        int iG = g(packageManager, componentName.getPackageName());
        if (h(packageManager, MediaLibraryService.f58610c, componentName)) {
            i10 = 2;
            int i11 = 7 >> 2;
        } else if (h(packageManager, w.f59438b, componentName)) {
            i10 = 1;
        } else {
            if (!h(packageManager, androidx.media.e.f52772k, componentName)) {
                throw new IllegalArgumentException(componentName + " doesn't implement none of MediaSessionService, MediaLibraryService, MediaBrowserService nor MediaBrowserServiceCompat. Use service's full name");
            }
            i10 = 101;
        }
        if (i10 != 101) {
            this.f58693q = new SessionTokenImplBase(componentName, iG, i10);
        } else {
            this.f58693q = new SessionTokenImplLegacy(componentName, iG);
        }
    }

    private static MediaControllerCompat d(Context context, MediaSessionCompat.Token token) {
        return new MediaControllerCompat(context, token);
    }

    @b1({b1.a.LIBRARY})
    public static void f(@NonNull Context context, @NonNull MediaSessionCompat.Token token, @NonNull c cVar) {
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (token == null) {
            throw new NullPointerException("compatToken shouldn't be null");
        }
        if (cVar == null) {
            throw new NullPointerException("listener shouldn't be null");
        }
        androidx.versionedparcelable.h hVarF = token.f();
        if (hVarF instanceof SessionToken) {
            cVar.a(token, (SessionToken) hVarF);
            return;
        }
        MediaControllerCompat mediaControllerCompatD = d(context, token);
        String strJ = mediaControllerCompatD.j();
        int iG = g(context.getPackageManager(), strJ);
        HandlerThread handlerThread = new HandlerThread(f58685r);
        handlerThread.start();
        a aVar = new a(handlerThread.getLooper(), cVar, mediaControllerCompatD, token, strJ, iG, handlerThread);
        b bVar = new b(cVar, aVar, mediaControllerCompatD, token, strJ, iG, handlerThread);
        synchronized (cVar) {
            try {
                mediaControllerCompatD.z(bVar, aVar);
                aVar.sendMessageDelayed(aVar.obtainMessage(1000, bVar), 300L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static int g(PackageManager packageManager, String str) {
        try {
            return packageManager.getApplicationInfo(str, 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalArgumentException("Cannot find package " + str);
        }
    }

    private static boolean h(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i10 = 0; i10 < listQueryIntentServices.size(); i10++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i10);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    static void i(HandlerThread handlerThread) {
        androidx.media2.common.b.C0498b.a.a(handlerThread);
    }

    public int a() {
        return this.f58693q.a();
    }

    public int c() {
        return this.f58693q.c();
    }

    @p0
    public String d5() {
        return this.f58693q.d5();
    }

    @b1({b1.a.LIBRARY})
    public Object e5() {
        return this.f58693q.e5();
    }

    public boolean equals(Object obj) {
        if (obj instanceof SessionToken) {
            return this.f58693q.equals(((SessionToken) obj).f58693q);
        }
        return false;
    }

    @b1({b1.a.LIBRARY})
    public ComponentName f5() {
        return this.f58693q.f5();
    }

    @b1({b1.a.LIBRARY})
    public boolean g5() {
        return this.f58693q.g5();
    }

    @NonNull
    public Bundle getExtras() {
        Bundle extras = this.f58693q.getExtras();
        if (extras != null && !a0.z(extras)) {
            return new Bundle(extras);
        }
        return Bundle.EMPTY;
    }

    @NonNull
    public String getPackageName() {
        return this.f58693q.getPackageName();
    }

    public int hashCode() {
        return this.f58693q.hashCode();
    }

    public String toString() {
        return this.f58693q.toString();
    }

    SessionToken(SessionTokenImpl sessionTokenImpl) {
        this.f58693q = sessionTokenImpl;
    }

    SessionToken() {
    }
}
