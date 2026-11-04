package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final int A = 4;
    public static final int B = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f46958c = "NotifManCompat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f46959d = "checkOpNoThrow";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46960e = "OP_POST_NOTIFICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46961f = "android.support.useSideChannel";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f46962g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f46963h = 19;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f46964i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f46965j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f46966k = "enabled_notification_listeners";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static String f46968m = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.b0("sLock")
    private static l f46971p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f46972q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f46973r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f46974s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f46975t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46976u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f46977v = -1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f46978w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f46979x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f46980y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f46981z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f46983b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f46967l = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static Set<String> f46969n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f46970o = new Object();

    @w0(23)
    static class a {
        private a() {
        }

        static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    @w0(24)
    static class b {
        private b() {
        }

        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    @w0(26)
    static class c {
        private c() {
        }

        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    @w0(28)
    static class d {
        private d() {
        }

        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    @w0(30)
    static class e {
        private e() {
        }

        static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    @w0(34)
    static class f {
        private f() {
        }

        static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface h {
    }

    private static class j implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f46991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f46992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f46993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f46994d;

        j(String str, int i10, String str2, Notification notification) {
            this.f46991a = str;
            this.f46992b = i10;
            this.f46993c = str2;
            this.f46994d = notification;
        }

        @Override // androidx.core.app.c0.m
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            aVar.A8(this.f46991a, this.f46992b, this.f46993c, this.f46994d);
        }

        @NonNull
        public String toString() {
            return "NotifyTask[packageName:" + this.f46991a + ", id:" + this.f46992b + ", tag:" + this.f46993c + "]";
        }
    }

    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f46995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f46996b;

        k(ComponentName componentName, IBinder iBinder) {
            this.f46995a = componentName;
            this.f46996b = iBinder;
        }
    }

    private static class l implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f46997f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f46998g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f46999h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f47000i = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f47001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f47002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f47003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<ComponentName, a> f47004d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set<String> f47005e = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f47006a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            android.support.v4.app.a f47008c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f47007b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque<m> f47009d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f47010e = 0;

            a(ComponentName componentName) {
                this.f47006a = componentName;
            }
        }

        l(Context context) {
            this.f47001a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f47002b = handlerThread;
            handlerThread.start();
            this.f47003c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f47007b) {
                return true;
            }
            boolean zBindService = this.f47001a.bindService(new Intent(c0.f46962g).setComponent(aVar.f47006a), this, 33);
            aVar.f47007b = zBindService;
            if (zBindService) {
                aVar.f47010e = 0;
            } else {
                Objects.toString(aVar.f47006a);
                this.f47001a.unbindService(this);
            }
            return aVar.f47007b;
        }

        private void b(a aVar) {
            if (aVar.f47007b) {
                this.f47001a.unbindService(this);
                aVar.f47007b = false;
            }
            aVar.f47008c = null;
        }

        private void c(m mVar) {
            j();
            for (a aVar : this.f47004d.values()) {
                aVar.f47009d.add(mVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f47004d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f47004d.get(componentName);
            if (aVar != null) {
                aVar.f47008c = android.support.v4.app.a.b.i(iBinder);
                aVar.f47010e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f47004d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006e  */
        /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
        private void g(a aVar) {
            if (Log.isLoggable(c0.f46958c, 3)) {
                Objects.toString(aVar.f47006a);
                aVar.f47009d.size();
            }
            if (aVar.f47009d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f47008c == null) {
                i(aVar);
                return;
            }
            while (true) {
                m mVarPeek = aVar.f47009d.peek();
                if (mVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(c0.f46958c, 3)) {
                        mVarPeek.toString();
                    }
                    mVarPeek.a(aVar.f47008c);
                    aVar.f47009d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(c0.f46958c, 3)) {
                        Objects.toString(aVar.f47006a);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(aVar.f47006a);
                }
                if (aVar.f47009d.isEmpty()) {
                }
                i(aVar);
            }
            if (aVar.f47009d.isEmpty()) {
                i(aVar);
            }
        }

        private void i(a aVar) {
            if (this.f47003c.hasMessages(3, aVar.f47006a)) {
                return;
            }
            int i10 = aVar.f47010e;
            int i11 = i10 + 1;
            aVar.f47010e = i11;
            if (i11 <= 6) {
                this.f47003c.sendMessageDelayed(this.f47003c.obtainMessage(3, aVar.f47006a), (1 << i10) * 1000);
            } else {
                aVar.f47009d.size();
                Objects.toString(aVar.f47006a);
                aVar.f47009d.clear();
            }
        }

        private void j() {
            Set<String> setT = c0.t(this.f47001a);
            if (setT.equals(this.f47005e)) {
                return;
            }
            this.f47005e = setT;
            List<ResolveInfo> listQueryIntentServices = this.f47001a.getPackageManager().queryIntentServices(new Intent().setAction(c0.f46962g), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setT.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName.toString();
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f47004d.containsKey(componentName2)) {
                    if (Log.isLoggable(c0.f46958c, 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f47004d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f47004d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(c0.f46958c, 3)) {
                        Objects.toString(next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(m mVar) {
            this.f47003c.obtainMessage(0, mVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((m) message.obj);
                return true;
            }
            if (i10 == 1) {
                k kVar = (k) message.obj;
                e(kVar.f46995a, kVar.f46996b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(c0.f46958c, 3)) {
                Objects.toString(componentName);
            }
            this.f47003c.obtainMessage(1, new k(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(c0.f46958c, 3)) {
                Objects.toString(componentName);
            }
            this.f47003c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface m {
        void a(android.support.v4.app.a aVar) throws RemoteException;
    }

    private c0(Context context) {
        this.f46982a = context;
        this.f46983b = (NotificationManager) context.getSystemService("notification");
    }

    private void I(m mVar) {
        synchronized (f46970o) {
            try {
                if (f46971p == null) {
                    f46971p = new l(this.f46982a.getApplicationContext());
                }
                f46971p.h(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean J(Notification notification) {
        Bundle bundleN = w.n(notification);
        return bundleN != null && bundleN.getBoolean(f46961f);
    }

    @NonNull
    public static c0 q(@NonNull Context context) {
        return new c0(context);
    }

    @NonNull
    public static Set<String> t(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), f46966k);
        synchronized (f46967l) {
            if (string != null) {
                try {
                    if (!string.equals(f46968m)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f46969n = hashSet;
                        f46968m = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f46969n;
        }
        return set;
    }

    @androidx.annotation.p0
    public v A(@NonNull String str) {
        NotificationChannelGroup notificationChannelGroupZ = z(str);
        if (notificationChannelGroupZ != null) {
            return new v(notificationChannelGroupZ);
        }
        return null;
    }

    @NonNull
    public List<NotificationChannelGroup> B() {
        return c.j(this.f46983b);
    }

    @NonNull
    public List<v> C() {
        List<NotificationChannelGroup> listB = B();
        if (listB.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator<NotificationChannelGroup> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new v(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public List<NotificationChannel> D() {
        return c.k(this.f46983b);
    }

    @NonNull
    public List<u> E() {
        List<NotificationChannel> listD = D();
        if (listD.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listD.size());
        Iterator<NotificationChannel> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new u(it.next()));
        }
        return arrayList;
    }

    @a1("android.permission.POST_NOTIFICATIONS")
    public void F(int i10, @NonNull Notification notification) {
        G(null, i10, notification);
    }

    @a1("android.permission.POST_NOTIFICATIONS")
    public void G(@androidx.annotation.p0 String str, int i10, @NonNull Notification notification) {
        if (!J(notification)) {
            this.f46983b.notify(str, i10, notification);
        } else {
            I(new j(this.f46982a.getPackageName(), i10, str, notification));
            this.f46983b.cancel(str, i10);
        }
    }

    @a1("android.permission.POST_NOTIFICATIONS")
    public void H(@NonNull List<i> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = list.get(i10);
            G(iVar.f46988a, iVar.f46989b, iVar.f46990c);
        }
    }

    public boolean a() {
        return b.a(this.f46983b);
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT < 34) {
            return this.f46982a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0;
        }
        return f.a(this.f46983b);
    }

    public void c(int i10) {
        d(null, i10);
    }

    public void d(@androidx.annotation.p0 String str, int i10) {
        this.f46983b.cancel(str, i10);
    }

    public void e() {
        this.f46983b.cancelAll();
    }

    public void f(@NonNull NotificationChannel notificationChannel) {
        c.a(this.f46983b, notificationChannel);
    }

    public void g(@NonNull u uVar) {
        f(uVar.m());
    }

    public void h(@NonNull NotificationChannelGroup notificationChannelGroup) {
        c.b(this.f46983b, notificationChannelGroup);
    }

    public void i(@NonNull v vVar) {
        h(vVar.f());
    }

    public void j(@NonNull List<NotificationChannelGroup> list) {
        c.c(this.f46983b, list);
    }

    public void k(@NonNull List<v> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f());
        }
        c.c(this.f46983b, arrayList);
    }

    public void l(@NonNull List<NotificationChannel> list) {
        c.d(this.f46983b, list);
    }

    public void m(@NonNull List<u> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<u> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m());
            }
            c.d(this.f46983b, arrayList);
        }
    }

    public void n(@NonNull String str) {
        c.e(this.f46983b, str);
    }

    public void o(@NonNull String str) {
        c.f(this.f46983b, str);
    }

    public void p(@NonNull Collection<String> collection) {
        for (NotificationChannel notificationChannel : c.k(this.f46983b)) {
            if (!collection.contains(c.g(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(notificationChannel)))) {
                c.e(this.f46983b, c.g(notificationChannel));
            }
        }
    }

    @NonNull
    public List<StatusBarNotification> r() {
        return a.a(this.f46983b);
    }

    public int s() {
        return a.b(this.f46983b);
    }

    public int u() {
        return b.b(this.f46983b);
    }

    @androidx.annotation.p0
    public NotificationChannel v(@NonNull String str) {
        return c.i(this.f46983b, str);
    }

    @androidx.annotation.p0
    public NotificationChannel w(@NonNull String str, @NonNull String str2) {
        return Build.VERSION.SDK_INT >= 30 ? e.a(this.f46983b, str, str2) : v(str);
    }

    @androidx.annotation.p0
    public u x(@NonNull String str) {
        NotificationChannel notificationChannelV = v(str);
        if (notificationChannelV != null) {
            return new u(notificationChannelV);
        }
        return null;
    }

    @androidx.annotation.p0
    public u y(@NonNull String str, @NonNull String str2) {
        NotificationChannel notificationChannelW = w(str, str2);
        if (notificationChannelW != null) {
            return new u(notificationChannelW);
        }
        return null;
    }

    @androidx.annotation.p0
    public NotificationChannelGroup z(@NonNull String str) {
        return d.a(this.f46983b, str);
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f46988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f46989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Notification f46990c;

        public i(@androidx.annotation.p0 String str, int i10, @NonNull Notification notification) {
            this.f46988a = str;
            this.f46989b = i10;
            this.f46990c = notification;
        }

        public i(int i10, @NonNull Notification notification) {
            this(null, i10, notification);
        }
    }

    @l1
    c0(@NonNull NotificationManager notificationManager, @NonNull Context context) {
        this.f46982a = context;
        this.f46983b = notificationManager;
    }

    private static class g implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f46984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f46985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f46986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f46987d;

        g(String str) {
            this.f46984a = str;
            this.f46985b = 0;
            this.f46986c = null;
            this.f46987d = true;
        }

        @Override // androidx.core.app.c0.m
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            if (this.f46987d) {
                aVar.Vc(this.f46984a);
            } else {
                aVar.P3(this.f46984a, this.f46985b, this.f46986c);
            }
        }

        @NonNull
        public String toString() {
            return "CancelTask[packageName:" + this.f46984a + ", id:" + this.f46985b + ", tag:" + this.f46986c + ", all:" + this.f46987d + "]";
        }

        g(String str, int i10, String str2) {
            this.f46984a = str;
            this.f46985b = i10;
            this.f46986c = str2;
            this.f46987d = false;
        }
    }
}
