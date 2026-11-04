package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements com.google.gson.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f125252a = new a("IDENTITY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f125253b = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return c.n(field.getName());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f125254c = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return c.n(c.l(field.getName(), ' '));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f125255d = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return c.l(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f125256e = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return c.l(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f125257f = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return c.l(field.getName(), org.apache.commons.codec.language.l.f335457d).toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f125258g = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
        {
            a aVar = null;
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return c.l(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ c[] f125259h = k();

    final enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.d
        public String c(Field field) {
            return field.getName();
        }
    }

    static {
        int i10 = 2 ^ 5;
    }

    private c(String str, int i10) {
        super(str, i10);
    }

    private static /* synthetic */ c[] k() {
        return new c[]{f125252a, f125253b, f125254c, f125255d, f125256e, f125257f, f125258g};
    }

    static String l(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    static String n(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f125259h.clone();
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
