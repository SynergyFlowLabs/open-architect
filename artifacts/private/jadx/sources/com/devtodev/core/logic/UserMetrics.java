package com.devtodev.core.logic;

import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.MetricConsts;
import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class UserMetrics implements Serializable {
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LevelData f98254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<Metric> f98255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, AggregatedMetric> f98256c;

    private UserMetrics() {
    }

    private void b(String str) {
        Iterator<Metric> it = this.f98255b.iterator();
        while (it.hasNext()) {
            if (it.next().getMetricCode().equals(str)) {
                it.remove();
            }
        }
    }

    boolean a(String str) {
        Iterator<Metric> it = this.f98255b.iterator();
        while (it.hasNext()) {
            if (it.next().getMetricCode().equalsIgnoreCase(str)) {
                return true;
            }
        }
        Iterator<String> it2 = this.f98256c.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    HashMap<String, AggregatedMetric> c() {
        return this.f98256c;
    }

    protected Object clone() throws CloneNotSupportedException {
        UserMetrics userMetrics = new UserMetrics();
        userMetrics.f98254a = this.f98254a;
        ArrayList<Metric> arrayList = new ArrayList<>();
        userMetrics.f98255b = arrayList;
        arrayList.addAll(this.f98255b);
        HashMap<String, AggregatedMetric> map = new HashMap<>();
        userMetrics.f98256c = map;
        map.putAll(this.f98256c);
        return userMetrics;
    }

    LevelData d() {
        return this.f98254a;
    }

    int e() {
        int size = this.f98255b.size();
        Iterator<AggregatedMetric> it = this.f98256c.values().iterator();
        while (it.hasNext()) {
            size += it.next().size();
        }
        if (this.f98254a.getTimestamp() > 0) {
            size++;
        }
        return size;
    }

    ArrayList<Metric> f() {
        return this.f98255b;
    }

    public String toString() {
        return "UserMetrics{levelData=" + this.f98254a + ", simpleMetrics=" + this.f98255b + ", aggregatedMetrics=" + this.f98256c + AbstractJsonLexerKt.END_OBJ;
    }

    UserMetrics(int i10, boolean z10, HashMap<String, Integer> map) {
        LevelData levelData = new LevelData(i10, z10);
        this.f98254a = levelData;
        levelData.a(map);
        this.f98255b = new ArrayList<>();
        this.f98256c = new HashMap<>();
    }

    void c(String str, int i10) {
        this.f98254a.c(str, i10);
    }

    boolean a(Metric metric) {
        if (metric instanceof AggregatedMetric) {
            String metricCode = metric.getMetricCode();
            AggregatedMetric aggregatedMetric = (AggregatedMetric) metric;
            if (this.f98256c.containsKey(metricCode)) {
                return this.f98256c.get(metricCode).addEntry(aggregatedMetric);
            }
            this.f98256c.put(metricCode, aggregatedMetric);
            return true;
        }
        if (this.f98255b == null) {
            this.f98255b = new ArrayList<>();
        }
        String metricCode2 = metric.getMetricCode();
        if (metricCode2 != null && ((metricCode2.equals("pt") || metricCode2.equals(MetricConsts.UserInfo) || metricCode2.equals("di") || metricCode2.equals(MetricConsts.ApplicationInfo)) && this.f98255b.size() > 0)) {
            b(metricCode2);
        }
        return this.f98255b.add(metric);
    }

    void b(String str, int i10) {
        this.f98254a.b(str, i10);
    }

    UserMetrics b() {
        UserMetrics userMetrics = new UserMetrics();
        userMetrics.f98254a = this.f98254a.b();
        userMetrics.f98255b = new ArrayList<>();
        userMetrics.f98256c = new HashMap<>();
        return userMetrics;
    }

    void a(String str, int i10) {
        this.f98254a.a(str, i10);
    }

    void a() {
        LevelData levelData = this.f98254a;
        if (levelData != null) {
            levelData.a();
        }
    }
}
