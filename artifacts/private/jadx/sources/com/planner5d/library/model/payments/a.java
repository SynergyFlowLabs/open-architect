package com.planner5d.library.model.payments;

import android.text.TextUtils;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k1;
import fd.i;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureSpi;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final C1633a f222473h = new C1633a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f222474i = "?";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f
    @Nullable
    public final String f222475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f
    @Nullable
    public final String f222476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f222477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f222478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f222479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f222480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f222481g;

    /* JADX INFO: renamed from: com.planner5d.library.model.payments.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nOrder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Order.kt\ncom/planner5d/library/model/payments/Order$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
    public static final class C1633a {
        public /* synthetic */ C1633a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean c(String str, String str2, String str3) {
            if (str2 != null && !TextUtils.isEmpty(str2) && str3 != null && !TextUtils.isEmpty(str3) && str != null && !TextUtils.isEmpty(str)) {
                try {
                    Signature signature = Signature.getInstance("SHA1withRSA");
                    signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(com.google.android.vending.licensing.util.a.b(str3.getBytes()))));
                    signature.update(str2.getBytes());
                    Method declaredMethod = SignatureSpi.class.getDeclaredMethod("engineVerify", byte[].class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(signature, com.google.android.vending.licensing.util.a.a(str));
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                    return ((Boolean) objInvoke).booleanValue();
                } catch (Exception e10) {
                    b.f381052a.e(e10);
                }
            }
            return false;
        }

        @Nullable
        public final a a(@NotNull String signature, @NotNull String data, @Nullable String str) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(data, "data");
            if (c(signature, data, str)) {
                return new a(signature, data, null, null);
            }
            return null;
        }

        @NotNull
        public final a b(@NotNull JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            return new a(k1.y(json, r.signature, null, 4, null), json.getString(r.data.f224891a), json.getString(r.sku.f224891a), k1.y(json, r.orderId, null, 4, null));
        }

        private C1633a() {
        }
    }

    public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        String string;
        String string2;
        this.f222475a = str;
        this.f222476b = str2;
        if (str3 == null) {
            try {
                str3 = new JSONObject(str2).getString(r.productId.f224891a);
            } catch (JSONException unused) {
            }
        }
        this.f222477c = str3;
        boolean z10 = false;
        try {
            JSONObject jSONObject = new JSONObject(this.f222476b);
            r rVar = r.purchaseState;
            if (jSONObject.has(rVar.f224891a) && jSONObject.getInt(rVar.f224891a) != 0) {
                z10 = true;
            }
        } catch (JSONException unused2) {
        }
        this.f222478d = z10;
        try {
            string = new JSONObject(this.f222476b).getString(r.orderId.f224891a);
        } catch (JSONException unused3) {
            string = str4 == null ? f222474i : str4;
        }
        this.f222479e = string;
        this.f222480f = (str4 == null || str4.length() == 0) ? f222474i : str4;
        try {
            string2 = new JSONObject(this.f222476b).getString(r.purchaseToken.f224891a);
        } catch (JSONException unused4) {
            string2 = null;
        }
        this.f222481g = string2;
    }

    @Nullable
    public final String a() {
        return this.f222479e;
    }

    @NotNull
    public final String b() {
        return this.f222480f;
    }

    @Nullable
    public final String c() {
        return this.f222481g;
    }

    @NotNull
    public final i d(long j10) throws u.a {
        return u.e(j10, this.f222477c);
    }

    @Nullable
    public final String e() {
        return this.f222477c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(this.f222481g, aVar.f222481g)) {
                return true;
            }
            if (Intrinsics.areEqual(this.f222475a, aVar.f222475a) && Intrinsics.areEqual(this.f222476b, aVar.f222476b) && Intrinsics.areEqual(this.f222477c, aVar.f222477c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f222478d;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r.signature.f224891a, this.f222475a);
        jSONObject.put(r.data.f224891a, this.f222476b);
        jSONObject.put(r.sku.f224891a, this.f222477c);
        jSONObject.put(r.orderId.f224891a, this.f222479e);
        return jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull a order, @Nullable String str) {
        this(order.f222475a, order.f222476b, order.f222477c, str);
        Intrinsics.checkNotNullParameter(order, "order");
    }
}
