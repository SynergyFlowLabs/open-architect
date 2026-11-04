package com.facebook;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public enum g {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f99615a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99616a;

        static {
            int[] iArr = new int[g.valuesCustom().length];
            iArr[g.INSTAGRAM_APPLICATION_WEB.ordinal()] = 1;
            iArr[g.INSTAGRAM_CUSTOM_CHROME_TAB.ordinal()] = 2;
            iArr[g.INSTAGRAM_WEB_VIEW.ordinal()] = 3;
            f99616a = iArr;
        }
    }

    g(boolean z10) {
        this.f99615a = z10;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        g[] gVarArrValuesCustom = values();
        return (g[]) Arrays.copyOf(gVarArrValuesCustom, gVarArrValuesCustom.length);
    }

    public final boolean l() {
        return this.f99615a;
    }

    public final boolean n() {
        int i10 = a.f99616a[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
