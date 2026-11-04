package com.devtodev.core.logic;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.devtodev.core.data.consts.AccrualType;
import com.devtodev.core.data.consts.ReferralProperty;
import com.devtodev.core.data.consts.SocialNetwork;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.ReferralMetric;
import com.devtodev.core.data.metrics.aggregated.currencyaccrual.CurrencyAccrualMetric;
import com.devtodev.core.data.metrics.aggregated.events.CustomEvent;
import com.devtodev.core.data.metrics.aggregated.events.CustomEventParams;
import com.devtodev.core.data.metrics.aggregated.ingamepurchase.InGamePurchaseMetric;
import com.devtodev.core.data.metrics.aggregated.progression.params.ProgressionEventParams;
import com.devtodev.core.data.metrics.aggregated.realpayment.RealPaymentMetric;
import com.devtodev.core.data.metrics.simple.AliveMetric;
import com.devtodev.core.data.metrics.simple.SocialConnectMetric;
import com.devtodev.core.data.metrics.simple.SocialPostMetric;
import com.devtodev.core.data.metrics.simple.TrackingStatus;
import com.devtodev.core.data.metrics.simple.TutorialMetric;
import com.devtodev.core.logic.people.People;
import com.devtodev.core.utils.DeviceUtils;
import com.devtodev.core.utils.log.CoreLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SDKClient {
    public static final String TAG = "SDKClient";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static SDKClient f98184l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.devtodev.core.logic.c.a f98185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.devtodev.core.logic.b.c f98186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.devtodev.core.logic.c.d f98187c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f98190f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f98192h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f98191g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f98193i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f98194j = new s();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.devtodev.core.network.a f98195k = new t();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.devtodev.core.logic.c.b f98188d = new com.devtodev.core.logic.c.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private People f98189e = new People();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressionEventParams f98197b;

        a(String str, ProgressionEventParams progressionEventParams) {
            this.f98196a = str;
            this.f98197b = progressionEventParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98196a != null && this.f98197b != null) {
                SDKClient.this.f98187c.h().a(new com.devtodev.core.data.metrics.aggregated.b.a(this.f98196a, this.f98197b, com.devtodev.core.data.metrics.aggregated.b.d.Opened));
                CoreLog.i("DevToDev", "Progression event  '" + this.f98196a + "' is started");
                return;
            }
            CoreLog.i("DevToDev", "Event id and parameters can't be null");
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressionEventParams f98200b;

        b(String str, ProgressionEventParams progressionEventParams) {
            this.f98199a = str;
            this.f98200b = progressionEventParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98199a == null || this.f98200b == null) {
                CoreLog.i("DevToDev", "Event id and parameters can't be null");
            } else {
                SDKClient.this.f98187c.h().a(new com.devtodev.core.data.metrics.aggregated.b.a(this.f98199a, this.f98200b, com.devtodev.core.data.metrics.aggregated.b.d.Closing));
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f98202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f98203b;

        c(int i10, HashMap map) {
            this.f98202a = i10;
            this.f98203b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreLog.i("DevToDev", "LevelUp: " + this.f98202a);
            SDKClient.this.f98187c.h().a(this.f98202a, this.f98203b, true);
            SDKClient.this.e();
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f98206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f98207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f98208d;

        d(String str, String str2, String str3, float f10) {
            this.f98205a = str;
            this.f98206b = str2;
            this.f98207c = str3;
            this.f98208d = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98205a == null || this.f98206b == null || this.f98207c == null) {
                return;
            }
            UsersStorages usersStoragesH = SDKClient.this.f98187c.h();
            if (usersStoragesH == null || usersStoragesH.a(this.f98205a)) {
                CoreLog.i("DevToDev", "Transaction ID is duplicate or player has been marked as cheater");
            } else {
                SDKClient.this.addMetric(new RealPaymentMetric(this.f98206b, this.f98205a, this.f98208d, this.f98207c));
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f98211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f98212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f98213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f98214e;

        e(String str, String str2, String str3, int i10, int i11) {
            this.f98210a = str;
            this.f98211b = str2;
            this.f98212c = str3;
            this.f98213d = i10;
            this.f98214e = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98210a != null && this.f98211b != null && this.f98212c != null) {
                UsersStorages usersStoragesH = SDKClient.this.f98187c.h();
                usersStoragesH.c(usersStoragesH.getLevel(), this.f98213d, this.f98212c);
                SDKClient.this.addMetric(new InGamePurchaseMetric(this.f98210a, this.f98211b, this.f98214e, this.f98213d, this.f98212c));
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccrualType f98217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f98218c;

        f(String str, AccrualType accrualType, int i10) {
            this.f98216a = str;
            this.f98217b = accrualType;
            this.f98218c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98216a == null) {
                return;
            }
            NetworkStorage networkStorageF = SDKClient.this.f98187c.f();
            UsersStorages usersStoragesH = SDKClient.this.f98187c.h();
            if (networkStorageF == null || !networkStorageF.a(new CurrencyAccrualMetric(0.0f, ""))) {
                return;
            }
            if (this.f98217b == AccrualType.Purchased) {
                usersStoragesH.a(usersStoragesH.getLevel(), this.f98218c, this.f98216a);
            } else {
                usersStoragesH.b(usersStoragesH.getLevel(), this.f98218c, this.f98216a);
            }
            CoreLog.i("DevToDev", "Metric Add: Currency accrual");
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f98220a;

        g(int i10) {
            this.f98220a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            UsersStorages usersStoragesH = SDKClient.this.f98187c.h();
            if (usersStoragesH.b(this.f98220a)) {
                CoreLog.i("DevToDev", "This tutorial step already sent. Skipped...");
            } else {
                SDKClient.this.addMetric(new TutorialMetric(this.f98220a));
                usersStoragesH.a(this.f98220a);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SocialNetwork f98222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f98223b;

        h(SocialNetwork socialNetwork, String str) {
            this.f98222a = socialNetwork;
            this.f98223b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.this.addMetric(new SocialPostMetric(this.f98222a, this.f98223b));
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SocialNetwork f98225a;

        i(SocialNetwork socialNetwork) {
            this.f98225a = socialNetwork;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.this.f98187c.h().a(new SocialConnectMetric(this.f98225a));
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashMap f98227a;

        j(HashMap map) {
            this.f98227a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDKClient.this.a()) {
                CoreLog.i("DevToDev", "Referral data of the current user is already sent");
            } else {
                SDKClient.this.a((HashMap<ReferralProperty, String>) this.f98227a);
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.this.sendBufferedEvents();
            SDKClient.this.addMetric(new AliveMetric());
            SDKClient.this.sendBufferedEvents();
            SDKClient.this.b();
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashMap f98230a;

        l(HashMap map) {
            this.f98230a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDKClient.this.a()) {
                CoreLog.i("DevToDev", "Referral data is already automatically sent");
            } else {
                SDKClient.this.a((HashMap<ReferralProperty, String>) this.f98230a);
            }
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UsersStorages usersStoragesH = SDKClient.this.f98187c.h();
            if (usersStoragesH != null && usersStoragesH.f() > 0) {
                SDKClient.this.f();
            }
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f98234b;

        n(String str, String str2) {
            this.f98233a = str;
            this.f98234b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2 = this.f98233a;
            if (str2 == null || str2.length() == 0 || (str = this.f98234b) == null || str.length() == 0 || this.f98233a.equals(this.f98234b)) {
                CoreLog.i("DevToDev", "Parameters null or empty");
            } else {
                if (this.f98234b.equalsIgnoreCase(DeviceUtils.CurrentAdId)) {
                    return;
                }
                SDKClient.this.f98187c.h().a(this.f98233a, this.f98234b);
            }
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f98236a;

        o(int i10) {
            this.f98236a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.this.f98187c.h().c(this.f98236a);
        }
    }

    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98238a;

        p(String str) {
            this.f98238a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f98238a;
            if (str == null || str.equalsIgnoreCase(DeviceUtils.CurrentAdId)) {
                return;
            }
            SDKClient.this.a(this.f98238a);
        }
    }

    class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Metric f98240a;

        q(Metric metric) {
            this.f98240a = metric;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.this.f98187c.h().a(this.f98240a);
            if (this.f98240a.isFastSend()) {
                SDKClient.this.f();
            } else {
                SDKClient.this.e();
            }
        }
    }

    class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f98242a;

        r(boolean z10) {
            this.f98242a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98242a && !SDKClient.this.f98187c.k()) {
                int i10 = 6 & 1;
                SDKClient.this.f98187c.a(true);
                SDKClient.this.a(true);
                com.devtodev.core.logic.a.b(SDKClient.this.f98187c.d(), SDKClient.this.f98195k);
            }
            if (this.f98242a || !SDKClient.this.f98187c.k()) {
                return;
            }
            SDKClient.this.a(false);
            SDKClient.this.sendBufferedEvents();
            SDKClient.this.f98187c.a(false);
        }
    }

    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDKClient.this.f98187c != null && SDKClient.this.f98187c.j()) {
                SDKClient.this.f();
            }
            SDKClient.this.c();
        }
    }

    class t implements com.devtodev.core.network.a {
        t() {
        }

        @Override // com.devtodev.core.network.a
        public void a(NetworkStorage networkStorage) {
            SDKClient.this.f98187c.a(networkStorage);
            SDKClient.this.f98187c.a();
            if (DeviceUtils.CurrentAdId == null) {
                DeviceUtils.CurrentAdId = DeviceUtils.getSavedAdvertisingIds(SDKClient.this.f98187c.h())[0];
            }
            SDKClient.this.f98188d.a();
            SDKClient.this.c();
            SDKClient.this.b();
            SDKClient.this.obtainPushMetrics();
            ((Application) SDKClient.this.f98187c.d().getApplicationContext()).registerActivityLifecycleCallbacks(SDKClient.this.f98185a);
        }
    }

    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDKClient.this.f98192h != null) {
                SDKClient.this.f98192h.removeCallbacks(SDKClient.this.f98194j);
                SDKClient.this.f98192h.postDelayed(SDKClient.this.f98194j, SDKClient.this.f98187c.f().e());
            }
        }
    }

    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDKClient.this.f98192h != null) {
                SDKClient.this.f98192h.removeCallbacks(SDKClient.this.f98193i);
                SDKClient.this.f98192h.postDelayed(SDKClient.this.f98193i, SDKClient.this.f98187c.f().getAliveTimeout());
            }
        }
    }

    class w implements com.devtodev.core.logic.b.a {
        w() {
        }

        @Override // com.devtodev.core.logic.b.a
        public void a(boolean z10) {
            try {
                if (z10) {
                    CoreLog.i("DevToDev", "Referrer client connected");
                    SDKClient sDKClient = SDKClient.this;
                    sDKClient.b(sDKClient.f98186b.b());
                } else {
                    CoreLog.i("DevToDev", "Could not connect referrer client");
                }
            } catch (Exception unused) {
                CoreLog.e("DevToDev", "Could not receive install referrer");
            }
            SDKClient.this.f98186b.a();
        }

        @Override // com.devtodev.core.logic.b.a
        public void onInstallReferrerServiceDisconnected() {
            CoreLog.i("DevToDev", "Referrer client disconnected");
        }
    }

    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.this.b();
            SDKClient.this.c();
            SDKClient.this.f98187c.h().h();
        }
    }

    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.this.f98187c.h().c();
            SDKClient.this.d();
            if (SDKClient.this.f98192h != null) {
                SDKClient.this.f98192h.removeCallbacks(SDKClient.this.f98193i);
                SDKClient.this.f98192h.removeCallbacks(SDKClient.this.f98194j);
            }
        }
    }

    class z implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CustomEventParams f98252b;

        z(String str, CustomEventParams customEventParams) {
            this.f98251a = str;
            this.f98252b = customEventParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f98251a == null) {
                return;
            }
            SDKClient.this.addMetric(new CustomEvent(this.f98251a, this.f98252b));
        }
    }

    private SDKClient() {
    }

    public static SDKClient getInstance() {
        if (f98184l == null) {
            SDKClient sDKClient = new SDKClient();
            f98184l = sDKClient;
            sDKClient.f98185a = new com.devtodev.core.logic.c.a();
        }
        return f98184l;
    }

    public void addMetric(Metric metric) {
        this.f98188d.a(new q(metric));
    }

    public void addToEventQueue(Runnable runnable) {
        this.f98188d.a(runnable);
    }

    public void currencyAccrual(int i10, String str, AccrualType accrualType) {
        this.f98188d.a(new f(str, accrualType, i10));
    }

    public void customEvent(String str, CustomEventParams customEventParams) {
        this.f98188d.a(new z(str, customEventParams));
    }

    public void endProgressionEvent(String str, ProgressionEventParams progressionEventParams) {
        this.f98188d.a(new b(str, progressionEventParams));
    }

    public void endSession() {
        this.f98188d.a(new y());
    }

    public People getActivePlayer() {
        return this.f98189e;
    }

    public String getApplicationKey() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        if (dVar == null) {
            return null;
        }
        return dVar.c();
    }

    public Context getContext() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        if (dVar == null) {
            return null;
        }
        return dVar.d();
    }

    public NetworkStorage getNetworkStorage() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        return dVar == null ? new NetworkStorage() : dVar.f();
    }

    public String getSecretKey() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        if (dVar == null) {
            return null;
        }
        return dVar.g();
    }

    public String getUUID() {
        return d.a.a(this.f98187c.d());
    }

    public String getUserUdid() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        return (dVar == null || !dVar.j()) ? "" : this.f98187c.b();
    }

    public UsersStorages getUsersStorages() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        if (dVar == null) {
            return null;
        }
        return dVar.h();
    }

    public void inGamePurchase(String str, String str2, int i10, int i11, String str3) {
        this.f98188d.a(new e(str, str2, str3, i11, i10));
    }

    public void initialize(Context context, String str, String str2) {
        if (new com.devtodev.core.logic.c.c().a(context, str, str2, this.f98187c)) {
            com.devtodev.core.logic.c.d dVarA = new com.devtodev.core.logic.c.d.b(context).a(str).c(str2).b(this.f98190f).a(this.f98191g).a();
            this.f98187c = dVarA;
            dVarA.l();
            this.f98192h = new Handler(Looper.getMainLooper());
            a(context);
            if (this.f98187c.k()) {
                com.devtodev.core.logic.a.b(context, this.f98195k);
            } else {
                this.f98188d.a();
                CoreLog.i("DevToDev", CoreLog.TRACKING_DISABLED);
            }
        }
    }

    public boolean isFirstLaunch() {
        UsersStorages usersStoragesH = this.f98187c.h();
        return usersStoragesH != null && usersStoragesH.g();
    }

    public boolean isInitialized() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        return dVar != null && dVar.j();
    }

    public void levelUp(int i10, HashMap<String, Integer> map) {
        this.f98188d.a(new c(i10, map));
    }

    public void obtainPushMetrics() {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void realPayment(String str, float f10, String str2, String str3) {
        this.f98188d.a(new d(str, str2, str3, f10));
    }

    public void referrer(HashMap<ReferralProperty, String> map) {
        if (map.isEmpty()) {
            CoreLog.i("DevToDev", "Referral data is empty");
        } else {
            this.f98188d.a(new j(map));
        }
    }

    public void replaceUserId(String str, String str2) {
        this.f98188d.a(new n(str, str2));
    }

    public void sendBufferedEvents() {
        this.f98188d.a(new m());
    }

    public void setCurrentLevel(int i10) {
        this.f98191g = i10;
        this.f98188d.a(new o(i10));
    }

    public void setTestCustomUrl(String str) {
        com.devtodev.core.logic.a.a(str);
    }

    public void setTestProxyUrl(String str) {
        com.devtodev.core.logic.a.b(str);
    }

    public void setTrackingAvailability(boolean z10) {
        this.f98188d.a(new r(z10));
    }

    public void setUserId(String str) {
        com.devtodev.core.logic.c.d dVar = this.f98187c;
        if (dVar == null || !dVar.j()) {
            this.f98190f = str;
        } else {
            this.f98188d.a(new p(str));
        }
    }

    public void socialNetworkConnect(SocialNetwork socialNetwork) {
        this.f98188d.a(new i(socialNetwork));
    }

    public void socialNetworkPost(SocialNetwork socialNetwork, String str) {
        this.f98188d.a(new h(socialNetwork, str));
    }

    public void startProgressionEvent(String str, ProgressionEventParams progressionEventParams) {
        this.f98188d.a(new a(str, progressionEventParams));
    }

    public void startSession() {
        this.f98188d.a(new x());
    }

    public void tutorialCompleted(int i10) {
        this.f98188d.a(new g(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f98188d.a(new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f98187c.j()) {
            if (this.f98187c.h().f() >= this.f98187c.e()) {
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f98187c.j() && this.f98187c.h().f() > 0) {
            b();
            this.f98187c.i();
        }
    }

    synchronized void d() {
        try {
            this.f98187c.n();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void inGamePurchase(String str, String str2, int i10, HashMap<String, Integer> map) {
        boolean z10 = true;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            inGamePurchase(str, str2, z10 ? i10 : 0, entry.getValue().intValue(), entry.getKey());
            z10 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f98188d.a(new v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HashMap<ReferralProperty, String> map) {
        if (map.isEmpty()) {
            CoreLog.i("DevToDev", "Referral data received automatically is empty");
        } else {
            this.f98188d.a(new l(map));
        }
    }

    private void a(Context context) {
        if (a()) {
            return;
        }
        if (this.f98186b == null) {
            try {
                this.f98186b = new com.devtodev.core.logic.b.c(context, new com.devtodev.core.logic.b.d());
            } catch (NoClassDefFoundError unused) {
                CoreLog.e("DevToDev", "Could not create InstallReferrerClient");
                return;
            }
        }
        this.f98186b.a(new w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<ReferralProperty, String> map) {
        DataStorage dataStorage = this.f98187c.h().getDataStorage();
        ReferralMetric referralMetric = new ReferralMetric(map);
        addMetric(referralMetric);
        dataStorage.a(referralMetric);
        androidx.preference.s.d(getContext()).edit().putBoolean(ReferralMetric.METRIC_NAME, true).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return androidx.preference.s.d(getContext()).getBoolean(ReferralMetric.METRIC_NAME, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        UsersStorages.sessionNotWasRun = false;
        endSession();
        this.f98187c.h().setActiveUserId(str);
        startSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        addMetric(new TrackingStatus(z10));
    }
}
