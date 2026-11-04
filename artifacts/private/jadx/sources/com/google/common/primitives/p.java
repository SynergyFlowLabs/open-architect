package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f119768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f119769b;

    private p(String rawValue, int radix) {
        this.f119768a = rawValue;
        this.f119769b = radix;
    }

    static p a(String stringValue) {
        if (stringValue.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = stringValue.charAt(0);
        int i10 = 16;
        if (stringValue.startsWith("0x") || stringValue.startsWith("0X")) {
            stringValue = stringValue.substring(2);
        } else if (cCharAt == '#') {
            stringValue = stringValue.substring(1);
        } else if (cCharAt != '0' || stringValue.length() <= 1) {
            i10 = 10;
        } else {
            stringValue = stringValue.substring(1);
            i10 = 8;
        }
        return new p(stringValue, i10);
    }
}
