package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f338151a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f338152b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f338153c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f338154d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f338155e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f338156f = -3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f338157g = 'F';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f338158h = 'T';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f338159i = '*';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char f338160j = '0';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char f338161k = '1';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char f338162l = '2';

    public static char a(int i10) {
        if (i10 == -3) {
            return '*';
        }
        if (i10 == -2) {
            return f338158h;
        }
        if (i10 == -1) {
            return f338157g;
        }
        if (i10 == 0) {
            return f338160j;
        }
        if (i10 == 1) {
            return f338161k;
        }
        if (i10 == 2) {
            return f338162l;
        }
        throw new IllegalArgumentException("Unknown dimension value: " + i10);
    }

    public static int b(char c10) {
        char upperCase = Character.toUpperCase(c10);
        if (upperCase == '*') {
            return -3;
        }
        if (upperCase == 'F') {
            return -1;
        }
        if (upperCase == 'T') {
            return -2;
        }
        switch (upperCase) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            default:
                throw new IllegalArgumentException("Unknown dimension symbol: " + c10);
        }
    }
}
