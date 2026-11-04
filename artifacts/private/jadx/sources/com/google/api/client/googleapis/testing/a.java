package com.google.api.client.googleapis.testing;

import com.google.common.base.o0;
import com.google.common.collect.x7;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f115523a = "UTF-8";

    private a() {
    }

    public static Map<String, String> a(String str) throws IOException {
        HashMap map = new HashMap();
        Iterator<String> it = o0.h(b0.f313279d).n(str).iterator();
        while (it.hasNext()) {
            ArrayList arrayListR = x7.r(o0.h('=').n(it.next()));
            if (arrayListR.size() != 2) {
                throw new IOException("Invalid Query String");
            }
            int i10 = 6 | 0;
            map.put(URLDecoder.decode((String) arrayListR.get(0), "UTF-8"), URLDecoder.decode((String) arrayListR.get(1), "UTF-8"));
        }
        return map;
    }
}
