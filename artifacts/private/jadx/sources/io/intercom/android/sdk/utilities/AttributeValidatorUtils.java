package io.intercom.android.sdk.utilities;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class AttributeValidatorUtils {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])", 2);
    private static final Pattern VALID_WEBSITE_REGEX = Pattern.compile("^(https?://)?(www\\.)?([\\w]+\\.)+[\u200c\u200b\\w]{2,63}/?$");
    private static final Pattern VALID_NUMBER_REGEX = Pattern.compile("^[-+]?\\d+$");
    private static final Pattern VALID_FLOAT_REGEX = Pattern.compile("^[-+]?\\d*\\.?\\d*$");

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeResponseCode {
        public static final int INVALID_COUNTRY_CODE = 6;
        public static final int INVALID_EMAIL = 2;
        public static final int INVALID_NUMBER = 3;
        public static final int INVALID_NUMBER_HAS_TOO_MANY_DIGITS = 5;
        public static final int INVALID_NUMBER_NEEDS_PREFIX = 4;
        public static final int INVALID_NUMBER_NOT_ENOUGH_DIGITS = 7;
        public static final int INVALID_STRING = 1;
        public static final int OK = 0;
    }

    public static int validateAttribute(String str, String str2) {
        str2.getClass();
        switch (str2) {
            case "number":
                return VALID_NUMBER_REGEX.matcher(str).matches() ? 0 : 3;
            case "company.website":
                return !VALID_WEBSITE_REGEX.matcher(str).matches() ? 1 : 0;
            case "email":
                return VALID_EMAIL_ADDRESS_REGEX.matcher(str).matches() ? 0 : 2;
            case "float":
                return VALID_FLOAT_REGEX.matcher(str).matches() ? 0 : 3;
            case "phone":
                return PhoneNumberValidator.validatePhoneNumber(str);
            case "integer":
                try {
                    Integer.parseInt(str);
                    return 0;
                } catch (NumberFormatException unused) {
                    return 3;
                }
            default:
                return 0;
        }
    }
}
