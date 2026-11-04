package org.slf4j.helpers;

/* JADX INFO: loaded from: classes14.dex */
public class q {
    public static String a() {
        Package r10 = q.class.getPackage();
        if (r10 == null) {
            return null;
        }
        return r10.getImplementationVersion();
    }
}
