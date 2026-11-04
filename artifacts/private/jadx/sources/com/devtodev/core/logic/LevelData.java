package com.devtodev.core.logic;

import com.devtodev.core.utils.DeviceUtils;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class LevelData implements Serializable {
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, Integer> f98162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, Integer> f98163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, Integer> f98164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, Integer> f98165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f98166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f98167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f98168j;

    public LevelData() {
        this.f98160b = false;
        this.f98161c = 0L;
        this.f98159a = 1;
        this.f98162d = new HashMap<>();
        this.f98163e = new HashMap<>();
        this.f98164f = new HashMap<>();
        this.f98165g = new HashMap<>();
    }

    void a(String str, int i10) {
        if (!this.f98165g.containsKey(str)) {
            this.f98165g.put(str, Integer.valueOf(i10));
        } else {
            this.f98165g.put(str, Integer.valueOf(this.f98165g.get(str).intValue() + i10));
        }
    }

    void b(String str, int i10) {
        if (!this.f98164f.containsKey(str)) {
            this.f98164f.put(str, Integer.valueOf(i10));
        } else {
            this.f98164f.put(str, Integer.valueOf(this.f98164f.get(str).intValue() + i10));
        }
    }

    void c(String str, int i10) {
        if (!this.f98163e.containsKey(str)) {
            this.f98163e.put(str, Integer.valueOf(i10));
        } else {
            this.f98163e.put(str, Integer.valueOf(this.f98163e.get(str).intValue() + i10));
        }
    }

    HashMap<String, Integer> d() {
        return this.f98165g;
    }

    HashMap<String, Integer> e() {
        return this.f98164f;
    }

    long f() {
        return this.f98168j;
    }

    HashMap<String, Integer> g() {
        return this.f98163e;
    }

    public int getLevel() {
        return this.f98159a;
    }

    public long getTimestamp() {
        return this.f98161c;
    }

    public boolean isNew() {
        return this.f98160b;
    }

    public void setNew(boolean z10) {
        if (this.f98160b) {
            return;
        }
        this.f98160b = z10;
        if (z10) {
            this.f98161c = DeviceUtils.getCurrentUnixTimeInMillis();
            this.f98168j = SDKClient.getInstance().getUsersStorages().getDataStorage().getSessionId();
        }
    }

    public void setTimestamp(long j10) {
        this.f98161c = j10;
    }

    public String toString() {
        return "\nLevel: " + this.f98159a + "\nTimestamp: " + this.f98161c + "\nIsNew: " + this.f98160b + "\nBalance: " + this.f98162d.toString() + "\nSpent: " + this.f98163e.toString() + "\nEarned: " + this.f98164f.toString() + "\nBought: " + this.f98165g.toString();
    }

    void a(HashMap<String, Integer> map) {
        if (map != null) {
            this.f98162d = map;
        }
    }

    LevelData b() {
        LevelData levelData = new LevelData();
        levelData.f98159a = this.f98159a;
        levelData.f98160b = false;
        levelData.f98161c = 0L;
        levelData.f98162d = (HashMap) this.f98162d.clone();
        levelData.f98164f = (HashMap) this.f98164f.clone();
        levelData.f98163e = (HashMap) this.f98163e.clone();
        levelData.f98165g = (HashMap) this.f98165g.clone();
        levelData.f98166h = this.f98166h;
        levelData.f98167i = this.f98167i;
        return levelData;
    }

    HashMap<String, Integer> c() {
        return this.f98162d;
    }

    void a() {
        this.f98162d.clear();
        this.f98164f.clear();
        this.f98163e.clear();
        this.f98165g.clear();
    }

    public LevelData(int i10, boolean z10) {
        this();
        this.f98159a = i10;
        setNew(z10);
    }
}
