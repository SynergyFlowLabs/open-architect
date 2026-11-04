package com.planner5d.library.model.payments;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.payments.paymentmethod.e;
import fd.f;
import java.util.Date;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Payment extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f222462a = new a(null);

    @Column(name = "auto_renewing")
    @Nullable
    private Boolean autoRenewing;

    @Column(name = "date_finished")
    @Nullable
    private Date dateFinished;

    @Column(name = "date_started")
    @Nullable
    private Date dateStarted;

    @Column(name = "error")
    @Nullable
    private String error;

    @Column(name = "expire_time")
    @Nullable
    private Long expireTimeMilliseconds;

    @Column(name = "method")
    private int method;

    @Column(name = FirebaseAnalytics.c.D)
    @Nullable
    private byte[] order;

    @Column(name = "price_currency")
    @Nullable
    private String priceCurrency;

    @Column(name = "price")
    @Nullable
    private Long priceMicros;

    @Column(name = "state")
    private int state = b.Unknown.n();

    @Column(name = "user_id")
    private long userId;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(int i10) {
            return i10 == e.a.Google.n() ? "Google Play Store" : com.facebook.internal.a.f99697t;
        }

        private a() {
        }
    }

    public enum b {
        Unknown(0),
        Started(10),
        StartedAndPending(15),
        Finished(20),
        Validated(30),
        Consumed(40),
        Failed(50);


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f222471j = c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f222472a;

        static {
            int i10 = 7 ^ 6;
        }

        b(int i10) {
            this.f222472a = i10;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f222471j;
        }

        public final int n() {
            return this.f222472a;
        }
    }

    @m1
    public Payment() {
    }

    @Nullable
    public final Long A() {
        return this.priceMicros;
    }

    public final int B() {
        return this.state;
    }

    public final long C() {
        return this.userId;
    }

    public final boolean D() {
        return this.priceMicros == null && this.priceCurrency == null;
    }

    public final boolean E() {
        return this.order != null;
    }

    public final boolean F() {
        return this.state == b.Validated.n();
    }

    public final boolean G() {
        Boolean bool = this.autoRenewing;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean H() {
        return this.state == b.Consumed.n();
    }

    public final boolean I() {
        return this.state == b.Finished.n() || this.state == b.Validated.n();
    }

    public final boolean J() {
        if (this.dateFinished == null) {
            return (this.state == b.Started.n() || this.state == b.StartedAndPending.n()) ? false : true;
        }
        return true;
    }

    public final boolean K() {
        return this.state == b.StartedAndPending.n();
    }

    public final boolean L() {
        return this.state == b.Started.n();
    }

    public final void M(boolean z10) {
        this.autoRenewing = Boolean.valueOf(z10);
    }

    public final void N(@Nullable Date date) {
        this.dateFinished = date;
    }

    public final void O(@Nullable Date date) {
        this.dateStarted = date;
    }

    public final void P(@Nullable String str) {
        this.error = str;
    }

    public final void Q(@Nullable Long l10) {
        this.expireTimeMilliseconds = l10;
    }

    public final void R(int i10) {
        this.method = i10;
    }

    public final void S(@NotNull e method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.method = method.getId().n();
    }

    public final void T(@Nullable com.planner5d.library.model.payments.a aVar) throws JSONException {
        byte[] bytes;
        JSONObject jSONObjectG;
        String string;
        if (aVar == null || (jSONObjectG = aVar.g()) == null || (string = jSONObjectG.toString()) == null) {
            bytes = null;
        } else {
            bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        }
        this.order = bytes;
    }

    public final void U(@Nullable f fVar) {
        if (fVar == null) {
            return;
        }
        this.priceMicros = Long.valueOf(fVar.i());
        this.priceCurrency = fVar.g();
    }

    public final void V(@Nullable Long l10) {
        this.priceMicros = l10;
    }

    public final void W(int i10) {
        this.state = i10;
    }

    public final void X(long j10) {
        this.userId = j10;
    }

    @NotNull
    public final com.planner5d.library.model.payments.a s() throws JSONException {
        byte[] bArr = this.order;
        if (bArr != null) {
            return com.planner5d.library.model.payments.a.f222473h.b(new JSONObject(new String(bArr, Charsets.UTF_8)));
        }
        throw new JSONException("Empty payment purchase");
    }

    @Nullable
    public final Date u() {
        return this.dateFinished;
    }

    @Nullable
    public final Date v() {
        return this.dateStarted;
    }

    @Nullable
    public final String w() {
        return this.error;
    }

    @Nullable
    public final Long x() {
        return this.expireTimeMilliseconds;
    }

    public final int y() {
        return this.method;
    }

    @Nullable
    public final String z() {
        return this.priceCurrency;
    }
}
