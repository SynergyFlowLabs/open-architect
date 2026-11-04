package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
class y implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f47468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w.n f47469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f47470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f47471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f47472f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f47473g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f47475i;

    @w0(20)
    static class a {
        private a() {
        }

        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @w0(21)
    static class b {
        private b() {
        }

        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    @w0(23)
    static class c {
        private c() {
        }

        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    @w0(24)
    static class d {
        private d() {
        }

        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    @w0(26)
    static class e {
        private e() {
        }

        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    @w0(28)
    static class f {
        private f() {
        }

        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    @w0(29)
    static class g {
        private g() {
        }

        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    @w0(31)
    static class h {
        private h() {
        }

        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    y(w.n nVar) {
        int i10;
        this.f47469c = nVar;
        Context context = nVar.f47355a;
        this.f47467a = context;
        Notification.Builder builderA = e.a(context, nVar.L);
        this.f47468b = builderA;
        Notification notification = nVar.U;
        int i11 = 7 ^ 1;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, nVar.f47363i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nVar.f47359e).setContentText(nVar.f47360f).setContentInfo(nVar.f47365k).setContentIntent(nVar.f47361g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(nVar.f47362h, (notification.flags & 128) != 0).setNumber(nVar.f47366l).setProgress(nVar.f47375u, nVar.f47376v, nVar.f47377w);
        IconCompat iconCompat = nVar.f47364j;
        int i12 = 2 << 0;
        c.b(builderA, iconCompat == null ? null : iconCompat.N(context));
        builderA.setSubText(nVar.f47372r).setUsesChronometer(nVar.f47369o).setPriority(nVar.f47367m);
        w.y yVar = nVar.f47371q;
        if (yVar instanceof w.o) {
            Iterator<w.b> it = ((w.o) yVar).D().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<w.b> it2 = nVar.f47356b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = nVar.E;
        if (bundle != null) {
            this.f47473g.putAll(bundle);
        }
        this.f47470d = nVar.I;
        this.f47471e = nVar.J;
        this.f47468b.setShowWhen(nVar.f47368n);
        a.i(this.f47468b, nVar.A);
        a.g(this.f47468b, nVar.f47378x);
        a.j(this.f47468b, nVar.f47380z);
        a.h(this.f47468b, nVar.f47379y);
        this.f47474h = nVar.Q;
        b.b(this.f47468b, nVar.D);
        b.c(this.f47468b, nVar.F);
        b.f(this.f47468b, nVar.G);
        b.d(this.f47468b, nVar.H);
        b.e(this.f47468b, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = nVar.X;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b.a(this.f47468b, it3.next());
            }
        }
        this.f47475i = nVar.K;
        if (nVar.f47358d.size() > 0) {
            Bundle bundle2 = nVar.t().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < nVar.f47358d.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), a0.j(nVar.f47358d.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            nVar.t().putBundle("android.car.EXTENSIONS", bundle2);
            this.f47473g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = nVar.W;
        if (obj != null) {
            c.c(this.f47468b, obj);
        }
        this.f47468b.setExtras(nVar.E);
        d.e(this.f47468b, nVar.f47374t);
        RemoteViews remoteViews = nVar.I;
        if (remoteViews != null) {
            d.c(this.f47468b, remoteViews);
        }
        RemoteViews remoteViews2 = nVar.J;
        if (remoteViews2 != null) {
            d.b(this.f47468b, remoteViews2);
        }
        RemoteViews remoteViews3 = nVar.K;
        if (remoteViews3 != null) {
            d.d(this.f47468b, remoteViews3);
        }
        e.b(this.f47468b, nVar.M);
        e.e(this.f47468b, nVar.f47373s);
        e.f(this.f47468b, nVar.N);
        e.g(this.f47468b, nVar.P);
        e.d(this.f47468b, nVar.Q);
        if (nVar.C) {
            e.c(this.f47468b, nVar.B);
        }
        if (!TextUtils.isEmpty(nVar.L)) {
            this.f47468b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<j0> it4 = nVar.f47357c.iterator();
        while (it4.hasNext()) {
            f.a(this.f47468b, it4.next().k());
        }
        int i14 = Build.VERSION.SDK_INT;
        g.a(this.f47468b, nVar.S);
        g.b(this.f47468b, w.m.k(nVar.T));
        androidx.core.content.c0 c0Var = nVar.O;
        if (c0Var != null) {
            g.d(this.f47468b, c0Var.c());
        }
        if (i14 >= 31 && (i10 = nVar.R) != 0) {
            h.b(this.f47468b, i10);
        }
        if (nVar.V) {
            if (this.f47469c.f47379y) {
                this.f47474h = 2;
            } else {
                this.f47474h = 1;
            }
            this.f47468b.setVibrate(null);
            this.f47468b.setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            this.f47468b.setDefaults(i15);
            if (TextUtils.isEmpty(this.f47469c.f47378x)) {
                a.g(this.f47468b, w.f47213f1);
            }
            e.d(this.f47468b, this.f47474h);
        }
    }

    private void b(w.b bVar) {
        IconCompat iconCompatF = bVar.f();
        Notification.Action.Builder builderA = c.a(iconCompatF != null ? iconCompatF.M() : null, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : l0.d(bVar.g())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.h());
        f.b(builderA, bVar.h());
        g.c(builderA, bVar.l());
        if (i10 >= 31) {
            h.a(builderA, bVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.i());
        a.b(builderA, bundle);
        a.a(this.f47468b, a.d(builderA));
    }

    @androidx.annotation.p0
    private static List<String> e(@androidx.annotation.p0 List<String> list, @androidx.annotation.p0 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.c cVar = new androidx.collection.c(list.size() + list2.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    @androidx.annotation.p0
    private static List<String> g(@androidx.annotation.p0 List<j0> list) {
        if (list == null) {
            int i10 = 2 | 0;
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<j0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.t
    public Notification.Builder a() {
        return this.f47468b;
    }

    public Notification c() {
        Bundle bundleN;
        RemoteViews remoteViewsX;
        RemoteViews remoteViewsV;
        w.y yVar = this.f47469c.f47371q;
        if (yVar != null) {
            yVar.b(this);
        }
        RemoteViews remoteViewsW = yVar != null ? yVar.w(this) : null;
        Notification notificationD = d();
        if (remoteViewsW != null) {
            notificationD.contentView = remoteViewsW;
        } else {
            RemoteViews remoteViews = this.f47469c.I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (yVar != null && (remoteViewsV = yVar.v(this)) != null) {
            notificationD.bigContentView = remoteViewsV;
        }
        if (yVar != null && (remoteViewsX = this.f47469c.f47371q.x(this)) != null) {
            notificationD.headsUpContentView = remoteViewsX;
        }
        if (yVar != null && (bundleN = w.n(notificationD)) != null) {
            yVar.a(bundleN);
        }
        return notificationD;
    }

    protected Notification d() {
        return this.f47468b.build();
    }

    Context f() {
        return this.f47467a;
    }
}
