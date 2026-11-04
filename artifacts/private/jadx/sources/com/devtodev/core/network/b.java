package com.devtodev.core.network;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static String a(TreeMap<String, Object> treeMap, byte[] bArr, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        if (bArr != null) {
            sb2.append(new String(bArr));
        }
        sb2.append(str);
        return com.devtodev.core.utils.k.b.a(sb2.toString());
    }
}
