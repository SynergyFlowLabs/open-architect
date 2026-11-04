package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class Registration {

    @p0
    private UserAttributes attributes;
    private final Twig twig = LumberMill.getLogger();
    private String email = "";
    private String userId = "";
    private Validity validity = Validity.NOT_SET;

    private enum Validity {
        NOT_SET,
        INVALID,
        VALID
    }

    public static Registration create() {
        return new Registration();
    }

    private void updateState(boolean z10) {
        Validity validity = this.validity;
        if (validity != Validity.NOT_SET && validity != Validity.VALID) {
            return;
        }
        this.validity = z10 ? Validity.VALID : Validity.INVALID;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Registration registration = (Registration) obj;
            if (!this.email.equals(registration.email) || !this.userId.equals(registration.userId)) {
                return false;
            }
            UserAttributes userAttributes = this.attributes;
            if (userAttributes != null) {
                return userAttributes.equals(registration.attributes);
            }
            if (registration.attributes == null) {
                return true;
            }
        }
        return false;
    }

    @p0
    public UserAttributes getAttributes() {
        return this.attributes;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((this.email.hashCode() * 31) + this.userId.hashCode()) * 31;
        UserAttributes userAttributes = this.attributes;
        return iHashCode + (userAttributes != null ? userAttributes.hashCode() : 0);
    }

    boolean isValidRegistration() {
        return Validity.VALID.equals(this.validity);
    }

    public String toString() {
        return "Registration{email='" + this.email + "', userId='" + this.userId + "', attributes=" + this.attributes + AbstractJsonLexerKt.END_OBJ;
    }

    public Registration withEmail(@NonNull String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z10 = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.e("Email cannot be null or empty", new Object[0]);
        } else {
            this.email = str;
        }
        updateState(z10);
        return this;
    }

    public Registration withUserAttributes(@NonNull UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is null", new Object[0]);
            return this;
        }
        if (!userAttributes.isEmpty()) {
            this.attributes = userAttributes;
            return this;
        }
        this.validity = Validity.INVALID;
        this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is empty", new Object[0]);
        return this;
    }

    public Registration withUserId(@NonNull String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z10 = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.e("UserId cannot be null or empty", new Object[0]);
        } else {
            this.userId = str;
        }
        updateState(z10);
        return this;
    }
}
