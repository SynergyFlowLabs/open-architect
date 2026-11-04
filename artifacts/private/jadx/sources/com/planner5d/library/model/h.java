package com.planner5d.library.model;

import android.graphics.PointF;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.model.manager.q0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0.c f180739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f180742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f180743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f180744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f180745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x[] f180746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f180747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f180748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f180749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f180750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f180751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f180752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f180753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String[] f180754p;

    public h(q0.c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j10, long j11, long j12, @NonNull x[] xVarArr, @NonNull int[] iArr, String str8, String[] strArr, long j13) {
        this.f180739a = cVar;
        this.f180740b = str;
        this.f180741c = str2;
        this.f180742d = str3;
        this.f180747i = j10;
        this.f180748j = j11;
        this.f180749k = j12;
        this.f180746h = xVarArr;
        this.f180751m = str4;
        this.f180752n = iArr;
        this.f180743e = str5;
        this.f180744f = str6;
        this.f180745g = str7;
        this.f180753o = str8;
        this.f180754p = strArr;
        this.f180750l = j13;
    }

    private Integer b(Integer num) {
        if (num == null) {
            return null;
        }
        int[] iArr = this.f180752n;
        if (iArr.length == 0) {
            return null;
        }
        int iMax = iArr[0];
        for (int i10 : iArr) {
            if (i10 <= num.intValue()) {
                iMax = Math.max(iMax, i10);
            }
        }
        return Integer.valueOf(iMax);
    }

    public PointF a(Integer num) {
        Integer numB = b(num);
        if (numB == null) {
            return new PointF(900.0f, 675.0f);
        }
        return new PointF(numB.intValue(), numB.intValue() == 300 ? 225.0f : numB.intValue());
    }

    @NonNull
    public String c(@p0 PointF pointF) {
        StringBuilder sb2 = new StringBuilder(this.f180751m);
        if (!q0.c.projects.equals(this.f180739a) && pointF != null && pointF.x != 900.0f) {
            sb2.append("_");
            sb2.append((int) pointF.x);
        }
        sb2.append(".jpg");
        return sb2.toString();
    }

    @p0
    public String[] d() {
        String[] strArr;
        if (this.f180753o == null || (strArr = this.f180754p) == null || strArr.length == 0) {
            return null;
        }
        String str = com.planner5d.library.api.f.a().f142274l + "/s/" + this.f180753o + "_";
        int length = this.f180754p.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr2[i10] = str + this.f180754p[i10] + ".jpg";
        }
        return strArr2;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.planner5d.library.api.f.a().f142272j);
        sb2.append("/gallery/");
        sb2.append(q0.c.projects.equals(this.f180739a) ? "floorplans" : this.f180739a);
        sb2.append("/");
        sb2.append(this.f180742d);
        return sb2.toString();
    }

    public Bundle f() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f180746h) {
            if (xVar != null) {
                arrayList.add(Long.valueOf(xVar.f222847a));
            }
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        String[] strArr = this.f180754p;
        com.planner5d.library.services.utility.i iVarJ = new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.type, this.f180739a.name()).j(com.planner5d.library.services.r.id, this.f180740b).j(com.planner5d.library.services.r.hash, this.f180741c).j(com.planner5d.library.services.r.uri, this.f180742d).j(com.planner5d.library.services.r.title, this.f180743e).j(com.planner5d.library.services.r.userName, this.f180744f).j(com.planner5d.library.services.r.userImage, this.f180745g).g(com.planner5d.library.services.r.totalViews, this.f180747i).g(com.planner5d.library.services.r.totalLikes, this.f180748j).g(com.planner5d.library.services.r.totalComments, this.f180749k).q(com.planner5d.library.services.r.tags, jArr).j(com.planner5d.library.services.r.imageUri, this.f180751m).p(com.planner5d.library.services.r.imageSizes, this.f180752n).j(com.planner5d.library.services.r.shotsHash, this.f180753o);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.shotIds;
        if (strArr == null) {
            strArr = new String[0];
        }
        return iVarJ.r(rVar, strArr).g(com.planner5d.library.services.r.projectId, this.f180750l).a();
    }

    public h(@NonNull h hVar, long j10) {
        this.f180739a = hVar.f180739a;
        this.f180740b = hVar.f180740b;
        this.f180741c = hVar.f180741c;
        this.f180742d = hVar.f180742d;
        this.f180747i = hVar.f180747i;
        this.f180748j = j10;
        this.f180749k = hVar.f180749k;
        this.f180746h = hVar.f180746h;
        this.f180751m = hVar.f180751m;
        this.f180752n = hVar.f180752n;
        this.f180743e = hVar.f180743e;
        this.f180744f = hVar.f180744f;
        this.f180745g = hVar.f180745g;
        this.f180753o = hVar.f180753o;
        this.f180754p = hVar.f180754p;
        this.f180750l = hVar.f180750l;
    }
}
