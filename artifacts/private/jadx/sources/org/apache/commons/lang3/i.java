package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f337177b = 5947847346149275958L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f337178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f337179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f337180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f337181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f337182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final Map<String, i> f337183h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<g> f337184a = Collections.synchronizedSet(new HashSet());

    static {
        i iVar = new i(null);
        f337178c = iVar;
        i iVar2 = new i("a-zA-Z");
        f337179d = iVar2;
        i iVar3 = new i("a-z");
        f337180e = iVar3;
        i iVar4 = new i("A-Z");
        f337181f = iVar4;
        i iVar5 = new i("0-9");
        f337182g = iVar5;
        Map<String, i> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        f337183h = mapSynchronizedMap;
        mapSynchronizedMap.put(null, iVar);
        mapSynchronizedMap.put("", iVar);
        mapSynchronizedMap.put("a-zA-Z", iVar2);
        mapSynchronizedMap.put("A-Za-z", iVar2);
        mapSynchronizedMap.put("a-z", iVar3);
        mapSynchronizedMap.put("A-Z", iVar4);
        mapSynchronizedMap.put("0-9", iVar5);
    }

    protected i(String... strArr) {
        for (String str : strArr) {
            a(str);
        }
    }

    public static i d(String... strArr) {
        i iVar;
        if (strArr == null) {
            return null;
        }
        return (strArr.length != 1 || (iVar = f337183h.get(strArr[0])) == null) ? new i(strArr) : iVar;
    }

    protected void a(String str) {
        if (str == null) {
            return;
        }
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = length - i10;
            if (i11 >= 4 && str.charAt(i10) == '^' && str.charAt(i10 + 2) == '-') {
                this.f337184a.add(g.u(str.charAt(i10 + 1), str.charAt(i10 + 3)));
                i10 += 4;
            } else if (i11 >= 3 && str.charAt(i10 + 1) == '-') {
                this.f337184a.add(g.r(str.charAt(i10), str.charAt(i10 + 2)));
                i10 += 3;
            } else if (i11 < 2 || str.charAt(i10) != '^') {
                this.f337184a.add(g.p(str.charAt(i10)));
                i10++;
            } else {
                this.f337184a.add(g.t(str.charAt(i10 + 1)));
                i10 += 2;
            }
        }
    }

    public boolean b(char c10) {
        Iterator<g> it = this.f337184a.iterator();
        while (it.hasNext()) {
            if (it.next().k(c10)) {
                return true;
            }
        }
        return false;
    }

    g[] c() {
        Set<g> set = this.f337184a;
        return (g[]) set.toArray(new g[set.size()]);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f337184a.equals(((i) obj).f337184a);
        }
        return false;
    }

    public int hashCode() {
        return this.f337184a.hashCode() + 89;
    }

    public String toString() {
        return this.f337184a.toString();
    }
}
