package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final String f107438e = "typ";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final String f107439f = "challenge";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final String f107440g = "origin";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final String f107441h = "cid_pubkey";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public static final String f107442i = "navigator.id.finishEnrollment";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final String f107443j = "navigator.id.getAssertion";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f107444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f107446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ChannelIdValue f107447d;

    /* JADX INFO: renamed from: com.google.android.gms.fido.u2f.api.common.a$a, reason: collision with other inner class name */
    public static class C0974a implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f107448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f107449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f107450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ChannelIdValue f107451d;

        C0974a(String str, String str2, String str3, ChannelIdValue channelIdValue) {
            this.f107448a = str;
            this.f107449b = str2;
            this.f107450c = str3;
            this.f107451d = channelIdValue;
        }

        @NonNull
        public static C0974a c() {
            return new C0974a();
        }

        @NonNull
        public a a() {
            return new a(this.f107448a, this.f107449b, this.f107450c, this.f107451d);
        }

        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0974a clone() {
            return new C0974a(this.f107448a, this.f107449b, this.f107450c, this.f107451d);
        }

        @NonNull
        public C0974a d(@NonNull String str) {
            this.f107449b = str;
            return this;
        }

        @NonNull
        public C0974a e(@NonNull ChannelIdValue channelIdValue) {
            this.f107451d = channelIdValue;
            return this;
        }

        @NonNull
        public C0974a f(@NonNull String str) {
            this.f107450c = str;
            return this;
        }

        @NonNull
        public C0974a g(@NonNull String str) {
            this.f107448a = str;
            return this;
        }

        C0974a() {
            this.f107451d = ChannelIdValue.f107355d;
        }
    }

    a(String str, String str2, String str3, ChannelIdValue channelIdValue) {
        this.f107444a = (String) w.r(str);
        this.f107445b = (String) w.r(str2);
        this.f107446c = (String) w.r(str3);
        this.f107447d = (ChannelIdValue) w.r(channelIdValue);
    }

    @NonNull
    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f107438e, this.f107444a);
            jSONObject.put(f107439f, this.f107445b);
            jSONObject.put("origin", this.f107446c);
            ChannelIdValue.ChannelIdValueType channelIdValueType = ChannelIdValue.ChannelIdValueType.ABSENT;
            int iOrdinal = this.f107447d.e2().ordinal();
            if (iOrdinal == 1) {
                jSONObject.put(f107441h, this.f107447d.b2());
            } else if (iOrdinal == 2) {
                jSONObject.put(f107441h, this.f107447d.O1());
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f107444a.equals(aVar.f107444a) && this.f107445b.equals(aVar.f107445b) && this.f107446c.equals(aVar.f107446c) && this.f107447d.equals(aVar.f107447d);
    }

    public int hashCode() {
        return ((((((this.f107444a.hashCode() + 31) * 31) + this.f107445b.hashCode()) * 31) + this.f107446c.hashCode()) * 31) + this.f107447d.hashCode();
    }
}
