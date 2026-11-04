package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.g({1})
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAttachmentAsString", id = 2, type = "java.lang.String")
    @androidx.annotation.p0
    private final Attachment f107127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequireResidentKey", id = 3)
    @androidx.annotation.p0
    private final Boolean f107128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequireUserVerificationAsString", id = 4, type = "java.lang.String")
    @androidx.annotation.p0
    private final zzay f107129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResidentKeyRequirementAsString", id = 5, type = "java.lang.String")
    @androidx.annotation.p0
    private final ResidentKeyRequirement f107130d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Attachment f107131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f107132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ResidentKeyRequirement f107133c;

        @NonNull
        public AuthenticatorSelectionCriteria a() {
            Attachment attachment = this.f107131a;
            String string = attachment == null ? null : attachment.toString();
            Boolean bool = this.f107132b;
            ResidentKeyRequirement residentKeyRequirement = this.f107133c;
            return new AuthenticatorSelectionCriteria(string, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        @NonNull
        public a b(@androidx.annotation.p0 Attachment attachment) {
            this.f107131a = attachment;
            return this;
        }

        @NonNull
        public a c(@androidx.annotation.p0 Boolean bool) {
            this.f107132b = bool;
            return this;
        }

        @NonNull
        public a d(@androidx.annotation.p0 ResidentKeyRequirement residentKeyRequirement) {
            this.f107133c = residentKeyRequirement;
            return this;
        }
    }

    @SafeParcelable.b
    AuthenticatorSelectionCriteria(@SafeParcelable.e(id = 2) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 3) @androidx.annotation.p0 Boolean bool, @SafeParcelable.e(id = 4) @androidx.annotation.p0 String str2, @SafeParcelable.e(id = 5) @androidx.annotation.p0 String str3) {
        Attachment attachmentB;
        ResidentKeyRequirement residentKeyRequirementB = null;
        if (str == null) {
            attachmentB = null;
        } else {
            try {
                attachmentB = Attachment.b(str);
            } catch (Attachment.a | ResidentKeyRequirement.a | b0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f107127a = attachmentB;
        this.f107128b = bool;
        this.f107129c = str2 == null ? null : zzay.b(str2);
        if (str3 != null) {
            residentKeyRequirementB = ResidentKeyRequirement.b(str3);
        }
        this.f107130d = residentKeyRequirementB;
    }

    @androidx.annotation.p0
    public Attachment O1() {
        return this.f107127a;
    }

    @androidx.annotation.p0
    public String T1() {
        Attachment attachment = this.f107127a;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    @androidx.annotation.p0
    public Boolean b2() {
        return this.f107128b;
    }

    @androidx.annotation.p0
    public ResidentKeyRequirement e2() {
        return this.f107130d;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return com.google.android.gms.common.internal.u.b(this.f107127a, authenticatorSelectionCriteria.f107127a) && com.google.android.gms.common.internal.u.b(this.f107128b, authenticatorSelectionCriteria.f107128b) && com.google.android.gms.common.internal.u.b(this.f107129c, authenticatorSelectionCriteria.f107129c) && com.google.android.gms.common.internal.u.b(this.f107130d, authenticatorSelectionCriteria.f107130d);
    }

    @androidx.annotation.p0
    public String f2() {
        ResidentKeyRequirement residentKeyRequirement = this.f107130d;
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f107127a, this.f107128b, this.f107129c, this.f107130d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, T1(), false);
        i6.b.j(parcel, 3, b2(), false);
        zzay zzayVar = this.f107129c;
        i6.b.Y(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        i6.b.Y(parcel, 5, f2(), false);
        i6.b.b(parcel, iA);
    }
}
