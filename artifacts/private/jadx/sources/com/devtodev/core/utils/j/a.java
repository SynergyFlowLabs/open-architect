package com.devtodev.core.utils.j;

import com.devtodev.core.logic.MetricsStorage;
import com.devtodev.core.logic.NetworkStorage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkStorage f98354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<MetricsStorage> f98355d;

    public String a() {
        return this.f98352a;
    }

    public String b() {
        return this.f98353b;
    }

    public ArrayList<MetricsStorage> c() {
        return this.f98355d;
    }

    public NetworkStorage d() {
        return this.f98354c;
    }

    public void e() {
        if (this.f98355d.size() > 1) {
            ArrayList<MetricsStorage> arrayList = this.f98355d;
            MetricsStorage metricsStorage = arrayList.get(arrayList.size() - 1);
            for (int i10 = 0; i10 < this.f98355d.size() - 1; i10++) {
                MetricsStorage metricsStorage2 = this.f98355d.get(i10);
                metricsStorage2.setUserId(metricsStorage.getUserId());
                metricsStorage2.setPrevUserId(metricsStorage.getPrevUserId());
            }
        }
    }

    public void f() {
        if (this.f98355d.size() > 1) {
            MetricsStorage metricsStorage = this.f98355d.get(0);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 1; i10 < this.f98355d.size(); i10++) {
                MetricsStorage metricsStorage2 = this.f98355d.get(i10);
                metricsStorage.absorbPeopleData(metricsStorage2);
                if (metricsStorage2.size() == 0) {
                    arrayList.add(metricsStorage2);
                }
            }
            this.f98355d.removeAll(arrayList);
        }
    }

    public MetricsStorage g() {
        if (this.f98355d.size() <= 0) {
            return null;
        }
        MetricsStorage metricsStorage = this.f98355d.get(0);
        this.f98355d.remove(metricsStorage);
        return metricsStorage;
    }

    public void a(String str) {
        this.f98352a = str;
    }

    public void b(String str) {
        this.f98353b = str;
    }

    public void a(NetworkStorage networkStorage) {
        this.f98354c = networkStorage;
    }

    public void a(ArrayList<MetricsStorage> arrayList) {
        this.f98355d = arrayList;
    }
}
