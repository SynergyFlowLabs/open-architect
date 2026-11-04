package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final String f89160h = "accountId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f89161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f89162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f89163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f89164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.r1 f89165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f89166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f89167g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f89168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f89169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f89170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f89171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f89172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.a f89173f;

        private a() {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f89173f = aVarA;
        }

        @NonNull
        public m a() {
            ArrayList arrayList = this.f89171d;
            boolean z10 = true;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f89170c;
            boolean z12 = (list == null || list.isEmpty()) ? false : true;
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            p2 p2Var = null;
            if (!z11) {
                this.f89170c.forEach(new Consumer() { // from class: com.android.billingclient.api.o2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((m.b) obj) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                });
            } else {
                if (this.f89171d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f89171d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f89171d.get(0);
                    String strQ = skuDetails.q();
                    ArrayList arrayList2 = this.f89171d;
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i10);
                        if (!strQ.equals("play_pass_subs") && !skuDetails2.q().equals("play_pass_subs") && !strQ.equals(skuDetails2.q())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strU = skuDetails.u();
                    ArrayList arrayList3 = this.f89171d;
                    int size2 = arrayList3.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i11);
                        if (!strQ.equals("play_pass_subs") && !skuDetails3.q().equals("play_pass_subs") && !strU.equals(skuDetails3.u())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            m mVar = new m(p2Var);
            if ((!z11 || ((SkuDetails) this.f89171d.get(0)).u().isEmpty()) && (!z12 || ((b) this.f89170c.get(0)).b().h().isEmpty())) {
                z10 = false;
            }
            mVar.f89161a = z10;
            mVar.f89162b = this.f89168a;
            mVar.f89163c = this.f89169b;
            mVar.f89164d = this.f89173f.a();
            ArrayList arrayList4 = this.f89171d;
            mVar.f89166f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            mVar.f89167g = this.f89172e;
            List list2 = this.f89170c;
            mVar.f89165e = list2 != null ? com.google.android.gms.internal.play_billing.r1.u(list2) : com.google.android.gms.internal.play_billing.r1.v();
            return mVar;
        }

        @NonNull
        public a b(boolean z10) {
            this.f89172e = z10;
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            this.f89168a = str;
            return this;
        }

        @NonNull
        public a d(@NonNull String str) {
            this.f89169b = str;
            return this;
        }

        @NonNull
        public a e(@NonNull List<b> list) {
            this.f89170c = new ArrayList(list);
            return this;
        }

        @NonNull
        @Deprecated
        public a f(@NonNull SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f89171d = arrayList;
            return this;
        }

        @NonNull
        public a g(@NonNull c cVar) {
            this.f89173f = c.c(cVar);
            return this;
        }

        /* synthetic */ a(p2 p2Var) {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f89173f = aVarA;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f89174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final String f89175b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private z f89176a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @androidx.annotation.p0
            private String f89177b;

            private a() {
                throw null;
            }

            @NonNull
            public b a() {
                com.google.android.gms.internal.play_billing.g0.c(this.f89176a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f89176a.f() != null) {
                    com.google.android.gms.internal.play_billing.g0.c(this.f89177b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            @NonNull
            public a b(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f89177b = str;
                return this;
            }

            @NonNull
            public a c(@NonNull z zVar) {
                this.f89176a = zVar;
                if (zVar.c() != null) {
                    zVar.c().getClass();
                    z.b bVarC = zVar.c();
                    if (bVarC.e() != null) {
                        this.f89177b = bVarC.e();
                    }
                }
                return this;
            }

            /* synthetic */ a(p2 p2Var) {
            }
        }

        /* synthetic */ b(a aVar, p2 p2Var) {
            this.f89174a = aVar.f89176a;
            this.f89175b = aVar.f89177b;
        }

        @NonNull
        public static a a() {
            return new a(null);
        }

        @NonNull
        public final z b() {
            return this.f89174a;
        }

        @androidx.annotation.p0
        public final String c() {
            return this.f89175b;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f89178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f89179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f89180c = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f89181a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f89182b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f89183c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f89184d = 0;

            private a() {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f89183c = true;
                return aVar;
            }

            @NonNull
            public c a() {
                boolean z10 = true;
                p2 p2Var = null;
                if (TextUtils.isEmpty(this.f89181a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f89182b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f89183c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(p2Var);
                cVar.f89178a = this.f89181a;
                cVar.f89180c = this.f89184d;
                cVar.f89179b = this.f89182b;
                return cVar;
            }

            @NonNull
            public a b(@NonNull String str) {
                this.f89181a = str;
                return this;
            }

            @NonNull
            @q3
            public a c(@NonNull String str) {
                this.f89182b = str;
                return this;
            }

            @NonNull
            public a d(int i10) {
                this.f89184d = i10;
                return this;
            }

            @NonNull
            @Deprecated
            public final a f(@NonNull String str) {
                this.f89181a = str;
                return this;
            }

            /* synthetic */ a(p2 p2Var) {
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface b {

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public static final int f89185u0 = 0;

            /* JADX INFO: renamed from: v0, reason: collision with root package name */
            public static final int f89186v0 = 1;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public static final int f89187w0 = 2;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public static final int f89188x0 = 3;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public static final int f89189y0 = 5;

            /* JADX INFO: renamed from: z0, reason: collision with root package name */
            public static final int f89190z0 = 6;
        }

        private c() {
        }

        @NonNull
        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a aVarA = a();
            aVarA.f(cVar.f89178a);
            aVarA.d(cVar.f89180c);
            aVarA.c(cVar.f89179b);
            return aVarA;
        }

        final int b() {
            return this.f89180c;
        }

        final String d() {
            return this.f89178a;
        }

        final String e() {
            return this.f89179b;
        }

        /* synthetic */ c(p2 p2Var) {
        }
    }

    private m() {
        throw null;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f89164d.b();
    }

    final n c() {
        if (this.f89165e.isEmpty()) {
            return t2.f89253l;
        }
        b bVar = (b) this.f89165e.get(0);
        for (int i10 = 1; i10 < this.f89165e.size(); i10++) {
            b bVar2 = (b) this.f89165e.get(i10);
            if (!bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                return t2.a(5, "All products should have same ProductType.");
            }
        }
        String strH = bVar.b().h();
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        com.google.android.gms.internal.play_billing.r1 r1Var = this.f89165e;
        int size = r1Var.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar3 = (b) r1Var.get(i11);
            bVar3.b().e().equals("subs");
            if (hashSet.contains(bVar3.b().d())) {
                return t2.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.b().d()));
            }
            hashSet.add(bVar3.b().d());
            if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !strH.equals(bVar3.b().h())) {
                return t2.a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet2) {
            if (hashSet.contains(str)) {
                return t2.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        z.b bVarC = bVar.b().c();
        return (bVarC == null || bVarC.d() == null) ? t2.f89253l : t2.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    @androidx.annotation.p0
    public final String d() {
        return this.f89162b;
    }

    @androidx.annotation.p0
    public final String e() {
        return this.f89163c;
    }

    @androidx.annotation.p0
    public final String f() {
        return this.f89164d.d();
    }

    @androidx.annotation.p0
    public final String g() {
        return this.f89164d.e();
    }

    @NonNull
    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f89166f);
        return arrayList;
    }

    @NonNull
    public final List i() {
        return this.f89165e;
    }

    public final boolean q() {
        return this.f89167g;
    }

    final boolean r() {
        return (this.f89162b == null && this.f89163c == null && this.f89164d.e() == null && this.f89164d.b() == 0 && !this.f89165e.stream().anyMatch(new Predicate() { // from class: com.android.billingclient.api.n2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return false;
            }
        }) && !this.f89161a && !this.f89167g) ? false : true;
    }

    /* synthetic */ m(p2 p2Var) {
    }
}
