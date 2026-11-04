package com.google.common.net;

/* JADX INFO: loaded from: classes5.dex */
@a
@com.google.common.annotations.b
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f119680a = "-_.*";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f119681b = "-._~!$'()*,;&=@:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.common.escape.h f119682c = new k("-_.*", true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.escape.h f119683d = new k("-._~!$'()*,;&=@:+", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.common.escape.h f119684e = new k("-._~!$'()*,;&=@:+/?", false);

    private l() {
    }

    public static com.google.common.escape.h a() {
        return f119682c;
    }

    public static com.google.common.escape.h b() {
        return f119684e;
    }

    public static com.google.common.escape.h c() {
        return f119683d;
    }
}
