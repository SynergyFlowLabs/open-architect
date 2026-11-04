package com.planner5d.library.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ManagedFile extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f180538a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180539b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180540c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f180541d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180542e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f180543f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f180544g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f180545h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f180546i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f180547j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f180548k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f180549l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f180550m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f180551n = "models/";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f180552o = "icons/items/256/";

    @Column(name = "datafile_version")
    public long datafileVersion;

    @Column(name = "date_updated")
    public Date dateUpdated;

    @Column(name = "download_priority")
    public int downloadPriority;

    @Column(name = "download_start")
    public Date downloadStart;

    @Column(name = "download_status")
    public int downloadStatus;

    @Column(name = "hash")
    public String hash;

    @Column(name = "in_catalog")
    public boolean inCatalog;

    @Column(name = "path")
    public String path;

    @Column(name = "size")
    public long size;

    @Column(name = "storage")
    public int storage;

    public int c() {
        if (this.path.startsWith(f180551n)) {
            return 1;
        }
        if (this.path.startsWith("icons/items/")) {
            return 2;
        }
        if (this.path.startsWith("icons/categories/")) {
            return 3;
        }
        return this.path.startsWith("materials/") ? 4 : 0;
    }

    public int s(Set<String> set) {
        String strV = v();
        return u(strV != null && set.contains(strV));
    }

    public int u(boolean z10) {
        if (!this.inCatalog) {
            return 0;
        }
        if (c() == 1) {
            return z10 ? 1 : 0;
        }
        return 2;
    }

    public String v() {
        if (this.path.startsWith(f180551n)) {
            String str = this.path;
            return str.substring(7, str.length() - 4).replace("_0", "");
        }
        if (!this.path.startsWith(f180552o)) {
            return null;
        }
        String str2 = this.path;
        return str2.substring(16, str2.length() - 5);
    }

    public String w() {
        if (c() == 4) {
            String[] strArrSplit = this.path.split("/");
            if (strArrSplit.length > 2 && "materials".equalsIgnoreCase(strArrSplit[0])) {
                int i10 = 6 << 1;
                return strArrSplit[1];
            }
        }
        return null;
    }

    public boolean x() {
        return !z() || this.downloadStatus == 2;
    }

    public boolean y() {
        return this.storage == 1 && this.downloadStatus == 0;
    }

    public boolean z() {
        return this.storage == 1;
    }
}
