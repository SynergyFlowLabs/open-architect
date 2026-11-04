package com.android.billingclient.api;

/* JADX INFO: loaded from: classes3.dex */
final class t2 {
    static final n A;
    static final n B;
    static final n C;
    static final n D;
    static final n E;
    static final n F;
    static final n G;
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final n f89242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final n f89243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final n f89244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final n f89245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final n f89246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final n f89247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final n f89248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final n f89249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final n f89250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final n f89251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final n f89252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final n f89253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final n f89254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final n f89255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final n f89256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final n f89257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final n f89258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final n f89259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final n f89260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final n f89261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final n f89262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final n f89263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final n f89264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final n f89265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final n f89266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final n f89267z;

    static {
        n.a aVarC = n.c();
        aVarC.c(3);
        aVarC.b("Google Play In-app Billing API version is less than 3");
        f89242a = aVarC.a();
        n.a aVarC2 = n.c();
        aVarC2.c(3);
        aVarC2.b("Google Play In-app Billing API version is less than 9");
        f89243b = aVarC2.a();
        n.a aVarC3 = n.c();
        aVarC3.c(3);
        aVarC3.b("Billing service unavailable on device.");
        f89244c = aVarC3.a();
        n.a aVarC4 = n.c();
        aVarC4.c(2);
        aVarC4.b("Billing service unavailable on device.");
        f89245d = aVarC4.a();
        n.a aVarC5 = n.c();
        aVarC5.c(5);
        aVarC5.b("Client is already in the process of connecting to billing service.");
        f89246e = aVarC5.a();
        n.a aVarC6 = n.c();
        aVarC6.c(5);
        aVarC6.b("The list of SKUs can't be empty.");
        f89247f = aVarC6.a();
        n.a aVarC7 = n.c();
        aVarC7.c(5);
        aVarC7.b("SKU type can't be empty.");
        f89248g = aVarC7.a();
        n.a aVarC8 = n.c();
        aVarC8.c(5);
        aVarC8.b("Product type can't be empty.");
        f89249h = aVarC8.a();
        n.a aVarC9 = n.c();
        aVarC9.c(-2);
        aVarC9.b("Client does not support extra params.");
        f89250i = aVarC9.a();
        n.a aVarC10 = n.c();
        aVarC10.c(5);
        aVarC10.b("Invalid purchase token.");
        f89251j = aVarC10.a();
        n.a aVarC11 = n.c();
        aVarC11.c(6);
        aVarC11.b("An internal error occurred.");
        f89252k = aVarC11.a();
        n.a aVarC12 = n.c();
        aVarC12.c(5);
        aVarC12.b("SKU can't be null.");
        aVarC12.a();
        n.a aVarC13 = n.c();
        aVarC13.c(0);
        f89253l = aVarC13.a();
        n.a aVarC14 = n.c();
        aVarC14.c(-1);
        aVarC14.b("Service connection is disconnected.");
        f89254m = aVarC14.a();
        n.a aVarC15 = n.c();
        aVarC15.c(2);
        aVarC15.b("Timeout communicating with service.");
        f89255n = aVarC15.a();
        n.a aVarC16 = n.c();
        aVarC16.c(-2);
        aVarC16.b("Client does not support subscriptions.");
        f89256o = aVarC16.a();
        n.a aVarC17 = n.c();
        aVarC17.c(-2);
        aVarC17.b("Client does not support subscriptions update.");
        f89257p = aVarC17.a();
        n.a aVarC18 = n.c();
        aVarC18.c(-2);
        aVarC18.b("Client does not support get purchase history.");
        f89258q = aVarC18.a();
        n.a aVarC19 = n.c();
        aVarC19.c(-2);
        aVarC19.b("Client does not support price change confirmation.");
        f89259r = aVarC19.a();
        n.a aVarC20 = n.c();
        aVarC20.c(-2);
        aVarC20.b("Play Store version installed does not support cross selling products.");
        f89260s = aVarC20.a();
        n.a aVarC21 = n.c();
        aVarC21.c(-2);
        aVarC21.b("Client does not support multi-item purchases.");
        f89261t = aVarC21.a();
        n.a aVarC22 = n.c();
        aVarC22.c(-2);
        aVarC22.b("Client does not support offer_id_token.");
        f89262u = aVarC22.a();
        n.a aVarC23 = n.c();
        aVarC23.c(-2);
        aVarC23.b("Client does not support ProductDetails.");
        f89263v = aVarC23.a();
        n.a aVarC24 = n.c();
        aVarC24.c(-2);
        aVarC24.b("Client does not support in-app messages.");
        f89264w = aVarC24.a();
        n.a aVarC25 = n.c();
        aVarC25.c(-2);
        aVarC25.b("Client does not support user choice billing.");
        aVarC25.a();
        n.a aVarC26 = n.c();
        aVarC26.c(-2);
        aVarC26.b("Play Store version installed does not support external offer.");
        f89265x = aVarC26.a();
        n.a aVarC27 = n.c();
        aVarC27.c(-2);
        aVarC27.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f89266y = aVarC27.a();
        n.a aVarC28 = n.c();
        aVarC28.c(5);
        aVarC28.b("Unknown feature");
        f89267z = aVarC28.a();
        n.a aVarC29 = n.c();
        aVarC29.c(-2);
        aVarC29.b("Play Store version installed does not support get billing config.");
        A = aVarC29.a();
        n.a aVarC30 = n.c();
        aVarC30.c(-2);
        aVarC30.b("Query product details with serialized docid is not supported.");
        B = aVarC30.a();
        n.a aVarC31 = n.c();
        aVarC31.c(4);
        aVarC31.b("Item is unavailable for purchase.");
        C = aVarC31.a();
        n.a aVarC32 = n.c();
        aVarC32.c(-2);
        aVarC32.b("Query product details with developer specified account is not supported.");
        D = aVarC32.a();
        n.a aVarC33 = n.c();
        aVarC33.c(-2);
        aVarC33.b("Play Store version installed does not support alternative billing only.");
        E = aVarC33.a();
        n.a aVarC34 = n.c();
        aVarC34.c(5);
        aVarC34.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        F = aVarC34.a();
        n.a aVarC35 = n.c();
        aVarC35.c(6);
        aVarC35.b("An error occurred while retrieving billing override.");
        G = aVarC35.a();
    }

    static n a(int i10, String str) {
        n.a aVarC = n.c();
        aVarC.c(i10);
        aVarC.b(str);
        return aVarC.a();
    }
}
