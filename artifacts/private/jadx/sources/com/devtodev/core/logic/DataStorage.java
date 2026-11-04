package com.devtodev.core.logic;

import com.devtodev.core.data.metrics.ReferralMetric;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class DataStorage implements Serializable {
    public static final String NAME = "DataStorage";
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98146c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f98150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f98151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f98152i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f98155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f98156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f98157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f98158o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98144a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98145b = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<MetricsStorage> f98148e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f98149f = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f98147d = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.devtodev.core.logic.people.a f98153j = new com.devtodev.core.logic.people.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.devtodev.core.data.metrics.aggregated.b.a f98154k = new com.devtodev.core.data.metrics.aggregated.b.a();

    private void m() {
        if (this.f98148e.size() != 0) {
            this.f98148e.remove(0);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        try {
            objectInputStream.defaultReadObject();
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
        }
    }

    void a(ReferralMetric referralMetric) {
    }

    boolean b(int i10) {
        ArrayList<Integer> arrayList = this.f98147d;
        if (arrayList == null) {
            this.f98147d = new ArrayList<>();
            return false;
        }
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == i10) {
                return true;
            }
        }
        return false;
    }

    void c(String str) {
        this.f98145b = str;
    }

    com.devtodev.core.data.metrics.aggregated.b.a d() {
        c();
        return this.f98154k.b();
    }

    long e() {
        return this.f98146c;
    }

    long f() {
        return this.f98157n;
    }

    long g() {
        return this.f98156m;
    }

    public int getLevel() {
        return this.f98144a;
    }

    public com.devtodev.core.logic.people.a getPlayerPreferences() {
        if (this.f98153j == null) {
            this.f98153j = new com.devtodev.core.logic.people.a();
        }
        return this.f98153j;
    }

    public String getSavedAdvertisingId() {
        return this.f98150g;
    }

    public String getSavedUdids() {
        return this.f98151h;
    }

    public long getSessionId() {
        return this.f98155l;
    }

    public String getUserId() {
        return this.f98145b;
    }

    ArrayList<String> h() {
        c();
        return this.f98154k.c();
    }

    String i() {
        return this.f98152i;
    }

    public boolean isPaying() {
        return this.f98149f.size() != 0;
    }

    boolean j() {
        return this.f98158o;
    }

    int k() {
        com.devtodev.core.logic.people.a aVar = this.f98153j;
        return (aVar == null || !aVar.c()) ? 0 : 1;
    }

    ArrayList<MetricsStorage> l() {
        ArrayList<MetricsStorage> arrayList = new ArrayList<>(this.f98148e);
        this.f98148e = new ArrayList<>();
        return arrayList;
    }

    public void setLevel(int i10) {
        this.f98144a = i10;
    }

    public String toString() {
        return "Level: " + this.f98144a + " UserId: " + this.f98145b;
    }

    private void c() {
        if (this.f98154k == null) {
            this.f98154k = new com.devtodev.core.data.metrics.aggregated.b.a();
        }
    }

    void a(ArrayList<MetricsStorage> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (MetricsStorage metricsStorage : arrayList) {
            if (metricsStorage != null && !metricsStorage.a("al")) {
                arrayList2.add(metricsStorage);
            }
        }
        this.f98148e.addAll(0, arrayList2);
    }

    void d(long j10) {
        this.f98155l = j10;
    }

    void c(long j10) {
        this.f98156m = j10;
    }

    void b(String str) {
        this.f98152i = str;
    }

    int b() {
        c();
        return this.f98154k.size();
    }

    synchronized void a(MetricsStorage metricsStorage) {
        try {
            if (this.f98148e.size() >= 100) {
                m();
            }
            this.f98148e.add(metricsStorage);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void b(long j10) {
        this.f98157n = j10;
    }

    void a(int i10) {
        this.f98147d.add(Integer.valueOf(i10));
    }

    boolean a(String str) {
        if (this.f98149f.contains(str)) {
            return true;
        }
        this.f98149f.add(str);
        return false;
    }

    void a(long j10) {
        this.f98146c = j10;
    }

    boolean a(com.devtodev.core.data.metrics.aggregated.b.a aVar) {
        c();
        return this.f98154k.addEntry(aVar);
    }

    void a() {
        c();
        this.f98154k.a();
    }

    void a(boolean z10) {
        this.f98158o = z10;
    }
}
