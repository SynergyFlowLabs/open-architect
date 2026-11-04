package com.devtodev.core.logic.c;

import android.content.Context;
import com.devtodev.core.logic.DataStorage;
import com.devtodev.core.logic.MetricsStorage;
import com.devtodev.core.logic.NetworkStorage;
import com.devtodev.core.logic.UsersStorages;
import com.devtodev.core.utils.IOUtils;
import com.devtodev.core.utils.log.CoreLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f98291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private UsersStorages f98294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NetworkStorage f98295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f98296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f98297g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f98298a;

        public b(Context context) {
            this.f98298a = new d(context);
        }

        public b a(String str) {
            this.f98298a.f98292b = str;
            return this;
        }

        public b b(String str) {
            this.f98298a.f98296f = str;
            return this;
        }

        public b c(String str) {
            this.f98298a.f98293c = str;
            return this;
        }

        public b a(int i10) {
            this.f98298a.f98297g = i10;
            return this;
        }

        public d a() {
            return this.f98298a;
        }
    }

    private void m() {
        Context context = this.f98291a;
        String str = DataStorage.NAME;
        if (IOUtils.isStorageExist(context, str)) {
            DataStorage dataStorageLoadDataStorage = IOUtils.loadDataStorage(this.f98291a);
            MetricsStorage metricsStorage = (MetricsStorage) IOUtils.loadStorage(this.f98291a, MetricsStorage.class, MetricsStorage.NAME, true);
            String userId = dataStorageLoadDataStorage.getUserId();
            metricsStorage.setUserId(userId);
            metricsStorage.setLevel(dataStorageLoadDataStorage.getLevel(), null, false);
            this.f98294d.putDataStorage(userId, dataStorageLoadDataStorage);
            this.f98294d.putMetricsStorage(userId, metricsStorage);
            this.f98294d.setSavedAdvertisingId(dataStorageLoadDataStorage.getSavedAdvertisingId());
            this.f98294d.setSavedUdids(dataStorageLoadDataStorage.getSavedUdids());
            IOUtils.deleteStorage(this.f98291a, str);
            IOUtils.deleteStorage(this.f98291a, MetricsStorage.NAME);
        }
    }

    public Context d() {
        return this.f98291a;
    }

    public int e() {
        NetworkStorage networkStorage = this.f98295e;
        if (networkStorage != null) {
            return networkStorage.getCustomEventParamsCount();
        }
        return 10;
    }

    public NetworkStorage f() {
        return this.f98295e;
    }

    public String g() {
        return this.f98293c;
    }

    public UsersStorages h() {
        return this.f98294d;
    }

    public void i() {
        if (j()) {
            this.f98294d.sendMetrics(this.f98291a, this.f98295e);
        }
    }

    public boolean j() {
        return (this.f98294d == null || this.f98295e == null) ? false : true;
    }

    public boolean k() {
        return this.f98294d.isTrackingAvailable();
    }

    public void l() {
        this.f98295e = (NetworkStorage) IOUtils.loadStorage(this.f98291a, NetworkStorage.class, NetworkStorage.NAME, true);
        this.f98294d = (UsersStorages) IOUtils.loadStorage(this.f98291a, UsersStorages.class, UsersStorages.NAME, true);
        m();
        this.f98294d.getLevel();
        this.f98294d.getActiveUserId();
        HashMap<String, DataStorage> usersDataStorages = this.f98294d.getUsersDataStorages();
        this.f98294d.isTrackingAvailable();
        usersDataStorages.toString();
    }

    public void n() {
        try {
            IOUtils.saveStorage(this.f98291a, this.f98295e, NetworkStorage.NAME, true);
            IOUtils.saveStorage(this.f98291a, this.f98294d, UsersStorages.NAME, true);
        } catch (Exception e10) {
            CoreLog.d("DevToDev", e10.getMessage());
        }
    }

    private d(Context context) {
        this.f98297g = 0;
        this.f98291a = context;
    }

    public String b() {
        UsersStorages usersStorages = this.f98294d;
        if (usersStorages != null) {
            return usersStorages.getActiveUserId();
        }
        return null;
    }

    public String c() {
        return this.f98292b;
    }

    public void a(NetworkStorage networkStorage) {
        this.f98295e = networkStorage;
    }

    public void a() {
        if (this.f98294d.getUsersCount() == 0) {
            String str = this.f98296f;
            if (str != null) {
                this.f98294d.setActiveUserId(str);
                this.f98296f = null;
            } else {
                int i10 = this.f98297g;
                if (i10 != 0) {
                    this.f98294d.setActiveUserId("", i10);
                } else {
                    this.f98294d.setActiveUserId("");
                }
            }
        } else {
            if (this.f98296f == null) {
                this.f98296f = "";
            }
            this.f98294d.updateActiveUserId(this.f98296f);
            this.f98294d.updateCurrentLevel(this.f98297g);
            this.f98294d.getInfoIfNotExist();
        }
        this.f98294d.clearNotClosedProgression();
        this.f98294d.checkForChangeIds();
        if (com.devtodev.core.utils.c.a(this.f98291a)) {
            this.f98294d.setNewInstall(true);
        }
    }

    public void a(boolean z10) {
        this.f98294d.setTrackingAvailable(z10);
    }
}
