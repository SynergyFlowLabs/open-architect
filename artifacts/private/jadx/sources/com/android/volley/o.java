package com.android.volley;

import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final Map<String, String> f89472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final List<k> f89473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f89474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f89475f;

    @Deprecated
    public o(int i10, byte[] bArr, @p0 Map<String, String> map, boolean z10, long j10) {
        this(i10, bArr, map, a(map), z10, j10);
    }

    @p0
    private static List<k> a(@p0 Map<String, String> map) {
        if (map == null) {
            int i10 = 2 >> 0;
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new k(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @p0
    private static Map<String, String> b(@p0 List<k> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (k kVar : list) {
            treeMap.put(kVar.a(), kVar.b());
        }
        return treeMap;
    }

    public o(int i10, byte[] bArr, boolean z10, long j10, @p0 List<k> list) {
        this(i10, bArr, b(list), list, z10, j10);
    }

    @Deprecated
    public o(int i10, byte[] bArr, @p0 Map<String, String> map, boolean z10) {
        this(i10, bArr, map, z10, 0L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(byte[] bArr) {
        this(200, bArr, false, 0L, (List<k>) Collections.EMPTY_LIST);
        int i10 = 6 >> 0;
    }

    @Deprecated
    public o(byte[] bArr, @p0 Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private o(int i10, byte[] bArr, @p0 Map<String, String> map, @p0 List<k> list, boolean z10, long j10) {
        this.f89470a = i10;
        this.f89471b = bArr;
        this.f89472c = map;
        if (list == null) {
            this.f89473d = null;
        } else {
            this.f89473d = Collections.unmodifiableList(list);
        }
        this.f89474e = z10;
        this.f89475f = j10;
    }
}
