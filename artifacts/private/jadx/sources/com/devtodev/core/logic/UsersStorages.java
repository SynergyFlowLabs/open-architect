package com.devtodev.core.logic;

import android.content.Context;
import androidx.annotation.NonNull;
import com.devtodev.core.data.consts.Gender;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.simple.ApplicationInfo;
import com.devtodev.core.data.metrics.simple.DeviceInfo;
import com.devtodev.core.data.metrics.simple.SessionStart;
import com.devtodev.core.data.metrics.simple.UserEngagement;
import com.devtodev.core.data.metrics.simple.UserInfo;
import com.devtodev.core.utils.DeviceUtils;
import com.devtodev.core.utils.i.b;
import com.devtodev.core.utils.i.c;
import com.devtodev.core.utils.log.CoreLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class UsersStorages implements Serializable {
    public static final String NAME = "UsersStorages";
    private static final long serialVersionUID = 5;
    public static boolean sessionNotWasRun = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, DataStorage> f98260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, MetricsStorage> f98261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f98262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient boolean f98263g;

    class a implements b {
        a(UsersStorages usersStorages) {
        }

        @Override // com.devtodev.core.utils.i.b
        public void a(JSONObject jSONObject) {
            String strOptString = jSONObject.optString(p.a.G);
            String strOptString2 = jSONObject.optString("birthday");
            if (strOptString != null) {
                if (strOptString.equals("male")) {
                    Gender gender = Gender.Male;
                } else if (strOptString.equals("female")) {
                    Gender gender2 = Gender.Female;
                } else {
                    Gender gender3 = Gender.Unknown;
                }
            }
            if (strOptString2 != null) {
                new c().a(strOptString2);
            }
        }
    }

    public UsersStorages() {
        this.f98260d = new HashMap<>();
        this.f98261e = new HashMap<>();
        if (this.f98260d == null) {
            this.f98260d = new HashMap<>();
        }
        if (this.f98261e == null) {
            this.f98261e = new HashMap<>();
        }
        this.f98262f = 0;
    }

    private boolean a(long j10, long j11, long j12) {
        return j11 == 0 || j10 - j11 >= j12;
    }

    private MetricsStorage b() {
        DataStorage dataStorage = getDataStorage();
        MetricsStorage metricsStorageE = e();
        MetricsStorage metricsStorage = new MetricsStorage(getLevel());
        this.f98261e.put(this.f98257a, metricsStorage);
        metricsStorage.a(getLevel(), metricsStorageE);
        metricsStorage.setUserId(dataStorage.getUserId());
        metricsStorage.setPrevUserId(dataStorage.i());
        String userId = metricsStorageE.getUserId();
        String strB = b(this.f98257a);
        metricsStorageE.setUserId(strB);
        if (userId != null && !userId.equals(strB)) {
            metricsStorageE.setPrevUserId(userId);
        }
        return metricsStorageE;
    }

    private void d() {
        Context context = SDKClient.getInstance().getContext();
        if (context != null) {
            a(new ApplicationInfo(context), getLevel());
            a(new DeviceInfo(context), getLevel());
            if ("".equals(this.f98257a)) {
                String deviceId = DeviceUtils.CurrentAdId;
                if (deviceId == null) {
                    deviceId = DeviceUtils.getDeviceId(context);
                }
                a(new UserInfo(context, deviceId, 0L), getLevel());
            } else {
                DataStorage dataStorage = this.f98260d.get(this.f98257a);
                if (dataStorage == null) {
                    dataStorage = new DataStorage();
                    this.f98260d.put(this.f98257a, dataStorage);
                }
                a(new UserInfo(context, this.f98257a, dataStorage.e()), getLevel());
            }
            SDKClient.getInstance().sendBufferedEvents();
        }
    }

    private void e(String str) {
        if (this.f98260d.get(str) == null) {
            c(str);
        }
        if (this.f98261e == null) {
            this.f98261e = new HashMap<>();
        }
        if (this.f98261e.get(str) == null) {
            d(str);
        }
    }

    private void f(String str) {
        DataStorage dataStorage = this.f98260d.get("");
        if (dataStorage == null) {
            dataStorage = new DataStorage();
            this.f98260d.put("", dataStorage);
        }
        MetricsStorage metricsStorage = this.f98261e.get("");
        if (metricsStorage == null) {
            metricsStorage = new MetricsStorage(dataStorage.getLevel());
            this.f98261e.put("", metricsStorage);
        }
        dataStorage.b(dataStorage.getUserId());
        metricsStorage.setPrevUserId(dataStorage.getUserId());
        dataStorage.c(str);
        metricsStorage.setUserId(str);
        this.f98260d.remove("");
        this.f98261e.remove("");
        this.f98260d.put(str, dataStorage);
        this.f98261e.put(str, metricsStorage);
    }

    void c() {
        DataStorage dataStorage = getDataStorage();
        long currentUnixTime = DeviceUtils.getCurrentUnixTime();
        a(currentUnixTime - dataStorage.g());
        dataStorage.b(currentUnixTime);
        sessionNotWasRun = true;
    }

    public void checkForChangeIds() {
        if ("".equals(this.f98257a)) {
            DataStorage dataStorage = getDataStorage();
            MetricsStorage metricsStorageE = e();
            String userId = dataStorage.getUserId();
            String str = DeviceUtils.CurrentAdId;
            if (str == null || userId == null || userId.equalsIgnoreCase(str)) {
                return;
            }
            dataStorage.c(str);
            metricsStorageE.setUserId(str);
            dataStorage.b(userId);
            metricsStorageE.setPrevUserId(userId);
            SDKClient.getInstance().sendBufferedEvents();
        }
    }

    public void clearNotClosedProgression() {
        getDataStorage().a();
    }

    boolean g() {
        return this.f98263g;
    }

    public String getActiveUserId() {
        return this.f98257a;
    }

    public DataStorage getDataStorage() {
        if (this.f98257a == null) {
            this.f98257a = "";
        }
        DataStorage dataStorage = this.f98260d.get(this.f98257a);
        if (dataStorage == null) {
            dataStorage = new DataStorage();
            this.f98260d.put(this.f98257a, dataStorage);
        }
        return dataStorage;
    }

    public void getInfoIfNotExist() {
        d();
        a();
    }

    public int getLevel() {
        if (this.f98257a == null) {
            this.f98257a = "";
        }
        if (this.f98260d.get(this.f98257a) == null) {
            e(this.f98257a);
        }
        return getDataStorage().getLevel();
    }

    public String getSavedAdvertisingId() {
        return this.f98258b;
    }

    public String getSavedUdids() {
        return this.f98259c;
    }

    public int getUsersCount() {
        if (this.f98257a == null) {
            return 0;
        }
        return this.f98260d.size();
    }

    public HashMap<String, DataStorage> getUsersDataStorages() {
        return this.f98260d;
    }

    void h() {
        DataStorage dataStorage = getDataStorage();
        NetworkStorage networkStorage = SDKClient.getInstance().getNetworkStorage();
        long jF = dataStorage.f();
        long currentUnixTime = DeviceUtils.getCurrentUnixTime();
        long currentUnixTimeInMillis = DeviceUtils.getCurrentUnixTimeInMillis();
        if (a(currentUnixTime, jF, networkStorage.f())) {
            b(currentUnixTimeInMillis);
        }
        dataStorage.c(currentUnixTime);
    }

    public boolean isTrackingAvailable() {
        return this.f98262f == 0;
    }

    public void putDataStorage(String str, DataStorage dataStorage) {
        if (str == null) {
            str = "";
        }
        if (dataStorage.getUserId() == null || dataStorage.getUserId().length() == 0) {
            dataStorage.c(b(str));
        }
        String strI = dataStorage.i();
        if (str.length() > 0 && (strI == null || strI.length() == 0)) {
            dataStorage.b(b((String) null));
        }
        this.f98260d.put(str, dataStorage);
    }

    public void putMetricsStorage(String str, MetricsStorage metricsStorage) {
        if (str == null) {
            str = "";
        }
        if (metricsStorage.getUserId() == null || metricsStorage.getUserId().length() == 0) {
            metricsStorage.setUserId(b(str));
        }
        String prevUserId = metricsStorage.getPrevUserId();
        if (str.length() > 0 && (prevUserId == null || prevUserId.length() == 0)) {
            metricsStorage.setPrevUserId(b((String) null));
        }
        this.f98261e.put(str, metricsStorage);
    }

    public void sendMetrics(Context context, NetworkStorage networkStorage) {
        if (f() > 0) {
            DataStorage dataStorage = getDataStorage();
            MetricsStorage metricsStorageB = b();
            try {
                com.devtodev.core.data.metrics.aggregated.a.b bVarB = getDataStorage().getPlayerPreferences().b();
                if (bVarB != null) {
                    metricsStorageB.a(getLevel(), bVarB, dataStorage.h());
                }
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            }
            dataStorage.a(metricsStorageB);
            try {
                com.devtodev.core.logic.a.a(context, networkStorage, dataStorage.l());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public void setActiveUserId(String str) {
        String str2 = this.f98257a;
        if (str2 != null && (str2.equalsIgnoreCase(str) || str == null)) {
            checkForChangeIds();
            if (this.f98257a.equalsIgnoreCase(str)) {
                return;
            }
            getInfoIfNotExist();
            return;
        }
        this.f98257a = str;
        if (this.f98260d.get("") != null && this.f98260d.get(str) == null) {
            f(str);
        }
        e(str);
        CoreLog.i("DevToDev", "Set active userId to " + str);
        DataStorage dataStorage = this.f98260d.get(this.f98257a);
        if (dataStorage == null) {
            dataStorage = new DataStorage();
            this.f98260d.put(this.f98257a, dataStorage);
        }
        if (dataStorage.e() == 0 && !this.f98257a.equals("")) {
            dataStorage.a(DeviceUtils.getCurrentUnixTimeInMillis());
        }
        checkForChangeIds();
        d();
    }

    public void setNewInstall(boolean z10) {
        this.f98263g = z10;
    }

    public void setSavedAdvertisingId(String str) {
        this.f98258b = str;
    }

    public void setSavedUdids(String str) {
        this.f98259c = str;
    }

    public void setTrackingAvailable(boolean z10) {
        this.f98262f = !z10 ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActiveUserId: ");
        sb2.append(this.f98257a);
        for (Map.Entry<String, DataStorage> entry : this.f98260d.entrySet()) {
            sb2.append("\n\tDataStorage: ");
            sb2.append("\n\t\t");
            sb2.append(entry.getValue().toString());
        }
        return sb2.toString();
    }

    public void updateActiveUserId(String str) {
        if (!str.equals("")) {
            this.f98257a = str;
        }
    }

    public void updateCurrentLevel(int i10) {
        if (i10 != 0) {
            getDataStorage().setLevel(i10);
        }
    }

    private void a() {
        com.devtodev.core.utils.i.a.a().a(new a(this));
    }

    boolean a(String str) {
        Iterator<DataStorage> it = this.f98260d.values().iterator();
        while (it.hasNext()) {
            if (it.next().a(str)) {
                return true;
            }
        }
        return false;
    }

    boolean a(Metric metric) {
        return a(metric, getLevel());
    }

    private boolean a(Metric metric, int i10) {
        if (!isTrackingAvailable()) {
            CoreLog.i("DevToDev", CoreLog.TRACKING_DISABLED);
            return false;
        }
        DataStorage dataStorage = getDataStorage();
        MetricsStorage metricsStorageE = e();
        if (!(metric instanceof com.devtodev.core.data.metrics.aggregated.b.a)) {
            return metricsStorageE.a(i10, metric, dataStorage.h());
        }
        dataStorage.a((com.devtodev.core.data.metrics.aggregated.b.a) metric);
        return metricsStorageE.a(i10, dataStorage.d());
    }

    private MetricsStorage e() {
        if (this.f98261e == null) {
            this.f98261e = new HashMap<>();
        }
        MetricsStorage metricsStorage = this.f98261e.get(this.f98257a);
        if (metricsStorage != null) {
            return metricsStorage;
        }
        MetricsStorage metricsStorage2 = new MetricsStorage();
        this.f98261e.put(this.f98257a, metricsStorage2);
        return metricsStorage2;
    }

    void c(int i10, int i11, String str) {
        DataStorage dataStorage = getDataStorage();
        MetricsStorage metricsStorageE = e();
        if (dataStorage == null || !dataStorage.j()) {
            return;
        }
        metricsStorageE.c(i10, i11, str);
    }

    private void c(String str) {
        DataStorage dataStorage = new DataStorage();
        dataStorage.c(b(str));
        this.f98260d.put(str, dataStorage);
    }

    private void b(long j10) {
        getDataStorage().d(j10);
        a(new SessionStart(j10));
    }

    private void d(String str) {
        MetricsStorage metricsStorage = new MetricsStorage();
        metricsStorage.setUserId(b(str));
        this.f98261e.put(str, metricsStorage);
    }

    void c(int i10) {
        e(this.f98257a);
        DataStorage dataStorage = getDataStorage();
        MetricsStorage metricsStorageE = e();
        if (getLevel() != i10) {
            e().a();
            dataStorage.a(false);
        }
        dataStorage.setLevel(i10);
        metricsStorageE.setLevel(i10, null, false);
        CoreLog.i("DevToDev", "Set level " + i10 + " on user '" + this.f98257a + "'");
    }

    void a(long j10) {
        if (j10 > 0) {
            a(new UserEngagement(j10));
        }
    }

    int f() {
        if (this.f98257a == null) {
            return 0;
        }
        DataStorage dataStorage = getDataStorage();
        MetricsStorage metricsStorageE = e();
        int iK = dataStorage.k();
        return metricsStorageE.size() + iK + dataStorage.b();
    }

    void a(int i10, int i11, String str) {
        DataStorage dataStorage = getDataStorage();
        MetricsStorage metricsStorageE = e();
        if (dataStorage == null || !dataStorage.j()) {
            return;
        }
        metricsStorageE.a(i10, i11, str);
    }

    void b(int i10, int i11, String str) {
        DataStorage dataStorage = getDataStorage();
        MetricsStorage metricsStorageE = e();
        if (dataStorage == null || !dataStorage.j()) {
            return;
        }
        metricsStorageE.b(i10, i11, str);
    }

    public void setActiveUserId(String str, int i10) {
        String str2 = this.f98257a;
        if (str2 != null && (str2.equalsIgnoreCase(str) || str == null)) {
            checkForChangeIds();
            if (this.f98257a.equalsIgnoreCase(str)) {
                return;
            }
            getInfoIfNotExist();
            return;
        }
        this.f98257a = str;
        if (this.f98260d.get("") != null && this.f98260d.get(str) == null) {
            f(str);
        }
        e(str);
        CoreLog.i("DevToDev", "Set active userId to " + str);
        DataStorage dataStorage = this.f98260d.get(this.f98257a);
        if (dataStorage == null) {
            dataStorage = new DataStorage();
            dataStorage.setLevel(i10);
            this.f98260d.put(this.f98257a, dataStorage);
        } else {
            dataStorage.setLevel(i10);
        }
        if (dataStorage.e() == 0 && !this.f98257a.equals("")) {
            dataStorage.a(DeviceUtils.getCurrentUnixTimeInMillis());
        }
        checkForChangeIds();
        d();
    }

    void a(int i10) {
        getDataStorage().a(i10);
    }

    boolean b(int i10) {
        return getDataStorage().b(i10);
    }

    @NonNull
    private String b(String str) {
        if (str == null || str.length() == 0) {
            str = DeviceUtils.getAdvertiserID();
        }
        return (str == null || str.length() == 0) ? DeviceUtils.getDeviceId(SDKClient.getInstance().getContext()) : str;
    }

    void a(int i10, HashMap<String, Integer> map, boolean z10) {
        DataStorage dataStorage = getDataStorage();
        dataStorage.a(true);
        dataStorage.setLevel(i10);
        e().setLevel(i10, map, z10);
    }

    void a(String str, String str2) {
        Context context;
        DataStorage dataStorage = this.f98260d.get(str);
        MetricsStorage metricsStorage = this.f98261e.get(str);
        if (dataStorage != null) {
            this.f98260d.remove(str);
            this.f98260d.put(str2, dataStorage);
            dataStorage.b(dataStorage.getUserId());
            dataStorage.c(str2);
            if (dataStorage.e() == 0) {
                dataStorage.a(DeviceUtils.getCurrentUnixTimeInMillis());
            }
        }
        if (metricsStorage != null) {
            this.f98261e.remove(str);
            this.f98261e.put(str2, metricsStorage);
            metricsStorage.setPrevUserId(metricsStorage.getUserId());
            metricsStorage.setUserId(str2);
        }
        if (str.equals(this.f98257a)) {
            this.f98257a = str2;
        }
        if (dataStorage == null || (context = SDKClient.getInstance().getContext()) == null) {
            return;
        }
        a(new UserInfo(context, str2, dataStorage.e()), getDataStorage().getLevel());
        SDKClient.getInstance().sendBufferedEvents();
        CoreLog.i("DevToDev", "User '" + str + "' renamed to '" + str2 + "'");
    }

    void a(ArrayList<MetricsStorage> arrayList) {
        getDataStorage().a(arrayList);
    }
}
