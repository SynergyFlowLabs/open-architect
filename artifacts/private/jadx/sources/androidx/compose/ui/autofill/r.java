package androidx.compose.ui.autofill;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "Use the new semantics-based API and androidx.compose.ui.autofill.ContentType instead.")
public enum r {
    EmailAddress,
    Username,
    Password,
    NewUsername,
    NewPassword,
    PostalAddress,
    PostalCode,
    CreditCardNumber,
    CreditCardSecurityCode,
    CreditCardExpirationDate,
    CreditCardExpirationMonth,
    CreditCardExpirationYear,
    CreditCardExpirationDay,
    AddressCountry,
    AddressRegion,
    AddressLocality,
    AddressStreet,
    AddressAuxiliaryDetails,
    PostalCodeExtended,
    PersonFullName,
    PersonFirstName,
    PersonLastName,
    PersonMiddleName,
    PersonMiddleInitial,
    PersonNamePrefix,
    PersonNameSuffix,
    PhoneNumber,
    PhoneNumberDevice,
    PhoneCountryCode,
    PhoneNumberNational,
    Gender,
    BirthDateFull,
    BirthDateDay,
    BirthDateMonth,
    BirthDateYear,
    SmsOtpCode;


    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f37029r3 = kotlin.enums.c.c(k());

    @NotNull
    public static kotlin.enums.a<r> l() {
        return f37029r3;
    }
}
