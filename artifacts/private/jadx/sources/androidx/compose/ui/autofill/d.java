package androidx.compose.ui.autofill;

import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final HashMap<r, String> f36975a = MapsKt.hashMapOf(TuplesKt.to(r.EmailAddress, p.a.f340561a), TuplesKt.to(r.Username, "username"), TuplesKt.to(r.Password, "password"), TuplesKt.to(r.NewUsername, p.a.E), TuplesKt.to(r.NewPassword, p.a.F), TuplesKt.to(r.PostalAddress, p.a.f340566f), TuplesKt.to(r.PostalCode, p.a.f340567g), TuplesKt.to(r.CreditCardNumber, p.a.f340568h), TuplesKt.to(r.CreditCardSecurityCode, p.a.f340569i), TuplesKt.to(r.CreditCardExpirationDate, p.a.f340570j), TuplesKt.to(r.CreditCardExpirationMonth, p.a.f340571k), TuplesKt.to(r.CreditCardExpirationYear, p.a.f340572l), TuplesKt.to(r.CreditCardExpirationDay, p.a.f340573m), TuplesKt.to(r.AddressCountry, p.a.f340574n), TuplesKt.to(r.AddressRegion, p.a.f340575o), TuplesKt.to(r.AddressLocality, p.a.f340576p), TuplesKt.to(r.AddressStreet, p.a.f340577q), TuplesKt.to(r.AddressAuxiliaryDetails, p.a.f340578r), TuplesKt.to(r.PostalCodeExtended, p.a.f340579s), TuplesKt.to(r.PersonFullName, p.a.f340580t), TuplesKt.to(r.PersonFirstName, p.a.f340581u), TuplesKt.to(r.PersonLastName, p.a.f340582v), TuplesKt.to(r.PersonMiddleName, p.a.f340583w), TuplesKt.to(r.PersonMiddleInitial, p.a.f340584x), TuplesKt.to(r.PersonNamePrefix, p.a.f340585y), TuplesKt.to(r.PersonNameSuffix, p.a.f340586z), TuplesKt.to(r.PhoneNumber, p.a.A), TuplesKt.to(r.PhoneNumberDevice, p.a.B), TuplesKt.to(r.PhoneCountryCode, p.a.C), TuplesKt.to(r.PhoneNumberNational, p.a.D), TuplesKt.to(r.Gender, p.a.G), TuplesKt.to(r.BirthDateFull, p.a.H), TuplesKt.to(r.BirthDateDay, p.a.I), TuplesKt.to(r.BirthDateMonth, p.a.J), TuplesKt.to(r.BirthDateYear, p.a.K), TuplesKt.to(r.SmsOtpCode, p.a.L));

    private static /* synthetic */ void a() {
    }

    @NotNull
    public static final String b(@NotNull r rVar) {
        String str = f36975a.get(rVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }

    public static /* synthetic */ void c(r rVar) {
    }
}
